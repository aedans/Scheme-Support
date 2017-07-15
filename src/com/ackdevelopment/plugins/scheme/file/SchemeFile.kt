package com.ackdevelopment.plugins.scheme.file

import com.ackdevelopment.plugins.scheme.lang.SchemeLanguage
import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider

/**
 * Created by Aedan Smith.
 */

class SchemeFile(fileViewProvider: FileViewProvider) : PsiFileBase(fileViewProvider, SchemeLanguage.SCHEME_LANGUAGE) {
    override fun getFileType(): FileType {
        return SchemeFileType.SCHEME_FILE
    }
}
