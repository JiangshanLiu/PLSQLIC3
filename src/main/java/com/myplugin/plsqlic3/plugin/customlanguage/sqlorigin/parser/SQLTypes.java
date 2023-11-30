// This is a generated file. Not intended for manual editing.
package com.myplugin.plsqlhelper.plugin.customlanguage.sqlorigin.parser;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.myplugin.plsqlhelper.plugin.customlanguage.sqlorigin.language.SQLElementType;
import com.myplugin.plsqlhelper.plugin.customlanguage.sqlorigin.language.SQLTokenType;
import com.myplugin.plsqlhelper.plugin.customlanguage.sqlorigin.psi.impl.SQLPropertyImpl;

public interface SQLTypes {

  IElementType PROPERTY = new SQLElementType("PROPERTY");

  IElementType COMMENT = new SQLTokenType("COMMENT");
  IElementType CRLF = new SQLTokenType("CRLF");
  IElementType KEY = new SQLTokenType("KEY");
  IElementType SEPARATOR = new SQLTokenType("SEPARATOR");
  IElementType VALUE = new SQLTokenType("VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == PROPERTY) {
        return new SQLPropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
