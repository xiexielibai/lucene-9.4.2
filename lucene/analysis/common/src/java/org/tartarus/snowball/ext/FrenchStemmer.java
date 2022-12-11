// Generated by Snowball 2.0.0 - https://snowballstem.org/

package org.tartarus.snowball.ext;

import org.tartarus.snowball.Among;

/**
 * This class implements the stemming algorithm defined by a snowball script.
 *
 * <p>Generated by Snowball 2.0.0 - https://snowballstem.org/
 */
@SuppressWarnings("unused")
public class FrenchStemmer extends org.tartarus.snowball.SnowballStemmer {

  private static final long serialVersionUID = 1L;
  private static final java.lang.invoke.MethodHandles.Lookup methodObject =
      java.lang.invoke.MethodHandles.lookup();

  private static final Among a_0[] = {
    new Among("col", -1, -1), new Among("par", -1, -1), new Among("tap", -1, -1)
  };

  private static final Among a_1[] = {
    new Among("", -1, 7),
    new Among("H", 0, 6),
    new Among("He", 1, 4),
    new Among("Hi", 1, 5),
    new Among("I", 0, 1),
    new Among("U", 0, 2),
    new Among("Y", 0, 3)
  };

  private static final Among a_2[] = {
    new Among("iqU", -1, 3),
    new Among("abl", -1, 3),
    new Among("I\u00E8r", -1, 4),
    new Among("i\u00E8r", -1, 4),
    new Among("eus", -1, 2),
    new Among("iv", -1, 1)
  };

  private static final Among a_3[] = {
    new Among("ic", -1, 2), new Among("abil", -1, 1), new Among("iv", -1, 3)
  };

  private static final Among a_4[] = {
    new Among("iqUe", -1, 1),
    new Among("atrice", -1, 2),
    new Among("ance", -1, 1),
    new Among("ence", -1, 5),
    new Among("logie", -1, 3),
    new Among("able", -1, 1),
    new Among("isme", -1, 1),
    new Among("euse", -1, 11),
    new Among("iste", -1, 1),
    new Among("ive", -1, 8),
    new Among("if", -1, 8),
    new Among("usion", -1, 4),
    new Among("ation", -1, 2),
    new Among("ution", -1, 4),
    new Among("ateur", -1, 2),
    new Among("iqUes", -1, 1),
    new Among("atrices", -1, 2),
    new Among("ances", -1, 1),
    new Among("ences", -1, 5),
    new Among("logies", -1, 3),
    new Among("ables", -1, 1),
    new Among("ismes", -1, 1),
    new Among("euses", -1, 11),
    new Among("istes", -1, 1),
    new Among("ives", -1, 8),
    new Among("ifs", -1, 8),
    new Among("usions", -1, 4),
    new Among("ations", -1, 2),
    new Among("utions", -1, 4),
    new Among("ateurs", -1, 2),
    new Among("ments", -1, 15),
    new Among("ements", 30, 6),
    new Among("issements", 31, 12),
    new Among("it\u00E9s", -1, 7),
    new Among("ment", -1, 15),
    new Among("ement", 34, 6),
    new Among("issement", 35, 12),
    new Among("amment", 34, 13),
    new Among("emment", 34, 14),
    new Among("aux", -1, 10),
    new Among("eaux", 39, 9),
    new Among("eux", -1, 1),
    new Among("it\u00E9", -1, 7)
  };

  private static final Among a_5[] = {
    new Among("ira", -1, 1),
    new Among("ie", -1, 1),
    new Among("isse", -1, 1),
    new Among("issante", -1, 1),
    new Among("i", -1, 1),
    new Among("irai", 4, 1),
    new Among("ir", -1, 1),
    new Among("iras", -1, 1),
    new Among("ies", -1, 1),
    new Among("\u00EEmes", -1, 1),
    new Among("isses", -1, 1),
    new Among("issantes", -1, 1),
    new Among("\u00EEtes", -1, 1),
    new Among("is", -1, 1),
    new Among("irais", 13, 1),
    new Among("issais", 13, 1),
    new Among("irions", -1, 1),
    new Among("issions", -1, 1),
    new Among("irons", -1, 1),
    new Among("issons", -1, 1),
    new Among("issants", -1, 1),
    new Among("it", -1, 1),
    new Among("irait", 21, 1),
    new Among("issait", 21, 1),
    new Among("issant", -1, 1),
    new Among("iraIent", -1, 1),
    new Among("issaIent", -1, 1),
    new Among("irent", -1, 1),
    new Among("issent", -1, 1),
    new Among("iront", -1, 1),
    new Among("\u00EEt", -1, 1),
    new Among("iriez", -1, 1),
    new Among("issiez", -1, 1),
    new Among("irez", -1, 1),
    new Among("issez", -1, 1)
  };

