package com.myplugin.plsqlic3.plugin.customlanguage.sql.psi;

import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.IElementType;
import org.antlr.intellij.adaptor.psi.IdentifierDefSubtree;
import org.jetbrains.annotations.NotNull;

public class SQLVardefSubtree extends IdentifierDefSubtree {

	public SQLVardefSubtree(@NotNull ASTNode node, @NotNull IElementType idElementTyp) {
		super(node, idElementTyp);
	}
}
