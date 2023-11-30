package com.myplugin.plsqlic3.middleware.data.inconsistency;

import org.antlr.v4.runtime.ParserRuleContext;

import static com.myplugin.plsqlic3.backend.parsers.parserutil.parserutil.GeneralParserUtil.getFullTextOriginal;

public class ForloopInconsistencyData extends AbstractInconsistencyData {
    ParserRuleContext lower_bound_ctx;
    ParserRuleContext upper_bound_ctx;

    public ForloopInconsistencyData(String source_code, ParserRuleContext lower_bound_ctx, ParserRuleContext upper_bound_ctx) {
        this.source_code = source_code;
        this.lower_bound_ctx = lower_bound_ctx;
        this.upper_bound_ctx = upper_bound_ctx;
    }

    @Override
    public String toString() {
        return String.format("Potential inconsistency @ %s%s%s\n%s%s" +
                        "\tNote: FOR loops with upper and lower bounds that are not integers are rounded first when determining the upper and lower bounds of the loop, rather than converting integer numbers to floating-point numbers for floating-point comparisons as SQL does, or rounding off the fractional portion of the number as other programming languages do.\n" +
                        "\tSuggestion: If your business logic requires fixed rounding of loop boundaries up/down, do it explicitly via CEIL(int) or FLOOR(int).\n" +
                        "\t注意：FOR 循环的上下限如果不是整数，在确定循环的上下限时将首先四舍五入，而不是像 SQL 那样将整数转换为浮点数进行浮点比较，或像其他编程语言那样舍去数字的小数部分。\n" +
                        "\t建议：如果您的业务逻辑要求对循环边界进行固定的向上/向下取整，请通过 CEIL(int) 或 FLOOR(int) 进行显式操作。",
                lower_bound_ctx != null ? String.format("line %d, index %d - %d",
                        lower_bound_ctx.getStart().getLine(),
                        lower_bound_ctx.getStart().getStartIndex(),
                        lower_bound_ctx.getStop().getStopIndex()) : "",
                lower_bound_ctx != null && upper_bound_ctx != null ? "; " : "",
                upper_bound_ctx != null ? String.format("line %d, index %d - %d",
                        upper_bound_ctx.getStart().getLine(),
                        upper_bound_ctx.getStart().getStartIndex(),
                        upper_bound_ctx.getStop().getStopIndex()) : "",
                lower_bound_ctx != null ? String.format("\t\"%s\"\n\t%s\n",
                        getLineCode(lower_bound_ctx.getStart().getLine()),
                        getPositionString(lower_bound_ctx.getStart().getStartIndex(),
                                lower_bound_ctx.getStop().getStopIndex(),
                                lower_bound_ctx.getStart().getLine())) : "",
                upper_bound_ctx != null ? String.format("\t\"%s\"\n\t%s\n",
                        getLineCode(upper_bound_ctx.getStart().getLine()),
                        getPositionString(upper_bound_ctx.getStart().getStartIndex(),
                                upper_bound_ctx.getStop().getStopIndex(),
                                upper_bound_ctx.getStart().getLine())) : ""
        );
    }
}