  private static final Among a_6[] = {
    new Among("a", -1, 3),
    new Among("era", 0, 2),
    new Among("asse", -1, 3),
    new Among("ante", -1, 3),
    new Among("\u00E9e", -1, 2),
    new Among("ai", -1, 3),
    new Among("erai", 5, 2),
    new Among("er", -1, 2),
    new Among("as", -1, 3),
    new Among("eras", 8, 2),
    new Among("\u00E2mes", -1, 3),
    new Among("asses", -1, 3),
    new Among("antes", -1, 3),
    new Among("\u00E2tes", -1, 3),
    new Among("\u00E9es", -1, 2),
    new Among("ais", -1, 3),
    new Among("erais", 15, 2),
    new Among("ions", -1, 1),
    new Among("erions", 17, 2),
    new Among("assions", 17, 3),
    new Among("erons", -1, 2),
    new Among("ants", -1, 3),
    new Among("\u00E9s", -1, 2),
    new Among("ait", -1, 3),
    new Among("erait", 23, 2),
    new Among("ant", -1, 3),
    new Among("aIent", -1, 3),
    new Among("eraIent", 26, 2),
    new Among("\u00E8rent", -1, 2),
    new Among("assent", -1, 3),
    new Among("eront", -1, 2),
    new Among("\u00E2t", -1, 3),
    new Among("ez", -1, 2),
    new Among("iez", 32, 2),
    new Among("eriez", 33, 2),
    new Among("assiez", 33, 3),
    new Among("erez", 32, 2),
    new Among("\u00E9", -1, 2)
  };

  private static final Among a_7[] = {
    new Among("e", -1, 3),
    new Among("I\u00E8re", 0, 2),
    new Among("i\u00E8re", 0, 2),
    new Among("ion", -1, 1),
    new Among("Ier", -1, 2),
    new Among("ier", -1, 2)
  };

  private static final Among a_8[] = {
    new Among("ell", -1, -1),
    new Among("eill", -1, -1),
    new Among("enn", -1, -1),
    new Among("onn", -1, -1),
    new Among("ett", -1, -1)
  };

  private static final char g_v[] = {
    17, 65, 16, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 128, 130, 103, 8, 5
  };

  private static final char g_keep_with_s[] = {
    1, 65, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 128
  };

  private int I_p2;
  private int I_p1;
  private int I_pV;

