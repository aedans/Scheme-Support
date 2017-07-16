// This is a generated file. Not intended for manual editing.
package com.aedans.plugins.scheme.lang.psi.gen;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SchemeExpression extends PsiElement {

  @Nullable
  SchemeAbbreviation getAbbreviation();

  @Nullable
  SchemeApplication getApplication();

  @Nullable
  SchemeBeginExpression getBeginExpression();

  @Nullable
  SchemeConstant getConstant();

  @Nullable
  SchemeId getId();

  @Nullable
  SchemeIfExpression getIfExpression();

  @Nullable
  SchemeLambdaExpression getLambdaExpression();

  @Nullable
  SchemeLetSyntaxExpression getLetSyntaxExpression();

  @Nullable
  SchemeLetrecSyntaxExpression getLetrecSyntaxExpression();

  @Nullable
  SchemeQuoteExpression getQuoteExpression();

  @Nullable
  SchemeSetExpression getSetExpression();

  @Nullable
  SchemeSyntaxRulesExpression getSyntaxRulesExpression();

}
