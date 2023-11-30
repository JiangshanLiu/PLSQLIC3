package com.myplugin.plsqlhelper.plugin.customlanguage.sqlorigin.language;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;

public class SQLFile extends PsiFileBase {

    public SQLFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, SQLLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return SQLFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "SQL File";
    }

}