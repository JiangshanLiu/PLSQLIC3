package com.myplugin.plsqlic3.plugin.customlanguage.sql;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import com.myplugin.plsqlic3.plugin.customlanguage.sql.parser.PostgreSQLPlpgsqlInnerLexer;
import com.myplugin.plsqlic3.plugin.customlanguage.sql.parser.PostgreSQLPlpgsqlInnerParser;
import org.antlr.intellij.adaptor.lexer.ANTLRLexerAdaptor;
import org.antlr.intellij.adaptor.lexer.PSIElementTypeFactory;
import org.antlr.intellij.adaptor.lexer.TokenIElementType;
import org.jetbrains.annotations.NotNull;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

/**
 * A highlighter is really just a mapping from token type to
 * some text attributes using {@link #getTokenHighlights(IElementType)}.
 * The reason that it returns an array, TextAttributesKey[], is
 * that you might want to mix the attributes of a few known highlighters.
 * A {@link TextAttributesKey} is just a name for that a theme
 * or IDE skin can set. For example, {@link DefaultLanguageHighlighterColors#KEYWORD}
 * is the key that maps to what identifiers look like in the editor.
 * To change it, see dialog: Editor > Colors & Fonts > Language Defaults.
 * <p>
 * From <a href="http://www.jetbrains.org/intellij/sdk/docs/reference_guide/custom_language_support/syntax_highlighting_and_error_highlighting.html">doc</a>:
 * "The mapping of the TextAttributesKey to specific attributes used
 * in an editor is defined by the EditorColorsScheme class, and can
 * be configured by the user if the plugin provides an appropriate
 * configuration interface.
 * ...
 * The syntax highlighter returns the {@link TextAttributesKey}
 * instances for each token type which needs special highlighting.
 * For highlighting lexer errors, the standard TextAttributesKey
 * for bad characters HighlighterColors.BAD_CHARACTER can be used."
 */
