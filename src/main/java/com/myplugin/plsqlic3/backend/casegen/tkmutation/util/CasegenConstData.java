package com.myplugin.plsqlic3.backend.casegen.tkmutation.util;

import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;

import java.util.ArrayList;
import java.util.HashMap;

import static com.myplugin.plsqlic3.backend.parsers.parseplpgsql.PostgreSQLParser.*;

public class CasegenConstData {
    public static class CaseInsensitiveHashMap extends HashMap<String, Integer> {
        @Override
        public Integer put(String str, Integer parser_token) {
            return super.put(str.toLowerCase(), parser_token);
        }

        @Override
        public Integer get(Object o) {
            if (o instanceof String) {
                return super.get(((String) o).toLowerCase());
            } else {
                return null;
            }
        }

        @Override
        public boolean containsKey(Object o) {
            if (o instanceof String) {
                return super.containsKey(((String) o).toLowerCase());
            } else {
                return false;
            }
        }
    }

    public static final CaseInsensitiveHashMap NUM_TYPE_SET = new CaseInsensitiveHashMap() {{
        put("smallint", Integral);
        put("int2", Integral);
        put("integer", Integral);
        put("int", Integral);
        put("int4", Integral);
        put("bigint", Integral);
        put("decimal", Numeric);
        put("numeric", Numeric);
        put("real", Numeric);
        put("float", Numeric);
        put("float4", Numeric);
        put("doubleprecision", Numeric);
        put("double precision", Numeric);
    }};

    public static final CaseInsensitiveHashMap STR_TYPE_SET = new CaseInsensitiveHashMap() {{
        put("charactervarying", StringConstant);
        put("character varying", StringConstant);
        put("varchar", StringConstant);
        put("character", StringConstant);
        put("char", StringConstant);
        put("text", StringConstant);
    }};

    public static final ArrayList<ParserRuleContext> NUM_TYPE_NAME_TNODE = new ArrayList<>() {{
        add(new ParserRuleContext() {{
            addChild(new TerminalNodeImpl(new CommonToken(SMALLINT, "SMALLINT")));
        }});
        add(new ParserRuleContext() {{
            addChild(new TerminalNodeImpl(new CommonToken(INTEGER, "INTEGER")));
        }});
        add(new ParserRuleContext() {{
            addChild(new TerminalNodeImpl(new CommonToken(INT_P, "INT")));
        }});
        add(new ParserRuleContext() {{
            addChild(new TerminalNodeImpl(new CommonToken(BIGINT, "BIGINT")));
        }});
        add(new ParserRuleContext() {{
            addChild(new TerminalNodeImpl(new CommonToken(DECIMAL_P, "DECIMAL")));
        }});
        add(new ParserRuleContext() {{
            addChild(new TerminalNodeImpl(new CommonToken(NUMERIC, "NUMERIC")));
        }});
        add(new ParserRuleContext() {{
            addChild(new TerminalNodeImpl(new CommonToken(REAL, "REAL")));
        }});
        add(new ParserRuleContext() {{
            addChild(new TerminalNodeImpl(new CommonToken(FLOAT_P, "FLOAT")));
        }});
        add(new ParserRuleContext() {{
            addChild(new TerminalNodeImpl(new CommonToken(DOUBLE_P, "DOUBLE")));
            addChild(new TerminalNodeImpl(new CommonToken(PRECISION, "PRECISION")));
        }});
    }};

    public static final ArrayList<ParserRuleContext> STR_TYPE_NAME_TNODE = new ArrayList<>() {{
        add(new ParserRuleContext() {{
            addChild(new TerminalNodeImpl(new CommonToken(CHARACTER, "CHARACTER")));
            addChild(new TerminalNodeImpl(new CommonToken(VARYING, "VARYING")));
        }});
        add(new ParserRuleContext() {{
            addChild(new TerminalNodeImpl(new CommonToken(VARCHAR, "VARCHAR")));
        }});
        add(new ParserRuleContext() {{
            addChild(new TerminalNodeImpl(new CommonToken(CHARACTER, "CHARACTER")));
        }});
        add(new ParserRuleContext() {{
            addChild(new TerminalNodeImpl(new CommonToken(CHAR_P, "CHAR")));
        }});
        add(new ParserRuleContext() {{
            addChild(new TerminalNodeImpl(new CommonToken(TEXT_P, "TEXT")));
        }});
    }};
}
