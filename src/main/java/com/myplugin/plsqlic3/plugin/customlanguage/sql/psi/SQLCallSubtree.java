package com.myplugin.plsqlic3.plugin.customlanguage.sql.psi;

import com.intellij.lang.ASTNode;
import org.antlr.intellij.adaptor.psi.ANTLRPsiNode;
import org.jetbrains.annotations.NotNull;

public class SQLCallSubtree extends ANTLRPsiNode {
	public SQLCallSubtree(@NotNull ASTNode node) {
		super(node);
	}
}
