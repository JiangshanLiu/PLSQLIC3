package com.myplugin.plsqlic3.backend.casegen.util.seedschedule.plcomplexity;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import com.myplugin.plsqlic3.backend.parsers.parseplpgsql.PostgreSQLLexer;
import com.myplugin.plsqlic3.backend.parsers.parseplpgsql.PostgreSQLParser;
import com.myplugin.plsqlic3.backend.parsers.parseplpgsql.PostgreSQLParserBaseVisitor;

import static com.myplugin.plsqlic3.backend.parsers.parseplpgsql.ERROR_MODE.IGNORE;
import static com.myplugin.plsqlic3.backend.parsers.parseplpgsql.GetPostgrePLString.getPostgrePLString;

public class PlPgSqlVisitorImpForComplexity extends PostgreSQLParserBaseVisitor<String> {
    private int complexity;

    @Override
    public String visitCreatefunctionstmt(PostgreSQLParser.CreatefunctionstmtContext ctx) {
        if (ctx.FUNCTION() != null) {
            String pl_string = getPostgrePLString(ctx);
            if (pl_string == null) {
                return null;
            }
            PostgreSQLLexer lexer = new PostgreSQLLexer(CharStreams.fromString(pl_string));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            PostgreSQLParser parser = new PostgreSQLParser(tokens);
            parser.setErrorMode(IGNORE);
            ParseTree root = parser.root();
            complexity = tokens.size();
        }
        return null;
    }

    public int getComplexity() {
        return complexity;
    }
}
