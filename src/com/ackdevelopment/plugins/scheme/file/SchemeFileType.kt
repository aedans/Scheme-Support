package com.ackdevelopment.plugins.scheme.file

import com.ackdevelopment.plugins.scheme.lang.SchemeLanguage
import com.intellij.openapi.fileTypes.LanguageFileType
import icons.SchemePluginIcons
import javax.swing.Icon

/**
 * Created by Aedan Smith.
 */

class SchemeFileType : LanguageFileType(SchemeLanguage.SCHEME_LANGUAGE) {
    override fun getName(): String {
        return "Scheme"
    }

    override fun getDescription(): String {
        return "The Scheme programming language"
    }

    override fun getDefaultExtension(): String {
        return ".scm"
    }

    override fun getIcon(): Icon? {
        return SchemePluginIcons.SCHEME_ICON
    }

    companion object {
        val SCHEME_FILE = SchemeFileType()
    }
}
