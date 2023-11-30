package com.myplugin.plsqlic3.backend.randatagen;

import org.antlr.v4.runtime.ParserRuleContext;
import com.myplugin.plsqlic3.backend.parsers.parseplpgsql.PostgreSQLParser;
import com.myplugin.plsqlic3.backend.runnable.GlobalConfig;

import java.io.IOException;
import java.text.ParseException;
import java.util.Random;

import static com.myplugin.plsqlic3.backend.parsers.parserutil.parserutil.GeneralParserUtil.getFullTextOriginal;
import static com.myplugin.plsqlic3.backend.randatagen.plpgsqlrandom.PlPgSql10BitString.getPlPgSqlBit;
import static com.myplugin.plsqlic3.backend.randatagen.plpgsqlrandom.PlPgSql10BitString.getPlPgSqlBitVarying;
import static com.myplugin.plsqlic3.backend.randatagen.plpgsqlrandom.PlPgSql12UUID.getPlPgSqlUUID;
import static com.myplugin.plsqlic3.backend.randatagen.plpgsqlrandom.PlPgSql13XML.getPlPgSqlXML;
import static com.myplugin.plsqlic3.backend.randatagen.plpgsqlrandom.PlPgSql14JSON.getPlPgSqlJSON;
import static com.myplugin.plsqlic3.backend.randatagen.plpgsqlrandom.PlPgSql16Composite.getPlPgSqlCompositeType;
import static com.myplugin.plsqlic3.backend.randatagen.plpgsqlrandom.PlPgSql17Range.getPlPgSqlNumrange;
import static com.myplugin.plsqlic3.backend.randatagen.plpgsqlrandom.PlPgSql19ObjectId.getPlPgSqlOid;
import static com.myplugin.plsqlic3.backend.randatagen.plpgsqlrandom.PlPgSql1Numeric.*;
import static com.myplugin.plsqlic3.backend.randatagen.plpgsqlrandom.PlPgSql21Pseudo.*;
import static com.myplugin.plsqlic3.backend.randatagen.plpgsqlrandom.PlPgSql2Monetary.getPlPgSqlMoney;
import static com.myplugin.plsqlic3.backend.randatagen.plpgsqlrandom.PlPgSql3Character.*;
import static com.myplugin.plsqlic3.backend.randatagen.plpgsqlrandom.PlPgSql4BinaryData.getPlPgSqlBytea;
import static com.myplugin.plsqlic3.backend.randatagen.plpgsqlrandom.PlPgSql5DateTime.*;
import static com.myplugin.plsqlic3.backend.randatagen.plpgsqlrandom.PlPgSql6Boolean.getPlPgSqlBoolean;
import static com.myplugin.plsqlic3.backend.randatagen.plpgsqlrandom.PlPgSql8Geometric.getPlPgSqlPoint;
import static com.myplugin.plsqlic3.backend.randatagen.plpgsqlrandom.PlPgSql9NetworkAddr.getPlPgSqlCidr;
import static com.myplugin.plsqlic3.backend.randatagen.plpgsqlrandom.PlPgSql9NetworkAddr.getPlPgSqlInet;
import static com.myplugin.plsqlic3.backend.runnable.GlobalConfig.db_type;

public class GenerateRandom {
    public static String getRandom(String data_type) {
        return getRandom(data_type, -1, -1);
    }

