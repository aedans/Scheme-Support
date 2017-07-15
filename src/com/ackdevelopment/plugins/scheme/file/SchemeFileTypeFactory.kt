package com.ackdevelopment.plugins.scheme.file

import com.intellij.openapi.fileTypes.FileTypeConsumer
import com.intellij.openapi.fileTypes.FileTypeFactory

/**
 * Created by Aedan Smith.
 */

class SchemeFileTypeFactory : FileTypeFactory() {
    override fun createFileTypes(fileTypeConsumer: FileTypeConsumer) {
        fileTypeConsumer.consume(SchemeFileType.SCHEME_FILE, "scm")
        fileTypeConsumer.consume(SchemeFileType.SCHEME_FILE, "sls")
        fileTypeConsumer.consume(SchemeFileType.SCHEME_FILE, "ss")
    }
}
