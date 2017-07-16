// This is a generated file. Not intended for manual editing.
package com.aedans.plugins.scheme.lang.psi.gen;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SchemeVariableDefinition extends PsiElement {

  @Nullable
  SchemeBody getBody();

  @Nullable
  SchemeExpression getExpression();

  @NotNull
  List<SchemeId> getIdList();

}
