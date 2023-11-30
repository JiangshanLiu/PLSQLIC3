package com.myplugin.plsqlic3.backend.parsers.parserutil.token;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenSource;
import org.antlr.v4.runtime.misc.Pair;

/**
 * To use SSA to make univariate serial numbers for PL/SQL identifiers
 * Designing a data structure to store serial numbers for identifiers
 */
public class PlSqlToken extends CommonToken {
    public Integer ssa_index = null;

    public PlSqlToken(int type) {
        super(type);
    }

    public PlSqlToken(Pair<TokenSource, CharStream> source, int type, int channel, int start, int stop) {
        super(source, type, channel, start, stop);
    }

    public PlSqlToken(int type, String text) {
        super(type, text);
    }

    public PlSqlToken(Token oldToken) {
        super(oldToken);
    }

    @Override
    public String getText() {
        if (ssa_index != null) {
            return super.getText() + "_" + ssa_index;
        } else {
            return super.getText();
        }
    }

    @Override
    public String toString() {
        return super.getText();
    }
}
