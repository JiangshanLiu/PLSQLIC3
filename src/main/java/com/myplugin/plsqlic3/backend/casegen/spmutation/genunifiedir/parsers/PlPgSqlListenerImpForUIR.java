package com.myplugin.plsqlic3.backend.casegen.spmutation.genunifiedir.parsers;

import com.myplugin.plsqlic3.backend.casegen.spmutation.genunifiedir.unifiedirnode.*;
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

import java.util.*;

import static com.myplugin.plsqlic3.backend.parsers.parseplpgsql.ERROR_MODE.EXCEPTION;
import static com.myplugin.plsqlic3.backend.parsers.parseplpgsql.GetPostgrePLString.getPostgrePLString;
import static com.myplugin.plsqlic3.backend.parsers.parseplpgsql.PostgreSQLLexer.Identifier;
import static com.myplugin.plsqlic3.backend.parsers.parseplpgsql.PostgreSQLParser.BEGIN_P;
import static com.myplugin.plsqlic3.backend.parsers.parserutil.parserutil.PlPgSqlParserUtil.selectIntoDecl;
import static com.myplugin.plsqlic3.backend.runnable.GlobalConfig.anonymous_dollar_var_id;

public class PlPgSqlListenerImpForUIR extends PostgreSQLParserBaseListener {
    private final Stack<ArrayList<AbstractUirNode>> stack_curr_list = new Stack<>();

    public PlPgSqlListenerImpForUIR(ArrayList<AbstractUirNode> uir_list) {
        this.stack_curr_list.push(uir_list);
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        if (node.getSymbol().getType() == BEGIN_P) {
            stack_curr_list.peek().add(new BeginKWUirNode());
        }
    }

    @Override
    public void enterCreatefunctionstmt(PostgreSQLParser.CreatefunctionstmtContext ctx) {
        if (ctx.FUNCTION() != null) {
            FuncSignUirNode funcSignUirNode = new FuncSignUirNode();
            funcSignUirNode.full_func_name = ctx.func_name().getText();
            if (ctx.func_name().type_function_name() != null) {
                funcSignUirNode.func_name = ctx.func_name().type_function_name().getText();
            } else {
                List<PostgreSQLParser.Indirection_elContext> indirection_list = ctx.func_name().indirection().indirection_el();
                funcSignUirNode.func_name = indirection_list.get(indirection_list.size() - 1).attr_name().getText();
            }
            PostgreSQLParser.Func_args_with_defaults_listContext arg_list = ctx.func_args_with_defaults().func_args_with_defaults_list();
            if (arg_list != null) {
                int param_index = 1;
                for (PostgreSQLParser.Func_arg_with_defaultContext arg : arg_list.func_arg_with_default()) {
                    if (arg.func_arg().param_name() != null) {
                        if (arg.func_arg().param_name().type_function_name().identifier() != null) {
                            funcSignUirNode.arg_list.put(arg.func_arg().param_name().type_function_name().identifier().Identifier(),
                                    arg.func_arg().func_type().typename());
                        } else {
                            funcSignUirNode.arg_list.put(new TerminalNodeImpl(new PlSqlToken(Identifier, arg.func_arg().param_name().type_function_name().getText())),
                                    arg.func_arg().func_type().typename());
                        }
                    } else {
                        funcSignUirNode.arg_list.put(new TerminalNodeImpl(new PlSqlToken(Identifier, anonymous_dollar_var_id + param_index)),
                                arg.func_arg().func_type().typename());
                    }
                    // bug here: keyword as identifier
//                    if (arg.a_expr() != null) {
//                        goto_util.establishAssignNode(arg.func_arg().param_name(), arg.a_expr(), true);
//                    }
                    param_index++;
                }
            }
            funcSignUirNode.ret_type = ctx.func_return();
            stack_curr_list.peek().add(funcSignUirNode);

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
            PlPgSqlListenerImpForUIR listener = this;
            walker.walk(listener, plsqlroot);
        }
    }

    @Override
    public void exitCreatefunctionstmt(PostgreSQLParser.CreatefunctionstmtContext ctx) {
        stack_curr_list.peek().add(new EndKWUirNode());
    }

