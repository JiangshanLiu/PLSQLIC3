package com.myplugin.plsqlhelper.plugin.customlanguage.sqlorigin.parser;

import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import com.myplugin.plsqlhelper.plugin.customlanguage.sqlorigin.language.SQLFile;
import com.myplugin.plsqlhelper.plugin.customlanguage.sqlorigin.language.SQLLanguage;
import org.jetbrains.annotations.NotNull;

public class SQLParserDefinition implements ParserDefinition {

    public static final IFileElementType FILE = new IFileElementType(SQLLanguage.INSTANCE);

    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        return new SQLLexerAdapter();
    }

    @NotNull
    @Override
    public TokenSet getCommentTokens() {
        return SQLTokenSets.COMMENTS;
    }

    @NotNull
    @Override
    public TokenSet getStringLiteralElements() {
        return TokenSet.EMPTY;
    }

    @NotNull
    @Override
    public PsiParser createParser(final Project project) {
        return new SQLParser();
    }

    @NotNull
    @Override
    public IFileElementType getFileNodeType() {
        return FILE;
    }

    @NotNull
    @Override
    public PsiFile createFile(@NotNull FileViewProvider viewProvider) {
        return new SQLFile(viewProvider);
    }

    @NotNull
    @Override
    public PsiElement createElement(ASTNode node) {
        return SQLTypes.Factory.createElement(node);
    }

}