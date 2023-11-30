package com.myplugin.plsqlic3.plugin.customlanguage.sql.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

public class SQLVariableRef extends SQLElementRef {
	public SQLVariableRef(@NotNull SQLIdentifierPSINode element) {
		super(element);
	}

	@Override
	public boolean isDefSubtree(PsiElement def) {
		return def instanceof SQLVardefSubtree;
	}
}
