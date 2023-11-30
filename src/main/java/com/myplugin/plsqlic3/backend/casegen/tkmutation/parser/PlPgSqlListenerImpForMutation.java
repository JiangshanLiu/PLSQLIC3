package com.myplugin.plsqlic3.backend.casegen.tkmutation.parser;

import com.myplugin.plsqlic3.backend.casegen.tkmutation.util.MutationList;
import com.myplugin.plsqlic3.backend.casegen.tkmutation.util.enums.MUT_TYPE;
import com.myplugin.plsqlic3.backend.casegen.tkmutation.util.infonode.DeclareIdInfo;
import com.myplugin.plsqlic3.backend.casegen.tkmutation.util.infonode.MutationInfo;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;
import com.myplugin.plsqlic3.backend.parsers.parseplpgsql.PostgreSQLLexer;
import com.myplugin.plsqlic3.backend.parsers.parseplpgsql.PostgreSQLParser;
import com.myplugin.plsqlic3.backend.parsers.parseplpgsql.PostgreSQLParserBaseListener;

import static com.myplugin.plsqlic3.backend.casegen.tkmutation.ExecuteMutation.executeMutation;
import static com.myplugin.plsqlic3.backend.casegen.tkmutation.util.CasegenConstData.NUM_TYPE_SET;
import static com.myplugin.plsqlic3.backend.casegen.tkmutation.util.CasegenConstData.STR_TYPE_SET;
import static com.myplugin.plsqlic3.backend.casegen.tkmutation.util.ReflectionUtil.setCommonText;
import static com.myplugin.plsqlic3.backend.casegen.tkmutation.util.enums.CTX_ATTR.*;
import static com.myplugin.plsqlic3.backend.casegen.tkmutation.util.enums.MUT_TYPE.*;
import static com.myplugin.plsqlic3.backend.parsers.parseplpgsql.ERROR_MODE.EXCEPTION;
import static com.myplugin.plsqlic3.backend.parsers.parseplpgsql.GetPostgrePLString.getPostgrePLString;
import static com.myplugin.plsqlic3.backend.parsers.parseplpgsql.PostgreSQLParser.FALSE_P;
import static com.myplugin.plsqlic3.backend.parsers.parseplpgsql.PostgreSQLParser.TRUE_P;
import static com.myplugin.plsqlic3.backend.parsers.parserutil.parserutil.GeneralParserUtil.getFullTextByChildren;

public class PlPgSqlListenerImpForMutation extends PostgreSQLParserBaseListener {
    MutationList mut_list;
    private boolean in_mutable_var = false;
    // because select_with_parens can be wrapped recursively,
    // use wrapped layer to record if an identifier is in pl_stmt
    private int in_pl_stmt = 0;
    private ParseTree plsql_root = null;

    public PlPgSqlListenerImpForMutation() {
        this.mut_list = new MutationList();
    }

    PlPgSqlListenerImpForMutation(MutationList mut_lists) {
        this.mut_list = mut_lists;
    }

    // find PL/pgSQL function to establish a new parser
    @Override
    public void enterCreatefunctionstmt(PostgreSQLParser.CreatefunctionstmtContext ctx) {
        if (ctx.FUNCTION() != null) {
            String pl_string = getPostgrePLString(ctx);
            if (pl_string == null) {
                return;
            }
            try {
                PostgreSQLLexer lexer = new PostgreSQLLexer(CharStreams.fromString(pl_string));
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                PostgreSQLParser parser = new PostgreSQLParser(tokens);
                parser.setErrorMode(EXCEPTION);
                plsql_root = parser.plsqlroot();
                parser.removeErrorListeners();
                parser.setBuildParseTree(true);
                ParseTreeWalker walker = new ParseTreeWalker();
                PlPgSqlListenerImpForMutation listener = new PlPgSqlListenerImpForMutation(this.mut_list);
                walker.walk(listener, plsql_root);
            } catch (Exception ignore) {
            }
        }
    }

