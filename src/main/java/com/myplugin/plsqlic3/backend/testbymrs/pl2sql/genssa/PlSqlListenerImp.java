package com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa;

import com.myplugin.plsqlic3.backend.parsers.parseplsql.PlSqlParser;
import com.myplugin.plsqlic3.backend.parsers.parseplsql.PlSqlParserBaseListener;

import static com.myplugin.plsqlic3.backend.runnable.LogToFile.LOG_TYPE.PRINT;
import static com.myplugin.plsqlic3.backend.runnable.LogToFile.writeLog;
import static com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa.ssanode.AssignExprType.ASSIGN_EXPR;

class PlSqlListenerImp extends PlSqlParserBaseListener {
    private final GotoUtil goto_util;
    private final boolean debug_flag = false;

    public PlSqlListenerImp(GotoUtil goto_util) {
        this.goto_util = goto_util;
    }

    // Fig.16 Decl
    // Fig.16 Decl0
    @Override
    public void enterVariable_declaration(PlSqlParser.Variable_declarationContext ctx) {
        if (debug_flag) {
            writeLog(PRINT, "DCL:\t" + ctx.getText());
        }
        try {
            goto_util.establishAssignNode(ctx.identifier(), ctx.default_value_part().expression(), ASSIGN_EXPR);
        } catch (NullPointerException ignored) {
        }
    }

    // Fig.16 Assign
    @Override
    public void enterAssignment_statement(PlSqlParser.Assignment_statementContext ctx) {
        if (debug_flag) {
            writeLog(PRINT, "ASN:\t" + ctx.getText());
        }
        goto_util.establishAssignNode(ctx.general_element(), ctx.expression(), ASSIGN_EXPR);
    }

    // Fig.16 Iter
    // Note that it's not Override, the statement is not in the ANTLR g4 grammar
    // Generic implementation is in class GenerateGotoUtil

    // Fig.16 Loop
    // Fig.16 While
    // Fig.16 For
    @Override
    public void enterLoop_statement(PlSqlParser.Loop_statementContext ctx) {
        if (debug_flag) {
            writeLog(PRINT, "LOP:\t" + ctx.getText());
        }
    }

    // Fig.16 Exit
    @Override
    public void enterExit_statement(PlSqlParser.Exit_statementContext ctx) {
        if (debug_flag) {
            writeLog(PRINT, "EXI:\t" + ctx.getText());
        }
    }

    // Fig.16 Cont
    @Override
    public void enterContinue_statement(PlSqlParser.Continue_statementContext ctx) {
        if (debug_flag) {
            writeLog(PRINT, "CON:\t" + ctx.getText());
        }
    }

    // Fig.16 IfElse
    // Fig.16 If
    @Override
    public void enterIf_statement(PlSqlParser.If_statementContext ctx) {
        if (debug_flag) {
            writeLog(PRINT, "IFS:\t" + ctx.getText());
        }
    }

    // Fig.16 Return
    @Override
    public void enterReturn_statement(PlSqlParser.Return_statementContext ctx) {
        if (debug_flag) {
            writeLog(PRINT, "RET:\t" + ctx.getText());
        }
    }
}
