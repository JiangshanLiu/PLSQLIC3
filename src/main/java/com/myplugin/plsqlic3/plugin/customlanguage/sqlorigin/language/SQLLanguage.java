package com.myplugin.plsqlhelper.plugin.customlanguage.sqlorigin.language;

import com.intellij.lang.Language;

public class SQLLanguage extends Language {

    public static final SQLLanguage INSTANCE = new SQLLanguage();

    private SQLLanguage() {
        super("SQL");
    }
}
