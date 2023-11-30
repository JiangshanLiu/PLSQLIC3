package com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa.genfromcode;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;
import com.myplugin.plsqlic3.backend.parsers.parseplpgsql.PostgreSQLLexer;
import com.myplugin.plsqlic3.backend.parsers.parseplpgsql.PostgreSQLParser;
import com.myplugin.plsqlic3.backend.parsers.parseplpgsql.PostgreSQLParserBaseListener;
import com.myplugin.plsqlic3.backend.parsers.parserutil.token.PlSqlToken;
import com.myplugin.plsqlic3.backend.parsers.parserutil.token.PlSqlTokenFactory;
import com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa.GotoUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import static com.myplugin.plsqlic3.backend.parsers.parseplpgsql.ERROR_MODE.EXCEPTION;
import static com.myplugin.plsqlic3.backend.parsers.parseplpgsql.GetPostgrePLString.getPostgrePLString;
import static com.myplugin.plsqlic3.backend.parsers.parseplpgsql.PostgreSQLLexer.*;
import static com.myplugin.plsqlic3.backend.parsers.parserutil.parserutil.GeneralParserUtil.getFullTextByChildren;
import static com.myplugin.plsqlic3.backend.parsers.parserutil.parserutil.PlPgSqlParserUtil.selectIntoDecl;
import static com.myplugin.plsqlic3.backend.runnable.GlobalConfig.*;
import static com.myplugin.plsqlic3.backend.runnable.LogToFile.LOG_TYPE.PRINT;
import static com.myplugin.plsqlic3.backend.runnable.LogToFile.writeLog;
import static com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa.ssanode.AssignExprType.*;


public class PlPgSqlListenerImpForPL2SQL extends PostgreSQLParserBaseListener {
    private final GotoUtil goto_util;
    private final boolean debug_flag = false;
    private int replace_record_index = 0;
    private int bound_index = 0;

    public PlPgSqlListenerImpForPL2SQL(GotoUtil goto_util) {
        this.goto_util = goto_util;
    }

    private ParserRuleContext getCondVarCtx() {
        ParserRuleContext ctx_cond_var = new ParserRuleContext();
//        ctx_cond_var.addChild(new TerminalNodeImpl(new CommonToken(Identifier, "p_" + cond_index)));
//        cond_index += 1;
        ctx_cond_var.addChild(new TerminalNodeImpl(new PlSqlToken(Identifier, judgment_cond)));
        PostgreSQLParser.TypenameContext type_name = new PostgreSQLParser.TypenameContext(null, -1);
        type_name.addChild(new PostgreSQLParser.SimpletypenameContext(null, -1) {{
                               addChild(new PostgreSQLParser.NumericContext(null, -1) {{
                                            addChild(new TerminalNodeImpl(new PlSqlToken(BOOLEAN_P, "boolean")));
                                        }}
                               );
                           }}
        );
        goto_util.func_info.id_type_pair.put(ctx_cond_var.getText(), type_name);
        return ctx_cond_var;
    }

    private ParserRuleContext getUpperBoundVarCtx() {
        ParserRuleContext ctx_bound_var = new ParserRuleContext();
        ctx_bound_var.addChild(new TerminalNodeImpl(new PlSqlToken(Identifier, int_for_loop_upper_bound + bound_index)));
        bound_index++;
        PostgreSQLParser.TypenameContext type_name = new PostgreSQLParser.TypenameContext(null, -1);
        type_name.addChild(new PostgreSQLParser.SimpletypenameContext(null, -1) {{
                               addChild(new PostgreSQLParser.NumericContext(null, -1) {{
                                            addChild(new TerminalNodeImpl(new PlSqlToken(INT_P, "int")));
                                        }}
                               );
                           }}
        );
        goto_util.func_info.id_type_pair.put(ctx_bound_var.getText(), type_name);
        return ctx_bound_var;
    }

    private ParserRuleContext getDeepCopyCtx(ParserRuleContext ctx) {
        ParserRuleContext dc_ctx = new ParserRuleContext();
        dc_ctx.addChild(new TerminalNodeImpl(new PlSqlToken(Identifier, ctx.getText())));
        return dc_ctx;
    }


