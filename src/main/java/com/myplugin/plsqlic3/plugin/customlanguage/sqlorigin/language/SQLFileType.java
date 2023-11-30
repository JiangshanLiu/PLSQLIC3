package com.myplugin.plsqlhelper.plugin.customlanguage.sqlorigin.language;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class SQLFileType extends LanguageFileType {

    public static final SQLFileType INSTANCE = new SQLFileType();

    private SQLFileType() {
        super(SQLLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "SQL";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "SQL language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "sql";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return SQLIcons.FILE;
    }

}