    @Override
    public void exitCreatefunctionstmt(PostgreSQLParser.CreatefunctionstmtContext ctx) {
        executeMutation(this.mut_list);
        if (ctx.FUNCTION() != null) {
            boolean if_plpgsql = false;
            PostgreSQLParser.Func_asContext func_as = null;
            for (PostgreSQLParser.Createfunc_opt_itemContext createfunc_opt : ctx.createfunc_opt_list().createfunc_opt_item()) {
                if (createfunc_opt.nonreservedword_or_sconst() != null &&
                        createfunc_opt.nonreservedword_or_sconst().getText().equalsIgnoreCase("plpgsql")) {
                    if_plpgsql = true;
                }
                if (createfunc_opt.AS() != null) {
                    func_as = createfunc_opt.func_as();
                }
            }
            if (if_plpgsql && func_as != null) {
                setCommonText((CommonToken) func_as.def.anysconst().DollarText(0).getSymbol(), getFullTextByChildren(plsql_root));
            }
        }
    }

    // record the type of vars
    @Override
    public void enterFunc_args_with_defaults_list(PostgreSQLParser.Func_args_with_defaults_listContext ctx) {
        if (ctx.func_arg_with_default() != null && ctx.func_arg_with_default().size() != 0) {
            for (PostgreSQLParser.Func_arg_with_defaultContext arg_ctx : ctx.func_arg_with_default()) {
                String type_name = arg_ctx.func_arg().func_type().getText();
                MUT_TYPE mut_type;
                if (NUM_TYPE_SET.containsKey(type_name)) {
                    mut_type = MUT_TYPE_NUM;
                } else if (STR_TYPE_SET.containsKey(type_name)) {
                    mut_type = MUT_TYPE_STR;
                } else {
                    mut_type = MUT_TYPE_OTHER;
                }
                boolean is_array = false;
                try {
                    is_array = arg_ctx.func_arg().func_type().typename().opt_array_bounds().OPEN_BRACKET().size() > 0;
                } catch (NullPointerException ignore) {
                }
                if (arg_ctx.func_arg().param_name() != null) {
                    mut_list.var_type_map.put(arg_ctx.func_arg().param_name().getText(), new DeclareIdInfo(type_name, mut_type, is_array));
                } else {
                    mut_list.var_type_map.put("$" + ctx.func_arg_with_default().indexOf(arg_ctx), new DeclareIdInfo(type_name, mut_type, is_array));
                }
            }
        }
    }

    @Override
    public void enterDecl_statement(PostgreSQLParser.Decl_statementContext ctx) {
        String type_name = ctx.decl_datatype().typename().simpletypename().getText();
        MUT_TYPE mut_type;
        if (NUM_TYPE_SET.containsKey(type_name)) {
            mut_type = MUT_TYPE_NUM;
        } else if (STR_TYPE_SET.containsKey(type_name)) {
            mut_type = MUT_TYPE_STR;
        } else {
            mut_type = MUT_TYPE_OTHER;
        }
        boolean is_array = false;
        try {
            is_array = ctx.decl_datatype().typename().opt_array_bounds().OPEN_BRACKET().size() > 0;
        } catch (NullPointerException ignore) {
        }
        mut_list.var_type_map.put(ctx.decl_varname().getText(), new DeclareIdInfo(type_name, mut_type, is_array));
    }

    // MUT_GMO.ABS
    // MUT_GMO.CSR
    // MUT_GMO.SVR
    // MUT_GMO.ACR
    @Override
    public void enterSql_expression(PostgreSQLParser.Sql_expressionContext ctx) {
        in_mutable_var = true;
    }

    @Override
    public void exitSql_expression(PostgreSQLParser.Sql_expressionContext ctx) {
        in_mutable_var = false;
    }

    @Override
    public void enterSelect_with_parens(PostgreSQLParser.Select_with_parensContext ctx) {
        in_pl_stmt++;
    }

    @Override
    public void exitSelect_with_parens(PostgreSQLParser.Select_with_parensContext ctx) {
        in_pl_stmt--;
    }

    @Override
    public void enterIdentifier(PostgreSQLParser.IdentifierContext ctx) {
        ParseTree id_tree;
        id_tree = ctx.Identifier();
        if (id_tree == null) {
            id_tree = ctx.QuotedIdentifier();
        }
        if (id_tree == null) {
            id_tree = ctx.UnicodeQuotedIdentifier();
        }
        if (id_tree == null) {
            try {
                id_tree = ctx.plsqlvariablename().PLSQLVARIABLENAME();
            } catch (NullPointerException ignore) {

            }
        }
        if (id_tree == null) {
            try {
                id_tree = ctx.plsqlidentifier().PLSQLIDENTIFIER();
            } catch (NullPointerException ignore) {

            }
        }
        if (id_tree == null) {
            try {
                id_tree = ctx.plsql_unreserved_keyword().children.get(0);
            } catch (NullPointerException ignore) {

            }
        }
        if (id_tree != null && mut_list.var_type_map.containsKey(ctx.getText())) {
            MutationInfo info = new MutationInfo(id_tree, mut_list.var_type_map.get(ctx.getText()));
            info.ctx_attr_map.compute(CTX_ATTR_PL, (key, value) -> in_pl_stmt == 0);
            info.ctx_attr_map.compute(CTX_ATTR_IDENTIFIER, (key, value) -> true);
            info.ctx_attr_map.compute(CTX_ATTR_MUTABLE, (key, value) -> in_mutable_var);
            mut_list.addParseTree(info);
        }
    }