  private boolean r_prelude() {
    while (true) {
      int v_1 = cursor;
      lab0:
      {
        golab1:
        while (true) {
          int v_2 = cursor;
          lab2:
          {
            lab3:
            {
              int v_3 = cursor;
              lab4:
              {
                if (!(in_grouping(g_v, 97, 251))) {
                  break lab4;
                }
                bra = cursor;
                lab5:
                {
                  int v_4 = cursor;
                  lab6:
                  {
                    if (!(eq_s("u"))) {
                      break lab6;
                    }
                    ket = cursor;
                    if (!(in_grouping(g_v, 97, 251))) {
                      break lab6;
                    }
                    slice_from("U");
                    break lab5;
                  }
                  cursor = v_4;
                  lab7:
                  {
                    if (!(eq_s("i"))) {
                      break lab7;
                    }
                    ket = cursor;
                    if (!(in_grouping(g_v, 97, 251))) {
                      break lab7;
                    }
                    slice_from("I");
                    break lab5;
                  }
                  cursor = v_4;
                  if (!(eq_s("y"))) {
                    break lab4;
                  }
                  ket = cursor;
                  slice_from("Y");
                }
                break lab3;
              }
              cursor = v_3;
              lab8:
              {
                bra = cursor;
                if (!(eq_s("\u00EB"))) {
                  break lab8;
                }
                ket = cursor;
                slice_from("He");
                break lab3;
              }
              cursor = v_3;
              lab9:
              {
                bra = cursor;
                if (!(eq_s("\u00EF"))) {
                  break lab9;
                }
                ket = cursor;
                slice_from("Hi");
                break lab3;
              }
              cursor = v_3;
              lab10:
              {
                bra = cursor;
                if (!(eq_s("y"))) {
                  break lab10;
                }
                ket = cursor;
                if (!(in_grouping(g_v, 97, 251))) {
                  break lab10;
                }
                slice_from("Y");
                break lab3;
              }
              cursor = v_3;
              if (!(eq_s("q"))) {
                break lab2;
              }
              bra = cursor;
              if (!(eq_s("u"))) {
                break lab2;
              }
              ket = cursor;
              slice_from("U");
            }
            cursor = v_2;
            break golab1;
          }
          cursor = v_2;
          if (cursor >= limit) {
            break lab0;
          }
          cursor++;
        }
        continue;
      }
      cursor = v_1;
      break;
    }
    return true;
  }

  private boolean r_mark_regions() {
    I_pV = limit;
    I_p1 = limit;
    I_p2 = limit;
    int v_1 = cursor;
    lab0:
    {
      lab1:
      {
        int v_2 = cursor;
        lab2:
        {
          if (!(in_grouping(g_v, 97, 251))) {
            break lab2;
          }
          if (!(in_grouping(g_v, 97, 251))) {
            break lab2;
          }
          if (cursor >= limit) {
            break lab2;
          }
          cursor++;
          break lab1;
        }
        cursor = v_2;
        lab3:
        {
          if (find_among(a_0) == 0) {
            break lab3;
          }
          break lab1;
        }
        cursor = v_2;
        if (cursor >= limit) {
          break lab0;
        }
        cursor++;
        golab4:
        while (true) {
          lab5:
          {
            if (!(in_grouping(g_v, 97, 251))) {
              break lab5;
            }
            break golab4;
          }
          if (cursor >= limit) {
            break lab0;
          }
          cursor++;
        }
      }
      I_pV = cursor;
    }
    cursor = v_1;
    int v_4 = cursor;
    lab6:
    {
      golab7:
      while (true) {
        lab8:
        {
          if (!(in_grouping(g_v, 97, 251))) {
            break lab8;
          }
          break golab7;
        }
        if (cursor >= limit) {
          break lab6;
        }
        cursor++;
      }
      golab9:
      while (true) {
        lab10:
        {
          if (!(out_grouping(g_v, 97, 251))) {
            break lab10;
          }
          break golab9;
        }
        if (cursor >= limit) {
          break lab6;
        }
        cursor++;
      }
      I_p1 = cursor;
      golab11:
      while (true) {
        lab12:
        {
          if (!(in_grouping(g_v, 97, 251))) {
            break lab12;
          }
          break golab11;
        }
        if (cursor >= limit) {
          break lab6;
        }
        cursor++;
      }
      golab13:
      while (true) {
        lab14:
        {
          if (!(out_grouping(g_v, 97, 251))) {
            break lab14;
          }
          break golab13;
        }
        if (cursor >= limit) {
          break lab6;
        }
        cursor++;
      }
      I_p2 = cursor;
    }
    cursor = v_4;
    return true;
  }

  private boolean r_postlude() {
    int among_var;
    while (true) {
      int v_1 = cursor;
      lab0:
      {
        bra = cursor;
        among_var = find_among(a_1);
        if (among_var == 0) {
          break lab0;
        }
        ket = cursor;
        switch (among_var) {
          case 1:
            slice_from("i");
            break;
          case 2:
            slice_from("u");
            break;
          case 3:
            slice_from("y");
            break;
          case 4:
            slice_from("\u00EB");
            break;
          case 5:
            slice_from("\u00EF");
            break;
          case 6:
            slice_del();
            break;
          case 7:
            if (cursor >= limit) {
              break lab0;
            }
            cursor++;
            break;
        }
        continue;
      }
      cursor = v_1;
      break;
    }
    return true;
  }

