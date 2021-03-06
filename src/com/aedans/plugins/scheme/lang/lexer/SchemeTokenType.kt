package com.aedans.plugins.scheme.lang.lexer

import com.aedans.plugins.scheme.lang.SchemeLanguage
import com.intellij.psi.tree.IElementType

/**
 * Created by Aedan Smith.
 */

class SchemeTokenType(debugName: String) : IElementType(debugName, SchemeLanguage.SCHEME_LANGUAGE) {
    override fun toString(): String {
        return "SchemeTokenType." + super.toString()
    }
}