    public static String getRandom(String data_type, int arg1, int arg2) {
        switch (GlobalConfig.db_type) {
            case POSTGRES:
            case GAUSSDB:
                switch (data_type.toLowerCase()) {
                    // 8.1. Numeric Types
                    case "int2":
                    case "smallint":
                        return getPlPgSqlSmallint();
                    case "int":
                    case "int4":
                    case "integer":
                        return getPlPgSqlInteger();
                    case "bigint":
                        return getPlPgSqlBigint();
                    case "decimal":
                    case "numeric":
                        return getPlPgSqlNumeric(arg1, arg2);
                    case "real":
                    case "float4":
                        return getPlPgSqlReal();
                    case "float":
                    case "float8":
                    case "doubleprecision":
                    case "double precision":
                        return getPlPgSqlDoublePrecision();
                    // 8.2. Monetary Types
                    case "money":
                        return getPlPgSqlMoney();
                    // 8.3. Character Types
                    case "char":
                    case "character":
                        return getPlPgSqlCharacter(arg1);
                    case "varchar":
                    case "charactervarying":
                    case "character varying":
                        return getPlPgSqlCharacterVarying(arg1);
                    case "text":
                        return getPlPgSqlText();
                    // 8.4. Binary Data Types
                    case "bytea":
                        return getPlPgSqlBytea();
                    // 8.5. Date/Time Types
                    case "timestamp":
                    case "timestampwithouttimezone":
                    case "timestamp without time zone":
                        return getPlPgSqlTimestamp(arg1);
                    case "timestamptz":
                    case "timestampwithtimezone":
                    case "timestamp with time zone":
                        return getPlPgSqlTimestampWithTimeZone(arg1);
                    case "date":
                        return getPlPgSqlDate();
                    case "time":
                    case "timewithouttimezone":
                    case "time without time zone":
                        return getPlPgSqlTime(arg1);
                    case "timewithtimezone":
                    case "time with time zone":
                        return getPlPgSqlTimeWithTimeZone(arg1);
                    case "interval":
                        return getPlPgSqlInterval(arg1);
                    // 8.6. Boolean Type
                    case "boolean":
                        return getPlPgSqlBoolean();
                    // 8.7. Enumerated Types
                    // 8.8. Geometric Types
                    case "point":
                        return getPlPgSqlPoint();
                    // 8.9. Network Address Types
                    case "inet":
                        return getPlPgSqlInet();
                    case "cidr":
                        return getPlPgSqlCidr();
                    // 8.10. Bit String Types
                    case "bit":
                        return getPlPgSqlBit(arg1);
                    case "bitvarying":
                    case "bit varying":
                        return getPlPgSqlBitVarying(arg1);
                    // 8.11. Text Search Types
                    // 8.12. UUID Type
                    case "uuid":
                        return getPlPgSqlUUID();
                    // 8.13. XML Type
                    case "xml":
                        return getPlPgSqlXML();
                    // 8.14. JSON Types
                    case "json":
                    case "jsonb":
                        return getPlPgSqlJSON();
                    // 8.15. Arrays
                    // 8.17. Range Types
                    case "numrange":
                        return getPlPgSqlNumrange();
                    // 8.18. Domain Types
                    // 8.19. Object Identifier Types
                    case "oid":
                    case "regclass":
                    case "regcollation":
                    case "regconfig":
                    case "regdictionary":
                    case "regnamespace":
                    case "regoper":
                    case "regoperator":
                    case "regproc":
                    case "regprocedure":
                    case "regrole":
                    case "regtype":
                        return getPlPgSqlOid();
                    // 8.20. pg_lsn Type
                    // 8.21. Pseudo-Types
                    case "anyarray":
                        return getPlPgSqlAnyarray();
                    case "anyelement":
                        return getPlPgSqlAnyelement();
                    case "anynonarray":
                        return getPlPgSqlAnynonarray();
                    case "record":
                        return getPlPgSqlRecord();
                    // 8.16. Composite Types
                    default:
                        return getPlPgSqlCompositeType(data_type);
                }
            case ORACLE:
                break;
            default:
                return "";
        }
        return "";
    }

    public static String getRandom(ParserRuleContext data_type) {
        switch (db_type) {
            case POSTGRES:
            case GAUSSDB:
                return getRandom((PostgreSQLParser.TypenameContext) data_type);
            case ORACLE:
            case MYSQL:
            default:
                return "";
        }
    }