  private boolean r_RV() {
    if (!(I_pV <= cursor)) {
      return false;
    }
    return true;
  }

  private boolean r_R1() {
    if (!(I_p1 <= cursor)) {
      return false;
    }
    return true;
  }

  private boolean r_R2() {
    if (!(I_p2 <= cursor)) {
      return false;
    }
    return true;
  }

  private boolean r_standard_suffix() {
    int among_var;
    ket = cursor;
    among_var = find_among_b(a_4);
    if (among_var == 0) {
      return false;
    }
    bra = cursor;
    switch (among_var) {
      case 1:
        if (!r_R2()) {
          return false;
        }
        slice_del();
        break;
      case 2:
        if (!r_R2()) {
          return false;
        }
        slice_del();
        int v_1 = limit - cursor;
        lab0:
        {
          ket = cursor;
          if (!(eq_s_b("ic"))) {
            cursor = limit - v_1;
            break lab0;
          }
          bra = cursor;
          lab1:
          {
            int v_2 = limit - cursor;
            lab2:
            {
              if (!r_R2()) {
                break lab2;
              }
              slice_del();
              break lab1;
            }
            cursor = limit - v_2;
            slice_from("iqU");
          }
        }
        break;
      case 3:
        if (!r_R2()) {
          return false;
        }
        slice_from("log");
        break;
      case 4:
        if (!r_R2()) {
          return false;
        }
        slice_from("u");
        break;
      case 5:
        if (!r_R2()) {
          return false;
        }
        slice_from("ent");
        break;
      case 6:
        if (!r_RV()) {
          return false;
        }
        slice_del();
        int v_3 = limit - cursor;
        lab3:
        {
          ket = cursor;
          among_var = find_among_b(a_2);
          if (among_var == 0) {
            cursor = limit - v_3;
            break lab3;
          }
          bra = cursor;
          switch (among_var) {
            case 1:
              if (!r_R2()) {
                cursor = limit - v_3;
                break lab3;
              }
              slice_del();
              ket = cursor;
              if (!(eq_s_b("at"))) {
                cursor = limit - v_3;
                break lab3;
              }
              bra = cursor;
              if (!r_R2()) {
                cursor = limit - v_3;
                break lab3;
              }
              slice_del();
              break;
            case 2:
              lab4:
              {
                int v_4 = limit - cursor;
                lab5:
                {
                  if (!r_R2()) {
                    break lab5;
                  }
                  slice_del();
                  break lab4;
                }
                cursor = limit - v_4;
                if (!r_R1()) {
                  cursor = limit - v_3;
                  break lab3;
                }
                slice_from("eux");
              }
              break;
            case 3:
              if (!r_R2()) {
                cursor = limit - v_3;
                break lab3;
              }
              slice_del();
              break;
            case 4:
              if (!r_RV()) {
                cursor = limit - v_3;
                break lab3;
              }
              slice_from("i");
              break;
          }
        }
        break;
      case 7:
        if (!r_R2()) {
          return false;
        }
        slice_del();
        int v_5 = limit - cursor;
        lab6:
        {
          ket = cursor;
          among_var = find_among_b(a_3);
          if (among_var == 0) {
            cursor = limit - v_5;
            break lab6;
          }
          bra = cursor;
          switch (among_var) {
            case 1:
              lab7:
              {
                int v_6 = limit - cursor;
                lab8:
                {
                  if (!r_R2()) {
                    break lab8;
                  }
                  slice_del();
                  break lab7;
                }
                cursor = limit - v_6;
                slice_from("abl");
              }
              break;
            case 2:
              lab9:
              {
                int v_7 = limit - cursor;
                lab10:
                {
                  if (!r_R2()) {
                    break lab10;
                  }
                  slice_del();
                  break lab9;
                }
                cursor = limit - v_7;
                slice_from("iqU");
              }
              break;
            case 3:
              if (!r_R2()) {
                cursor = limit - v_5;
                break lab6;
              }
              slice_del();
              break;
          }
        }
        break;
      case 8:
        if (!r_R2()) {
          return false;
        }
        slice_del();
        int v_8 = limit - cursor;
        lab11:
        {
          ket = cursor;
          if (!(eq_s_b("at"))) {
            cursor = limit - v_8;
            break lab11;
          }
          bra = cursor;
          if (!r_R2()) {
            cursor = limit - v_8;
            break lab11;
          }
          slice_del();
          ket = cursor;
          if (!(eq_s_b("ic"))) {
            cursor = limit - v_8;
            break lab11;
          }
          bra = cursor;
          lab12:
          {
            int v_9 = limit - cursor;
            lab13:
            {
              if (!r_R2()) {
                break lab13;
              }
              slice_del();
              break lab12;
            }
            cursor = limit - v_9;
            slice_from("iqU");
          }
        }
        break;
      case 9:
        slice_from("eau");
        break;
      case 10:
        if (!r_R1()) {
          return false;
        }
        slice_from("al");
        break;
      case 11:
        lab14:
        {
          int v_10 = limit - cursor;
          lab15:
          {
            if (!r_R2()) {
              break lab15;
            }
            slice_del();
            break lab14;
          }
          cursor = limit - v_10;
          if (!r_R1()) {
            return false;
          }
          slice_from("eux");
        }
        break;
      case 12:
        if (!r_R1()) {
          return false;
        }
        if (!(out_grouping_b(g_v, 97, 251))) {
          return false;
        }
        slice_del();
        break;
      case 13:
        if (!r_RV()) {
          return false;
        }
        slice_from("ant");
        return false;
      case 14:
        if (!r_RV()) {
          return false;
        }
        slice_from("ent");
        return false;
      case 15:
        int v_11 = limit - cursor;
        if (!(in_grouping_b(g_v, 97, 251))) {
          return false;
        }
        if (!r_RV()) {
          return false;
        }
        cursor = limit - v_11;
        slice_del();
        return false;
    }
    return true;
  }

