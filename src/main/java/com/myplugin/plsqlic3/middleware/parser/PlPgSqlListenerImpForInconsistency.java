package com.myplugin.plsqlic3.middleware.parser;

import com.myplugin.plsqlic3.backend.parsers.parseplpgsql.PostgreSQLLexer;
import com.myplugin.plsqlic3.backend.parsers.parseplpgsql.PostgreSQLParser;
import com.myplugin.plsqlic3.backend.parsers.parseplpgsql.PostgreSQLParserBaseListener;
import com.myplugin.plsqlic3.middleware.data.inconsistency.AbstractInconsistencyData;
import com.myplugin.plsqlic3.middleware.data.inconsistency.CharargInconsistencyData;
import com.myplugin.plsqlic3.middleware.data.inconsistency.ForloopInconsistencyData;
import com.myplugin.plsqlic3.middleware.data.inconsistency.IntoInconsistencyData;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.ArrayList;

import static com.myplugin.plsqlic3.backend.parsers.parseplpgsql.ERROR_MODE.EXCEPTION;
import static com.myplugin.plsqlic3.backend.parsers.parseplpgsql.GetPostgrePLString.getPostgrePLString;

public class PlPgSqlListenerImpForInconsistency extends PostgreSQLParserBaseListener {
    private final ArrayList<String> char_var_list;
    private final CommonTokenStream plsql_tokens;
    private final ArrayList<String> decl_list;

    private final String whole_plsql_code;
    private final ArrayList<AbstractInconsistencyData> inconsistencyDataList;

    public PlPgSqlListenerImpForInconsistency(String whole_plsql_code,
                                              ArrayList<AbstractInconsistencyData> inconsistencyDataList) {
        this.whole_plsql_code = whole_plsql_code;
        this.inconsistencyDataList = inconsistencyDataList;
        this.char_var_list = new ArrayList<>();
        this.plsql_tokens = null;
        this.decl_list = new ArrayList<>();
    }

    public PlPgSqlListenerImpForInconsistency(String whole_plsql_code,
                                              ArrayList<AbstractInconsistencyData> inconsistencyDataList,
                                              ArrayList<String> char_var_list,
                                              CommonTokenStream plsql_tokens,
                                              ArrayList<String> decl_list) {
        this.whole_plsql_code = whole_plsql_code;
        this.inconsistencyDataList = inconsistencyDataList;
        this.char_var_list = char_var_list;
        this.plsql_tokens = plsql_tokens;
        this.decl_list = decl_list;
    }

    // find PL/pgSQL function to establish a new parser
    @Override
    public void exitCreatefunctionstmt(PostgreSQLParser.CreatefunctionstmtContext ctx) {
        if (ctx.FUNCTION() != null) {
            String pl_string = getPostgrePLString(ctx);
            if (pl_string == null) {
                return;
            }
            PostgreSQLLexer lexer = new PostgreSQLLexer(CharStreams.fromString(pl_string));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            PostgreSQLParser parser = new PostgreSQLParser(tokens);
            parser.setErrorMode(EXCEPTION);
            ParseTree plsql_root = parser.plsqlroot();
            parser.setBuildParseTree(true);
            ParseTreeWalker walker = new ParseTreeWalker();
            PlPgSqlListenerImpForInconsistency listener =
                    new PlPgSqlListenerImpForInconsistency(pl_string, this.inconsistencyDataList, this.char_var_list, tokens, this.decl_list);
            walker.walk(listener, plsql_root);
        }
    }

    @Override
    public void enterFunc_arg(PostgreSQLParser.Func_argContext ctx) {
//        try {
//            if (ctx.func_type().typename().simpletypename().getText().equalsIgnoreCase("CHAR")) {
//                inconsistencyDataList.add(new CharargInconsistencyData(this.whole_plsql_code, ctx.func_type()));
//            }
//        } catch (Exception ignore) {
//        }
        try {
            if (ctx.func_type().typename().simpletypename().getText().equalsIgnoreCase("CHAR")) {
                this.char_var_list.add(ctx.param_name().getText().toLowerCase());
            }
        } catch (Exception ignore) {
        }
    }

