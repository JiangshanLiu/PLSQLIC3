package com.myplugin.plsqlic3.plugin.customlanguage.sql.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

/** A reference object associated with (referring to) a IdentifierPSINode
 *  underneath a call_expr rule subtree root.
 */
public class SQLFunctionRef extends SQLElementRef {
	public SQLFunctionRef(@NotNull SQLIdentifierPSINode element) {
		super(element);
	}

	@Override
	public boolean isDefSubtree(PsiElement def) {
		return def instanceof SQLFunctionSubtree;
	}
}
