package com.myplugin.plsqlhelper.plugin.customlanguage.sample;

import com.intellij.lang.Language;

public class SampleLanguage extends Language {
    public static final SampleLanguage INSTANCE = new SampleLanguage();

    private SampleLanguage() {
        super("Sample");
    }
}
