package com.myplugin.plsqlic3.plugin.customlanguage.sql;

import com.intellij.lang.Language;

public class SQLLanguage extends Language {
    public static final SQLLanguage INSTANCE = new SQLLanguage();

    private SQLLanguage() {
        super("SQL");
    }
}
