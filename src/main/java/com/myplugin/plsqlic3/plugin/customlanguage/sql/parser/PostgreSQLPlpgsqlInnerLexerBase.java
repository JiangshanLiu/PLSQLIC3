package com.myplugin.plsqlic3.plugin.customlanguage.sql.parser;

import com.myplugin.plsqlic3.backend.parsers.parseplpgsql.ERROR_MODE;
import com.myplugin.plsqlic3.backend.parsers.parseplpgsql.LexerDiscardErrorListener;
import com.myplugin.plsqlic3.backend.parsers.parseplpgsql.LexerDispatchingErrorListener;
import com.myplugin.plsqlic3.backend.parsers.parseplpgsql.PostgreSQLLexer;
import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;

import java.util.ArrayDeque;
import java.util.Deque;

import static com.myplugin.plsqlic3.backend.parsers.parseplpgsql.ERROR_MODE.DEFAULT;

public abstract class PostgreSQLPlpgsqlInnerLexerBase extends Lexer {
    private ERROR_MODE err_mode;

    protected final Deque<String> tags = new ArrayDeque<>();

    protected PostgreSQLPlpgsqlInnerLexerBase(CharStream input) {
        super(input);
        this.err_mode = DEFAULT;
    }

    public void setErrorMode(ERROR_MODE err_mode) {
        this.err_mode = err_mode;
        this.removeErrorListeners();
        ANTLRErrorListener listener_lexer;
        switch (this.err_mode) {
            case IGNORE:
            case EXCEPTION:
                listener_lexer = new LexerDiscardErrorListener(this.err_mode);
                break;
            case DEFAULT:
            default:
                listener_lexer = new LexerDispatchingErrorListener((Lexer) (((CommonTokenStream) (this.getInputStream())).getTokenSource()));
                break;
        }
        this.addErrorListener(listener_lexer);
    }

    public void pushTag() {
        tags.push(getText());
    }

    public boolean isTag() {
        return getText().equals(tags.peek());
    }

    public void popTag() {
        tags.pop();
    }

    public boolean checkLA(int c) {
        return getInputStream().LA(1) != c;
    }

    public boolean charIsLetter() {
        return Character.isLetter(getInputStream().LA(-1));
    }

    public void HandleNumericFail() {
        getInputStream().seek(getInputStream().index() - 2);
        setType(PostgreSQLLexer.Integral);
    }

    public void HandleLessLessGreaterGreater() {
        if (getText() == "<<") setType(PostgreSQLLexer.LESS_LESS);
        if (getText() == ">>") setType(PostgreSQLLexer.GREATER_GREATER);
    }

    public void UnterminatedBlockCommentDebugAssert() {
        //Debug.Assert(InputStream.LA(1) == -1 /*EOF*/);
    }

    public boolean CheckIfUtf32Letter() {
        int codePoint = getInputStream().LA(-2) << 8 + getInputStream().LA(-1);
        char[] c;
        if (codePoint < 0x10000) {
            c = new char[]{(char) codePoint};
        } else {
            codePoint -= 0x10000;
            c = new char[]{(char) (codePoint / 0x400 + 0xd800), (char) (codePoint % 0x400 + 0xdc00)};
        }
        return Character.isLetter(c[0]);
    }
}