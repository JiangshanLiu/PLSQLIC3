package com.myplugin.plsqlic3.backend.casegen.spmutation.genunifiedir;

import com.myplugin.plsqlic3.backend.casegen.spmutation.genunifiedir.parsers.PlPgSqlListenerImpForUIR;
import com.myplugin.plsqlic3.backend.casegen.spmutation.genunifiedir.unifiedirnode.AbstractUirNode;
import com.myplugin.plsqlic3.backend.casegen.util.TestCase;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import com.myplugin.plsqlic3.backend.parsers.parseplpgsql.PostgreSQLLexer;
import com.myplugin.plsqlic3.backend.parsers.parseplpgsql.PostgreSQLParser;
import com.myplugin.plsqlic3.backend.parsers.parserutil.token.PlSqlTokenFactory;

import java.util.ArrayList;

import static com.myplugin.plsqlic3.backend.parsers.parseplpgsql.ERROR_MODE.EXCEPTION;
import static com.myplugin.plsqlic3.backend.runnable.GlobalConfig.db_type;

public class UIRGenerator {
    ArrayList<AbstractUirNode> uir_list = new ArrayList<>();

    public TestCase genUIR(TestCase test_case) {
        String case_code = (String) test_case.case_code;

        switch (db_type) {
            case POSTGRES:
            case GAUSSDB:
                PostgreSQLLexer lexer = new PostgreSQLLexer(CharStreams.fromString(case_code));
                PlSqlTokenFactory tokenFactory = new PlSqlTokenFactory();
                lexer.setTokenFactory(tokenFactory);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                PostgreSQLParser parser = new PostgreSQLParser(tokens);
                parser.setErrorMode(EXCEPTION);
                parser.setTokenFactory(tokenFactory);
                parser.setBuildParseTree(true);
                ParseTree root = parser.root();

                ParseTreeWalker walker = new ParseTreeWalker();
                PlPgSqlListenerImpForUIR listener = new PlPgSqlListenerImpForUIR(uir_list);
                walker.walk(listener, root);

                return new TestCase(test_case.case_name, uir_list);
            case ORACLE:
            case MYSQL:
            default:
                return null;
        }
    }
}
