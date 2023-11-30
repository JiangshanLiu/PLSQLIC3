package com.myplugin.plsqlhelper.plugin.customlanguage.sqlorigin.language;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class SQLElementType extends IElementType {

    public SQLElementType(@NotNull @NonNls String debugName) {
        super(debugName, SQLLanguage.INSTANCE);
    }
}