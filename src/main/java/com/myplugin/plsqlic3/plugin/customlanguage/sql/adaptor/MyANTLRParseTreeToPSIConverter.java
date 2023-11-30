package com.myplugin.plsqlic3.plugin.customlanguage.sql.adaptor;

import com.intellij.lang.Language;
import com.intellij.lang.PsiBuilder;
import com.myplugin.plsqlic3.backend.parsers.parseplpgsql.PostgreSQLLexer;
import com.myplugin.plsqlic3.plugin.customlanguage.sql.inconsinfo.InconsistencyInfo;
import com.myplugin.plsqlic3.plugin.customlanguage.sql.parser.PostgreSQLPlpgsqlInnerParser;
import com.myplugin.plsqlic3.plugin.customlanguage.sql.parser.PostgreSQLPlpgsqlInnerParserBaseInterfaseListener;
import org.antlr.intellij.adaptor.parser.ANTLRParseTreeToPSIConverter;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.Token;

import static com.myplugin.plsqlic3.plugin.customlanguage.sql.inconsinfo.InconsistenciesType.FOR_LOOP_LOWER_BOUND_NONINT;
import static com.myplugin.plsqlic3.plugin.customlanguage.sql.inconsinfo.InconsistenciesType.FOR_LOOP_UPPER_BOUND_NONINT;

public class MyANTLRParseTreeToPSIConverter
        extends ANTLRParseTreeToPSIConverter
        implements PostgreSQLPlpgsqlInnerParserBaseInterfaseListener {
    Parser parser;

    public MyANTLRParseTreeToPSIConverter(Language language, Parser parser, PsiBuilder builder) {
        super(language, parser, builder);
        this.parser = parser;
    }

    @Override
    public void enterFor_control(PostgreSQLPlpgsqlInnerParser.For_controlContext ctx) {
        if (ctx.DOT_DOT() != null) {
            boolean lower_bound_flag = true;
            boolean upper_bound_flag = true;
            Token lower_bound_start = ctx.a_expr(0).getStart();
            Token lower_bound_stop = ctx.a_expr(0).getStop();
            if (lower_bound_start.equals(lower_bound_stop) && lower_bound_start.getType() == PostgreSQLLexer.Integral ||
                    lower_bound_start.getText().equalsIgnoreCase("FLOOR") ||
                    lower_bound_start.getText().equalsIgnoreCase("CEIL")) {
                lower_bound_flag = false;
            }
            Token upper_bound_start = ctx.a_expr(1).getStart();
            Token upper_bound_stop = ctx.a_expr(1).getStop();
            if (upper_bound_start.equals(upper_bound_stop) && upper_bound_start.getType() == PostgreSQLLexer.Integral ||
                    upper_bound_start.getText().equalsIgnoreCase("FLOOR") ||
                    upper_bound_start.getText().equalsIgnoreCase("CEIL")) {
                upper_bound_flag = false;
            }
            if (this.parser instanceof PostgreSQLPlpgsqlInnerParser
                    && (lower_bound_flag || upper_bound_flag)) {
                if (lower_bound_flag) {
                    ((PostgreSQLPlpgsqlInnerParser) this.parser).inconsistencies_map.put(
                            new InconsistencyInfo(ctx.a_expr(0).getStart().getStartIndex(),
                                    ctx.a_expr(0).getStop().getStopIndex()), FOR_LOOP_LOWER_BOUND_NONINT);
                }
                if (upper_bound_flag) {
                    ((PostgreSQLPlpgsqlInnerParser) this.parser).inconsistencies_map.put(
                            new InconsistencyInfo(ctx.a_expr(1).getStart().getStartIndex(),
                                    ctx.a_expr(1).getStop().getStopIndex()), FOR_LOOP_UPPER_BOUND_NONINT);
                }
            }
        }
    }
}
