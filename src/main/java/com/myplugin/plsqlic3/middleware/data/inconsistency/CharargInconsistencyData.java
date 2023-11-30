package com.myplugin.plsqlic3.middleware.data.inconsistency;

import org.antlr.v4.runtime.ParserRuleContext;

import static com.myplugin.plsqlic3.backend.parsers.parserutil.parserutil.GeneralParserUtil.getFullTextOriginal;

public class CharargInconsistencyData extends AbstractInconsistencyData {
    ParserRuleContext arg;

    public CharargInconsistencyData(String source_code, ParserRuleContext arg) {
        this.source_code = source_code;
        this.arg = arg;
    }

    @Override
    public String toString() {
        return String.format("Potential inconsistency @ line %d, index %d - %d\n" +
                        "\t\"%s\"\n\t%s\n" +
                        "\tNote: When the parameter type is \"CHAR\" of unspecified length, the incoming parameter is not actually truncated to a string of length 1 as represented in SQL, but rather the entire string is passed into the function.\n" +
                        "\tSuggestion: If you expect to rely on type conversions on parameter passing to intercept the length of a string, this is not desirable. Please use str::CHAR in PL/SQL to display the conversion, or LEFT(str, length) to explicitly intercept the string.\n" +
                        "\t注意：当参数类型为未指定长度的 \"CHAR\"时，输入的参数实际上不会像 SQL 那样截断长度为 1 的字符串，而是将整个字符串传入函数。\n" +
                        "\t建议：如果您期望依靠参数传递时的类型转换对字符串的长度做截取，这是不可取的。请您在PL/SQL中使用str::CHAR显示转换，或通过LEFT(str, length)显式截取字符串。",
                arg.getStart().getLine(),
                arg.getStart().getStartIndex(),
                arg.getStop().getStopIndex(),
                getLineCode(arg.getStart().getLine()),
                getPositionString(arg.getStart().getStartIndex(), arg.getStop().getStopIndex(), arg.getStart().getLine())
        );
    }
}
