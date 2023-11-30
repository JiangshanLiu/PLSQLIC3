package com.myplugin.plsqlic3.middleware.casevalidity;

import com.myplugin.plsqlic3.backend.casegen.tkmutation.parser.PlPgSqlListenerImpForVerifyValidation;
import com.myplugin.plsqlic3.backend.parsers.parseplpgsql.LexerDiscardErrorListener;
import com.myplugin.plsqlic3.backend.parsers.parseplpgsql.ParserDiscardErrorListener;
import com.myplugin.plsqlic3.backend.parsers.parseplpgsql.PostgreSQLLexer;
import com.myplugin.plsqlic3.backend.parsers.parseplpgsql.PostgreSQLParser;
import com.myplugin.plsqlic3.middleware.data.CaseValidityData;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.HashMap;

import static com.myplugin.plsqlic3.backend.parsers.parseplpgsql.ERROR_MODE.EXCEPTION;

public class CaseValidity {
    /**
     * Validity check for generated test case
     *
     * @param mutant_case generated test case
     * @return whether the test case is valid or not, and arguments with their types
     */
    public static CaseValidityData verifyCaseValidity(String mutant_case) {
        PlPgSqlListenerImpForVerifyValidation listener;
        try {
            CharStream charStream = CharStreams.fromString(mutant_case);
            PostgreSQLLexer lexer = new PostgreSQLLexer(charStream);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            PostgreSQLParser parser = new PostgreSQLParser(tokens);
            parser.setErrorMode(EXCEPTION);
            ParseTree tree = parser.root();
            parser.setBuildParseTree(true);
            ParseTreeWalker walker = new ParseTreeWalker();
            listener = new PlPgSqlListenerImpForVerifyValidation();
            walker.walk(listener, tree);
        } catch (LexerDiscardErrorListener.LexerErrorException
                 | ParserDiscardErrorListener.ParserErrorException
                 | PlPgSqlListenerImpForVerifyValidation.ListenerErrorException e) {
            return new CaseValidityData(false, null);
        }
        return new CaseValidityData(true, listener.argsWithTypes);
    }
}
