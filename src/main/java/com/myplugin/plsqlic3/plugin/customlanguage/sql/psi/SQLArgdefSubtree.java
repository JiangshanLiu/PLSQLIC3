package com.myplugin.plsqlic3.plugin.customlanguage.sql.psi;

import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

public class SQLArgdefSubtree extends SQLVardefSubtree {
	public SQLArgdefSubtree(@NotNull ASTNode node, @NotNull IElementType idElementType) {
		super(node, idElementType);
	}
}