    @Override
    public void enterIdentifier(PostgreSQLParser.IdentifierContext ctx) {
        if (this.plsql_tokens != null) {
            String id = ctx.getStart().getText().toLowerCase();
            if (this.char_var_list.contains(id)) {
                int index = this.plsql_tokens.getTokens().indexOf(ctx.getStart());
                boolean find1 = false;
                for (int i = index - 1; i >= 0; --i) {
                    if (!this.plsql_tokens.getTokens().get(i).getText().trim().isEmpty()) {
                        if (this.plsql_tokens.getTokens().get(i).getText().trim().equalsIgnoreCase("(")) {
                            find1 = true;
                        } else if (this.plsql_tokens.getTokens().get(i).getText().trim().equalsIgnoreCase("LEFT")) {
                            if (find1) {
                                return;
                            } else {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                find1 = false;
                for (int i = index + 1; i < this.plsql_tokens.getTokens().size(); ++i) {
                    if (!this.plsql_tokens.getTokens().get(i).getText().trim().isEmpty()) {
                        if (this.plsql_tokens.getTokens().get(i).getText().trim().equalsIgnoreCase("::")) {
                            find1 = true;
                        } else if (this.plsql_tokens.getTokens().get(i).getText().trim().equalsIgnoreCase("CHAR")) {
                            if (find1) {
                                return;
                            } else {
                                inconsistencyDataList.add(new CharargInconsistencyData(this.whole_plsql_code, ctx));
                                return;
                            }
                        } else {
                            inconsistencyDataList.add(new CharargInconsistencyData(this.whole_plsql_code, ctx));
                            return;
                        }
                    }
                }
            }
        }
    }

    @Override
    public void enterFor_control(PostgreSQLParser.For_controlContext ctx) {
        if (ctx.DOT_DOT() != null) {
            boolean lower_bound_flag = true;
            boolean upper_bound_flag = true;
            Token lower_bound_start = ctx.a_expr(0).getStart();
            Token lower_bound_stop = ctx.a_expr(0).getStop();
            if (lower_bound_start.equals(lower_bound_stop) && lower_bound_start.getType() == PostgreSQLLexer.Integral ||
                    lower_bound_start.getText().equalsIgnoreCase("FLOOR") ||
                    lower_bound_start.getText().equalsIgnoreCase("CEIL")) {
                lower_bound_flag = false;
            }
            Token upper_bound_start = ctx.a_expr(1).getStart();
            Token upper_bound_stop = ctx.a_expr(1).getStop();
            if (upper_bound_start.equals(upper_bound_stop) && upper_bound_start.getType() == PostgreSQLLexer.Integral ||
                    upper_bound_start.getText().equalsIgnoreCase("FLOOR") ||
                    upper_bound_start.getText().equalsIgnoreCase("CEIL")) {
                upper_bound_flag = false;
            }
            if (lower_bound_flag || upper_bound_flag) {
                inconsistencyDataList.add(new ForloopInconsistencyData(this.whole_plsql_code,
                        lower_bound_flag ? ctx.a_expr(0) : null,
                        upper_bound_flag ? ctx.a_expr(1) : null));
            }
        }
    }

    @Override
    public void enterInto_clause(PostgreSQLParser.Into_clauseContext ctx) {
        if (ctx.INTO() != null) {
            if (ctx.opttempTableName() != null) {
                if (!this.decl_list.contains(ctx.opttempTableName().getStart().getText().toLowerCase())) {
                    inconsistencyDataList.add(new IntoInconsistencyData(this.whole_plsql_code, ctx.opttempTableName()));
                }
            }
            if (ctx.into_target() != null) {
                if (ctx.into_target().expr_list().a_expr() != null && ctx.into_target().expr_list().a_expr().size() > 0) {
                    for (ParserRuleContext ctx_a_expr : ctx.into_target().expr_list().a_expr()) {
                        if (!this.decl_list.contains(ctx_a_expr.getText().toLowerCase())) {
                            inconsistencyDataList.add(new IntoInconsistencyData(this.whole_plsql_code, ctx_a_expr));
                        }
                    }
                }
            }
        }
    }

    @Override
    public void enterDecl_statement(PostgreSQLParser.Decl_statementContext ctx) {
        this.decl_list.add(ctx.decl_varname().getText().toLowerCase());
    }

    public static void main(String[] args) {
        String pl_string = "CREATE OR REPLACE FUNCTION test(A CHAR) RETURNS void AS $$\n" +
                "BEGIN\n" +
                "  FOR i IN 1 .. 0.5*5 LOOP\n" +
                "  raise notice '%', i;\n" +
                "END LOOP;\n" +
                "END;\n" +
                "$$ LANGUAGE plpgsql;";
        ArrayList<AbstractInconsistencyData> objects = new ArrayList<>();
        PostgreSQLLexer lexer = new PostgreSQLLexer(CharStreams.fromString(pl_string));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PostgreSQLParser parser = new PostgreSQLParser(tokens);
        parser.setErrorMode(EXCEPTION);
        ParseTree plsql_root = parser.root();
        parser.setBuildParseTree(true);
        ParseTreeWalker walker = new ParseTreeWalker();
        PlPgSqlListenerImpForInconsistency listener = new PlPgSqlListenerImpForInconsistency(pl_string, objects);
        walker.walk(listener, plsql_root);
        System.out.println(objects);
    }
}
