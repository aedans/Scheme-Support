// This is a generated file. Not intended for manual editing.
package com.aedans.plugins.scheme.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SchemeDefinition extends PsiElement {

  @Nullable
  SchemeBeginDefinition getBeginDefinition();

  @Nullable
  SchemeLetDefinition getLetDefinition();

  @Nullable
  SchemeLetrecDefinition getLetrecDefinition();

  @Nullable
  SchemeSyntaxDefinition getSyntaxDefinition();

  @Nullable
  SchemeVariableDefinition getVariableDefinition();

}
