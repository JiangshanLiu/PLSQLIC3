package com.myplugin.plsqlhelper.plugin.customlanguage.sqlorigin.parser;

import com.intellij.lexer.FlexAdapter;

public class SQLLexerAdapter extends FlexAdapter {

    public SQLLexerAdapter() {
        super(new SQLLexer(null));
    }

}