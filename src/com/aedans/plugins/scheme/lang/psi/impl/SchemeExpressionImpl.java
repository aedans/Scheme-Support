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

public class SchemeExpressionImpl extends ASTWrapperPsiElement implements SchemeExpression {

  public SchemeExpressionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SchemeVisitor visitor) {
    visitor.visitExpression(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SchemeVisitor) accept((SchemeVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SchemeAbbreviation getAbbreviation() {
    return findChildByClass(SchemeAbbreviation.class);
  }

  @Override
  @Nullable
  public SchemeApplication getApplication() {
    return findChildByClass(SchemeApplication.class);
  }

  @Override
  @Nullable
  public SchemeBeginExpression getBeginExpression() {
    return findChildByClass(SchemeBeginExpression.class);
  }

  @Override
  @Nullable
  public SchemeConstant getConstant() {
    return findChildByClass(SchemeConstant.class);
  }

  @Override
  @Nullable
  public SchemeIfExpression getIfExpression() {
    return findChildByClass(SchemeIfExpression.class);
  }

  @Override
  @Nullable
  public SchemeLambdaExpression getLambdaExpression() {
    return findChildByClass(SchemeLambdaExpression.class);
  }

  @Override
  @Nullable
  public SchemeLetSyntaxExpression getLetSyntaxExpression() {
    return findChildByClass(SchemeLetSyntaxExpression.class);
  }

  @Override
  @Nullable
  public SchemeLetrecSyntaxExpression getLetrecSyntaxExpression() {
    return findChildByClass(SchemeLetrecSyntaxExpression.class);
  }

  @Override
  @Nullable
  public SchemeQuoteExpression getQuoteExpression() {
    return findChildByClass(SchemeQuoteExpression.class);
  }

  @Override
  @Nullable
  public SchemeSetExpression getSetExpression() {
    return findChildByClass(SchemeSetExpression.class);
  }

  @Override
  @Nullable
  public SchemeVariable getVariable() {
    return findChildByClass(SchemeVariable.class);
  }

}
