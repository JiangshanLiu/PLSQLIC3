package com.myplugin.plsqlic3.backend.casegen.util.seedschedule.plcomplexity;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import com.myplugin.plsqlic3.backend.parsers.parseplpgsql.PostgreSQLLexer;
import com.myplugin.plsqlic3.backend.parsers.parseplpgsql.PostgreSQLParser;

public class GetPlPgSqlComplexity {
    public static int getPlPgSqlComplexity(String input) {
        PostgreSQLLexer lexer = new PostgreSQLLexer(CharStreams.fromString(input));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PostgreSQLParser parser = new PostgreSQLParser(tokens);
        ParseTree root = parser.root();
        PlPgSqlVisitorImpForComplexity visitor = new PlPgSqlVisitorImpForComplexity();
        visitor.visit(root);
        return visitor.getComplexity();
    }
}
