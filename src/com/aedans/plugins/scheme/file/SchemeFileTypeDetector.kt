package com.aedans.plugins.scheme.file

import com.intellij.openapi.fileTypes.FileType
import com.intellij.openapi.fileTypes.FileTypeRegistry
import com.intellij.openapi.util.io.ByteSequence
import com.intellij.openapi.vfs.VirtualFile

/**
 * Created by Aedan Smith.
 */

class SchemeFileTypeDetector : FileTypeRegistry.FileTypeDetector {
    override fun detect(file: VirtualFile, bytes: ByteSequence, chars: CharSequence?): FileType? {
        return if (file.extension == "scm"
                || file.extension == "sls"
                || file.extension == "ss")
            SchemeFileType.SCHEME_FILE
        else
            null
    }

    override fun getVersion(): Int {
        return 1
    }
}