    @Override
    public void enterDecl_start(PostgreSQLParser.Decl_startContext ctx) {
        if (ctx.DECLARE() != null) {
            stack_curr_list.peek().add(new DeclareKWUirNode());
        }
    }

    @Override
    public void enterDecl_statement(PostgreSQLParser.Decl_statementContext ctx) {
        DeclareUirNode declareUirNode = new DeclareUirNode();
        declareUirNode.var_name = ctx.decl_varname().getText();
        declareUirNode.var_type = ctx.decl_datatype().typename();
        try {
            if (ctx.decl_defval().sql_expression() != null) {
                declareUirNode.var_default_val = ctx.decl_defval().sql_expression();
            }
        } catch (NullPointerException ignored) {
        }
        stack_curr_list.peek().add(declareUirNode);
    }

    @Override
    public void enterStmt_assign(PostgreSQLParser.Stmt_assignContext ctx) {
        AssignUirNode assignUirNode = new AssignUirNode();
        assignUirNode.identifier = ctx.assign_var();
        assignUirNode.expression = ctx.sql_expression();
        stack_curr_list.peek().add(assignUirNode);
    }

    @Override
    public void enterStmt_execsql(PostgreSQLParser.Stmt_execsqlContext ctx) {
        try {
            if (ctx.make_execsql_stmt().stmt().selectstmt().select_no_parens().select_clause().simple_select() != null) {
                HashMap<ParserRuleContext, ParserRuleContext> select_intos =
                        selectIntoDecl(ctx.make_execsql_stmt().stmt().selectstmt().select_no_parens().select_clause().simple_select());
                for (ParserRuleContext select_into_var : select_intos.keySet()) {
                    AssignUirNode assignUirNode = new AssignUirNode();
                    assignUirNode.identifier = select_into_var;
                    assignUirNode.expression = select_intos.get(select_into_var);
                    stack_curr_list.peek().add(assignUirNode);
                }
            }
        } catch (NullPointerException ignored) {
        }
    }

    @Override
    public void enterStmt_loop(PostgreSQLParser.Stmt_loopContext ctx) {
        LoopUirNode loopUirNode = new LoopUirNode();
        loopUirNode.loop_body = new ArrayList<>();
        stack_curr_list.peek().add(loopUirNode);
        stack_curr_list.push(loopUirNode.loop_body);
    }

    @Override
    public void exitStmt_loop(PostgreSQLParser.Stmt_loopContext ctx) {
        stack_curr_list.pop();
    }

    @Override
    public void enterStmt_while(PostgreSQLParser.Stmt_whileContext ctx) {
        WhileUirNode whileUirNode = new WhileUirNode();
        whileUirNode.loop_cond = ctx.expr_until_loop();
        whileUirNode.loop_body = new ArrayList<>();
        stack_curr_list.peek().add(whileUirNode);
        stack_curr_list.push(whileUirNode.loop_body);
    }

    @Override
    public void exitStmt_while(PostgreSQLParser.Stmt_whileContext ctx) {
        stack_curr_list.pop();
    }

    @Override
    public void enterStmt_for(PostgreSQLParser.Stmt_forContext ctx) {
        ForUirNode forUirNode = new ForUirNode();
        forUirNode.loop_var = ctx.for_control().for_variable();
        if (ctx.for_control().selectstmt() != null) {
            forUirNode.loop_select = ctx.for_control().selectstmt();
        } else if (ctx.for_control().DOT_DOT() != null) {
            forUirNode.loop_low_bound = ctx.for_control().a_expr(0);
            forUirNode.loop_up_bound = ctx.for_control().a_expr(1);
        }
        forUirNode.loop_body = new ArrayList<>();
        stack_curr_list.peek().add(forUirNode);
        stack_curr_list.push(forUirNode.loop_body);
    }

    @Override
    public void exitStmt_for(PostgreSQLParser.Stmt_forContext ctx) {
        stack_curr_list.pop();
    }

    @Override
    public void enterStmt_foreach_a(PostgreSQLParser.Stmt_foreach_aContext ctx) {
        ForeachUirNode foreachUirNode = new ForeachUirNode();
        foreachUirNode.loop_var = ctx.for_variable();
        foreachUirNode.loop_set = ctx.a_expr();
        stack_curr_list.peek().add(foreachUirNode);
        stack_curr_list.push(foreachUirNode.loop_body);
    }

