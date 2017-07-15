// This is a generated file. Not intended for manual editing.
package com.ackdevelopment.plugins.scheme.lang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.ackdevelopment.plugins.scheme.lang.lexer.SchemeTokenTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.ackdevelopment.plugins.scheme.lang.psi.*;

public class SchemeSetExpressionImpl extends ASTWrapperPsiElement implements SchemeSetExpression {

  public SchemeSetExpressionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SchemeVisitor visitor) {
    visitor.visitSetExpression(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SchemeVisitor) accept((SchemeVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public SchemeExpression getExpression() {
    return findNotNullChildByClass(SchemeExpression.class);
  }

  @Override
  @NotNull
  public SchemeVariable getVariable() {
    return findNotNullChildByClass(SchemeVariable.class);
  }

}
