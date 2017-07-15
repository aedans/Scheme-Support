package com.ackdevelopment.plugins.scheme.actions

import com.ackdevelopment.plugins.scheme.file.SchemeFileType
import com.intellij.CommonBundle
import com.intellij.ide.actions.CreateElementActionBase
import com.intellij.openapi.project.Project
import com.intellij.openapi.ui.Messages
import com.intellij.psi.PsiDirectory
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.PsiFileFactory

/**
 * Created by Aedan Smith.
 */

class NewSchemeFile : CreateElementActionBase("Create new Scheme file", "Create new Scheme file", null) {
    override fun invokeDialog(project: Project, directory: PsiDirectory): Array<PsiElement> {
        val validator = MyInputValidator(project, directory)
        Messages.showInputDialog(
                project,
                "Enter a new file name:",
                "New Scheme File",
                Messages.getQuestionIcon(),
                "",
                validator
        )
        return validator.createdElements
    }

    @Throws(Exception::class)
    override fun create(name: String, directory: PsiDirectory): Array<PsiElement> {
        val oFile = PsiFileFactory.getInstance(directory.project).createFileFromText(
                if (name.contains(".")) name else name + ".scm",
                SchemeFileType.SCHEME_FILE,
                ""
        )
        val file = directory.add(oFile) as PsiFile
        val child = file.lastChild
        return if (child != null) arrayOf(file, child) else arrayOf<PsiElement>(file)
    }

    override fun getErrorTitle(): String {
        return CommonBundle.getErrorTitle()
    }

    override fun getCommandName(): String {
        return "New Scheme File"
    }

    override fun getActionName(psiDirectory: PsiDirectory, s: String): String {
        return "New Scheme File"
    }
}
