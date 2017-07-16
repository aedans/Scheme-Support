// This is a generated file. Not intended for manual editing.
package com.aedans.plugins.scheme.lang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.aedans.plugins.scheme.lang.lexer.SchemeTokenTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.aedans.plugins.scheme.lang.psi.*;

public class SchemeLetSyntaxExpressionImpl extends ASTWrapperPsiElement implements SchemeLetSyntaxExpression {

  public SchemeLetSyntaxExpressionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SchemeVisitor visitor) {
    visitor.visitLetSyntaxExpression(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SchemeVisitor) accept((SchemeVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<SchemeExpression> getExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SchemeExpression.class);
  }

  @Override
  @NotNull
  public List<SchemeSyntaxBinding> getSyntaxBindingList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SchemeSyntaxBinding.class);
  }

}
