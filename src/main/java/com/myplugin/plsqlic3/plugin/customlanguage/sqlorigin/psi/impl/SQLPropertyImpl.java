// This is a generated file. Not intended for manual editing.
package com.myplugin.plsqlhelper.plugin.customlanguage.sqlorigin.psi.impl;

import com.myplugin.plsqlhelper.plugin.customlanguage.sqlorigin.psi.SQLProperty;
import com.myplugin.plsqlhelper.plugin.customlanguage.sqlorigin.psi.SQLVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;

public class SQLPropertyImpl extends ASTWrapperPsiElement implements SQLProperty {

  public SQLPropertyImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SQLVisitor visitor) {
    visitor.visitProperty(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SQLVisitor) accept((SQLVisitor)visitor);
    else super.accept(visitor);
  }

}
