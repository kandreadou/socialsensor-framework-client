package eu.socialsensor.framework.client.lucene;
/* The following code was generated by JFlex 1.4.3 on 15/06/12 13:48 */

/**
* Licensed to the Apache Software Foundation (ASF) under one or more
* contributor license agreements. See the NOTICE file distributed with
* this work for additional information regarding copyright ownership.
* The ASF licenses this file to You under the Apache License, Version 2.0
* (the "License"); you may not use this file except in compliance with
* the License. You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

/*

WARNING: if you change TweetTokenizer.jflex and need to regenerate
the tokenizer, only use Java 1.4 !!!
This grammar currently uses constructs (eg :digit:, :letter:) whose
meaning can vary according to the JRE used to run jflex. See
https://issues.apache.org/jira/browse/LUCENE-1126 for details.
For current backwards compatibility it is needed to support
only Java 1.4 - this will change in Lucene 3.1.

*/

import org.apache.lucene.analysis.Token;
import org.apache.lucene.analysis.tokenattributes.CharTermAttribute;


/**
* This class is a scanner generated by 
* <a href="http://www.jflex.de/">JFlex</a> 1.4.3
* on 16/01/13 17:35 from the specification file
* <tt>TweetTokenizerImpl.jflex</tt>
*/
class TweetTokenizerImpl {

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
 */
private static final String ZZ_CMAP_PACKED = 
  "\11\0\1\0\1\41\1\0\1\0\1\40\22\0\1\0\1\23\1\0"+
  "\1\26\1\23\1\22\1\5\1\3\4\23\1\35\1\7\1\4\1\25"+
  "\1\13\1\13\1\14\2\15\1\16\4\12\1\20\1\21\1\0\1\21"+
  "\1\0\1\24\1\6\6\17\1\11\1\31\7\11\1\33\2\11\1\34"+
  "\1\32\6\11\1\27\1\0\1\30\1\0\1\10\1\0\6\17\1\11"+
  "\1\31\7\11\1\33\2\11\1\34\1\32\6\11\3\0\1\21\53\0"+
  "\1\36\12\0\1\36\4\0\1\36\5\0\27\36\1\0\37\36\1\0"+
  "\u013f\36\31\0\162\36\4\0\14\36\16\0\5\36\11\0\1\36\213\0"+
  "\1\36\13\0\1\36\1\0\3\36\1\0\1\36\1\0\24\36\1\0"+
  "\54\36\1\0\46\36\1\0\5\36\4\0\202\36\10\0\105\36\1\0"+
  "\46\36\2\0\2\36\6\0\20\36\41\0\46\36\2\0\1\36\7\0"+
  "\47\36\110\0\33\36\5\0\3\36\56\0\32\36\5\0\13\36\25\0"+
  "\12\2\4\0\2\36\1\0\143\36\1\0\1\36\17\0\2\36\7\0"+
  "\2\36\12\2\3\36\2\0\1\36\20\0\1\36\1\0\36\36\35\0"+
  "\3\36\60\0\46\36\13\0\1\36\u0152\0\66\36\3\0\1\36\22\0"+
  "\1\36\7\0\12\36\4\0\12\2\25\0\10\36\2\0\2\36\2\0"+
  "\26\36\1\0\7\36\1\0\1\36\3\0\4\36\3\0\1\36\36\0"+
  "\2\36\1\0\3\36\4\0\12\2\2\36\23\0\6\36\4\0\2\36"+
  "\2\0\26\36\1\0\7\36\1\0\2\36\1\0\2\36\1\0\2\36"+
  "\37\0\4\36\1\0\1\36\7\0\12\2\2\0\3\36\20\0\11\36"+
  "\1\0\3\36\1\0\26\36\1\0\7\36\1\0\2\36\1\0\5\36"+
  "\3\0\1\36\22\0\1\36\17\0\2\36\4\0\12\2\25\0\10\36"+
  "\2\0\2\36\2\0\26\36\1\0\7\36\1\0\2\36\1\0\5\36"+
  "\3\0\1\36\36\0\2\36\1\0\3\36\4\0\12\2\1\0\1\36"+
  "\21\0\1\36\1\0\6\36\3\0\3\36\1\0\4\36\3\0\2\36"+
  "\1\0\1\36\1\0\2\36\3\0\2\36\3\0\3\36\3\0\10\36"+
  "\1\0\3\36\55\0\11\2\25\0\10\36\1\0\3\36\1\0\27\36"+
  "\1\0\12\36\1\0\5\36\46\0\2\36\4\0\12\2\25\0\10\36"+
  "\1\0\3\36\1\0\27\36\1\0\12\36\1\0\5\36\3\0\1\36"+
  "\40\0\1\36\1\0\2\36\4\0\12\2\25\0\10\36\1\0\3\36"+
  "\1\0\27\36\1\0\20\36\46\0\2\36\4\0\12\2\25\0\22\36"+
  "\3\0\30\36\1\0\11\36\1\0\1\36\2\0\7\36\71\0\1\1"+
  "\60\36\1\1\2\36\14\1\7\36\11\1\12\2\47\0\2\36\1\0"+
  "\1\36\2\0\2\36\1\0\1\36\2\0\1\36\6\0\4\36\1\0"+
  "\7\36\1\0\3\36\1\0\1\36\1\0\1\36\2\0\2\36\1\0"+
  "\4\36\1\0\2\36\11\0\1\36\2\0\5\36\1\0\1\36\11\0"+
  "\12\2\2\0\2\36\42\0\1\36\37\0\12\2\26\0\10\36\1\0"+
  "\42\36\35\0\4\36\164\0\42\36\1\0\5\36\1\0\2\36\25\0"+
  "\12\2\6\0\6\36\112\0\46\36\12\0\51\36\7\0\132\36\5\0"+
  "\104\36\5\0\122\36\6\0\7\36\1\0\77\36\1\0\1\36\1\0"+
  "\4\36\2\0\7\36\1\0\1\36\1\0\4\36\2\0\47\36\1\0"+
  "\1\36\1\0\4\36\2\0\37\36\1\0\1\36\1\0\4\36\2\0"+
  "\7\36\1\0\1\36\1\0\4\36\2\0\7\36\1\0\7\36\1\0"+
  "\27\36\1\0\37\36\1\0\1\36\1\0\4\36\2\0\7\36\1\0"+
  "\47\36\1\0\23\36\16\0\11\2\56\0\125\36\14\0\u026c\36\2\0"+
  "\10\36\12\0\32\36\5\0\113\36\25\0\15\36\1\0\4\36\16\0"+
  "\22\36\16\0\22\36\16\0\15\36\1\0\3\36\17\0\64\36\43\0"+
  "\1\36\4\0\1\36\3\0\12\2\46\0\12\2\6\0\130\36\10\0"+
  "\51\36\127\0\35\36\51\0\12\2\36\36\2\0\5\36\u038b\0\154\36"+
  "\224\0\234\36\4\0\132\36\6\0\26\36\2\0\6\36\2\0\46\36"+
  "\2\0\6\36\2\0\10\36\1\0\1\36\1\0\1\36\1\0\1\36"+
  "\1\0\37\36\2\0\65\36\1\0\7\36\1\0\1\36\3\0\3\36"+
  "\1\0\7\36\3\0\4\36\2\0\6\36\4\0\15\36\5\0\3\36"+
  "\1\0\7\36\164\0\1\36\15\0\1\36\202\0\1\36\4\0\1\36"+
  "\2\0\12\36\1\0\1\36\3\0\5\36\6\0\1\36\1\0\1\36"+
  "\1\0\1\36\1\0\4\36\1\0\3\36\1\0\7\36\3\0\3\36"+
  "\5\0\5\36\u0ebb\0\2\36\52\0\5\36\5\0\2\36\3\0\1\37"+
  "\126\37\6\37\3\37\1\37\132\37\1\37\4\37\5\37\50\37\3\37"+
  "\1\0\136\36\21\0\30\36\70\0\20\37\u0100\0\200\37\200\0\u19b6\37"+
  "\12\37\100\0\u51a6\37\132\37\u048d\36\u0773\0\u2ba4\36\u215c\0\u012e\37\2\37"+
  "\73\37\225\37\7\36\14\0\5\36\5\0\1\36\1\0\12\36\1\0"+
  "\15\36\1\0\5\36\1\0\1\36\1\0\2\36\1\0\2\36\1\0"+
  "\154\36\41\0\u016b\36\22\0\100\36\2\0\66\36\50\0\14\36\164\0"+
  "\5\36\1\0\207\36\23\0\12\2\7\0\32\36\6\0\32\36\12\0"+
  "\1\37\72\37\37\36\3\0\6\36\2\0\6\36\2\0\6\36\2\0"+
  "\3\36\43\0";

/** 
 * Translates characters to character classes
 */
private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

/** 
 * Translates DFA states to action switch labels.
 */
private static final int [] ZZ_ACTION = zzUnpackAction();

private static final String ZZ_ACTION_PACKED_0 =
  "\1\0\1\1\2\2\1\1\1\2\1\1\1\2\1\3"+
  "\1\1\4\0\1\2\2\0\1\2\1\4\1\0\1\5"+
  "\4\0\1\2\1\6\1\2\3\7\2\0\1\10\1\0"+
  "\1\10\1\2\3\7\3\10\1\0\3\10\1\11\1\7"+
  "\2\12\1\2\1\13\1\0\1\13\3\0\2\13\1\7"+
  "\1\14\1\2\1\15\1\7\1\0\1\2\4\0\1\16"+
  "\3\0\1\16\3\0\3\16\7\0\1\16\7\0\2\16"+
  "\12\0\3\16\15\0\2\16\15\0\2\16\15\0\1\16"+
  "\134\0";

private static int [] zzUnpackAction() {
  int [] result = new int[248];
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
  "\0\0\0\42\0\104\0\146\0\210\0\252\0\314\0\356"+
  "\0\42\0\u0110\0\u0132\0\u0154\0\u0176\0\u0198\0\u01ba\0\u01dc"+
  "\0\u01fe\0\u0220\0\42\0\u0242\0\210\0\u0264\0\u0286\0\u02a8"+
  "\0\u02ca\0\u02ec\0\314\0\u030e\0\u0330\0\u0352\0\u0374\0\u0396"+
  "\0\u03b8\0\u03da\0\u03fc\0\u041e\0\u0440\0\u0462\0\u0484\0\u04a6"+
  "\0\u04c8\0\u04ea\0\u050c\0\u052e\0\u0550\0\u0572\0\u0594\0\u05b6"+
  "\0\u05d8\0\u02a8\0\u05fa\0\u061c\0\u063e\0\u0660\0\u0682\0\u06a4"+
  "\0\u06c6\0\u06e8\0\u0132\0\u052e\0\u070a\0\u072c\0\u074e\0\u0770"+
  "\0\u0792\0\u07b4\0\u07d6\0\u07f8\0\u081a\0\u083c\0\u085e\0\u0880"+
  "\0\u08a2\0\u08c4\0\u08e6\0\u0908\0\u092a\0\u094c\0\u096e\0\u0990"+
  "\0\u09b2\0\u09d4\0\u09f6\0\u0a18\0\u0a3a\0\u0a5c\0\u0a7e\0\u0aa0"+
  "\0\u0ac2\0\u0ae4\0\u0b06\0\u0b28\0\u0b4a\0\u0b6c\0\u0b8e\0\u0bb0"+
  "\0\u0bd2\0\u0bf4\0\u0c16\0\u0c38\0\u0c5a\0\u0c7c\0\u0c9e\0\u0cc0"+
  "\0\u0ce2\0\u0d04\0\u0d26\0\u0d48\0\u0d6a\0\u0d8c\0\u0dae\0\u0dd0"+
  "\0\u0df2\0\u0e14\0\u0e36\0\u0e58\0\u0e7a\0\u0e9c\0\u0ebe\0\u0ee0"+
  "\0\u0f02\0\u0f24\0\u0f46\0\u0f68\0\u0f8a\0\u0fac\0\u0fce\0\u0ff0"+
  "\0\u1012\0\u1034\0\u1056\0\u1078\0\u109a\0\u10bc\0\u10de\0\u1100"+
  "\0\u1122\0\u1144\0\u1166\0\u1188\0\u11aa\0\u11cc\0\u11ee\0\u1210"+
  "\0\u1232\0\u1254\0\u1276\0\u1298\0\u12ba\0\u12dc\0\u12fe\0\u1320"+
  "\0\u1342\0\u1364\0\u1386\0\u13a8\0\u13ca\0\u13ec\0\u140e\0\u1430"+
  "\0\u1452\0\u1474\0\u1496\0\u14b8\0\u14da\0\u14fc\0\u151e\0\u1540"+
  "\0\u1562\0\u1584\0\u15a6\0\u15c8\0\u15ea\0\u160c\0\u162e\0\u1650"+
  "\0\u1672\0\u1694\0\u16b6\0\u16d8\0\u16fa\0\u171c\0\u173e\0\u1760"+
  "\0\u1782\0\u17a4\0\u17c6\0\u17e8\0\u180a\0\u182c\0\u184e\0\u1870"+
  "\0\u1892\0\u18b4\0\u18d6\0\u18f8\0\u191a\0\u193c\0\u195e\0\u1980"+
  "\0\u19a2\0\u19c4\0\u19e6\0\u1a08\0\u1a2a\0\u1a4c\0\u1a6e\0\u1a90"+
  "\0\u1ab2\0\u1ad4\0\u1af6\0\u1b18\0\u1b3a\0\u1b5c\0\u1b7e\0\u1ba0"+
  "\0\u1bc2\0\u1be4\0\u1c06\0\u1c28\0\u1c4a\0\u1c6c\0\u1c8e\0\u1cb0"+
  "\0\u1cd2\0\u1cf4\0\u1d16\0\u1d38\0\u1d5a\0\u1d7c\0\u1d9e\0\u1dc0"+
  "\0\u1de2\0\u1e04\0\u1e26\0\u1e48\0\u1e6a\0\u1e8c\0\u1eae\0\u1ed0"+
  "\0\u1ef2\0\u1f14\0\u1f36\0\u1f58\0\u1f7a\0\u1f9c\0\u1fbe\0\u1fe0";

private static int [] zzUnpackRowMap() {
  int [] result = new int[248];
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
  "\1\2\1\3\1\4\3\2\1\5\2\2\1\6\5\4"+
  "\1\6\6\2\1\7\2\2\1\10\3\6\1\2\1\6"+
  "\1\11\1\12\1\2\43\0\2\3\1\0\1\13\1\0"+
  "\1\14\2\15\7\3\5\0\1\16\3\0\4\3\1\16"+
  "\1\3\4\0\1\3\1\17\1\0\1\20\1\0\1\14"+
  "\2\21\1\22\5\17\1\22\2\0\1\23\2\0\1\24"+
  "\3\0\4\22\1\24\1\22\5\0\1\25\5\0\10\25"+
  "\11\0\4\25\1\0\1\25\4\0\1\3\1\22\1\26"+
  "\1\27\1\30\1\31\2\15\1\32\5\22\1\32\5\0"+
  "\1\16\3\0\4\32\1\16\1\32\5\0\1\33\5\0"+
  "\10\33\11\0\4\33\1\0\1\33\4\0\1\3\1\22"+
  "\1\26\1\27\1\30\1\31\2\15\1\32\5\22\1\32"+
  "\5\0\1\16\3\0\1\32\1\34\2\32\1\16\1\32"+
  "\44\0\1\2\1\0\1\35\1\36\6\0\1\37\5\36"+
  "\1\37\11\0\4\37\1\0\1\37\4\0\2\40\6\0"+
  "\7\40\11\0\4\40\1\0\1\40\4\0\1\41\1\42"+
  "\6\0\1\43\5\42\1\43\11\0\4\43\1\0\1\43"+
  "\5\0\1\44\6\0\1\16\5\44\1\16\11\0\4\16"+
  "\1\0\1\16\4\0\1\3\1\45\1\0\1\20\1\0"+
  "\1\14\2\21\1\22\5\45\1\22\2\0\1\23\2\0"+
  "\1\24\3\0\4\22\1\24\1\22\4\0\1\46\1\47"+
  "\6\0\1\50\5\47\1\50\11\0\4\50\1\0\1\50"+
  "\4\0\1\51\1\52\6\0\1\53\5\52\1\53\11\0"+
  "\4\53\1\0\1\53\4\0\1\3\1\22\1\0\1\54"+
  "\1\0\1\14\2\21\7\22\5\0\1\24\3\0\4\22"+
  "\1\24\1\22\4\0\1\55\1\56\6\0\1\57\5\56"+
  "\1\57\11\0\4\57\1\0\1\57\14\0\1\60\5\0"+
  "\1\60\11\0\4\60\1\0\1\60\4\0\1\35\1\36"+
  "\6\0\1\61\5\36\1\61\11\0\4\61\1\0\1\61"+
  "\14\0\1\62\5\0\1\62\11\0\4\62\1\0\1\62"+
  "\4\0\2\40\6\0\1\63\5\40\1\63\11\0\4\63"+
  "\1\0\1\63\4\0\1\3\1\22\1\26\1\13\1\30"+
  "\1\31\2\15\1\32\5\22\1\32\5\0\1\16\3\0"+
  "\4\32\1\16\1\32\4\0\1\3\1\22\1\26\1\13"+
  "\1\30\1\31\2\15\1\32\5\22\1\32\5\0\1\16"+
  "\3\0\1\32\1\64\2\32\1\16\1\32\4\0\2\35"+
  "\1\0\1\65\1\0\1\14\2\66\7\35\11\0\4\35"+
  "\1\0\1\35\4\0\1\35\1\36\1\0\1\67\1\0"+
  "\1\14\2\70\7\36\5\0\1\71\3\0\4\36\1\71"+
  "\1\36\4\0\1\35\1\36\1\0\1\65\1\0\1\14"+
  "\2\66\1\37\5\36\1\37\11\0\4\37\1\0\1\37"+
  "\4\0\2\40\1\0\1\72\2\0\1\72\1\0\7\40"+
  "\11\0\4\40\1\0\1\40\4\0\2\41\1\0\1\66"+
  "\1\0\1\14\2\66\7\41\11\0\4\41\1\0\1\41"+
  "\4\0\1\41\1\42\1\0\1\70\1\0\1\14\2\70"+
  "\7\42\5\0\1\71\3\0\4\42\1\71\1\42\4\0"+
  "\1\41\1\42\1\0\1\66\1\0\1\14\2\66\1\43"+
  "\5\42\1\43\11\0\4\43\1\0\1\43\5\0\1\44"+
  "\1\0\1\71\2\0\2\71\7\44\5\0\1\71\3\0"+
  "\4\44\1\71\1\44\4\0\1\3\1\22\1\0\1\20"+
  "\1\0\1\14\2\21\7\22\2\0\1\23\2\0\1\24"+
  "\3\0\4\22\1\24\1\22\4\0\2\46\1\0\1\73"+
  "\1\0\1\14\2\15\7\46\5\0\1\16\3\0\4\46"+
  "\1\16\1\46\4\0\1\46\1\47\1\0\1\74\1\0"+
  "\1\14\2\21\1\75\5\47\1\75\2\0\1\23\2\0"+
  "\1\24\3\0\4\75\1\24\1\75\4\0\1\46\1\75"+
  "\1\0\1\73\1\0\1\14\2\15\1\50\5\75\1\50"+
  "\5\0\1\16\3\0\4\50\1\16\1\50\4\0\2\51"+
  "\1\0\1\15\1\0\1\14\2\15\7\51\5\0\1\16"+
  "\3\0\4\51\1\16\1\51\4\0\1\51\1\52\1\0"+
  "\1\21\1\0\1\14\2\21\7\52\5\0\1\24\3\0"+
  "\4\52\1\24\1\52\4\0\1\51\1\52\1\0\1\15"+
  "\1\0\1\14\2\15\1\53\5\52\1\53\5\0\1\16"+
  "\3\0\4\53\1\16\1\53\4\0\1\46\1\75\6\0"+
  "\1\50\5\75\1\50\11\0\4\50\1\0\1\50\4\0"+
  "\2\55\1\0\1\16\2\0\2\16\7\55\5\0\1\16"+
  "\3\0\4\55\1\16\1\55\4\0\1\55\1\56\1\0"+
  "\1\24\2\0\2\24\7\56\5\0\1\24\3\0\4\56"+
  "\1\24\1\56\4\0\1\55\1\56\1\0\1\16\2\0"+
  "\2\16\1\57\5\56\1\57\5\0\1\16\3\0\4\57"+
  "\1\16\1\57\6\0\1\26\5\0\1\60\5\0\1\60"+
  "\11\0\4\60\1\0\1\60\4\0\1\35\1\36\1\0"+
  "\1\76\1\0\1\14\2\66\1\37\5\36\1\37\11\0"+
  "\4\37\1\0\1\37\4\0\2\40\1\0\1\72\2\0"+
  "\1\72\1\0\1\63\5\40\1\63\11\0\4\63\1\0"+
  "\1\63\4\0\1\3\1\22\1\26\1\13\1\30\1\31"+
  "\2\15\1\32\5\22\1\32\5\0\1\16\3\0\2\32"+
  "\1\77\1\32\1\16\1\32\4\0\2\35\6\0\7\35"+
  "\11\0\4\35\1\0\1\35\4\0\2\41\6\0\7\41"+
  "\11\0\4\41\1\0\1\41\4\0\2\46\6\0\7\46"+
  "\11\0\4\46\1\0\1\46\4\0\2\51\6\0\7\51"+
  "\11\0\4\51\1\0\1\51\4\0\2\55\6\0\7\55"+
  "\11\0\4\55\1\0\1\55\4\0\2\100\6\0\7\100"+
  "\11\0\4\100\1\0\1\100\4\0\1\46\1\75\1\0"+
  "\1\74\1\0\1\14\2\21\7\75\5\0\1\24\3\0"+
  "\4\75\1\24\1\75\4\0\2\35\6\0\1\101\5\35"+
  "\1\101\11\0\4\101\1\0\1\101\4\0\1\3\1\22"+
  "\1\26\1\13\1\30\1\31\2\15\1\32\5\22\1\32"+
  "\1\102\4\0\1\16\3\0\3\32\1\103\1\16\1\32"+
  "\4\0\2\100\1\0\1\72\2\0\1\72\1\0\7\100"+
  "\11\0\4\100\1\0\1\100\4\0\2\35\1\0\1\76"+
  "\1\0\1\14\2\66\7\35\11\0\4\35\1\0\1\35"+
  "\30\0\1\104\15\0\1\3\1\22\1\26\1\13\1\30"+
  "\1\31\2\15\1\32\5\22\1\32\1\102\4\0\1\16"+
  "\3\0\4\32\1\16\1\32\30\0\1\105\17\0\3\106"+
  "\1\107\2\106\7\110\1\111\1\106\1\112\1\106\3\0"+
  "\1\113\1\0\4\110\1\106\7\0\3\106\1\107\11\106"+
  "\1\111\1\106\1\112\1\106\5\0\5\106\15\0\7\114"+
  "\7\0\1\113\1\0\4\114\10\0\1\106\1\115\1\106"+
  "\1\107\1\116\1\106\7\110\1\117\1\106\1\112\1\106"+
  "\1\120\1\121\1\122\2\0\4\110\1\106\7\0\3\111"+
  "\1\107\11\111\1\0\1\111\1\123\1\111\5\0\5\111"+
  "\16\0\6\124\34\0\6\125\1\126\25\0\1\127\2\0"+
  "\1\130\1\0\7\114\1\131\3\0\1\120\1\121\1\122"+
  "\2\0\4\114\10\0\3\106\1\107\2\106\7\110\1\111"+
  "\1\106\1\112\1\106\5\0\4\110\1\106\7\0\3\106"+
  "\1\107\1\116\1\106\7\110\1\111\1\106\1\112\1\106"+
  "\5\0\4\110\1\106\7\0\3\111\1\107\3\111\5\132"+
  "\1\111\1\0\1\111\1\123\1\111\5\0\5\111\7\0"+
  "\17\120\1\133\3\120\1\122\2\0\5\120\10\0\16\121"+
  "\1\134\1\0\1\120\1\121\1\122\2\0\4\121\10\0"+
  "\17\122\1\135\3\122\3\0\5\122\16\0\6\136\34\0"+
  "\6\106\34\0\6\137\1\140\41\0\1\141\32\0\7\114"+
  "\11\0\4\114\14\0\1\130\1\0\7\114\11\0\4\114"+
  "\17\0\5\142\26\0\3\111\1\107\3\111\5\143\1\111"+
  "\1\0\1\111\1\123\1\111\1\120\1\121\1\122\2\0"+
  "\5\111\16\0\6\144\34\0\6\145\34\0\6\146\34\0"+
  "\6\111\34\0\6\147\1\140\33\0\6\150\1\151\33\0"+
  "\1\152\1\153\1\154\2\152\1\155\10\0\1\156\23\0"+
  "\5\157\5\0\1\120\1\121\1\122\16\0\3\111\1\107"+
  "\3\111\5\160\1\111\1\0\1\111\1\123\1\111\1\120"+
  "\1\121\1\122\2\0\5\111\16\0\6\120\34\0\6\121"+
  "\34\0\6\122\34\0\6\161\1\140\33\0\6\162\1\163"+
  "\33\0\1\164\1\165\1\166\2\164\1\167\10\0\1\156"+
  "\15\0\1\170\5\0\5\171\1\172\1\173\7\0\1\156"+
  "\15\0\1\170\5\0\5\174\1\172\1\173\7\0\1\156"+
  "\15\0\1\170\5\0\1\171\3\174\1\175\1\172\1\173"+
  "\7\0\1\156\23\0\6\172\1\173\7\0\1\156\31\0"+
  "\1\131\3\0\1\120\1\121\1\122\25\0\5\176\5\0"+
  "\1\120\1\121\1\122\16\0\3\111\1\107\3\111\5\177"+
  "\1\111\1\0\1\111\1\123\1\111\1\120\1\121\1\122"+
  "\2\0\5\111\24\0\1\140\33\0\6\200\1\163\33\0"+
  "\6\201\1\202\25\0\1\170\5\0\5\203\1\204\1\205"+
  "\7\0\1\156\15\0\1\170\5\0\5\206\1\204\1\205"+
  "\7\0\1\156\15\0\1\170\5\0\1\203\3\206\1\207"+
  "\1\204\1\205\7\0\1\156\23\0\6\204\1\205\7\0"+
  "\1\156\23\0\1\210\1\211\1\212\2\210\27\0\1\170"+
  "\5\0\6\213\1\173\7\0\1\156\23\0\6\213\1\173"+
  "\7\0\1\156\23\0\1\164\1\165\1\166\2\164\1\167"+
  "\26\0\1\170\5\0\5\214\1\213\1\173\7\0\1\156"+
  "\15\0\1\170\5\0\1\213\4\214\1\213\1\173\7\0"+
  "\1\156\23\0\5\215\5\0\1\120\1\121\1\122\16\0"+
  "\3\111\1\107\3\111\5\216\1\111\1\0\1\111\1\123"+
  "\1\111\1\120\1\121\1\122\2\0\5\111\16\0\6\217"+
  "\1\163\33\0\6\220\1\221\33\0\1\222\1\223\1\224"+
  "\2\222\1\225\10\0\1\156\15\0\1\170\5\0\6\226"+
  "\1\205\7\0\1\156\23\0\6\226\1\205\7\0\1\156"+
  "\23\0\1\222\1\223\1\224\2\222\1\225\26\0\1\170"+
  "\5\0\5\227\1\226\1\205\7\0\1\156\15\0\1\170"+
  "\5\0\1\226\4\227\1\226\1\205\7\0\1\156\15\0"+
  "\1\230\5\0\5\231\27\0\1\230\5\0\5\210\27\0"+
  "\1\230\5\0\1\231\3\210\1\232\35\0\6\233\1\173"+
  "\7\0\1\156\15\0\1\170\5\0\6\233\1\173\7\0"+
  "\1\156\23\0\5\234\5\0\1\120\1\121\1\122\16\0"+
  "\3\111\1\107\11\111\1\0\1\111\1\123\1\111\1\120"+
  "\1\121\1\122\2\0\5\111\24\0\1\163\33\0\6\235"+
  "\1\221\33\0\6\236\1\237\25\0\1\170\5\0\5\240"+
  "\1\241\1\242\7\0\1\156\15\0\1\170\5\0\5\243"+
  "\1\241\1\242\7\0\1\156\15\0\1\170\5\0\1\240"+
  "\3\243\1\244\1\241\1\242\7\0\1\156\23\0\6\241"+
  "\1\242\7\0\1\156\23\0\6\245\1\205\7\0\1\156"+
  "\15\0\1\170\5\0\6\245\1\205\7\0\1\156\23\0"+
  "\1\246\1\247\1\250\2\246\27\0\1\230\41\0\1\230"+
  "\6\0\4\231\43\0\1\173\7\0\1\156\35\0\1\120"+
  "\1\121\1\122\25\0\6\251\1\221\33\0\6\252\1\253"+
  "\33\0\1\254\1\255\1\256\2\254\1\257\10\0\1\156"+
  "\15\0\1\170\5\0\6\260\1\242\7\0\1\156\23\0"+
  "\6\260\1\242\7\0\1\156\23\0\1\254\1\255\1\256"+
  "\2\254\1\257\26\0\1\170\5\0\5\261\1\260\1\242"+
  "\7\0\1\156\15\0\1\170\5\0\1\260\4\261\1\260"+
  "\1\242\7\0\1\156\31\0\1\205\7\0\1\156\15\0"+
  "\1\262\5\0\5\263\27\0\1\262\5\0\5\246\27\0"+
  "\1\262\5\0\1\263\3\246\1\264\43\0\1\221\33\0"+
  "\6\265\1\253\33\0\6\266\1\267\25\0\1\170\5\0"+
  "\5\270\1\271\1\272\7\0\1\156\15\0\1\170\5\0"+
  "\5\273\1\271\1\272\7\0\1\156\15\0\1\170\5\0"+
  "\1\270\3\273\1\274\1\271\1\272\7\0\1\156\23\0"+
  "\6\271\1\272\7\0\1\156\23\0\6\275\1\242\7\0"+
  "\1\156\15\0\1\170\5\0\6\275\1\242\7\0\1\156"+
  "\23\0\1\276\1\277\1\300\2\276\27\0\1\262\41\0"+
  "\1\262\6\0\4\263\35\0\6\301\1\253\33\0\6\302"+
  "\1\303\33\0\1\304\1\305\1\306\2\304\1\307\10\0"+
  "\1\156\15\0\1\170\5\0\6\310\1\272\7\0\1\156"+
  "\23\0\6\310\1\272\7\0\1\156\23\0\1\304\1\305"+
  "\1\306\2\304\1\307\26\0\1\170\5\0\5\311\1\310"+
  "\1\272\7\0\1\156\15\0\1\170\5\0\1\310\4\311"+
  "\1\310\1\272\7\0\1\156\31\0\1\242\7\0\1\156"+
  "\23\0\5\312\11\0\1\156\23\0\5\276\11\0\1\156"+
  "\23\0\1\312\3\276\1\313\11\0\1\156\31\0\1\253"+
  "\33\0\6\314\1\303\33\0\6\315\1\316\25\0\1\170"+
  "\5\0\5\317\1\320\1\321\7\0\1\156\15\0\1\170"+
  "\5\0\5\322\1\320\1\321\7\0\1\156\15\0\1\170"+
  "\5\0\1\317\3\322\1\323\1\320\1\321\7\0\1\156"+
  "\23\0\6\320\1\321\7\0\1\156\23\0\6\324\1\272"+
  "\7\0\1\156\15\0\1\170\5\0\6\324\1\272\7\0"+
  "\1\156\41\0\1\156\24\0\4\312\11\0\1\156\23\0"+
  "\6\325\1\303\33\0\6\326\1\327\33\0\1\330\1\331"+
  "\1\332\2\330\1\333\10\0\1\156\15\0\1\170\5\0"+
  "\6\334\1\321\7\0\1\156\23\0\6\334\1\321\7\0"+
  "\1\156\23\0\1\330\1\331\1\332\2\330\1\333\26\0"+
  "\1\170\5\0\5\335\1\334\1\321\7\0\1\156\15\0"+
  "\1\170\5\0\1\334\4\335\1\334\1\321\7\0\1\156"+
  "\31\0\1\272\7\0\1\156\31\0\1\303\33\0\6\336"+
  "\1\327\33\0\1\337\1\340\1\341\2\337\1\342\1\343"+
  "\25\0\1\170\5\0\5\344\1\345\1\346\7\0\1\156"+
  "\15\0\1\170\5\0\5\347\1\345\1\346\7\0\1\156"+
  "\15\0\1\170\5\0\1\344\3\347\1\350\1\345\1\346"+
  "\7\0\1\156\23\0\6\345\1\346\7\0\1\156\23\0"+
  "\6\351\1\321\7\0\1\156\15\0\1\170\5\0\6\351"+
  "\1\321\7\0\1\156\23\0\6\352\1\327\25\0\1\170"+
  "\5\0\5\353\1\354\1\355\25\0\1\170\5\0\5\356"+
  "\1\354\1\355\25\0\1\170\5\0\1\353\3\356\1\357"+
  "\1\354\1\355\33\0\6\354\1\355\33\0\6\360\10\0"+
  "\1\156\15\0\1\170\5\0\6\361\1\346\7\0\1\156"+
  "\23\0\6\361\1\346\7\0\1\156\23\0\6\360\26\0"+
  "\1\170\5\0\5\362\1\361\1\346\7\0\1\156\15\0"+
  "\1\170\5\0\1\361\4\362\1\361\1\346\7\0\1\156"+
  "\31\0\1\321\7\0\1\156\31\0\1\327\25\0\1\170"+
  "\5\0\6\363\1\355\33\0\6\363\1\355\33\0\6\360"+
  "\1\312\25\0\1\170\5\0\5\364\1\363\1\355\25\0"+
  "\1\170\5\0\1\363\4\364\1\363\1\355\33\0\6\365"+
  "\10\0\1\156\23\0\6\366\1\346\7\0\1\156\15\0"+
  "\1\170\5\0\6\366\1\346\7\0\1\156\23\0\6\367"+
  "\1\355\25\0\1\170\5\0\6\367\1\355\33\0\6\370"+
  "\10\0\1\156\31\0\1\346\7\0\1\156\31\0\1\355"+
  "\33\0\6\312\10\0\1\156\11\0";

private static int [] zzUnpackTrans() {
  int [] result = new int[8194];
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
private static final String ZZ_ERROR_MSG[] = {
  "Unkown internal scanner error",
  "Error: could not match input",
  "Error: pushback value was too large"
};

/**
 * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
 */
private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

private static final String ZZ_ATTRIBUTE_PACKED_0 =
  "\1\0\1\11\6\1\1\11\1\1\4\0\1\1\2\0"+
  "\1\1\1\11\1\0\1\1\4\0\6\1\2\0\1\1"+
  "\1\0\10\1\1\0\11\1\1\0\1\1\3\0\7\1"+
  "\1\0\1\1\4\0\1\1\3\0\1\1\3\0\3\1"+
  "\7\0\1\1\7\0\2\1\12\0\3\1\15\0\2\1"+
  "\15\0\2\1\15\0\1\1\134\0";

private static int [] zzUnpackAttribute() {
  int [] result = new int[248];
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
private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

/** the textposition at the last accepting state */
private int zzMarkedPos;

/** the current text position in the buffer */
private int zzCurrentPos;

/** startRead marks the beginning of the yytext() string in the buffer */
private int zzStartRead;

/** endRead marks the last character in the buffer, that has been read
    from input */
private int zzEndRead;

/** number of newlines encountered up to the start of the matched text */
private int yyline;

/** the number of characters up to the start of the matched text */
private int yychar;

/**
 * the number of characters from the last newline up to the start of the 
 * matched text
 */
private int yycolumn;

/** 
 * zzAtBOL == true <=> the scanner is currently at the beginning of a line
 */
private boolean zzAtBOL = true;

/** zzAtEOF == true <=> the scanner is at the EOF */
private boolean zzAtEOF;

/** denotes if the user-EOF-code has already been executed */
private boolean zzEOFDone;

/* user code: */

public static final int ALPHANUM = TweetTokenizer.ALPHANUM;
public static final int APOSTROPHE = TweetTokenizer.APOSTROPHE;
public static final int ACRONYM = TweetTokenizer.ACRONYM;
public static final int COMPANY = TweetTokenizer.COMPANY;
public static final int EMAIL = TweetTokenizer.EMAIL;
public static final int HOST = TweetTokenizer.HOST;
public static final int NUM = TweetTokenizer.NUM;
public static final int CJ = TweetTokenizer.CJ;
public static final int URL = TweetTokenizer.URL;
public static final int HASHTAG = TweetTokenizer.HASHTAG;
public static final int MENTION = TweetTokenizer.MENTION;
public static final int PERCENTAGE = TweetTokenizer.PERCENTAGE;
/**
* @deprecated this solves a bug where HOSTs that end with '.' are identified
* as ACRONYMs.
*/
public static final int ACRONYM_DEP = TweetTokenizer.ACRONYM_DEP;

public static final String [] TOKEN_TYPES = TweetTokenizer.TOKEN_TYPES;

public final int yychar()
{
return yychar;
}

/**
* Fills Lucene token with the current token text.
*/
final void getText(Token t) {
	t.copyBuffer(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
}

/**
* Fills TermAttribute with the current token text.
*/
final void getText(CharTermAttribute t) {
	t.copyBuffer(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
}



/**
 * Creates a new scanner
 * There is also a java.io.InputStream version of this constructor.
 *
 * @param   in  the java.io.Reader to read input from.
 */
TweetTokenizerImpl(java.io.Reader in) {
  this.zzReader = in;
}

/**
 * Creates a new scanner.
 * There is also java.io.Reader version of this constructor.
 *
 * @param   in  the java.io.Inputstream to read input from.
 */
TweetTokenizerImpl(java.io.InputStream in) {
  this(new java.io.InputStreamReader(in));
}

/** 
 * Unpacks the compressed character translation table.
 *
 * @param packed   the packed character translation table
 * @return         the unpacked character translation table
 */
private static char [] zzUnpackCMap(String packed) {
  char [] map = new char[0x10000];
  int i = 0;  /* index in packed string  */
  int j = 0;  /* index in unpacked array */
  while (i < 1304) {
    int  count = packed.charAt(i++);
    char value = packed.charAt(i++);
    do map[j++] = value; while (--count > 0);
  }
  return map;
}


/**
 * Refills the input buffer.
 *
 * @return      <code>false</code>, iff there was new input.
 * 
 * @exception   java.io.IOException  if any I/O-Error occurs
 */
private boolean zzRefill() throws java.io.IOException {

  /* first: make room (if you can) */
  if (zzStartRead > 0) {
    System.arraycopy(zzBuffer, zzStartRead,
                     zzBuffer, 0,
                     zzEndRead-zzStartRead);

    /* translate stored positions */
    zzEndRead-= zzStartRead;
    zzCurrentPos-= zzStartRead;
    zzMarkedPos-= zzStartRead;
    zzStartRead = 0;
  }

  /* is the buffer big enough? */
  if (zzCurrentPos >= zzBuffer.length) {
    /* if not: blow it up */
    char newBuffer[] = new char[zzCurrentPos*2];
    System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
    zzBuffer = newBuffer;
  }

  /* finally: fill the buffer with new input */
  int numRead = zzReader.read(zzBuffer, zzEndRead,
                                          zzBuffer.length-zzEndRead);

  if (numRead > 0) {
    zzEndRead+= numRead;
    return false;
  }
  // unlikely but not impossible: read 0 characters, but not at end of stream    
  if (numRead == 0) {
    int c = zzReader.read();
    if (c == -1) {
      return true;
    } else {
      zzBuffer[zzEndRead++] = (char) c;
      return false;
    }     
  }

	// numRead < 0
  return true;
}

  
/**
 * Closes the input stream.
 */
public final void yyclose() throws java.io.IOException {
  zzAtEOF = true;            /* indicate end of file */
  zzEndRead = zzStartRead;  /* invalidate buffer    */

  if (zzReader != null)
    zzReader.close();
}


/**
 * Resets the scanner to read from a new input stream.
 * Does not close the old reader.
 *
 * All internal variables are reset, the old input stream 
 * <b>cannot</b> be reused (internal buffer is discarded and lost).
 * Lexical state is set to <tt>ZZ_INITIAL</tt>.
 *
 * @param reader   the new input stream 
 */
public final void yyreset(java.io.Reader reader) {
  zzReader = reader;
  zzAtBOL  = true;
  zzAtEOF  = false;
  zzEOFDone = false;
  zzEndRead = zzStartRead = 0;
  zzCurrentPos = zzMarkedPos = 0;
  yyline = yychar = yycolumn = 0;
  zzLexicalState = YYINITIAL;
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
public final String yytext() {
  return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
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
  return zzBuffer[zzStartRead+pos];
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
public int getNextToken() throws java.io.IOException {
  int zzInput;
  int zzAction;

  // cached fields:
  int zzCurrentPosL;
  int zzMarkedPosL;
  int zzEndReadL = zzEndRead;
  char [] zzBufferL = zzBuffer;
  char [] zzCMapL = ZZ_CMAP;

  int [] zzTransL = ZZ_TRANS;
  int [] zzRowMapL = ZZ_ROWMAP;
  int [] zzAttrL = ZZ_ATTRIBUTE;

  while (true) {
    zzMarkedPosL = zzMarkedPos;

    yychar+= zzMarkedPosL-zzStartRead;

    zzAction = -1;

    zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

    zzState = ZZ_LEXSTATE[zzLexicalState];


    zzForAction: {
      while (true) {
  
        if (zzCurrentPosL < zzEndReadL)
          zzInput = zzBufferL[zzCurrentPosL++];
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
            zzInput = zzBufferL[zzCurrentPosL++];
          }
        }
        int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
        if (zzNext == -1) break zzForAction;
        zzState = zzNext;

        int zzAttributes = zzAttrL[zzState];
        if ( (zzAttributes & 1) == 1 ) {
          zzAction = zzState;
          zzMarkedPosL = zzCurrentPosL;
          if ( (zzAttributes & 8) == 8 ) break zzForAction;
        }

      }
    }

    // store back cached position
    zzMarkedPos = zzMarkedPosL;

    switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
      case 7: 
        { return HOST;
        }
      case 15: break;
      case 6: 
        { return HASHTAG;
        }
      case 16: break;
      case 12: 
        { return ACRONYM;
        }
      case 17: break;
      case 11: 
        { return ACRONYM_DEP;
        }
      case 18: break;
      case 14: 
        { return URL;
        }
      case 19: break;
      case 1: 
        { /* ignore */
        }
      case 20: break;
      case 5: 
        { return MENTION;
        }
      case 21: break;
      case 4: 
        { return PERCENTAGE;
        }
      case 22: break;
      case 8: 
        { return NUM;
        }
      case 23: break;
      case 3: 
        { return CJ;
        }
      case 24: break;
      case 2: 
        { return ALPHANUM;
        }
      case 25: break;
      case 10: 
        { return COMPANY;
        }
      case 26: break;
      case 9: 
        { return APOSTROPHE;
        }
      case 27: break;
      case 13: 
        { return EMAIL;
        }
      case 28: break;
      default: 
        if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
          zzAtEOF = true;
          return YYEOF;
        } 
        else {
          zzScanError(ZZ_NO_MATCH);
        }
    }
  }
}


}
