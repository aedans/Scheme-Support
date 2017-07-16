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

public class SchemeDefinitionImpl extends ASTWrapperPsiElement implements SchemeDefinition {

  public SchemeDefinitionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SchemeVisitor visitor) {
    visitor.visitDefinition(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SchemeVisitor) accept((SchemeVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SchemeBeginDefinition getBeginDefinition() {
    return findChildByClass(SchemeBeginDefinition.class);
  }

  @Override
  @Nullable
  public SchemeLetDefinition getLetDefinition() {
    return findChildByClass(SchemeLetDefinition.class);
  }

  @Override
  @Nullable
  public SchemeLetrecDefinition getLetrecDefinition() {
    return findChildByClass(SchemeLetrecDefinition.class);
  }

  @Override
  @Nullable
  public SchemeSyntaxDefinition getSyntaxDefinition() {
    return findChildByClass(SchemeSyntaxDefinition.class);
  }

  @Override
  @Nullable
  public SchemeVariableDefinition getVariableDefinition() {
    return findChildByClass(SchemeVariableDefinition.class);
  }

}
