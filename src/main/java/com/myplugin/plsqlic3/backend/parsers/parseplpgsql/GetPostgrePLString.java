package com.myplugin.plsqlic3.backend.parsers.parseplpgsql;

import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * According to PostgreSQL grammar parsers/parseplpgsql/PostgreSQLParser.g4
 * PL/pgSQL grammar is organized by a separate root node (line 19)
 * Design generic method to get PL/pgSQL strings from AST
 */
public class GetPostgrePLString {
    /**
     * Generic method to get PL/pgSQL strings from AST
     *
     * @param ctx CreatefunctionstmtContext in PostgreSQLParser
     * @return String of PL/pgSQL code in $$ ... $$ or " ... "
     */
    public static String getPostgrePLString(PostgreSQLParser.CreatefunctionstmtContext ctx) {
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
            StringBuilder sb_pl_str = new StringBuilder();
            // String of PL/pgSQL code in $$ ... $$
            if (func_as.def.anysconst().DollarText() != null && func_as.def.anysconst().StringConstant() == null) {
                for (TerminalNode dollarText : func_as.def.anysconst().DollarText()) {
                    sb_pl_str.append(dollarText.getText());
                }
                // String of PL/pgSQL code in " ... "
            } else if (func_as.def.anysconst().StringConstant() != null) {
                sb_pl_str.append(func_as.def.anysconst().StringConstant().getText(), 1, func_as.def.anysconst().StringConstant().getText().length() - 1);
            }
            return sb_pl_str.toString();
        }
        return null;
    }
}
