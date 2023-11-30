package com.myplugin.plsqlic3.backend.parsers.parseplpgsql;

import org.antlr.v4.runtime.*;

public class PostgreSQLBailErrorStrategy extends DefaultErrorStrategy {
    @Override
    public void recover(Parser recognizer, RecognitionException e) {
        throw new RuntimeException();
    }

    @Override
    public Token recoverInline(Parser recognizer) throws RecognitionException {
        throw new RuntimeException(new InputMismatchException(recognizer));
    }

    @Override
    public void sync(Parser recognizer) {
    }
}
