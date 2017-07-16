package com.aedans.plugins.scheme.lang.parser

import com.aedans.plugins.scheme.file.SchemeFile
import com.aedans.plugins.scheme.lang.SchemeLanguage
import com.aedans.plugins.scheme.lang.lexer.SchemeLexerAdapter
import com.aedans.plugins.scheme.lang.lexer.SchemeTokenTypes
import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet

/**
 * Created by Aedan Smith.
 */

class SchemeParserDefinition : ParserDefinition {
    override fun createLexer(project: Project): Lexer {
        return SchemeLexerAdapter()
    }

    override fun createParser(project: Project): PsiParser {
        return SchemeParser()
    }

    override fun getFileNodeType(): IFileElementType {
        return SCHEME_FILE
    }

    override fun getWhitespaceTokens(): TokenSet {
        return WHITE_SPACES
    }

    override fun getCommentTokens(): TokenSet {
        return COMMENTS
    }

    override fun getStringLiteralElements(): TokenSet {
        return STRING_LITERALS
    }

    override fun createElement(astNode: ASTNode): PsiElement {
        return SchemeTokenTypes.Factory.createElement(astNode)
    }

    override fun createFile(fileViewProvider: FileViewProvider): PsiFile {
        return SchemeFile(fileViewProvider)
    }

    override fun spaceExistanceTypeBetweenTokens(
            astNode: ASTNode,
            astNode1: ASTNode
    ): ParserDefinition.SpaceRequirements {
        return ParserDefinition.SpaceRequirements.MAY
    }

    companion object {
        val WHITE_SPACES = TokenSet.create(TokenType.WHITE_SPACE)
        val COMMENTS = TokenSet.create(SchemeTokens.COMMENT)
        val STRING_LITERALS = TokenSet.create(SchemeTokenTypes.STRING)
        val SCHEME_FILE = IFileElementType(SchemeLanguage.SCHEME_LANGUAGE)
    }
}