    // MUT_GMO.AOR
    @Override
    public void enterMathop(PostgreSQLParser.MathopContext ctx) {
        if (ctx.PLUS() != null || ctx.MINUS() != null
                || ctx.STAR() != null || ctx.SLASH() != null || ctx.PERCENT() != null
                || ctx.CARET() != null) {
            MutationInfo info = new MutationInfo(ctx.children.get(0));
            info.ctx_attr_map.compute(CTX_ATTR_PL, (key, value) -> in_pl_stmt == 0);
            info.ctx_attr_map.compute(CTX_ATTR_MUTABLE, (key, value) -> in_mutable_var);
            info.ctx_attr_map.compute(CTX_ATTR_MATHOP, (key, value) -> true);
            mut_list.addParseTree(info);
        }
    }

    @Override
    public void enterA_expr_add(PostgreSQLParser.A_expr_addContext ctx) {
        if (ctx.PLUS() != null && ctx.PLUS().size() != 0) {
            for (TerminalNode tn : ctx.PLUS()) {
                MutationInfo info = new MutationInfo(tn);
                info.ctx_attr_map.compute(CTX_ATTR_PL, (key, value) -> in_pl_stmt == 0);
                info.ctx_attr_map.compute(CTX_ATTR_MUTABLE, (key, value) -> in_mutable_var);
                info.ctx_attr_map.compute(CTX_ATTR_MATHOP, (key, value) -> true);
                mut_list.addParseTree(info);
            }
        }
        if (ctx.MINUS() != null && ctx.MINUS().size() != 0) {
            for (TerminalNode tn : ctx.MINUS()) {
                MutationInfo info = new MutationInfo(tn);
                info.ctx_attr_map.compute(CTX_ATTR_PL, (key, value) -> in_pl_stmt == 0);
                info.ctx_attr_map.compute(CTX_ATTR_MUTABLE, (key, value) -> in_mutable_var);
                info.ctx_attr_map.compute(CTX_ATTR_MATHOP, (key, value) -> true);
                mut_list.addParseTree(info);
            }
        }
    }

    @Override
    public void enterA_expr_mul(PostgreSQLParser.A_expr_mulContext ctx) {
        if (ctx.STAR() != null && ctx.STAR().size() != 0) {
            for (TerminalNode tn : ctx.STAR()) {
                MutationInfo info = new MutationInfo(tn);
                info.ctx_attr_map.compute(CTX_ATTR_PL, (key, value) -> in_pl_stmt == 0);
                info.ctx_attr_map.compute(CTX_ATTR_MUTABLE, (key, value) -> in_mutable_var);
                info.ctx_attr_map.compute(CTX_ATTR_MATHOP, (key, value) -> true);
                mut_list.addParseTree(info);
            }
        }
        if (ctx.SLASH() != null && ctx.SLASH().size() != 0) {
            for (TerminalNode tn : ctx.SLASH()) {
                MutationInfo info = new MutationInfo(tn);
                info.ctx_attr_map.compute(CTX_ATTR_PL, (key, value) -> in_pl_stmt == 0);
                info.ctx_attr_map.compute(CTX_ATTR_MUTABLE, (key, value) -> in_mutable_var);
                info.ctx_attr_map.compute(CTX_ATTR_MATHOP, (key, value) -> true);
                mut_list.addParseTree(info);
            }
        }
        if (ctx.PERCENT() != null && ctx.PERCENT().size() != 0) {
            for (TerminalNode tn : ctx.PERCENT()) {
                MutationInfo info = new MutationInfo(tn);
                info.ctx_attr_map.compute(CTX_ATTR_PL, (key, value) -> in_pl_stmt == 0);
                info.ctx_attr_map.compute(CTX_ATTR_MUTABLE, (key, value) -> in_mutable_var);
                info.ctx_attr_map.compute(CTX_ATTR_MATHOP, (key, value) -> true);
                mut_list.addParseTree(info);
            }
        }
    }

