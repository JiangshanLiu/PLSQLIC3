package com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa.genfromcode;

import com.myplugin.plsqlic3.backend.parsers.parseplpgsql.PostgreSQLLexer;
import com.myplugin.plsqlic3.backend.parsers.parseplpgsql.PostgreSQLParser;
import com.myplugin.plsqlic3.backend.parsers.parserutil.token.PlSqlTokenFactory;
import com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa.GotoUtil;
import com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa.SsaGenerator;
import com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa.struct.Label;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import static com.myplugin.plsqlic3.backend.parsers.parseplpgsql.ERROR_MODE.EXCEPTION;

public class SsaGeneratorFromCode extends SsaGenerator {
    @Override
    public GotoUtil getGotoUtil(Object test_case) {
        String test_case_str = (String) test_case;
        Label.clearStaticVars();
        GotoUtil goto_util = new GotoUtil();

        PostgreSQLLexer lexer = new PostgreSQLLexer(CharStreams.fromString(test_case_str));
        PlSqlTokenFactory tokenFactory = new PlSqlTokenFactory();
        lexer.setTokenFactory(tokenFactory);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PostgreSQLParser parser = new PostgreSQLParser(tokens);
        parser.setErrorMode(EXCEPTION);
        parser.setTokenFactory(tokenFactory);
        parser.setBuildParseTree(true);
        ParseTree root = parser.root();

        ParseTreeWalker walker = new ParseTreeWalker();
        PlPgSqlListenerImpForPL2SQL listener = new PlPgSqlListenerImpForPL2SQL(goto_util);
        walker.walk(listener, root);

        goto_util.simplifyGoto();
        return goto_util;
    }
}