  private boolean r_i_verb_suffix() {
    if (cursor < I_pV) {
      return false;
    }
    int v_2 = limit_backward;
    limit_backward = I_pV;
    ket = cursor;
    if (find_among_b(a_5) == 0) {
      limit_backward = v_2;
      return false;
    }
    bra = cursor;
    {
      int v_3 = limit - cursor;
      lab0:
      {
        if (!(eq_s_b("H"))) {
          break lab0;
        }
        limit_backward = v_2;
        return false;
      }
      cursor = limit - v_3;
    }
    if (!(out_grouping_b(g_v, 97, 251))) {
      limit_backward = v_2;
      return false;
    }
    slice_del();
    limit_backward = v_2;
    return true;
  }

  private boolean r_verb_suffix() {
    int among_var;
    if (cursor < I_pV) {
      return false;
    }
    int v_2 = limit_backward;
    limit_backward = I_pV;
    ket = cursor;
    among_var = find_among_b(a_6);
    if (among_var == 0) {
      limit_backward = v_2;
      return false;
    }
    bra = cursor;
    switch (among_var) {
      case 1:
        if (!r_R2()) {
          limit_backward = v_2;
          return false;
        }
        slice_del();
        break;
      case 2:
        slice_del();
        break;
      case 3:
        slice_del();
        int v_3 = limit - cursor;
        lab0:
        {
          ket = cursor;
          if (!(eq_s_b("e"))) {
            cursor = limit - v_3;
            break lab0;
          }
          bra = cursor;
          slice_del();
        }
        break;
    }
    limit_backward = v_2;
    return true;
  }

