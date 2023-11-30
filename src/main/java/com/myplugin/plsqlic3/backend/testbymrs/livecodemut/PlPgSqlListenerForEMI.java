package com.myplugin.plsqlic3.backend.testbymrs.livecodemut;

import org.apache.commons.lang3.tuple.Pair;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;
import com.myplugin.plsqlic3.backend.parsers.parseplpgsql.PostgreSQLLexer;
import com.myplugin.plsqlic3.backend.parsers.parseplpgsql.PostgreSQLParser;
import com.myplugin.plsqlic3.backend.parsers.parseplpgsql.PostgreSQLParserBaseListener;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static com.myplugin.plsqlic3.backend.casegen.tkmutation.util.ReflectionUtil.setCommonText;
import static com.myplugin.plsqlic3.backend.parsers.parseplpgsql.ERROR_MODE.EXCEPTION;
import static com.myplugin.plsqlic3.backend.parsers.parseplpgsql.GetPostgrePLString.getPostgrePLString;
import static com.myplugin.plsqlic3.backend.parsers.parseplpgsql.PostgreSQLLexer.Identifier;
import static com.myplugin.plsqlic3.backend.parsers.parserutil.parserutil.GeneralParserUtil.getFullTextByChildren;
import static com.myplugin.plsqlic3.backend.randatagen.GenerateRandom.getRandom;
import static com.myplugin.plsqlic3.backend.testbymrs.livecodemut.ExecProfile.*;

public class PlPgSqlListenerForEMI extends PostgreSQLParserBaseListener {
    ArrayList<PostgreSQLParser.Proc_stmtContext> stmtContexts = new ArrayList<>();
    private ParseTree plsql_root = null;
    ExecProfile prof;

    PlPgSqlListenerForEMI(ExecProfile prof) {
        this.prof = prof;
    }

    @Override
    public void enterProc_stmt(PostgreSQLParser.Proc_stmtContext ctx) {
        if (ctx.stmt_return() == null) {
            stmtContexts.add(ctx);
        }
    }

    @Override
    public void enterCreatefunctionstmt(PostgreSQLParser.CreatefunctionstmtContext ctx) {
        if (ctx.FUNCTION() != null) {
            prof.func_name = ctx.func_name().getText();
            PostgreSQLParser.Func_args_with_defaults_listContext arg_list = ctx.func_args_with_defaults().func_args_with_defaults_list();
            if (arg_list != null) {
                int param_index = 1;
                for (PostgreSQLParser.Func_arg_with_defaultContext arg : arg_list.func_arg_with_default()) {
                    String type_name_str = getFullTextByChildren(arg.func_arg().func_type().typename()).trim();
                    if (arg.func_arg().param_name() != null) {
                        prof.arg_list.put(arg.func_arg().param_name().type_function_name().getText(),
                                Pair.of(arg.func_arg().func_type().typename(), getRandom(arg.func_arg().func_type().typename())));
                        if (basic_numeric.contains(type_name_str) ||
                                basic_character.contains(type_name_str) ||
                                basic_boolean.contains(type_name_str)) {
                            prof.profile.put(arg.func_arg().param_name().getText(),
                                    Pair.of(arg.func_arg().func_type().typename(), new ArrayList<>()));
                        }
                    } else {
                        prof.arg_list.put("$" + param_index,
                                Pair.of(arg.func_arg().func_type().typename(), getRandom(arg.func_arg().func_type().typename())));
                        if (basic_numeric.contains(type_name_str) ||
                                basic_character.contains(type_name_str) ||
                                basic_boolean.contains(type_name_str)) {
                            prof.profile.put("$" + param_index,
                                    Pair.of(arg.func_arg().func_type().typename(), new ArrayList<>()));
                        }
                    }
                    param_index++;
                }
            }

            String pl_string = getPostgrePLString(ctx);
            if (pl_string == null) {
                return;
            }
            PostgreSQLLexer lexer = new PostgreSQLLexer(CharStreams.fromString(pl_string));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            PostgreSQLParser parser = new PostgreSQLParser(tokens);
            parser.setErrorMode(EXCEPTION);
            plsql_root = parser.plsqlroot();
            parser.setBuildParseTree(true);
            ParseTreeWalker walker = new ParseTreeWalker();
            PlPgSqlListenerForEMI listener = this;
            walker.walk(listener, plsql_root);
        }
    }

    @Override
    public void exitCreatefunctionstmt(PostgreSQLParser.CreatefunctionstmtContext ctx) {
        String STX = new String(new byte[]{0x02}, StandardCharsets.UTF_8);
        String ETX = new String(new byte[]{0x03}, StandardCharsets.UTF_8);
        if (stmtContexts.size() > 0) {
            int index = new Random().nextInt(stmtContexts.size());
            List<ParseTree> children = stmtContexts.get(index).getParent().children;
            children.add(children.indexOf(stmtContexts.get(index)), new TerminalNodeImpl(new CommonToken(Identifier, STX)));
            children.add(children.indexOf(stmtContexts.get(index)) + 1, new TerminalNodeImpl(new CommonToken(Identifier, ETX)));
        }

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

    @Override
    public void enterDecl_statement(PostgreSQLParser.Decl_statementContext ctx) {
        String type_name_str = getFullTextByChildren(ctx.decl_datatype().typename()).trim();
        if (basic_numeric.contains(type_name_str) ||
                basic_character.contains(type_name_str) ||
                basic_boolean.contains(type_name_str)) {
            prof.profile.put(ctx.decl_varname().getText(),
                    Pair.of(ctx.decl_datatype().typename(), new ArrayList<>()));
        }
    }
}
