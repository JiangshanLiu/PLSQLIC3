package com.myplugin.plsqlic3.plugin.customlanguage.sql.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiNamedElement;
import com.myplugin.plsqlic3.plugin.customlanguage.sql.Icons;
import com.myplugin.plsqlic3.plugin.customlanguage.sql.SQLFileType;
import com.myplugin.plsqlic3.plugin.customlanguage.sql.SQLLanguage;
import org.antlr.intellij.adaptor.SymtabUtils;
import org.antlr.intellij.adaptor.psi.ScopeNode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

//public class SQLPSIFile extends PsiFileBase implements ScopeNode {
public class SQLPSIFile extends PsiFileBase {
    public SQLPSIFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, SQLLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return SQLFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "SQL Language file";
    }

    @Override
    public Icon getIcon(int flags) {
        return Icons.SAMPLE_ICON;
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof SQLPsiElementVisitor) {
            visitor.visitFile(this);
        } else {
            super.accept(visitor);
        }
    }

	/** Return null since a file scope has no enclosing scope. It is
	 *  not itself in a scope.
	 */
	@Override
	public ScopeNode getContext() {
		return null;
	}
}