  private boolean r_residual_suffix() {
    int among_var;
    int v_1 = limit - cursor;
    lab0:
    {
      ket = cursor;
      if (!(eq_s_b("s"))) {
        cursor = limit - v_1;
        break lab0;
      }
      bra = cursor;
      int v_2 = limit - cursor;
      lab1:
      {
        int v_3 = limit - cursor;
        lab2:
        {
          if (!(eq_s_b("Hi"))) {
            break lab2;
          }
          break lab1;
        }
        cursor = limit - v_3;
        if (!(out_grouping_b(g_keep_with_s, 97, 232))) {
          cursor = limit - v_1;
          break lab0;
        }
      }
      cursor = limit - v_2;
      slice_del();
    }
    if (cursor < I_pV) {
      return false;
    }
    int v_5 = limit_backward;
    limit_backward = I_pV;
    ket = cursor;
    among_var = find_among_b(a_7);
    if (among_var == 0) {
      limit_backward = v_5;
      return false;
    }
    bra = cursor;
    switch (among_var) {
      case 1:
        if (!r_R2()) {
          limit_backward = v_5;
          return false;
        }
        lab3:
        {
          int v_6 = limit - cursor;
          lab4:
          {
            if (!(eq_s_b("s"))) {
              break lab4;
            }
            break lab3;
          }
          cursor = limit - v_6;
          if (!(eq_s_b("t"))) {
            limit_backward = v_5;
            return false;
          }
        }
        slice_del();
        break;
      case 2:
        slice_from("i");
        break;
      case 3:
        slice_del();
        break;
    }
    limit_backward = v_5;
    return true;
  }

  private boolean r_un_double() {
    int v_1 = limit - cursor;
    if (find_among_b(a_8) == 0) {
      return false;
    }
    cursor = limit - v_1;
    ket = cursor;
    if (cursor <= limit_backward) {
      return false;
    }
    cursor--;
    bra = cursor;
    slice_del();
    return true;
  }

  private boolean r_un_accent() {
    {
      int v_1 = 1;
      while (true) {
        lab0:
        {
          if (!(out_grouping_b(g_v, 97, 251))) {
            break lab0;
          }
          v_1--;
          continue;
        }
        break;
      }
      if (v_1 > 0) {
        return false;
      }
    }
    ket = cursor;
    lab1:
    {
      int v_3 = limit - cursor;
      lab2:
      {
        if (!(eq_s_b("\u00E9"))) {
          break lab2;
        }
        break lab1;
      }
      cursor = limit - v_3;
      if (!(eq_s_b("\u00E8"))) {
        return false;
      }
    }
    bra = cursor;
    slice_from("e");
    return true;
  }

  @Override
  public boolean stem() {
    int v_1 = cursor;
    r_prelude();
    cursor = v_1;
    r_mark_regions();
    limit_backward = cursor;
    cursor = limit;
    int v_3 = limit - cursor;
    lab0:
    {
      lab1:
      {
        int v_4 = limit - cursor;
        lab2:
        {
          int v_5 = limit - cursor;
          lab3:
          {
            int v_6 = limit - cursor;
            lab4:
            {
              if (!r_standard_suffix()) {
                break lab4;
              }
              break lab3;
            }
            cursor = limit - v_6;
            lab5:
            {
              if (!r_i_verb_suffix()) {
                break lab5;
              }
              break lab3;
            }
            cursor = limit - v_6;
            if (!r_verb_suffix()) {
              break lab2;
            }
          }
          cursor = limit - v_5;
          int v_7 = limit - cursor;
          lab6:
          {
            ket = cursor;
            lab7:
            {
              int v_8 = limit - cursor;
              lab8:
              {
                if (!(eq_s_b("Y"))) {
                  break lab8;
                }
                bra = cursor;
                slice_from("i");
                break lab7;
              }
              cursor = limit - v_8;
              if (!(eq_s_b("\u00E7"))) {
                cursor = limit - v_7;
                break lab6;
              }
              bra = cursor;
              slice_from("c");
            }
          }
          break lab1;
        }
        cursor = limit - v_4;
        if (!r_residual_suffix()) {
          break lab0;
        }
      }
    }
    cursor = limit - v_3;
    int v_9 = limit - cursor;
    r_un_double();
    cursor = limit - v_9;
    int v_10 = limit - cursor;
    r_un_accent();
    cursor = limit - v_10;
    cursor = limit_backward;
    int v_11 = cursor;
    r_postlude();
    cursor = v_11;
    return true;
  }

  @Override
  public boolean equals(Object o) {
    return o instanceof FrenchStemmer;
  }

  @Override
  public int hashCode() {
    return FrenchStemmer.class.getName().hashCode();
  }
}
