// This is a generated file. Not intended for manual editing.
package com.aedans.plugins.scheme.lang.psi.gen;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SchemeLetDefinition extends PsiElement {

  @NotNull
  List<SchemeDefinition> getDefinitionList();

  @NotNull
  List<SchemeSyntaxBinding> getSyntaxBindingList();

}