//lexer grammar OpenGaussLexer;
//
//options {
//   superClass = OpenGaussLexerBase;
//   caseInsensitive = true;
//}
//
//@ header
//{
//}
//@ members
//{
///* This field stores the tags which are used to detect the end of a dollar-quoted string literal.
// */
//}
//
//OPEN_PAREN // OK
//   : '('
//   ;
//
//CLOSE_PAREN // OK
//   : ')'
//   ;
//
//OPEN_BRACKET // OK
//   : '['
//   ;
//
//CLOSE_BRACKET // OK
//   : ']'
//   ;
//
//COMMA // OK
//   : ','
//   ;
//
//SEMI // OK
//   : ';'
//   ;
//
//COLON // OK
//   : ':'
//   ;
//
//STAR // OK
//   : '*'
//   ;
//
//EQUAL // OK
//   : '='
//   ;
//
//DOT //OK
//   : '.'
//   ;
//   //NamedArgument	: ':=';
//
//PLUS //OK
//   : '+'
//   ;
//
//MINUS //OK
//   : '-'
//   ;
//
//SLASH //OK
//   : '/'
//   ;
//
//CARET //OK
//   : '^'
//   ;
//
//LT // OK
//   : '<'
//   ;
//
//GT // OK
//   : '>'
//   ;
//
//PERCENT // OK
//   : '%'
//   ;
//
//AT // OK
//   : '@'
//   ;
//
//SHARP // OK
//   : '#'
//   ;
//
///************************************************************************************************************************************************************/
///* SQL TOKEN */
///************************************************************************************************************************************************************/
//
//ABORT_P:
//   'ABORT'
//   ;
//
//ABSOLUTE_P:
//   'ABSOLUTE'
//   ;
//
//ACCESS:
//   'ACCESS'
//   ;
//
//ACCOUNT:
//   'ACCOUNT'
//   ;
//
//ACTION:
//   'ACTION'
//   ;
//
//ADD_P:
//   'ADD'
//   ;
//
//ADMIN:
//   'ADMIN'
//   ;
//
//AFTER:
//   'AFTER'
//   ;
//
//AGGREGATE:
//   'AGGREGATE'
//   ;
//
//ALGORITHM:
//   'ALGORITHM'
//   ;
//
//ALL:
//   'ALL'
//   ;
//
//ALSO:
//   'ALSO'
//   ;
//
//ALTER:
//   'ALTER'
//   ;
//
//ALWAYS:
//   'ALWAYS'
//   ;
//
//ANALYSE:
//   'ANALYSE'
//   ;
//
//ANALYZE:
//   'ANALYZE'
//   ;
//
//AND:
//   'AND'
//   ;
//
//ANY:
//   'ANY'
//   ;
//
//APP:
//   'APP'
//   ;
//
//APPEND:
//   'APPEND'
//   ;
//
//ARCHIVE:
//   'ARCHIVE'
//   ;
//
//ARRAY:
//   'ARRAY'
//   ;
//
//AS:
//   'AS'
//   ;
//
//ASC:
//   'ASC'
//   ;
//
//ASSERTION:
//   'ASSERTION'
//   ;
//
//ASSIGNMENT:
//   'ASSIGNMENT'
//   ;
//
//ASYMMETRIC:
//   'ASYMMETRIC'
//   ;
//
//AT_P:
//   'AT'
//   ;
//
//ATTRIBUTE:
//   'ATTRIBUTE'
//   ;
//
//AUDIT:
//   'AUDIT'
//   ;
//
//AUTHID:
//   'AUTHID'
//   ;
//
//AUTHORIZATION:
//   'AUTHORIZATION'
//   ;
//
//AUTO_INCREMENT:
//   'AUTO_INCREMENT'
//   ;
//
//AUTOEXTEND:
//   'AUTOEXTEND'
//   ;
//
//AUTOMAPPED:
//   'AUTOMAPPED'
//   ;
//
//BACKWARD:
//   'BACKWARD'
//   ;
//
//BARRIER:
//   'BARRIER'
//   ;
//
//BEFORE:
//   'BEFORE'
//   ;
//
//BEGIN_P:
//   'BEGIN'
//   ;
//
//BEGIN_NON_ANOYBLOCK:
//   'BEGIN_NON_ANOYBLOCK'
//   ;
//
//BETWEEN:
//   'BETWEEN'
//   ;
//
//BIGINT:
//   'BIGINT'
//   ;
//
//BINARY:
//   'BINARY'
//   ;
//
//BINARY_DOUBLE:
//   'BINARY_DOUBLE'
//   ;
//
//BINARY_INTEGER:
//   'BINARY_INTEGER'
//   ;
//
//BIT:
//   'BIT'
//   ;
//
//BLANKS:
//   'BLANKS'
//   ;
//
//BLOB_P:
//   'BLOB'
//   ;
//
//BLOCKCHAIN:
//   'BLOCKCHAIN'
//   ;
//
//BODY_P:
//   'BODY'
//   ;
//
//BOOLEAN_P:
//   'BOOLEAN'
//   ;
//
//BOTH:
//   'BOTH'
//   ;
//
//BUCKETCNT:
//   'BUCKETCNT'
//   ;
//
//BUCKETS:
//   'BUCKETS'
//   ;
//
//BY:
//   'BY'
//   ;
//
//BYTEAWITHOUTORDER:
//   'BYTEAWITHOUTORDER'
//   ;
//
//BYTEAWITHOUTORDERWITHEQUAL:
//   'BYTEAWITHOUTORDERWITHEQUAL'
//   ;
//
//CACHE:
//   'CACHE'
//   ;
//
//CALL:
//   'CALL'
//   ;
//
//CALLED:
//   'CALLED'
//   ;
//
//CANCELABLE:
//   'CANCELABLE'
//   ;
//
//CASCADE:
//   'CASCADE'
//   ;
//
//CASCADED:
//   'CASCADED'
//   ;
//
//CASE:
//   'CASE'
//   ;
//
//CAST:
//   'CAST'
//   ;
//
//CATALOG_P:
//   'CATALOG'
//   ;
//
//CHAIN:
//   'CHAIN'
//   ;
//
//CHANGE:
//   'CHANGE'
//   ;
//
//CHAR_P:
//   'CHAR'
//   ;
//
//CHARACTER:
//   'CHARACTER'
//   ;
//
//CHARACTERISTICS:
//   'CHARACTERISTICS'
//   ;
//
//CHARACTERSET:
//   'CHARACTERSET'
//   ;
//
//CHARSET:
//   'CHARSET'
//   ;
//
//CHECK:
//   'CHECK'
//   ;
//
//CHECKPOINT:
//   'CHECKPOINT'
//   ;
//
//CLASS:
//   'CLASS'
//   ;
//
//CLEAN:
//   'CLEAN'
//   ;
//
//CLIENT:
//   'CLIENT'
//   ;
//
//CLIENT_MASTER_KEY:
//   'CLIENT_MASTER_KEY'
//   ;
//
//CLIENT_MASTER_KEYS:
//   'CLIENT_MASTER_KEYS'
//   ;
//
//CLOB:
//   'CLOB'
//   ;
//
//CLOSE:
//   'CLOSE'
//   ;
//
//CLUSTER:
//   'CLUSTER'
//   ;
//
//COALESCE:
//   'COALESCE'
//   ;
//
//COLLATE:
//   'COLLATE'
//   ;
//
//COLLATION:
//   'COLLATION'
//   ;
//
//COLUMN:
//   'COLUMN'
//   ;
//
//COLUMN_ENCRYPTION_KEY:
//   'COLUMN_ENCRYPTION_KEY'
//   ;
//
//COLUMN_ENCRYPTION_KEYS:
//   'COLUMN_ENCRYPTION_KEYS'
//   ;
//
//COLUMNS:
//   'COLUMNS'
//   ;
//
//COMMENT:
//   'COMMENT'
//   ;
//
//COMMENTS:
//   'COMMENTS'
//   ;
//
//COMMIT:
//   'COMMIT'
//   ;
//
//COMMITTED:
//   'COMMITTED'
//   ;
//
//COMPACT:
//   'COMPACT'
//   ;
//
//COMPATIBLE_ILLEGAL_CHARS:
//   'COMPATIBLE_ILLEGAL_CHARS'
//   ;
//
//COMPLETE:
//   'COMPLETE'
//   ;
//
//COMPLETION:
//   'COMPLETION'
//   ;
//
//COMPRESS:
//   'COMPRESS'
//   ;
//
//CONCURRENTLY:
//   'CONCURRENTLY'
//   ;
//
//CONDITION:
//   'CONDITION'
//   ;
//
//CONFIGURATION:
//   'CONFIGURATION'
//   ;
//
//CONNECT:
//   'CONNECT'
//   ;
//
//CONNECTION:
//   'CONNECTION'
//   ;
//
//CONSTANT:
//   'CONSTANT'
//   ;
//
//CONSTRAINT:
//   'CONSTRAINT'
//   ;
//
//CONSTRAINTS:
//   'CONSTRAINTS'
//   ;
//
//CONTENT_P:
//   'CONTENT'
//   ;
//
//CONTINUE_P:
//   'CONTINUE'
//   ;
//
//CONTVIEW:
//   'CONTVIEW'
//   ;
//
//CONVERSION_P:
//   'CONVERSION'
//   ;
//
//CONVERT_P:
//   'CONVERT'
//   ;
//
//COORDINATOR:
//   'COORDINATOR'
//   ;
//
//COORDINATORS:
//   'COORDINATORS'
//   ;
//
//COPY:
//   'COPY'
//   ;
//
//COST:
//   'COST'
//   ;
//
//CREATE:
//   'CREATE'
//   ;
//
//CROSS:
//   'CROSS'
//   ;
//
//CSN:
//   'CSN'
//   ;
//
//CSV:
//   'CSV'
//   ;
//
//CUBE:
//   'CUBE'
//   ;
//
//CURRENT_P:
//   'CURRENT'
//   ;
//
//CURRENT_CATALOG:
//   'CURRENT_CATALOG'
//   ;
//
//CURRENT_DATE:
//   'CURRENT_DATE'
//   ;
//
//CURRENT_ROLE:
//   'CURRENT_ROLE'
//   ;
//
//CURRENT_SCHEMA:
//   'CURRENT_SCHEMA'
//   ;
//
//CURRENT_TIME:
//   'CURRENT_TIME'
//   ;
//
//CURRENT_TIMESTAMP:
//   'CURRENT_TIMESTAMP'
//   ;
//
//CURRENT_USER:
//   'CURRENT_USER'
//   ;
//
//CURSOR:
//   'CURSOR'
//   ;
//
//CYCLE:
//   'CYCLE'
//   ;
//
//DATA_P:
//   'DATA'
//   ;
//
//DATABASE:
//   'DATABASE'
//   ;
//
//DATAFILE:
//   'DATAFILE'
//   ;
//
//DATANODE:
//   'DATANODE'
//   ;
//
//DATANODES:
//   'DATANODES'
//   ;
//
//DATATYPE_CL:
//   'DATATYPE_CL'
//   ;
//
//DATE_P:
//   'DATE'
//   ;
//
//DATE_FORMAT_P:
//   'DATE_FORMAT'
//   ;
//
//DAY_P:
//   'DAY'
//   ;
//
//DBCOMPATIBILITY_P:
//   'DBCOMPATIBILITY'
//   ;
//
//DEALLOCATE:
//   'DEALLOCATE'
//   ;
//
//DEC:
//   'DEC'
//   ;
//
//DECIMAL_P:
//   'DECIMAL'
//   ;
//
//DECLARE:
//   'DECLARE'
//   ;
//
//DECODE:
//   'DECODE'
//   ;
//
//DEFAULT:
//   'DEFAULT'
//   ;
//
//DEFAULTS:
//   'DEFAULTS'
//   ;
//
//DEFERRABLE:
//   'DEFERRABLE'
//   ;
//
//DEFERRED:
//   'DEFERRED'
//   ;
//
//DEFINER:
//   'DEFINER'
//   ;
//
//DELETE_P:
//   'DELETE'
//   ;
//
//DELIMITER:
//   'DELIMITER'
//   ;
//
//DELIMITERS:
//   'DELIMITERS'
//   ;
//
//DELTA:
//   'DELTA'
//   ;
//
//DELTAMERGE:
//   'DELTAMERGE'
//   ;
//
//DESC:
//   'DESC'
//   ;
//
//DETERMINISTIC:
//   'DETERMINISTIC'
//   ;
//
//DICTIONARY:
//   'DICTIONARY'
//   ;
//
//DIRECT:
//   'DIRECT'
//   ;
//
//DIRECTORY:
//   'DIRECTORY'
//   ;
//
//DISABLE_P:
//   'DISABLE'
//   ;
//
//DISCARD:
//   'DISCARD'
//   ;
//
//DISCONNECT:
//   'DISCONNECT'
//   ;
//
//DISTINCT:
//   'DISTINCT'
//   ;
//
//DISTRIBUTE:
//   'DISTRIBUTE'
//   ;
//
//DISTRIBUTION:
//   'DISTRIBUTION'
//   ;
//
//DO:
//   'DO'
//   ;
//
//DOCUMENT_P:
//   'DOCUMENT'
//   ;
//
//DOMAIN_P:
//   'DOMAIN'
//   ;
//
//DOUBLE_P:
//   'DOUBLE'
//   ;
//
//DROP:
//   'DROP'
//   ;
//
//DUMPFILE:
//   'DUMPFILE'
//   ;
//
//DUPLICATE:
//   'DUPLICATE'
//   ;
//
//EACH:
//   'EACH'
//   ;
//
//ELASTIC:
//   'ELASTIC'
//   ;
//
//ELSE:
//   'ELSE'
//   ;
//
//ENABLE_P:
//   'ENABLE'
//   ;
//
//ENCLOSED:
//   'ENCLOSED'
//   ;
//
//ENCODING:
//   'ENCODING'
//   ;
//
//ENCRYPTED:
//   'ENCRYPTED'
//   ;
//
//ENCRYPTED_VALUE:
//   'ENCRYPTED_VALUE'
//   ;
//
//ENCRYPTION:
//   'ENCRYPTION'
//   ;
//
//ENCRYPTION_TYPE:
//   'ENCRYPTION_TYPE'
//   ;
//
//END_P:
//   'END'
//   ;
//
//ENDS:
//   'ENDS'
//   ;
//
//ENFORCED:
//   'ENFORCED'
//   ;
//
//ENUM_P:
//   'ENUM'
//   ;
//
//EOL:
//   'EOL'
//   ;
//
//ERRORS:
//   'ERRORS'
//   ;
//
//ESCAPE:
//   'ESCAPE'
//   ;
//
//ESCAPED:
//   'ESCAPED'
//   ;
//
//ESCAPING:
//   'ESCAPING'
//   ;
//
//EVENT:
//   'EVENT'
//   ;
//
//EVENTS:
//   'EVENTS'
//   ;
//
//EVERY:
//   'EVERY'
//   ;
//
//EXCEPT:
//   'EXCEPT'
//   ;
//
//EXCHANGE:
//   'EXCHANGE'
//   ;
//
//EXCLUDE:
//   'EXCLUDE'
//   ;
//
//EXCLUDED:
//   'EXCLUDED'
//   ;
//
//EXCLUDING:
//   'EXCLUDING'
//   ;
//
//EXCLUSIVE:
//   'EXCLUSIVE'
//   ;
//
//EXECUTE:
//   'EXECUTE'
//   ;
//
//EXISTS:
//   'EXISTS'
//   ;
//
//EXPIRED_P:
//   'EXPIRED'
//   ;
//
//EXPLAIN:
//   'EXPLAIN'
//   ;
//
//EXTENSION:
//   'EXTENSION'
//   ;
//
//EXTERNAL:
//   'EXTERNAL'
//   ;
//
//EXTRACT:
//   'EXTRACT'
//   ;
//
//FALSE_P:
//   'FALSE'
//   ;
//
//FAMILY:
//   'FAMILY'
//   ;
//
//FAST:
//   'FAST'
//   ;
//
//FEATURES:
//   'FEATURES'
//   ;
//
//FENCED:
//   'FENCED'
//   ;
//
//FETCH:
//   'FETCH'
//   ;
//
//FIELDS:
//   'FIELDS'
//   ;
//
//FILEHEADER_P:
//   'FILEHEADER'
//   ;
//
//FILL_MISSING_FIELDS:
//   'FILL_MISSING_FIELDS'
//   ;
//
//FILLER:
//   'FILLER'
//   ;
//
//FILTER:
//   'FILTER'
//   ;
//
//FIRST_P:
//   'FIRST'
//   ;
//
//FIXED_P:
//   'FIXED'
//   ;
//
//FLOAT_P:
//   'FLOAT'
//   ;
//
//FOLLOWING:
//   'FOLLOWING'
//   ;
//
//FOLLOWS_P:
//   'FOLLOWS'
//   ;
//
//FOR:
//   'FOR'
//   ;
//
//FORCE:
//   'FORCE'
//   ;
//
//FOREIGN:
//   'FOREIGN'
//   ;
//
//FORMATTER:
//   'FORMATTER'
//   ;
//
//FORWARD:
//   'FORWARD'
//   ;
//
//FREEZE:
//   'FREEZE'
//   ;
//
//FROM:
//   'FROM'
//   ;
//
//FULL:
//   'FULL'
//   ;
//
//FUNCTION:
//   'FUNCTION'
//   ;
//
//FUNCTIONS:
//   'FUNCTIONS'
//   ;
//
//GENERATED:
//   'GENERATED'
//   ;
//
//GLOBAL:
//   'GLOBAL'
//   ;
//
//GRANT:
//   'GRANT'
//   ;
//
//GRANTED:
//   'GRANTED'
//   ;
//
//GREATEST:
//   'GREATEST'
//   ;
//
//GROUP_P:
//   'GROUP'
//   ;
//
//GROUPING_P:
//   'GROUPING'
//   ;
//
//GROUPPARENT:
//   'GROUPPARENT'
//   ;
//
//HANDLER:
//   'HANDLER'
//   ;
//
//HAVING:
//   'HAVING'
//   ;
//
//HDFSDIRECTORY:
//   'HDFSDIRECTORY'
//   ;
//
//HEADER_P:
//   'HEADER'
//   ;
//
//HOLD:
//   'HOLD'
//   ;
//
//HOUR_P:
//   'HOUR'
//   ;
//
//IDENTIFIED:
//   'IDENTIFIED'
//   ;
//
//IDENTITY_P:
//   'IDENTITY'
//   ;
//
//IF_P:
//   'IF'
//   ;
//
//IGNORE:
//   'IGNORE'
//   ;
//
//IGNORE_EXTRA_DATA:
//   'IGNORE_EXTRA_DATA'
//   ;
//
//ILIKE:
//   'ILIKE'
//   ;
//
//IMMEDIATE:
//   'IMMEDIATE'
//   ;
//
//IMMUTABLE:
//   'IMMUTABLE'
//   ;
//
//IMPLICIT_P:
//   'IMPLICIT'
//   ;
//
//IN_P:
//   'IN'
//   ;
//
//INCLUDE:
//   'INCLUDE'
//   ;
//
//INCLUDING:
//   'INCLUDING'
//   ;
//
//INCREMENT:
//   'INCREMENT'
//   ;
//
//INCREMENTAL:
//   'INCREMENTAL'
//   ;
//
//INDEX:
//   'INDEX'
//   ;
//
//INDEXES:
//   'INDEXES'
//   ;
//
//INFILE:
//   'INFILE'
//   ;
//
//INHERIT:
//   'INHERIT'
//   ;
//
//INHERITS:
//   'INHERITS'
//   ;
//
//INITIAL_P:
//   'INITIAL'
//   ;
//
//INITIALLY:
//   'INITIALLY'
//   ;
//
//INITRANS:
//   'INITRANS'
//   ;
//
//INLINE_P:
//   'INLINE'
//   ;
//
//INNER_P:
//   'INNER'
//   ;
//
//INOUT:
//   'INOUT'
//   ;
//
//INPUT_P:
//   'INPUT'
//   ;
//
//INSENSITIVE:
//   'INSENSITIVE'
//   ;
//
//INSERT:
//   'INSERT'
//   ;
//
//INSTEAD:
//   'INSTEAD'
//   ;
//
//INT_P:
//   'INT'
//   ;
//
//INTEGER:
//   'INTEGER'
//   ;
//
//INTERNAL:
//   'INTERNAL'
//   ;
//
//INTERSECT:
//   'INTERSECT'
//   ;
//
//INTERVAL:
//   'INTERVAL'
//   ;
//
//INTO:
//   'INTO'
//   ;
//
//INVISIBLE:
//   'INVISIBLE'
//   ;
//
//INVOKER:
//   'INVOKER'
//   ;
//
//IP:
//   'IP'
//   ;
//
//IS:
//   'IS'
//   ;
//
//ISNULL:
//   'ISNULL'
//   ;
//
//ISOLATION:
//   'ISOLATION'
//   ;
//
//JOIN:
//   'JOIN'
//   ;
//
//KEY:
//   'KEY'
//   ;
//
//KEY_PATH:
//   'KEY_PATH'
//   ;
//
//KEY_STORE:
//   'KEY_STORE'
//   ;
//
//KILL:
//   'KILL'
//   ;
//
//LABEL:
//   'LABEL'
//   ;
//
//LANGUAGE:
//   'LANGUAGE'
//   ;
//
//LARGE_P:
//   'LARGE'
//   ;
//
//LAST_P:
//   'LAST'
//   ;
//
//LC_COLLATE_P:
//   'LC_COLLATE'
//   ;
//
//LC_CTYPE_P:
//   'LC_CTYPE'
//   ;
//
//LEADING:
//   'LEADING'
//   ;
//
//LEAKPROOF:
//   'LEAKPROOF'
//   ;
//
//LEAST:
//   'LEAST'
//   ;
//
//LEFT:
//   'LEFT'
//   ;
//
//LESS:
//   'LESS'
//   ;
//
//LEVEL:
//   'LEVEL'
//   ;
//
//LIKE:
//   'LIKE'
//   ;
//
//LIMIT:
//   'LIMIT'
//   ;
//
//LINES:
//   'LINES'
//   ;
//
//LIST:
//   'LIST'
//   ;
//
//LISTEN:
//   'LISTEN'
//   ;
//
//LOAD:
//   'LOAD'
//   ;
//
//LOCAL:
//   'LOCAL'
//   ;
//
//LOCALTIME:
//   'LOCALTIME'
//   ;
//
//LOCALTIMESTAMP:
//   'LOCALTIMESTAMP'
//   ;
//
//LOCATION:
//   'LOCATION'
//   ;
//
//LOCK_P:
//   'LOCK'
//   ;
//
//LOCKED:
//   'LOCKED'
//   ;
//
//LOG_P:
//   'LOG'
//   ;
//
//LOGGING:
//   'LOGGING'
//   ;
//
//LOGIN_ANY:
//   'LOGIN_ANY'
//   ;
//
//LOGIN_FAILURE:
//   'LOGIN_FAILURE'
//   ;
//
//LOGIN_SUCCESS:
//   'LOGIN_SUCCESS'
//   ;
//
//LOGOUT:
//   'LOGOUT'
//   ;
//
//LOOP:
//   'LOOP'
//   ;
//
//MAPPING:
//   'MAPPING'
//   ;
//
//MASKING:
//   'MASKING'
//   ;
//
//MASTER:
//   'MASTER'
//   ;
//
//MATCH:
//   'MATCH'
//   ;
//
//MATCHED:
//   'MATCHED'
//   ;
//
//MATERIALIZED:
//   'MATERIALIZED'
//   ;
//
//MAXEXTENTS:
//   'MAXEXTENTS'
//   ;
//
//MAXSIZE:
//   'MAXSIZE'
//   ;
//
//MAXTRANS:
//   'MAXTRANS'
//   ;
//
//MAXVALUE:
//   'MAXVALUE'
//   ;
//
//MERGE:
//   'MERGE'
//   ;
//
//MINEXTENTS:
//   'MINEXTENTS'
//   ;
//
//MINUS_P:
//   'MINUS'
//   ;
//
//MINUTE_P:
//   'MINUTE'
//   ;
//
//MINVALUE:
//   'MINVALUE'
//   ;
//
//MODE:
//   'MODE'
//   ;
//
//MODEL:
//   'MODEL'
//   ;
//
//MODIFY_P:
//   'MODIFY'
//   ;
//
//MONTH_P:
//   'MONTH'
//   ;
//
//MOVE:
//   'MOVE'
//   ;
//
//MOVEMENT:
//   'MOVEMENT'
//   ;
//
//NAME_P:
//   'NAME'
//   ;
//
//NAMES:
//   'NAMES'
//   ;
//
//NATIONAL:
//   'NATIONAL'
//   ;
//
//NATURAL:
//   'NATURAL'
//   ;
//
//NCHAR:
//   'NCHAR'
//   ;
//
//NEXT:
//   'NEXT'
//   ;
//
//NO:
//   'NO'
//   ;
//
//NOCOMPRESS:
//   'NOCOMPRESS'
//   ;
//
//NOCYCLE:
//   'NOCYCLE'
//   ;
//
//NODE:
//   'NODE'
//   ;
//
//NOLOGGING:
//   'NOLOGGING'
//   ;
//
//NOMAXVALUE:
//   'NOMAXVALUE'
//   ;
//
//NOMINVALUE:
//   'NOMINVALUE'
//   ;
//
//NONE:
//   'NONE'
//   ;
//
//NOT:
//   'NOT'
//   ;
//
//NOTHING:
//   'NOTHING'
//   ;
//
//NOTIFY:
//   'NOTIFY'
//   ;
//
//NOTNULL:
//   'NOTNULL'
//   ;
//
//NOWAIT:
//   'NOWAIT'
//   ;
//
//NULL_P:
//   'NULL'
//   ;
//
//NULLCOLS:
//   'NULLCOLS'
//   ;
//
//NULLIF:
//   'NULLIF'
//   ;
//
//NULLS_P:
//   'NULLS'
//   ;
//
//NUMBER_P:
//   'NUMBER'
//   ;
//
//NUMERIC:
//   'NUMERIC'
//   ;
//
//NUMSTR:
//   'NUMSTR'
//   ;
//
//NVARCHAR:
//   'NVARCHAR'
//   ;
//
//NVARCHAR2:
//   'NVARCHAR2'
//   ;
//
//NVL:
//   'NVL'
//   ;
//
//OBJECT_P:
//   'OBJECT'
//   ;
//
//OF:
//   'OF'
//   ;
//
//OFF:
//   'OFF'
//   ;
//
//OFFSET:
//   'OFFSET'
//   ;
//
//OIDS:
//   'OIDS'
//   ;
//
//ON:
//   'ON'
//   ;
//
//ONLY:
//   'ONLY'
//   ;
//
//OPERATOR:
//   'OPERATOR'
//   ;
//
//OPTIMIZATION:
//   'OPTIMIZATION'
//   ;
//
//OPTION:
//   'OPTION'
//   ;
//
//OPTIONALLY:
//   'OPTIONALLY'
//   ;
//
//OPTIONS:
//   'OPTIONS'
//   ;
//
//OR:
//   'OR'
//   ;
//
//ORDER:
//   'ORDER'
//   ;
//
//OUT_P:
//   'OUT'
//   ;
//
//OUTER_P:
//   'OUTER'
//   ;
//
//OUTFILE:
//   'OUTFILE'
//   ;
//
//OVER:
//   'OVER'
//   ;
//
//OVERLAPS:
//   'OVERLAPS'
//   ;
//
//OVERLAY:
//   'OVERLAY'
//   ;
//
//OWNED:
//   'OWNED'
//   ;
//
//OWNER:
//   'OWNER'
//   ;
//
//PACKAGE:
//   'PACKAGE'
//   ;
//
//PACKAGES:
//   'PACKAGES'
//   ;
//
//PARSER:
//   'PARSER'
//   ;
//
//PARTIAL:
//   'PARTIAL'
//   ;
//
//PARTITION:
//   'PARTITION'
//   ;
//
//PARTITIONS:
//   'PARTITIONS'
//   ;
//
//PASSING:
//   'PASSING'
//   ;
//
//PASSWORD:
//   'PASSWORD'
//   ;
//
//PCTFREE:
//   'PCTFREE'
//   ;
//
//PER_P:
//   'PER'
//   ;
//
//PERCENT_P:
//   'PERCENT'
//   ;
//
//PERFORMANCE:
//   'PERFORMANCE'
//   ;
//
//PERM:
//   'PERM'
//   ;
//
//PLACING:
//   'PLACING'
//   ;
//
//PLAN:
//   'PLAN'
//   ;
//
//PLANS:
//   'PLANS'
//   ;
//
//POLICY:
//   'POLICY'
//   ;
//
//POOL:
//   'POOL'
//   ;
//
//POSITION:
//   'POSITION'
//   ;
//
//PRECEDES_P:
//   'PRECEDES'
//   ;
//
//PRECEDING:
//   'PRECEDING'
//   ;
//
//PRECISION:
//   'PRECISION'
//   ;
//
//PREDICT:
//   'PREDICT'
//   ;
//
//PREFERRED:
//   'PREFERRED'
//   ;
//
//PREFIX:
//   'PREFIX'
//   ;
//
//PREPARE:
//   'PREPARE'
//   ;
//
//PREPARED:
//   'PREPARED'
//   ;
//
//PRESERVE:
//   'PRESERVE'
//   ;
//
//PRIMARY:
//   'PRIMARY'
//   ;
//
//PRIOR:
//   'PRIOR'
//   ;
//
//PRIORER:
//   'PRIORER'
//   ;
//
//PRIVATE:
//   'PRIVATE'
//   ;
//
//PRIVILEGE:
//   'PRIVILEGE'
//   ;
//
//PRIVILEGES:
//   'PRIVILEGES'
//   ;
//
//PROCEDURAL:
//   'PROCEDURAL'
//   ;
//
//PROCEDURE:
//   'PROCEDURE'
//   ;
//
//PROFILE:
//   'PROFILE'
//   ;
//
//PUBLICATION:
//   'PUBLICATION'
//   ;
//
//PUBLISH:
//   'PUBLISH'
//   ;
//
//PURGE:
//   'PURGE'
//   ;
//
//QUERY:
//   'QUERY'
//   ;
//
//QUOTE:
//   'QUOTE'
//   ;
//
//RANDOMIZED:
//   'RANDOMIZED'
//   ;
//
//RANGE:
//   'RANGE'
//   ;
//
//RATIO:
//   'RATIO'
//   ;
//
//RAW:
//   'RAW'
//   ;
//
//READ:
//   'READ'
//   ;
//
//REAL:
//   'REAL'
//   ;
//
//REASSIGN:
//   'REASSIGN'
//   ;
//
//REBUILD:
//   'REBUILD'
//   ;
//
//RECHECK:
//   'RECHECK'
//   ;
//
//RECURSIVE:
//   'RECURSIVE'
//   ;
//
//RECYCLEBIN:
//   'RECYCLEBIN'
//   ;
//
//REDISANYVALUE:
//   'REDISANYVALUE'
//   ;
//
//REF:
//   'REF'
//   ;
//
//REFERENCES:
//   'REFERENCES'
//   ;
//
//REFRESH:
//   'REFRESH'
//   ;
//
//REINDEX:
//   'REINDEX'
//   ;
//
//REJECT_P:
//   'REJECT'
//   ;
//
//RELATIVE_P:
//   'RELATIVE'
//   ;
//
//RELEASE:
//   'RELEASE'
//   ;
//
//RELOPTIONS:
//   'RELOPTIONS'
//   ;
//
//REMOTE_P:
//   'REMOTE'
//   ;
//
//REMOVE:
//   'REMOVE'
//   ;
//
//RENAME:
//   'RENAME'
//   ;
//
//REPEAT:
//   'REPEAT'
//   ;
//
//REPEATABLE:
//   'REPEATABLE'
//   ;
//
//REPLACE:
//   'REPLACE'
//   ;
//
//REPLICA:
//   'REPLICA'
//   ;
//
//RESET:
//   'RESET'
//   ;
//
//RESIZE:
//   'RESIZE'
//   ;
//
//RESOURCE:
//   'RESOURCE'
//   ;
//
//RESTART:
//   'RESTART'
//   ;
//
//RESTRICT:
//   'RESTRICT'
//   ;
//
//RETURN:
//   'RETURN'
//   ;
//
//RETURNING:
//   'RETURNING'
//   ;
//
//RETURNS:
//   'RETURNS'
//   ;
//
//REUSE:
//   'REUSE'
//   ;
//
//REVOKE:
//   'REVOKE'
//   ;
//
//RIGHT:
//   'RIGHT'
//   ;
//
//ROLE:
//   'ROLE'
//   ;
//
//ROLES:
//   'ROLES'
//   ;
//
//ROLLBACK:
//   'ROLLBACK'
//   ;
//
//ROLLUP:
//   'ROLLUP'
//   ;
//
//ROTATION:
//   'ROTATION'
//   ;
//
//ROW:
//   'ROW'
//   ;
//
//ROWNUM:
//   'ROWNUM'
//   ;
//
//ROWS:
//   'ROWS'
//   ;
//
//ROWTYPE_P:
//   'ROWTYPE'
//   ;
//
//RULE:
//   'RULE'
//   ;
//
//SAMPLE:
//   'SAMPLE'
//   ;
//
//SAVEPOINT:
//   'SAVEPOINT'
//   ;
//
//SCHEDULE:
//   'SCHEDULE'
//   ;
//
//SCHEMA:
//   'SCHEMA'
//   ;
//
//SCROLL:
//   'SCROLL'
//   ;
//
//SEARCH:
//   'SEARCH'
//   ;
//
//SECOND_P:
//   'SECOND'
//   ;
//
//SECURITY:
//   'SECURITY'
//   ;
//
//SELECT:
//   'SELECT'
//   ;
//
//SEPARATOR_P:
//   'SEPARATOR'
//   ;
//
//SEQUENCE:
//   'SEQUENCE'
//   ;
//
//SEQUENCES:
//   'SEQUENCES'
//   ;
//
//SERIALIZABLE:
//   'SERIALIZABLE'
//   ;
//
//SERVER:
//   'SERVER'
//   ;
//
//SESSION:
//   'SESSION'
//   ;
//
//SESSION_USER:
//   'SESSION_USER'
//   ;
//
//SET:
//   'SET'
//   ;
//
//SETOF:
//   'SETOF'
//   ;
//
//SETS:
//   'SETS'
//   ;
//
//SHARE:
//   'SHARE'
//   ;
//
//SHIPPABLE:
//   'SHIPPABLE'
//   ;
//
//SHOW:
//   'SHOW'
//   ;
//
//SHRINK:
//   'SHRINK'
//   ;
//
//SHUTDOWN:
//   'SHUTDOWN'
//   ;
//
//SIBLINGS:
//   'SIBLINGS'
//   ;
//
//SIMILAR:
//   'SIMILAR'
//   ;
//
//SIMPLE:
//   'SIMPLE'
//   ;
//
//SIZE:
//   'SIZE'
//   ;
//
//SKIP_P:
//   'SKIP'
//   ;
//
//SLAVE:
//   'SLAVE'
//   ;
//
//SLICE:
//   'SLICE'
//   ;
//
//SMALLDATETIME:
//   'SMALLDATETIME'
//   ;
//
//SMALLDATETIME_FORMAT_P:
//   'SMALLDATETIME_FORMAT'
//   ;
//
//SMALLINT:
//   'SMALLINT'
//   ;
//
//SNAPSHOT:
//   'SNAPSHOT'
//   ;
//
//SOME:
//   'SOME'
//   ;
//
//SOURCE_P:
//   'SOURCE'
//   ;
//
//SPACE:
//   'SPACE'
//   ;
//
//SPILL:
//   'SPILL'
//   ;
//
//SPLIT:
//   'SPLIT'
//   ;
//
//STABLE:
//   'STABLE'
//   ;
//
//STANDALONE_P:
//   'STANDALONE'
//   ;
//
//START:
//   'START'
//   ;
//
//STARTING:
//   'STARTING'
//   ;
//
//STARTS:
//   'STARTS'
//   ;
//
//STATEMENT:
//   'STATEMENT'
//   ;
//
//STATEMENT_ID:
//   'STATEMENT_ID'
//   ;
//
//STATISTICS:
//   'STATISTICS'
//   ;
//
//STDIN:
//   'STDIN'
//   ;
//
//STDOUT:
//   'STDOUT'
//   ;
//
//STORAGE:
//   'STORAGE'
//   ;
//
//STORE_P:
//   'STORE'
//   ;
//
//STORED:
//   'STORED'
//   ;
//
//STRATIFY:
//   'STRATIFY'
//   ;
//
//STREAM:
//   'STREAM'
//   ;
//
//STRICT_P:
//   'STRICT'
//   ;
//
//STRIP_P:
//   'STRIP'
//   ;
//
//SUBPARTITION:
//   'SUBPARTITION'
//   ;
//
//SUBPARTITIONS:
//   'SUBPARTITIONS'
//   ;
//
//SUBSCRIPTION:
//   'SUBSCRIPTION'
//   ;
//
//SUBSTRING:
//   'SUBSTRING'
//   ;
//
//SYMMETRIC:
//   'SYMMETRIC'
//   ;
//
//SYNONYM:
//   'SYNONYM'
//   ;
//
//SYS_REFCURSOR:
//   'SYS_REFCURSOR'
//   ;
//
//SYSDATE:
//   'SYSDATE'
//   ;
//
//SYSID:
//   'SYSID'
//   ;
//
//SYSTEM_P:
//   'SYSTEM'
//   ;
//
//TABLE:
//   'TABLE'
//   ;
//
//TABLES:
//   'TABLES'
//   ;
//
//TABLESAMPLE:
//   'TABLESAMPLE'
//   ;
//
//TABLESPACE:
//   'TABLESPACE'
//   ;
//
//TARGET:
//   'TARGET'
//   ;
//
//TEMP:
//   'TEMP'
//   ;
//
//TEMPLATE:
//   'TEMPLATE'
//   ;
//
//TEMPORARY:
//   'TEMPORARY'
//   ;
//
//TERMINATED:
//   'TERMINATED'
//   ;
//
//TEXT_P:
//   'TEXT'
//   ;
//
//THAN:
//   'THAN'
//   ;
//
//THEN:
//   'THEN'
//   ;
//
//TIME:
//   'TIME'
//   ;
//
//TIME_FORMAT_P:
//   'TIME_FORMAT'
//   ;
//
//TIMECAPSULE:
//   'TIMECAPSULE'
//   ;
//
//TIMESTAMP:
//   'TIMESTAMP'
//   ;
//
//TIMESTAMP_FORMAT_P:
//   'TIMESTAMP_FORMAT'
//   ;
//
//TIMESTAMPDIFF:
//   'TIMESTAMPDIFF'
//   ;
//
//TINYINT:
//   'TINYINT'
//   ;
//
//TO:
//   'TO'
//   ;
//
//TRAILING:
//   'TRAILING'
//   ;
//
//TRANSACTION:
//   'TRANSACTION'
//   ;
//
//TRANSFORM:
//   'TRANSFORM'
//   ;
//
//TREAT:
//   'TREAT'
//   ;
//
//TRIGGER:
//   'TRIGGER'
//   ;
//
//TRIM:
//   'TRIM'
//   ;
//
//TRUE_P:
//   'TRUE'
//   ;
//
//TRUNCATE:
//   'TRUNCATE'
//   ;
//
//TRUSTED:
//   'TRUSTED'
//   ;
//
//TSFIELD:
//   'TSFIELD'
//   ;
//
//TSTAG:
//   'TSTAG'
//   ;
//
//TSTIME:
//   'TSTIME'
//   ;
//
//TYPE_P:
//   'TYPE'
//   ;
//
//TYPES_P:
//   'TYPES'
//   ;
//
//UNBOUNDED:
//   'UNBOUNDED'
//   ;
//
//UNCOMMITTED:
//   'UNCOMMITTED'
//   ;
//
//UNENCRYPTED:
//   'UNENCRYPTED'
//   ;
//
//UNION:
//   'UNION'
//   ;
//
//UNIQUE:
//   'UNIQUE'
//   ;
//
//UNKNOWN:
//   'UNKNOWN'
//   ;
//
//UNLIMITED:
//   'UNLIMITED'
//   ;
//
//UNLISTEN:
//   'UNLISTEN'
//   ;
//
//UNLOCK:
//   'UNLOCK'
//   ;
//
//UNLOGGED:
//   'UNLOGGED'
//   ;
//
//UNTIL:
//   'UNTIL'
//   ;
//
//UNUSABLE:
//   'UNUSABLE'
//   ;
//
//UPDATE:
//   'UPDATE'
//   ;
//
//USE_P:
//   'USE'
//   ;
//
//USEEOF:
//   'USEEOF'
//   ;
//
//USER:
//   'USER'
//   ;
//
//USING:
//   'USING'
//   ;
//
//VACUUM:
//   'VACUUM'
//   ;
//
//VALID:
//   'VALID'
//   ;
//
//VALIDATE:
//   'VALIDATE'
//   ;
//
//VALIDATION:
//   'VALIDATION'
//   ;
//
//VALIDATOR:
//   'VALIDATOR'
//   ;
//
//VALUE_P:
//   'VALUE'
//   ;
//
//VALUES:
//   'VALUES'
//   ;
//
//VARCHAR:
//   'VARCHAR'
//   ;
//
//VARCHAR2:
//   'VARCHAR2'
//   ;
//
//VARIABLES:
//   'VARIABLES'
//   ;
//
//VARIADIC:
//   'VARIADIC'
//   ;
//
//VARYING:
//   'VARYING'
//   ;
//
//VCGROUP:
//   'VCGROUP'
//   ;
//
//VERBOSE:
//   'VERBOSE'
//   ;
//
//VERIFY:
//   'VERIFY'
//   ;
//
//VERSION_P:
//   'VERSION'
//   ;
//
//VIEW:
//   'VIEW'
//   ;
//
//VISIBLE:
//   'VISIBLE'
//   ;
//
//VOLATILE:
//   'VOLATILE'
//   ;
//
//WAIT:
//   'WAIT'
//   ;
//
//WARNINGS:
//   'WARNINGS'
//   ;
//
//WEAK:
//   'WEAK'
//   ;
//
//WHEN:
//   'WHEN'
//   ;
//
//WHERE:
//   'WHERE'
//   ;
//
//WHILE_P:
//   'WHILE'
//   ;
//
//WHITESPACE_P:
//   'WHITESPACE'
//   ;
//
//WINDOW:
//   'WINDOW'
//   ;
//
//WITH:
//   'WITH'
//   ;
//
//WITHIN:
//   'WITHIN'
//   ;
//
//WITHOUT:
//   'WITHOUT'
//   ;
//
//WORK:
//   'WORK'
//   ;
//
//WORKLOAD:
//   'WORKLOAD'
//   ;
//
//WRAPPER:
//   'WRAPPER'
//   ;
//
//WRITE:
//   'WRITE'
//   ;
//
//XML_P:
//   'XML'
//   ;
//
//XMLATTRIBUTES:
//   'XMLATTRIBUTES'
//   ;
//
//XMLCONCAT:
//   'XMLCONCAT'
//   ;
//
//XMLELEMENT:
//   'XMLELEMENT'
//   ;
//
//XMLEXISTS:
//   'XMLEXISTS'
//   ;
//
//XMLFOREST:
//   'XMLFOREST'
//   ;
//
//XMLPARSE:
//   'XMLPARSE'
//   ;
//
//XMLPI:
//   'XMLPI'
//   ;
//
//XMLROOT:
//   'XMLROOT'
//   ;
//
//XMLSERIALIZE:
//   'XMLSERIALIZE'
//   ;
//
//YEAR_P:
//   'YEAR'
//   ;
//
//YES_P:
//   'YES'
//   ;
//
//ZONE:
//   'ZONE'
//   ;
//
///************************************************************************************************************************************************************/
///* HINT SQL TOKEN */
///************************************************************************************************************************************************************/
//
//NestLoop_P:
//   'NestLoop'
//   ;
//
//MergeJoin_P:
//   'MergeJoin'
//   ;
//
//HashJoin_P:
//   'HashJoin'
//   ;
//
//No_P:
//   'No'
//   ;
//
//Leading_P:
//   'Leading'
//   ;
//
//Rows_P:
//   'Rows'
//   ;
//
//Broadcast_P:
//   'Broadcast'
//   ;
//
//Redistribute_P:
//   'Redistribute'
//   ;
//
//BlockName_P:
//   'BlockName'
//   ;
//
//TableScan_P:
//   'TableScan'
//   ;
//
//IndexScan_P:
//   'IndexScan'
//   ;
//
//IndexOnlyScan_P:
//   'IndexOnlyScan'
//   ;
//
//Skew_P:
//   'Skew'
//   ;
//
//HINT_MULTI_NODE_P:
//   'MultiNode'
//   ;
//
//Predpush_P:
//   'Predpush'
//   ;
//
//PredpushSameLevel_P:
//   'Predpush_Same_Level'
//   ;
//
//Rewrite_P:
//   'Rewrite_rule'
//   ;
//
//Gather_P:
//   'Gather'
//   ;
//
//USE_CPLAN_P:
//   'Use_cplan'
//   ;
//
//USE_GPLAN_P:
//   'Use_gplan'
//   ;
//
//No_expand_P:
//   'No_expand'
//   ;
//
//CHOOSE_ADAPTIVE_GPLAN_P:
//   'Choose_adaptive_gplan'
//   ;
//
///************************************************************************************************************************************************************/
///* PL/SQL TOKEN */
///************************************************************************************************************************************************************/
//
//DIAGNOSTICS:
//   'DIAGNOSTICS'
//   ;
//
//ELSIF:
//   'ELSEIF'
//   ;
//
//EXCEPTION:
//   'EXCEPTION'
//   ;
//
//EXIT:
//   'EXIT'
//   ;
//
//FORALL:
//   'FORALL'
//   ;
//
//FOREACH:
//   'FOREACH'
//   ;
//
//GET:
//   'GET'
//   ;
//
//GOTO:
//   'GOTO'
//   ;
//
//OPEN:
//   'OPEN'
//   ;
//
//RAISE:
//   'RAISE'
//   ;
//
//ALIAS:
//   'ALIAS'
//   ;
//
//BULK:
//   'BULK'
//   ;
//
//COLLECT:
//   'COLLECT'
//   ;
//
//DEBUG:
//   'DEBUG'
//   ;
//
//DETAIL:
//   'DETAIL'
//   ;
//
//DUMP:
//   'DUMP'
//   ;
//
//ERRCODE:
//   'ERRCODE'
//   ;
//
//ERROR:
//   'ERROR'
//   ;
//
//EXCEPTIONS:
//   'EXCEPTIONS'
//   ;
//
//FOUND:
//   'FOUND'
//   ;
//
//HINT:
//   'HINT'
//   ;
//
//INFO:
//   'INFO'
//   ;
//
//INSTANTIATION:
//   'INSTANTIATION'
//   ;
//
//ITERATE:
//   'ITERATE'
//   ;
//
//LEAVE:
//   'LEAVE'
//   ;
//
//MESSAGE:
//   'MESSAGE'
//   ;
//
//MESSAGE_TEXT:
//   'MESSAGE_TEXT'
//   ;
//
//MULTISET:
//   'MULTISET'
//   ;
//
//NOTICE:
//   'NOTICE'
//   ;
//
//PERFORM:
//   'PERFORM'
//   ;
//
//PG_EXCEPTION_CONTEXT:
//   'PG_EXCEPTION_CONTEXT'
//   ;
//
//PG_EXCEPTION_DETAIL:
//   'PG_EXCEPTION_DETAIL'
//   ;
//
//PG_EXCEPTION_HINT:
//   'PG_EXCEPTION_HINT'
//   ;
//
//PRAGMA:
//   'PRAGMA'
//   ;
//
//RECORD:
//   'RECORD'
//   ;
//
//RESULT_OID:
//   'RESULT_OID'
//   ;
//
//RETURNED_SQLSTATE:
//   'RETURNED_SQLSTATE'
//   ;
//
//REVERSE:
//   'REVERSE'
//   ;
//
//ROW_COUNT:
//   'ROW_COUNT'
//   ;
//
//SAVE:
//   'SAVE'
//   ;
//
//SQLEXCEPTION:
//   'SQLEXCEPTION'
//   ;
//
//SQLSTATE:
//   'SQLSTATE'
//   ;
//
//SQLWARNING:
//   'SQLWARNING'
//   ;
//
//STACKED:
//   'STACKED'
//   ;
//
//USE_COLUMN:
//   'USE_COLUMN'
//   ;
//
//USE_VARIABLE:
//   'USE_VARIABLE'
//   ;
//
//VARIABLE_CONFLICT:
//   'VARIABLE_CONFLICT'
//   ;
//
//VARRAY:
//   'VARRAY'
//   ;
//
//WARNING:
//   'WARNING'
//   ;
//
//Space:
//   [ \t\n\r\f]
//   ;
//
//Horiz_space:
//   [ \t\f]
//   ;
//
//Newline:
//   [\n\r]
//   ;
//
//Non_newline:
//   [^\n\r]
//   ;
//
//Comment:
//   '--' Non_newline*
//   ;
//
//Whitespace:
//   Space+
//   |Comment
//   ;
//
//Whitespace_only:
//   Space+
//   ;
//
//Special_whitespace:
//   Space+
//   |Comment Newline
//   ;
//
//Horiz_whitespace:
//   Horiz_space
//   |Comment
//   ;
//
//Whitespace_with_newline:
//   Horiz_whitespace* Newline Special_whitespace*
//   ;
//
//Quote:
//   '\''
//   ;
//
//Quotestop:
//   Quote Whitespace*
//   ;
//
//Quotecontinue:
//   Quote Whitespace_with_newline Quote
//   ;
//
//Quotefail:
//   Quote Whitespace* '-'
//   ;
//
//Xbstart:
//   'B' Quote
//   ;
//
//Xbinside:
//   [^']*
//   ;
//
//Xhstart:
//   'X' Quote
//   ;
//
//Xhinside:
//   [^']*
//   ;
//
//Xnstart:
//   'N' Quote
//   ;
//
//Xestart:
//   'E' Quote
//   ;
//
//Xeinside:
//   [^\\']+
//   ;
//
//Xeescape:
//   [\\][^0-7]
//   ;
//
//Xeoctesc:
//   [\\][0-7]{1,3}
//   ;
//
//Xehexesc options { caseInsensitive=false; }:
//   [\\] 'x' [0-9A-Fa-f]{1,2}
//   ;
//
//Xeunicode options { caseInsensitive=false; }:
//   [\\]('u' [0-9A-Fa-f]{4}
//   | 'U' [0-9A-Fa-f]{8})
//   ;
//
//Xeunicodefail options { caseInsensitive=false; }:
//   [\\]('u' [0-9A-Fa-f]{0,3}
//   | 'U' [0-9A-Fa-f]{0,7})
//   ;
//
//Xqstart:
//   Quote
//   ;
//
//Xqdouble:
//    Quote Quote
//    ;
//
//Xqinside:
//   [^']+
//   ;
//
//Dolq_start options { caseInsensitive=false; }:
//   [A-Za-z\u0080-\u00FF_]
//   ;
//
//Dolq_cont options { caseInsensitive=false; }:
//   [A-Za-z\u0080-\u00FF_0-9]
//   ;
//
//Dolqdelim:
//   '$' (Dolq_start Dolq_cont*)? '$'
//   ;
//
//Dolqfailed:
//   '$' Dolq_start Dolq_cont*
//   ;
//
//Dolqinside:
//   [^$]+
//   ;
//
//Dquote:
//   '"'
//   ;
//
//Xdstart:
//   Dquote
//   ;
//
//Xdstop:
//   Dquote
//   ;
//
//Xddouble:
//   Dquote Dquote
//   ;
//
//Xdinside:
//   [^"]+
//   ;
//
//Uescape:
//   'UESCAPE' Whitespace* Quote [^'] Quote
//   ;
//
//Uescapefail:
//   'UESCAPE' Whitespace* '-'
//   |'UESCAPE' Whitespace* Quote [^']
//   |'UESCAPE' Whitespace* Quote
//   |'UESCAPE' Whitespace*
//   |'UESCAP'
//   |'UESCA'
//   |'UESC'
//   |'UES'
//   |'UEU'
//   ;
//
//Xuistart:
//   'U' Dquote
//   ;
//
//Xuistop1:
//   Dquote Whitespace* Uescapefail?
//   ;
//
//Xuistop2:
//   Dquote Whitespace* Uescape
//   ;
//
//Xusstart:
//   'U&' Quote
//   ;
//
//Xusstop1:
//   Quote Whitespace* Uescapefail?
//   ;
//
//Xusstop2:
//   Quote Whitespace* Uescape
//   ;
//
//Xufailed:
//   'U&'
//   ;
//
//Xcstart:
//   '/*' Op_chars*
//   ;
//
//Xcstop:
//   ('*')+ '/'
//   ;
//
//Xcinside:
//   [^*/]+
//   ;
//
//Digit:
//   [0-9]
//   ;
//
//Ident_start options { caseInsensitive=false; }:
//   [A-Za-z\u0080-\u00FF_]
//   ;
//
//Ident_cont options { caseInsensitive=false; }:
//   [A-Za-z\u0080-\u00FF_0-9$#]
//   ;
//
//Identifier:
//   Ident_start Ident_cont*
//   ;
//
//Typecast:
//   '::'
//   ;
//
//Plus_join:
//   '(+)'
//   ;
//
//Dot_dot:
//   '..'
//   ;
//
//Colon_equals:
//   ':='
//   ;
//
//Para_equals:
//   '=>'
//   ;
//
//Set_ident_start:
//   '@@'
//   ;
//
//Set_ident_cont options { caseInsensitive=false; }:
//   [A-Za-z\u0080-\u00FF_0-9$#]
//   ;
//
//Set_identifier:
//   Set_ident_start Set_ident_cont*
//   ;
//
//Self:
//   [,()[\].;:+\-*/%^<>=@]
//   ;
//
//Op_chars:
//   [~!#^&|`?+\-*/%<>=@]
//   ;
//
//Operator:
//   Op_chars+
//   ;
//
//Integer:
//   Digit+
//   ;
//
//Decimal:
//   Digit* '.' Digit+
//   | Digit* '.' Digit*
//   ;
//
//Decimalfail:
//   Digit+ '..'
//   ;
//
//Real:
//   (Integer | Decimal) 'E' [-+]? Digit+
//   ;
//
//Realfail1:
//   (Integer | Decimal) 'E'
//   ;
//
//Realfail2:
//   (Integer | Decimal) 'E' [-+]
//   ;
//
//Snapvers:
//   Digit+ ('.' Digit+)*
//   ;
//
//Param:
//   '$' Integer
//   ;
//
//NewParam:
//   ':' (Identifier | Integer)
//   ;
//
//NewArray:
//   ':' (Identifier | Integer) Space* ']'
//   ;
//
//Set_user_cont options { caseInsensitive=false; }:
//   [A-Za-z\u00FF_0-9$.]
//   ;
//
//Set_user_escape_quote:
//   [^']
//   ;
//
//Set_user_escape_dquote:
//   [^"]
//   ;
//
//Set_user_escape_bquote:
//   [^`]
//   ;
//
//SetUserIdentifier:
//   '@' ((Set_user_cont+)
//   |('\'' Set_user_escape_quote+ '\'')
//   |('"' Set_user_escape_dquote+ '"')
//   |('\''Set_user_escape_bquote+'\''))
//   ;
//
//COMMENTSTRING:
//   Comment
//   | Xcstart (Xcinside | Op_chars | [*+])* Xcstop
//   ;
//
//BCONST:
//   Xbstart (Xbinside | Quotecontinue)* (Quotestop | Quotefail)
//   ;
//
//XCONST:
//   Xhstart (Quotestop | Quotefail)
//   ;
//
//
//
//
//
//
//
//
//Other:
//   [.]
//   ;