public class SQLSyntaxHighlighter extends SyntaxHighlighterBase {
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];
    public static final TextAttributesKey ID =
            createTextAttributesKey("SAMPLE_ID", DefaultLanguageHighlighterColors.IDENTIFIER);
    public static final TextAttributesKey KEYWORD =
            createTextAttributesKey("SAMPLE_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey STRING =
            createTextAttributesKey("SAMPLE_STRING", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey LINE_COMMENT =
            createTextAttributesKey("SAMPLE_LINE_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey BLOCK_COMMENT =
            createTextAttributesKey("SAMPLE_BLOCK_COMMENT", DefaultLanguageHighlighterColors.BLOCK_COMMENT);

    static {
        PSIElementTypeFactory.defineLanguageIElementTypes(SQLLanguage.INSTANCE,
                PostgreSQLPlpgsqlInnerParser.tokenNames,
                PostgreSQLPlpgsqlInnerParser.ruleNames);
    }

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        PostgreSQLPlpgsqlInnerLexer lexer = new PostgreSQLPlpgsqlInnerLexer(null);
        return new ANTLRLexerAdaptor(SQLLanguage.INSTANCE, lexer);
    }

    @NotNull
    @Override
    public TextAttributesKey @NotNull [] getTokenHighlights(IElementType tokenType) {
        if (!(tokenType instanceof TokenIElementType)) return EMPTY_KEYS;
        TokenIElementType myType = (TokenIElementType) tokenType;
        int ttype = myType.getANTLRTokenType();
        TextAttributesKey attrKey;
        switch (ttype) {
            case PostgreSQLPlpgsqlInnerLexer.Identifier:
            case PostgreSQLPlpgsqlInnerLexer.QuotedIdentifier:
            case PostgreSQLPlpgsqlInnerLexer.UnterminatedQuotedIdentifier:
            case PostgreSQLPlpgsqlInnerLexer.InvalidQuotedIdentifier:
            case PostgreSQLPlpgsqlInnerLexer.InvalidUnterminatedQuotedIdentifier:
            case PostgreSQLPlpgsqlInnerLexer.UnicodeQuotedIdentifier:
            case PostgreSQLPlpgsqlInnerLexer.UnterminatedUnicodeQuotedIdentifier:
            case PostgreSQLPlpgsqlInnerLexer.InvalidUnterminatedUnicodeQuotedIdentifier:
            case PostgreSQLPlpgsqlInnerLexer.PLSQLIDENTIFIER:
                attrKey = ID;
                break;
            case PostgreSQLPlpgsqlInnerLexer.ALL:
            case PostgreSQLPlpgsqlInnerLexer.ANALYSE:
            case PostgreSQLPlpgsqlInnerLexer.ANALYZE:
            case PostgreSQLPlpgsqlInnerLexer.AND:
            case PostgreSQLPlpgsqlInnerLexer.ANY:
            case PostgreSQLPlpgsqlInnerLexer.ARRAY:
            case PostgreSQLPlpgsqlInnerLexer.AS:
            case PostgreSQLPlpgsqlInnerLexer.BOTH:
            case PostgreSQLPlpgsqlInnerLexer.CASE:
            case PostgreSQLPlpgsqlInnerLexer.CAST:
            case PostgreSQLPlpgsqlInnerLexer.COLLATE:
            case PostgreSQLPlpgsqlInnerLexer.COLUMN:
            case PostgreSQLPlpgsqlInnerLexer.CONSTRAINT:
            case PostgreSQLPlpgsqlInnerLexer.CREATE:
            case PostgreSQLPlpgsqlInnerLexer.CURRENT_CATALOG:
            case PostgreSQLPlpgsqlInnerLexer.CURRENT_DATE:
            case PostgreSQLPlpgsqlInnerLexer.CURRENT_ROLE:
            case PostgreSQLPlpgsqlInnerLexer.CURRENT_TIME:
            case PostgreSQLPlpgsqlInnerLexer.CURRENT_TIMESTAMP:
            case PostgreSQLPlpgsqlInnerLexer.CURRENT_USER:
            case PostgreSQLPlpgsqlInnerLexer.DEFAULT:
            case PostgreSQLPlpgsqlInnerLexer.DEFERRABLE:
            case PostgreSQLPlpgsqlInnerLexer.DESC:
            case PostgreSQLPlpgsqlInnerLexer.DISTINCT:
            case PostgreSQLPlpgsqlInnerLexer.DO:
            case PostgreSQLPlpgsqlInnerLexer.ELSE:
            case PostgreSQLPlpgsqlInnerLexer.EXCEPT:
            case PostgreSQLPlpgsqlInnerLexer.FALSE_P:
            case PostgreSQLPlpgsqlInnerLexer.FETCH:
            case PostgreSQLPlpgsqlInnerLexer.FOR:
            case PostgreSQLPlpgsqlInnerLexer.FOREIGN:
            case PostgreSQLPlpgsqlInnerLexer.FROM:
            case PostgreSQLPlpgsqlInnerLexer.GRANT:
            case PostgreSQLPlpgsqlInnerLexer.GROUP_P:
            case PostgreSQLPlpgsqlInnerLexer.HAVING:
            case PostgreSQLPlpgsqlInnerLexer.IN_P:
            case PostgreSQLPlpgsqlInnerLexer.INITIALLY:
            case PostgreSQLPlpgsqlInnerLexer.INTERSECT:
            case PostgreSQLPlpgsqlInnerLexer.INTO:
            case PostgreSQLPlpgsqlInnerLexer.LATERAL_P:
            case PostgreSQLPlpgsqlInnerLexer.LEADING:
            case PostgreSQLPlpgsqlInnerLexer.LIMIT:
            case PostgreSQLPlpgsqlInnerLexer.LOCALTIME:
            case PostgreSQLPlpgsqlInnerLexer.LOCALTIMESTAMP:
            case PostgreSQLPlpgsqlInnerLexer.NOT:
            case PostgreSQLPlpgsqlInnerLexer.NULL_P:
            case PostgreSQLPlpgsqlInnerLexer.OFFSET:
            case PostgreSQLPlpgsqlInnerLexer.ON:
            case PostgreSQLPlpgsqlInnerLexer.ONLY:
            case PostgreSQLPlpgsqlInnerLexer.OR:
            case PostgreSQLPlpgsqlInnerLexer.ORDER:
            case PostgreSQLPlpgsqlInnerLexer.PLACING:
            case PostgreSQLPlpgsqlInnerLexer.PRIMARY:
            case PostgreSQLPlpgsqlInnerLexer.REFERENCES:
            case PostgreSQLPlpgsqlInnerLexer.RETURNING:
            case PostgreSQLPlpgsqlInnerLexer.SELECT:
            case PostgreSQLPlpgsqlInnerLexer.SESSION_USER:
            case PostgreSQLPlpgsqlInnerLexer.SOME:
            case PostgreSQLPlpgsqlInnerLexer.SYMMETRIC:
            case PostgreSQLPlpgsqlInnerLexer.TABLE:
            case PostgreSQLPlpgsqlInnerLexer.THEN:
            case PostgreSQLPlpgsqlInnerLexer.TO:
            case PostgreSQLPlpgsqlInnerLexer.TRAILING:
            case PostgreSQLPlpgsqlInnerLexer.TRUE_P:
            case PostgreSQLPlpgsqlInnerLexer.UNION:
            case PostgreSQLPlpgsqlInnerLexer.UNIQUE:
            case PostgreSQLPlpgsqlInnerLexer.USER:
            case PostgreSQLPlpgsqlInnerLexer.USING:
            case PostgreSQLPlpgsqlInnerLexer.VARIADIC:
            case PostgreSQLPlpgsqlInnerLexer.WHEN:
            case PostgreSQLPlpgsqlInnerLexer.WHERE:
            case PostgreSQLPlpgsqlInnerLexer.WINDOW:
            case PostgreSQLPlpgsqlInnerLexer.WITH:
            case PostgreSQLPlpgsqlInnerLexer.AUTHORIZATION:
            case PostgreSQLPlpgsqlInnerLexer.BINARY:
            case PostgreSQLPlpgsqlInnerLexer.COLLATION:
            case PostgreSQLPlpgsqlInnerLexer.CONCURRENTLY:
            case PostgreSQLPlpgsqlInnerLexer.CROSS:
            case PostgreSQLPlpgsqlInnerLexer.CURRENT_SCHEMA:
            case PostgreSQLPlpgsqlInnerLexer.FREEZE:
            case PostgreSQLPlpgsqlInnerLexer.FULL:
            case PostgreSQLPlpgsqlInnerLexer.ILIKE:
            case PostgreSQLPlpgsqlInnerLexer.INNER_P:
            case PostgreSQLPlpgsqlInnerLexer.IS:
            case PostgreSQLPlpgsqlInnerLexer.ISNULL:
            case PostgreSQLPlpgsqlInnerLexer.JOIN:
            case PostgreSQLPlpgsqlInnerLexer.LEFT:
            case PostgreSQLPlpgsqlInnerLexer.LIKE:
            case PostgreSQLPlpgsqlInnerLexer.NATURAL:
            case PostgreSQLPlpgsqlInnerLexer.NOTNULL:
            case PostgreSQLPlpgsqlInnerLexer.OUTER_P:
            case PostgreSQLPlpgsqlInnerLexer.OVER:
            case PostgreSQLPlpgsqlInnerLexer.OVERLAPS:
            case PostgreSQLPlpgsqlInnerLexer.RIGHT:
            case PostgreSQLPlpgsqlInnerLexer.SIMILAR:
            case PostgreSQLPlpgsqlInnerLexer.VERBOSE:
            case PostgreSQLPlpgsqlInnerLexer.ABORT_P:
            case PostgreSQLPlpgsqlInnerLexer.ABSOLUTE_P:
            case PostgreSQLPlpgsqlInnerLexer.ACCESS:
            case PostgreSQLPlpgsqlInnerLexer.ACTION:
            case PostgreSQLPlpgsqlInnerLexer.ADD_P:
            case PostgreSQLPlpgsqlInnerLexer.ADMIN:
            case PostgreSQLPlpgsqlInnerLexer.AFTER:
            case PostgreSQLPlpgsqlInnerLexer.AGGREGATE:
            case PostgreSQLPlpgsqlInnerLexer.ALSO:
            case PostgreSQLPlpgsqlInnerLexer.ALTER:
            case PostgreSQLPlpgsqlInnerLexer.ALWAYS:
            case PostgreSQLPlpgsqlInnerLexer.ASSERTION:
            case PostgreSQLPlpgsqlInnerLexer.ASSIGNMENT:
            case PostgreSQLPlpgsqlInnerLexer.AT:
            case PostgreSQLPlpgsqlInnerLexer.ATTRIBUTE:
            case PostgreSQLPlpgsqlInnerLexer.BACKWARD:
            case PostgreSQLPlpgsqlInnerLexer.BEFORE:
            case PostgreSQLPlpgsqlInnerLexer.BEGIN_P:
            case PostgreSQLPlpgsqlInnerLexer.BY:
            case PostgreSQLPlpgsqlInnerLexer.CACHE:
            case PostgreSQLPlpgsqlInnerLexer.CALLED:
            case PostgreSQLPlpgsqlInnerLexer.CASCADE:
            case PostgreSQLPlpgsqlInnerLexer.CASCADED:
            case PostgreSQLPlpgsqlInnerLexer.CATALOG:
            case PostgreSQLPlpgsqlInnerLexer.CHAIN:
            case PostgreSQLPlpgsqlInnerLexer.CHARACTERISTICS:
            case PostgreSQLPlpgsqlInnerLexer.CHECKPOINT:
            case PostgreSQLPlpgsqlInnerLexer.CLASS:
            case PostgreSQLPlpgsqlInnerLexer.CLOSE:
            case PostgreSQLPlpgsqlInnerLexer.CLUSTER:
            case PostgreSQLPlpgsqlInnerLexer.COMMENT:
            case PostgreSQLPlpgsqlInnerLexer.COMMENTS:
            case PostgreSQLPlpgsqlInnerLexer.COMMIT:
            case PostgreSQLPlpgsqlInnerLexer.COMMITTED:
            case PostgreSQLPlpgsqlInnerLexer.CONFIGURATION:
            case PostgreSQLPlpgsqlInnerLexer.CONNECTION:
            case PostgreSQLPlpgsqlInnerLexer.CONSTRAINTS:
            case PostgreSQLPlpgsqlInnerLexer.CONTENT_P:
            case PostgreSQLPlpgsqlInnerLexer.CONTINUE_P:
            case PostgreSQLPlpgsqlInnerLexer.CONVERSION_P:
            case PostgreSQLPlpgsqlInnerLexer.COPY:
            case PostgreSQLPlpgsqlInnerLexer.COST:
            case PostgreSQLPlpgsqlInnerLexer.CSV:
            case PostgreSQLPlpgsqlInnerLexer.CURSOR:
            case PostgreSQLPlpgsqlInnerLexer.CYCLE:
            case PostgreSQLPlpgsqlInnerLexer.DATA_P:
            case PostgreSQLPlpgsqlInnerLexer.DATABASE:
            case PostgreSQLPlpgsqlInnerLexer.DAY_P:
            case PostgreSQLPlpgsqlInnerLexer.DEALLOCATE:
            case PostgreSQLPlpgsqlInnerLexer.DECLARE:
            case PostgreSQLPlpgsqlInnerLexer.DEFAULTS:
            case PostgreSQLPlpgsqlInnerLexer.DEFERRED:
            case PostgreSQLPlpgsqlInnerLexer.DEFINER:
            case PostgreSQLPlpgsqlInnerLexer.DELETE_P:
            case PostgreSQLPlpgsqlInnerLexer.DELIMITER:
            case PostgreSQLPlpgsqlInnerLexer.DELIMITERS:
            case PostgreSQLPlpgsqlInnerLexer.DICTIONARY:
            case PostgreSQLPlpgsqlInnerLexer.DISABLE_P:
            case PostgreSQLPlpgsqlInnerLexer.DISCARD:
            case PostgreSQLPlpgsqlInnerLexer.DOCUMENT_P:
            case PostgreSQLPlpgsqlInnerLexer.DOMAIN_P:
            case PostgreSQLPlpgsqlInnerLexer.DOUBLE_P:
            case PostgreSQLPlpgsqlInnerLexer.DROP:
            case PostgreSQLPlpgsqlInnerLexer.EACH:
            case PostgreSQLPlpgsqlInnerLexer.ENABLE_P:
            case PostgreSQLPlpgsqlInnerLexer.ENCODING:
            case PostgreSQLPlpgsqlInnerLexer.ENCRYPTED:
            case PostgreSQLPlpgsqlInnerLexer.ENUM_P:
            case PostgreSQLPlpgsqlInnerLexer.ESCAPE:
            case PostgreSQLPlpgsqlInnerLexer.EVENT:
            case PostgreSQLPlpgsqlInnerLexer.EXCLUDE:
            case PostgreSQLPlpgsqlInnerLexer.EXCLUDING:
            case PostgreSQLPlpgsqlInnerLexer.EXCLUSIVE:
            case PostgreSQLPlpgsqlInnerLexer.EXECUTE:
            case PostgreSQLPlpgsqlInnerLexer.EXPLAIN:
            case PostgreSQLPlpgsqlInnerLexer.EXTENSION:
            case PostgreSQLPlpgsqlInnerLexer.EXTERNAL:
            case PostgreSQLPlpgsqlInnerLexer.FAMILY:
            case PostgreSQLPlpgsqlInnerLexer.FIRST_P:
            case PostgreSQLPlpgsqlInnerLexer.FOLLOWING:
            case PostgreSQLPlpgsqlInnerLexer.FORCE:
            case PostgreSQLPlpgsqlInnerLexer.FORWARD:
            case PostgreSQLPlpgsqlInnerLexer.FUNCTION:
            case PostgreSQLPlpgsqlInnerLexer.FUNCTIONS:
            case PostgreSQLPlpgsqlInnerLexer.GLOBAL:
            case PostgreSQLPlpgsqlInnerLexer.GRANTED:
            case PostgreSQLPlpgsqlInnerLexer.HANDLER:
            case PostgreSQLPlpgsqlInnerLexer.HEADER_P:
            case PostgreSQLPlpgsqlInnerLexer.HOLD:
            case PostgreSQLPlpgsqlInnerLexer.HOUR_P:
            case PostgreSQLPlpgsqlInnerLexer.IDENTITY_P:
            case PostgreSQLPlpgsqlInnerLexer.IF_P:
            case PostgreSQLPlpgsqlInnerLexer.IMMEDIATE:
            case PostgreSQLPlpgsqlInnerLexer.IMMUTABLE:
            case PostgreSQLPlpgsqlInnerLexer.IMPLICIT_P:
            case PostgreSQLPlpgsqlInnerLexer.INCLUDING:
            case PostgreSQLPlpgsqlInnerLexer.INCREMENT:
            case PostgreSQLPlpgsqlInnerLexer.INDEX:
            case PostgreSQLPlpgsqlInnerLexer.INDEXES:
            case PostgreSQLPlpgsqlInnerLexer.INHERIT:
            case PostgreSQLPlpgsqlInnerLexer.INHERITS:
            case PostgreSQLPlpgsqlInnerLexer.INLINE_P:
            case PostgreSQLPlpgsqlInnerLexer.INSENSITIVE:
            case PostgreSQLPlpgsqlInnerLexer.INSERT:
            case PostgreSQLPlpgsqlInnerLexer.INSTEAD:
            case PostgreSQLPlpgsqlInnerLexer.INVOKER:
            case PostgreSQLPlpgsqlInnerLexer.ISOLATION:
            case PostgreSQLPlpgsqlInnerLexer.KEY:
            case PostgreSQLPlpgsqlInnerLexer.LABEL:
            case PostgreSQLPlpgsqlInnerLexer.LANGUAGE:
            case PostgreSQLPlpgsqlInnerLexer.LARGE_P:
            case PostgreSQLPlpgsqlInnerLexer.LAST_P:
            case PostgreSQLPlpgsqlInnerLexer.LEAKPROOF:
            case PostgreSQLPlpgsqlInnerLexer.LEVEL:
            case PostgreSQLPlpgsqlInnerLexer.LISTEN:
            case PostgreSQLPlpgsqlInnerLexer.LOAD:
            case PostgreSQLPlpgsqlInnerLexer.LOCAL:
            case PostgreSQLPlpgsqlInnerLexer.LOCATION:
            case PostgreSQLPlpgsqlInnerLexer.LOCK_P:
            case PostgreSQLPlpgsqlInnerLexer.MAPPING:
            case PostgreSQLPlpgsqlInnerLexer.MATCH:
            case PostgreSQLPlpgsqlInnerLexer.MATERIALIZED:
            case PostgreSQLPlpgsqlInnerLexer.MAXVALUE:
            case PostgreSQLPlpgsqlInnerLexer.MINUTE_P:
            case PostgreSQLPlpgsqlInnerLexer.MINVALUE:
            case PostgreSQLPlpgsqlInnerLexer.MODE:
            case PostgreSQLPlpgsqlInnerLexer.MONTH_P:
            case PostgreSQLPlpgsqlInnerLexer.MOVE:
            case PostgreSQLPlpgsqlInnerLexer.NAME_P:
            case PostgreSQLPlpgsqlInnerLexer.NAMES:
            case PostgreSQLPlpgsqlInnerLexer.NEXT:
            case PostgreSQLPlpgsqlInnerLexer.NO:
            case PostgreSQLPlpgsqlInnerLexer.NOTHING:
            case PostgreSQLPlpgsqlInnerLexer.NOTIFY:
            case PostgreSQLPlpgsqlInnerLexer.NOWAIT:
            case PostgreSQLPlpgsqlInnerLexer.NULLS_P:
            case PostgreSQLPlpgsqlInnerLexer.OBJECT_P:
            case PostgreSQLPlpgsqlInnerLexer.OF:
            case PostgreSQLPlpgsqlInnerLexer.OFF:
            case PostgreSQLPlpgsqlInnerLexer.OIDS:
            case PostgreSQLPlpgsqlInnerLexer.OPERATOR:
            case PostgreSQLPlpgsqlInnerLexer.OPTION:
            case PostgreSQLPlpgsqlInnerLexer.OPTIONS:
            case PostgreSQLPlpgsqlInnerLexer.OWNED:
            case PostgreSQLPlpgsqlInnerLexer.OWNER:
            case PostgreSQLPlpgsqlInnerLexer.PARSER:
            case PostgreSQLPlpgsqlInnerLexer.PARTIAL:
            case PostgreSQLPlpgsqlInnerLexer.PARTITION:
            case PostgreSQLPlpgsqlInnerLexer.PASSING:
            case PostgreSQLPlpgsqlInnerLexer.PASSWORD:
            case PostgreSQLPlpgsqlInnerLexer.PLANS:
            case PostgreSQLPlpgsqlInnerLexer.PRECEDING:
            case PostgreSQLPlpgsqlInnerLexer.PREPARE:
            case PostgreSQLPlpgsqlInnerLexer.PREPARED:
            case PostgreSQLPlpgsqlInnerLexer.PRESERVE:
            case PostgreSQLPlpgsqlInnerLexer.PRIOR:
            case PostgreSQLPlpgsqlInnerLexer.PRIVILEGES:
            case PostgreSQLPlpgsqlInnerLexer.PROCEDURAL:
            case PostgreSQLPlpgsqlInnerLexer.PROCEDURE:
            case PostgreSQLPlpgsqlInnerLexer.PROGRAM:
            case PostgreSQLPlpgsqlInnerLexer.QUOTE:
            case PostgreSQLPlpgsqlInnerLexer.RANGE:
            case PostgreSQLPlpgsqlInnerLexer.READ:
            case PostgreSQLPlpgsqlInnerLexer.REASSIGN:
            case PostgreSQLPlpgsqlInnerLexer.RECHECK:
            case PostgreSQLPlpgsqlInnerLexer.RECURSIVE:
            case PostgreSQLPlpgsqlInnerLexer.REF:
            case PostgreSQLPlpgsqlInnerLexer.REFRESH:
            case PostgreSQLPlpgsqlInnerLexer.REINDEX:
            case PostgreSQLPlpgsqlInnerLexer.RELATIVE_P:
            case PostgreSQLPlpgsqlInnerLexer.RELEASE:
            case PostgreSQLPlpgsqlInnerLexer.RENAME:
            case PostgreSQLPlpgsqlInnerLexer.REPEATABLE:
            case PostgreSQLPlpgsqlInnerLexer.REPLACE:
            case PostgreSQLPlpgsqlInnerLexer.REPLICA:
            case PostgreSQLPlpgsqlInnerLexer.RESET:
            case PostgreSQLPlpgsqlInnerLexer.RESTART:
            case PostgreSQLPlpgsqlInnerLexer.RESTRICT:
            case PostgreSQLPlpgsqlInnerLexer.RETURNS:
            case PostgreSQLPlpgsqlInnerLexer.REVOKE:
            case PostgreSQLPlpgsqlInnerLexer.ROLE:
            case PostgreSQLPlpgsqlInnerLexer.ROLLBACK:
            case PostgreSQLPlpgsqlInnerLexer.ROWS:
            case PostgreSQLPlpgsqlInnerLexer.RULE:
            case PostgreSQLPlpgsqlInnerLexer.SAVEPOINT:
            case PostgreSQLPlpgsqlInnerLexer.SCHEMA:
            case PostgreSQLPlpgsqlInnerLexer.SCROLL:
            case PostgreSQLPlpgsqlInnerLexer.SEARCH:
            case PostgreSQLPlpgsqlInnerLexer.SECOND_P:
            case PostgreSQLPlpgsqlInnerLexer.SECURITY:
            case PostgreSQLPlpgsqlInnerLexer.SEQUENCE:
            case PostgreSQLPlpgsqlInnerLexer.SEQUENCES:
            case PostgreSQLPlpgsqlInnerLexer.SERIALIZABLE:
            case PostgreSQLPlpgsqlInnerLexer.SERVER:
            case PostgreSQLPlpgsqlInnerLexer.SESSION:
            case PostgreSQLPlpgsqlInnerLexer.SET:
            case PostgreSQLPlpgsqlInnerLexer.SHARE:
            case PostgreSQLPlpgsqlInnerLexer.SHOW:
            case PostgreSQLPlpgsqlInnerLexer.SIMPLE:
            case PostgreSQLPlpgsqlInnerLexer.SNAPSHOT:
            case PostgreSQLPlpgsqlInnerLexer.STABLE:
            case PostgreSQLPlpgsqlInnerLexer.STANDALONE_P:
            case PostgreSQLPlpgsqlInnerLexer.START:
            case PostgreSQLPlpgsqlInnerLexer.STATEMENT:
            case PostgreSQLPlpgsqlInnerLexer.STATISTICS:
            case PostgreSQLPlpgsqlInnerLexer.STDIN:
            case PostgreSQLPlpgsqlInnerLexer.STDOUT:
            case PostgreSQLPlpgsqlInnerLexer.STORAGE:
            case PostgreSQLPlpgsqlInnerLexer.STRICT_P:
            case PostgreSQLPlpgsqlInnerLexer.STRIP_P:
            case PostgreSQLPlpgsqlInnerLexer.SYSID:
            case PostgreSQLPlpgsqlInnerLexer.SYSTEM_P:
            case PostgreSQLPlpgsqlInnerLexer.TABLES:
            case PostgreSQLPlpgsqlInnerLexer.TABLESPACE:
            case PostgreSQLPlpgsqlInnerLexer.TEMP:
            case PostgreSQLPlpgsqlInnerLexer.TEMPLATE:
            case PostgreSQLPlpgsqlInnerLexer.TEMPORARY:
            case PostgreSQLPlpgsqlInnerLexer.TEXT_P:
            case PostgreSQLPlpgsqlInnerLexer.TRANSACTION:
            case PostgreSQLPlpgsqlInnerLexer.TRIGGER:
            case PostgreSQLPlpgsqlInnerLexer.TRUNCATE:
            case PostgreSQLPlpgsqlInnerLexer.TRUSTED:
            case PostgreSQLPlpgsqlInnerLexer.TYPE_P:
            case PostgreSQLPlpgsqlInnerLexer.TYPES_P:
            case PostgreSQLPlpgsqlInnerLexer.UNBOUNDED:
            case PostgreSQLPlpgsqlInnerLexer.UNCOMMITTED:
            case PostgreSQLPlpgsqlInnerLexer.UNENCRYPTED:
            case PostgreSQLPlpgsqlInnerLexer.UNKNOWN:
            case PostgreSQLPlpgsqlInnerLexer.UNLISTEN:
            case PostgreSQLPlpgsqlInnerLexer.UNLOGGED:
            case PostgreSQLPlpgsqlInnerLexer.UNTIL:
            case PostgreSQLPlpgsqlInnerLexer.UPDATE:
            case PostgreSQLPlpgsqlInnerLexer.VACUUM:
            case PostgreSQLPlpgsqlInnerLexer.VALID:
            case PostgreSQLPlpgsqlInnerLexer.VALIDATE:
            case PostgreSQLPlpgsqlInnerLexer.VALIDATOR:
            case PostgreSQLPlpgsqlInnerLexer.VARYING:
            case PostgreSQLPlpgsqlInnerLexer.VERSION_P:
            case PostgreSQLPlpgsqlInnerLexer.VIEW:
            case PostgreSQLPlpgsqlInnerLexer.VOLATILE:
            case PostgreSQLPlpgsqlInnerLexer.WHITESPACE_P:
            case PostgreSQLPlpgsqlInnerLexer.WITHOUT:
            case PostgreSQLPlpgsqlInnerLexer.WORK:
            case PostgreSQLPlpgsqlInnerLexer.WRAPPER:
            case PostgreSQLPlpgsqlInnerLexer.WRITE:
            case PostgreSQLPlpgsqlInnerLexer.XML_P:
            case PostgreSQLPlpgsqlInnerLexer.YEAR_P:
            case PostgreSQLPlpgsqlInnerLexer.YES_P:
            case PostgreSQLPlpgsqlInnerLexer.ZONE:
            case PostgreSQLPlpgsqlInnerLexer.BETWEEN:
            case PostgreSQLPlpgsqlInnerLexer.BIGINT:
            case PostgreSQLPlpgsqlInnerLexer.BIT:
            case PostgreSQLPlpgsqlInnerLexer.BOOLEAN_P:
            case PostgreSQLPlpgsqlInnerLexer.CHAR_P:
            case PostgreSQLPlpgsqlInnerLexer.CHARACTER:
            case PostgreSQLPlpgsqlInnerLexer.COALESCE:
            case PostgreSQLPlpgsqlInnerLexer.DEC:
            case PostgreSQLPlpgsqlInnerLexer.DECIMAL_P:
            case PostgreSQLPlpgsqlInnerLexer.EXISTS:
            case PostgreSQLPlpgsqlInnerLexer.EXTRACT:
            case PostgreSQLPlpgsqlInnerLexer.FLOAT_P:
            case PostgreSQLPlpgsqlInnerLexer.GREATEST:
            case PostgreSQLPlpgsqlInnerLexer.INOUT:
            case PostgreSQLPlpgsqlInnerLexer.INT_P:
            case PostgreSQLPlpgsqlInnerLexer.INTEGER:
            case PostgreSQLPlpgsqlInnerLexer.INTERVAL:
            case PostgreSQLPlpgsqlInnerLexer.LEAST:
            case PostgreSQLPlpgsqlInnerLexer.NATIONAL:
            case PostgreSQLPlpgsqlInnerLexer.NCHAR:
            case PostgreSQLPlpgsqlInnerLexer.NONE:
            case PostgreSQLPlpgsqlInnerLexer.NULLIF:
            case PostgreSQLPlpgsqlInnerLexer.NUMERIC:
            case PostgreSQLPlpgsqlInnerLexer.OVERLAY:
            case PostgreSQLPlpgsqlInnerLexer.POSITION:
            case PostgreSQLPlpgsqlInnerLexer.PRECISION:
            case PostgreSQLPlpgsqlInnerLexer.REAL:
            case PostgreSQLPlpgsqlInnerLexer.ROW:
            case PostgreSQLPlpgsqlInnerLexer.SETOF:
            case PostgreSQLPlpgsqlInnerLexer.SMALLINT:
            case PostgreSQLPlpgsqlInnerLexer.SUBSTRING:
            case PostgreSQLPlpgsqlInnerLexer.TIME:
            case PostgreSQLPlpgsqlInnerLexer.TIMESTAMP:
            case PostgreSQLPlpgsqlInnerLexer.TREAT:
            case PostgreSQLPlpgsqlInnerLexer.TRIM:
            case PostgreSQLPlpgsqlInnerLexer.VALUES:
            case PostgreSQLPlpgsqlInnerLexer.VARCHAR:
            case PostgreSQLPlpgsqlInnerLexer.XMLATTRIBUTES:
            case PostgreSQLPlpgsqlInnerLexer.XMLCONCAT:
            case PostgreSQLPlpgsqlInnerLexer.XMLELEMENT:
            case PostgreSQLPlpgsqlInnerLexer.XMLEXISTS:
            case PostgreSQLPlpgsqlInnerLexer.XMLFOREST:
            case PostgreSQLPlpgsqlInnerLexer.XMLPARSE:
            case PostgreSQLPlpgsqlInnerLexer.XMLPI:
            case PostgreSQLPlpgsqlInnerLexer.XMLROOT:
            case PostgreSQLPlpgsqlInnerLexer.XMLSERIALIZE:
            case PostgreSQLPlpgsqlInnerLexer.CALL:
            case PostgreSQLPlpgsqlInnerLexer.CURRENT_P:
            case PostgreSQLPlpgsqlInnerLexer.ATTACH:
            case PostgreSQLPlpgsqlInnerLexer.DETACH:
            case PostgreSQLPlpgsqlInnerLexer.EXPRESSION:
            case PostgreSQLPlpgsqlInnerLexer.GENERATED:
            case PostgreSQLPlpgsqlInnerLexer.LOGGED:
            case PostgreSQLPlpgsqlInnerLexer.STORED:
            case PostgreSQLPlpgsqlInnerLexer.INCLUDE:
            case PostgreSQLPlpgsqlInnerLexer.ROUTINE:
            case PostgreSQLPlpgsqlInnerLexer.TRANSFORM:
            case PostgreSQLPlpgsqlInnerLexer.IMPORT_P:
            case PostgreSQLPlpgsqlInnerLexer.POLICY:
            case PostgreSQLPlpgsqlInnerLexer.METHOD:
            case PostgreSQLPlpgsqlInnerLexer.REFERENCING:
            case PostgreSQLPlpgsqlInnerLexer.NEW:
            case PostgreSQLPlpgsqlInnerLexer.OLD:
            case PostgreSQLPlpgsqlInnerLexer.VALUE_P:
            case PostgreSQLPlpgsqlInnerLexer.SUBSCRIPTION:
            case PostgreSQLPlpgsqlInnerLexer.PUBLICATION:
            case PostgreSQLPlpgsqlInnerLexer.OUT_P:
            case PostgreSQLPlpgsqlInnerLexer.END_P:
            case PostgreSQLPlpgsqlInnerLexer.ROUTINES:
            case PostgreSQLPlpgsqlInnerLexer.SCHEMAS:
            case PostgreSQLPlpgsqlInnerLexer.PROCEDURES:
            case PostgreSQLPlpgsqlInnerLexer.INPUT_P:
            case PostgreSQLPlpgsqlInnerLexer.SUPPORT:
            case PostgreSQLPlpgsqlInnerLexer.PARALLEL:
            case PostgreSQLPlpgsqlInnerLexer.SQL_P:
            case PostgreSQLPlpgsqlInnerLexer.DEPENDS:
            case PostgreSQLPlpgsqlInnerLexer.OVERRIDING:
            case PostgreSQLPlpgsqlInnerLexer.CONFLICT:
            case PostgreSQLPlpgsqlInnerLexer.SKIP_P:
            case PostgreSQLPlpgsqlInnerLexer.LOCKED:
            case PostgreSQLPlpgsqlInnerLexer.TIES:
            case PostgreSQLPlpgsqlInnerLexer.ROLLUP:
            case PostgreSQLPlpgsqlInnerLexer.CUBE:
            case PostgreSQLPlpgsqlInnerLexer.GROUPING:
            case PostgreSQLPlpgsqlInnerLexer.SETS:
            case PostgreSQLPlpgsqlInnerLexer.TABLESAMPLE:
            case PostgreSQLPlpgsqlInnerLexer.ORDINALITY:
            case PostgreSQLPlpgsqlInnerLexer.XMLTABLE:
            case PostgreSQLPlpgsqlInnerLexer.COLUMNS:
            case PostgreSQLPlpgsqlInnerLexer.XMLNAMESPACES:
            case PostgreSQLPlpgsqlInnerLexer.ROWTYPE:
            case PostgreSQLPlpgsqlInnerLexer.NORMALIZED:
            case PostgreSQLPlpgsqlInnerLexer.WITHIN:
            case PostgreSQLPlpgsqlInnerLexer.FILTER:
            case PostgreSQLPlpgsqlInnerLexer.GROUPS:
            case PostgreSQLPlpgsqlInnerLexer.OTHERS:
            case PostgreSQLPlpgsqlInnerLexer.NFC:
            case PostgreSQLPlpgsqlInnerLexer.NFD:
            case PostgreSQLPlpgsqlInnerLexer.NFKC:
            case PostgreSQLPlpgsqlInnerLexer.NFKD:
            case PostgreSQLPlpgsqlInnerLexer.UESCAPE:
            case PostgreSQLPlpgsqlInnerLexer.VIEWS:
            case PostgreSQLPlpgsqlInnerLexer.NORMALIZE:
            case PostgreSQLPlpgsqlInnerLexer.DUMP:
            case PostgreSQLPlpgsqlInnerLexer.PRINT_STRICT_PARAMS:
            case PostgreSQLPlpgsqlInnerLexer.VARIABLE_CONFLICT:
            case PostgreSQLPlpgsqlInnerLexer.ERROR:
            case PostgreSQLPlpgsqlInnerLexer.USE_VARIABLE:
            case PostgreSQLPlpgsqlInnerLexer.USE_COLUMN:
            case PostgreSQLPlpgsqlInnerLexer.ALIAS:
            case PostgreSQLPlpgsqlInnerLexer.CONSTANT:
            case PostgreSQLPlpgsqlInnerLexer.PERFORM:
            case PostgreSQLPlpgsqlInnerLexer.GET:
            case PostgreSQLPlpgsqlInnerLexer.DIAGNOSTICS:
            case PostgreSQLPlpgsqlInnerLexer.STACKED:
            case PostgreSQLPlpgsqlInnerLexer.ELSIF:
            case PostgreSQLPlpgsqlInnerLexer.WHILE:
            case PostgreSQLPlpgsqlInnerLexer.REVERSE:
            case PostgreSQLPlpgsqlInnerLexer.FOREACH:
            case PostgreSQLPlpgsqlInnerLexer.SLICE:
            case PostgreSQLPlpgsqlInnerLexer.EXIT:
            case PostgreSQLPlpgsqlInnerLexer.RETURN:
            case PostgreSQLPlpgsqlInnerLexer.QUERY:
            case PostgreSQLPlpgsqlInnerLexer.RAISE:
            case PostgreSQLPlpgsqlInnerLexer.SQLSTATE:
            case PostgreSQLPlpgsqlInnerLexer.DEBUG:
            case PostgreSQLPlpgsqlInnerLexer.LOG:
            case PostgreSQLPlpgsqlInnerLexer.INFO:
            case PostgreSQLPlpgsqlInnerLexer.NOTICE:
            case PostgreSQLPlpgsqlInnerLexer.WARNING:
            case PostgreSQLPlpgsqlInnerLexer.EXCEPTION:
            case PostgreSQLPlpgsqlInnerLexer.ASSERT:
            case PostgreSQLPlpgsqlInnerLexer.LOOP:
            case PostgreSQLPlpgsqlInnerLexer.OPEN:
//            case PostgreSQLPlpgsqlInnerLexer.FUNCTION:
//            case PostgreSQLPlpgsqlInnerLexer.RETURNS:
//            case PostgreSQLPlpgsqlInnerLexer.LANGUAGE:
//            case PostgreSQLPlpgsqlInnerLexer.DECLARE:
//            case PostgreSQLPlpgsqlInnerLexer.BEGIN_P:
//            case PostgreSQLPlpgsqlInnerLexer.END_P:
                attrKey = KEYWORD;
                break;
            case PostgreSQLPlpgsqlInnerLexer.StringConstant:
            case PostgreSQLPlpgsqlInnerLexer.UnterminatedStringConstant:
            case PostgreSQLPlpgsqlInnerLexer.UnicodeEscapeStringConstant:
            case PostgreSQLPlpgsqlInnerLexer.UnterminatedUnicodeEscapeStringConstant:
            case PostgreSQLPlpgsqlInnerLexer.DollarStringConstant:
            case PostgreSQLPlpgsqlInnerLexer.BinaryStringConstant:
            case PostgreSQLPlpgsqlInnerLexer.UnterminatedBinaryStringConstant:
            case PostgreSQLPlpgsqlInnerLexer.InvalidUnterminatedBinaryStringConstant:
            case PostgreSQLPlpgsqlInnerLexer.HexadecimalStringConstant:
            case PostgreSQLPlpgsqlInnerLexer.UnterminatedHexadecimalStringConstant:
            case PostgreSQLPlpgsqlInnerLexer.InvalidHexadecimalStringConstant:
            case PostgreSQLPlpgsqlInnerLexer.InvalidUnterminatedHexadecimalStringConstant:
            case PostgreSQLPlpgsqlInnerLexer.EscapeStringConstant:
            case PostgreSQLPlpgsqlInnerLexer.InvalidBinaryStringConstant:
            case PostgreSQLPlpgsqlInnerLexer.UnterminatedEscapeStringConstant:
            case PostgreSQLPlpgsqlInnerLexer.InvalidEscapeStringConstant:
            case PostgreSQLPlpgsqlInnerLexer.InvalidUnterminatedEscapeStringConstant:
            case PostgreSQLPlpgsqlInnerLexer.AfterEscapeStringConstantMode_NotContinued:
            case PostgreSQLPlpgsqlInnerLexer.AfterEscapeStringConstantWithNewlineMode_NotContinued:
            case PostgreSQLPlpgsqlInnerLexer.AfterEscapeStringConstantWithNewlineMode_Continued:
                attrKey = STRING;
                break;
            case PostgreSQLPlpgsqlInnerLexer.LineComment:
                attrKey = LINE_COMMENT;
                break;
            case PostgreSQLPlpgsqlInnerLexer.BlockComment:
                attrKey = BLOCK_COMMENT;
                break;
            default:
                return EMPTY_KEYS;
        }
        return new TextAttributesKey[]{attrKey};
    }
}
