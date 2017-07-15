package com.ackdevelopment.plugins.scheme.editor

import com.ackdevelopment.plugins.scheme.lang.lexer.SchemeLexerAdapter
import com.ackdevelopment.plugins.scheme.lang.lexer.SchemeTokenTypes
import com.ackdevelopment.plugins.scheme.lang.parser.SchemeTokens
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
            SchemeTokens.COMMENT -> COMMENT_KEYS
            SchemeTokenTypes.BEGIN,
            SchemeTokenTypes.DEFINE,
            SchemeTokenTypes.DEFINE_SYNTAX,
            SchemeTokenTypes.LET_SYNTAX,
            SchemeTokenTypes.LETREC_SYNTAX,
            SchemeTokenTypes.QUOTE,
            SchemeTokenTypes.LAMBDA,
            SchemeTokenTypes.IF,
            SchemeTokenTypes.SET,
            SchemeTokenTypes.BOOLEAN -> KEYWORD_KEYS
            SchemeTokenTypes.IDENTIFIER -> IDENTIFIER_KEYS
            SchemeTokenTypes.OPEN_PAREN -> OPEN_PAREN_KEYS
            SchemeTokenTypes.CLOSE_PAREN -> CLOSE_PAREN_KEYS
            SchemeTokenTypes.CHARACTER -> CHARACTER_KEYS
            SchemeTokenTypes.STRING -> STRING_KEYS
            SchemeTokenTypes.NUMBER -> NUMBER_KEYS
            TokenType.BAD_CHARACTER -> BAD_CHAR_KEYS
            else -> EMPTY_KEYS
        }
    }

    companion object {
        private val COMMENT_KEYS = arrayOf(TextAttributesKey.createTextAttributesKey(
                "SCHEME_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT
        ))
        private val KEYWORD_KEYS = arrayOf(TextAttributesKey.createTextAttributesKey(
                "SCHEME_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD
        ))
        private val IDENTIFIER_KEYS = arrayOf(TextAttributesKey.createTextAttributesKey(
                "SCHEME_IDENTIFIER", DefaultLanguageHighlighterColors.IDENTIFIER
        ))
        private val OPEN_PAREN_KEYS = arrayOf(TextAttributesKey.createTextAttributesKey(
                "SCHEME_OPEN_PAREN", DefaultLanguageHighlighterColors.PARENTHESES
        ))
        private val CLOSE_PAREN_KEYS = arrayOf(TextAttributesKey.createTextAttributesKey(
                "SCHEME_CLOSE_PAREN", DefaultLanguageHighlighterColors.PARENTHESES
        ))
        private val CHARACTER_KEYS = arrayOf(TextAttributesKey.createTextAttributesKey(
                "SCHEME_CHARACTER", DefaultLanguageHighlighterColors.STRING
        ))
        private val STRING_KEYS = arrayOf(TextAttributesKey.createTextAttributesKey(
                "SCHEME_STRING", DefaultLanguageHighlighterColors.STRING
        ))
        private val NUMBER_KEYS = arrayOf(TextAttributesKey.createTextAttributesKey(
                "SCHEME_NUMBER", DefaultLanguageHighlighterColors.NUMBER
        ))
        private val BAD_CHAR_KEYS = arrayOf(TextAttributesKey.createTextAttributesKey(
                "SCHEME_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER
        ))
        private val EMPTY_KEYS = arrayOf<TextAttributesKey>()
    }
}
