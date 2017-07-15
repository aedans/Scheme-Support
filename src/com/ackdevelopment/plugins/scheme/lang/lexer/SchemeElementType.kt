package com.ackdevelopment.plugins.scheme.lang.lexer

import com.ackdevelopment.plugins.scheme.lang.SchemeLanguage
import com.intellij.psi.tree.IElementType

/**
 * Created by Aedan Smith.
 */

class SchemeElementType(debugName: String) : IElementType(debugName, SchemeLanguage.SCHEME_LANGUAGE)
