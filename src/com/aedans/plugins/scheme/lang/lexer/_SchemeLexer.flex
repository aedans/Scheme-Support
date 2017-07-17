package com.aedans.plugins.scheme.lang.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.TokenType;
import com.aedans.plugins.scheme.lang.lexer.SchemeTokenTypes;
import com.aedans.plugins.scheme.lang.parser.SchemeTokens;

%%

%class _SchemeLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType

OPEN_PAREN="("|"["
CLOSE_PAREN=")"|"]"
APOSTROPHE="'"
BACKQUOTE="`"
COMMA=","
COMMA_AT=",@"
DOT="."
POUND="#"

BEGIN="begin"
DEFINE="define"
DEFINE_SYNTAX="define-syntax"
LET_SYNTAX="let-syntax"
LETREC_SYNTAX="letrec-syntax"
SYNTAX_RULES="syntax-rules"
QUOTE="quote"
LAMBDA="lambda"
IF="if"
SET="set!"

WHITE_SPACE=[\ \n\r\t\f]+
COMMENT=";"[^\r\n]*
BLOCK_COMMENT="#|"[^\#]+"|#"?

BOOLEAN="#t"|"#f"
CHARACTER="#\\" ({CHARACTER_NAME}|"x"{DIGIT}+|.)

CHARACTER_NAME="alarm"
              |"backspace"
              |"delete"
              |"esc"
              |"linefeed"
              |"newline"
              |"page"
              |"return"
              |"space"
              |"tab"
              |"vtab"

STRING=\"{STRING_CHARACTER}*\"?
STRING_CHARACTER="\\".|[^\"\\]

IDENTIFIER={IDENTIFIER_INITIAL}{IDENTIFIER_SUBSEQUENT}*|"+"|"-"|"..."|{IDENTIFIER_LITERAL}
IDENTIFIER_LITERAL="|"{IDENTIFIER_LITERAL_CHARACTER}*"|"
IDENTIFIER_LITERAL_CHARACTER="\\".|[^\|]
IDENTIFIER_SUBSEQUENT={IDENTIFIER_INITIAL}|{DIGIT}|"."|"+"|"-"
IDENTIFIER_INITIAL={LETTER}|"!"|"$"|"%"|"&"|"*"|"/"|":"|"<"|"="|">"|"?"|"@"|"^"|"_"|"~"|"#"[^\t\f\\\|]
DIGIT=[0-9]
LETTER=[a-zA-Z]

NUMBER={PREFIX}{COMPLEX}
COMPLEX={REAL}
    |{REAL}"@"{REAL}
    |{REAL}"+"{IMAG}
    |{REAL}"-"{IMAG}
    |"+"{IMAG}
    |"-"{IMAG}
IMAG="i"|{UREAL}"i"
REAL={SIGN}{UREAL}
UREAL={UINTEGER}
    |{UINTEGER}\/{UINTEGER}
    |{DECIMAL}
UINTEGER={DIGIT}+"#"*
PREFIX={RADIX}{EXACTNESS}
    |{EXACTNESS}{RADIX}
DECIMAL={UINTEGER}{EXPONENT}
    |{DOT}{DIGIT}+"#"*{SUFFIX}
    |{DIGIT}+{DOT}{DIGIT}*"#"*{SUFFIX}
    |{DIGIT}+"#"+{DOT}"#"*{SUFFIX}
SUFFIX={EXPONENT}?
EXPONENT={EXPONENT_MARKER}{SIGN}{DIGIT}+
EXPONENT_MARKER=("e"|"s"|"f"|"d"|"l")?
SIGN=("+"|"-")?
EXACTNESS=("#i"|"#e")?
RADIX=("#b"|"#o"|"#x")?
DIGIT=[0-9a-f]

%%

{OPEN_PAREN} { return SchemeTokenTypes.OPEN_PAREN; }
{CLOSE_PAREN} { return SchemeTokenTypes.CLOSE_PAREN; }
{APOSTROPHE} { return SchemeTokenTypes.APOSTROPHE; }
{BACKQUOTE} { return SchemeTokenTypes.BACKQUOTE; }
{COMMA} { return SchemeTokenTypes.COMMA; }
{COMMA_AT} { return SchemeTokenTypes.COMMA_AT; }
{DOT} { return SchemeTokenTypes.DOT; }
{POUND} { return SchemeTokenTypes.POUND; }

{BEGIN} { return SchemeTokenTypes.BEGIN; }
{DEFINE} { return SchemeTokenTypes.DEFINE; }
{DEFINE_SYNTAX} { return SchemeTokenTypes.DEFINE_SYNTAX; }
{LET_SYNTAX} { return SchemeTokenTypes.LET_SYNTAX; }
{LETREC_SYNTAX} { return SchemeTokenTypes.LETREC_SYNTAX; }
{SYNTAX_RULES} { return SchemeTokenTypes.SYNTAX_RULES; }
{QUOTE} { return SchemeTokenTypes.QUOTE; }
{LAMBDA} { return SchemeTokenTypes.LAMBDA; }
{IF} { return SchemeTokenTypes.IF; }
{SET} { return SchemeTokenTypes.SET; }

{WHITE_SPACE} { return TokenType.WHITE_SPACE; }
{COMMENT} { return SchemeTokens.COMMENT; }
{BLOCK_COMMENT} { return SchemeTokens.COMMENT; }

{BOOLEAN} { return SchemeTokenTypes.BOOLEAN; }
{CHARACTER} { return SchemeTokenTypes.CHARACTER; }
{STRING} { return SchemeTokenTypes.STRING; }
{IDENTIFIER} { return SchemeTokenTypes.IDENTIFIER; }
{NUMBER} { return SchemeTokenTypes.NUMBER; }

[^] { return TokenType.BAD_CHARACTER; }
