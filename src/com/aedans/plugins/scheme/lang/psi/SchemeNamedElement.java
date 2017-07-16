package com.aedans.plugins.scheme.lang.psi;

import com.aedans.plugins.scheme.lang.SchemeLanguage;
import com.aedans.plugins.scheme.lang.psi.gen.SchemeId;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiFileFactory;
import com.intellij.psi.PsiNameIdentifierOwner;
import com.intellij.util.IncorrectOperationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Created by Aedan Smith.
 */

public abstract class SchemeNamedElement extends ASTWrapperPsiElement implements PsiNameIdentifierOwner {
    private String myCachedName;

    public SchemeNamedElement(@NotNull ASTNode node) {
        super(node);
    }

    @Override
    public void subtreeChanged() {
        super.subtreeChanged();
        myCachedName = null;
    }

    @Override
    public String getName() {
        if (myCachedName == null) {
            myCachedName = this.getText();
        }
        return myCachedName;
    }

    @Override
    public PsiElement setName(@NotNull String s) throws IncorrectOperationException {
        getId().replace(createLeafFromText(getProject(), s));
        return this;
    }

    private static PsiFile createFile(Project project, String text) {
        return PsiFileFactory.getInstance(project).createFileFromText(SchemeLanguage.SCHEME_LANGUAGE, text);
    }

    private static PsiElement createLeafFromText(Project project, String text) {
        return createFile(project, text).getFirstChild().getLastChild();
    }

    @Nullable
    @Override
    public PsiElement getNameIdentifier() {
        return getId();
    }

    @NotNull
    public abstract SchemeId getId();
}
