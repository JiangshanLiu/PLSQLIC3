package com.myplugin.plsqlic3.plugin.customlanguage.sql.structview;

import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiFile;
import com.myplugin.plsqlic3.plugin.customlanguage.sql.Icons;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class SQLRootPresentation implements ItemPresentation {
	protected final PsiFile element;

	protected SQLRootPresentation(PsiFile element) {
		this.element = element;
	}

	@Nullable
	@Override
	public Icon getIcon(boolean unused) {
		return Icons.SAMPLE_ICON;
	}

	@Nullable
	@Override
	public String getPresentableText() {
		return element.getVirtualFile().getNameWithoutExtension();
	}

	@Nullable
	@Override
	public String getLocationString() {
		return null;
	}
}
