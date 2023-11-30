package com.myplugin.plsqlic3.backend.casegen.tkmutation.parser;

import com.myplugin.plsqlic3.backend.parsers.parserutil.token.PlSqlToken;
import com.myplugin.plsqlic3.backend.testbymrs.pl2sql.util.SqlIdMap;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import com.myplugin.plsqlic3.backend.parsers.parseplpgsql.PostgreSQLLexer;
import com.myplugin.plsqlic3.backend.parsers.parseplpgsql.PostgreSQLParser;
import com.myplugin.plsqlic3.backend.parsers.parseplpgsql.PostgreSQLParserBaseListener;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;

import java.util.HashMap;

import static com.myplugin.plsqlic3.backend.parsers.parseplpgsql.ERROR_MODE.EXCEPTION;
import static com.myplugin.plsqlic3.backend.parsers.parseplpgsql.GetPostgrePLString.getPostgrePLString;
import static com.myplugin.plsqlic3.backend.parsers.parseplpgsql.PostgreSQLLexer.Identifier;
import static com.myplugin.plsqlic3.backend.runnable.GlobalConfig.anonymous_dollar_var_id;

public class PlPgSqlListenerImpForVerifyValidation extends PostgreSQLParserBaseListener {

    public SqlIdMap<String, String> argsWithTypes = new SqlIdMap<>();

    public static class ListenerErrorException extends RuntimeException {

    }

    public PlPgSqlListenerImpForVerifyValidation() {
    }

    // find PL/pgSQL function to establish a new parser
    @Override
    public void enterCreatefunctionstmt(PostgreSQLParser.CreatefunctionstmtContext ctx) {
        if (ctx.FUNCTION() != null) {
            PostgreSQLParser.Func_args_with_defaults_listContext arg_list = ctx.func_args_with_defaults().func_args_with_defaults_list();
            if (arg_list != null) {
                int param_index = 1;
                for (PostgreSQLParser.Func_arg_with_defaultContext arg : arg_list.func_arg_with_default()) {
                    if (arg.func_arg().param_name() != null) {
                        if (arg.func_arg().param_name().type_function_name().identifier() != null) {
                            argsWithTypes.put(arg.func_arg().param_name().type_function_name().identifier().Identifier().getText(),
                                    arg.func_arg().func_type().typename().getText());
                        } else {
                            argsWithTypes.put(arg.func_arg().param_name().type_function_name().getText(),
                                    arg.func_arg().func_type().typename().getText());
                        }
                    } else {
                        argsWithTypes.put(anonymous_dollar_var_id + param_index,
                                arg.func_arg().func_type().typename().getText());
                    }
                    param_index++;
                }
            }

            String pl_string = getPostgrePLString(ctx);
            if (pl_string == null) {
                return;
            }
            try {
                PostgreSQLLexer lexer = new PostgreSQLLexer(CharStreams.fromString(pl_string));
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                PostgreSQLParser parser = new PostgreSQLParser(tokens);
                parser.setErrorMode(EXCEPTION);
                ParseTree plsql_root = parser.plsqlroot();
                parser.setBuildParseTree(true);
                ParseTreeWalker walker = new ParseTreeWalker();
                PlPgSqlListenerImpForVerifyValidation listener = new PlPgSqlListenerImpForVerifyValidation();
                walker.walk(listener, plsql_root);
            } catch (Exception e) {
                throw new ListenerErrorException();
            }
        }
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        throw new ListenerErrorException();
    }
}
