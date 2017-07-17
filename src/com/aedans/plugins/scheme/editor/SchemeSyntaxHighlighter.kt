package com.aedans.plugins.scheme.editor

import com.aedans.plugins.scheme.lang.lexer.SchemeLexerAdapter
import com.aedans.plugins.scheme.lang.lexer.SchemeTokenTypes
import com.aedans.plugins.scheme.lang.parser.SchemeTokens
import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.HighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType

/**
 * Created by Aedan Smith.
 */

class SchemeSyntaxHighlighter : SyntaxHighlighterBase() {
    override fun getHighlightingLexer(): Lexer {
        return SchemeLexerAdapter()
    }

    override fun getTokenHighlights(tokenType: IElementType): Array<TextAttributesKey> {
        return when (tokenType) {
            SchemeTokens.COMMENT -> COMMENT_KEY
            SchemeTokenTypes.BEGIN,
            SchemeTokenTypes.DEFINE,
            SchemeTokenTypes.DEFINE_SYNTAX,
            SchemeTokenTypes.LET_SYNTAX,
            SchemeTokenTypes.LETREC_SYNTAX,
            SchemeTokenTypes.SYNTAX_RULES,
            SchemeTokenTypes.QUOTE,
            SchemeTokenTypes.LAMBDA,
            SchemeTokenTypes.IF,
            SchemeTokenTypes.SET -> KEYWORD_KEY
            SchemeTokenTypes.BOOLEAN -> BOOLEAN_KEY
            SchemeTokenTypes.IDENTIFIER -> IDENTIFIER_KEY
            SchemeTokenTypes.OPEN_PAREN,
            SchemeTokenTypes.CLOSE_PAREN -> PAREN_KEY
            SchemeTokenTypes.OPEN_BRACE,
            SchemeTokenTypes.CLOSE_BRACE -> BRACE_KEY
            SchemeTokenTypes.OPEN_BRACKET,
            SchemeTokenTypes.CLOSE_BRACKET -> BRACKET_KEY
            SchemeTokenTypes.CHARACTER -> CHARACTER_KEY
            SchemeTokenTypes.STRING -> STRING_KEY
            SchemeTokenTypes.NUMBER -> NUMBER_KEY
            TokenType.BAD_CHARACTER -> BAD_CHAR_KEY
            else -> null
        }?.let { arrayOf(it) } ?: emptyArray()
    }

    companion object {
        val COMMENT_KEY = createTextAttributesKey("SCHEME_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT)
        val KEYWORD_KEY = createTextAttributesKey("SCHEME_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD)
        val BOOLEAN_KEY = createTextAttributesKey("SCHEME_BOOLEAN", DefaultLanguageHighlighterColors.KEYWORD)
        val IDENTIFIER_KEY = createTextAttributesKey("SCHEME_IDENTIFIER", DefaultLanguageHighlighterColors.IDENTIFIER)
        val PAREN_KEY = createTextAttributesKey("SCHEME_PAREN", DefaultLanguageHighlighterColors.PARENTHESES)
        val BRACE_KEY = createTextAttributesKey("SCHEME_BRACE", DefaultLanguageHighlighterColors.BRACES)
        val BRACKET_KEY = createTextAttributesKey("SCHEME_BRACKET", DefaultLanguageHighlighterColors.BRACKETS)
        val CHARACTER_KEY = createTextAttributesKey("SCHEME_CHARACTER", DefaultLanguageHighlighterColors.STRING)
        val STRING_KEY = createTextAttributesKey("SCHEME_STRING", DefaultLanguageHighlighterColors.STRING)
        val NUMBER_KEY = createTextAttributesKey("SCHEME_NUMBER", DefaultLanguageHighlighterColors.NUMBER)
        val BAD_CHAR_KEY = createTextAttributesKey("SCHEME_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER)

        private fun createTextAttributesKey(s: String, k: TextAttributesKey?): TextAttributesKey {
            return TextAttributesKey.createTextAttributesKey(s, k)
        }
    }
}
