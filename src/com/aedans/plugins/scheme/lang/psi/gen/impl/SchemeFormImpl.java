// This is a generated file. Not intended for manual editing.
package com.aedans.plugins.scheme.lang.psi.gen.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.aedans.plugins.scheme.lang.lexer.SchemeTokenTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.aedans.plugins.scheme.lang.psi.gen.*;
import com.aedans.plugins.scheme.lang.psi.SchemePsiImplUtil;

public class SchemeFormImpl extends ASTWrapperPsiElement implements SchemeForm {

  public SchemeFormImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SchemeVisitor visitor) {
    visitor.visitForm(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SchemeVisitor) accept((SchemeVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SchemeDefinition getDefinition() {
    return findChildByClass(SchemeDefinition.class);
  }

  @Override
  @Nullable
  public SchemeExpression getExpression() {
    return findChildByClass(SchemeExpression.class);
  }

}
