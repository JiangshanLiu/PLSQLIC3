package com.myplugin.plsqlic3.middleware.data.inconsistency;

import org.antlr.v4.runtime.ParserRuleContext;

public class IntoInconsistencyData extends AbstractInconsistencyData {
    ParserRuleContext arg;

    public IntoInconsistencyData(String source_code, ParserRuleContext arg) {
        this.source_code = source_code;
        this.arg = arg;
    }

    @Override
    public String toString() {
        return String.format("Potential inconsistency @ line %d, index %d - %d\n" +
                        "\t\"%s\"\n\t%s\n" +
                        "\tNote: When using the \"INTO\" keyword in PL/SQL, \"INTO\" needs to be followed by a variable that has already been declared in the DECLARE block. When you expect INTO to be followed by the name of the table you want to write to, as in SQL, the execution will report an error.\n" +
                        "\tSuggestion: When you expect to write the results of a query to a table, declare the variable in the DECLARE block of the program, and then manually insert it using \"INSERT\" after the \"SELECT INTO\" statement.\n" +
                        "\t注意：当在PL/SQL中使用“INTO”关键字时，INTO后需要接一个在DECLARE块中已经声明的变量。当您期望像SQL那样INTO后接期望写入的表名时，执行将会报错。\n" +
                        "\t建议：当您期望将查询结果写入表中时，请先在程序DECLARE块中声明变量，而后在“SELECT INTO”语句后手动使用“INSERT”插入。\n" +
                        "\t示例代码：\n" +
                        "-- 以下代码将报错：\n" +
                        "CREATE OR REPLACE FUNCTION test() RETURNS void AS $$\n" +
                        "BEGIN\n" +
                        "  SELECT col INTO new_table FROM src_table;\n" +
                        "END;\n" +
                        "$$ LANGUAGE plpgsql;\n" +
                        "-- 请修改为：\n" +
                        "CREATE OR REPLACE FUNCTION test() RETURNS void AS $$\n" +
                        "DECLARE\n" +
                        "  var_col_array TYPE_OF_COL[];\n" +
                        "BEGIN\n" +
                        "  SELECT col INTO var_col_array FROM src_table;\n" +
                        "\t-- Please insert var_col_array into new table by other statements\n" +
                        "END;\n" +
                        "$$ LANGUAGE plpgsql;",
                arg.getStart().getLine(),
                arg.getStart().getStartIndex(),
                arg.getStop().getStopIndex(),
                getLineCode(arg.getStart().getLine()),
                getPositionString(arg.getStart().getStartIndex(), arg.getStop().getStopIndex(), arg.getStart().getLine())
        );
    }
}
