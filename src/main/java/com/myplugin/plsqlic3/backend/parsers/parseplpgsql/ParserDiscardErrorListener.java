package com.myplugin.plsqlic3.backend.parsers.parseplpgsql;

import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

import java.util.BitSet;

import static com.myplugin.plsqlic3.backend.parsers.parseplpgsql.ERROR_MODE.EXCEPTION;

public class ParserDiscardErrorListener implements ANTLRErrorListener {
    public static class ParserErrorException extends RuntimeException {
        public ParserErrorException(){
            super("Error when parsing by ANTLR.");
        }
    }

    ERROR_MODE err_mode;

    public ParserDiscardErrorListener(ERROR_MODE err_mode) {
        this.err_mode = err_mode;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object o, int i, int i1, String s, RecognitionException e) {
        if (this.err_mode == EXCEPTION) {
            throw new ParserErrorException();
        }
    }

    @Override
    public void reportAmbiguity(Parser parser, DFA dfa, int i, int i1, boolean b, BitSet bitSet, ATNConfigSet atnConfigSet) {

    }

    @Override
    public void reportAttemptingFullContext(Parser parser, DFA dfa, int i, int i1, BitSet bitSet, ATNConfigSet atnConfigSet) {

    }

    @Override
    public void reportContextSensitivity(Parser parser, DFA dfa, int i, int i1, int i2, ATNConfigSet atnConfigSet) {

    }
}
