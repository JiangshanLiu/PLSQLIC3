package com.myplugin.plsqlic3.backend.parsers.parserutil.token;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.TokenFactory;
import org.antlr.v4.runtime.TokenSource;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.misc.Pair;

public class PlSqlTokenFactory implements TokenFactory<PlSqlToken> {
    protected final boolean copyText;

    public PlSqlTokenFactory(boolean copyText) {
        this.copyText = copyText;
    }

    public PlSqlTokenFactory() {
        this(false);
    }

    @Override
    public PlSqlToken create(Pair<TokenSource, CharStream> source, int type, String text, int channel, int start, int stop, int line, int charPositionInLine) {
        PlSqlToken t = new PlSqlToken(source, type, channel, start, stop);
        t.setLine(line);
        t.setCharPositionInLine(charPositionInLine);
        if (text != null) {
            t.setText(text);
        } else if (this.copyText && source.b != null) {
            t.setText(((CharStream) source.b).getText(Interval.of(start, stop)));
        }

        return t;
    }

    @Override
    public PlSqlToken create(int type, String text) {
        return new PlSqlToken(type, text);
    }

//    @Override
//    public PlSqlToken create(Pair<TokenSource, CharStream> source, int type, String text, int channel, int start, int stop, int line, int charPositionInLine) {
//        PlSqlToken t = new PlSqlToken(source, type, channel, start, stop);
//        t.setLine(line);
//        t.setCharPositionInLine(charPositionInLine);
////        CharStream input = source.b;
////        t.setText(input.getText(Interval.of(start, stop)));
//        return t;
//    }
//
//    @Override
//    public PlSqlToken create(int i, String s) {
//        return new PlSqlToken(i, s);
//    }
}
