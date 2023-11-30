package com.myplugin.plsqlhelper.plugin.customlanguage.sqlorigin.language;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class SQLTokenType extends IElementType {

    public SQLTokenType(@NotNull @NonNls String debugName) {
        super(debugName, SQLLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "SQLTokenType." + super.toString();
    }

}