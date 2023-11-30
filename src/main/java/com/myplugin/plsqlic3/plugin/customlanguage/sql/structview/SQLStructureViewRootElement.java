package com.myplugin.plsqlic3.plugin.customlanguage.sql.structview;

import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.NotNull;

public class SQLStructureViewRootElement extends SQLStructureViewElement {
	public SQLStructureViewRootElement(PsiFile element) {
		super(element);
	}

	@NotNull
	@Override
	public ItemPresentation getPresentation() {
		return new SQLRootPresentation((PsiFile)element);
	}
}
