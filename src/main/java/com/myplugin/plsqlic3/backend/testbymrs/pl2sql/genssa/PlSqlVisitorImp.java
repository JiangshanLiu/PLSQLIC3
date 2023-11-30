package com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa;

import com.myplugin.plsqlic3.backend.parsers.parseplsql.PlSqlParser;
import com.myplugin.plsqlic3.backend.parsers.parseplsql.PlSqlParserBaseVisitor;

import static com.myplugin.plsqlic3.backend.runnable.LogToFile.LOG_TYPE.PRINT;
import static com.myplugin.plsqlic3.backend.runnable.LogToFile.writeLog;

/* Use listener instead of visitor */
class PlSqlVisitorImp extends PlSqlParserBaseVisitor<String> {
    // Fig.16 Decl
    // Fig.16 Decl0
    @Override
    public String visitDeclare_spec(PlSqlParser.Declare_specContext ctx) {
        writeLog(PRINT, "DCL:\t" + ctx.getText());
        return null;
    }

    // Fig.16 Assign
    @Override
    public String visitAssignment_statement(PlSqlParser.Assignment_statementContext ctx) {
        writeLog(PRINT, "ASN:\t" + ctx.getText());
        return null;
    }

    // Fig.16 Loop
    // Fig.16 While
    // Fig.16 For
    @Override
    public String visitLoop_statement(PlSqlParser.Loop_statementContext ctx) {
        writeLog(PRINT, "LOP:\t" + ctx.getText());
        return null;
    }

    // Fig.16 Exit
    @Override
    public String visitExit_statement(PlSqlParser.Exit_statementContext ctx) {
        writeLog(PRINT, "EXI:\t" + ctx.getText());
        return null;
    }

    // Fig.16 Cont
    @Override
    public String visitContinue_statement(PlSqlParser.Continue_statementContext ctx) {
        writeLog(PRINT, "CON:\t" + ctx.getText());
        return null;
    }

    // Fig.16 IfElse
    // Fig.16 If
    @Override
    public String visitIf_statement(PlSqlParser.If_statementContext ctx) {
        writeLog(PRINT, "IFS:\t" + ctx.getText());
        return null;
    }

    // Fig.16 Return
    @Override
    public String visitReturn_statement(PlSqlParser.Return_statementContext ctx) {
        writeLog(PRINT, "RET:\t" + ctx.getText());
        return null;
    }
}
