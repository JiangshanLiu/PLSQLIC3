package com.myplugin.plsqlic3.backend.parsers.parserutil.parserutil;

import org.antlr.v4.runtime.ParserRuleContext;
import com.myplugin.plsqlic3.backend.parsers.parseplpgsql.PostgreSQLParser;
import com.myplugin.plsqlic3.backend.runnable.GlobalConfig;

import java.util.HashMap;

public class PlPgSqlParserUtil {
    public static HashMap<ParserRuleContext, ParserRuleContext> selectIntoDecl(PostgreSQLParser.Simple_selectContext ctx) {
        HashMap<ParserRuleContext, ParserRuleContext> select_into = new HashMap<>();
        for (PostgreSQLParser.Into_clauseContext into : ctx.into_clause()) {
            if (into.children != null) {
                if (into.opttempTableName() != null) {
                    PostgreSQLParser.OpttempTableNameContext table_name = into.opttempTableName();
                    ctx.children.remove(into);
                    select_into.put(table_name, ctx);
//                    System.out.println(table_name.getText());
//                    System.out.println(ctx.getText());
                } else if (into.into_target() != null) {
                    PostgreSQLParser.Expr_listContext expr_list = into.into_target().expr_list();
                    ctx.children.remove(into);
                    select_into.put(expr_list, ctx);
//                    System.out.println(expr_list.getText());
//                    System.out.println(ctx.getText());
                }
            }
        }
        return select_into;
    }

    /**
     * Determine if the type corresponding to the type name node in AST is the SQL standard base type
     *
     * @param ctx type name node in AST
     * @return if a basic type
     */
    public static boolean ifTypeBasic(ParserRuleContext ctx) {
        switch (GlobalConfig.db_type) {
            case POSTGRES:
            case GAUSSDB:
                assert ctx instanceof PostgreSQLParser.TypenameContext;
//            try {
                if (((PostgreSQLParser.TypenameContext) ctx).simpletypename() == null
                        || ((PostgreSQLParser.TypenameContext) ctx).simpletypename().generictype() != null) {
                    return false;
                }
                return ((PostgreSQLParser.TypenameContext) ctx).simpletypename().numeric() != null
                        || ((PostgreSQLParser.TypenameContext) ctx).simpletypename().bit() != null
                        || ((PostgreSQLParser.TypenameContext) ctx).simpletypename().character() != null
                        || ((PostgreSQLParser.TypenameContext) ctx).simpletypename().constdatetime() != null
                        || ((PostgreSQLParser.TypenameContext) ctx).simpletypename().constinterval() != null;
//            } catch (NullPointerException e) {
//                System.out.println(e);
//            }
            case ORACLE:
                return false;
        }
        return false;
    }
}
