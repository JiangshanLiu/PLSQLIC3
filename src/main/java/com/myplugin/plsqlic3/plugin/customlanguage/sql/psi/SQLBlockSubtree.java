package com.myplugin.plsqlic3.plugin.customlanguage.sql.psi;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNamedElement;
import com.myplugin.plsqlic3.plugin.customlanguage.sql.SQLLanguage;
import org.antlr.intellij.adaptor.SymtabUtils;
import org.antlr.intellij.adaptor.psi.ANTLRPsiNode;
import org.antlr.intellij.adaptor.psi.ScopeNode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class SQLBlockSubtree extends ANTLRPsiNode implements ScopeNode {
	public SQLBlockSubtree(@NotNull ASTNode node) {
		super(node);
	}

	@Nullable
	@Override
	public PsiElement resolve(PsiNamedElement element) {
//		System.out.println(getClass().getSimpleName()+
//		                   ".resolve("+element.getName()+
//		                   " at "+Integer.toHexString(element.hashCode())+")");

		return SymtabUtils.resolve(this, SQLLanguage.INSTANCE,
		                           element, "/root/stmtblock/stmtmulti/stmt/createfunctionstmt/createfunc_opt_list/createfunc_opt_item/func_as/plsqlroot/pl_function/pl_block/decl_sect/decl_stmts/decl_stmt/decl_statement/decl_varname/any_identifier/colid/identifier/Identifier");
	}
}