    // if expr is expr, returns true;
    // if expr is SQL, returns false
    private boolean exprOrSql(ParseTree ctx) {
        if (ctx instanceof TerminalNodeImpl) {
            if (((TerminalNodeImpl) ctx).getSymbol().getType() == SELECT) {
                return false;
            }
        } else if (ctx instanceof ParserRuleContext && ((ParserRuleContext) ctx).children != null) {
            for (ParseTree pt : ((ParserRuleContext) ctx).children) {
                if (!exprOrSql(pt)) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        if (node.getSymbol().getType() == PARAM) {
            String dollar_param_index = node.getText().substring(1);
            TerminalNode tn_dollar_var = new TerminalNodeImpl(new PlSqlToken(Identifier, anonymous_dollar_var_id + dollar_param_index));
            if (node.getParent() instanceof ParserRuleContext) {
                ParserRuleContext ctx_parent = (ParserRuleContext) node.getParent();
                ctx_parent.children.add(ctx_parent.children.indexOf(node), tn_dollar_var);
                ctx_parent.children.remove(node);
            }
        }
    }

    @Override
    public void enterIdentifier(PostgreSQLParser.IdentifierContext ctx) {
//        StringBuffer sb = new StringBuffer();
//        if (ctx.Identifier() != null) {
//            sb.append("Identifier");
//        } else if (ctx.QuotedIdentifier() != null) {
//            sb.append("QuotedIdentifier");
//        } else if (ctx.UnicodeQuotedIdentifier() != null) {
//            sb.append("UnicodeQuotedIdentifier");
//        } else if (ctx.plsql_unreserved_keyword() != null) {
//            sb.append("plsql_unreserved_keyword");
//        }
//        sb.insert(0, ctx.getText() + "\t");
//        System.out.println(sb.toString());

        if (ctx.plsql_unreserved_keyword() != null) {
            ctx.children.add(ctx.children.indexOf(ctx.plsql_unreserved_keyword()),
                    new TerminalNodeImpl(new PlSqlToken(Identifier, ctx.plsql_unreserved_keyword().getText()))
            );
            ctx.children.remove(ctx.plsql_unreserved_keyword());
        }
    }

    // info in CREATE FUNCTION sql
    @Override
    public void enterCreatefunctionstmt(PostgreSQLParser.CreatefunctionstmtContext ctx) {
        if (debug_flag) {
            writeLog(PRINT, "FUN:\t" + ctx.getText());
        }
        if (ctx.FUNCTION() != null) {
            goto_util.func_info.full_function_name = ctx.func_name().getText();
            if (ctx.func_name().type_function_name() != null) {
                goto_util.func_info.function_name = ctx.func_name().type_function_name().getText();
            } else {
                List<PostgreSQLParser.Indirection_elContext> indirection_list = ctx.func_name().indirection().indirection_el();
                goto_util.func_info.function_name = indirection_list.get(indirection_list.size() - 1).attr_name().getText();
            }
            PostgreSQLParser.Func_args_with_defaults_listContext arg_list = ctx.func_args_with_defaults().func_args_with_defaults_list();
            if (arg_list != null) {
                int param_index = 1;
                ArrayList<String> arg_types = new ArrayList<>();
                for (PostgreSQLParser.Func_arg_with_defaultContext arg : arg_list.func_arg_with_default()) {
                    arg_types.add(getFullTextByChildren(arg.func_arg().func_type().typename()));
                    if (arg.func_arg().param_name() != null) {
                        goto_util.func_info.id_type_pair.put(arg.func_arg().param_name().getText(), arg.func_arg().func_type().typename());
                        if (arg.func_arg().param_name().type_function_name().identifier() != null) {
                            goto_util.func_info.function_args.add(arg.func_arg().param_name().type_function_name().identifier().Identifier());
                        } else {
                            goto_util.func_info.function_args.add(new TerminalNodeImpl(new PlSqlToken(Identifier, arg.func_arg().param_name().type_function_name().getText())));
                        }
                    } else {
                        goto_util.func_info.id_type_pair.put(anonymous_dollar_var_id + param_index, arg.func_arg().func_type().typename());
                        goto_util.func_info.function_args.add(new TerminalNodeImpl(new PlSqlToken(Identifier, anonymous_dollar_var_id + param_index)));
                    }
                    // bug here: keyword as identifier
//                    if (arg.a_expr() != null) {
//                        goto_util.establishAssignNode(arg.func_arg().param_name(), arg.a_expr(), true);
//                    }
                    param_index++;
                }
                String drop_func_sql = String.format("DROP FUNCTION IF EXISTS %s(%s);",
                        goto_util.func_info.function_name,
                        String.join(", ", arg_types));
                goto_util.func_info.preprocess_sql.add(drop_func_sql);
            }
            goto_util.func_info.return_type = ctx.func_return();
            String pl_string = getPostgrePLString(ctx);
            if (pl_string == null) {
                return;
            }
            PostgreSQLLexer lexer = new PostgreSQLLexer(CharStreams.fromString(pl_string));
            PlSqlTokenFactory tokenFactory = new PlSqlTokenFactory();
            lexer.setTokenFactory(tokenFactory);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            PostgreSQLParser parser = new PostgreSQLParser(tokens);
            parser.setErrorMode(EXCEPTION);
            parser.setTokenFactory(tokenFactory);
            parser.setBuildParseTree(true);
            ParseTree plsqlroot = parser.plsqlroot();
            ParseTreeWalker walker = new ParseTreeWalker();
            PlPgSqlListenerImpForPL2SQL listener = this;
            walker.walk(listener, plsqlroot);
        }
    }

    // Fig.16 Decl
    // Fig.16 Decl0
    @Override
    public void enterDecl_statement(PostgreSQLParser.Decl_statementContext ctx) {
        if (debug_flag) {
            writeLog(PRINT, "DCL:\t" + ctx.getText());
        }
        PostgreSQLParser.TypenameContext type = null;
        if (!ctx.decl_datatype().typename().getText().equalsIgnoreCase("record")) {
            goto_util.func_info.id_type_pair.put(ctx.decl_varname().getText(), ctx.decl_datatype().typename());
            type = ctx.decl_datatype().typename();
        } else {
            PostgreSQLParser.TypenameContext typenameContext = new PostgreSQLParser.TypenameContext(null, -1);
            typenameContext.addChild(new TerminalNodeImpl(new PlSqlToken(Identifier, cursor_loop_record_viewname + replace_record_index)));
            replace_record_index++;
            goto_util.func_info.id_type_pair.put(ctx.decl_varname().getText(), typenameContext);
            type = typenameContext;
        }
        try {
            if (ctx.decl_defval().sql_expression() != null) {
                goto_util.establishAssignNode(ctx.decl_varname(), ctx.decl_defval().sql_expression(),
                        exprOrSql(ctx.decl_defval().sql_expression()) ? ASSIGN_EXPR : ASSIGN_SQL);
            } else {
                ParserRuleContext null_value = new ParserRuleContext();
                null_value.addChild(new TerminalNodeImpl(new PlSqlToken(NULL_P, "NULL")));
//                null_value.addChild(new TerminalNodeImpl(new PlSqlToken(TYPECAST, "::")));
//                null_value.addChild(type);
                goto_util.establishAssignNode(ctx.decl_varname(), null_value, ASSIGN_EXPR);
            }
        } catch (NullPointerException ignored) {
            ParserRuleContext null_value = new ParserRuleContext();
            null_value.addChild(new TerminalNodeImpl(new PlSqlToken(NULL_P, "NULL")));
//            null_value.addChild(new TerminalNodeImpl(new PlSqlToken(TYPECAST, "::")));
//            null_value.addChild(type);
            goto_util.establishAssignNode(ctx.decl_varname(), null_value, ASSIGN_EXPR);
        }
    }

    // Fig.16 Assign
    @Override
    public void enterStmt_assign(PostgreSQLParser.Stmt_assignContext ctx) {
        if (debug_flag) {
            writeLog(PRINT, "ASN:\t" + ctx.getText());
        }
        goto_util.establishAssignNode(ctx.assign_var(), ctx.sql_expression(),
                exprOrSql(ctx.sql_expression()) ? ASSIGN_EXPR : ASSIGN_SQL);
    }

    // SELECT INTO Assign
    @Override
    public void enterStmt_execsql(PostgreSQLParser.Stmt_execsqlContext ctx) {
        if (debug_flag) {
            writeLog(PRINT, "ASN:\t" + ctx.getText());
        }
        try {
            if (ctx.make_execsql_stmt().stmt().selectstmt().select_no_parens().select_clause().simple_select() != null) {
                HashMap<ParserRuleContext, ParserRuleContext> select_intos =
                        selectIntoDecl(ctx.make_execsql_stmt().stmt().selectstmt().select_no_parens().select_clause().simple_select());
                for (ParserRuleContext select_into_var : select_intos.keySet()) {
                    goto_util.establishAssignNode(select_into_var, select_intos.get(select_into_var), ASSIGN_CONST);
                }
            }
        } catch (NullPointerException ignored) {
        }
    }

    // Fig.16 Iter
    // Note that it's not Override, the statement is not in the ANTLR g4 grammar
    // Generic implementation is in class GenerateGotoUtil

    // Fig.16 Loop
    @Override
    public void enterStmt_loop(PostgreSQLParser.Stmt_loopContext ctx) {
        goto_util.establishLoopNode();
    }

    @Override
    public void exitStmt_loop(PostgreSQLParser.Stmt_loopContext ctx) {
        goto_util.endLoop();
    }

    // Fig.16 While
    @Override
    public void enterStmt_while(PostgreSQLParser.Stmt_whileContext ctx) {
        goto_util.establishWhileNode(getCondVarCtx(), ctx.expr_until_loop());
    }

    @Override
    public void exitStmt_while(PostgreSQLParser.Stmt_whileContext ctx) {
        goto_util.endWhile();
    }

    // Fig.16 For
    @Override
    public void enterStmt_for(PostgreSQLParser.Stmt_forContext ctx) {
        if (debug_flag) {
            writeLog(PRINT, "LOP:\t" + ctx.getText());
        }
        PostgreSQLParser.TypenameContext type_name = new PostgreSQLParser.TypenameContext(null, -1);
        type_name.addChild(new PostgreSQLParser.SimpletypenameContext(null, -1) {{
                               addChild(new PostgreSQLParser.NumericContext(null, -1) {{
                                            addChild(new TerminalNodeImpl(new PlSqlToken(INT_P, "int")));
                                        }}
                               );
                           }}
        );
        if (ctx.for_control().selectstmt() != null) {
            // may have bug here
            // tmp_view_type can be a array end with []
            String tmp_view_type = goto_util.func_info.id_type_pair.get(ctx.for_control().for_variable().getText()).getText();
            String drop_view_sql = String.format("DROP VIEW IF EXISTS %s;", tmp_view_type);
            String create_view_sql = String.format("CREATE OR REPLACE VIEW %s AS %s;", tmp_view_type, getFullTextByChildren(ctx.for_control().selectstmt()));
            goto_util.func_info.preprocess_sql.add(drop_view_sql);
            goto_util.func_info.preprocess_sql.add(create_view_sql);

            ParserRuleContext ctx_var = new ParserRuleContext();
            ctx_var.addChild(new TerminalNodeImpl(new PlSqlToken(Identifier, cursor_loop_cond)));
            ParserRuleContext ctx_init = new ParserRuleContext();
            ctx_init.addChild(new TerminalNodeImpl(new PlSqlToken(Integral, "1")));
            ParserRuleContext ctx_term = new ParserRuleContext();
            ctx_term.addChild(new TerminalNodeImpl(new PlSqlToken(SELECT, "SELECT")));
            ctx_term.addChild(new TerminalNodeImpl(new PlSqlToken(Identifier, "COUNT")));
            ctx_term.addChild(new TerminalNodeImpl(new PlSqlToken(OPEN_PAREN, "(")));
            ctx_term.addChild(new TerminalNodeImpl(new PlSqlToken(STAR, "*")));
            ctx_term.addChild(new TerminalNodeImpl(new PlSqlToken(CLOSE_PAREN, ")")));
            ctx_term.addChild(new TerminalNodeImpl(new PlSqlToken(FROM, "FROM")));
            ctx_term.addChild(new TerminalNodeImpl(new PlSqlToken(OPEN_PAREN, "(")));
            ctx_term.addChild(ctx.for_control().selectstmt());
            ctx_term.addChild(new TerminalNodeImpl(new PlSqlToken(CLOSE_PAREN, ")")));
            ctx_term.addChild(new TerminalNodeImpl(new PlSqlToken(Identifier, cursor_loop_count_tabname)));
            ParserRuleContext ctx_cond = new ParserRuleContext();
            ctx_cond.addChild(new TerminalNodeImpl(new PlSqlToken(Identifier, cursor_loop_cond)));
            ctx_cond.addChild(new TerminalNodeImpl(new PlSqlToken(LESS_EQUALS, "<=")));
            ctx_cond.addChild(new TerminalNodeImpl(new PlSqlToken(OPEN_PAREN, "(")));
            ctx_cond.addChild(ctx_term);
            ctx_cond.addChild(new TerminalNodeImpl(new PlSqlToken(CLOSE_PAREN, ")")));
            ParserRuleContext ctx_cursor_query_record = new ParserRuleContext();
//            ctx_cursor_query_record.addChild(new TerminalNodeImpl(new PlSqlToken(SELECT, "SELECT")));
//            ctx_cursor_query_record.addChild(new TerminalNodeImpl(new PlSqlToken(STAR, "*")));
//            ctx_cursor_query_record.addChild(new TerminalNodeImpl(new PlSqlToken(FROM, "FROM")));
//            ctx_cursor_query_record.addChild(new TerminalNodeImpl(new PlSqlToken(OPEN_PAREN, "(")));
//            ctx_cursor_query_record.addChild(ctx_ctrl.selectstmt());
//            ctx_cursor_query_record.addChild(new TerminalNodeImpl(new PlSqlToken(CLOSE_PAREN, ")")));
//            ctx_cursor_query_record.addChild(new TerminalNodeImpl(new PlSqlToken(Identifier, cursor_loop_record_tabname)));
            ctx_cursor_query_record.addChild(new TerminalNodeImpl(new PlSqlToken(SELECT, "SELECT")));
            ctx_cursor_query_record.addChild(new TerminalNodeImpl(new PlSqlToken(Identifier, "x")));
            ctx_cursor_query_record.addChild(new TerminalNodeImpl(new PlSqlToken(FROM, "FROM")));
            ctx_cursor_query_record.addChild(new TerminalNodeImpl(new PlSqlToken(Identifier, tmp_view_type)));
            ctx_cursor_query_record.addChild(new TerminalNodeImpl(new PlSqlToken(Identifier, "x")));
            ctx_cursor_query_record.addChild(new TerminalNodeImpl(new PlSqlToken(LIMIT, "LIMIT")));
            ctx_cursor_query_record.addChild(new TerminalNodeImpl(new PlSqlToken(Integral, "1")));
            ctx_cursor_query_record.addChild(new TerminalNodeImpl(new PlSqlToken(OFFSET, "OFFSET")));
            ctx_cursor_query_record.addChild(new TerminalNodeImpl(new PlSqlToken(Identifier, ctx_var.getText())));
            ctx_cursor_query_record.addChild(new TerminalNodeImpl(new PlSqlToken(MINUS, "-")));
            ctx_cursor_query_record.addChild(new TerminalNodeImpl(new PlSqlToken(Integral, "1")));
            goto_util.establishForIntNode(ctx_var,
                    ctx_init,
                    ctx_term,
                    getCondVarCtx(),
                    ctx_cond,
                    ctx.for_control().for_variable(),
                    ctx_cursor_query_record);
            goto_util.func_info.id_type_pair.put(cursor_loop_cond, type_name);
        } else if (ctx.for_control().DOT_DOT() != null) {
            ParserRuleContext ctx_lowerBoundVal = new ParserRuleContext();
            ctx_lowerBoundVal.addChild(new TerminalNodeImpl(new PlSqlToken(Identifier, "CEIL")));
            ctx_lowerBoundVal.addChild(new TerminalNodeImpl(new PlSqlToken(OPEN_PAREN, "(")));
            ctx_lowerBoundVal.addChild(ctx.for_control().a_expr(0));
            ctx_lowerBoundVal.addChild(new TerminalNodeImpl(new PlSqlToken(CLOSE_PAREN, ")")));
            ParserRuleContext ctx_upperBoundVar = getUpperBoundVarCtx();
            ParserRuleContext ctx_upperBoundVal = new ParserRuleContext();
            ctx_upperBoundVal.addChild(new TerminalNodeImpl(new PlSqlToken(Identifier, "FLOOR")));
            ctx_upperBoundVal.addChild(new TerminalNodeImpl(new PlSqlToken(OPEN_PAREN, "(")));
            ctx_upperBoundVal.addChild(ctx.for_control().a_expr(1));
            ctx_upperBoundVal.addChild(new TerminalNodeImpl(new PlSqlToken(CLOSE_PAREN, ")")));
            goto_util.establishAssignNode(ctx_upperBoundVar, ctx_upperBoundVal,
                    exprOrSql(ctx.for_control().a_expr(1)) ? ASSIGN_EXPR : ASSIGN_SQL);
            ParserRuleContext ctx_cond = new ParserRuleContext();
            ctx_cond.addChild(getDeepCopyCtx(ctx.for_control().for_variable()));
            if (ctx.for_control().opt_reverse().REVERSE() == null) {
                ctx_cond.addChild(new TerminalNodeImpl(new PlSqlToken(LESS_EQUALS, "<=")));
            } else {
                ctx_cond.addChild(new TerminalNodeImpl(new PlSqlToken(GREATER_EQUALS, ">=")));
            }
//            ctx_cond.addChild(new TerminalNodeImpl(new PlSqlToken(OPEN_PAREN, "(")));
            ctx_cond.addChild(new TerminalNodeImpl(new PlSqlToken(OPEN_PAREN, "(")));
            ctx_cond.addChild(new TerminalNodeImpl(new PlSqlToken(Identifier, ctx_upperBoundVar.getText())));
            ctx_cond.addChild(new TerminalNodeImpl(new PlSqlToken(CLOSE_PAREN, ")")));
//            ctx_cond.addChild(new TerminalNodeImpl(new PlSqlToken(TYPECAST, "::")));
//            ctx_cond.addChild(new TerminalNodeImpl(new PlSqlToken(INT_P, "INT")));
//            ctx_cond.addChild(new TerminalNodeImpl(new PlSqlToken(CLOSE_PAREN, ")")));
//            goto_util.establishForIntNode(ctx.for_control().for_variable(),
//                    ctx.for_control().a_expr(0),
//                    ctx.for_control().a_expr(1),
//                    getCondVarCtx(),
//                    ctx_cond,
//                    null,
//                    null);
            goto_util.establishForIntNode(ctx.for_control().for_variable(),
                    ctx_lowerBoundVal,
                    ctx_upperBoundVal,
                    getCondVarCtx(),
                    ctx_cond,
                    null,
                    null);
            goto_util.func_info.id_type_pair.put(ctx.for_control().for_variable().getText(), type_name);
        }
    }

    @Override
    public void exitStmt_for(PostgreSQLParser.Stmt_forContext ctx) {
        if (ctx.for_control().selectstmt() != null) {
            ParserRuleContext ctx_var = new ParserRuleContext();
            ctx_var.addChild(new TerminalNodeImpl(new PlSqlToken(Identifier, cursor_loop_cond)));
            ParserRuleContext ctx_iter = new ParserRuleContext();
            ctx_iter.addChild(new TerminalNodeImpl(new PlSqlToken(Identifier, cursor_loop_cond)));
            ctx_iter.addChild(new TerminalNodeImpl(new PlSqlToken(PLUS, "+")));
            ctx_iter.addChild(new TerminalNodeImpl(new PlSqlToken(Integral, "1")));
            goto_util.endForInt(ctx_var, ctx_iter);
        } else if (ctx.for_control().DOT_DOT() != null) {
            ParserRuleContext ctx_iter = new ParserRuleContext();
            ctx_iter.addChild(getDeepCopyCtx(ctx.for_control().for_variable()));
            if (ctx.for_control().opt_reverse().REVERSE() == null) {
                ctx_iter.addChild(new TerminalNodeImpl(new PlSqlToken(PLUS, "+")));
            } else {
                ctx_iter.addChild(new TerminalNodeImpl(new PlSqlToken(MINUS, "-")));
            }
            if (ctx.for_control().opt_by_expression().a_expr() == null) {
                ctx_iter.addChild(new TerminalNodeImpl(new PlSqlToken(Integral, "1")));
            } else {
                ctx_iter.addChild(ctx.for_control().opt_by_expression().a_expr());
            }
            goto_util.endForInt(getDeepCopyCtx(ctx.for_control().for_variable()), ctx_iter);
        }
    }

    // not in Fig Foreach
    @Override
    public void enterStmt_foreach_a(PostgreSQLParser.Stmt_foreach_aContext ctx) {
        if (debug_flag) {
            writeLog(PRINT, "LOP:\t" + ctx.getText());
        }
        PostgreSQLParser.TypenameContext type_name = new PostgreSQLParser.TypenameContext(null, -1);
        type_name.addChild(new PostgreSQLParser.SimpletypenameContext(null, -1) {{
                               addChild(new PostgreSQLParser.NumericContext(null, -1) {{
                                            addChild(new TerminalNodeImpl(new PlSqlToken(INT_P, "int")));
                                        }}
                               );
                           }}
        );
        ParserRuleContext ctx_var = new ParserRuleContext();
        ctx_var.addChild(new TerminalNodeImpl(new PlSqlToken(Identifier, cursor_loop_cond)));
        ParserRuleContext ctx_init = new ParserRuleContext();
        ctx_init.addChild(new TerminalNodeImpl(new PlSqlToken(Integral, "1")));
        ParserRuleContext ctx_term = new ParserRuleContext();
        ctx_term.addChild(new TerminalNodeImpl(new PlSqlToken(SELECT, "SELECT")));
        ctx_term.addChild(new TerminalNodeImpl(new PlSqlToken(Identifier, "ARRAY_LENGTH")));
        ctx_term.addChild(new TerminalNodeImpl(new PlSqlToken(OPEN_PAREN, "(")));
        ctx_term.addChild(new TerminalNodeImpl(new PlSqlToken(Identifier, ctx.a_expr().getText())));
        ctx_term.addChild(new TerminalNodeImpl(new PlSqlToken(COMMA, ",")));
        ctx_term.addChild(new TerminalNodeImpl(new PlSqlToken(Integral, "1")));
        ctx_term.addChild(new TerminalNodeImpl(new PlSqlToken(CLOSE_PAREN, ")")));
        ParserRuleContext ctx_cond = new ParserRuleContext();
        ctx_cond.addChild(new TerminalNodeImpl(new PlSqlToken(Identifier, cursor_loop_cond)));
        ctx_cond.addChild(new TerminalNodeImpl(new PlSqlToken(LESS_EQUALS, "<=")));
        ctx_cond.addChild(new TerminalNodeImpl(new PlSqlToken(OPEN_PAREN, "(")));
        ctx_cond.addChild(ctx_term);
        ctx_cond.addChild(new TerminalNodeImpl(new PlSqlToken(CLOSE_PAREN, ")")));
        ParserRuleContext ctx_foreach_array_item = new ParserRuleContext();
        ctx_foreach_array_item.addChild(new TerminalNodeImpl(new PlSqlToken(Identifier, ctx.a_expr().getText())));
        ctx_foreach_array_item.addChild(new TerminalNodeImpl(new PlSqlToken(OPEN_BRACKET, "[")));
        ctx_foreach_array_item.addChild(new TerminalNodeImpl(new PlSqlToken(Identifier, ctx_var.getText())));
        ctx_foreach_array_item.addChild(new TerminalNodeImpl(new PlSqlToken(CLOSE_BRACKET, "]")));
        goto_util.establishForIntNode(ctx_var, ctx_init, ctx_term, getCondVarCtx(), ctx_cond, ctx.for_variable(), ctx_foreach_array_item);
        goto_util.func_info.id_type_pair.put(cursor_loop_cond, type_name);
    }

    @Override
    public void exitStmt_foreach_a(PostgreSQLParser.Stmt_foreach_aContext ctx) {
        ParserRuleContext ctx_var = new ParserRuleContext();
        ctx_var.addChild(new TerminalNodeImpl(new PlSqlToken(Identifier, cursor_loop_cond)));
        ParserRuleContext ctx_iter = new ParserRuleContext();
        ctx_iter.addChild(new TerminalNodeImpl(new PlSqlToken(Identifier, cursor_loop_cond)));
        ctx_iter.addChild(new TerminalNodeImpl(new PlSqlToken(PLUS, "+")));
        ctx_iter.addChild(new TerminalNodeImpl(new PlSqlToken(Integral, "1")));
        goto_util.endForInt(ctx_var, ctx_iter);
    }

    // Fig.16 Exit
    // Fig.16 Cont
    @Override
    public void enterStmt_exit(PostgreSQLParser.Stmt_exitContext ctx) {
        if (debug_flag) {
            writeLog(PRINT, "EXT:\t" + ctx.getText());
        }

        if (ctx.opt_exitcond().expr_until_semi() != null) {
//            // when add if-else condition, condition should be organized as a new var
//            ParserRuleContext ctx_cond = new ParserRuleContext();
//            ctx_cond.addChild(new TerminalNodeImpl(new PlSqlToken(Identifier, "p")));
//            ctx_cond.addChild(new TerminalNodeImpl(new PlSqlToken(EQUAL, "=")));
//            ctx_cond.addChild(ctx.opt_exitcond().expr_until_semi());
            goto_util.establishIfelseNode(getCondVarCtx(), ctx.opt_exitcond().expr_until_semi());
        }

        if (ctx.exit_type().EXIT() != null) {
            goto_util.establishExitNode();
        } else if (ctx.exit_type().CONTINUE_P() != null) {
            // bug here: continue in if-else
            goto_util.establishContinueNode();
        }

        if (ctx.opt_exitcond().expr_until_semi() != null) {
            goto_util.endThen();
            goto_util.endElse();
        }
    }

    // Fig.16 IfElse
    // Fig.16 If
    @Override
    public void enterStmt_if(PostgreSQLParser.Stmt_ifContext ctx) {
        if (debug_flag) {
            writeLog(PRINT, "IFS:\t" + ctx.getText());
        }
        goto_util.establishIfelseNode(getCondVarCtx(), ctx.expr_until_then());
    }

    @Override
    public void exitStmt_if(PostgreSQLParser.Stmt_ifContext ctx) {
        if (ctx.stmt_elsifs() != null) {
            for (int i = 0; i < ctx.stmt_elsifs().a_expr().size(); i++) {
                goto_util.endElse();
            }
        }
        goto_util.endElse();
    }

    @Override
    public void exitProc_sect(PostgreSQLParser.Proc_sectContext ctx) {
        if (ctx.getParent() instanceof PostgreSQLParser.Stmt_ifContext ||
                ctx.getParent() instanceof PostgreSQLParser.Stmt_elsifsContext) {
            goto_util.endThen();
        }
    }

    @Override
    public void enterA_expr(PostgreSQLParser.A_exprContext ctx) {
        if (ctx.getParent() instanceof PostgreSQLParser.Stmt_elsifsContext) {
            goto_util.establishIfelseNode(getCondVarCtx(), ctx);
        }
    }

    // not in Fig Case-When
//    @Override
//    public void enterStmt_case(PostgreSQLParser.Stmt_caseContext ctx) {
//        for (PostgreSQLParser.Case_whenContext cw_ctx : ctx.case_when_list().case_when()) {
//            ParserRuleContext or_cond_ctx = new ParserRuleContext();
//            for (PostgreSQLParser.A_exprContext expr_ctx : cw_ctx.expr_list().a_expr()) {
//                if (cw_ctx.expr_list().a_expr().indexOf(expr_ctx) != 0) {
//                    or_cond_ctx.addChild(new TerminalNodeImpl(new PlSqlToken(OR, "OR")));
//                }
//                if (ctx.opt_expr_until_when() != null) {
//                    or_cond_ctx.addChild(ctx.opt_expr_until_when());
//                    or_cond_ctx.addChild(new TerminalNodeImpl(new PlSqlToken(EQUAL, "=")));
//                }
//                or_cond_ctx.addChild(expr_ctx);
//            }
//            goto_util.establishIfelseNode(getCondVarCtx(), or_cond_ctx);
//        }
//    }

    @Override
    public void enterCase_when(PostgreSQLParser.Case_whenContext ctx) {
        ParserRuleContext or_cond_ctx = new ParserRuleContext();
        for (PostgreSQLParser.A_exprContext expr_ctx : ctx.expr_list().a_expr()) {
            if (ctx.expr_list().a_expr().indexOf(expr_ctx) != 0) {
                or_cond_ctx.addChild(new TerminalNodeImpl(new PlSqlToken(OR, "OR")));
            }
            if (ctx.getParent().getParent() instanceof PostgreSQLParser.Stmt_caseContext) {
                PostgreSQLParser.Stmt_caseContext stmt_c = (PostgreSQLParser.Stmt_caseContext) ctx.getParent().getParent();
                if (stmt_c.opt_expr_until_when().sql_expression() != null) {
                    or_cond_ctx.addChild(stmt_c.opt_expr_until_when());
                    or_cond_ctx.addChild(new TerminalNodeImpl(new PlSqlToken(EQUAL, "=")));
                }
                or_cond_ctx.addChild(expr_ctx);
            }
            goto_util.establishIfelseNode(getCondVarCtx(), or_cond_ctx);
        }
    }

    @Override
    public void exitCase_when(PostgreSQLParser.Case_whenContext ctx) {
        goto_util.endThen();
    }

    @Override
    public void exitStmt_case(PostgreSQLParser.Stmt_caseContext ctx) {
        for (int i = 0; i < ctx.case_when_list().case_when().size(); i++) {
            goto_util.endElse();
        }
//        if (ctx.opt_case_else().ELSE() != null) {
//            goto_util.endElse();
//        }
    }

    // Fig.16 Return
    @Override
    public void enterStmt_return(PostgreSQLParser.Stmt_returnContext ctx) {
        if (debug_flag) {
            writeLog(PRINT, "RET:\t" + ctx.getText());
        }
        goto_util.establishReturnNode(ctx.opt_return_result());
    }
}
