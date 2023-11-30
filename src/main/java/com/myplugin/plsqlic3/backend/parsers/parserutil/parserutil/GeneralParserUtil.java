package com.myplugin.plsqlic3.backend.parsers.parserutil.parserutil;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;
import com.myplugin.plsqlic3.backend.parsers.parseplpgsql.PostgreSQLParser;
import com.myplugin.plsqlic3.backend.testbymrs.pl2sql.util.SqlIdMap;
import com.myplugin.plsqlic3.backend.runnable.GlobalConfig;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

import static com.myplugin.plsqlic3.backend.parsers.parseplpgsql.PostgreSQLLexer.*;
import static com.myplugin.plsqlic3.backend.parsers.parserutil.parserutil.PlPgSqlParserUtil.ifTypeBasic;
import static com.myplugin.plsqlic3.backend.runnable.DatabaseType.GAUSSDB;
import static com.myplugin.plsqlic3.backend.runnable.DatabaseType.POSTGRES;

/**
 * Parser-related public utils
 */
public class GeneralParserUtil {
    static SortedSet<Integer> PostgreSQL_TYPES = new TreeSet<Integer>() {
        {
            add(INT_P);
            add(INTEGER);
            add(SMALLINT);
            add(BIGINT);
            add(REAL);
            add(FLOAT_P);
            add(DOUBLE_P);
            add(DECIMAL_P);
            add(DEC);
            add(NUMERIC);
            add(BOOLEAN_P);
            add(CHARACTER);
            add(CHAR_P);
            add(NCHAR);
            add(VARCHAR);
            add(NATIONAL);
            add(TIMESTAMP);
            add(TIME);
        }
    };
    static SortedSet<Integer> Oracle_TYPES = new TreeSet<Integer>();

    private static ThreadLocal<Boolean> if_in_dollar_str = new ThreadLocal<>();

    /**
     * Get the corresponding string from the identifier node of the AST
     *
     * @param ctx identifier node of the AST
     * @return corresponding string
     */
    public static String getIdName(ParserRuleContext ctx) {
        String o = null;
        switch (GlobalConfig.db_type) {
            case POSTGRES:
            case GAUSSDB:
                if (ctx.getTokens(Identifier).size() != 0) {
                    o = ctx.getToken(Identifier, 0).getSymbol().toString();
                } else {
                    for (ParseTree pt : ctx.children) {
                        if (pt instanceof ParserRuleContext) {
                            o = getIdName((ParserRuleContext) pt);
                        }
                    }
                }
                break;
            case ORACLE:
                break;
            default:
                break;
        }
        return o;
    }

    /**
     * Get the source input string corresponding to the AST node
     * The output of this method is not affected by intentional modification of the source node
     *
     * @param tree AST node
     * @return source input string
     */
    public static String getFullTextOriginal(ParseTree tree) {
        ParserRuleContext context = (ParserRuleContext) tree;
        if (context.children == null) {
            return "";
        }
        Token startToken = context.start;
        Token stopToken = context.stop;
        Interval interval = new Interval(startToken.getStartIndex(), stopToken.getStopIndex());
        return context.start.getInputStream().getText(interval);
    }

    /**
     * Get the source input sub-string corresponding to the AST node by start and stop index
     * The output of this method is not affected by intentional modification of the source node
     *
     * @param tree       AST node
     * @param startIndex start index of expected sub-string
     * @param stopIndex  stop index of expected sub-string
     * @return source input sub-string
     */
    public static String getSubTextOriginal(ParseTree tree, int startIndex, int stopIndex) {
        ParserRuleContext context = (ParserRuleContext) tree;
        if (context.children == null) {
            return "";
        }
        Interval interval = new Interval(startIndex, stopIndex);
        return context.start.getInputStream().getText(interval);
    }

    /**
     * Get the string corresponding to the AST node by traversing the child node
     * Usually used to modify the output after the source node
     *
     * @param tree AST node
     * @return corresponding string
     */
    public static String getFullTextByChildren(ParseTree tree) {
        StringBuilder builder = new StringBuilder();
        if (tree instanceof ParserRuleContext && ((ParserRuleContext) tree).children != null) {
            for (ParseTree pt : ((ParserRuleContext) tree).children) {
                builder.append(getFullTextByChildren(pt));
            }
        } else if (tree instanceof TerminalNode) {
            builder.append(tree.getText()).append(" ");
        }
        return builder.toString();
    }

    /**
     * Get the string corresponding to the SELECT subquery statement that eventually appears in the LATERAL clause
     *
     * @param tree               AST node for a SQL statement
     * @param id_type_pair       Record the identifiers and corresponding types throughout PL/SQL
     * @param block_present_vars Record the variables of the current block
     * @return corresponding string of SELECT statement
     */
    public static String getFullTextSelected(ParseTree tree, SqlIdMap<String, ParserRuleContext> id_type_pair, HashSet<String> block_present_vars) {
        if_in_dollar_str.set(false);
        return getFullTextSelectedRec(tree, id_type_pair, true, block_present_vars);
    }

