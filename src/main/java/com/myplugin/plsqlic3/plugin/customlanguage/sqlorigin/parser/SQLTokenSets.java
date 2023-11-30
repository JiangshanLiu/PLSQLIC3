package com.myplugin.plsqlhelper.plugin.customlanguage.sqlorigin.parser;

import com.intellij.psi.tree.TokenSet;

public interface SQLTokenSets {
    TokenSet IDENTIFIERS = TokenSet.create(SQLTypes.KEY);

    TokenSet COMMENTS = TokenSet.create(SQLTypes.COMMENT);
}