    @Override
    public void enterA_expr_caret(PostgreSQLParser.A_expr_caretContext ctx) {
        MutationInfo info = new MutationInfo(ctx.CARET());
        info.ctx_attr_map.compute(CTX_ATTR_PL, (key, value) -> in_pl_stmt == 0);
        info.ctx_attr_map.compute(CTX_ATTR_MUTABLE, (key, value) -> in_mutable_var);
        info.ctx_attr_map.compute(CTX_ATTR_MATHOP, (key, value) -> true);
        mut_list.addParseTree(info);
    }

    // MUT_GMO.CRP
    @Override
    public void enterAnysconst(PostgreSQLParser.AnysconstContext ctx) {
        if (ctx.StringConstant() != null) {
            MutationInfo info = new MutationInfo(ctx.StringConstant(),
                    new DeclareIdInfo("text", MUT_TYPE_STR, false));
            info.ctx_attr_map.compute(CTX_ATTR_PL, (key, value) -> in_pl_stmt == 0);
            info.ctx_attr_map.compute(CTX_ATTR_MUTABLE, (key, value) -> in_mutable_var);
            info.ctx_attr_map.compute(CTX_ATTR_CONSTSTR, (key, value) -> true);
            mut_list.addParseTree(info);
        }
        if (ctx.UnicodeEscapeStringConstant() != null) {
            MutationInfo info = new MutationInfo(ctx.UnicodeEscapeStringConstant(),
                    new DeclareIdInfo("text", MUT_TYPE_STR, false));
            info.ctx_attr_map.compute(CTX_ATTR_PL, (key, value) -> in_pl_stmt == 0);
            info.ctx_attr_map.compute(CTX_ATTR_MUTABLE, (key, value) -> in_mutable_var);
            info.ctx_attr_map.compute(CTX_ATTR_CONSTSTR, (key, value) -> true);
            mut_list.addParseTree(info);
        }
        if (ctx.EscapeStringConstant() != null) {
            MutationInfo info = new MutationInfo(ctx.EscapeStringConstant(),
                    new DeclareIdInfo("text", MUT_TYPE_STR, false));
            info.ctx_attr_map.compute(CTX_ATTR_PL, (key, value) -> in_pl_stmt == 0);
            info.ctx_attr_map.compute(CTX_ATTR_MUTABLE, (key, value) -> in_mutable_var);
            info.ctx_attr_map.compute(CTX_ATTR_CONSTSTR, (key, value) -> true);
            mut_list.addParseTree(info);
        }
    }

    // MUT_GMO.SCR
    @Override
    public void enterIconst(PostgreSQLParser.IconstContext ctx) {
        if (ctx.Integral() != null) {
            MutationInfo info = new MutationInfo(ctx.Integral(),
                    new DeclareIdInfo("integer", MUT_TYPE_NUM, false));
            info.ctx_attr_map.compute(CTX_ATTR_PL, (key, value) -> in_pl_stmt == 0);
            info.ctx_attr_map.compute(CTX_ATTR_MUTABLE, (key, value) -> in_mutable_var);
            info.ctx_attr_map.compute(CTX_ATTR_CONSTSCAL, (key, value) -> true);
            mut_list.addParseTree(info);
        }
    }

    @Override
    public void enterFconst(PostgreSQLParser.FconstContext ctx) {
        if (ctx.Numeric() != null) {
            MutationInfo info = new MutationInfo(ctx.Numeric(),
                    new DeclareIdInfo("numeric", MUT_TYPE_NUM, false));
            info.ctx_attr_map.compute(CTX_ATTR_PL, (key, value) -> in_pl_stmt == 0);
            info.ctx_attr_map.compute(CTX_ATTR_MUTABLE, (key, value) -> in_mutable_var);
            info.ctx_attr_map.compute(CTX_ATTR_CONSTSCAL, (key, value) -> true);
            mut_list.addParseTree(info);
        }
    }

