/* The following code was generated by JFlex 1.7.0-SNAPSHOT tweaked for IntelliJ platform */

package com.ackdevelopment.plugins.scheme.lang.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.TokenType;
import com.ackdevelopment.plugins.scheme.lang.lexer.SchemeTokenTypes;
import com.ackdevelopment.plugins.scheme.lang.parser.SchemeTokens;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0-SNAPSHOT
 * from the specification file <tt>_SchemeLexer.flex</tt>
 */
class _SchemeLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [9, 6, 6]
   * Total runtime size is 1568 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[ZZ_CMAP_Z[ch>>12]|((ch>>6)&0x3f)]<<6)|(ch&0x3f)];
  }

  /* The ZZ_CMAP_Z table has 272 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\1\100\1\200\u010d\100");

  /* The ZZ_CMAP_Y table has 192 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\1\2\175\3\1\4\77\3");

  /* The ZZ_CMAP_A table has 320 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\36\1\40\1\43\1\44\1\40\22\0\1\36\1\35\1\51\1\10\3\53\1\3\1\1\1\2\1"+
    "\53\1\52\1\5\1\20\1\7\1\54\12\55\1\53\1\37\4\53\1\6\32\53\1\0\1\42\1\0\2\53"+
    "\1\4\1\24\1\11\1\30\1\16\1\12\1\17\1\13\1\53\1\14\1\53\1\45\1\26\1\34\1\15"+
    "\1\33\1\46\1\31\1\27\1\21\1\23\1\32\1\50\1\47\1\25\1\22\1\53\1\0\1\41\1\0"+
    "\1\53\6\0\1\43\242\0\2\43\26\0");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\10\7\1\12\1\13\2\1\1\14\1\15"+
    "\2\0\1\14\2\0\1\16\2\0\2\7\1\14\4\7"+
    "\1\17\1\7\1\0\2\14\4\7\1\0\1\7\3\0"+
    "\1\20\1\0\1\14\3\0\1\14\5\0\15\21\3\7"+
    "\1\14\1\7\2\14\7\7\2\14\2\0\5\7\1\0"+
    "\1\14\2\0\1\14\1\0\1\14\15\0\1\7\1\14"+
    "\3\7\1\0\2\7\1\0\2\7\1\14\1\7\3\14"+
    "\1\0\1\14\1\22\4\7\2\14\7\0\1\14\1\13"+
    "\10\0\2\14\1\7\2\14\1\7\1\0\1\23\2\0"+
    "\1\7\3\0\4\7\1\14\3\7\1\24\1\14\7\0"+
    "\1\7\1\14\1\7\1\0\1\25\2\7\1\26\1\14"+
    "\5\0\5\7\1\0\3\7\1\0\4\7\1\27\5\7"+
    "\1\30\1\31";

  private static int [] zzUnpackAction() {
    int [] result = new int[230];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\56\0\56\0\56\0\56\0\56\0\134\0\212"+
    "\0\270\0\346\0\u0114\0\u0142\0\u0170\0\u019e\0\u01cc\0\u01fa"+
    "\0\u0228\0\u0256\0\u0284\0\u02b2\0\u02e0\0\u030e\0\u033c\0\56"+
    "\0\u036a\0\u0398\0\u03c6\0\u03f4\0\u0422\0\56\0\u0450\0\u047e"+
    "\0\u04ac\0\u04da\0\u0508\0\u0536\0\u0564\0\u0592\0\u05c0\0\212"+
    "\0\u05ee\0\u061c\0\u064a\0\56\0\u0678\0\u06a6\0\u06d4\0\u0702"+
    "\0\u02e0\0\56\0\u0730\0\u030e\0\u075e\0\56\0\u078c\0\u07ba"+
    "\0\u07e8\0\u0816\0\u0844\0\u0872\0\u08a0\0\u08ce\0\u01cc\0\u08fc"+
    "\0\u092a\0\56\0\u0958\0\u0986\0\u09b4\0\u09e2\0\u0a10\0\u0a3e"+
    "\0\u0a6c\0\u0a9a\0\u0ac8\0\u0af6\0\u0b24\0\u0b52\0\u0b80\0\u0bae"+
    "\0\u0bdc\0\u0c0a\0\u0c38\0\u0c66\0\u0c94\0\u0cc2\0\u0cf0\0\u0d1e"+
    "\0\u0d4c\0\u0d7a\0\u0da8\0\u0dd6\0\u0e04\0\u0e32\0\u0e60\0\u0e8e"+
    "\0\u0ebc\0\u0eea\0\u0f18\0\u0f46\0\u02e0\0\u0f74\0\u0fa2\0\u0fd0"+
    "\0\u0ffe\0\u102c\0\u105a\0\u1088\0\u10b6\0\u10e4\0\u1112\0\u1140"+
    "\0\u116e\0\u119c\0\u11ca\0\u11f8\0\u1226\0\u1254\0\u1282\0\u12b0"+
    "\0\u0a3e\0\u12de\0\u130c\0\u133a\0\u1368\0\u1396\0\u13c4\0\u13f2"+
    "\0\u1420\0\u144e\0\u147c\0\u14aa\0\u14d8\0\u1506\0\u1534\0\u1562"+
    "\0\u1590\0\u15be\0\u15ec\0\212\0\u161a\0\u1648\0\u1676\0\u16a4"+
    "\0\u16d2\0\u1700\0\u172e\0\u175c\0\u178a\0\u17b8\0\u17e6\0\u1814"+
    "\0\u1842\0\u1870\0\56\0\u189e\0\u18cc\0\u18fa\0\u1928\0\u1956"+
    "\0\u1984\0\u19b2\0\u19e0\0\u1a0e\0\u1a3c\0\u1a6a\0\u172e\0\u175c"+
    "\0\u1a98\0\u1ac6\0\212\0\u1af4\0\u1b22\0\u1b50\0\u1b7e\0\u1bac"+
    "\0\u1bda\0\u1c08\0\u1c36\0\u1c64\0\u1c92\0\u1cc0\0\u1cee\0\u1d1c"+
    "\0\u1d4a\0\212\0\u1d78\0\u1da6\0\u1dd4\0\u1e02\0\u1e30\0\u1e5e"+
    "\0\u1e8c\0\u1eba\0\u1ee8\0\u1f16\0\u1f44\0\u1f72\0\u1fa0\0\u1fce"+
    "\0\u1ffc\0\212\0\u202a\0\u2058\0\u0a10\0\u2086\0\u20b4\0\u20e2"+
    "\0\u2110\0\u213e\0\u216c\0\u219a\0\u21c8\0\u21f6\0\u2224\0\u2252"+
    "\0\u2280\0\u22ae\0\u22dc\0\u230a\0\u2338\0\u2366\0\212\0\u2394"+
    "\0\u23c2\0\u23f0\0\u241e\0\u244c\0\212\0\212";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[230];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\10\1\15\1\10\1\16\1\14"+
    "\1\17\1\20\2\10\1\14\1\10\1\21\1\10\1\14"+
    "\1\22\4\10\1\23\1\24\1\23\1\25\2\2\1\23"+
    "\4\10\1\26\1\17\2\10\1\27\64\0\1\30\55\0"+
    "\2\10\1\31\25\10\7\0\4\10\1\0\4\10\7\0"+
    "\1\32\1\0\2\33\3\0\2\33\4\0\1\33\3\0"+
    "\1\33\24\0\1\33\10\0\1\10\1\34\1\35\1\0"+
    "\1\35\2\0\1\36\3\0\1\36\1\0\1\34\5\0"+
    "\1\34\5\0\1\37\1\40\21\0\1\41\1\42\1\43"+
    "\1\14\1\44\3\10\2\14\1\45\1\46\2\10\1\14"+
    "\1\10\1\46\1\10\1\14\5\10\7\0\4\10\1\0"+
    "\1\45\1\10\1\47\1\14\6\0\1\41\1\42\1\43"+
    "\2\14\3\10\2\14\1\45\1\46\2\10\1\14\1\10"+
    "\1\46\1\10\1\14\5\10\7\0\4\10\1\0\1\45"+
    "\1\10\1\47\1\14\6\0\2\10\1\31\6\10\1\50"+
    "\16\10\7\0\4\10\1\0\4\10\6\0\1\41\1\42"+
    "\1\43\1\14\1\51\3\10\2\14\1\45\1\46\2\10"+
    "\1\14\1\10\1\46\1\10\1\14\5\10\7\0\4\10"+
    "\1\0\1\45\1\10\1\47\1\14\7\0\1\52\1\0"+
    "\2\53\1\0\1\54\1\0\2\53\4\0\1\53\3\0"+
    "\1\53\24\0\1\53\6\0\2\10\1\31\1\10\1\55"+
    "\23\10\7\0\4\10\1\0\4\10\6\0\2\10\1\31"+
    "\1\10\1\56\11\10\1\57\11\10\7\0\4\10\1\0"+
    "\4\10\6\0\2\10\1\31\21\10\1\60\3\10\7\0"+
    "\4\10\1\0\4\10\36\0\1\23\1\0\1\23\3\0"+
    "\1\23\11\0\40\24\1\0\15\24\41\61\1\62\1\63"+
    "\13\61\42\64\1\65\6\64\1\66\4\64\6\0\1\67"+
    "\1\33\1\70\2\27\3\0\2\27\1\71\1\72\2\0"+
    "\1\27\1\0\1\72\1\0\1\27\21\0\1\71\1\0"+
    "\1\73\1\27\10\0\1\10\54\0\1\62\54\0\1\67"+
    "\1\0\1\74\2\33\3\0\2\33\1\71\1\72\2\0"+
    "\1\33\1\0\1\72\1\0\1\33\21\0\1\71\2\0"+
    "\1\33\7\0\1\75\1\76\2\27\3\0\2\27\1\77"+
    "\3\0\1\27\3\0\1\27\21\0\1\77\2\0\1\27"+
    "\7\0\1\75\1\100\2\27\3\0\2\27\1\77\3\0"+
    "\1\27\3\0\1\27\21\0\1\77\2\0\1\27\10\101"+
    "\1\0\45\101\11\102\1\103\1\104\2\102\1\105\1\106"+
    "\2\102\1\107\1\102\1\110\1\111\1\112\1\113\1\114"+
    "\10\102\1\0\2\102\2\0\1\102\1\115\1\102\1\116"+
    "\5\102\6\0\1\10\1\117\1\31\2\120\3\10\2\120"+
    "\1\121\3\10\1\120\3\10\1\120\5\10\7\0\4\10"+
    "\1\0\1\121\2\10\1\120\6\0\1\41\1\10\1\122"+
    "\2\42\3\10\2\42\1\45\1\46\2\10\1\42\1\10"+
    "\1\46\1\10\1\42\5\10\7\0\4\10\1\0\1\45"+
    "\2\10\1\42\6\0\1\67\1\74\1\123\1\124\1\125"+
    "\3\0\2\125\1\71\1\72\2\0\1\124\1\0\1\72"+
    "\1\0\1\124\21\0\1\71\1\0\1\73\1\124\6\0"+
    "\1\41\1\42\1\43\2\14\1\126\2\10\2\14\1\45"+
    "\1\46\2\10\1\14\1\10\1\46\1\10\1\14\5\10"+
    "\7\0\4\10\1\0\1\45\1\10\1\47\1\14\6\0"+
    "\1\10\1\127\1\31\2\130\3\10\2\130\4\10\1\130"+
    "\3\10\1\130\5\10\7\0\4\10\1\0\3\10\1\130"+
    "\6\0\2\10\1\31\2\131\3\10\2\131\1\132\3\10"+
    "\1\131\3\10\1\131\5\10\7\0\4\10\1\0\1\132"+
    "\2\10\1\131\6\0\2\10\1\31\2\133\3\10\2\133"+
    "\4\10\1\133\3\10\1\133\5\10\7\0\4\10\1\0"+
    "\3\10\1\133\6\0\1\41\1\42\1\43\2\14\3\10"+
    "\1\14\1\134\1\45\1\46\2\10\1\14\1\10\1\46"+
    "\1\10\1\14\5\10\7\0\4\10\1\0\1\45\1\10"+
    "\1\47\1\14\11\0\2\135\3\0\2\135\4\0\1\135"+
    "\3\0\1\135\24\0\1\135\6\0\1\67\1\135\1\136"+
    "\2\53\1\0\1\54\1\0\2\53\1\71\1\137\2\0"+
    "\1\53\1\0\1\137\1\0\1\53\21\0\1\71\1\0"+
    "\1\140\1\53\6\0\2\10\1\31\12\10\1\141\12\10"+
    "\7\0\4\10\1\0\4\10\6\0\2\10\1\31\12\10"+
    "\1\142\12\10\7\0\4\10\1\0\4\10\6\0\2\10"+
    "\1\31\23\10\1\143\1\10\7\0\4\10\1\0\4\10"+
    "\6\0\2\10\1\31\22\10\1\144\2\10\7\0\4\10"+
    "\1\0\4\10\41\61\1\145\1\63\13\61\40\64\1\0"+
    "\2\64\2\0\11\64\7\0\1\146\1\0\2\147\3\0"+
    "\2\147\1\150\3\0\1\147\3\0\1\147\21\0\1\150"+
    "\2\0\1\147\6\0\1\67\1\74\1\70\1\124\1\125"+
    "\3\0\2\125\1\71\1\72\2\0\1\124\1\0\1\72"+
    "\1\0\1\124\21\0\1\71\1\0\1\73\1\124\7\0"+
    "\1\151\1\0\2\152\1\0\1\54\1\0\2\152\4\0"+
    "\1\152\3\0\1\152\24\0\1\152\11\0\2\124\3\0"+
    "\2\124\1\153\3\0\1\124\3\0\1\124\21\0\1\153"+
    "\2\0\1\124\11\0\2\154\3\0\2\154\4\0\1\154"+
    "\3\0\1\154\24\0\1\154\6\0\1\67\1\0\1\74"+
    "\1\124\1\125\3\0\2\125\1\71\1\72\2\0\1\124"+
    "\1\0\1\72\1\0\1\124\21\0\1\71\2\0\1\124"+
    "\11\0\2\33\3\0\2\33\4\0\1\33\3\0\1\33"+
    "\24\0\1\33\12\0\1\155\1\0\1\155\52\0\1\155"+
    "\13\0\1\155\5\0\1\155\22\0\10\101\1\0\30\101"+
    "\1\156\14\101\24\0\1\157\52\0\1\160\46\0\1\161"+
    "\55\0\1\162\111\0\1\163\33\0\1\164\57\0\1\165"+
    "\40\0\2\112\3\0\2\112\4\0\1\112\3\0\1\112"+
    "\24\0\1\112\14\0\1\166\53\0\1\167\67\0\1\170"+
    "\54\0\1\171\40\0\2\10\1\31\2\172\3\10\2\172"+
    "\4\10\1\172\3\10\1\172\5\10\7\0\4\10\1\0"+
    "\3\10\1\172\6\0\1\10\1\172\1\173\2\120\3\10"+
    "\2\120\4\10\1\120\3\10\1\120\5\10\7\0\4\10"+
    "\1\0\2\10\1\174\1\120\6\0\1\10\1\117\1\31"+
    "\2\120\3\10\2\120\4\10\1\120\3\10\1\120\5\10"+
    "\7\0\4\10\1\0\3\10\1\120\6\0\1\67\1\0"+
    "\1\175\1\124\1\125\3\0\2\125\1\71\1\72\2\0"+
    "\1\124\1\0\1\72\1\0\1\124\21\0\1\71\2\0"+
    "\1\124\6\0\1\41\1\175\1\43\1\131\1\176\3\10"+
    "\2\176\1\45\1\46\2\10\1\131\1\10\1\46\1\10"+
    "\1\131\5\10\7\0\4\10\1\0\1\45\1\10\1\47"+
    "\1\131\6\0\1\67\2\0\2\124\3\0\2\124\1\177"+
    "\3\0\1\124\3\0\1\124\21\0\1\177\2\0\1\124"+
    "\6\0\1\67\2\0\2\124\3\0\2\124\1\71\3\0"+
    "\1\124\3\0\1\124\21\0\1\71\2\0\1\124\6\0"+
    "\2\10\1\31\3\10\1\200\21\10\7\0\4\10\1\0"+
    "\4\10\6\0\2\10\1\31\2\201\3\10\2\201\4\10"+
    "\1\201\3\10\1\201\5\10\7\0\4\10\1\0\3\10"+
    "\1\201\6\0\1\41\1\201\1\202\2\130\3\10\2\130"+
    "\1\203\3\10\1\130\3\10\1\130\5\10\7\0\4\10"+
    "\1\0\1\203\1\10\1\204\1\130\6\0\1\41\1\10"+
    "\1\31\2\131\3\10\2\131\1\203\3\10\1\131\3\10"+
    "\1\131\5\10\7\0\4\10\1\0\1\203\2\10\1\131"+
    "\6\0\2\10\1\31\2\131\3\10\2\131\4\10\1\131"+
    "\3\10\1\131\5\10\7\0\4\10\1\0\3\10\1\131"+
    "\6\0\1\41\1\10\1\205\2\133\3\10\2\133\1\203"+
    "\3\10\1\133\3\10\1\133\5\10\7\0\4\10\1\0"+
    "\1\203\2\10\1\133\6\0\1\41\1\42\1\43\2\14"+
    "\1\10\1\206\1\10\2\14\1\45\1\46\2\10\1\14"+
    "\1\10\1\46\1\10\1\14\5\10\7\0\4\10\1\0"+
    "\1\45\1\10\1\47\1\14\6\0\1\67\1\0\1\207"+
    "\2\135\1\0\1\54\1\0\2\135\1\71\1\137\2\0"+
    "\1\135\1\0\1\137\1\0\1\135\21\0\1\71\2\0"+
    "\1\135\6\0\1\67\1\207\1\136\1\210\1\211\1\0"+
    "\1\54\1\0\2\211\1\71\1\137\2\0\1\210\1\0"+
    "\1\137\1\0\1\210\21\0\1\71\1\0\1\140\1\210"+
    "\11\0\2\210\3\0\2\210\1\212\3\0\1\210\3\0"+
    "\1\210\21\0\1\212\2\0\1\210\11\0\2\213\3\0"+
    "\2\213\4\0\1\213\3\0\1\213\24\0\1\213\6\0"+
    "\2\10\1\31\24\10\1\214\7\0\4\10\1\0\4\10"+
    "\6\0\2\10\1\31\7\10\1\215\6\10\1\216\6\10"+
    "\7\0\4\10\1\0\4\10\6\0\2\10\1\31\1\217"+
    "\24\10\7\0\4\10\1\0\4\10\6\0\2\10\1\31"+
    "\12\10\1\220\12\10\7\0\4\10\1\0\4\10\11\0"+
    "\2\221\3\0\2\221\4\0\1\221\3\0\1\221\24\0"+
    "\1\221\7\0\1\221\1\222\2\147\3\0\2\147\1\223"+
    "\1\224\2\0\1\147\1\0\1\224\1\0\1\147\21\0"+
    "\1\223\1\0\1\225\1\147\7\0\1\146\1\0\2\147"+
    "\3\0\2\147\4\0\1\147\3\0\1\147\24\0\1\147"+
    "\11\0\2\226\3\0\2\226\4\0\1\226\3\0\1\226"+
    "\24\0\1\226\6\0\1\67\1\226\1\227\2\152\1\0"+
    "\1\54\1\0\2\152\1\177\1\230\2\0\1\152\1\0"+
    "\1\230\1\0\1\152\21\0\1\177\1\0\1\231\1\152"+
    "\11\0\2\124\3\0\2\124\4\0\1\124\3\0\1\124"+
    "\24\0\1\124\6\0\1\67\1\0\1\232\2\154\3\0"+
    "\2\154\1\177\3\0\1\154\3\0\1\154\21\0\1\177"+
    "\2\0\1\154\7\0\1\75\1\0\2\27\3\0\2\27"+
    "\1\77\3\0\1\27\3\0\1\27\21\0\1\77\2\0"+
    "\1\27\10\101\1\233\30\101\1\156\14\101\30\0\1\234"+
    "\55\0\1\102\74\0\1\235\34\0\1\236\53\0\1\237"+
    "\42\0\1\102\70\0\1\240\46\0\1\241\63\0\1\242"+
    "\45\0\1\243\50\0\2\10\1\244\2\172\3\10\2\172"+
    "\4\10\1\172\3\10\1\172\5\10\7\0\4\10\1\0"+
    "\3\10\1\172\7\0\1\245\1\246\1\247\1\250\3\0"+
    "\2\250\1\223\1\224\2\0\1\247\1\0\1\224\1\0"+
    "\1\247\21\0\1\223\1\0\1\225\1\247\6\0\2\10"+
    "\1\31\2\251\3\10\2\251\4\10\1\251\3\10\1\251"+
    "\5\10\7\0\4\10\1\0\3\10\1\251\6\0\1\41"+
    "\1\10\1\122\1\131\1\176\3\10\2\176\1\45\1\46"+
    "\2\10\1\131\1\10\1\46\1\10\1\131\5\10\7\0"+
    "\4\10\1\0\1\45\2\10\1\131\6\0\1\41\1\10"+
    "\1\31\2\131\3\10\2\131\1\45\3\10\1\131\3\10"+
    "\1\131\5\10\7\0\4\10\1\0\1\45\2\10\1\131"+
    "\7\0\1\151\1\0\2\252\1\0\1\54\1\0\2\252"+
    "\4\0\1\252\3\0\1\252\24\0\1\252\6\0\2\10"+
    "\1\31\4\10\1\253\20\10\7\0\4\10\1\0\4\10"+
    "\6\0\2\10\1\254\2\201\3\10\2\201\4\10\1\201"+
    "\3\10\1\201\5\10\7\0\4\10\1\0\3\10\1\201"+
    "\7\0\1\255\1\256\1\257\1\260\1\0\1\54\1\0"+
    "\2\260\1\261\1\230\2\0\1\257\1\0\1\230\1\0"+
    "\1\257\21\0\1\261\1\0\1\231\1\257\6\0\1\10"+
    "\1\127\1\31\2\262\3\10\2\262\4\10\1\262\3\10"+
    "\1\262\5\10\7\0\4\10\1\0\3\10\1\262\6\0"+
    "\2\10\1\31\2\263\3\10\2\263\4\10\1\263\3\10"+
    "\1\263\5\10\7\0\4\10\1\0\3\10\1\263\6\0"+
    "\1\67\1\0\1\264\7\0\1\177\31\0\1\177\11\0"+
    "\2\10\1\31\4\10\1\265\20\10\7\0\4\10\1\0"+
    "\4\10\6\0\1\67\1\0\1\207\1\210\1\211\1\0"+
    "\1\54\1\0\2\211\1\71\1\137\2\0\1\210\1\0"+
    "\1\137\1\0\1\210\21\0\1\71\2\0\1\210\6\0"+
    "\1\67\2\0\2\210\1\0\1\54\1\0\2\210\1\177"+
    "\3\0\1\210\3\0\1\210\21\0\1\177\2\0\1\210"+
    "\6\0\1\67\2\0\2\210\1\0\1\54\1\0\2\210"+
    "\1\71\3\0\1\210\3\0\1\210\21\0\1\71\2\0"+
    "\1\210\11\0\2\210\3\0\2\210\4\0\1\210\3\0"+
    "\1\210\24\0\1\210\6\0\1\67\1\0\1\266\2\213"+
    "\1\0\1\54\1\0\2\213\1\177\3\0\1\213\3\0"+
    "\1\213\21\0\1\177\2\0\1\213\6\0\2\10\1\31"+
    "\10\10\1\267\14\10\7\0\4\10\1\0\4\10\6\0"+
    "\2\10\1\31\1\10\1\270\23\10\7\0\4\10\1\0"+
    "\4\10\6\0\2\10\1\31\5\10\1\271\17\10\7\0"+
    "\4\10\1\0\4\10\6\0\2\10\1\31\1\10\1\272"+
    "\23\10\7\0\4\10\1\0\4\10\10\0\1\245\2\221"+
    "\3\0\2\221\1\223\1\224\2\0\1\221\1\0\1\224"+
    "\1\0\1\221\21\0\1\223\2\0\1\221\7\0\1\245"+
    "\1\222\1\247\1\250\3\0\2\250\1\223\1\224\2\0"+
    "\1\247\1\0\1\224\1\0\1\247\21\0\1\223\1\0"+
    "\1\225\1\247\11\0\2\247\3\0\2\247\4\0\1\247"+
    "\3\0\1\247\24\0\1\247\11\0\2\247\3\0\2\247"+
    "\1\223\3\0\1\247\3\0\1\247\21\0\1\223\2\0"+
    "\1\247\11\0\2\273\3\0\2\273\4\0\1\273\3\0"+
    "\1\273\24\0\1\273\10\0\1\255\2\226\1\0\1\54"+
    "\1\0\2\226\1\261\1\230\2\0\1\226\1\0\1\230"+
    "\1\0\1\226\21\0\1\261\2\0\1\226\7\0\1\255"+
    "\1\227\1\257\1\260\1\0\1\54\1\0\2\260\1\261"+
    "\1\230\2\0\1\257\1\0\1\230\1\0\1\257\21\0"+
    "\1\261\1\0\1\231\1\257\11\0\2\257\3\0\2\257"+
    "\1\261\3\0\1\257\3\0\1\257\21\0\1\261\2\0"+
    "\1\257\11\0\2\274\3\0\2\274\4\0\1\274\3\0"+
    "\1\274\24\0\1\274\6\0\1\67\1\0\1\232\7\0"+
    "\1\177\31\0\1\177\50\0\1\275\36\0\1\276\41\0"+
    "\1\277\73\0\1\243\54\0\1\300\40\0\1\301\75\0"+
    "\1\302\35\0\1\102\53\0\1\303\1\247\1\250\3\0"+
    "\2\250\1\223\1\224\2\0\1\247\1\0\1\224\1\0"+
    "\1\247\21\0\1\223\2\0\1\247\10\0\1\245\1\247"+
    "\1\250\3\0\2\250\1\223\1\224\2\0\1\247\1\0"+
    "\1\224\1\0\1\247\21\0\1\223\2\0\1\247\6\0"+
    "\1\10\1\303\1\173\25\10\7\0\4\10\1\0\2\10"+
    "\1\174\1\10\6\0\2\10\1\304\2\251\3\10\2\251"+
    "\4\10\1\251\3\10\1\251\5\10\7\0\4\10\1\0"+
    "\3\10\1\251\7\0\1\226\1\227\2\252\1\0\1\54"+
    "\1\0\2\252\1\261\1\230\2\0\1\252\1\0\1\230"+
    "\1\0\1\252\21\0\1\261\1\0\1\231\1\252\10\0"+
    "\1\305\1\257\1\260\1\0\1\54\1\0\2\260\1\261"+
    "\1\230\2\0\1\257\1\0\1\230\1\0\1\257\21\0"+
    "\1\261\2\0\1\257\10\0\1\255\1\257\1\260\1\0"+
    "\1\54\1\0\2\260\1\261\1\230\2\0\1\257\1\0"+
    "\1\230\1\0\1\257\21\0\1\261\2\0\1\257\6\0"+
    "\1\10\1\305\1\202\25\10\7\0\4\10\1\0\2\10"+
    "\1\204\1\10\11\0\2\257\1\0\1\54\1\0\2\257"+
    "\4\0\1\257\3\0\1\257\24\0\1\257\11\0\2\257"+
    "\1\0\1\54\1\0\2\257\1\261\3\0\1\257\3\0"+
    "\1\257\21\0\1\261\2\0\1\257\11\0\2\257\3\0"+
    "\2\257\4\0\1\257\3\0\1\257\24\0\1\257\6\0"+
    "\1\10\1\201\1\202\2\262\3\10\2\262\4\10\1\262"+
    "\3\10\1\262\5\10\7\0\4\10\1\0\2\10\1\204"+
    "\1\262\6\0\2\10\1\306\2\263\3\10\2\263\4\10"+
    "\1\263\3\10\1\263\5\10\7\0\4\10\1\0\3\10"+
    "\1\263\6\0\1\41\1\10\1\205\7\10\1\203\15\10"+
    "\7\0\4\10\1\0\1\203\3\10\6\0\2\10\1\31"+
    "\1\10\1\307\23\10\7\0\4\10\1\0\4\10\6\0"+
    "\1\67\1\0\1\266\3\0\1\54\3\0\1\177\31\0"+
    "\1\177\11\0\2\10\1\31\11\10\1\310\13\10\7\0"+
    "\4\10\1\0\4\10\6\0\2\10\1\31\17\10\1\311"+
    "\5\10\7\0\4\10\1\0\4\10\6\0\2\10\1\31"+
    "\13\10\1\312\11\10\7\0\4\10\1\0\4\10\10\0"+
    "\1\313\2\273\3\0\2\273\4\0\1\273\3\0\1\273"+
    "\24\0\1\273\10\0\1\314\2\274\1\0\1\54\1\0"+
    "\2\274\4\0\1\274\3\0\1\274\24\0\1\274\21\0"+
    "\1\315\50\0\1\316\64\0\1\243\66\0\1\102\40\0"+
    "\1\317\65\0\1\320\34\0\2\10\1\244\25\10\7\0"+
    "\4\10\1\0\4\10\10\0\1\321\53\0\2\10\1\254"+
    "\25\10\7\0\4\10\1\0\4\10\10\0\1\322\3\0"+
    "\1\54\47\0\2\10\1\31\7\10\1\323\15\10\7\0"+
    "\4\10\1\0\4\10\6\0\2\10\1\31\4\10\1\324"+
    "\20\10\7\0\4\10\1\0\4\10\6\0\2\10\1\31"+
    "\7\10\1\325\15\10\7\0\4\10\1\0\4\10\10\0"+
    "\1\313\55\0\1\314\3\0\1\54\56\0\1\243\52\0"+
    "\1\326\60\0\1\102\46\0\2\10\1\304\25\10\7\0"+
    "\4\10\1\0\4\10\6\0\2\10\1\306\25\10\7\0"+
    "\4\10\1\0\4\10\6\0\2\10\1\31\10\10\1\327"+
    "\14\10\7\0\4\10\1\0\4\10\6\0\2\10\1\31"+
    "\12\10\1\330\12\10\7\0\4\10\1\0\4\10\6\0"+
    "\2\10\1\31\10\10\1\331\14\10\7\0\4\10\1\0"+
    "\4\10\12\0\1\332\51\0\2\10\1\31\11\10\1\333"+
    "\13\10\7\0\4\10\1\0\4\10\6\0\2\10\1\31"+
    "\13\10\1\334\11\10\7\0\4\10\1\0\4\10\6\0"+
    "\2\10\1\31\11\10\1\335\13\10\7\0\4\10\1\0"+
    "\4\10\16\0\1\102\45\0\2\10\1\31\4\10\1\336"+
    "\20\10\7\0\4\10\1\0\4\10\6\0\2\10\1\31"+
    "\14\10\1\337\10\10\7\0\4\10\1\0\4\10\6\0"+
    "\2\10\1\31\4\10\1\340\20\10\7\0\4\10\1\0"+
    "\4\10\6\0\2\10\1\31\12\10\1\341\12\10\7\0"+
    "\4\10\1\0\4\10\6\0\2\10\1\31\12\10\1\342"+
    "\12\10\7\0\4\10\1\0\4\10\6\0\2\10\1\31"+
    "\13\10\1\343\11\10\7\0\4\10\1\0\4\10\6\0"+
    "\2\10\1\31\13\10\1\344\11\10\7\0\4\10\1\0"+
    "\4\10\6\0\2\10\1\31\14\10\1\345\10\10\7\0"+
    "\4\10\1\0\4\10\6\0\2\10\1\31\14\10\1\346"+
    "\10\10\7\0\4\10\1\0\4\10";

  private static int [] zzUnpackTrans() {
    int [] result = new int[9338];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\5\11\21\1\1\11\2\0\1\1\2\0\1\11"+
    "\2\0\11\1\1\0\1\1\1\11\4\1\1\0\1\11"+
    "\3\0\1\11\1\0\1\1\3\0\1\1\5\0\1\11"+
    "\34\1\2\0\5\1\1\0\1\1\2\0\1\1\1\0"+
    "\1\1\15\0\5\1\1\0\2\1\1\0\7\1\1\0"+
    "\10\1\7\0\1\1\1\11\10\0\6\1\1\0\1\1"+
    "\2\0\1\1\3\0\12\1\7\0\3\1\1\0\5\1"+
    "\5\0\5\1\1\0\3\1\1\0\14\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[230];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  _SchemeLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return TokenType.BAD_CHARACTER;
            }
          case 26: break;
          case 2: 
            { return SchemeTokenTypes.OPEN_PAREN;
            }
          case 27: break;
          case 3: 
            { return SchemeTokenTypes.CLOSE_PAREN;
            }
          case 28: break;
          case 4: 
            { return SchemeTokenTypes.APOSTROPHE;
            }
          case 29: break;
          case 5: 
            { return SchemeTokenTypes.BACKQUOTE;
            }
          case 30: break;
          case 6: 
            { return SchemeTokenTypes.COMMA;
            }
          case 31: break;
          case 7: 
            { return SchemeTokenTypes.IDENTIFIER;
            }
          case 32: break;
          case 8: 
            { return SchemeTokenTypes.DOT;
            }
          case 33: break;
          case 9: 
            { return SchemeTokenTypes.POUND;
            }
          case 34: break;
          case 10: 
            { return TokenType.WHITE_SPACE;
            }
          case 35: break;
          case 11: 
            { return SchemeTokens.COMMENT;
            }
          case 36: break;
          case 12: 
            { return SchemeTokenTypes.NUMBER;
            }
          case 37: break;
          case 13: 
            { return SchemeTokenTypes.COMMA_AT;
            }
          case 38: break;
          case 14: 
            { return SchemeTokenTypes.BOOLEAN;
            }
          case 39: break;
          case 15: 
            { return SchemeTokenTypes.IF;
            }
          case 40: break;
          case 16: 
            { return SchemeTokenTypes.STRING;
            }
          case 41: break;
          case 17: 
            { return SchemeTokenTypes.CHARACTER;
            }
          case 42: break;
          case 18: 
            { return SchemeTokenTypes.SET;
            }
          case 43: break;
          case 19: 
            { return SchemeTokenTypes.BEGIN;
            }
          case 44: break;
          case 20: 
            { return SchemeTokenTypes.QUOTE;
            }
          case 45: break;
          case 21: 
            { return SchemeTokenTypes.DEFINE;
            }
          case 46: break;
          case 22: 
            { return SchemeTokenTypes.LAMBDA;
            }
          case 47: break;
          case 23: 
            { return SchemeTokenTypes.LET_SYNTAX;
            }
          case 48: break;
          case 24: 
            { return SchemeTokenTypes.DEFINE_SYNTAX;
            }
          case 49: break;
          case 25: 
            { return SchemeTokenTypes.LETREC_SYNTAX;
            }
          case 50: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
