/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.lucene.search.join;

import java.io.IOException;
import java.util.Arrays;
import org.apache.lucene.index.SortedDocValues;
import org.apache.lucene.index.SortedSetDocValues;
import org.apache.lucene.search.Scorable;
import org.apache.lucene.util.ArrayUtil;
import org.apache.lucene.util.BytesRef;
import org.apache.lucene.util.BytesRefHash;

abstract class TermsWithScoreCollector<DV> extends DocValuesTermsCollector<DV>
    implements GenericTermsCollector {

  private static final int INITIAL_ARRAY_SIZE = 0;

  final BytesRefHash collectedTerms = new BytesRefHash();
  final ScoreMode scoreMode;

  Scorable scorer;
  float[] scoreSums = new float[INITIAL_ARRAY_SIZE];

  TermsWithScoreCollector(Function<DV> docValuesCall, ScoreMode scoreMode) {
    super(docValuesCall);
    this.scoreMode = scoreMode;
    if (scoreMode == ScoreMode.Min) {
      Arrays.fill(scoreSums, Float.POSITIVE_INFINITY);
    } else if (scoreMode == ScoreMode.Max) {
      Arrays.fill(scoreSums, Float.NEGATIVE_INFINITY);
    }
  }

  @Override
  public BytesRefHash getCollectedTerms() {
    return collectedTerms;
  }

  @Override
  public float[] getScoresPerTerm() {
    return scoreSums;
  }

  @Override
  public void setScorer(Scorable scorer) throws IOException {
    this.scorer = scorer;
  }

  /**
   * Chooses the right {@link TermsWithScoreCollector} implementation.
   *
   * @param field The field to collect terms for
   * @param multipleValuesPerDocument Whether the field to collect terms for has multiple values per
   *     document.
   * @return a {@link TermsWithScoreCollector} instance
   */
  static TermsWithScoreCollector<?> create(
      String field, boolean multipleValuesPerDocument, ScoreMode scoreMode) {
    if (multipleValuesPerDocument) {
      switch (scoreMode) {
        case Avg:
          return new MV.Avg(sortedSetDocValues(field));
        case Max:
        case Min:
        case None:
        case Total:
        default:
          return new MV(sortedSetDocValues(field), scoreMode);
      }
    } else {
      switch (scoreMode) {
        case Avg:
          return new SV.Avg(sortedDocValues(field));
        case Max:
        case Min:
        case None:
        case Total:
        default:
          return new SV(sortedDocValues(field), scoreMode);
      }
    }
  }

  // impl that works with single value per document
  static class SV extends TermsWithScoreCollector<SortedDocValues> {

    SV(Function<SortedDocValues> docValuesCall, ScoreMode scoreMode) {
      super(docValuesCall, scoreMode);
    }

    @Override
    public void collect(int doc) throws IOException {
      BytesRef value;
      if (docValues.advanceExact(doc)) {
        value = docValues.lookupOrd(docValues.ordValue());
      } else {
        value = new BytesRef(BytesRef.EMPTY_BYTES);
      }
      int ord = collectedTerms.add(value);
      if (ord < 0) {
        ord = -ord - 1;
      } else {
        if (ord >= scoreSums.length) {
          int begin = scoreSums.length;
          scoreSums = ArrayUtil.grow(scoreSums);
          if (scoreMode == ScoreMode.Min) {
            Arrays.fill(scoreSums, begin, scoreSums.length, Float.POSITIVE_INFINITY);
          } else if (scoreMode == ScoreMode.Max) {
            Arrays.fill(scoreSums, begin, scoreSums.length, Float.NEGATIVE_INFINITY);
          }
        }
      }

      float current = scorer.score();
      float existing = scoreSums[ord];
      if (Float.compare(existing, 0.0f) == 0) {
        scoreSums[ord] = current;
      } else {
        switch (scoreMode) {
          case Total:
            scoreSums[ord] = scoreSums[ord] + current;
            break;
          case Min:
            if (current < existing) {
              scoreSums[ord] = current;
            }
            break;
          case Max:
            if (current > existing) {
              scoreSums[ord] = current;
            }
            break;
          case None:
          case Avg:
          default:
            throw new AssertionError("unexpected: " + scoreMode);
        }
      }
    }

    static class Avg extends SV {

      int[] scoreCounts = new int[INITIAL_ARRAY_SIZE];

      Avg(Function<SortedDocValues> docValuesCall) {
        super(docValuesCall, ScoreMode.Avg);
      }

      @Override
      public void collect(int doc) throws IOException {
        BytesRef value;
        if (docValues.advanceExact(doc)) {
          value = docValues.lookupOrd(docValues.ordValue());
        } else {
          value = new BytesRef(BytesRef.EMPTY_BYTES);
        }
        int ord = collectedTerms.add(value);
        if (ord < 0) {
          ord = -ord - 1;
        } else {
          if (ord >= scoreSums.length) {
            scoreSums = ArrayUtil.grow(scoreSums);
            scoreCounts = ArrayUtil.grow(scoreCounts);
          }
        }

        float current = scorer.score();
        float existing = scoreSums[ord];
        if (Float.compare(existing, 0.0f) == 0) {
          scoreSums[ord] = current;
          scoreCounts[ord] = 1;
        } else {
          scoreSums[ord] = scoreSums[ord] + current;
          scoreCounts[ord]++;
        }
      }

      @Override
      public float[] getScoresPerTerm() {
        if (scoreCounts != null) {
          for (int i = 0; i < scoreCounts.length; i++) {
            scoreSums[i] = scoreSums[i] / scoreCounts[i];
          }
          scoreCounts = null;
        }
        return scoreSums;
      }
    }
  }

  // impl that works with multiple values per document
  static class MV extends TermsWithScoreCollector<SortedSetDocValues> {

    MV(Function<SortedSetDocValues> docValuesCall, ScoreMode scoreMode) {
      super(docValuesCall, scoreMode);
    }

    @Override
    public void collect(int doc) throws IOException {
      if (docValues.advanceExact(doc)) {
        for (int i = 0; i < docValues.docValueCount(); i++) {
          int termID = collectedTerms.add(docValues.lookupOrd(docValues.nextOrd()));
          if (termID < 0) {
            termID = -termID - 1;
          } else {
            if (termID >= scoreSums.length) {
              int begin = scoreSums.length;
              scoreSums = ArrayUtil.grow(scoreSums);
              if (scoreMode == ScoreMode.Min) {
                Arrays.fill(scoreSums, begin, scoreSums.length, Float.POSITIVE_INFINITY);
              } else if (scoreMode == ScoreMode.Max) {
                Arrays.fill(scoreSums, begin, scoreSums.length, Float.NEGATIVE_INFINITY);
              }
            }
          }

          switch (scoreMode) {
            case Total:
              scoreSums[termID] += scorer.score();
              break;
            case Min:
              scoreSums[termID] = Math.min(scoreSums[termID], scorer.score());
              break;
            case Max:
              scoreSums[termID] = Math.max(scoreSums[termID], scorer.score());
              break;
            case Avg:
            case None:
            default:
              throw new AssertionError("unexpected: " + scoreMode);
          }
        }
      }
    }

    static class Avg extends MV {

      int[] scoreCounts = new int[INITIAL_ARRAY_SIZE];

      Avg(Function<SortedSetDocValues> docValuesCall) {
        super(docValuesCall, ScoreMode.Avg);
      }

      @Override
      public void collect(int doc) throws IOException {
        if (docValues.advanceExact(doc)) {
          for (int i = 0; i < docValues.docValueCount(); i++) {
            int termID = collectedTerms.add(docValues.lookupOrd(docValues.nextOrd()));
            if (termID < 0) {
              termID = -termID - 1;
            } else {
              if (termID >= scoreSums.length) {
                scoreSums = ArrayUtil.grow(scoreSums);
                scoreCounts = ArrayUtil.grow(scoreCounts);
              }
            }

            scoreSums[termID] += scorer.score();
            scoreCounts[termID]++;
          }
        }
      }

      @Override
      public float[] getScoresPerTerm() {
        if (scoreCounts != null) {
          for (int i = 0; i < scoreCounts.length; i++) {
            scoreSums[i] = scoreSums[i] / scoreCounts[i];
          }
          scoreCounts = null;
        }
        return scoreSums;
      }
    }
  }

  @Override
  public org.apache.lucene.search.ScoreMode scoreMode() {
    return org.apache.lucene.search.ScoreMode.COMPLETE;
  }
}