    @Override
    public void exitStmt_foreach_a(PostgreSQLParser.Stmt_foreach_aContext ctx) {
        stack_curr_list.pop();
    }

    @Override
    public void enterStmt_exit(PostgreSQLParser.Stmt_exitContext ctx) {
        if (ctx.exit_type().EXIT() != null) {
            stack_curr_list.peek().add(new ExitUirNode());
        } else if (ctx.exit_type().CONTINUE_P() != null) {
            stack_curr_list.peek().add(new ContinueUirNode());
        }
    }

    @Override
    public void enterStmt_if(PostgreSQLParser.Stmt_ifContext ctx) {
        IfelseUirNode ifelseUirNode = new IfelseUirNode();
        ifelseUirNode.ifelse_map = new LinkedHashMap<>();
        ifelseUirNode.ifelse_map.put(ctx.expr_until_then(), new ArrayList<>());
        if (ctx.stmt_elsifs().a_expr().size() != 0) {
            for (int i = 0; i < ctx.stmt_elsifs().a_expr().size(); i++) {
                ifelseUirNode.ifelse_map.put(ctx.stmt_elsifs().a_expr().get(i), new ArrayList<>());
            }
        }
        if (ctx.stmt_else().proc_sect() != null) {
            ifelseUirNode.ifelse_map.put(null, new ArrayList<>());
        }
        stack_curr_list.peek().add(ifelseUirNode);
        // Push the branches into the stack in reverse order
        if (ctx.stmt_else().proc_sect() != null) {
            stack_curr_list.push(ifelseUirNode.ifelse_map.get(null));
        }
        if (ctx.stmt_elsifs().a_expr().size() != 0) {
            for (int i = ctx.stmt_elsifs().a_expr().size(); i >= 0; i--) {
                stack_curr_list.push(ifelseUirNode.ifelse_map.get(ctx.stmt_elsifs().a_expr().get(i)));
            }
        }
        stack_curr_list.push(ifelseUirNode.ifelse_map.get(ctx.expr_until_then()));
    }

    @Override
    public void exitProc_sect(PostgreSQLParser.Proc_sectContext ctx) {
        if (ctx.getParent() instanceof PostgreSQLParser.Stmt_ifContext ||
                ctx.getParent() instanceof PostgreSQLParser.Stmt_elsifsContext ||
                ctx.getParent() instanceof PostgreSQLParser.Stmt_elseContext ||
                ctx.getParent() instanceof PostgreSQLParser.Case_whenContext ||
                ctx.getParent() instanceof PostgreSQLParser.Opt_case_elseContext) {
            stack_curr_list.pop();
        }
    }

    @Override
    public void enterStmt_case(PostgreSQLParser.Stmt_caseContext ctx) {
        CaseUirNode caseUirNode = new CaseUirNode();
        if (ctx.opt_expr_until_when().sql_expression() != null) {
            caseUirNode.switch_var = ctx.opt_expr_until_when().sql_expression();
        }
        caseUirNode.case_map = new LinkedHashMap<>();
        for (int i = 0; i < ctx.case_when_list().case_when().size(); i++) {
            caseUirNode.case_map.put(ctx.case_when_list().case_when().get(i).expr_list(), new ArrayList<>());
        }
        if (ctx.opt_case_else().proc_sect() != null) {
            caseUirNode.case_map.put(null, new ArrayList<>());
        }
        stack_curr_list.peek().add(caseUirNode);
        // Push the branches into the stack in reverse order
        if (ctx.opt_case_else().proc_sect() != null) {
            stack_curr_list.push(caseUirNode.case_map.get(null));
        }
        for (int i = ctx.case_when_list().case_when().size(); i >= 0; i--) {
            stack_curr_list.push(caseUirNode.case_map.get(ctx.case_when_list().case_when().get(i).expr_list()));
        }
    }

    @Override
    public void enterStmt_return(PostgreSQLParser.Stmt_returnContext ctx) {
        ReturnUirNode returnUirNode = new ReturnUirNode();
        if (ctx.opt_return_result().sql_expression() != null) {
            returnUirNode.ret_val = ctx.opt_return_result();
        }
        stack_curr_list.peek().add(returnUirNode);
    }
}