    private static String getFullTextSelectedRec(ParseTree tree, SqlIdMap<String, ParserRuleContext> id_type_pair, boolean if_clarify_type, HashSet<String> block_present_vars) {
        assert (tree instanceof ParserRuleContext);
        ParserRuleContext context = (ParserRuleContext) tree;
        if (context.getChildCount() == 0) {
            return "";
        } else {
            StringBuilder builder = new StringBuilder();

            for (int i = 0; i < context.getChildCount(); ++i) {
                if (context.getChild(i) instanceof ParserRuleContext) {
                    // id_A.id_B
                    // should clarify custom type of id_A, but do not clarify custom type of id_B (namely IndirectionContext)
                    if ((GlobalConfig.db_type == POSTGRES || GlobalConfig.db_type == GAUSSDB) && context.getChild(i) instanceof PostgreSQLParser.IndirectionContext) {
                        builder.append(getFullTextSelectedRec(context.getChild(i), id_type_pair, false, block_present_vars));
                    } else {
                        builder.append(getFullTextSelectedRec(context.getChild(i), id_type_pair, if_clarify_type, block_present_vars));
                    }
                } else if (context.getChild(i) instanceof TerminalNodeImpl) {
                    if (GlobalConfig.db_type == POSTGRES || GlobalConfig.db_type == GAUSSDB) {
                        // TerminalNode is an identifier
                        // and id-type pair record this identifier
                        // and the type of identifier is not basic type
                        // and not B_id in A_id.B_id
                        // should clarify the custom type by ::
                        String origin_id = ((TerminalNodeImpl) context.getChild(i)).getSymbol().toString();
                        String real_id = block_present_vars.contains(origin_id) ? context.getChild(i).getText() : origin_id;
                        if (((TerminalNodeImpl) context.getChild(i)).getSymbol().getType() == Identifier
                                && id_type_pair.containsKey(origin_id)
                                && !ifTypeBasic(id_type_pair.get(origin_id))
                                && if_clarify_type
                                && !if_in_dollar_str.get()) {
                            builder.append(String.format(" (%s::%s)",
                                    real_id,
                                    // may have a bug here
                                    // type_name can be an array end with []
                                    (id_type_pair.get(origin_id)).getText())
                            );
                        } else if (((TerminalNodeImpl) context.getChild(i)).getSymbol().getType() == BeginDollarStringConstant) {
                            if_in_dollar_str.set(true);
                        } else if (((TerminalNodeImpl) context.getChild(i)).getSymbol().getType() == EndDollarStringConstant) {
                            builder.append(" ").append(getFullTextOriginal(context.getChild(i).getParent()));
                            if_in_dollar_str.set(false);
                        } else {
                            if (!if_in_dollar_str.get()) {
                                builder.append(" ").append(real_id);
                            }
                        }
                    }
                }
            }
            return builder.toString();
        }
    }

    /**
     * Get the string corresponding to the AST node by traversing the child node
     * where the identifier is used without the SSA serial number of the same name
     *
     * @param tree             AST node
     * @param global_arg_index Record the global variable index of the entire PL/SQL
     * @return corresponding string
     */
    public static String getFullTextReturned(ParseTree tree, SqlIdMap<String, TerminalNode> global_arg_index) {
        if_in_dollar_str.set(false);
        return getFullTextReturnedRec(tree, global_arg_index);
    }

    private static String getFullTextReturnedRec(ParseTree tree, SqlIdMap<String, TerminalNode> global_arg_index) {
        assert (tree instanceof ParserRuleContext);
        ParserRuleContext context = (ParserRuleContext) tree;
        if (context.getChildCount() == 0) {
            return "";
        } else {
            StringBuilder builder = new StringBuilder();

            for (int i = 0; i < context.getChildCount(); ++i) {
                if (context.getChild(i) instanceof ParserRuleContext) {
                    builder.append(getFullTextReturnedRec(context.getChild(i), global_arg_index));
                } else if (context.getChild(i) instanceof TerminalNodeImpl) {
                    if (((TerminalNodeImpl) context.getChild(i)).getSymbol().getType() == BeginDollarStringConstant) {
                        if_in_dollar_str.set(true);
                    } else if (((TerminalNodeImpl) context.getChild(i)).getSymbol().getType() == EndDollarStringConstant) {
                        builder.append(" ").append(getFullTextOriginal(context.getChild(i).getParent()));
                        if_in_dollar_str.set(false);
                    } else if (!if_in_dollar_str.get()) {
                        String origin_id = ((TerminalNodeImpl) context.getChild(i)).getSymbol().toString();
                        if (global_arg_index.containsKey(origin_id)) {
                            builder.append(context.getChild(i).getText()).append(" ");
                        } else {
                            builder.append(origin_id).append(" ");
                        }
                    }
                }
            }
            return builder.toString();
        }
    }

    /**
     * Read content from a file into a string
     *
     * @param file_name name of file
     * @return content string in file
     */
    public static String readStringFromFile(String file_name) {
        try {
            return new String(Files.readAllBytes(Paths.get(file_name)));
        } catch (IOException ignore) {
            return null;
        }
    }
}