    private static String getRandom(PostgreSQLParser.TypenameContext data_type) {
        String simple_type = getFullTextOriginal(data_type.simpletypename());

        // deal with args
        int arg1 = -1;
        int arg2 = -1;
        if (data_type.simpletypename().numeric() != null) {
            if (data_type.simpletypename().numeric().FLOAT_P() != null && data_type.simpletypename().numeric().opt_float() != null) {
                simple_type = data_type.simpletypename().numeric().FLOAT_P().getText();
                if (data_type.simpletypename().numeric().opt_float().iconst() != null) {
                    try {
                        arg1 = Integer.parseInt(data_type.simpletypename().numeric().opt_float().iconst().getText());
                    } catch (NumberFormatException ignore) {
                    }
                }
            }
            if (data_type.simpletypename().numeric().DECIMAL_P() != null
                    || data_type.simpletypename().numeric().DEC() != null
                    || data_type.simpletypename().numeric().NUMERIC() != null) {
                if (data_type.simpletypename().numeric().opt_type_modifiers() != null) {
                    simple_type = data_type.simpletypename().numeric().DECIMAL_P() != null ? data_type.simpletypename().numeric().DECIMAL_P().getText() : simple_type;
                    simple_type = data_type.simpletypename().numeric().DEC() != null ? data_type.simpletypename().numeric().DEC().getText() : simple_type;
                    simple_type = data_type.simpletypename().numeric().NUMERIC() != null ? data_type.simpletypename().numeric().NUMERIC().getText() : simple_type;
                    if (data_type.simpletypename().numeric().opt_type_modifiers().expr_list() != null
                            && data_type.simpletypename().numeric().opt_type_modifiers().expr_list().a_expr() != null) {
                        for (PostgreSQLParser.A_exprContext expr : data_type.simpletypename().numeric().opt_type_modifiers().expr_list().a_expr()) {
                            try {
                                if (data_type.simpletypename().numeric().opt_type_modifiers().expr_list().a_expr().indexOf(expr) == 0) {
                                    arg1 = Integer.parseInt(expr.getText());
                                }
                                if (data_type.simpletypename().numeric().opt_type_modifiers().expr_list().a_expr().indexOf(expr) == 1) {
                                    arg2 = Integer.parseInt(expr.getText());
                                }
                            } catch (NumberFormatException ignore) {
                            }
                        }
                    }
                }
            }
        } else if (data_type.simpletypename().bit() != null) {
            if (data_type.simpletypename().bit().bitwithlength() != null) {
                simple_type = data_type.simpletypename().bit().bitwithlength().opt_varying() == null ?
                        data_type.simpletypename().bit().bitwithlength().BIT().getText() :
                        data_type.simpletypename().bit().bitwithlength().BIT().getText() + data_type.simpletypename().bit().bitwithlength().opt_varying().getText();
                if (data_type.simpletypename().bit().bitwithlength().expr_list() != null) {
                    if (data_type.simpletypename().bit().bitwithlength().expr_list().a_expr() != null) {
                        try {
                            arg1 = Integer.parseInt(data_type.simpletypename().bit().bitwithlength().expr_list().a_expr().get(0).getText());
                        } catch (NumberFormatException ignore) {
                        }
                    }
                }
            }
        } else if (data_type.simpletypename().character() != null) {
            if (data_type.simpletypename().character().iconst() != null) {
                simple_type = getFullTextOriginal(data_type.simpletypename().character().character_c());
                try {
                    arg1 = Integer.parseInt(data_type.simpletypename().character().iconst().getText());
                } catch (NumberFormatException ignore) {
                }
            }
        } else if (data_type.simpletypename().constdatetime() != null) {
            if (data_type.simpletypename().constdatetime().iconst() != null) {
                StringBuilder sb = new StringBuilder();
                if (data_type.simpletypename().constdatetime().TIMESTAMP() != null) {
                    sb.append(data_type.simpletypename().constdatetime().TIMESTAMP().getText());
                } else if (data_type.simpletypename().constdatetime().TIME() != null) {
                    sb.append(data_type.simpletypename().constdatetime().TIME().getText());
                }
                sb.append(data_type.simpletypename().constdatetime().opt_timezone().getText());
                simple_type = sb.toString();
            }
        }

        // deal with array
        if (data_type.opt_array_bounds() != null && data_type.opt_array_bounds().children != null) {
            int array_dim = 0;
            array_dim = data_type.opt_array_bounds().OPEN_BRACKET().size();
            int[] dims = new int[array_dim];
            for (int i = 0; i < array_dim; i++) {
                Random r = new Random();
                dims[i] = r.nextInt(3) + 1;
            }
            return getArrayStr(simple_type, dims, dims.length - 1, arg1, arg2);
        } else {
            return getRandom(simple_type, arg1, arg2);
        }
    }

    private static String getArrayStr(String simple_type, int[] dims, int dim, int arg1, int arg2) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < dims[dim]; i++) {
            if (dim == 0) {
                sb.append(getRandom(simple_type, arg1, arg2));
            } else {
                sb.append(getArrayStr(simple_type, dims, dim - 1, arg1, arg2));
            }
            sb.append(",");
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.insert(0, "'{").append("}'");
        return sb.toString();
    }

    public static void main(String[] args) throws IOException, ParseException {
        for (int i = 0; i < 1000; i++) {
            System.out.println(getPlPgSqlNumrange());
        }
    }
}
