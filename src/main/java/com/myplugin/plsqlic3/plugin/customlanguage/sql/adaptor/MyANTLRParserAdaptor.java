package com.myplugin.plsqlic3.plugin.customlanguage.sql.adaptor;

import com.intellij.lang.Language;
import com.intellij.lang.PsiBuilder;
import com.intellij.psi.tree.IElementType;
import org.antlr.intellij.adaptor.parser.ANTLRParseTreeToPSIConverter;
import org.antlr.intellij.adaptor.parser.ANTLRParserAdaptor;
import org.antlr.v4.runtime.Parser;

public abstract class MyANTLRParserAdaptor extends ANTLRParserAdaptor {
    /**
     * Create a jetbrains adaptor for an ANTLR parser object. When
     * the IDE requests a {@link #parse(IElementType, PsiBuilder)},
     * the token stream will be set on the parser.
     *
     * @param language
     * @param parser
     */
    public MyANTLRParserAdaptor(Language language, Parser parser) {
        super(language, parser);
    }

    @Override
    protected ANTLRParseTreeToPSIConverter createListener(Parser parser, IElementType root, PsiBuilder builder) {
        return new MyANTLRParseTreeToPSIConverter(language, parser, builder);
    }
}
