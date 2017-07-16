package com.aedans.plugins.scheme.lang.lexer

import com.aedans.plugins.scheme.lang.SchemeLanguage
import com.intellij.psi.tree.IElementType

/**
 * Created by Aedan Smith.
 */

class SchemeElementType(debugName: String) : IElementType(debugName, SchemeLanguage.SCHEME_LANGUAGE)