    // MUT_GMO.LCR
    @Override
    public void enterA_expr_or(PostgreSQLParser.A_expr_orContext ctx) {
        if (ctx.OR() != null && ctx.OR().size() != 0) {
            for (TerminalNode tn : ctx.OR()) {
                MutationInfo info = new MutationInfo(tn);
                info.ctx_attr_map.compute(CTX_ATTR_PL, (key, value) -> in_pl_stmt == 0);
                info.ctx_attr_map.compute(CTX_ATTR_MUTABLE, (key, value) -> in_mutable_var);
                info.ctx_attr_map.compute(CTX_ATTR_LOGICALOP, (key, value) -> true);
                mut_list.addParseTree(info);
            }
        }
    }

    @Override
    public void enterA_expr_and(PostgreSQLParser.A_expr_andContext ctx) {
        if (ctx.AND() != null && ctx.AND().size() != 0) {
            for (TerminalNode tn : ctx.AND()) {
                MutationInfo info = new MutationInfo(tn);
                info.ctx_attr_map.compute(CTX_ATTR_PL, (key, value) -> in_pl_stmt == 0);
                info.ctx_attr_map.compute(CTX_ATTR_MUTABLE, (key, value) -> in_mutable_var);
                info.ctx_attr_map.compute(CTX_ATTR_LOGICALOP, (key, value) -> true);
                mut_list.addParseTree(info);
            }
        }
    }

    // MUT_GMO.ROR
    @Override
    public void enterA_expr_compare(PostgreSQLParser.A_expr_compareContext ctx) {
        if (ctx.LT() != null) {
            MutationInfo info = new MutationInfo(ctx.LT());
            info.ctx_attr_map.compute(CTX_ATTR_PL, (key, value) -> in_pl_stmt == 0);
            info.ctx_attr_map.compute(CTX_ATTR_MUTABLE, (key, value) -> in_mutable_var);
            info.ctx_attr_map.compute(CTX_ATTR_RELATIONOP, (key, value) -> true);
            mut_list.addParseTree(info);
        }
        if (ctx.GT() != null) {
            MutationInfo info = new MutationInfo(ctx.GT());
            info.ctx_attr_map.compute(CTX_ATTR_PL, (key, value) -> in_pl_stmt == 0);
            info.ctx_attr_map.compute(CTX_ATTR_MUTABLE, (key, value) -> in_mutable_var);
            info.ctx_attr_map.compute(CTX_ATTR_RELATIONOP, (key, value) -> true);
            mut_list.addParseTree(info);
        }
        if (ctx.EQUAL() != null) {
            MutationInfo info = new MutationInfo(ctx.EQUAL());
            info.ctx_attr_map.compute(CTX_ATTR_PL, (key, value) -> in_pl_stmt == 0);
            info.ctx_attr_map.compute(CTX_ATTR_MUTABLE, (key, value) -> in_mutable_var);
            info.ctx_attr_map.compute(CTX_ATTR_RELATIONOP, (key, value) -> true);
            mut_list.addParseTree(info);
        }
        if (ctx.LESS_EQUALS() != null) {
            MutationInfo info = new MutationInfo(ctx.LESS_EQUALS());
            info.ctx_attr_map.compute(CTX_ATTR_PL, (key, value) -> in_pl_stmt == 0);
            info.ctx_attr_map.compute(CTX_ATTR_MUTABLE, (key, value) -> in_mutable_var);
            info.ctx_attr_map.compute(CTX_ATTR_RELATIONOP, (key, value) -> true);
            mut_list.addParseTree(info);
        }
        if (ctx.GREATER_EQUALS() != null) {
            MutationInfo info = new MutationInfo(ctx.GREATER_EQUALS());
            info.ctx_attr_map.compute(CTX_ATTR_PL, (key, value) -> in_pl_stmt == 0);
            info.ctx_attr_map.compute(CTX_ATTR_MUTABLE, (key, value) -> in_mutable_var);
            info.ctx_attr_map.compute(CTX_ATTR_RELATIONOP, (key, value) -> true);
            mut_list.addParseTree(info);
        }
        if (ctx.NOT_EQUALS() != null) {
            MutationInfo info = new MutationInfo(ctx.NOT_EQUALS());
            info.ctx_attr_map.compute(CTX_ATTR_PL, (key, value) -> in_pl_stmt == 0);
            info.ctx_attr_map.compute(CTX_ATTR_MUTABLE, (key, value) -> in_mutable_var);
            info.ctx_attr_map.compute(CTX_ATTR_RELATIONOP, (key, value) -> true);
            mut_list.addParseTree(info);
        }
    }

    // MUT_GMO.RSR
    @Override
    public void enterOpt_return_result(PostgreSQLParser.Opt_return_resultContext ctx) {
    }

    // MUT_GMO.PCC
    @Override
    public void enterTypename(PostgreSQLParser.TypenameContext ctx) {
        if (ctx.simpletypename() != null) {
            MutationInfo info = new MutationInfo(ctx.simpletypename());
            info.ctx_attr_map.compute(CTX_ATTR_PL, (key, value) -> in_pl_stmt == 0);
            info.ctx_attr_map.compute(CTX_ATTR_MUTABLE, (key, value) -> in_mutable_var);
            info.ctx_attr_map.compute(CTX_ATTR_TYPENAME, (key, value) -> true);
            mut_list.addParseTree(info);
        }
    }

    // MUT_GMO.AAR
    // MUT_GMO.CAR
    @Override
    public void enterIndirection_el(PostgreSQLParser.Indirection_elContext ctx) {
        if (ctx.CLOSE_BRACKET() != null) {
            MutationInfo info = new MutationInfo(ctx.CLOSE_BRACKET());
            info.ctx_attr_map.compute(CTX_ATTR_PL, (key, value) -> in_pl_stmt == 0);
            info.ctx_attr_map.compute(CTX_ATTR_MUTABLE, (key, value) -> in_mutable_var);
            info.ctx_attr_map.compute(CTX_ATTR_ARRCLOSEBRACKET, (key, value) -> true);
            mut_list.addParseTree(info);
        }
    }

    @Override
    public void enterAssign_var(PostgreSQLParser.Assign_varContext ctx) {
        if (ctx.CLOSE_BRACKET() != null && ctx.CLOSE_BRACKET().size() != 0) {
            for (TerminalNode close_bracket : ctx.CLOSE_BRACKET()) {
                MutationInfo info = new MutationInfo(close_bracket);
                info.ctx_attr_map.compute(CTX_ATTR_PL, (key, value) -> in_pl_stmt == 0);
                info.ctx_attr_map.compute(CTX_ATTR_MUTABLE, (key, value) -> in_mutable_var);
                info.ctx_attr_map.compute(CTX_ATTR_ARRCLOSEBRACKET, (key, value) -> true);
                mut_list.addParseTree(info);
            }
            MutationInfo info = new MutationInfo(ctx,
                    mut_list.var_type_map.get(ctx.any_name() != null ? ctx.any_name().getText() : ctx.PARAM().getText()));
            info.ctx_attr_map.compute(CTX_ATTR_PL, (key, value) -> in_pl_stmt == 0);
            info.ctx_attr_map.compute(CTX_ATTR_MUTABLE, (key, value) -> in_mutable_var);
            info.ctx_attr_map.compute(CTX_ATTR_ARRVAR, (key, value) -> true);
            mut_list.addParseTree(info);
        }
    }

    @Override
    public void enterColumnref(PostgreSQLParser.ColumnrefContext ctx) {
        boolean is_arr = false;
        if (ctx.indirection() != null && ctx.indirection().indirection_el() != null) {
            for (PostgreSQLParser.Indirection_elContext indirectionElContext : ctx.indirection().indirection_el()) {
                if (indirectionElContext.CLOSE_BRACKET() != null) {
                    is_arr = true;
                }
            }
        }
        if (is_arr) {
            MutationInfo info = new MutationInfo(ctx, mut_list.var_type_map.get(ctx.colid().getText()));
            info.ctx_attr_map.compute(CTX_ATTR_PL, (key, value) -> in_pl_stmt == 0);
            info.ctx_attr_map.compute(CTX_ATTR_MUTABLE, (key, value) -> in_mutable_var);
            info.ctx_attr_map.compute(CTX_ATTR_ARRVAR, (key, value) -> true);
            mut_list.addParseTree(info);
        }
    }

    // MUT_GMO.SCR
    @Override
    public void visitTerminal(TerminalNode node) {
        if (node.getSymbol().getType() == TRUE_P || node.getSymbol().getType() == FALSE_P) {
            MutationInfo info = new MutationInfo(node,
                    new DeclareIdInfo("boolean", MUT_TYPE_NUM, false));
            info.ctx_attr_map.compute(CTX_ATTR_PL, (key, value) -> in_pl_stmt == 0);
            info.ctx_attr_map.compute(CTX_ATTR_MUTABLE, (key, value) -> in_mutable_var);
            info.ctx_attr_map.compute(CTX_ATTR_CONSTSCAL, (key, value) -> true);
            mut_list.addParseTree(info);
        }
    }
}
