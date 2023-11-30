//parser grammar OpenGaussParser;
//
//options { tokenVocab = OpenGaussLexer;
//superClass = OpenGaussParserBase;
//}
//
//@header
//{
//}
//@members
//{
//}
//
//stmtblock  : stmtmulti
//  ;
//
//stmtmulti  : stmtmulti SEMI stmt
//  | stmtmulti SEMI nltk_END_OF_INPUT stmt
//  | stmtmulti nltk_END_OF_INPUT_COLON stmt
//  | stmt
//  ;
//
//stmt  : alterAppWorkloadGroupMappingStmt
//  | alterCoordinatorStmt
//  | alterDatabaseStmt
//  | alterDatabaseSetStmt
//  | alterDataSourceStmt
//  | alterDefaultPrivilegesStmt
//  | alterDomainStmt
//  | alterEnumStmt
//  | alterEventTrigStmt
//  | alterExtensionStmt
//  | alterExtensionContentsStmt
//  | alterFdwStmt
//  | alterForeignServerStmt
//  | alterForeignTableStmt
//  | alterFunctionStmt
//  | alterProcedureStmt
//  | alterPublicationStmt
//  | alterGroupStmt
//  | alterNodeGroupStmt
//  | alterNodeStmt
//  | alterObjectSchemaStmt
//  | alterOwnerStmt
//  | alterRlsPolicyStmt
//  | alterResourcePoolStmt
//  | alterGlobalConfigStmt
//  | alterSeqStmt
//  | alterSchemaStmt
//  | alterSubscriptionStmt
//  | alterTableStmt
//  | alterSystemStmt
//  | alterCompositeTypeStmt
//  | alterRoleSetStmt
//  | alterRoleStmt
//  | alterSessionStmt
//  | alterTSConfigurationStmt
//  | alterTSDictionaryStmt
//  | alterUserMappingStmt
//  | alterUserSetStmt
//  | alterUserStmt
//  | alterWorkloadGroupStmt
//  | analyzeStmt
//  | anonyBlockStmt
//  | barrierStmt
//  | createAppWorkloadGroupMappingStmt
//  | callFuncStmt
//  | checkPointStmt
//  | cleanConnStmt
//  | closePortalStmt
//  | clusterStmt
//  | commentStmt
//  | constraintsSetStmt
//  | copyStmt
//  | createAsStmt
//  | createAssertStmt
//  | createCastStmt
//  | createContQueryStmt
//  | createStreamStmt
//  | createConversionStmt
//  | createDomainStmt
//  | createDirectoryStmt
//  | createEventTrigStmt
//  | createExtensionStmt
//  | createFdwStmt
//  | createForeignServerStmt
//  | createForeignTableStmt
//  | createDataSourceStmt
//  | createFunctionStmt
//  | createEventStmt
//  | alterEventStmt
//  | dropEventStmt
//  | showEventStmt
//  | createPackageStmt
//  | createPackageBodyStmt
//  | createGroupStmt
//  | createMatViewStmt
//  | createModelStmt
//  | createNodeGroupStmt
//  | createNodeStmt
//  | createOpClassStmt
//  | createOpFamilyStmt
//  | alterOpFamilyStmt
//  | createRlsPolicyStmt
//  | createPLangStmt
//  | createProcedureStmt
//  | createPublicationStmt
//  | createKeyStmt
//  | createPolicyLabelStmt
//  | createWeakPasswordDictionaryStmt
//  | dropWeakPasswordDictionaryStmt
//  | alterPolicyLabelStmt
//  | dropPolicyLabelStmt
//  | createAuditPolicyStmt
//  | alterAuditPolicyStmt
//  | dropAuditPolicyStmt
//  | createMaskingPolicyStmt
//  | alterMaskingPolicyStmt
//  | dropMaskingPolicyStmt
//  | createResourcePoolStmt
//  | createSchemaStmt
//  | createSeqStmt
//  | createStmt
//  | createSubscriptionStmt
//  | createSynonymStmt
//  | createTableSpaceStmt
//  | createTrigStmt
//  | createRoleStmt
//  | createUserStmt
//  | createUserMappingStmt
//  | createWorkloadGroupStmt
//  | createdbStmt
//  | deallocateStmt
//  | declareCursorStmt
//  | defineStmt
//  | deleteStmt
//  | discardStmt
//  | doStmt
//  | dropAppWorkloadGroupMappingStmt
//  | dropAssertStmt
//  | dropCastStmt
//  | dropDataSourceStmt
//  | dropDirectoryStmt
//  | dropFdwStmt
//  | dropForeignServerStmt
//  | dropGroupStmt
//  | dropModelStmt
//  | dropNodeGroupStmt
//  | dropNodeStmt
//  | dropOpClassStmt
//  | dropOpFamilyStmt
//  | dropOwnedStmt
//  | dropRlsPolicyStmt
//  | dropPLangStmt
//  | dropResourcePoolStmt
//  | dropGlobalConfigStmt
//  | dropRuleStmt
//  | dropStmt
//  | dropSubscriptionStmt
//  | dropSynonymStmt
//  | dropTableSpaceStmt
//  | dropTrigStmt
//  | dropRoleStmt
//  | dropUserStmt
//  | dropUserMappingStmt
//  | dropWorkloadGroupStmt
//  | dropdbStmt
//  | executeStmt
//  | execDirectStmt
//  | explainStmt
//  | fetchStmt
//  | grantStmt
//  | grantRoleStmt
//  | grantDbStmt
//  | indexStmt
//  | insertStmt
//  | listenStmt
//  | refreshMatViewStmt
//  | loadStmt
//  | lockStmt
//  | mergeStmt
//  | notifyStmt
//  | prepareStmt
//  | purgeStmt
//  | reassignOwnedStmt
//  | reindexStmt
//  | removeAggrStmt
//  | removeFuncStmt
//  | removePackageStmt
//  | removeOperStmt
//  | renameStmt
//  | revokeStmt
//  | revokeRoleStmt
//  | revokeDbStmt
//  | ruleStmt
//  | secLabelStmt
//  | selectStmt
//  | shutdownStmt
//  | timeCapsuleStmt
//  | snapshotStmt
//  | transactionStmt
//  | truncateStmt
//  | unlistenStmt
//  | updateStmt
//  | vacuumStmt
//  | variableResetStmt
//  | variableSetStmt
//  | variableMultiSetStmt
//  | variableShowStmt
//  | verifyStmt
//  | viewStmt
//  | shrinkStmt
//  |
//  | delimiterStmt
//  ;
//
//createRoleStmt  : CREATE ROLE roleId opt_with optRoleList
//  ;
//
//shrinkStmt  : SHRINK TABLE relation_expr_list opt_nowait
//  | SHRINK INDEX relation_expr_list opt_nowait
//  ;
//
//opt_with  : WITH
//  |
//  ;
//
//optRoleList  : optRoleList createOptRoleElem
//  |
//  ;
//
//alterOptRoleList  : alterOptRoleList alterOptRoleElem
//  |
//  ;
//
//password_string  : sconst
//  | IDENT
//  ;
//
//namedata_string  : sconst
//  | IDENT
//  ;
//
//alterOptRoleElem  : PASSWORD password_string
//  | IDENTIFIED BY password_string
//  | ENCRYPTED IDENTIFIED BY password_string
//  | UNENCRYPTED IDENTIFIED BY password_string
//  | IDENTIFIED BY password_string REPLACE password_string
//  | ENCRYPTED IDENTIFIED BY password_string REPLACE password_string
//  | UNENCRYPTED IDENTIFIED BY password_string REPLACE password_string
//  | IDENTIFIED BY DISABLE_P
//  | PASSWORD DISABLE_P
//  | PASSWORD EXPIRED_P
//  | PASSWORD password_string EXPIRED_P
//  | IDENTIFIED BY password_string EXPIRED_P
//  | ENCRYPTED PASSWORD password_string
//  | UNENCRYPTED PASSWORD password_string
//  | DEFAULT TABLESPACE name
//  | PROFILE DEFAULT
//  | PROFILE name
//  | INHERIT
//  | CONNECTION LIMIT signedIconst
//  | RESOURCE POOL namedata_string
//  | NODE GROUP_P pgxcgroup_name
//  | USER GROUP_P namedata_string
//  | USER GROUP_P DEFAULT
//  | PERM SPACE sconst
//  | TEMP SPACE sconst
//  | SPILL SPACE sconst
//  | nltk_VALID_BEGIN sconst
//  | VALID UNTIL sconst
//  | USER name_list
//  | IDENT
//  ;
//
//createOptRoleElem  : alterOptRoleElem
//  | SYSID iconst
//  | ADMIN name_list
//  | ROLE name_list
//  | IN_P ROLE name_list
//  | IN_P GROUP_P name_list
//  ;
//
//userId  : SCONST SET_USER_IDENT
//  | SCONST AT SCONST
//  | SCONST
//  | roleId SET_USER_IDENT
//  | roleId
//  ;
//
//userIdList  : userId
//  | userIdList COMMA userId
//  ;
//
//createUserStmt  : CREATE USER userId opt_with optRoleList
//  | CREATE USER IF_P NOT EXISTS userId opt_with optRoleList
//  ;
//
//alterRoleStmt  : ALTER ROLE roleId opt_with alterOptRoleList
//  | ALTER ROLE roleId opt_with ACCOUNT LOCK_P
//  | ALTER ROLE roleId opt_with ACCOUNT UNLOCK
//  ;
//
//opt_in_database  :
//  | IN_P DATABASE database_name
//  ;
//
//alterRoleSetStmt  : ALTER ROLE roleId opt_in_database setResetClause
//  ;
//
//alterUserStmt  : ALTER USER userId opt_with alterOptRoleList
//  | ALTER USER IF_P EXISTS userId opt_with alterOptRoleList
//  | ALTER USER userId opt_with ACCOUNT LOCK_P
//  | ALTER USER userId opt_with ACCOUNT UNLOCK
//  ;
//
//alterUserSetStmt  : ALTER USER userId opt_in_database setResetClause
//  ;
//
//dropRoleStmt  : DROP ROLE name_list
//  | DROP ROLE IF_P EXISTS name_list
//  ;
//
//dropUserStmt  : DROP USER userIdList opt_drop_behavior
//  | DROP USER IF_P EXISTS userIdList opt_drop_behavior
//  ;
//
//createGroupStmt  : CREATE GROUP_P roleId opt_with optRoleList
//  ;
//
//alterGroupStmt  : ALTER GROUP_P roleId add_drop USER name_list
//  ;
//
//add_drop  : ADD_P
//  | DROP
//  ;
//
//alterSessionStmt  : ALTER SESSION SET set_rest
//  ;
//
//alterSystemStmt  : ALTER SYSTEM_P KILL SESSION sconst altersys_option
//  | ALTER SYSTEM_P DISCONNECT SESSION sconst altersys_option
//  | ALTER SYSTEM_P SET generic_set
//  ;
//
//altersys_option  : IMMEDIATE
//  |
//  ;
//
//dropGroupStmt  : DROP GROUP_P name_list
//  | DROP GROUP_P IF_P EXISTS name_list
//  ;
//
//createSchemaStmt  : CREATE SCHEMA optSchemaName AUTHORIZATION roleId optBlockchainWith optSchemaEltList
//  | CREATE SCHEMA colId optBlockchainWith optSchemaEltList
//  | CREATE SCHEMA IF_P NOT EXISTS colId optBlockchainWith optSchemaEltList
//  | CREATE SCHEMA IF_P NOT EXISTS optSchemaName AUTHORIZATION roleId optBlockchainWith optSchemaEltList
//  | CREATE SCHEMA colId charsetCollate
//  ;
//
//optSchemaName  : colId
//  |
//  ;
//
//optSchemaEltList  : optSchemaEltList schema_stmt
//  |
//  ;
//
//optBlockchainWith  : WITH BLOCKCHAIN
//  |
//  ;
//
//alterSchemaStmt  : ALTER SCHEMA colId optAlterToBlockchain
//  | ALTER SCHEMA colId charsetCollate
//  ;
//
//optAlterToBlockchain  : WITH BLOCKCHAIN
//  | WITHOUT BLOCKCHAIN
//  ;
//
//schema_stmt  : createStmt
//  | indexStmt
//  | createSeqStmt
//  | createTrigStmt
//  | grantStmt
//  | viewStmt
//  ;
//
//variableSetStmt  : SET set_rest
//  | SET LOCAL set_rest
//  | SET SESSION set_rest
//  | SET GLOBAL TRANSACTION transaction_mode_list
//  | SET generic_set_extension
//  | SET SESSION generic_set_extension
//  ;
//
//set_rest  : TRANSACTION transaction_mode_list
//  | SESSION CHARACTERISTICS AS TRANSACTION transaction_mode_list
//  | set_rest_more
//  ;
//
//generic_set  : var_name TO var_list
//  | var_name EQUAL var_list
//  | var_name TO DEFAULT
//  | var_name EQUAL DEFAULT
//  | CURRENT_SCHEMA TO var_list
//  | CURRENT_SCHEMA EQUAL var_list
//  | CURRENT_SCHEMA TO DEFAULT
//  | CURRENT_SCHEMA EQUAL DEFAULT
//  ;
//
//set_rest_more  : generic_set
//  | var_name FROM CURRENT_P
//  | TIME ZONE zone_value
//  | CATALOG_P sconst
//  | SCHEMA sconst
//  | NAMES opt_encoding
//  | ROLE colId_or_Sconst
//  | ROLE colId_or_Sconst PASSWORD password_string
//  | SESSION AUTHORIZATION colId_or_Sconst PASSWORD password_string
//  | SESSION AUTHORIZATION DEFAULT
//  | XML_P OPTION document_or_content
//  | TRANSACTION SNAPSHOT sconst
//  ;
//
//variableMultiSetStmt  : SET variableSetElemsList
//  ;
//
//variableSetElemsList  : variableSetElem
//  | variableSetElemsList COMMA variableSetElem
//  ;
//
//variableSetElem  : set_session_extension
//  | set_global
//  | user_defined_single
//  ;
//
//user_defined_single  : uservar_name Colon_equals a_expr
//  | uservar_name EQUAL a_expr
//  ;
//
//set_global  : set_global_extension
//  ;
//
//generic_set_extension  : var_name EQUAL guc_value_extension_list
//  | CURRENT_SCHEMA EQUAL guc_value_extension_list
//  ;
//
//set_session_extension  : SET_IDENT_SESSION DOT guc_variable_set
//  | SET_IDENT EQUAL set_expr
//  | SET_IDENT EQUAL DEFAULT
//  ;
//
//set_global_extension  : GLOBAL guc_variable_set
//  | SET_IDENT_GLOBAL DOT guc_variable_set
//  ;
//
//guc_variable_set  : var_name EQUAL set_expr
//  | var_name EQUAL DEFAULT
//  | CURRENT_SCHEMA EQUAL set_expr
//  | CURRENT_SCHEMA EQUAL DEFAULT
//  ;
//
//guc_value_extension_list  : set_expr_extension
//  | guc_value_extension_list COMMA set_expr_extension
//  ;
//
//set_ident_expr  : SET_IDENT
//  | SET_IDENT_SESSION DOT IDENT
//  | SET_IDENT_GLOBAL DOT IDENT
//  ;
//
//set_expr  : var_value
//  | set_expr_extension
//  ;
//
//set_expr_extension  : set_ident_expr
//  | OPEN_PAREN a_expr CLOSE_PAREN opt_indirection
//  | case_expr
//  | func_expr
//  | select_with_parens
//  | select_with_parens indirection
//  | uservar_name
//  | b_expr TYPECAST typename
//  | AT b_expr
//  | b_expr PLUS b_expr
//  | b_expr MINUS b_expr
//  | b_expr STAR b_expr
//  | b_expr SLASH b_expr
//  | b_expr PERCENT b_expr
//  | b_expr CARET b_expr
//  | b_expr LT b_expr
//  | b_expr GT b_expr
//  | b_expr EQUAL b_expr
//  | b_expr AT b_expr
//  | b_expr CmpOp b_expr
//  | b_expr qual_Op b_expr
//  | qual_Op b_expr
//  | b_expr qual_Op
//  | b_expr IS DISTINCT FROM b_expr
//  | b_expr IS NOT DISTINCT FROM b_expr
//  | b_expr IS OF OPEN_PAREN type_list CLOSE_PAREN
//  | b_expr IS NOT OF OPEN_PAREN type_list CLOSE_PAREN
//  | b_expr IS DOCUMENT_P
//  | b_expr IS NOT DOCUMENT_P
//  ;
//
//uservar_name  : SET_USER_IDENT
//  ;
//
//var_name  : colId
//  | var_name DOT colId
//  ;
//
//var_list  : var_value
//  | var_list COMMA var_value
//  ;
//
//var_value  : opt_boolean_or_string
//  | numericOnly
//  ;
//
//iso_level  : READ UNCOMMITTED
//  | READ COMMITTED
//  | REPEATABLE READ
//  | SERIALIZABLE
//  ;
//
//opt_boolean_or_string  : TRUE_P
//  | FALSE_P
//  | ON
//  | colId_or_Sconst
//  ;
//
//zone_value  : sconst
//  | IDENT
//  | constInterval sconst opt_interval
//  | constInterval OPEN_PAREN iconst CLOSE_PAREN sconst opt_interval
//  | numericOnly
//  | DEFAULT
//  | LOCAL
//  ;
//
//opt_encoding  : sconst
//  | DEFAULT
//  |
//  ;
//
//colId_or_Sconst  : colId
//  | sconst
//  ;
//
//variableResetStmt  : RESET var_name
//  | RESET TIME ZONE
//  | RESET CURRENT_SCHEMA
//  | RESET TRANSACTION ISOLATION LEVEL
//  | RESET SESSION AUTHORIZATION
//  | RESET ALL
//  ;
//
//setResetClause  : SET set_rest
//  | variableResetStmt
//  ;
//
//functionSetResetClause  : SET set_rest_more
//  | variableResetStmt
//  ;
//
//variableShowStmt  : SHOW WARNINGS
//  | SHOW WARNINGS LIMIT iconst
//  | SHOW WARNINGS LIMIT iconst COMMA iconst
//  | SHOW IDENT OPEN_PAREN STAR CLOSE_PAREN WARNINGS
//  | nltk_SHOW_ERRORS
//  | nltk_SHOW_ERRORS LIMIT iconst
//  | nltk_SHOW_ERRORS LIMIT iconst COMMA iconst
//  | SHOW IDENT OPEN_PAREN STAR CLOSE_PAREN ERRORS
//  | SHOW var_name
//  | SHOW CURRENT_SCHEMA
//  | SHOW TIME ZONE
//  | SHOW TRANSACTION ISOLATION LEVEL
//  | SHOW SESSION AUTHORIZATION
//  | SHOW VARIABLES LIKE var_name
//  | SHOW ALL
//  ;
//
//constraintsSetStmt  : SET CONSTRAINTS constraints_set_list constraints_set_mode
//  ;
//
//constraints_set_list  : ALL
//  | qualified_name_list
//  ;
//
//constraints_set_mode  : DEFERRED
//  | IMMEDIATE
//  ;
//
//shutdownStmt  : SHUTDOWN
//  | SHUTDOWN var_name
//  ;
//
//checkPointStmt  : CHECKPOINT
//  ;
//
//discardStmt  : DISCARD ALL
//  | DISCARD TEMP
//  | DISCARD TEMPORARY
//  | DISCARD PLANS
//  ;
//
//alterTableStmt  : ALTER TABLE relation_expr MODIFY_P OPEN_PAREN modify_column_cmds CLOSE_PAREN
//  | ALTER TABLE relation_expr ADD_P OPEN_PAREN add_column_cmds CLOSE_PAREN
//  | ALTER TABLE relation_expr REDISANYVALUE
//  | ALTER TABLE IF_P EXISTS relation_expr MODIFY_P OPEN_PAREN modify_column_cmds CLOSE_PAREN
//  | ALTER TABLE IF_P EXISTS relation_expr ADD_P OPEN_PAREN add_column_cmds CLOSE_PAREN
//  | ALTER TABLE relation_expr alter_table_or_partition
//  | ALTER TABLE IF_P EXISTS relation_expr alter_table_or_partition
//  | ALTER INDEX qualified_name alter_table_or_partition
//  | ALTER INDEX IF_P EXISTS qualified_name alter_table_or_partition
//  | ALTER SEQUENCE qualified_name alter_table_cmds
//  | ALTER LARGE_P SEQUENCE qualified_name alter_table_cmds
//  | ALTER SEQUENCE IF_P EXISTS qualified_name alter_table_cmds
//  | ALTER LARGE_P SEQUENCE IF_P EXISTS qualified_name alter_table_cmds
//  | ALTER VIEW qualified_name alter_table_cmds
//  | ALTER VIEW IF_P EXISTS qualified_name alter_table_cmds
//  | ALTER MATERIALIZED VIEW qualified_name alter_table_cmds
//  | ALTER MATERIALIZED VIEW IF_P EXISTS qualified_name alter_table_cmds
//  | ALTER STREAM qualified_name alter_table_cmds
//  ;
//
//modify_column_cmds  : modify_column_cmd
//  | modify_column_cmds COMMA modify_column_cmd
//  ;
//
//modify_column_cmd  : colId typename opt_charset colQualList opt_column_options add_column_first_after
//  | colId NOT NULL_P opt_enable
//  | colId NULL_P
//  | colId CONSTRAINT name NOT NULL_P opt_enable
//  | colId CONSTRAINT name NULL_P
//  ;
//
//opt_enable  : ENABLE_P
//  |
//  ;
//
//add_column_cmds  : columnDef
//  | add_column_cmds COMMA columnDef
//  ;
//
//alter_table_or_partition  : alter_table_cmds
//  | alter_partition_cmds
//  ;
//
//alter_table_cmds  : alter_table_cmd
//  | alter_table_cmds COMMA alter_table_cmd
//  ;
//
//alter_partition_cmds  : alter_partition_cmd
//  | alter_partition_cmds COMMA alter_partition_cmd
//  | move_partition_cmd
//  | exchange_partition_cmd
//  | reset_partition_cmd
//  ;
//
//alter_partition_cmd  : nltk_MODIFY_PARTITION colId UNUSABLE
//  | nltk_MODIFY_PARTITION colId UNUSABLE LOCAL INDEXES
//  | nltk_REBUILD_PARTITION colId
//  | nltk_MODIFY_PARTITION colId REBUILD UNUSABLE LOCAL INDEXES
//  | nltk_ADD_PARTITION name VALUES LESS THAN OPEN_PAREN maxValueList CLOSE_PAREN opt_part_options
//  | nltk_ADD_PARTITION name START OPEN_PAREN maxValueList CLOSE_PAREN END_P OPEN_PAREN maxValueList CLOSE_PAREN opt_range_every_list opt_part_options
//  | nltk_ADD_PARTITION name END_P OPEN_PAREN maxValueList CLOSE_PAREN opt_part_options
//  | nltk_ADD_PARTITION name START OPEN_PAREN maxValueList CLOSE_PAREN opt_part_options
//  | nltk_ADD_PARTITION name VALUES OPEN_PAREN expr_list CLOSE_PAREN opt_part_options
//  | nltk_ADD_PARTITION name VALUES OPEN_PAREN DEFAULT CLOSE_PAREN opt_part_options
//  | nltk_ADD_PARTITION name VALUES LESS THAN OPEN_PAREN maxValueList CLOSE_PAREN opt_part_options OPEN_PAREN subpartition_definition_list CLOSE_PAREN
//  | nltk_ADD_PARTITION name VALUES OPEN_PAREN expr_list CLOSE_PAREN opt_part_options OPEN_PAREN subpartition_definition_list CLOSE_PAREN
//  | nltk_ADD_PARTITION name VALUES OPEN_PAREN DEFAULT CLOSE_PAREN optTableSpace OPEN_PAREN subpartition_definition_list CLOSE_PAREN
//  | nltk_MODIFY_PARTITION name nltk_ADD_SUBPARTITION name VALUES LESS THAN OPEN_PAREN maxValueList CLOSE_PAREN optTableSpace
//  | nltk_MODIFY_PARTITION name nltk_ADD_SUBPARTITION name VALUES OPEN_PAREN expr_list CLOSE_PAREN optTableSpace
//  | nltk_MODIFY_PARTITION name nltk_ADD_SUBPARTITION name VALUES OPEN_PAREN DEFAULT CLOSE_PAREN optTableSpace
//  | nltk_DROP_PARTITION colId optGPI
//  | nltk_DROP_PARTITION FOR OPEN_PAREN maxValueList CLOSE_PAREN optGPI
//  | nltk_DROP_SUBPARTITION colId optGPI
//  | nltk_DROP_SUBPARTITION FOR OPEN_PAREN expr_list CLOSE_PAREN optGPI
//  | MERGE PARTITIONS name_list INTO PARTITION name optTableSpace optGPI
//  | SPLIT PARTITION name AT_P OPEN_PAREN maxValueList CLOSE_PAREN INTO OPEN_PAREN split_dest_partition_define_list CLOSE_PAREN optGPI
//  | SPLIT nltk_PARTITION_FOR OPEN_PAREN maxValueList CLOSE_PAREN AT_P OPEN_PAREN maxValueList CLOSE_PAREN INTO OPEN_PAREN split_dest_partition_define_list CLOSE_PAREN optGPI
//  | SPLIT PARTITION name INTO OPEN_PAREN range_partition_definition_list CLOSE_PAREN optGPI
//  | SPLIT nltk_PARTITION_FOR OPEN_PAREN maxValueList CLOSE_PAREN INTO OPEN_PAREN range_partition_definition_list CLOSE_PAREN optGPI
//  | SPLIT SUBPARTITION name VALUES OPEN_PAREN maxValueList CLOSE_PAREN INTO OPEN_PAREN split_dest_listsubpartition_define_list CLOSE_PAREN optGPI
//  | SPLIT SUBPARTITION name AT_P OPEN_PAREN maxValueList CLOSE_PAREN INTO OPEN_PAREN split_dest_rangesubpartition_define_list CLOSE_PAREN optGPI
//  | TRUNCATE PARTITION colId optGPI
//  | TRUNCATE nltk_PARTITION_FOR OPEN_PAREN maxValueList CLOSE_PAREN optGPI
//  | TRUNCATE SUBPARTITION colId optGPI
//  | ENABLE_P ROW MOVEMENT
//  | DISABLE_P ROW MOVEMENT
//  ;
//
//move_partition_cmd  : MOVE PARTITION partition_name TABLESPACE name
//  | MOVE nltk_PARTITION_FOR OPEN_PAREN maxValueList CLOSE_PAREN TABLESPACE name
//  ;
//
//exchange_partition_cmd  : EXCHANGE PARTITION OPEN_PAREN colId CLOSE_PAREN WITH TABLE relation_expr opt_verbose optGPI
//  | EXCHANGE PARTITION OPEN_PAREN colId CLOSE_PAREN WITH TABLE relation_expr WITH VALIDATION opt_verbose optGPI
//  | EXCHANGE PARTITION OPEN_PAREN colId CLOSE_PAREN WITH TABLE relation_expr WITHOUT VALIDATION optGPI
//  | EXCHANGE nltk_PARTITION_FOR OPEN_PAREN maxValueList CLOSE_PAREN WITH TABLE relation_expr opt_verbose optGPI
//  | EXCHANGE nltk_PARTITION_FOR OPEN_PAREN maxValueList CLOSE_PAREN WITH TABLE relation_expr WITH VALIDATION opt_verbose optGPI
//  | EXCHANGE nltk_PARTITION_FOR OPEN_PAREN maxValueList CLOSE_PAREN WITH TABLE relation_expr WITHOUT VALIDATION optGPI
//  ;
//
//reset_partition_cmd  : RESET PARTITION
//  ;
//
//alter_table_cmd  : UNUSABLE
//  | ALTER INDEX index_name INVISIBLE
//  | ALTER INDEX index_name VISIBLE
//  | REBUILD
//  | ADD_P columnDef add_column_first_after
//  | ADD_P COLUMN columnDef add_column_first_after
//  | ADD_P TABLE qualified_name
//  | ALTER opt_column colId alter_column_default
//  | ALTER opt_column colId DROP NOT NULL_P
//  | ALTER opt_column colId SET NOT NULL_P
//  | ALTER opt_column colId SET STATISTICS signedIconst
//  | ALTER opt_column colId SET STATISTICS PERCENT_P signedIconst
//  | ADD_P STATISTICS OPEN_PAREN opt_multi_name_list CLOSE_PAREN
//  | DELETE_P STATISTICS OPEN_PAREN opt_multi_name_list CLOSE_PAREN
//  | ALTER opt_column colId SET reloptions
//  | ALTER opt_column colId RESET reloptions
//  | ALTER opt_column colId SET STORAGE colId
//  | DROP opt_column IF_P EXISTS colId opt_drop_behavior
//  | DROP opt_column colId opt_drop_behavior
//  | ALTER opt_column colId opt_set_data TYPE_P typename opt_collate_clause alter_using
//  | ALTER opt_column colId alter_generic_options
//  | ADD_P tableConstraint
//  | VALIDATE CONSTRAINT name
//  | DROP CONSTRAINT IF_P EXISTS name opt_drop_behavior
//  | DROP CONSTRAINT name opt_drop_behavior
//  | MODIFY_P modify_column_cmd
//  | MODIFY_P COLUMN colId typename opt_charset colQualList opt_column_options add_column_first_after
//  | CHANGE opt_column colId colId typename opt_charset colQualList opt_column_options add_column_first_after
//  | SET WITH OIDS
//  | SET WITHOUT OIDS
//  | CLUSTER ON name
//  | SET WITHOUT CLUSTER
//  | ENABLE_P TRIGGER name
//  | ENABLE_P ALWAYS TRIGGER name
//  | ENABLE_P REPLICA TRIGGER name
//  | ENABLE_P TRIGGER ALL
//  | ENABLE_P TRIGGER USER
//  | DISABLE_P TRIGGER name
//  | DISABLE_P TRIGGER ALL
//  | DISABLE_P TRIGGER USER
//  | ENABLE_P RULE name
//  | ENABLE_P ALWAYS RULE name
//  | ENABLE_P REPLICA RULE name
//  | DISABLE_P RULE name
//  | INHERIT qualified_name
//  | NO INHERIT qualified_name
//  | OF any_name
//  | NOT OF
//  | OWNER TO userId
//  | SET TABLESPACE name
//  | SET COMPRESS
//  | SET NOCOMPRESS
//  | SET reloptions
//  | RESET reloptions
//  | REPLICA IDENTITY_P replica_identity
//  | alter_generic_options
//  | optDistributeByInternal
//  | optSubClusterInternal
//  | ADD_P NODE pgxcnodes
//  | DELETE_P NODE pgxcnodes
//  | UPDATE SLICE LIKE qualified_name
//  | ENABLE_P ROW LEVEL SECURITY
//  | DISABLE_P ROW LEVEL SECURITY
//  | FORCE ROW LEVEL SECURITY
//  | NO FORCE ROW LEVEL SECURITY
//  | ENCRYPTION KEY ROTATION
//  | autoIncrementValue
//  | charsetCollate
//  | CONVERT_P TO convert_charset opt_collate
//  | COMMENT opt_equal sconst
//  ;
//
//alter_column_default  : SET DEFAULT a_expr
//  | DROP DEFAULT
//  ;
//
//opt_drop_behavior  : CASCADE
//  | RESTRICT
//  | CASCADE CONSTRAINTS
//  |
//  ;
//
//opt_collate_clause  : COLLATE collate_name
//  |
//  ;
//
//alter_using  : USING a_expr
//  |
//  ;
//
//reloptions  : OPEN_PAREN reloption_list CLOSE_PAREN
//  ;
//
//replica_identity  : NOTHING
//  | FULL
//  | DEFAULT
//  | USING INDEX name
//  ;
//
//opt_reloptions  : WITH reloptions
//  |
//  ;
//
//opt_index_options  :
//  | index_options
//  ;
//
//index_options  : index_option
//  | index_options index_option
//  ;
//
//index_option  : COMMENT opt_equal sconst
//  ;
//
//opt_table_index_options  :
//  | table_index_options
//  ;
//
//table_index_options  : table_index_option
//  | table_index_options table_index_option
//  ;
//
//table_index_option  : COMMENT opt_equal sconst
//  | USING IDENT
//  | INVISIBLE
//  | VISIBLE
//  ;
//
//opt_table_options  :
//  | table_options
//  ;
//
//table_options  : table_option
//  | table_options opt_comma table_option
//  ;
//
//table_option  : COMMENT opt_equal sconst
//  ;
//
//opt_comma  :
//  | COMMA
//  ;
//
//opt_column_options  :
//  | column_options
//  ;
//
//column_options  : column_option
//  | column_options column_option
//  ;
//
//column_option  : COMMENT sconst
//  ;
//
//opt_part_options  : optTableSpace part_options
//  | optTableSpace
//  ;
//
//part_options  : part_option
//  | part_options part_option
//  ;
//
//part_option  : COMMENT opt_equal sconst
//  ;
//
//reloption_list  : reloption_elem
//  | reloption_list COMMA reloption_elem
//  ;
//
//reloption_elem  : colLabel EQUAL def_arg
//  | colLabel EQUAL ROW
//  | colLabel
//  | colLabel DOT colLabel EQUAL def_arg
//  | colLabel DOT colLabel
//  ;
//
//split_dest_partition_define_list  : PARTITION name optTableSpace COMMA PARTITION name optTableSpace
//  ;
//
//split_dest_listsubpartition_define_list  : SUBPARTITION name optTableSpace COMMA SUBPARTITION name optTableSpace
//  ;
//
//split_dest_rangesubpartition_define_list  : SUBPARTITION name optTableSpace COMMA SUBPARTITION name optTableSpace
//  ;
//
//alterCompositeTypeStmt  : ALTER TYPE_P any_name alter_type_cmds
//  ;
//
//alter_type_cmds  : alter_type_cmd
//  | alter_type_cmds COMMA alter_type_cmd
//  ;
//
//alter_type_cmd  : ADD_P ATTRIBUTE tableFuncElement opt_drop_behavior
//  | DROP ATTRIBUTE IF_P EXISTS colId opt_drop_behavior
//  | DROP ATTRIBUTE colId opt_drop_behavior
//  | ALTER ATTRIBUTE colId opt_set_data TYPE_P typename opt_collate_clause opt_drop_behavior
//  ;
//
//closePortalStmt  : CLOSE cursor_name
//  | CLOSE ALL
//  ;
//
//copyStmt  : COPY opt_binary qualified_name opt_column_list opt_oids copy_from copy_file_name opt_load opt_useeof copy_delimiter opt_noescaping optCopyLogError optCopyRejectLimit opt_with copy_options opt_processed
//  | COPY select_with_parens TO copy_file_name opt_noescaping opt_with copy_options opt_processed
//  ;
//
//opt_processed  : ENCRYPTED
//  |
//  ;
//
//opt_load  : LOAD
//  |
//  ;
//
//opt_useeof  : USEEOF
//  |
//  ;
//
//copy_from  : FROM
//  | TO
//  ;
//
//copy_file_name  : sconst
//  | STDIN
//  | STDOUT
//  | REDISANYVALUE
//  ;
//
//copy_options  : copy_opt_list
//  | OPEN_PAREN copy_generic_opt_list CLOSE_PAREN
//  ;
//
//copy_opt_list  : copy_opt_list copy_opt_item
//  |
//  ;
//
//copy_opt_item  : BINARY
//  | OIDS
//  | FREEZE
//  | DELIMITER opt_as sconst
//  | NULL_P opt_as sconst
//  | CSV
//  | FIXED_P
//  | HEADER_P
//  | QUOTE opt_as sconst
//  | ESCAPE opt_as sconst
//  | FORCE QUOTE columnList
//  | FORCE QUOTE STAR
//  | FORCE NOT NULL_P columnList
//  | ENCODING sconst
//  | EOL sconst
//  | FILEHEADER_P sconst
//  | FORMATTER OPEN_PAREN copy_foramtter_opt CLOSE_PAREN
//  | IGNORE_EXTRA_DATA
//  | DATE_FORMAT_P sconst
//  | TIME_FORMAT_P sconst
//  | TIMESTAMP_FORMAT_P sconst
//  | SMALLDATETIME_FORMAT_P sconst
//  | COMPATIBLE_ILLEGAL_CHARS
//  | FILL_MISSING_FIELDS
//  | FILL_MISSING_FIELDS sconst
//  | TRANSFORM OPEN_PAREN copy_column_expr_list CLOSE_PAREN
//  | load_when_option
//  | SKIP_P iconst
//  | SEQUENCE OPEN_PAREN copy_column_sequence_list CLOSE_PAREN
//  | FILLER OPEN_PAREN copy_column_filler_list CLOSE_PAREN
//  | CONSTANT OPEN_PAREN copy_column_constant_list CLOSE_PAREN
//  ;
//
//opt_binary  : BINARY
//  |
//  ;
//
//opt_oids  : WITH OIDS
//  |
//  ;
//
//copy_delimiter  : opt_using DELIMITERS sconst
//  |
//  ;
//
//opt_using  : USING
//  |
//  ;
//
//opt_noescaping  : WITHOUT ESCAPING
//  |
//  ;
//
//optCopyLogError  : LOG_P ERRORS DATA_P
//  | LOG_P ERRORS
//  |
//  ;
//
//optCopyRejectLimit  : REJECT_P LIMIT sconst
//  |
//  ;
//
//copy_generic_opt_list  : copy_generic_opt_elem
//  | copy_generic_opt_list COMMA copy_generic_opt_elem
//  ;
//
//copy_generic_opt_elem  : colLabel copy_generic_opt_arg
//  ;
//
//copy_generic_opt_arg  : opt_boolean_or_string
//  | numericOnly
//  | STAR
//  | OPEN_PAREN copy_generic_opt_arg_list CLOSE_PAREN
//  |
//  ;
//
//copy_generic_opt_arg_list  : copy_generic_opt_arg_list_item
//  | copy_generic_opt_arg_list COMMA copy_generic_opt_arg_list_item
//  ;
//
//copy_generic_opt_arg_list_item  : opt_boolean_or_string
//  ;
//
//copy_foramtter_opt  : copy_col_format_def
//  | copy_foramtter_opt COMMA copy_col_format_def
//  ;
//
//copy_col_format_def  : colId OPEN_PAREN iconst COMMA iconst CLOSE_PAREN
//  ;
//
//copy_column_expr_list  : copy_column_expr_item
//  | copy_column_expr_list COMMA copy_column_expr_item
//  ;
//
//copy_column_expr_item  : colId optCopyColTypename optCopyColExpr
//  ;
//
//optCopyColTypename  : typename
//  |
//  ;
//
//optCopyColExpr  : AS b_expr
//  |
//  ;
//
//copy_column_sequence_list  : copy_column_sequence_item
//  | copy_column_sequence_list COMMA copy_column_sequence_item
//  ;
//
//copy_column_sequence_item  : colId OPEN_PAREN column_sequence_item_sart column_sequence_item_step CLOSE_PAREN
//  ;
//
//column_sequence_item_step  : COMMA iconst
//  | COMMA FCONST
//  |
//  ;
//
//column_sequence_item_sart  : iconst
//  | FCONST
//  ;
//
//copy_column_filler_list  : copy_column_filler_item
//  | copy_column_filler_list COMMA copy_column_filler_item
//  ;
//
//copy_column_filler_item  : colId
//  ;
//
//copy_column_constant_list  : copy_column_constant_item
//  | copy_column_constant_list COMMA copy_column_constant_item
//  ;
//
//copy_column_constant_item  : colId sconst
//  ;
//
//createStreamStmt  : CREATE STREAM qualified_name OPEN_PAREN optTableElementList CLOSE_PAREN
//  | CREATE STREAM IF_P NOT EXISTS qualified_name OPEN_PAREN optTableElementList CLOSE_PAREN
//  ;
//
//purgeStmt  : PURGE TABLE qualified_name
//  | PURGE INDEX qualified_name
//  | PURGE TABLESPACE name
//  | PURGE RECYCLEBIN
//  ;
//
//timeCapsuleStmt  : TIMECAPSULE TABLE qualified_name TO opt_timecapsule_clause
//  | TIMECAPSULE TABLE qualified_name TO BEFORE DROP opt_rename
//  | TIMECAPSULE TABLE qualified_name TO BEFORE TRUNCATE
//  ;
//
//opt_rename  : RENAME TO name
//  |
//  ;
//
//createStmt  : CREATE optTemp TABLE qualified_name OPEN_PAREN optTableElementList CLOSE_PAREN optInherit optAutoIncrement optCharsetCollate optWith onCommitOption optCompress optPartitionElement optDistributeBy optSubCluster opt_table_options opt_table_partitioning_clause opt_internal_data optKind
//  | CREATE optTemp TABLE IF_P NOT EXISTS qualified_name OPEN_PAREN optTableElementList CLOSE_PAREN optInherit optAutoIncrement optCharsetCollate optWith onCommitOption optCompress optPartitionElement optDistributeBy optSubCluster opt_table_options opt_table_partitioning_clause opt_internal_data
//  | CREATE optTemp TABLE qualified_name OF any_name optTypedTableElementList optWith onCommitOption optCompress optPartitionElement optDistributeBy optSubCluster opt_table_options
//  | CREATE optTemp TABLE IF_P NOT EXISTS qualified_name OF any_name optTypedTableElementList optWith onCommitOption optCompress optPartitionElement optDistributeBy optSubCluster opt_table_options
//  ;
//
//optKind  : FOR MATERIALIZED VIEW
//  |
//  ;
//
//opt_table_partitioning_clause  : range_partitioning_clause
//  | hash_partitioning_clause
//  | list_partitioning_clause
//  | value_partitioning_clause
//  |
//  ;
//
//range_partitioning_clause  : PARTITION BY RANGE opt_columns OPEN_PAREN column_item_list CLOSE_PAREN opt_interval_partition_clause opt_partitions_num subpartitioning_clause OPEN_PAREN range_partition_definition_list CLOSE_PAREN opt_row_movement_clause
//  ;
//
//list_partitioning_clause  : PARTITION BY LIST opt_columns OPEN_PAREN column_item_list CLOSE_PAREN opt_partitions_num subpartitioning_clause OPEN_PAREN list_partition_definition_list CLOSE_PAREN opt_row_movement_clause
//  ;
//
//hash_partitioning_clause  : PARTITION BY IDENT OPEN_PAREN column_item_list CLOSE_PAREN opt_partitions_num subpartitioning_clause opt_hash_partition_definition_list opt_row_movement_clause
//  | PARTITION BY KEY OPEN_PAREN column_item_list CLOSE_PAREN opt_partitions_num subpartitioning_clause opt_hash_partition_definition_list opt_row_movement_clause
//  ;
//
//opt_columns  : COLUMNS
//  |
//  ;
//
//opt_partitions_num  : PARTITIONS iconst
//  |
//  ;
//
//opt_subpartitions_num  : SUBPARTITIONS iconst
//  |
//  ;
//
//opt_hash_partition_definition_list  : OPEN_PAREN hash_partition_definition_list CLOSE_PAREN
//  |
//  ;
//
//value_partitioning_clause  : PARTITION BY VALUES OPEN_PAREN column_item_list CLOSE_PAREN
//  ;
//
//subpartitioning_clause  : range_subpartitioning_clause
//  | hash_subpartitioning_clause
//  | list_subpartitioning_clause
//  |
//  ;
//
//range_subpartitioning_clause  : SUBPARTITION BY RANGE OPEN_PAREN column_item_list CLOSE_PAREN
//  ;
//
//list_subpartitioning_clause  : SUBPARTITION BY LIST OPEN_PAREN column_item_list CLOSE_PAREN
//  ;
//
//hash_subpartitioning_clause  : SUBPARTITION BY IDENT OPEN_PAREN column_item_list CLOSE_PAREN opt_subpartitions_num
//  | SUBPARTITION BY KEY OPEN_PAREN column_item_list CLOSE_PAREN opt_subpartitions_num
//  ;
//
//subpartition_definition_list  : subpartition_item
//  | subpartition_definition_list COMMA subpartition_item
//  ;
//
//subpartition_item  : SUBPARTITION name VALUES OPEN_PAREN listValueList CLOSE_PAREN opt_part_options
//  | SUBPARTITION name opt_part_options
//  | SUBPARTITION name VALUES LESS THAN OPEN_PAREN maxValueList CLOSE_PAREN opt_part_options
//  ;
//
//column_item_list  : column_item
//  | column_item_list COMMA column_item
//  ;
//
//column_item  : a_expr
//  ;
//
//opt_interval_partition_clause  : INTERVAL OPEN_PAREN interval_expr CLOSE_PAREN opt_interval_tablespaceList
//  |
//  ;
//
//opt_interval_tablespaceList  : STORE_P IN_P OPEN_PAREN tablespaceList CLOSE_PAREN
//  |
//  ;
//
//interval_expr  : a_expr
//  ;
//
//tablespaceList  : name_list
//  ;
//
//range_partition_definition_list  : range_less_than_list
//  | range_start_end_list
//  ;
//
//list_partition_definition_list  : list_partition_item
//  | list_partition_definition_list COMMA list_partition_item
//  ;
//
//hash_partition_definition_list  : hash_partition_item
//  | hash_partition_definition_list COMMA hash_partition_item
//  ;
//
//range_less_than_list  : range_less_than_item
//  | range_less_than_list COMMA range_less_than_item
//  ;
//
//list_partition_item  : PARTITION name VALUES opt_in_p OPEN_PAREN listValueList CLOSE_PAREN opt_part_options
//  | PARTITION name VALUES opt_in_p OPEN_PAREN listValueList CLOSE_PAREN opt_part_options OPEN_PAREN subpartition_definition_list CLOSE_PAREN
//  ;
//
//opt_in_p  : IN_P
//  |
//  ;
//
//hash_partition_item  : PARTITION name opt_part_options
//  | PARTITION name opt_part_options OPEN_PAREN subpartition_definition_list CLOSE_PAREN
//  ;
//
//range_partition_boundary  : MAXVALUE
//  | OPEN_PAREN maxValueList CLOSE_PAREN
//  ;
//
//range_less_than_item  : PARTITION name VALUES LESS THAN range_partition_boundary opt_part_options
//  | PARTITION name VALUES LESS THAN range_partition_boundary opt_part_options OPEN_PAREN subpartition_definition_list CLOSE_PAREN
//  ;
//
//range_start_end_list  : range_start_end_item
//  | range_start_end_list COMMA range_start_end_item
//  ;
//
//range_start_end_item  : PARTITION name START OPEN_PAREN maxValueList CLOSE_PAREN END_P OPEN_PAREN maxValueList CLOSE_PAREN opt_range_every_list opt_part_options
//  | PARTITION name END_P OPEN_PAREN maxValueList CLOSE_PAREN opt_part_options
//  | PARTITION name START OPEN_PAREN maxValueList CLOSE_PAREN opt_part_options
//  ;
//
//opt_range_every_list  : EVERY OPEN_PAREN maxValueList CLOSE_PAREN
//  |
//  ;
//
//partition_name  : colId
//  ;
//
//maxValueList  : maxValueItem
//  | maxValueList COMMA maxValueItem
//  ;
//
//maxValueItem  : a_expr
//  | MAXVALUE
//  ;
//
//listValueList  : expr_list
//  | DEFAULT
//  ;
//
//opt_row_movement_clause  : ENABLE_P ROW MOVEMENT
//  | DISABLE_P ROW MOVEMENT
//  |
//  ;
//
//optTemp  : TEMPORARY
//  | TEMP
//  | LOCAL TEMPORARY
//  | LOCAL TEMP
//  | GLOBAL TEMPORARY
//  | GLOBAL TEMP
//  | UNLOGGED
//  |
//  ;
//
//optTableElementList  : tableElementList
//  |
//  ;
//
//optTypedTableElementList  : OPEN_PAREN typedTableElementList CLOSE_PAREN
//  |
//  ;
//
//tableElementList  : tableElement
//  | tableElementList COMMA tableElement
//  ;
//
//typedTableElementList  : typedTableElement
//  | typedTableElementList COMMA typedTableElement
//  ;
//
//tableElement  : columnDef
//  | tableLikeClause
//  | tableConstraint
//  ;
//
//typedTableElement  : columnOptions
//  | tableConstraint
//  ;
//
//columnDef  : colId typename opt_charset kVType colCmprsMode create_generic_options colQualList opt_column_options
//  ;
//
//add_column_first_after  : FIRST_P
//  | AFTER colId
//  |
//  ;
//
//kVType  : TSTAG
//  | TSFIELD
//  | TSTIME
//  |
//  ;
//
//colCmprsMode  : DELTA
//  | PREFIX
//  | DICTIONARY
//  | NUMSTR
//  | NOCOMPRESS
//  |
//  ;
//
//columnOptions  : colId withOptions colQualList
//  ;
//
//withOptions  : WITH OPTIONS
//  |
//  ;
//
//colQualList  : colQualList colConstraint
//  |
//  ;
//
//colConstraint  : CONSTRAINT name colConstraintElem
//  | colConstraintElem
//  | constraintAttr
//  | COLLATE collate_name
//  | ENCRYPTED with_algorithm
//  | AUTO_INCREMENT
//  ;
//
//with_algorithm  : WITH OPEN_PAREN algorithm_desc CLOSE_PAREN
//  |
//  ;
//
//algorithm_desc  : datatypecl columnEncryptionKey COMMA encryptionType
//  | datatypecl encryptionType COMMA columnEncryptionKey
//  ;
//
//columnEncryptionKey  : COLUMN_ENCRYPTION_KEY EQUAL setting_name
//  ;
//
//encryptionType  : ENCRYPTION_TYPE EQUAL RANDOMIZED
//  | ENCRYPTION_TYPE EQUAL DETERMINISTIC
//  ;
//
//setting_name  : colId
//  | colId indirection
//  ;
//
//createKeyStmt  : createMasterKeyStmt
//  | createColumnKeyStmt
//  ;
//
//createMasterKeyStmt  : CREATE CLIENT MASTER KEY setting_name WITH OPEN_PAREN master_key_params CLOSE_PAREN
//  ;
//
//master_key_params  : master_key_elem
//  | master_key_params COMMA master_key_elem
//  ;
//
//master_key_elem  : KEY_STORE EQUAL colId
//  | KEY_PATH EQUAL colId
//  | ALGORITHM EQUAL colId
//  ;
//
//createColumnKeyStmt  : CREATE COLUMN ENCRYPTION KEY setting_name WITH VALUES OPEN_PAREN column_key_params CLOSE_PAREN
//  ;
//
//column_key_params  : column_key_elem
//  | column_key_params COMMA column_key_elem
//  ;
//
//column_key_elem  : CLIENT_MASTER_KEY EQUAL setting_name
//  | ALGORITHM EQUAL colId
//  | ENCRYPTED_VALUE EQUAL sconst
//  ;
//
//datatypecl  : DATATYPE_CL EQUAL client_logic_type COMMA
//  |
//  ;
//
//informationalConstraintElem  : nltk_NOT_ENFORCED
//  | nltk_NOT_ENFORCED DISABLE_P QUERY OPTIMIZATION
//  | nltk_NOT_ENFORCED ENABLE_P QUERY OPTIMIZATION
//  | ENFORCED
//  |
//  ;
//
//colConstraintElem  : NOT NULL_P
//  | NOT NULL_P ENABLE_P
//  | NULL_P
//  | opt_unique_key opt_definition optConsTableSpaceWithEmpty informationalConstraintElem
//  | opt_unique_key opt_definition optConsTableSpaceWithEmpty ENABLE_P informationalConstraintElem
//  | PRIMARY KEY opt_definition optConsTableSpaceWithEmpty informationalConstraintElem
//  | PRIMARY KEY opt_definition optConsTableSpaceWithEmpty ENABLE_P informationalConstraintElem
//  | CHECK OPEN_PAREN a_expr CLOSE_PAREN opt_no_inherit
//  | CHECK OPEN_PAREN a_expr CLOSE_PAREN opt_no_inherit ENABLE_P
//  | DEFAULT b_expr
//  | nltk_ON_UPDATE_TIME UPDATE b_expr
//  | GENERATED ALWAYS AS OPEN_PAREN a_expr CLOSE_PAREN generated_column_option
//  | REFERENCES qualified_name opt_column_list key_match key_actions
//  | REFERENCES qualified_name opt_column_list key_match key_actions ENABLE_P
//  ;
//
//opt_unique_key  : UNIQUE
//  | UNIQUE KEY
//  ;
//
//generated_column_option  : STORED
//  |
//  ;
//
//constraintAttr  : DEFERRABLE
//  | NOT DEFERRABLE
//  | INITIALLY DEFERRED
//  | INITIALLY IMMEDIATE
//  ;
//
//tableLikeClause  : LIKE qualified_name tableLikeOptionList
//  | LIKE qualified_name nltk_INCLUDING_ALL excluding_option_list
//  ;
//
//excluding_option_list  : excluding_option_list EXCLUDING tableLikeExcludingOption
//  |
//  ;
//
//tableLikeOptionList  : tableLikeOptionList INCLUDING tableLikeIncludingOption
//  | tableLikeOptionList EXCLUDING tableLikeExcludingOption
//  |
//  ;
//
//tableLikeIncludingOption  : DEFAULTS
//  | CONSTRAINTS
//  | INDEXES
//  | STORAGE
//  | COMMENTS
//  | PARTITION
//  | RELOPTIONS
//  | DISTRIBUTION
//  | OIDS
//  | GENERATED
//  ;
//
//tableLikeExcludingOption  : DEFAULTS
//  | CONSTRAINTS
//  | INDEXES
//  | STORAGE
//  | COMMENTS
//  | PARTITION
//  | RELOPTIONS
//  | DISTRIBUTION
//  | OIDS
//  | GENERATED
//  | ALL
//  ;
//
//opt_internal_data  : INTERNAL DATA_P internal_data_body
//  |
//  ;
//
//internal_data_body  :
//  ;
//
//tableConstraint  : CONSTRAINT name constraintElem
//  | CONSTRAINT constraintElem
//  | constraintElem
//  ;
//
//constraintElem  : CHECK OPEN_PAREN a_expr CLOSE_PAREN constraintAttributeSpec opt_index_options
//  | UNIQUE name access_method_clause_without_keyword OPEN_PAREN constraint_params CLOSE_PAREN opt_c_include opt_definition optConsTableSpace opt_table_index_options constraintAttributeSpec informationalConstraintElem
//  | UNIQUE name access_method_clause_without_keyword OPEN_PAREN constraint_params CLOSE_PAREN opt_c_include opt_definition opt_table_index_options constraintAttributeSpec informationalConstraintElem
//  | UNIQUE USING IDENT OPEN_PAREN constraint_params CLOSE_PAREN opt_c_include opt_definition optConsTableSpace opt_table_index_options constraintAttributeSpec informationalConstraintElem
//  | UNIQUE USING IDENT OPEN_PAREN constraint_params CLOSE_PAREN opt_c_include opt_definition opt_table_index_options constraintAttributeSpec informationalConstraintElem
//  | UNIQUE OPEN_PAREN constraint_params CLOSE_PAREN opt_c_include opt_definition optConsTableSpace opt_table_index_options constraintAttributeSpec informationalConstraintElem
//  | UNIQUE OPEN_PAREN constraint_params CLOSE_PAREN opt_c_include opt_definition opt_table_index_options constraintAttributeSpec informationalConstraintElem
//  | UNIQUE existingIndex constraintAttributeSpec informationalConstraintElem opt_index_options
//  | PRIMARY KEY USING IDENT OPEN_PAREN constraint_params CLOSE_PAREN opt_c_include opt_definition optConsTableSpace opt_table_index_options constraintAttributeSpec informationalConstraintElem
//  | PRIMARY KEY USING IDENT OPEN_PAREN constraint_params CLOSE_PAREN opt_c_include opt_definition opt_table_index_options constraintAttributeSpec informationalConstraintElem
//  | PRIMARY KEY OPEN_PAREN constraint_params CLOSE_PAREN opt_c_include opt_definition optConsTableSpace opt_table_index_options constraintAttributeSpec informationalConstraintElem
//  | PRIMARY KEY OPEN_PAREN constraint_params CLOSE_PAREN opt_c_include opt_definition opt_table_index_options constraintAttributeSpec informationalConstraintElem
//  | PRIMARY KEY existingIndex constraintAttributeSpec informationalConstraintElem opt_index_options
//  | EXCLUDE access_method_clause OPEN_PAREN exclusionConstraintList CLOSE_PAREN opt_c_include opt_definition optConsTableSpaceWithEmpty exclusionWhereClause constraintAttributeSpec opt_index_options
//  | FOREIGN KEY name OPEN_PAREN columnList CLOSE_PAREN REFERENCES qualified_name opt_column_list key_match key_actions constraintAttributeSpec opt_index_options
//  | FOREIGN KEY OPEN_PAREN columnList CLOSE_PAREN REFERENCES qualified_name opt_column_list key_match key_actions constraintAttributeSpec opt_index_options
//  | PARTIAL CLUSTER KEY OPEN_PAREN columnList CLOSE_PAREN constraintAttributeSpec opt_index_options
//  ;
//
//opt_no_inherit  : NO INHERIT
//  |
//  ;
//
//opt_column_list  : OPEN_PAREN columnList CLOSE_PAREN
//  |
//  ;
//
//columnList  : columnElem
//  | columnList COMMA columnElem
//  ;
//
//columnElem  : colId
//  ;
//
//opt_c_include  : INCLUDE OPEN_PAREN columnList CLOSE_PAREN
//  |
//  ;
//
//key_match  : MATCH FULL
//  | MATCH PARTIAL
//  | MATCH SIMPLE
//  |
//  ;
//
//exclusionConstraintList  : exclusionConstraintElem
//  | exclusionConstraintList COMMA exclusionConstraintElem
//  ;
//
//exclusionConstraintElem  : index_elem WITH any_operator
//  | index_elem WITH OPERATOR OPEN_PAREN any_operator CLOSE_PAREN
//  ;
//
//exclusionWhereClause  : WHERE OPEN_PAREN a_expr CLOSE_PAREN
//  |
//  ;
//
//key_actions  : key_update
//  | key_delete
//  | key_update key_delete
//  | key_delete key_update
//  |
//  ;
//
//key_update  : ON UPDATE key_action
//  ;
//
//key_delete  : ON DELETE_P key_action
//  ;
//
//key_action  : NO ACTION
//  | RESTRICT
//  | CASCADE
//  | SET NULL_P
//  | SET DEFAULT
//  ;
//
//optInherit  : INHERITS OPEN_PAREN qualified_name_list CLOSE_PAREN
//  |
//  ;
//
//optWith  : WITH reloptions
//  | WITH OIDS
//  | WITHOUT OIDS
//  |
//  ;
//
//onCommitOption  : ON COMMIT DROP
//  | ON COMMIT DELETE_P ROWS
//  | ON COMMIT PRESERVE ROWS
//  |
//  ;
//
//autoIncrementValue  : AUTO_INCREMENT iconst
//  | AUTO_INCREMENT EQUAL iconst
//  | AUTO_INCREMENT FCONST
//  | AUTO_INCREMENT EQUAL FCONST
//  ;
//
//optAutoIncrement  : autoIncrementValue
//  |
//  ;
//
//optTableSpace  : TABLESPACE opt_equal name
//  |
//  ;
//
//optGPI  : UPDATE GLOBAL INDEX
//  |
//  ;
//
//optCompress  : COMPRESS
//  | NOCOMPRESS
//  |
//  ;
//
//optDistributeBy  : optDistributeByInternal
//  |
//  ;
//
//optDatanodeName  : DATANODE name
//  |
//  ;
//
//optDistributeType  : IDENT
//  ;
//
//optDistributeByInternal  : DISTRIBUTE BY optDistributeType OPEN_PAREN name_list CLOSE_PAREN
//  | DISTRIBUTE BY optDistributeType
//  | distribute_by_range_clause
//  | distribute_by_list_clause
//  ;
//
//distribute_by_list_clause  : DISTRIBUTE BY LIST OPEN_PAREN name_list CLOSE_PAREN optListDistribution
//  ;
//
//optListDistribution  : OPEN_PAREN list_dist_state CLOSE_PAREN
//  | sliceReferenceClause
//  ;
//
//list_dist_state  : list_distribution_rules_list
//  ;
//
//list_distribution_rules_list  : list_dist_value
//  | list_distribution_rules_list COMMA list_dist_value
//  ;
//
//list_dist_value  : SLICE name VALUES OPEN_PAREN list_distribution_rule_row CLOSE_PAREN optDatanodeName
//  | SLICE name VALUES OPEN_PAREN DEFAULT CLOSE_PAREN optDatanodeName
//  ;
//
//list_distribution_rule_row  : list_distribution_rule_single
//  | list_distribution_rule_row COMMA list_distribution_rule_single
//  ;
//
//list_distribution_rule_single  : OPEN_PAREN expr_list CLOSE_PAREN
//  | c_expr_noparen
//  ;
//
//distribute_by_range_clause  : DISTRIBUTE BY RANGE OPEN_PAREN name_list CLOSE_PAREN OPEN_PAREN range_slice_definition_list CLOSE_PAREN
//  | DISTRIBUTE BY RANGE OPEN_PAREN name_list CLOSE_PAREN sliceReferenceClause
//  ;
//
//sliceReferenceClause  : SLICE REFERENCES name
//  ;
//
//range_slice_definition_list  : range_slice_less_than_list
//  | range_slice_start_end_list
//  ;
//
//range_slice_less_than_list  : range_slice_less_than_item
//  | range_slice_less_than_list COMMA range_slice_less_than_item
//  ;
//
//range_slice_less_than_item  : SLICE name VALUES LESS THAN OPEN_PAREN maxValueList CLOSE_PAREN optDatanodeName
//  ;
//
//range_slice_start_end_list  : range_slice_start_end_item
//  | range_slice_start_end_list COMMA range_slice_start_end_item
//  ;
//
//range_slice_start_end_item  : SLICE name START OPEN_PAREN maxValueList CLOSE_PAREN END_P OPEN_PAREN maxValueList CLOSE_PAREN opt_range_every_list
//  | SLICE name END_P OPEN_PAREN maxValueList CLOSE_PAREN
//  | SLICE name START OPEN_PAREN maxValueList CLOSE_PAREN
//  ;
//
//optSubCluster  : optSubClusterInternal
//  |
//  ;
//
//optSubClusterInternal  : TO NODE pgxcnodes
//  | TO GROUP_P pgxcgroup_name
//  ;
//
//optConsTableSpace  : USING INDEX optPartitionElement
//  ;
//
//optConsTableSpaceWithEmpty  : USING INDEX optPartitionElement
//  |
//  ;
//
//optPartitionElement  : optTableSpace optPctFree optInitRans optMaxTrans optStorage
//  ;
//
//optPctFree  : PCTFREE iconst
//  |
//  ;
//
//optInitRans  : INITRANS iconst
//  |
//  ;
//
//optMaxTrans  : MAXTRANS iconst
//  |
//  ;
//
//optStorage  : STORAGE OPEN_PAREN optInitial optNext optMinextents optMaxextents CLOSE_PAREN
//  |
//  ;
//
//optInitial  : INITIAL_P iconst IDENT
//  |
//  ;
//
//optNext  : NEXT iconst IDENT
//  |
//  ;
//
//optMinextents  : MINEXTENTS iconst
//  |
//  ;
//
//optMaxextents  : MAXEXTENTS UNLIMITED
//  | MAXEXTENTS iconst
//  |
//  ;
//
//existingIndex  : USING INDEX index_name
//  ;
//
//createAsStmt  : CREATE optTemp TABLE create_as_target AS selectStmt opt_with_data
//  ;
//
//optDuplicate  :
//  | IGNORE
//  | REPLACE
//  ;
//
//create_as_target  : qualified_name opt_column_list optWith onCommitOption optCompress optTableSpace optDistributeBy optSubCluster
//  | qualified_name OPEN_PAREN optTableElementList CLOSE_PAREN optInherit optAutoIncrement optCharsetCollate optWith onCommitOption optCompress optPartitionElement optDistributeBy optSubCluster optDuplicate
//  ;
//
//opt_with_data  : WITH DATA_P
//  | WITH NO DATA_P
//  |
//  ;
//
//snapshotStmt  : CREATE optTemp SNAPSHOT qualified_name optSnapshotVersion optDistributeBy optSubCluster optSnapshotComment AS selectStmt
//  | CREATE optTemp SNAPSHOT qualified_name optSnapshotVersion optDistributeBy optSubCluster FROM snapshotVersion optSnapshotComment USING OPEN_PAREN alterSnapshotCmdList CLOSE_PAREN
//  | SAMPLE SNAPSHOT qualified_name snapshotVersion optSnapshotStratify snapshotSampleList
//  | ARCHIVE SNAPSHOT qualified_name snapshotVersion
//  | PUBLISH SNAPSHOT qualified_name snapshotVersion
//  | PURGE SNAPSHOT qualified_name snapshotVersion
//  ;
//
//snapshotVersion  : AT iconst
//  | AT FCONST
//  | AT VCONST
//  | AT colId_or_Sconst
//  ;
//
//optSnapshotVersion  : snapshotVersion
//  |
//  ;
//
//optSnapshotComment  : COMMENT IS comment_text
//  |
//  ;
//
//alterSnapshotCmdList  : alterSnapshotCmdListNoParens
//  | alterSnapshotCmdListWithParens
//  ;
//
//alterSnapshotCmdListWithParens  : OPEN_PAREN alterSnapshotCmdListNoParens CLOSE_PAREN
//  | OPEN_PAREN alterSnapshotCmdListWithParens CLOSE_PAREN
//  ;
//
//alterSnapshotCmdListNoParens  : alterSnapshotCmdOrEmpty
//  | alterSnapshotCmdListNoParens SEMI alterSnapshotCmdOrEmpty
//  ;
//
//alterSnapshotCmdOrEmpty  : INSERT optInsertIntoSnapshot insert_rest
//  | UPDATE optAlterUpdateSnapshot optSnapshotAlias SET set_clause_list from_clause where_clause
//  | DELETE_P optDeleteFromSnapshot optSnapshotAlias using_clause where_clause
//  | ALTER optAlterUpdateSnapshot alterSnapshotDdlList
//  |
//  ;
//
//optAlterUpdateSnapshot  : SNAPSHOT
//  |
//  ;
//
//optInsertIntoSnapshot  : INTO SNAPSHOT
//  |
//  ;
//
//optDeleteFromSnapshot  : FROM SNAPSHOT
//  |
//  ;
//
//optSnapshotAlias  : AS colId
//  |
//  ;
//
//alterSnapshotDdlList  : alterSnapshotDdl
//  | alterSnapshotDdlList COMMA alterSnapshotDdl
//  ;
//
//alterSnapshotDdl  : ADD_P opt_column columnDef
//  | DROP opt_column IF_P EXISTS colId
//  | DROP opt_column colId
//  ;
//
//snapshotSample  : AS colLabel AT_P RATIO FCONST optSnapshotComment
//  ;
//
//snapshotSampleList  : snapshotSample
//  | snapshotSampleList COMMA snapshotSample
//  ;
//
//optSnapshotStratify  : STRATIFY BY column_item_list
//  |
//  ;
//
//createMatViewStmt  : CREATE optNoLog opt_incremental MATERIALIZED VIEW create_mv_target AS selectStmt opt_with_data
//  ;
//
//create_mv_target  : qualified_name opt_column_list optDistributeBy opt_reloptions optTableSpace
//  ;
//
//optNoLog  : UNLOGGED
//  |
//  ;
//
//opt_incremental  : INCREMENTAL
//  |
//  ;
//
//refreshMatViewStmt  : REFRESH opt_incremental MATERIALIZED VIEW qualified_name opt_with_data
//  ;
//
//createSeqStmt  : CREATE optTemp opt_large_seq SEQUENCE qualified_name optSeqOptList
//  ;
//
//alterSeqStmt  : ALTER SEQUENCE qualified_name seqOptList
//  | ALTER LARGE_P SEQUENCE qualified_name seqOptList
//  | ALTER SEQUENCE IF_P EXISTS qualified_name seqOptList
//  | ALTER LARGE_P SEQUENCE IF_P EXISTS qualified_name seqOptList
//  ;
//
//opt_large_seq  : LARGE_P
//  |
//  ;
//
//optSeqOptList  : seqOptList
//  |
//  ;
//
//seqOptList  : seqOptElem
//  | seqOptList seqOptElem
//  ;
//
//seqOptElem  : CACHE numericOnly
//  | CYCLE
//  | NO CYCLE
//  | INCREMENT opt_by numericOnly
//  | MAXVALUE numericOnly
//  | MINVALUE numericOnly
//  | NO MAXVALUE
//  | NO MINVALUE
//  | OWNED BY any_name
//  | nltk_START_WITH numericOnly
//  | START numericOnly
//  | RESTART
//  | RESTART opt_with numericOnly
//  | NOCYCLE
//  | NOMAXVALUE
//  | NOMINVALUE
//  ;
//
//opt_by  : BY
//  |
//  ;
//
//numericOnly  : FCONST
//  | PLUS FCONST
//  | MINUS FCONST
//  | signedIconst
//  ;
//
//numericOnly_list  : numericOnly
//  | numericOnly_list COMMA numericOnly
//  ;
//
//createPLangStmt  : CREATE opt_or_replace opt_trusted opt_procedural LANGUAGE colId_or_Sconst
//  | CREATE opt_or_replace opt_trusted opt_procedural LANGUAGE colId_or_Sconst HANDLER handler_name opt_inline_handler opt_validator
//  ;
//
//opt_trusted  : TRUSTED
//  |
//  ;
//
//handler_name  : name
//  | name attrs
//  ;
//
//opt_inline_handler  : INLINE_P handler_name
//  |
//  ;
//
//validator_clause  : VALIDATOR handler_name
//  | NO VALIDATOR
//  ;
//
//opt_validator  : validator_clause
//  |
//  ;
//
//dropPLangStmt  : DROP opt_procedural LANGUAGE colId_or_Sconst opt_drop_behavior
//  | DROP opt_procedural LANGUAGE IF_P EXISTS colId_or_Sconst opt_drop_behavior
//  ;
//
//opt_procedural  : PROCEDURAL
//  |
//  ;
//
//tblspc_options  : OPEN_PAREN tblspc_option_list CLOSE_PAREN
//  ;
//
//opt_tblspc_options  : WITH tblspc_options
//  |
//  ;
//
//tblspc_option_list  : tblspc_option_elem
//  | tblspc_option_list COMMA tblspc_option_elem
//  ;
//
//tblspc_option_elem  : colLabel EQUAL sconst
//  | colLabel EQUAL func_type
//  | colLabel EQUAL numericOnly
//  ;
//
//createTableSpaceStmt  : CREATE TABLESPACE name optTableSpaceOwner optRelative LOCATION sconst optMaxSize opt_tblspc_options
//  | CREATE TABLESPACE name loggingStr DATAFILE sconst optDatafileSize optReuse optAuto
//  | CREATE TABLESPACE name DATAFILE sconst optDatafileSize optReuse optAuto loggingStr
//  | CREATE TABLESPACE name DATAFILE sconst optDatafileSize optReuse optAuto
//  ;
//
//loggingStr  : LOGGING
//  | NOLOGGING
//  ;
//
//optDatafileSize  : SIZE iconst IDENT
//  |
//  ;
//
//optReuse  : REUSE
//  |
//  ;
//
//optAuto  : AUTOEXTEND ON optNextStr optMaxSize
//  | AUTOEXTEND OFF
//  |
//  ;
//
//optNextStr  : NEXT iconst IDENT
//  |
//  ;
//
//optMaxSize  : MAXSIZE sconst
//  |
//  ;
//
//size_clause  : sconst
//  | UNLIMITED
//  ;
//
//optRelative  : RELATIVE_P
//  |
//  ;
//
//optTableSpaceOwner  : OWNER name
//  |
//  ;
//
//dropTableSpaceStmt  : DROP TABLESPACE name
//  | DROP TABLESPACE IF_P EXISTS name
//  ;
//
//createExtensionStmt  : CREATE EXTENSION name opt_with create_extension_opt_list
//  | CREATE EXTENSION IF_P NOT EXISTS name opt_with create_extension_opt_list
//  ;
//
//create_extension_opt_list  : create_extension_opt_list create_extension_opt_item
//  |
//  ;
//
//create_extension_opt_item  : SCHEMA name
//  | VERSION_P colId_or_Sconst
//  | FROM colId_or_Sconst
//  ;
//
//createDirectoryStmt  : CREATE opt_or_replace DIRECTORY name AS sconst
//  ;
//
//dropDirectoryStmt  : DROP DIRECTORY name
//  | DROP DIRECTORY IF_P EXISTS name
//  ;
//
//alterExtensionStmt  : ALTER EXTENSION name UPDATE alter_extension_opt_list
//  ;
//
//alter_extension_opt_list  : alter_extension_opt_list alter_extension_opt_item
//  |
//  ;
//
//alter_extension_opt_item  : TO colId_or_Sconst
//  ;
//
//alterExtensionContentsStmt  : ALTER EXTENSION name add_drop AGGREGATE func_name aggr_args
//  | ALTER EXTENSION name add_drop nltk_EVENT_TRIGGER name
//  | ALTER EXTENSION name add_drop CAST OPEN_PAREN typename AS typename CLOSE_PAREN
//  | ALTER EXTENSION name add_drop COLLATION any_name
//  | ALTER EXTENSION name add_drop CONVERSION_P any_name
//  | ALTER EXTENSION name add_drop DOMAIN_P any_name
//  | ALTER EXTENSION name add_drop FUNCTION function_with_argtypes
//  | ALTER EXTENSION name add_drop opt_procedural LANGUAGE name
//  | ALTER EXTENSION name add_drop OPERATOR any_operator oper_argtypes
//  | ALTER EXTENSION name add_drop OPERATOR CLASS any_name USING access_method
//  | ALTER EXTENSION name add_drop OPERATOR FAMILY any_name USING access_method
//  | ALTER EXTENSION name add_drop SCHEMA name
//  | ALTER EXTENSION name add_drop TABLE any_name
//  | ALTER EXTENSION name add_drop TEXT_P SEARCH PARSER any_name
//  | ALTER EXTENSION name add_drop TEXT_P SEARCH DICTIONARY any_name
//  | ALTER EXTENSION name add_drop TEXT_P SEARCH TEMPLATE any_name
//  | ALTER EXTENSION name add_drop TEXT_P SEARCH CONFIGURATION any_name
//  | ALTER EXTENSION name add_drop SEQUENCE any_name
//  | ALTER EXTENSION name add_drop VIEW any_name
//  | ALTER EXTENSION name add_drop MATERIALIZED VIEW any_name
//  | ALTER EXTENSION name add_drop FOREIGN TABLE any_name
//  | ALTER EXTENSION name add_drop FOREIGN DATA_P WRAPPER name
//  | ALTER EXTENSION name add_drop SERVER name
//  | ALTER EXTENSION name add_drop TYPE_P any_name
//  ;
//
//createWeakPasswordDictionaryStmt  : CREATE WEAK PASSWORD DICTIONARY opt_vals weak_password_string_list
//  ;
//
//opt_vals  : WITH VALUES
//  |
//  ;
//
//weak_password_string_list  : OPEN_PAREN password_string CLOSE_PAREN
//  | weak_password_string_list COMMA OPEN_PAREN password_string CLOSE_PAREN
//  ;
//
//dropWeakPasswordDictionaryStmt  : DROP WEAK PASSWORD DICTIONARY
//  ;
//
//createFdwStmt  : CREATE FOREIGN DATA_P WRAPPER name opt_fdw_options create_generic_options
//  ;
//
//fdw_option  : HANDLER handler_name
//  | NO HANDLER
//  | VALIDATOR handler_name
//  | NO VALIDATOR
//  ;
//
//fdw_options  : fdw_option
//  | fdw_options fdw_option
//  ;
//
//opt_fdw_options  : fdw_options
//  |
//  ;
//
//dropFdwStmt  : DROP FOREIGN DATA_P WRAPPER name opt_drop_behavior
//  | DROP FOREIGN DATA_P WRAPPER IF_P EXISTS name opt_drop_behavior
//  ;
//
//alterFdwStmt  : ALTER FOREIGN DATA_P WRAPPER name opt_fdw_options alter_generic_options
//  | ALTER FOREIGN DATA_P WRAPPER name fdw_options
//  ;
//
//create_generic_options  : OPTIONS OPEN_PAREN generic_option_list CLOSE_PAREN
//  |
//  ;
//
//generic_option_list  : generic_option_elem
//  | generic_option_list COMMA generic_option_elem
//  ;
//
//alter_generic_options  : OPTIONS OPEN_PAREN alter_generic_option_list CLOSE_PAREN
//  ;
//
//alter_generic_option_list  : alter_generic_option_elem
//  | alter_generic_option_list COMMA alter_generic_option_elem
//  ;
//
//alter_generic_option_elem  : generic_option_elem
//  | SET generic_option_elem
//  | ADD_P generic_option_elem
//  | DROP generic_option_name
//  ;
//
//generic_option_elem  : generic_option_name generic_option_arg
//  ;
//
//generic_option_name  : colLabel
//  ;
//
//generic_option_arg  : sconst
//  ;
//
//fdwName  : IDENT
//  ;
//
//createForeignServerStmt  : CREATE SERVER name opt_type opt_foreign_server_version FOREIGN DATA_P WRAPPER fdwName create_generic_options
//  ;
//
//opt_type  : TYPE_P sconst
//  |
//  ;
//
//foreign_server_version  : VERSION_P sconst
//  | VERSION_P NULL_P
//  ;
//
//opt_foreign_server_version  : foreign_server_version
//  |
//  ;
//
//dropForeignServerStmt  : DROP SERVER name opt_drop_behavior
//  | DROP SERVER IF_P EXISTS name opt_drop_behavior
//  ;
//
//alterForeignServerStmt  : ALTER SERVER name foreign_server_version alter_generic_options
//  | ALTER SERVER name foreign_server_version
//  | ALTER SERVER name alter_generic_options
//  ;
//
//createForeignTableStmt  : CREATE FOREIGN TABLE qualified_name optForeignTableElementList SERVER name create_generic_options foreignTblWritable optForeignTableLogError optForeignTableLogRemote optPerNodeRejectLimit optDistributeBy optSubCluster optForeignPartBy
//  | CREATE FOREIGN TABLE IF_P NOT EXISTS qualified_name optForeignTableElementList SERVER name create_generic_options foreignTblWritable optForeignTableLogError optForeignTableLogRemote optPerNodeRejectLimit optDistributeBy optSubCluster optForeignPartBy
//  | CREATE FOREIGN TABLE qualified_name optForeignTableElementList create_generic_options foreignTblWritable optForeignTableLogError optForeignTableLogRemote optPerNodeRejectLimit optDistributeBy optSubCluster optForeignPartBy
//  | CREATE FOREIGN TABLE IF_P NOT EXISTS qualified_name optForeignTableElementList create_generic_options foreignTblWritable optForeignTableLogError optForeignTableLogRemote optPerNodeRejectLimit optDistributeBy optSubCluster optForeignPartBy
//  ;
//
//foreignTblWritable  : WRITE ONLY
//  | READ ONLY
//  |
//  ;
//
//optForeignTableElementList  : OPEN_PAREN foreignTableElementList CLOSE_PAREN
//  | OPEN_PAREN CLOSE_PAREN
//  ;
//
//foreignTableElementList  : foreignTableElement
//  | foreignTableElementList COMMA foreignTableElement
//  ;
//
//foreignTableElement  : foreignColDef
//  | foreignTableLikeClause
//  | tableConstraint
//  ;
//
//foreignColDef  : colId typename foreignPosition create_generic_options colQualList
//  ;
//
//foreignPosition  : POSITION OPEN_PAREN iconst COMMA iconst CLOSE_PAREN
//  |
//  ;
//
//foreignTableLikeClause  : LIKE qualified_name
//  ;
//
//optForeignTableLogError  : LOG_P INTO qualified_name
//  | WITH qualified_name
//  |
//  ;
//
//optForeignTableLogRemote  : REMOTE_P LOG_P sconst
//  | REMOTE_P LOG_P
//  |
//  ;
//
//optPerNodeRejectLimit  : PER_P NODE REJECT_P LIMIT sconst
//  |
//  ;
//
//optForeignPartBy  : optForeignPartAuto
//  |
//  ;
//
//optForeignPartAuto  : PARTITION BY OPEN_PAREN partition_item_list CLOSE_PAREN AUTOMAPPED
//  | PARTITION BY OPEN_PAREN partition_item_list CLOSE_PAREN
//  ;
//
//partition_item_list  : partition_item
//  | partition_item_list COMMA partition_item
//  ;
//
//partition_item  : colId
//  ;
//
//alterForeignTableStmt  : ALTER FOREIGN TABLE relation_expr alter_table_cmds
//  | ALTER FOREIGN TABLE IF_P EXISTS relation_expr alter_table_cmds
//  | ALTER FOREIGN TABLE relation_expr MODIFY_P OPEN_PAREN modify_column_cmds CLOSE_PAREN
//  | ALTER FOREIGN TABLE IF_P EXISTS relation_expr MODIFY_P OPEN_PAREN modify_column_cmds CLOSE_PAREN
//  ;
//
//createUserMappingStmt  : CREATE USER MAPPING FOR auth_ident SERVER name create_generic_options
//  ;
//
//auth_ident  : CURRENT_USER
//  | USER
//  | roleId
//  ;
//
//dropUserMappingStmt  : DROP USER MAPPING FOR auth_ident SERVER name
//  | DROP USER MAPPING IF_P EXISTS FOR auth_ident SERVER name
//  ;
//
//alterUserMappingStmt  : ALTER USER MAPPING FOR auth_ident SERVER name alter_generic_options
//  ;
//
//createModelStmt  : CREATE MODEL colId USING colId features_clause target_clause from_clause with_hyperparameters_clause
//  ;
//
//features_clause  : FEATURES target_list
//  |
//  ;
//
//target_clause  : TARGET target_list
//  |
//  ;
//
//with_hyperparameters_clause  : WITH hyperparameter_name_value_list
//  |
//  ;
//
//hyperparameter_name_value_list  : hyperparameter_name_value
//  | hyperparameter_name_value_list COMMA hyperparameter_name_value
//  ;
//
//hyperparameter_name_value  : colLabel EQUAL var_value
//  | colLabel EQUAL DEFAULT
//  ;
//
//dropModelStmt  : DROP MODEL colId opt_drop_behavior
//  ;
//
//createRlsPolicyStmt  : CREATE rowLevelSecurityPolicyName ON qualified_name rLSDefaultPermissive rLSDefaultForCmd rLSDefaultToRole rLSOptionalUsingExpr
//  ;
//
//alterRlsPolicyStmt  : ALTER rowLevelSecurityPolicyName ON qualified_name rLSOptionalToRole rLSOptionalUsingExpr
//  ;
//
//dropRlsPolicyStmt  : DROP rowLevelSecurityPolicyName ON any_name opt_drop_behavior
//  | DROP POLICY IF_P EXISTS name ON any_name opt_drop_behavior
//  | DROP ROW LEVEL SECURITY POLICY IF_P EXISTS name ON any_name opt_drop_behavior
//  ;
//
//rowLevelSecurityPolicyName  : ROW LEVEL SECURITY POLICY name
//  | POLICY name
//  ;
//
//rLSOptionalUsingExpr  : USING OPEN_PAREN a_expr CLOSE_PAREN
//  |
//  ;
//
//rLSDefaultToRole  : TO row_level_security_role_list
//  |
//  ;
//
//rLSOptionalToRole  : TO row_level_security_role_list
//  |
//  ;
//
//row_level_security_role_list  : row_level_security_role
//  | row_level_security_role_list COMMA row_level_security_role
//  ;
//
//row_level_security_role  : roleId
//  | CURRENT_USER
//  | SESSION_USER
//  ;
//
//rLSDefaultPermissive  : AS IDENT
//  |
//  ;
//
//rLSDefaultForCmd  : FOR row_level_security_cmd
//  |
//  ;
//
//row_level_security_cmd  : ALL
//  | SELECT
//  | UPDATE
//  | DELETE_P
//  | INSERT
//  | MERGE
//  ;
//
//createSynonymStmt  : CREATE opt_or_replace SYNONYM any_name FOR any_name
//  ;
//
//dropSynonymStmt  : DROP SYNONYM any_name opt_drop_behavior
//  | DROP SYNONYM IF_P EXISTS any_name opt_drop_behavior
//  ;
//
//createDataSourceStmt  : CREATE DATA_P SOURCE_P name opt_data_source_type opt_data_source_version create_generic_options
//  ;
//
//data_source_type  : TYPE_P sconst
//  ;
//
//opt_data_source_type  : data_source_type
//  |
//  ;
//
//data_source_version  : VERSION_P sconst
//  | VERSION_P NULL_P
//  ;
//
//opt_data_source_version  : data_source_version
//  |
//  ;
//
//alterDataSourceStmt  : ALTER DATA_P SOURCE_P name data_source_type data_source_version alter_generic_options
//  | ALTER DATA_P SOURCE_P name data_source_type data_source_version
//  | ALTER DATA_P SOURCE_P name data_source_type alter_generic_options
//  | ALTER DATA_P SOURCE_P name data_source_version alter_generic_options
//  | ALTER DATA_P SOURCE_P name data_source_type
//  | ALTER DATA_P SOURCE_P name data_source_version
//  | ALTER DATA_P SOURCE_P name alter_generic_options
//  ;
//
//dropDataSourceStmt  : DROP DATA_P SOURCE_P name opt_drop_behavior
//  | DROP DATA_P SOURCE_P IF_P EXISTS name opt_drop_behavior
//  ;
//
//createTrigStmt  : CREATE opt_or_replace definer_user TRIGGER name triggerActionTime triggerEvents ON qualified_name triggerForSpec triggerWhen EXECUTE PROCEDURE func_name OPEN_PAREN triggerFuncArgs CLOSE_PAREN
//  | CREATE CONSTRAINT TRIGGER name AFTER triggerEvents ON qualified_name optConstrFromTable constraintAttributeSpec FOR EACH ROW triggerWhen EXECUTE PROCEDURE func_name OPEN_PAREN triggerFuncArgs CLOSE_PAREN
//  | CREATE opt_or_replace definer_user TRIGGER name triggerActionTime triggerEvents ON qualified_name triggerForSpec triggerWhen trigger_order subprogram_body
//  | CREATE opt_or_replace definer_user TRIGGER IF_P NOT EXISTS name triggerActionTime triggerEvents ON qualified_name triggerForSpec triggerWhen trigger_order subprogram_body
//  ;
//
//triggerActionTime  : BEFORE
//  | AFTER
//  | INSTEAD OF
//  ;
//
//triggerEvents  : triggerOneEvent
//  | triggerEvents OR triggerOneEvent
//  ;
//
//triggerOneEvent  : INSERT
//  | DELETE_P
//  | UPDATE
//  | UPDATE OF columnList
//  | TRUNCATE
//  ;
//
//triggerForSpec  : FOR triggerForOptEach triggerForType
//  |
//  ;
//
//triggerForOptEach  : EACH
//  |
//  ;
//
//triggerForType  : ROW
//  | STATEMENT
//  ;
//
//triggerWhen  : WHEN OPEN_PAREN a_expr CLOSE_PAREN
//  |
//  ;
//
//triggerFuncArgs  : triggerFuncArg
//  | triggerFuncArgs COMMA triggerFuncArg
//  |
//  ;
//
//triggerFuncArg  : iconst
//  | FCONST
//  | sconst
//  | colLabel
//  ;
//
//trigger_order  :
//  | FOLLOWS_P colId
//  | PRECEDES_P colId
//  ;
//
//optConstrFromTable  : FROM qualified_name
//  |
//  ;
//
//constraintAttributeSpec  :
//  | constraintAttributeSpec constraintAttributeElem
//  ;
//
//constraintAttributeElem  : NOT DEFERRABLE
//  | DEFERRABLE
//  | INITIALLY IMMEDIATE
//  | INITIALLY DEFERRED
//  | NOT VALID
//  | NO INHERIT
//  ;
//
//createEventTrigStmt  : CREATE nltk_EVENT_TRIGGER name ON colLabel EXECUTE PROCEDURE func_name OPEN_PAREN CLOSE_PAREN
//  | CREATE nltk_EVENT_TRIGGER name ON colLabel WHEN event_trigger_when_list EXECUTE PROCEDURE func_name OPEN_PAREN CLOSE_PAREN
//  ;
//
//event_trigger_when_list  : event_trigger_when_item
//  | event_trigger_when_list AND event_trigger_when_item
//  ;
//
//event_trigger_when_item  : colId IN_P OPEN_PAREN event_trigger_value_list CLOSE_PAREN
//  ;
//
//event_trigger_value_list  : SCONST
//  | event_trigger_value_list COMMA SCONST
//  ;
//
//alterEventTrigStmt  : ALTER nltk_EVENT_TRIGGER name enable_trigger
//  ;
//
//enable_trigger  : ENABLE_P
//  | ENABLE_P REPLICA
//  | ENABLE_P ALWAYS
//  | DISABLE_P
//  ;
//
//dropTrigStmt  : DROP TRIGGER name ON any_name opt_drop_behavior
//  | DROP TRIGGER IF_P EXISTS name ON any_name opt_drop_behavior
//  | DROP TRIGGER name opt_drop_behavior
//  | DROP TRIGGER IF_P EXISTS name opt_drop_behavior
//  ;
//
//createAssertStmt  : CREATE ASSERTION name CHECK OPEN_PAREN a_expr CLOSE_PAREN constraintAttributeSpec
//  ;
//
//dropAssertStmt  : DROP ASSERTION name opt_drop_behavior
//  ;
//
//defineStmt  : CREATE AGGREGATE func_name aggr_args definition
//  | CREATE AGGREGATE func_name old_aggr_definition
//  | CREATE OPERATOR any_operator definition
//  | CREATE TYPE_P any_name definition
//  | CREATE TYPE_P any_name
//  | CREATE TYPE_P any_name as_is OPEN_PAREN optTableFuncElementList CLOSE_PAREN
//  | CREATE TYPE_P any_name as_is TABLE OF func_type
//  | CREATE TYPE_P any_name as_is ENUM_P OPEN_PAREN opt_enum_val_list CLOSE_PAREN
//  | CREATE TYPE_P any_name as_is RANGE definition
//  | CREATE TEXT_P SEARCH PARSER any_name definition
//  | CREATE TEXT_P SEARCH DICTIONARY any_name definition
//  | CREATE TEXT_P SEARCH TEMPLATE any_name definition
//  | CREATE TEXT_P SEARCH CONFIGURATION any_name tsconf_definition opt_cfoptions
//  | CREATE COLLATION any_name definition
//  | CREATE COLLATION any_name FROM any_name
//  ;
//
//opt_cfoptions  : WITH cfoptions
//  |
//  ;
//
//cfoptions  : OPEN_PAREN cfoption_list CLOSE_PAREN
//  ;
//
//cfoption_list  : cfoption_elem
//  | cfoption_list COMMA cfoption_elem
//  ;
//
//cfoption_elem  : colLabel EQUAL def_arg
//  | colLabel
//  ;
//
//tsconf_definition  : OPEN_PAREN tsconf_def_list CLOSE_PAREN
//  ;
//
//tsconf_def_list  : tsconf_def_elem
//  | tsconf_def_list COMMA tsconf_def_elem
//  ;
//
//tsconf_def_elem  : PARSER EQUAL any_name
//  | PARSER EQUAL DEFAULT
//  | COPY EQUAL any_name
//  ;
//
//definition  : OPEN_PAREN def_list CLOSE_PAREN
//  ;
//
//def_list  : def_elem
//  | def_list COMMA def_elem
//  ;
//
//def_elem  : colLabel EQUAL def_arg
//  | colLabel
//  ;
//
//def_arg  : func_type
//  | reserved_keyword
//  | qual_all_Op
//  | numericOnly
//  | sconst
//  ;
//
//aggr_args  : OPEN_PAREN type_list CLOSE_PAREN
//  | OPEN_PAREN STAR CLOSE_PAREN
//  | OPEN_PAREN ORDER BY type_list CLOSE_PAREN
//  ;
//
//old_aggr_definition  : OPEN_PAREN old_aggr_list CLOSE_PAREN
//  ;
//
//old_aggr_list  : old_aggr_elem
//  | old_aggr_list COMMA old_aggr_elem
//  ;
//
//old_aggr_elem  : IDENT EQUAL def_arg
//  ;
//
//opt_enum_val_list  : enum_val_list
//  |
//  ;
//
//enum_val_list  : sconst
//  | enum_val_list COMMA sconst
//  ;
//
//alterEnumStmt  : ALTER TYPE_P any_name ADD_P VALUE_P opt_if_not_exists sconst
//  | ALTER TYPE_P any_name ADD_P VALUE_P opt_if_not_exists sconst BEFORE sconst
//  | ALTER TYPE_P any_name ADD_P VALUE_P opt_if_not_exists sconst AFTER sconst
//  | ALTER TYPE_P any_name RENAME VALUE_P sconst TO sconst
//  ;
//
//opt_if_not_exists  : IF_P NOT EXISTS
//  |
//  ;
//
//createOpClassStmt  : CREATE OPERATOR CLASS any_name opt_default FOR TYPE_P typename USING access_method opt_opfamily AS opclass_item_list
//  ;
//
//opclass_item_list  : opclass_item
//  | opclass_item_list COMMA opclass_item
//  ;
//
//opclass_item  : OPERATOR iconst any_operator opclass_purpose opt_recheck
//  | OPERATOR iconst any_operator oper_argtypes opclass_purpose opt_recheck
//  | FUNCTION iconst func_name func_args
//  | FUNCTION iconst OPEN_PAREN type_list CLOSE_PAREN func_name func_args
//  | STORAGE typename
//  ;
//
//opt_default  : DEFAULT
//  |
//  ;
//
//opt_opfamily  : FAMILY any_name
//  |
//  ;
//
//opclass_purpose  : FOR SEARCH
//  | FOR ORDER BY any_name
//  |
//  ;
//
//opt_recheck  : RECHECK
//  |
//  ;
//
//createOpFamilyStmt  : CREATE OPERATOR FAMILY any_name USING access_method
//  ;
//
//alterOpFamilyStmt  : ALTER OPERATOR FAMILY any_name USING access_method ADD_P opclass_item_list
//  | ALTER OPERATOR FAMILY any_name USING access_method DROP opclass_drop_list
//  ;
//
//opclass_drop_list  : opclass_drop
//  | opclass_drop_list COMMA opclass_drop
//  ;
//
//opclass_drop  : OPERATOR iconst OPEN_PAREN type_list CLOSE_PAREN
//  | FUNCTION iconst OPEN_PAREN type_list CLOSE_PAREN
//  ;
//
//dropOpClassStmt  : DROP OPERATOR CLASS any_name USING access_method opt_drop_behavior
//  | DROP OPERATOR CLASS IF_P EXISTS any_name USING access_method opt_drop_behavior
//  ;
//
//dropOpFamilyStmt  : DROP OPERATOR FAMILY any_name USING access_method opt_drop_behavior
//  | DROP OPERATOR FAMILY IF_P EXISTS any_name USING access_method opt_drop_behavior
//  ;
//
//dropOwnedStmt  : DROP OWNED BY name_list opt_drop_behavior
//  ;
//
//reassignOwnedStmt  : REASSIGN OWNED BY name_list TO name
//  ;
//
//dropStmt  : DROP drop_type IF_P EXISTS any_name_list opt_drop_behavior opt_purge
//  | DROP drop_type any_name_list opt_drop_behavior opt_purge
//  | DROP TYPE_P type_name_list opt_drop_behavior
//  | DROP TYPE_P IF_P EXISTS type_name_list opt_drop_behavior
//  | DROP DOMAIN_P type_name_list opt_drop_behavior
//  | DROP DOMAIN_P IF_P EXISTS type_name_list opt_drop_behavior
//  | DROP INDEX CONCURRENTLY any_name_list opt_drop_behavior
//  | DROP INDEX CONCURRENTLY IF_P EXISTS any_name_list opt_drop_behavior
//  ;
//
//opt_purge  : PURGE
//  |
//  ;
//
//drop_type  : TABLE
//  | CONTVIEW
//  | STREAM
//  | SEQUENCE
//  | LARGE_P SEQUENCE
//  | VIEW
//  | MATERIALIZED VIEW
//  | INDEX
//  | FOREIGN TABLE
//  | COLLATION
//  | CONVERSION_P
//  | SCHEMA
//  | nltk_EVENT_TRIGGER
//  | EXTENSION
//  | TEXT_P SEARCH PARSER
//  | TEXT_P SEARCH DICTIONARY
//  | TEXT_P SEARCH TEMPLATE
//  | TEXT_P SEARCH CONFIGURATION
//  | CLIENT MASTER KEY
//  | COLUMN ENCRYPTION KEY
//  | PUBLICATION
//  ;
//
//collate_name  : any_name
//  | BINARY
//  | sconst
//  ;
//
//type_name_list  : typename
//  | type_name_list COMMA typename
//  ;
//
//any_name_list  : any_name
//  | any_name_list COMMA any_name
//  ;
//
//any_name  : colId
//  | colId attrs
//  ;
//
//attrs  : DOT attr_name
//  | attrs DOT attr_name
//  ;
//
//truncateStmt  : TRUNCATE opt_table relation_expr_list opt_restart_seqs opt_drop_behavior opt_purge
//  ;
//
//opt_restart_seqs  : CONTINUE_P IDENTITY_P
//  | RESTART IDENTITY_P
//  |
//  ;
//
//commentStmt  : COMMENT ON comment_type any_name IS comment_text
//  | COMMENT ON AGGREGATE func_name aggr_args IS comment_text
//  | COMMENT ON FUNCTION func_name func_args IS comment_text
//  | COMMENT ON OPERATOR any_operator oper_argtypes IS comment_text
//  | COMMENT ON CONSTRAINT name ON any_name IS comment_text
//  | COMMENT ON CONSTRAINT name ON DOMAIN_P any_name IS comment_text
//  | COMMENT ON RULE name ON any_name IS comment_text
//  | COMMENT ON RULE name IS comment_text
//  | COMMENT ON TRIGGER name ON any_name IS comment_text
//  | COMMENT ON OPERATOR CLASS any_name USING access_method IS comment_text
//  | COMMENT ON OPERATOR FAMILY any_name USING access_method IS comment_text
//  | COMMENT ON LARGE_P OBJECT_P numericOnly IS comment_text
//  | COMMENT ON CAST OPEN_PAREN typename AS typename CLOSE_PAREN IS comment_text
//  | COMMENT ON opt_procedural LANGUAGE any_name IS comment_text
//  | COMMENT ON TEXT_P SEARCH PARSER any_name IS comment_text
//  | COMMENT ON TEXT_P SEARCH DICTIONARY any_name IS comment_text
//  | COMMENT ON TEXT_P SEARCH TEMPLATE any_name IS comment_text
//  | COMMENT ON TEXT_P SEARCH CONFIGURATION any_name IS comment_text
//  ;
//
//comment_type  : COLUMN
//  | DATABASE
//  | SCHEMA
//  | INDEX
//  | SEQUENCE
//  | LARGE_P SEQUENCE
//  | TABLE
//  | DOMAIN_P
//  | TYPE_P
//  | VIEW
//  | MATERIALIZED VIEW
//  | SNAPSHOT
//  | COLLATION
//  | CONVERSION_P
//  | TABLESPACE
//  | nltk_EVENT_TRIGGER
//  | EXTENSION
//  | ROLE
//  | USER
//  | FOREIGN TABLE
//  | SERVER
//  | FOREIGN DATA_P WRAPPER
//  ;
//
//comment_text  : sconst
//  | NULL_P
//  ;
//
//secLabelStmt  : SECURITY LABEL opt_provider ON security_label_type any_name IS security_label
//  | SECURITY LABEL opt_provider ON AGGREGATE func_name aggr_args IS security_label
//  | SECURITY LABEL opt_provider ON FUNCTION func_name func_args IS security_label
//  | SECURITY LABEL opt_provider ON LARGE_P OBJECT_P numericOnly IS security_label
//  | SECURITY LABEL opt_provider ON opt_procedural LANGUAGE any_name IS security_label
//  ;
//
//opt_provider  : FOR colId_or_Sconst
//  |
//  ;
//
//security_label_type  : COLUMN
//  | DATABASE
//  | nltk_EVENT_TRIGGER
//  | FOREIGN TABLE
//  | SCHEMA
//  | SEQUENCE
//  | TABLE
//  | DOMAIN_P
//  | ROLE
//  | USER
//  | TABLESPACE
//  | TYPE_P
//  | VIEW
//  | MATERIALIZED VIEW
//  ;
//
//security_label  : sconst
//  | NULL_P
//  ;
//
//fetchStmt  : FETCH fetch_args
//  | MOVE fetch_args
//  ;
//
//fetch_args  : cursor_name
//  | from_in cursor_name
//  | NEXT opt_from_in cursor_name
//  | PRIOR opt_from_in cursor_name
//  | FIRST_P opt_from_in cursor_name
//  | LAST_P opt_from_in cursor_name
//  | ABSOLUTE_P signedIconst opt_from_in cursor_name
//  | RELATIVE_P signedIconst opt_from_in cursor_name
//  | signedIconst opt_from_in cursor_name
//  | ALL opt_from_in cursor_name
//  | FORWARD opt_from_in cursor_name
//  | FORWARD signedIconst opt_from_in cursor_name
//  | FORWARD ALL opt_from_in cursor_name
//  | BACKWARD opt_from_in cursor_name
//  | BACKWARD signedIconst opt_from_in cursor_name
//  | BACKWARD ALL opt_from_in cursor_name
//  ;
//
//from_in  : FROM
//  | IN_P
//  ;
//
//opt_from_in  : from_in
//  |
//  ;
//
//grantStmt  : GRANT privileges ON privilege_target TO grantee_list opt_grant_grant_option
//  | GRANT ALL privilege_str TO userId
//  ;
//
//revokeStmt  : REVOKE privileges ON privilege_target FROM grantee_list opt_drop_behavior
//  | REVOKE GRANT OPTION FOR privileges ON privilege_target FROM grantee_list opt_drop_behavior
//  | REVOKE ALL privilege_str FROM userId
//  ;
//
//privilege_str  : PRIVILEGES
//  | PRIVILEGE
//  ;
//
//privileges  : privilege_list
//  | ALL
//  | ALL PRIVILEGES
//  | ALL OPEN_PAREN columnList CLOSE_PAREN
//  | ALL PRIVILEGES OPEN_PAREN columnList CLOSE_PAREN
//  ;
//
//privilege_list  : privilege
//  | privilege_list COMMA privilege
//  ;
//
//privilege  : SELECT opt_column_list
//  | REFERENCES opt_column_list
//  | CREATE opt_column_list
//  | colId opt_column_list
//  ;
//
//privilege_target  : qualified_name_list
//  | TABLE qualified_name_list
//  | SEQUENCE qualified_name_list
//  | LARGE_P SEQUENCE qualified_name_list
//  | FOREIGN DATA_P WRAPPER name_list
//  | FOREIGN SERVER name_list
//  | FUNCTION function_with_argtypes_list
//  | PACKAGE any_name_list
//  | PROCEDURE function_with_argtypes_list
//  | DATABASE name_list
//  | DOMAIN_P any_name_list
//  | LANGUAGE name_list
//  | LARGE_P OBJECT_P numericOnly_list
//  | NODE GROUP_P name_list
//  | SCHEMA name_list
//  | TABLESPACE name_list
//  | DIRECTORY name_list
//  | TYPE_P any_name_list
//  | ALL TABLES IN_P SCHEMA name_list
//  | ALL SEQUENCES IN_P SCHEMA name_list
//  | ALL FUNCTIONS IN_P SCHEMA name_list
//  | ALL PACKAGES IN_P SCHEMA name_list
//  | DATA_P SOURCE_P name_list
//  | CLIENT_MASTER_KEY setting_name
//  | COLUMN_ENCRYPTION_KEY setting_name
//  ;
//
//grantee_list  : grantee
//  | grantee_list COMMA grantee
//  ;
//
//grantee  : userId
//  | GROUP_P roleId
//  ;
//
//opt_grant_grant_option  : WITH GRANT OPTION
//  |
//  ;
//
//function_with_argtypes_list  : function_with_argtypes
//  | function_with_argtypes_list COMMA function_with_argtypes
//  ;
//
//function_with_argtypes  : func_name func_args
//  ;
//
//grantRoleStmt  : GRANT privilege_list TO name_list opt_grant_admin_option opt_granted_by
//  ;
//
//revokeRoleStmt  : REVOKE privilege_list FROM name_list opt_granted_by opt_drop_behavior
//  | REVOKE ADMIN OPTION FOR privilege_list FROM name_list opt_granted_by opt_drop_behavior
//  ;
//
//opt_grant_admin_option  : WITH ADMIN OPTION
//  |
//  ;
//
//opt_granted_by  : GRANTED BY userId
//  |
//  ;
//
//grantDbStmt  : GRANT db_privileges TO grantee_list opt_grant_admin_option
//  ;
//
//revokeDbStmt  : REVOKE db_privileges FROM grantee_list
//  | REVOKE ADMIN OPTION FOR db_privileges FROM grantee_list
//  ;
//
//db_privileges  : db_privilege_list
//  ;
//
//db_privilege_list  : db_privilege
//  | db_privilege_list COMMA db_privilege
//  ;
//
//db_privilege  : CREATE ANY TABLE
//  | ALTER ANY TABLE
//  | DROP ANY TABLE
//  | SELECT ANY TABLE
//  | INSERT ANY TABLE
//  | UPDATE ANY TABLE
//  | DELETE_P ANY TABLE
//  | CREATE ANY SEQUENCE
//  | CREATE ANY INDEX
//  | CREATE ANY FUNCTION
//  | EXECUTE ANY FUNCTION
//  | CREATE ANY PACKAGE
//  | EXECUTE ANY PACKAGE
//  | CREATE ANY TYPE_P
//  | ALTER ANY TYPE_P
//  | DROP ANY TYPE_P
//  | ALTER ANY SEQUENCE
//  | DROP ANY SEQUENCE
//  | SELECT ANY SEQUENCE
//  | ALTER ANY INDEX
//  | DROP ANY INDEX
//  | CREATE ANY SYNONYM
//  | DROP ANY SYNONYM
//  | CREATE ANY TRIGGER
//  | ALTER ANY TRIGGER
//  | DROP ANY TRIGGER
//  ;
//
//alterDefaultPrivilegesStmt  : ALTER DEFAULT PRIVILEGES defACLOptionList defACLAction
//  ;
//
//defACLOptionList  : defACLOptionList defACLOption
//  |
//  ;
//
//defACLOption  : IN_P SCHEMA name_list
//  | FOR ROLE name_list
//  | FOR USER name_list
//  ;
//
//defACLAction  : GRANT privileges ON defacl_privilege_target TO grantee_list opt_grant_grant_option
//  | REVOKE privileges ON defacl_privilege_target FROM grantee_list opt_drop_behavior
//  | REVOKE GRANT OPTION FOR privileges ON defacl_privilege_target FROM grantee_list opt_drop_behavior
//  ;
//
//defacl_privilege_target  : TABLES
//  | FUNCTIONS
//  | SEQUENCES
//  | TYPES_P
//  | CLIENT_MASTER_KEYS
//  | COLUMN_ENCRYPTION_KEYS
//  | PACKAGES
//  ;
//
//indexStmt  : CREATE opt_unique INDEX opt_concurrently opt_index_name ON qualified_name access_method_clause OPEN_PAREN index_params CLOSE_PAREN opt_include opt_reloptions optPartitionElement opt_table_index_options where_clause
//  | CREATE opt_unique INDEX opt_concurrently opt_index_name ON qualified_name access_method_clause OPEN_PAREN index_params CLOSE_PAREN LOCAL opt_partition_index_def opt_include opt_reloptions optTableSpace opt_table_index_options
//  | CREATE opt_unique INDEX opt_concurrently opt_index_name ON qualified_name access_method_clause OPEN_PAREN index_params CLOSE_PAREN GLOBAL opt_include opt_reloptions optTableSpace opt_table_index_options
//  | CREATE opt_unique INDEX opt_concurrently IF_P NOT EXISTS opt_index_name ON qualified_name access_method_clause OPEN_PAREN index_params CLOSE_PAREN opt_include opt_reloptions optPartitionElement opt_index_options where_clause
//  | CREATE opt_unique INDEX opt_concurrently IF_P NOT EXISTS opt_index_name ON qualified_name access_method_clause OPEN_PAREN index_params CLOSE_PAREN LOCAL opt_partition_index_def opt_include opt_reloptions optTableSpace opt_index_options
//  | CREATE opt_unique INDEX opt_concurrently IF_P NOT EXISTS opt_index_name ON qualified_name access_method_clause OPEN_PAREN index_params CLOSE_PAREN GLOBAL opt_include opt_reloptions optTableSpace opt_index_options
//  ;
//
//opt_unique  : UNIQUE
//  |
//  ;
//
//opt_concurrently  : CONCURRENTLY
//  |
//  ;
//
//opt_index_name  : index_name
//  | colId indirection
//  |
//  ;
//
//key_usage_list  : index_name
//  | key_usage_list COMMA index_name
//  ;
//
//index_hint_definition  : nltk_USE_INDEX OPEN_PAREN key_usage_list CLOSE_PAREN
//  | nltk_USE_INDEX OPEN_PAREN CLOSE_PAREN
//  | nltk_FORCE_INDEX OPEN_PAREN key_usage_list CLOSE_PAREN
//  ;
//
//index_hint_list  : index_hint_definition
//  | index_hint_list index_hint_definition
//  ;
//
//opt_index_hint_list  : index_hint_list
//  |
//  ;
//
//access_method_clause  : USING access_method
//  |
//  ;
//
//access_method_clause_without_keyword  : USING IDENT
//  |
//  ;
//
//index_params  : index_elem
//  | index_params COMMA index_elem
//  ;
//
//index_elem  : colId opt_collation opt_class opt_asc_desc opt_nulls_order
//  | index_functional_expr_key opt_collation opt_class opt_asc_desc opt_nulls_order
//  | OPEN_PAREN a_expr CLOSE_PAREN opt_collation opt_class opt_asc_desc opt_nulls_order
//  ;
//
//constraint_params  : constraint_elem
//  | constraint_params COMMA constraint_elem
//  ;
//
//con_asc_desc  : ASC
//  | DESC
//  ;
//
//constraint_elem  : colId con_asc_desc
//  | colId
//  | OPEN_PAREN a_expr CLOSE_PAREN opt_asc_desc
//  ;
//
//index_functional_expr_key  : col_name_keyword_nonambiguous OPEN_PAREN iconst CLOSE_PAREN
//  | func_name OPEN_PAREN func_arg_list opt_sort_clause CLOSE_PAREN
//  | func_application_special
//  | func_expr_common_subexpr
//  ;
//
//opt_include  : INCLUDE OPEN_PAREN index_including_params CLOSE_PAREN
//  |
//  ;
//
//index_including_params  : index_elem
//  | index_including_params COMMA index_elem
//  ;
//
//collate  : COLLATE opt_equal charset_collate_name
//  ;
//
//opt_collate  : collate
//  |
//  ;
//
//default_collate  : collate
//  | DEFAULT collate
//  ;
//
//opt_collation  : COLLATE collate_name
//  |
//  ;
//
//opt_class  : any_name
//  | USING any_name
//  |
//  ;
//
//opt_asc_desc  : ASC
//  | DESC
//  |
//  ;
//
//opt_nulls_order  : nltk_NULLS_FIRST
//  | nltk_NULLS_LAST
//  |
//  ;
//
//opt_partition_index_def  : OPEN_PAREN range_partition_index_list CLOSE_PAREN
//  |
//  ;
//
//range_partition_index_list  : range_partition_index_item
//  | range_partition_index_list COMMA range_partition_index_item
//  ;
//
//range_partition_index_item  : PARTITION index_name opt_part_options
//  | PARTITION index_name opt_part_options opt_subpartition_index_def
//  ;
//
//opt_subpartition_index_def  : OPEN_PAREN range_subpartition_index_list CLOSE_PAREN
//  ;
//
//range_subpartition_index_list  : range_subpartition_index_item
//  | range_subpartition_index_list COMMA range_subpartition_index_item
//  ;
//
//range_subpartition_index_item  : SUBPARTITION index_name opt_part_options
//  ;
//
//createFunctionStmt  : CREATE opt_or_replace definer_user FUNCTION func_name_opt_arg proc_args RETURNS func_return createfunc_opt_list opt_definition
//  | CREATE opt_or_replace definer_user FUNCTION func_name_opt_arg proc_args RETURNS TABLE OPEN_PAREN table_func_column_list CLOSE_PAREN createfunc_opt_list opt_definition
//  | CREATE opt_or_replace definer_user FUNCTION func_name_opt_arg proc_args createfunc_opt_list opt_definition
//  | CREATE opt_or_replace definer_user FUNCTION func_name_opt_arg proc_args RETURN func_return opt_createproc_opt_list as_is subprogram_body
//  ;
//
//callFuncStmt  : CALL func_name OPEN_PAREN CLOSE_PAREN
//  | CALL func_name OPEN_PAREN callfunc_args CLOSE_PAREN
//  ;
//
//callfunc_args  : func_arg_expr
//  | callfunc_args COMMA func_arg_expr
//  ;
//
//createEventStmt  : CREATE opt_or_replace definer_opt EVENT qualified_name ON SCHEDULE start_expr opt_ev_on_completion opt_ev_status comment_opt DO ev_body
//  | CREATE opt_or_replace definer_opt EVENT IF_P NOT EXISTS qualified_name ON SCHEDULE start_expr opt_ev_on_completion opt_ev_status comment_opt DO ev_body
//  | CREATE opt_or_replace definer_opt EVENT qualified_name ON SCHEDULE EVERY every_interval start_expr end_expr opt_ev_on_completion opt_ev_status comment_opt DO ev_body
//  | CREATE opt_or_replace definer_opt EVENT IF_P NOT EXISTS qualified_name ON SCHEDULE EVERY every_interval start_expr end_expr opt_ev_on_completion opt_ev_status comment_opt DO ev_body
//  ;
//
//definer_opt  : DEFINER EQUAL user
//  |
//  ;
//
//user  : colId
//  ;
//
//every_interval  : iconst opt_interval
//  | sconst opt_interval
//  | FCONST opt_interval
//  ;
//
//start_expr  : STARTS ev_timeexpr
//  | AT_P ev_timeexpr
//  |
//  ;
//
//end_expr  : ENDS ev_timeexpr
//  |
//  ;
//
//ev_timeexpr  : initime
//  | initime PLUS interval_list
//  | initime MINUS interval_list
//  ;
//
//interval_list  : interval_cell
//  | interval_list PLUS interval_list
//  | interval_list MINUS interval_list
//  ;
//
//interval_cell  : constInterval ICONST opt_interval
//  | constInterval sconst opt_interval
//  | constInterval FCONST opt_interval
//  |
//  ;
//
//initime  : interval_intexpr
//  | functime_expr
//  | functime_app
//  ;
//
//functime_app  : IDENT OPEN_PAREN CLOSE_PAREN
//  | IDENT OPEN_PAREN func_arg_list CLOSE_PAREN
//  ;
//
//functime_expr  : CURRENT_TIMESTAMP
//  | CURRENT_TIMESTAMP OPEN_PAREN iconst CLOSE_PAREN
//  | LOCALTIMESTAMP
//  | LOCALTIMESTAMP OPEN_PAREN iconst CLOSE_PAREN
//  | SYSDATE
//  ;
//
//interval_intexpr  : sconst
//  ;
//
//opt_ev_on_completion  : ON COMPLETION PRESERVE
//  | ON COMPLETION NOT PRESERVE
//  |
//  ;
//
//opt_ev_status  : ENABLE_P
//  | DISABLE_P
//  | DISABLE_P ON SLAVE
//  |
//  ;
//
//comment_opt  : COMMENT SCONST
//  |
//  ;
//
//ev_body  :
//  ;
//
//alterEventStmt  : ALTER definer_name_opt EVENT qualified_name preserve_opt rename_opt status_opt comments_opt action_opt
//  | ALTER definer_name_opt EVENT qualified_name ON SCHEDULE AT_P ev_timeexpr preserve_opt rename_opt status_opt comments_opt action_opt
//  | ALTER definer_name_opt EVENT qualified_name ON SCHEDULE EVERY every_interval start_opt end_opt preserve_opt rename_opt status_opt comments_opt action_opt
//  ;
//
//definer_name_opt  : DEFINER EQUAL user
//  |
//  ;
//
//end_opt  : ENDS ev_timeexpr
//  |
//  ;
//
//start_opt  : STARTS ev_timeexpr
//  |
//  ;
//
//preserve_opt  : ON COMPLETION PRESERVE
//  | ON COMPLETION NOT PRESERVE
//  |
//  ;
//
//rename_opt  : RENAME TO qualified_name
//  |
//  ;
//
//status_opt  : ENABLE_P
//  | DISABLE_P
//  | DISABLE_P ON SLAVE
//  |
//  ;
//
//comments_opt  : COMMENT sconst
//  |
//  ;
//
//action_opt  : DO ev_body
//  |
//  ;
//
//dropEventStmt  : DROP EVENT IF_P EXISTS qualified_name
//  | DROP EVENT qualified_name
//  ;
//
//showEventStmt  : SHOW EVENTS event_from_clause event_where_clause
//  | SHOW EVENTS event_from_clause
//  | SHOW EVENTS event_where_clause
//  ;
//
//event_from_clause  : FROM colId
//  | IN_P colId
//  ;
//
//event_where_clause  : WHERE ev_where_body
//  | LIKE sconst
//  ;
//
//ev_where_body  :
//  ;
//
//createProcedureStmt  : CREATE opt_or_replace definer_user PROCEDURE func_name_opt_arg proc_args opt_createproc_opt_list as_is subprogram_body
//  ;
//
//createPackageStmt  : CREATE opt_or_replace PACKAGE pkg_name invoker_rights as_is
//  ;
//
//pkg_name  : colId
//  | colId indirection
//  ;
//
//invoker_rights  : AUTHID DEFINER
//  | AUTHID CURRENT_USER
//  |
//  ;
//
//definer_expression  : DEFINER EQUAL userId
//  ;
//
//definer_user  : definer_expression
//  |
//  ;
//
//pkg_body_subprogram  :
//  ;
//
//createPackageBodyStmt  : CREATE opt_or_replace PACKAGE BODY_P pkg_name as_is pkg_body_subprogram
//  ;
//
//opt_or_replace  : OR REPLACE
//  |
//  ;
//
//func_args  : OPEN_PAREN func_args_list CLOSE_PAREN
//  | OPEN_PAREN CLOSE_PAREN
//  ;
//
//proc_args  : func_args_with_defaults
//  |
//  ;
//
//func_args_list  : func_arg
//  | func_args_list COMMA func_arg
//  ;
//
//as_is  : AS
//  | IS
//  ;
//
//as_empty  : AS
//  |
//  ;
//
//func_args_with_defaults  : OPEN_PAREN func_args_with_defaults_list CLOSE_PAREN
//  | OPEN_PAREN CLOSE_PAREN
//  ;
//
//func_args_with_defaults_list  : func_arg_with_default
//  | func_args_with_defaults_list COMMA func_arg_with_default
//  ;
//
//func_arg  : arg_class param_name func_type
//  | param_name arg_class func_type
//  | param_name func_type
//  | arg_class func_type
//  | func_type
//  ;
//
//arg_class  : IN_P
//  | OUT_P
//  | INOUT
//  | IN_P OUT_P
//  | VARIADIC
//  ;
//
//param_name  : type_function_name
//  ;
//
//func_return  : func_type
//  | func_type DETERMINISTIC
//  ;
//
//func_type  : typename
//  | type_function_name attrs PERCENT ROWTYPE_P opt_array_bounds
//  | type_function_name PERCENT ROWTYPE_P opt_array_bounds
//  | type_function_name attrs PERCENT TYPE_P opt_array_bounds
//  | type_function_name PERCENT TYPE_P opt_array_bounds
//  | SETOF type_function_name attrs PERCENT TYPE_P opt_array_bounds
//  ;
//
//func_arg_with_default  : func_arg
//  | func_arg DEFAULT a_expr
//  | func_arg EQUAL a_expr
//  | func_arg Colon_equals a_expr
//  ;
//
//createfunc_opt_list  : createfunc_opt_item
//  | createfunc_opt_list createfunc_opt_item
//  ;
//
//opt_createproc_opt_list  : opt_createproc_opt_list createproc_opt_item
//  |
//  ;
//
//common_func_opt_item  : CALLED ON NULL_P INPUT_P
//  | RETURNS NULL_P ON NULL_P INPUT_P
//  | STRICT_P
//  | IMMUTABLE
//  | STABLE
//  | VOLATILE
//  | SHIPPABLE
//  | NOT SHIPPABLE
//  | EXTERNAL SECURITY DEFINER
//  | EXTERNAL SECURITY INVOKER
//  | SECURITY DEFINER
//  | SECURITY INVOKER
//  | AUTHID DEFINER
//  | AUTHID CURRENT_USER
//  | LEAKPROOF
//  | NOT LEAKPROOF
//  | COST numericOnly
//  | ROWS numericOnly
//  | functionSetResetClause
//  | FENCED
//  | NOT FENCED
//  | PACKAGE
//  | COMMENT sconst
//  ;
//
//createfunc_opt_item  : AS func_as
//  | LANGUAGE colId_or_Sconst
//  | WINDOW
//  | common_func_opt_item
//  ;
//
//createproc_opt_item  : common_func_opt_item
//  ;
//
//func_as  : sconst
//  | sconst COMMA sconst
//  ;
//
//subprogram_body  :
//  ;
//
//opt_definition  : WITH definition
//  |
//  ;
//
//table_func_column  : param_name func_type
//  ;
//
//table_func_column_list  : table_func_column
//  | table_func_column_list COMMA table_func_column
//  ;
//
//removePackageStmt  : DROP PACKAGE pkg_name
//  | DROP PACKAGE IF_P EXISTS pkg_name
//  | DROP PACKAGE BODY_P pkg_name
//  | DROP PACKAGE BODY_P IF_P EXISTS pkg_name
//  ;
//
//alterFunctionStmt  : ALTER FUNCTION function_with_argtypes alterfunc_opt_list opt_restrict
//  ;
//
//alterProcedureStmt  : ALTER PROCEDURE function_with_argtypes alterfunc_opt_list opt_restrict
//  ;
//
//alterfunc_opt_list  : common_func_opt_item
//  | alterfunc_opt_list common_func_opt_item
//  ;
//
//opt_restrict  : RESTRICT
//  |
//  ;
//
//removeFuncStmt  : DROP FUNCTION func_name func_args opt_drop_behavior
//  | DROP FUNCTION IF_P EXISTS func_name func_args opt_drop_behavior
//  | DROP PROCEDURE func_name func_args opt_drop_behavior
//  | DROP PROCEDURE IF_P EXISTS func_name func_args opt_drop_behavior
//  | DROP PROCEDURE func_name_opt_arg
//  | DROP PROCEDURE IF_P EXISTS func_name_opt_arg
//  | DROP FUNCTION func_name_opt_arg
//  | DROP FUNCTION IF_P EXISTS func_name_opt_arg
//  ;
//
//removeAggrStmt  : DROP AGGREGATE func_name aggr_args opt_drop_behavior
//  | DROP AGGREGATE IF_P EXISTS func_name aggr_args opt_drop_behavior
//  ;
//
//removeOperStmt  : DROP OPERATOR any_operator oper_argtypes opt_drop_behavior
//  | DROP OPERATOR IF_P EXISTS any_operator oper_argtypes opt_drop_behavior
//  ;
//
//oper_argtypes  : OPEN_PAREN typename CLOSE_PAREN
//  | OPEN_PAREN typename COMMA typename CLOSE_PAREN
//  | OPEN_PAREN NONE COMMA typename CLOSE_PAREN
//  | OPEN_PAREN typename COMMA NONE CLOSE_PAREN
//  ;
//
//any_operator  : all_Op
//  | colId DOT any_operator
//  ;
//
//doStmt  : DO dostmt_opt_list
//  ;
//
//dostmt_opt_list  : dostmt_opt_item
//  | dostmt_opt_list dostmt_opt_item
//  ;
//
//dostmt_opt_item  : sconst
//  | LANGUAGE colId_or_Sconst
//  ;
//
//anonyBlockStmt  : DECLARE subprogram_body
//  | BEGIN_P subprogram_body
//  ;
//
//createCastStmt  : CREATE CAST OPEN_PAREN typename AS typename CLOSE_PAREN WITH FUNCTION function_with_argtypes cast_context
//  | CREATE CAST OPEN_PAREN typename AS typename CLOSE_PAREN WITHOUT FUNCTION cast_context
//  | CREATE CAST OPEN_PAREN typename AS typename CLOSE_PAREN WITH INOUT cast_context
//  ;
//
//cast_context  : AS IMPLICIT_P
//  | AS ASSIGNMENT
//  |
//  ;
//
//dropCastStmt  : DROP CAST opt_if_exists OPEN_PAREN typename AS typename CLOSE_PAREN opt_drop_behavior
//  ;
//
//opt_if_exists  : IF_P EXISTS
//  |
//  ;
//
//reindexStmt  : REINDEX reindex_type opt_concurrently qualified_name opt_force
//  | REINDEX reindex_type opt_concurrently qualified_name PARTITION colId opt_force
//  | REINDEX SYSTEM_P opt_concurrently name opt_force
//  | REINDEX DATABASE opt_concurrently name opt_force
//  ;
//
//reindex_type  : INDEX
//  | TABLE
//  | INTERNAL TABLE
//  ;
//
//opt_force  : FORCE
//  |
//  ;
//
//renameStmt  : ALTER AGGREGATE func_name aggr_args RENAME TO name
//  | ALTER COLLATION any_name RENAME TO name
//  | ALTER CONVERSION_P any_name RENAME TO name
//  | ALTER DATABASE database_name RENAME TO database_name
//  | ALTER DATA_P SOURCE_P name RENAME TO name
//  | ALTER DOMAIN_P any_name RENAME TO name
//  | ALTER DOMAIN_P any_name RENAME CONSTRAINT name TO name
//  | ALTER nltk_EVENT_TRIGGER name RENAME TO name
//  | ALTER nltk_EVENT_TRIGGER name OWNER TO roleId
//  | ALTER FOREIGN DATA_P WRAPPER name RENAME TO name
//  | ALTER FUNCTION function_with_argtypes RENAME TO name
//  | ALTER PROCEDURE function_with_argtypes RENAME TO name
//  | ALTER GROUP_P roleId RENAME TO roleId
//  | ALTER opt_procedural LANGUAGE name RENAME TO name
//  | ALTER OPERATOR CLASS any_name USING access_method RENAME TO name
//  | ALTER OPERATOR FAMILY any_name USING access_method RENAME TO name
//  | ALTER PUBLICATION name RENAME TO name
//  | ALTER SUBSCRIPTION name RENAME TO name
//  | ALTER rowLevelSecurityPolicyName ON qualified_name RENAME TO name
//  | ALTER SCHEMA name RENAME TO name
//  | ALTER SERVER name RENAME TO name
//  | ALTER MATERIALIZED VIEW qualified_name RENAME opt_column name TO name
//  | ALTER MATERIALIZED VIEW IF_P EXISTS qualified_name RENAME opt_column name TO name
//  | ALTER TABLE relation_expr RENAME TO name
//  | ALTER TABLE IF_P EXISTS relation_expr RENAME TO name
//  | ALTER SEQUENCE qualified_name RENAME TO name
//  | ALTER LARGE_P SEQUENCE qualified_name RENAME TO name
//  | ALTER SEQUENCE IF_P EXISTS qualified_name RENAME TO name
//  | ALTER LARGE_P SEQUENCE IF_P EXISTS qualified_name RENAME TO name
//  | ALTER VIEW qualified_name RENAME TO name
//  | ALTER VIEW IF_P EXISTS qualified_name RENAME TO name
//  | ALTER VIEW qualified_name opt_column_list AS selectStmt opt_check_option
//  | ALTER definer_expression VIEW qualified_name opt_column_list AS selectStmt opt_check_option
//  | ALTER MATERIALIZED VIEW qualified_name RENAME TO name
//  | ALTER MATERIALIZED VIEW IF_P EXISTS qualified_name RENAME TO name
//  | ALTER INDEX qualified_name nltk_RENAME_PARTITION RENAME TO name
//  | ALTER INDEX IF_P EXISTS qualified_name nltk_RENAME_PARTITION RENAME TO name
//  | ALTER INDEX qualified_name name TO name
//  | ALTER INDEX IF_P EXISTS qualified_name name TO name
//  | ALTER FOREIGN TABLE relation_expr RENAME TO name
//  | ALTER FOREIGN TABLE IF_P EXISTS relation_expr RENAME TO name
//  | ALTER TABLE relation_expr RENAME opt_column name TO name
//  | ALTER TABLE IF_P EXISTS relation_expr RENAME opt_column name TO name
//  | ALTER TABLE relation_expr RENAME CONSTRAINT name TO name
//  | ALTER TABLE IF_P EXISTS relation_expr RENAME CONSTRAINT name TO name
//  | ALTER TABLE relation_expr nltk_RENAME_PARTITION name TO name
//  | ALTER TABLE IF_P EXISTS relation_expr nltk_RENAME_PARTITION name TO name
//  | ALTER TABLE relation_expr nltk_RENAME_PARTITION FOR OPEN_PAREN maxValueList CLOSE_PAREN TO name
//  | ALTER TABLE IF_P EXISTS relation_expr nltk_RENAME_PARTITION FOR OPEN_PAREN maxValueList CLOSE_PAREN TO name
//  | ALTER FOREIGN TABLE relation_expr RENAME opt_column name TO name
//  | ALTER FOREIGN TABLE IF_P EXISTS relation_expr RENAME opt_column name TO name
//  | ALTER TRIGGER name ON qualified_name RENAME TO name
//  | ALTER ROLE roleId RENAME TO roleId
//  | ALTER USER userId RENAME TO userId
//  | ALTER TABLESPACE name RENAME TO name
//  | ALTER TABLESPACE name SET reloptions
//  | ALTER TABLESPACE name RESET reloptions
//  | ALTER TABLESPACE name RESIZE MAXSIZE size_clause
//  | ALTER TEXT_P SEARCH PARSER any_name RENAME TO name
//  | ALTER TEXT_P SEARCH DICTIONARY any_name RENAME TO name
//  | ALTER TEXT_P SEARCH TEMPLATE any_name RENAME TO name
//  | ALTER TEXT_P SEARCH CONFIGURATION any_name RENAME TO name
//  | ALTER TYPE_P any_name RENAME TO name
//  | ALTER TYPE_P any_name RENAME ATTRIBUTE name TO name opt_drop_behavior
//  | RENAME TABLE rename_clause_list
//  ;
//
//rename_clause_list  : rename_clause
//  | rename_clause_list COMMA rename_clause
//  ;
//
//rename_clause  : qualified_name TO qualified_name
//  ;
//
//opt_column  : COLUMN
//  |
//  ;
//
//opt_set_data  : SET DATA_P
//  |
//  ;
//
//alterObjectSchemaStmt  : ALTER AGGREGATE func_name aggr_args SET SCHEMA name
//  | ALTER COLLATION any_name SET SCHEMA name
//  | ALTER CONVERSION_P any_name SET SCHEMA name
//  | ALTER DOMAIN_P any_name SET SCHEMA name
//  | ALTER EXTENSION any_name SET SCHEMA name
//  | ALTER FUNCTION function_with_argtypes SET SCHEMA name
//  | ALTER PROCEDURE function_with_argtypes SET SCHEMA name
//  | ALTER OPERATOR any_operator oper_argtypes SET SCHEMA name
//  | ALTER OPERATOR CLASS any_name USING access_method SET SCHEMA name
//  | ALTER OPERATOR FAMILY any_name USING access_method SET SCHEMA name
//  | ALTER TABLE relation_expr SET SCHEMA name
//  | ALTER TABLE IF_P EXISTS relation_expr SET SCHEMA name
//  | ALTER TEXT_P SEARCH PARSER any_name SET SCHEMA name
//  | ALTER TEXT_P SEARCH DICTIONARY any_name SET SCHEMA name
//  | ALTER TEXT_P SEARCH TEMPLATE any_name SET SCHEMA name
//  | ALTER TEXT_P SEARCH CONFIGURATION any_name SET SCHEMA name
//  | ALTER SEQUENCE qualified_name SET SCHEMA name
//  | ALTER LARGE_P SEQUENCE qualified_name SET SCHEMA name
//  | ALTER SEQUENCE IF_P EXISTS qualified_name SET SCHEMA name
//  | ALTER LARGE_P SEQUENCE IF_P EXISTS qualified_name SET SCHEMA name
//  | ALTER VIEW qualified_name SET SCHEMA name
//  | ALTER VIEW IF_P EXISTS qualified_name SET SCHEMA name
//  | ALTER MATERIALIZED VIEW qualified_name SET SCHEMA name
//  | ALTER MATERIALIZED VIEW IF_P EXISTS qualified_name SET SCHEMA name
//  | ALTER FOREIGN TABLE relation_expr SET SCHEMA name
//  | ALTER FOREIGN TABLE IF_P EXISTS relation_expr SET SCHEMA name
//  | ALTER TYPE_P any_name SET SCHEMA name
//  ;
//
//alterOwnerStmt  : ALTER AGGREGATE func_name aggr_args OWNER TO roleId
//  | ALTER COLLATION any_name OWNER TO roleId
//  | ALTER CONVERSION_P any_name OWNER TO roleId
//  | ALTER DATABASE database_name OWNER TO roleId
//  | ALTER DIRECTORY name OWNER TO roleId
//  | ALTER DOMAIN_P any_name OWNER TO roleId
//  | ALTER FUNCTION function_with_argtypes OWNER TO roleId
//  | ALTER PROCEDURE function_with_argtypes OWNER TO roleId
//  | ALTER PACKAGE pkg_name OWNER TO roleId
//  | ALTER opt_procedural LANGUAGE name OWNER TO roleId
//  | ALTER LARGE_P OBJECT_P numericOnly OWNER TO roleId
//  | ALTER OPERATOR any_operator oper_argtypes OWNER TO roleId
//  | ALTER OPERATOR CLASS any_name USING access_method OWNER TO roleId
//  | ALTER OPERATOR FAMILY any_name USING access_method OWNER TO roleId
//  | ALTER SCHEMA name OWNER TO roleId
//  | ALTER TYPE_P any_name OWNER TO typeOwner
//  | ALTER TABLESPACE name OWNER TO roleId
//  | ALTER TEXT_P SEARCH DICTIONARY any_name OWNER TO roleId
//  | ALTER TEXT_P SEARCH CONFIGURATION any_name OWNER TO roleId
//  | ALTER FOREIGN DATA_P WRAPPER name OWNER TO roleId
//  | ALTER SERVER name OWNER TO roleId
//  | ALTER DATA_P SOURCE_P name OWNER TO roleId
//  | ALTER SYNONYM any_name OWNER TO roleId
//  | ALTER PUBLICATION name OWNER TO roleId
//  | ALTER SUBSCRIPTION name OWNER TO roleId
//  ;
//
//createPublicationStmt  : CREATE PUBLICATION name opt_publication_for_tables opt_definition
//  ;
//
//opt_publication_for_tables  : publication_for_tables
//  |
//  ;
//
//publication_for_tables  : FOR TABLE relation_expr_list
//  | FOR ALL TABLES
//  ;
//
//alterPublicationStmt  : ALTER PUBLICATION name SET definition
//  | ALTER PUBLICATION name ADD_P TABLE relation_expr_list
//  | ALTER PUBLICATION name SET TABLE relation_expr_list
//  | ALTER PUBLICATION name DROP TABLE relation_expr_list
//  ;
//
//createSubscriptionStmt  : CREATE SUBSCRIPTION name CONNECTION sconst PUBLICATION publication_name_list opt_definition
//  ;
//
//publication_name_list  : publication_name_item
//  | publication_name_list COMMA publication_name_item
//  ;
//
//publication_name_item  : colLabel
//  ;
//
//alterSubscriptionStmt  : ALTER SUBSCRIPTION name SET definition
//  | ALTER SUBSCRIPTION name CONNECTION sconst
//  | ALTER SUBSCRIPTION name SET PUBLICATION publication_name_list
//  | ALTER SUBSCRIPTION name REFRESH PUBLICATION opt_definition
//  | ALTER SUBSCRIPTION name ENABLE_P
//  ;
//
//dropSubscriptionStmt  : DROP SUBSCRIPTION name opt_drop_behavior
//  | DROP SUBSCRIPTION IF_P EXISTS name opt_drop_behavior
//  ;
//
//typeOwner  : roleId
//  | CURRENT_USER
//  | SESSION_USER
//  ;
//
//ruleStmt  : CREATE opt_or_replace RULE name AS ON event TO qualified_name where_clause DO opt_instead ruleActionList
//  ;
//
//ruleActionList  : NOTHING
//  | ruleActionStmt
//  | OPEN_PAREN ruleActionMulti CLOSE_PAREN
//  ;
//
//ruleActionMulti  : ruleActionMulti SEMI ruleActionStmtOrEmpty
//  | ruleActionStmtOrEmpty
//  ;
//
//ruleActionStmt  : selectStmt
//  | insertStmt
//  | updateStmt
//  | deleteStmt
//  | copyStmt
//  | notifyStmt
//  | alterTableStmt
//  ;
//
//ruleActionStmtOrEmpty  : ruleActionStmt
//  |
//  ;
//
//event  : SELECT
//  | UPDATE
//  | DELETE_P
//  | INSERT
//  | COPY
//  | ALTER
//  ;
//
//opt_instead  : INSTEAD
//  | ALSO
//  |
//  ;
//
//dropRuleStmt  : DROP RULE name ON any_name opt_drop_behavior
//  | DROP RULE IF_P EXISTS name ON any_name opt_drop_behavior
//  ;
//
//notifyStmt  : NOTIFY colId notify_payload
//  ;
//
//notify_payload  : COMMA sconst
//  |
//  ;
//
//listenStmt  : LISTEN colId
//  ;
//
//unlistenStmt  : UNLISTEN colId
//  | UNLISTEN STAR
//  ;
//
//transactionStmt  : ABORT_P opt_transaction
//  | START TRANSACTION transaction_mode_list_or_empty
//  | BEGIN_NON_ANOYBLOCK opt_transaction transaction_mode_list_or_empty
//  | COMMIT opt_transaction
//  | END_P opt_transaction
//  | ROLLBACK opt_transaction
//  | SAVEPOINT colId
//  | RELEASE SAVEPOINT colId
//  | RELEASE colId
//  | ROLLBACK opt_transaction TO SAVEPOINT colId
//  | ROLLBACK opt_transaction TO colId
//  | PREPARE TRANSACTION sconst
//  | COMMIT PREPARED sconst
//  | COMMIT PREPARED sconst WITH sconst
//  | ROLLBACK PREPARED sconst
//  ;
//
//opt_transaction  : WORK
//  | TRANSACTION
//  |
//  ;
//
//transaction_mode_item  : ISOLATION LEVEL iso_level
//  | READ ONLY
//  | READ WRITE
//  | DEFERRABLE
//  | NOT DEFERRABLE
//  ;
//
//transaction_mode_list  : transaction_mode_item
//  | transaction_mode_list COMMA transaction_mode_item
//  | transaction_mode_list transaction_mode_item
//  ;
//
//transaction_mode_list_or_empty  : transaction_mode_list
//  |
//  ;
//
//createContQueryStmt  : CREATE CONTVIEW qualified_name opt_reloptions AS selectStmt
//  | CREATE OR REPLACE CONTVIEW qualified_name opt_reloptions AS selectStmt
//  ;
//
//viewStmt  : CREATE optTemp VIEW qualified_name opt_column_list opt_reloptions AS selectStmt opt_check_option
//  | CREATE OR REPLACE optTemp VIEW qualified_name opt_column_list opt_reloptions AS selectStmt opt_check_option
//  | CREATE opt_or_replace definer_expression optTemp VIEW qualified_name opt_column_list opt_reloptions AS selectStmt opt_check_option
//  ;
//
//opt_check_option  : WITH CHECK OPTION
//  | WITH CASCADED CHECK OPTION
//  | WITH LOCAL CHECK OPTION
//  |
//  ;
//
//loadStmt  : LOAD file_name
//  | LOAD opt_load_data opt_load_data_options_list load_type_set qualified_name load_oper_table_type load_table_options_list
//  | OPTIONS OPEN_PAREN load_options_list CLOSE_PAREN LOAD opt_load_data opt_load_data_options_list load_type_set qualified_name load_oper_table_type load_table_options_list
//  ;
//
//load_options_list  : load_options_item
//  | load_options_list COMMA load_options_item
//  |
//  ;
//
//load_options_item  : ERRORS EQUAL numericOnly
//  | SKIP_P EQUAL numericOnly
//  | DATA_P EQUAL load_quote_str
//  ;
//
//opt_load_data  : DATA_P
//  |
//  ;
//
//opt_load_data_options_list  : opt_load_data_options_list opt_load_data_options_item
//  |
//  ;
//
//opt_load_data_options_item  : INFILE load_quote_str
//  | CHARACTERSET load_quote_str
//  ;
//
//load_oper_table_type  : TRUNCATE
//  | APPEND
//  | REPLACE
//  | INSERT
//  |
//  ;
//
//load_type_set  : load_oper_table_type INTO TABLE
//  ;
//
//load_table_options_list  : load_table_options_list load_table_options_item
//  |
//  ;
//
//load_table_options_item  : TRAILING NULLCOLS
//  | FIELDS CSV
//  | FIELDS TERMINATED load_quote_str
//  | FIELDS TERMINATED BY load_quote_str
//  | OPTIONALLY ENCLOSED BY load_quote_str
//  | load_when_option
//  | OPEN_PAREN load_column_expr_list CLOSE_PAREN
//  ;
//
//load_column_expr_list  : load_column_expr_item
//  | load_column_expr_list COMMA load_column_expr_item
//  ;
//
//load_column_expr_item  : colId CONSTANT load_quote_str
//  | colId load_col_sequence
//  | colId FILLER load_col_data_type
//  | colId load_col_scalar_spec
//  ;
//
//load_col_sequence_item_sart  : iconst
//  | FCONST
//  | MAXVALUE
//  | ROWS
//  ;
//
//load_col_sequence  : SEQUENCE OPEN_PAREN load_col_sequence_item_sart column_sequence_item_step CLOSE_PAREN
//  ;
//
//load_col_scalar_spec  : load_col_position_spec load_col_data_type load_col_nullif_spec load_col_sql_str
//  ;
//
//load_col_position_spec  : POSITION OPEN_PAREN iconst MINUS iconst CLOSE_PAREN
//  |
//  ;
//
//load_col_nullif_spec  : NULLIF OPEN_PAREN colId EQUAL BLANKS CLOSE_PAREN
//  |
//  ;
//
//load_col_data_type  : numeric
//  | numeric EXTERNAL
//  | character
//  | constDatetime
//  | constSet
//  |
//  ;
//
//load_col_sql_str  : IDENT
//  |
//  ;
//
//load_when_option  : WHEN load_when_option_list
//  ;
//
//load_when_option_list  : load_when_option_item
//  | load_when_option_list AND load_when_option_item
//  ;
//
//load_when_option_item  : OPEN_PAREN iconst MINUS iconst CLOSE_PAREN masking_policy_condition_operator load_quote_str
//  | OPEN_PAREN iconst CLOSE_PAREN masking_policy_condition_operator load_quote_str
//  | colId masking_policy_condition_operator load_quote_str
//  ;
//
//load_quote_str  : IDENT
//  | sconst
//  ;
//
//createdbStmt  : CREATE DATABASE database_name opt_with createdb_opt_list
//  | CREATE DATABASE IF_P NOT EXISTS database_name opt_with createdb_opt_list
//  ;
//
//createdb_opt_list  : createdb_opt_list createdb_opt_item
//  |
//  ;
//
//createdb_opt_item  : TABLESPACE opt_equal name
//  | TABLESPACE opt_equal DEFAULT
//  | LOCATION opt_equal sconst
//  | LOCATION opt_equal DEFAULT
//  | TEMPLATE opt_equal name
//  | TEMPLATE opt_equal DEFAULT
//  | ENCODING opt_equal sconst
//  | ENCODING opt_equal iconst
//  | ENCODING opt_equal DEFAULT
//  | LC_COLLATE_P opt_equal sconst
//  | LC_COLLATE_P opt_equal DEFAULT
//  | DBCOMPATIBILITY_P opt_equal sconst
//  | DBCOMPATIBILITY_P opt_equal DEFAULT
//  | LC_CTYPE_P opt_equal sconst
//  | LC_CTYPE_P opt_equal DEFAULT
//  | CONNECTION LIMIT opt_equal signedIconst
//  | OWNER opt_equal name
//  | OWNER opt_equal DEFAULT
//  ;
//
//opt_equal  : EQUAL
//  |
//  ;
//
//alterDatabaseStmt  : ALTER DATABASE database_name opt_with alterdb_opt_list
//  | ALTER DATABASE database_name SET TABLESPACE name
//  ;
//
//alterDatabaseSetStmt  : ALTER DATABASE database_name setResetClause
//  ;
//
//alterdb_opt_list  : alterdb_opt_list alterdb_opt_item
//  |
//  ;
//
//alterdb_opt_item  : CONNECTION LIMIT opt_equal signedIconst
//  | ENABLE_P PRIVATE OBJECT_P
//  | DISABLE_P PRIVATE OBJECT_P
//  ;
//
//dropdbStmt  : DROP DATABASE database_name
//  | DROP DATABASE IF_P EXISTS database_name
//  ;
//
//createDomainStmt  : CREATE DOMAIN_P any_name opt_as typename colQualList
//  ;
//
//alterDomainStmt  : ALTER DOMAIN_P any_name alter_column_default
//  | ALTER DOMAIN_P any_name DROP NOT NULL_P
//  | ALTER DOMAIN_P any_name SET NOT NULL_P
//  | ALTER DOMAIN_P any_name ADD_P tableConstraint
//  | ALTER DOMAIN_P any_name DROP CONSTRAINT name opt_drop_behavior
//  | ALTER DOMAIN_P any_name DROP CONSTRAINT IF_P EXISTS name opt_drop_behavior
//  | ALTER DOMAIN_P any_name VALIDATE CONSTRAINT name
//  ;
//
//opt_as  : AS
//  |
//  ;
//
//alterTSDictionaryStmt  : ALTER TEXT_P SEARCH DICTIONARY any_name definition
//  ;
//
//alterTSConfigurationStmt  : ALTER TEXT_P SEARCH CONFIGURATION any_name ADD_P MAPPING FOR name_list WITH any_name_list
//  | ALTER TEXT_P SEARCH CONFIGURATION any_name ALTER MAPPING FOR name_list WITH any_name_list
//  | ALTER TEXT_P SEARCH CONFIGURATION any_name ALTER MAPPING REPLACE any_name WITH any_name
//  | ALTER TEXT_P SEARCH CONFIGURATION any_name ALTER MAPPING FOR name_list REPLACE any_name WITH any_name
//  | ALTER TEXT_P SEARCH CONFIGURATION any_name DROP MAPPING FOR name_list
//  | ALTER TEXT_P SEARCH CONFIGURATION any_name DROP MAPPING IF_P EXISTS FOR name_list
//  | ALTER TEXT_P SEARCH CONFIGURATION any_name SET cfoptions
//  | ALTER TEXT_P SEARCH CONFIGURATION any_name RESET cfoptions
//  ;
//
//createConversionStmt  : CREATE opt_default CONVERSION_P any_name FOR sconst TO sconst FROM any_name
//  ;
//
//clusterStmt  : CLUSTER opt_verbose qualified_name cluster_index_specification
//  | CLUSTER opt_verbose qualified_name PARTITION OPEN_PAREN name CLOSE_PAREN cluster_index_specification
//  | CLUSTER opt_verbose
//  | CLUSTER opt_verbose index_name ON qualified_name
//  ;
//
//cluster_index_specification  : USING index_name
//  |
//  ;
//
//vacuumStmt  : VACUUM opt_deltamerge
//  | VACUUM opt_deltamerge qualified_name
//  | VACUUM opt_hdfsdirectory
//  | VACUUM opt_hdfsdirectory qualified_name
//  | VACUUM opt_full opt_freeze opt_verbose opt_compact
//  | VACUUM opt_full opt_freeze opt_verbose opt_compact qualified_name
//  | VACUUM opt_full opt_freeze opt_verbose opt_compact qualified_name PARTITION OPEN_PAREN name CLOSE_PAREN
//  | VACUUM opt_full opt_freeze opt_verbose opt_compact qualified_name SUBPARTITION OPEN_PAREN name CLOSE_PAREN
//  | VACUUM opt_full opt_freeze opt_verbose opt_compact analyzeStmt
//  | VACUUM OPEN_PAREN vacuum_option_list CLOSE_PAREN
//  | VACUUM OPEN_PAREN vacuum_option_list CLOSE_PAREN qualified_name opt_name_list
//  | VACUUM OPEN_PAREN vacuum_option_list CLOSE_PAREN qualified_name opt_name_list PARTITION OPEN_PAREN name CLOSE_PAREN
//  | VACUUM OPEN_PAREN vacuum_option_list CLOSE_PAREN qualified_name opt_name_list SUBPARTITION OPEN_PAREN name CLOSE_PAREN
//  ;
//
//vacuum_option_list  : vacuum_option_elem
//  | vacuum_option_list COMMA vacuum_option_elem
//  ;
//
//vacuum_option_elem  : analyze_keyword
//  | VERBOSE
//  | FREEZE
//  | FULL
//  ;
//
//analyzeStmt  : analyze_keyword opt_verbose
//  | analyze_keyword opt_verbose qualified_name opt_analyze_column_define
//  | analyze_keyword opt_verbose qualified_name opt_name_list PARTITION OPEN_PAREN name CLOSE_PAREN
//  | analyze_keyword opt_verbose FOREIGN TABLES
//  ;
//
//verifyStmt  : analyze_keyword opt_verify opt_verify_options
//  | analyze_keyword opt_verify opt_verify_options qualified_name opt_cascade
//  | analyze_keyword opt_verify opt_verify_options qualified_name PARTITION OPEN_PAREN name CLOSE_PAREN opt_cascade
//  ;
//
//analyze_keyword  : ANALYZE
//  | ANALYSE
//  ;
//
//opt_verify_options  : FAST
//  | COMPLETE
//  ;
//
//opt_verbose  : VERBOSE
//  |
//  ;
//
//opt_full  : FULL
//  |
//  ;
//
//opt_compact  : COMPACT
//  |
//  ;
//
//opt_hdfsdirectory  : HDFSDIRECTORY
//  ;
//
//opt_freeze  : FREEZE
//  |
//  ;
//
//opt_deltamerge  : DELTAMERGE
//  ;
//
//opt_verify  : VERIFY
//  ;
//
//opt_cascade  : CASCADE
//  |
//  ;
//
//opt_name_list  : OPEN_PAREN name_list CLOSE_PAREN
//  |
//  ;
//
//opt_analyze_column_define  : OPEN_PAREN opt_multi_name_list CLOSE_PAREN
//  | OPEN_PAREN name_list CLOSE_PAREN
//  |
//  ;
//
//opt_multi_name_list  : OPEN_PAREN name_list CLOSE_PAREN
//  ;
//
//barrierStmt  : CREATE BARRIER opt_barrier_id
//  ;
//
//opt_barrier_id  : sconst
//  |
//  ;
//
//createNodeStmt  : CREATE NODE pgxcnode_name optWith
//  ;
//
//pgxcnode_name  : colId
//  ;
//
//pgxcgroup_name  : colId
//  ;
//
//pgxcnodes  : OPEN_PAREN pgxcnode_list CLOSE_PAREN
//  ;
//
//pgxcnode_list  : pgxcnode_list COMMA pgxcnode_name
//  | pgxcnode_name
//  ;
//
//bucket_maps  : BUCKETS OPEN_PAREN bucket_list CLOSE_PAREN
//  |
//  ;
//
//bucket_list  : bucket_list COMMA iconst
//  | iconst
//  ;
//
//bucket_cnt  : BUCKETCNT iconst
//  |
//  ;
//
//pgxcgroup_parent  : GROUPPARENT pgxcnode_name
//  |
//  ;
//
//opt_vcgroup  : VCGROUP
//  |
//  ;
//
//opt_to_elastic_group  : TO ELASTIC GROUP_P
//  |
//  ;
//
//opt_redistributed  : DISTRIBUTE FROM colId
//  |
//  ;
//
//opt_set_vcgroup  : SET VCGROUP
//  | SET NOT VCGROUP
//  |
//  ;
//
//alterNodeStmt  : ALTER NODE pgxcnode_name optWith
//  ;
//
//alterCoordinatorStmt  : ALTER COORDINATOR pgxcnode_name SET opt_boolean_or_string WITH pgxcnodes
//  ;
//
//dropNodeStmt  : DROP NODE pgxcnode_name opt_pgxcnodes
//  | DROP NODE IF_P EXISTS pgxcnode_name opt_pgxcnodes
//  ;
//
//opt_pgxcnodes  : WITH pgxcnodes
//  |
//  ;
//
//createNodeGroupStmt  : CREATE NODE GROUP_P pgxcgroup_name opt_pgxcnodes bucket_maps opt_vcgroup opt_redistributed bucket_cnt pgxcgroup_parent
//  ;
//
//alterNodeGroupStmt  : ALTER NODE GROUP_P pgxcgroup_name SET DEFAULT
//  | ALTER NODE GROUP_P pgxcgroup_name opt_set_vcgroup RENAME TO pgxcgroup_name
//  | ALTER NODE GROUP_P pgxcgroup_name SET NOT VCGROUP
//  | ALTER NODE GROUP_P pgxcgroup_name SET TABLE GROUP_P pgxcgroup_name
//  | ALTER NODE GROUP_P pgxcgroup_name COPY BUCKETS FROM pgxcgroup_name
//  | ALTER NODE GROUP_P pgxcgroup_name ADD_P NODE pgxcnodes
//  | ALTER NODE GROUP_P pgxcgroup_name DELETE_P NODE pgxcnodes
//  | ALTER NODE GROUP_P pgxcgroup_name RESIZE TO pgxcgroup_name
//  | ALTER NODE GROUP_P pgxcgroup_name opt_set_vcgroup WITH GROUP_P pgxcgroup_name
//  | ALTER NODE GROUP_P pgxcgroup_name SET SEQUENCE TO ALL NODE
//  | ALTER NODE GROUP_P pgxcgroup_name SET SEQUENCE TO LOCAL
//  ;
//
//dropNodeGroupStmt  : DROP NODE GROUP_P pgxcgroup_name opt_redistributed opt_to_elastic_group
//  ;
//
//createAuditPolicyStmt  : CREATE AUDIT POLICY policy_name PRIVILEGES policy_privileges_list policy_filter_opt policy_status_opt
//  | CREATE AUDIT POLICY IF_P NOT EXISTS policy_name PRIVILEGES policy_privileges_list policy_filter_opt policy_status_opt
//  | CREATE AUDIT POLICY policy_name ACCESS policy_access_list policy_filter_opt policy_status_opt
//  | CREATE AUDIT POLICY IF_P NOT EXISTS policy_name ACCESS policy_access_list policy_filter_opt policy_status_opt
//  ;
//
//policy_privileges_list  : policy_privilege_elem
//  | policy_privileges_list COMMA policy_privilege_elem
//  ;
//
//policy_privilege_elem  : policy_privilege_type policy_target_elem_opt
//  ;
//
//policy_privilege_type  : ALL
//  | ALTER
//  | ANALYZE
//  | COMMENT
//  | CREATE
//  | DROP
//  | GRANT
//  | REVOKE
//  | SET
//  | SHOW
//  | LOGIN_ANY
//  | LOGIN_FAILURE
//  | LOGIN_SUCCESS
//  | LOGOUT
//  ;
//
//policy_access_list  : policy_access_elem
//  | policy_access_list COMMA policy_access_elem
//  ;
//
//policy_access_elem  : policy_access_type policy_target_elem_opt
//  ;
//
//policy_access_type  : ALL
//  | COPY
//  | DEALLOCATE
//  | DELETE_P
//  | EXECUTE
//  | INSERT
//  | PREPARE
//  | REINDEX
//  | SELECT
//  | TRUNCATE
//  | UPDATE
//  ;
//
//policy_target_elem_opt  : ON policy_target_type OPEN_PAREN policy_targets_list CLOSE_PAREN
//  |
//  ;
//
//policy_targets_list  : policy_target_name
//  | policy_targets_list COMMA policy_target_name
//  ;
//
//policy_target_type  : LABEL
//  ;
//
//policy_target_name  : qualified_name
//  ;
//
//policy_filter_opt  : FILTER ON policy_filter_value
//  |
//  ;
//
//policy_filter_value  : filter_expr
//  | filter_set
//  ;
//
//filter_set  : filter_paren
//  | OPEN_PAREN filter_expr_list CLOSE_PAREN
//  | filter_expr_list
//  ;
//
//filter_expr_list  : filter_expr COMMA filter_expr
//  | filter_expr_list COMMA filter_expr
//  ;
//
//filter_paren  : OPEN_PAREN filter_expr CLOSE_PAREN
//  ;
//
//policy_filters_list  : policy_filter_name
//  | policy_filters_list COMMA policy_filter_name
//  ;
//
//policy_filter_type  : IP
//  | APP
//  | ROLES
//  ;
//
//policy_filter_name  : colId_or_Sconst
//  ;
//
//policy_name  : colLabel
//  ;
//
//policy_status_opt  : ENABLE_P
//  | DISABLE_P
//  |
//  ;
//
//alterAuditPolicyStmt  : ALTER AUDIT POLICY policy_name policy_comments_alter_clause
//  | ALTER AUDIT POLICY IF_P EXISTS policy_name policy_comments_alter_clause
//  | ALTER AUDIT POLICY policy_name alter_policy_action_clause alter_policy_privileges_list
//  | ALTER AUDIT POLICY IF_P EXISTS policy_name alter_policy_action_clause alter_policy_privileges_list
//  | ALTER AUDIT POLICY policy_name alter_policy_action_clause alter_policy_access_list
//  | ALTER AUDIT POLICY IF_P EXISTS policy_name alter_policy_action_clause alter_policy_access_list
//  | ALTER AUDIT POLICY policy_name MODIFY_P OPEN_PAREN alter_policy_filter_list CLOSE_PAREN
//  | ALTER AUDIT POLICY IF_P EXISTS policy_name MODIFY_P OPEN_PAREN alter_policy_filter_list CLOSE_PAREN
//  | ALTER AUDIT POLICY policy_name DROP FILTER
//  | ALTER AUDIT POLICY IF_P EXISTS policy_name DROP FILTER
//  | ALTER AUDIT POLICY policy_name policy_status_alter_clause
//  | ALTER AUDIT POLICY IF_P EXISTS policy_name policy_status_alter_clause
//  ;
//
//alter_policy_access_list  : ACCESS OPEN_PAREN policy_access_list CLOSE_PAREN
//  ;
//
//alter_policy_privileges_list  : PRIVILEGES OPEN_PAREN policy_privileges_list CLOSE_PAREN
//  ;
//
//alter_policy_filter_list  : FILTER ON policy_filter_value
//  ;
//
//alter_policy_action_clause  : ADD_P
//  | REMOVE
//  ;
//
//policy_status_alter_clause  : ENABLE_P
//  | DISABLE_P
//  ;
//
//policy_comments_alter_clause  : COMMENTS sconst
//  ;
//
//dropAuditPolicyStmt  : DROP AUDIT POLICY policy_names_list
//  | DROP AUDIT POLICY IF_P EXISTS policy_names_list
//  ;
//
//policy_names_list  : policy_name
//  | policy_names_list COMMA policy_name
//  ;
//
//createMaskingPolicyStmt  : CREATE MASKING POLICY policy_name masking_clause policy_condition_opt policy_filter_opt policy_status_opt
//  ;
//
//masking_clause  : masking_clause_elem
//  | masking_clause COMMA masking_clause_elem
//  ;
//
//masking_clause_elem  : masking_func masking_func_params_opt ON masking_target
//  | masking_func_nsp DOT masking_func masking_func_params_opt ON masking_target
//  ;
//
//masking_func_nsp  : colLabel
//  ;
//
//masking_func  : colLabel
//  ;
//
//masking_func_params_opt  : OPEN_PAREN masking_func_params_list CLOSE_PAREN
//  |
//  ;
//
//masking_func_params_list  : masking_func_param
//  | masking_func_params_list COMMA masking_func_param
//  ;
//
//masking_func_param  : iconst
//  | FCONST
//  | sconst
//  | colLabel
//  ;
//
//masking_target  : masking_policy_target_type OPEN_PAREN policy_targets_list CLOSE_PAREN
//  ;
//
//masking_policy_target_type  : LABEL
//  ;
//
//alter_policy_condition  : CONDITION OPEN_PAREN policy_label_item masking_policy_condition_operator masking_policy_condition_value CLOSE_PAREN
//  ;
//
//policy_condition_opt  : CONDITION OPEN_PAREN policy_label_item masking_policy_condition_operator masking_policy_condition_value CLOSE_PAREN
//  |
//  ;
//
//masking_policy_condition_operator  : CmpOp
//  | LT
//  | GT
//  | EQUAL
//  | AT
//  ;
//
//masking_policy_condition_value  : opt_boolean_or_string
//  | numericOnly
//  | CURRENT_USER
//  ;
//
//pp_filter_expr  : filter_expr
//  | filter_paren
//  ;
//
//filter_expr  : filter_term
//  | pp_filter_expr OR pp_filter_term
//  ;
//
//pp_filter_term  : filter_term
//  | filter_paren
//  ;
//
//filter_term  : policy_filter_elem
//  | pp_filter_term AND pp_policy_filter_elem
//  ;
//
//pp_policy_filter_elem  : policy_filter_elem
//  | filter_paren
//  ;
//
//policy_filter_elem  : policy_filter_type OPEN_PAREN policy_filters_list CLOSE_PAREN
//  | policy_filter_type NOT OPEN_PAREN policy_filters_list CLOSE_PAREN
//  ;
//
//alterMaskingPolicyStmt  : ALTER MASKING POLICY policy_name policy_comments_alter_clause
//  | ALTER MASKING POLICY policy_name alter_masking_policy_action_clause alter_masking_policy_func_items_list
//  | ALTER MASKING POLICY policy_name MODIFY_P OPEN_PAREN alter_policy_filter_list CLOSE_PAREN
//  | ALTER MASKING POLICY policy_name DROP FILTER
//  | ALTER MASKING POLICY policy_name MODIFY_P OPEN_PAREN alter_policy_condition CLOSE_PAREN
//  | ALTER MASKING POLICY policy_name DROP CONDITION
//  | ALTER MASKING POLICY policy_name policy_status_alter_clause
//  ;
//
//alter_masking_policy_action_clause  : MODIFY_P
//  | alter_policy_action_clause
//  ;
//
//alter_masking_policy_func_items_list  : alter_masking_policy_func_item
//  | alter_masking_policy_func_items_list COMMA alter_masking_policy_func_item
//  ;
//
//alter_masking_policy_func_item  : masking_clause_elem
//  ;
//
//dropMaskingPolicyStmt  : DROP MASKING POLICY policy_names_list
//  | DROP MASKING POLICY IF_P EXISTS policy_names_list
//  ;
//
//createPolicyLabelStmt  : CREATE RESOURCE LABEL policy_label_name opt_add_resources_to_label
//  | CREATE RESOURCE LABEL IF_P NOT EXISTS policy_label_name opt_add_resources_to_label
//  ;
//
//policy_label_name  : colLabel
//  ;
//
//opt_add_resources_to_label  : ADD_P resources_to_label_list
//  |
//  ;
//
//resources_to_label_list  : resources_to_label_list_item
//  | resources_to_label_list COMMA resources_to_label_list_item
//  ;
//
//resources_to_label_list_item  : policy_label_resource_type OPEN_PAREN policy_label_items CLOSE_PAREN
//  | policy_label_resource_type OPEN_PAREN policy_label_any_resource_item CLOSE_PAREN
//  ;
//
//policy_label_resource_type  : TABLE
//  | COLUMN
//  | SCHEMA
//  | VIEW
//  | FUNCTION
//  ;
//
//policy_label_any_resource_item  : policy_label_any_resource
//  ;
//
//policy_label_any_resource  : ALL
//  ;
//
//policy_label_items  : policy_label_item
//  | policy_label_items COMMA policy_label_item
//  ;
//
//filters_to_label_list  : filters_to_label_list_item
//  | filters_to_label_list COMMA filters_to_label_list_item
//  ;
//
//filters_to_label_list_item  : policy_label_filter_type OPEN_PAREN policy_label_items CLOSE_PAREN
//  ;
//
//policy_label_filter_type  : IP
//  | APP
//  | ROLES
//  ;
//
//policy_label_item  : qualified_name
//  ;
//
//alterPolicyLabelStmt  : ALTER RESOURCE LABEL policy_label_name ADD_P resources_or_filters_to_label_list
//  | ALTER RESOURCE LABEL policy_label_name REMOVE resources_or_filters_to_label_list
//  ;
//
//resources_or_filters_to_label_list  : resources_to_label_list
//  | filters_to_label_list
//  ;
//
//dropPolicyLabelStmt  : DROP RESOURCE LABEL policy_labels_list
//  | DROP RESOURCE LABEL IF_P EXISTS policy_labels_list
//  ;
//
//policy_labels_list  : policy_label_name
//  | policy_labels_list COMMA policy_label_name
//  ;
//
//createResourcePoolStmt  : CREATE RESOURCE POOL resource_pool_name optWith
//  ;
//
//alterResourcePoolStmt  : ALTER RESOURCE POOL resource_pool_name optWith
//  ;
//
//alterGlobalConfigStmt  : ALTER GLOBAL CONFIGURATION optWith
//  ;
//
//dropResourcePoolStmt  : DROP RESOURCE POOL resource_pool_name
//  | DROP RESOURCE POOL IF_P EXISTS resource_pool_name
//  ;
//
//resource_pool_name  : colId
//  ;
//
//dropGlobalConfigStmt  : DROP GLOBAL CONFIGURATION name_list
//  ;
//
//createWorkloadGroupStmt  : CREATE WORKLOAD GROUP_P workload_group_name USING RESOURCE POOL resource_pool_name optWith
//  | CREATE WORKLOAD GROUP_P workload_group_name optWith
//  ;
//
//alterWorkloadGroupStmt  : ALTER WORKLOAD GROUP_P workload_group_name USING RESOURCE POOL resource_pool_name optWith
//  | ALTER WORKLOAD GROUP_P workload_group_name optWith
//  ;
//
//dropWorkloadGroupStmt  : DROP WORKLOAD GROUP_P workload_group_name
//  | DROP WORKLOAD GROUP_P IF_P EXISTS workload_group_name
//  ;
//
//workload_group_name  : colId
//  ;
//
//createAppWorkloadGroupMappingStmt  : CREATE APP WORKLOAD GROUP_P MAPPING application_name optWith
//  ;
//
//alterAppWorkloadGroupMappingStmt  : ALTER APP WORKLOAD GROUP_P MAPPING application_name optWith
//  ;
//
//dropAppWorkloadGroupMappingStmt  : DROP APP WORKLOAD GROUP_P MAPPING application_name
//  | DROP APP WORKLOAD GROUP_P MAPPING IF_P EXISTS application_name
//  ;
//
//application_name  : colId
//  ;
//
//explainStmt  : EXPLAIN explainableStmt
//  | EXPLAIN PERFORMANCE explainableStmt
//  | EXPLAIN analyze_keyword opt_verbose explainableStmt
//  | EXPLAIN VERBOSE explainableStmt
//  | EXPLAIN OPEN_PAREN explain_option_list CLOSE_PAREN explainableStmt
//  | EXPLAIN PLAN SET STATEMENT_ID EQUAL sconst FOR explainableStmt
//  | EXPLAIN PLAN FOR explainableStmt
//  ;
//
//explainableStmt  : selectStmt
//  | insertStmt
//  | updateStmt
//  | deleteStmt
//  | mergeStmt
//  | declareCursorStmt
//  | createAsStmt
//  | createModelStmt
//  | snapshotStmt
//  | executeStmt
//  ;
//
//explain_option_list  : explain_option_elem
//  | explain_option_list COMMA explain_option_elem
//  ;
//
//explain_option_elem  : explain_option_name explain_option_arg
//  ;
//
//explain_option_name  : colId
//  | analyze_keyword
//  | VERBOSE
//  ;
//
//explain_option_arg  : opt_boolean_or_string
//  | numericOnly
//  |
//  ;
//
//execDirectStmt  : EXECUTE DIRECT ON pgxcnodes directStmt
//  | EXECUTE DIRECT ON COORDINATORS directStmt
//  | EXECUTE DIRECT ON DATANODES directStmt
//  | EXECUTE DIRECT ON ALL directStmt
//  ;
//
//directStmt  : sconst
//  ;
//
//cleanConnStmt  : CLEAN CONNECTION TO COORDINATOR pgxcnodes cleanConnDbName cleanConnUserName
//  | CLEAN CONNECTION TO NODE pgxcnodes cleanConnDbName cleanConnUserName
//  | CLEAN CONNECTION TO ALL opt_check opt_force cleanConnDbName cleanConnUserName
//  ;
//
//cleanConnDbName  : FOR DATABASE database_name
//  | FOR database_name
//  |
//  ;
//
//cleanConnUserName  : TO USER roleId
//  | TO roleId
//  |
//  ;
//
//opt_check  : CHECK
//  |
//  ;
//
//prepareStmt  : PREPARE name prep_type_clause AS preparableStmt
//  ;
//
//prep_type_clause  : OPEN_PAREN type_list CLOSE_PAREN
//  |
//  ;
//
//preparableStmt  : selectStmt
//  | insertStmt
//  | updateStmt
//  | deleteStmt
//  | mergeStmt
//  | uservar_name
//  ;
//
//executeStmt  : EXECUTE name execute_param_clause
//  | CREATE optTemp TABLE create_as_target AS EXECUTE name execute_param_clause opt_with_data
//  ;
//
//execute_param_clause  : OPEN_PAREN expr_list CLOSE_PAREN
//  |
//  ;
//
//deallocateStmt  : DEALLOCATE name
//  | DEALLOCATE PREPARE name
//  | DEALLOCATE ALL
//  | DEALLOCATE PREPARE ALL
//  ;
//
//insert_partition_clause  : update_delete_partition_clause
//  |
//  ;
//
//update_delete_partition_clause  : PARTITION OPEN_PAREN name CLOSE_PAREN
//  | SUBPARTITION OPEN_PAREN name CLOSE_PAREN
//  | nltk_PARTITION_FOR OPEN_PAREN expr_list CLOSE_PAREN
//  | nltk_SUBPARTITION_FOR OPEN_PAREN expr_list CLOSE_PAREN
//  ;
//
//insertStmt  : opt_with_clause INSERT hint_string INTO insert_target insert_rest returning_clause
//  | REPLACE hint_string INTO insert_target insert_rest returning_clause
//  | REPLACE hint_string INTO insert_target SET set_clause_list
//  | opt_with_clause INSERT hint_string INTO insert_target insert_rest upsert_clause returning_clause
//  ;
//
//insert_target  : qualified_name insert_partition_clause
//  | qualified_name insert_partition_clause AS colId
//  ;
//
//insert_rest  : selectStmt
//  | OPEN_PAREN insert_column_list CLOSE_PAREN selectStmt
//  | DEFAULT VALUES
//  ;
//
//insert_column_list  : insert_column_item
//  | insert_column_list COMMA insert_column_item
//  ;
//
//insert_column_item  : colId opt_indirection
//  ;
//
//returning_clause  : RETURNING target_list
//  |
//  ;
//
//upsert_clause  : ON DUPLICATE KEY UPDATE set_clause_list where_clause
//  | ON DUPLICATE KEY UPDATE NOTHING
//  ;
//
//deleteStmt  : opt_with_clause DELETE_P hint_string FROM relation_expr_opt_alias_list using_clause where_or_current_clause opt_sort_clause opt_delete_limit returning_clause
//  | opt_with_clause DELETE_P hint_string relation_expr_opt_alias_list using_clause where_or_current_clause opt_sort_clause opt_delete_limit returning_clause
//  | opt_with_clause DELETE_P hint_string relation_expr_opt_alias_list FROM from_list where_or_current_clause
//  ;
//
//using_clause  : USING from_list
//  |
//  ;
//
//lockStmt  : LOCK_P opt_table relation_expr_list opt_lock opt_nowait opt_cancelable
//  ;
//
//opt_lock  : IN_P lock_type MODE
//  |
//  ;
//
//lock_type  : ACCESS SHARE
//  | ROW SHARE
//  | ROW EXCLUSIVE
//  | SHARE UPDATE EXCLUSIVE
//  | SHARE
//  | SHARE ROW EXCLUSIVE
//  | EXCLUSIVE
//  | ACCESS EXCLUSIVE
//  ;
//
//opt_nowait  : NOWAIT
//  |
//  ;
//
//opt_cancelable  : CANCELABLE
//  |
//  ;
//
//opt_wait  : WAIT iconst
//  ;
//
//opt_nowait_or_skip  : NOWAIT
//  | SKIP_P LOCKED
//  |
//  ;
//
//updateStmt  : opt_with_clause UPDATE hint_string from_list SET set_clause_list from_clause where_or_current_clause opt_sort_clause opt_delete_limit returning_clause
//  ;
//
//set_clause_list  : set_clause
//  | set_clause_list COMMA set_clause
//  ;
//
//set_clause  : single_set_clause
//  | multiple_set_clause
//  ;
//
//single_set_clause  : set_target EQUAL ctext_expr
//  | set_target EQUAL VALUES OPEN_PAREN columnref CLOSE_PAREN
//  ;
//
//multiple_set_clause  : OPEN_PAREN set_target_list CLOSE_PAREN EQUAL ctext_row
//  | OPEN_PAREN set_target_list CLOSE_PAREN EQUAL OPEN_PAREN SELECT hint_string opt_distinct target_list from_clause where_clause group_clause having_clause CLOSE_PAREN
//  ;
//
//set_target  : colId opt_indirection
//  ;
//
//set_target_list  : set_target
//  | set_target_list COMMA set_target
//  ;
//
//mergeStmt  : MERGE hint_string INTO relation_expr_opt_alias USING table_ref ON a_expr merge_when_list
//  ;
//
//merge_when_list  : merge_when_clause
//  | merge_when_list merge_when_clause
//  ;
//
//merge_when_clause  : WHEN MATCHED THEN merge_update opt_merge_where_condition
//  | WHEN NOT MATCHED THEN merge_insert opt_merge_where_condition
//  ;
//
//opt_merge_where_condition  : WHERE a_expr
//  |
//  ;
//
//merge_update  : UPDATE SET set_clause_list
//  ;
//
//merge_insert  : INSERT merge_values_clause
//  | INSERT OPEN_PAREN insert_column_list CLOSE_PAREN merge_values_clause
//  | INSERT DEFAULT VALUES
//  ;
//
//merge_values_clause  : VALUES ctext_row
//  ;
//
//declareCursorStmt  : CURSOR cursor_name cursor_options opt_hold FOR selectStmt
//  | nltk_DECLARE_CURSOR cursor_name cursor_options CURSOR opt_hold FOR selectStmt
//  ;
//
//cursor_name  : name
//  ;
//
//cursor_options  :
//  | cursor_options NO SCROLL
//  | cursor_options SCROLL
//  | cursor_options BINARY
//  | cursor_options INSENSITIVE
//  ;
//
//opt_hold  :
//  | WITH HOLD
//  | WITHOUT HOLD
//  ;
//
//selectStmt  : select_no_parens
//  | select_with_parens
//  ;
//
//select_with_parens  : OPEN_PAREN select_no_parens CLOSE_PAREN
//  | OPEN_PAREN select_with_parens CLOSE_PAREN
//  ;
//
//select_no_parens  : simple_select
//  | select_clause siblings_clause opt_select_limit
//  | select_clause siblings_clause sort_clause opt_select_limit
//  | select_clause sort_clause
//  | select_clause opt_sort_clause for_locking_clause opt_select_limit opt_into_clause
//  | select_clause opt_sort_clause select_limit opt_for_locking_clause
//  | select_clause opt_sort_clause select_limit for_locking_clause into_clause
//  | select_clause opt_sort_clause opt_select_limit into_clause opt_for_locking_clause
//  | with_clause select_clause
//  | with_clause select_clause sort_clause
//  | with_clause select_clause siblings_clause
//  | with_clause select_clause siblings_clause sort_clause
//  | with_clause select_clause opt_sort_clause for_locking_clause opt_select_limit opt_into_clause
//  | with_clause select_clause opt_sort_clause select_limit for_locking_clause into_clause
//  | with_clause select_clause opt_sort_clause opt_select_limit into_clause opt_for_locking_clause
//  | with_clause select_clause opt_sort_clause select_limit opt_for_locking_clause
//  ;
//
//select_clause  : simple_select
//  | select_with_parens
//  ;
//
//simple_select  : SELECT hint_string opt_distinct target_list opt_into_clause from_clause where_clause start_with_clause group_clause having_clause window_clause
//  | values_clause
//  | TABLE relation_expr
//  | select_clause UNION opt_all select_clause
//  | select_clause INTERSECT opt_all select_clause
//  | select_clause EXCEPT opt_all select_clause
//  | select_clause MINUS_P opt_all select_clause
//  ;
//
//hint_string  : COMMENTSTRING
//  |
//  ;
//
//with_clause  : WITH cte_list
//  | WITH RECURSIVE cte_list
//  ;
//
//cte_list  : common_table_expr
//  | cte_list COMMA common_table_expr
//  ;
//
//common_table_expr  : name opt_name_list AS opt_materialized OPEN_PAREN preparableStmt CLOSE_PAREN
//  ;
//
//opt_materialized  : MATERIALIZED
//  | NOT MATERIALIZED
//  |
//  ;
//
//opt_with_clause  : with_clause
//  |
//  ;
//
//opt_into_clause  : into_clause
//  |
//  ;
//
//into_clause  : INTO optTempTableName
//  | INTO into_user_var_list
//  | INTO OUTFILE sconst characterset_option fields_options_fin lines_options_fin
//  | INTO DUMPFILE sconst
//  ;
//
//characterset_option  : CHARACTER SET sconst
//  |
//  ;
//
//fields_options_fin  : FIELDS fields_options_list
//  |
//  ;
//
//fields_options_list  : fields_options_list fields_options_item
//  |
//  ;
//
//fields_options_item  : TERMINATED BY sconst
//  | OPTIONALLY ENCLOSED BY sconst
//  | ENCLOSED BY sconst
//  | ESCAPED BY sconst
//  ;
//
//lines_options_fin  : LINES lines_options_list
//  |
//  ;
//
//lines_options_list  : lines_options_list lines_option_item
//  |
//  ;
//
//lines_option_item  : STARTING BY sconst
//  | TERMINATED BY sconst
//  ;
//
//into_user_var_list  : uservar_name
//  | into_user_var_list COMMA uservar_name
//  ;
//
//optTempTableName  : TEMPORARY opt_table qualified_name
//  | TEMP opt_table qualified_name
//  | LOCAL TEMPORARY opt_table qualified_name
//  | LOCAL TEMP opt_table qualified_name
//  | GLOBAL TEMPORARY opt_table qualified_name
//  | GLOBAL TEMP opt_table qualified_name
//  | UNLOGGED opt_table qualified_name
//  | TABLE qualified_name
//  | qualified_name
//  ;
//
//opt_table  : TABLE
//  |
//  ;
//
//opt_all  : ALL
//  | DISTINCT
//  |
//  ;
//
//opt_distinct  : DISTINCT
//  | DISTINCT ON OPEN_PAREN expr_list CLOSE_PAREN
//  | ALL
//  |
//  ;
//
//opt_sort_clause  : sort_clause
//  |
//  ;
//
//sort_clause  : ORDER BY sortby_list
//  ;
//
//siblings_clause  : ORDER SIBLINGS BY sortby_list
//  ;
//
//sortby_list  : sortby
//  | sortby_list COMMA sortby
//  ;
//
//sortby  : a_expr USING qual_all_Op opt_nulls_order
//  | a_expr opt_asc_desc opt_nulls_order
//  ;
//
//select_limit  : limit_clause offset_clause
//  | offset_clause limit_clause
//  | limit_clause
//  | limit_offcnt_clause
//  | offset_clause
//  ;
//
//opt_select_limit  : select_limit
//  |
//  ;
//
//opt_delete_limit  : LIMIT a_expr
//  |
//  ;
//
//limit_clause  : LIMIT select_limit_value
//  | FETCH first_or_next opt_select_fetch_first_value row_or_rows ONLY
//  ;
//
//limit_offcnt_clause  : LIMIT select_offset_value COMMA select_limit_value
//  ;
//
//offset_clause  : OFFSET select_offset_value
//  | OFFSET select_offset_value2 row_or_rows
//  ;
//
//select_limit_value  : a_expr
//  | ALL
//  ;
//
//select_offset_value  : a_expr
//  ;
//
//opt_select_fetch_first_value  : signedIconst
//  | OPEN_PAREN a_expr CLOSE_PAREN
//  |
//  ;
//
//select_offset_value2  : c_expr
//  ;
//
//row_or_rows  : ROW
//  | ROWS
//  ;
//
//first_or_next  : FIRST_P
//  | NEXT
//  ;
//
//group_clause  : GROUP_P BY group_by_list
//  |
//  ;
//
//group_by_list  : group_by_item
//  | group_by_list COMMA group_by_item
//  ;
//
//group_by_item  : a_expr
//  | empty_grouping_set
//  | cube_clause
//  | rollup_clause
//  | grouping_sets_clause
//  ;
//
//empty_grouping_set  : OPEN_PAREN CLOSE_PAREN
//  ;
//
//rollup_clause  : ROLLUP OPEN_PAREN expr_list CLOSE_PAREN
//  ;
//
//cube_clause  : CUBE OPEN_PAREN expr_list CLOSE_PAREN
//  ;
//
//grouping_sets_clause  : GROUPING_P SETS OPEN_PAREN group_by_list CLOSE_PAREN
//  ;
//
//having_clause  : HAVING a_expr
//  |
//  ;
//
//start_with_clause  : nltk_START_WITH start_with_expr connect_by_expr
//  | nltk_START_WITH start_with_expr nltk_CONNECT_BY NOCYCLE a_expr
//  | connect_by_expr nltk_START_WITH start_with_expr
//  | nltk_CONNECT_BY NOCYCLE a_expr nltk_START_WITH start_with_expr
//  | nltk_CONNECT_BY NOCYCLE a_expr
//  | connect_by_expr
//  |
//  ;
//
//start_with_expr  : a_expr
//  ;
//
//connect_by_expr  : nltk_CONNECT_BY a_expr
//  ;
//
//for_locking_clause  : for_locking_items
//  | FOR READ ONLY
//  ;
//
//opt_for_locking_clause  : for_locking_clause
//  |
//  ;
//
//for_locking_items  : for_locking_item
//  | for_locking_items for_locking_item
//  ;
//
//for_locking_item  : FOR UPDATE hint_string locked_rels_list opt_nowait_or_skip
//  | FOR UPDATE hint_string locked_rels_list opt_wait
//  | for_locking_strength locked_rels_list opt_nowait_or_skip
//  ;
//
//for_locking_strength  : FOR NO KEY UPDATE
//  | FOR SHARE
//  | FOR KEY SHARE
//  ;
//
//locked_rels_list  : OF qualified_name_list
//  |
//  ;
//
//values_clause  : VALUES ctext_row
//  | values_clause COMMA ctext_row
//  ;
//
//from_clause  : FROM from_list
//  |
//  ;
//
//from_list  : table_ref
//  | from_list COMMA table_ref
//  ;
//
//table_ref  : relation_expr
//  | relation_expr alias_clause opt_index_hint_list
//  | relation_expr index_hint_list
//  | relation_expr opt_alias_clause tablesample_clause
//  | relation_expr opt_alias_clause timecapsule_clause
//  | relation_expr PARTITION OPEN_PAREN name CLOSE_PAREN
//  | relation_expr SUBPARTITION OPEN_PAREN name CLOSE_PAREN
//  | relation_expr BUCKETS OPEN_PAREN bucket_list CLOSE_PAREN
//  | relation_expr nltk_PARTITION_FOR OPEN_PAREN expr_list CLOSE_PAREN
//  | relation_expr nltk_SUBPARTITION_FOR OPEN_PAREN expr_list CLOSE_PAREN
//  | relation_expr PARTITION OPEN_PAREN name CLOSE_PAREN index_hint_list
//  | relation_expr SUBPARTITION OPEN_PAREN name CLOSE_PAREN index_hint_list
//  | relation_expr BUCKETS OPEN_PAREN bucket_list CLOSE_PAREN index_hint_list
//  | relation_expr nltk_PARTITION_FOR OPEN_PAREN expr_list CLOSE_PAREN index_hint_list
//  | relation_expr nltk_SUBPARTITION_FOR OPEN_PAREN expr_list CLOSE_PAREN index_hint_list
//  | relation_expr PARTITION OPEN_PAREN name CLOSE_PAREN alias_clause opt_index_hint_list
//  | relation_expr SUBPARTITION OPEN_PAREN name CLOSE_PAREN alias_clause opt_index_hint_list
//  | relation_expr nltk_PARTITION_FOR OPEN_PAREN expr_list CLOSE_PAREN alias_clause opt_index_hint_list
//  | relation_expr nltk_SUBPARTITION_FOR OPEN_PAREN expr_list CLOSE_PAREN alias_clause opt_index_hint_list
//  | func_table
//  | func_table alias_clause
//  | func_table AS OPEN_PAREN tableFuncElementList CLOSE_PAREN
//  | func_table AS colId OPEN_PAREN tableFuncElementList CLOSE_PAREN
//  | func_table colId OPEN_PAREN tableFuncElementList CLOSE_PAREN
//  | select_with_parens
//  | select_with_parens alias_clause
//  | joined_table
//  | OPEN_PAREN joined_table CLOSE_PAREN alias_clause
//  ;
//
//joined_table  : OPEN_PAREN joined_table CLOSE_PAREN
//  | table_ref CROSS JOIN table_ref
//  | table_ref join_type JOIN table_ref join_qual
//  | table_ref JOIN table_ref join_qual
//  | table_ref NATURAL join_type JOIN table_ref
//  | table_ref NATURAL JOIN table_ref
//  ;
//
//alias_clause  : AS colId OPEN_PAREN name_list CLOSE_PAREN
//  | AS colId
//  | colId OPEN_PAREN name_list CLOSE_PAREN
//  | colId
//  ;
//
//opt_alias_clause  : alias_clause
//  |
//  ;
//
//join_type  : FULL join_outer
//  | LEFT join_outer
//  | RIGHT join_outer
//  | INNER_P
//  ;
//
//join_outer  : OUTER_P
//  |
//  ;
//
//join_qual  : USING OPEN_PAREN name_list CLOSE_PAREN
//  | ON a_expr
//  ;
//
//relation_expr  : qualified_name optSnapshotVersion
//  | qualified_name STAR
//  | ONLY qualified_name
//  | ONLY OPEN_PAREN qualified_name CLOSE_PAREN
//  ;
//
//relation_expr_list  : relation_expr
//  | relation_expr_list COMMA relation_expr
//  ;
//
//delete_relation_expr_opt_alias  : relation_expr_opt_alias
//  | relation_expr PARTITION OPEN_PAREN name COMMA name_list CLOSE_PAREN
//  | relation_expr colId PARTITION OPEN_PAREN name_list CLOSE_PAREN
//  | relation_expr AS colId PARTITION OPEN_PAREN name_list CLOSE_PAREN
//  ;
//
//relation_expr_opt_alias  : relation_expr
//  | relation_expr colId
//  | relation_expr AS colId
//  | relation_expr update_delete_partition_clause
//  | relation_expr update_delete_partition_clause colId
//  | relation_expr update_delete_partition_clause AS colId
//  ;
//
//relation_expr_opt_alias_list  : delete_relation_expr_opt_alias
//  | relation_expr_opt_alias_list COMMA delete_relation_expr_opt_alias
//  ;
//
//tablesample_clause  : TABLESAMPLE func_name OPEN_PAREN expr_list CLOSE_PAREN opt_repeatable_clause
//  ;
//
//timecapsule_clause  : TIMECAPSULE opt_timecapsule_clause
//  ;
//
//opt_timecapsule_clause  : CSN a_expr
//  | TIMESTAMP a_expr
//  ;
//
//opt_repeatable_clause  : REPEATABLE OPEN_PAREN a_expr CLOSE_PAREN
//  |
//  ;
//
//func_table  : func_expr_windowless
//  ;
//
//where_clause  : WHERE a_expr
//  |
//  ;
//
//where_or_current_clause  : WHERE a_expr
//  | WHERE CURRENT_P OF cursor_name
//  |
//  ;
//
//optTableFuncElementList  : tableFuncElementList
//  |
//  ;
//
//tableFuncElementList  : tableFuncElement
//  | tableFuncElementList COMMA tableFuncElement
//  ;
//
//tableFuncElement  : colId func_type opt_collate_clause
//  ;
//
//typename  : simpleTypename opt_array_bounds
//  | SETOF simpleTypename opt_array_bounds
//  | simpleTypename ARRAY OPEN_BRACKET iconst CLOSE_BRACKET
//  | SETOF simpleTypename ARRAY OPEN_BRACKET iconst CLOSE_BRACKET
//  | simpleTypename ARRAY
//  | SETOF simpleTypename ARRAY
//  ;
//
//opt_array_bounds  : opt_array_bounds OPEN_BRACKET CLOSE_BRACKET
//  | opt_array_bounds OPEN_BRACKET iconst CLOSE_BRACKET
//  |
//  ;
//
//simpleTypename  : genericType
//  | numeric
//  | bit
//  | character
//  | constDatetime
//  | constSet
//  | constInterval opt_interval
//  | constInterval OPEN_PAREN iconst CLOSE_PAREN opt_interval
//  ;
//
//constTypename  : numeric
//  | constBit
//  | constCharacter
//  | constDatetime
//  | constSet
//  ;
//
//genericType  : type_function_name opt_type_modifiers
//  | type_function_name attrs opt_type_modifiers
//  ;
//
//opt_type_modifiers  : OPEN_PAREN expr_list CLOSE_PAREN
//  |
//  ;
//
//numeric  : INT_P
//  | INTEGER opt_type_modifiers
//  | SMALLINT
//  | TINYINT
//  | BIGINT
//  | REAL
//  | FLOAT_P opt_float
//  | BINARY_DOUBLE
//  | BINARY_INTEGER
//  | DOUBLE_P PRECISION
//  | DECIMAL_P opt_type_modifiers
//  | NUMBER_P opt_type_modifiers
//  | DEC opt_type_modifiers
//  | NUMERIC opt_type_modifiers
//  | BOOLEAN_P
//  ;
//
//opt_float  : OPEN_PAREN iconst CLOSE_PAREN
//  |
//  ;
//
//bit  : bitWithLength
//  | bitWithoutLength
//  ;
//
//constBit  : bitWithLength
//  | bitWithoutLength
//  ;
//
//bitWithLength  : BIT opt_varying OPEN_PAREN expr_list CLOSE_PAREN
//  ;
//
//bitWithoutLength  : BIT opt_varying
//  ;
//
//character  : characterWithLength
//  | characterWithoutLength
//  ;
//
//constCharacter  : characterWithLength
//  | characterWithoutLength
//  ;
//
//characterWithLength  : character_ OPEN_PAREN iconst CLOSE_PAREN
//  ;
//
//characterWithoutLength  : character_
//  ;
//
//character_  : CHARACTER opt_varying
//  | CHAR_P opt_varying
//  | NVARCHAR
//  | NVARCHAR2
//  | VARCHAR
//  | VARCHAR2
//  | NATIONAL CHARACTER opt_varying
//  | NATIONAL CHAR_P opt_varying
//  | NCHAR opt_varying
//  ;
//
//opt_varying  : VARYING
//  |
//  ;
//
//character_set  : CHARACTER SET
//  | CHARSET
//  ;
//
//charset_collate_name  : colId
//  | BINARY
//  | sconst
//  ;
//
//charset  : character_set charset_collate_name
//  ;
//
//convert_charset  : charset
//  | character_set DEFAULT
//  ;
//
//opt_charset  : charset
//  |
//  ;
//
//default_charset  : DEFAULT character_set opt_equal charset_collate_name
//  | character_set opt_equal charset_collate_name
//  ;
//
//optCharsetCollate  : charsetCollate
//  |
//  ;
//
//charsetCollate  : charset_collate
//  | charsetCollate charset_collate
//  ;
//
//charset_collate  : default_charset
//  | default_collate
//  ;
//
//constDatetime  : TIMESTAMP OPEN_PAREN iconst CLOSE_PAREN opt_timezone
//  | TIMESTAMP opt_timezone
//  | TIME OPEN_PAREN iconst CLOSE_PAREN opt_timezone
//  | TIME opt_timezone
//  | DATE_P
//  | SMALLDATETIME
//  ;
//
//constSet  : SET OPEN_PAREN opt_enum_val_list CLOSE_PAREN
//  ;
//
//constInterval  : INTERVAL
//  ;
//
//opt_timezone  : nltk_WITH_TIME ZONE
//  | WITHOUT TIME ZONE
//  |
//  ;
//
//opt_interval  : YEAR_P
//  | MONTH_P
//  | DAY_P
//  | HOUR_P
//  | MINUTE_P
//  | interval_second
//  | YEAR_P TO MONTH_P
//  | DAY_P TO HOUR_P
//  | DAY_P TO MINUTE_P
//  | DAY_P TO interval_second
//  | HOUR_P TO MINUTE_P
//  | HOUR_P TO interval_second
//  | MINUTE_P TO interval_second
//  | YEAR_P OPEN_PAREN iconst CLOSE_PAREN
//  | MONTH_P OPEN_PAREN iconst CLOSE_PAREN
//  | DAY_P OPEN_PAREN iconst CLOSE_PAREN
//  | HOUR_P OPEN_PAREN iconst CLOSE_PAREN
//  | MINUTE_P OPEN_PAREN iconst CLOSE_PAREN
//  | YEAR_P OPEN_PAREN iconst CLOSE_PAREN TO MONTH_P
//  | DAY_P OPEN_PAREN iconst CLOSE_PAREN TO HOUR_P
//  | DAY_P OPEN_PAREN iconst CLOSE_PAREN TO MINUTE_P
//  | DAY_P OPEN_PAREN iconst CLOSE_PAREN TO interval_second
//  | HOUR_P OPEN_PAREN iconst CLOSE_PAREN TO MINUTE_P
//  | HOUR_P OPEN_PAREN iconst CLOSE_PAREN TO interval_second
//  | MINUTE_P OPEN_PAREN iconst CLOSE_PAREN TO interval_second
//  |
//  ;
//
//interval_second  : SECOND_P
//  | SECOND_P OPEN_PAREN iconst CLOSE_PAREN
//  ;
//
//client_logic_type  : BYTEAWITHOUTORDER
//  | BYTEAWITHOUTORDERWITHEQUAL
//  ;
//
//a_expr  : c_expr
//  | PRIOR OPEN_PAREN a_expr CLOSE_PAREN
//  | a_expr TYPECAST typename
//  | a_expr COLLATE collate_name
//  | a_expr AT_P TIME ZONE a_expr
//  | PLUS a_expr
//  | MINUS a_expr
//  | AT a_expr
//  | a_expr PLUS a_expr
//  | a_expr MINUS a_expr
//  | a_expr STAR a_expr
//  | a_expr SLASH a_expr
//  | a_expr PERCENT a_expr
//  | a_expr CARET a_expr
//  | a_expr LT a_expr
//  | a_expr GT a_expr
//  | a_expr EQUAL a_expr
//  | a_expr AT a_expr
//  | a_expr CmpNullOp a_expr
//  | uservar_name Colon_equals a_expr
//  | a_expr CmpOp a_expr
//  | a_expr qual_Op a_expr
//  | qual_Op a_expr
//  | a_expr qual_Op
//  | a_expr AND a_expr
//  | a_expr OR a_expr
//  | NOT a_expr
//  | a_expr LIKE a_expr
//  | a_expr LIKE a_expr ESCAPE a_expr
//  | a_expr nltk_NOT_LIKE a_expr
//  | a_expr nltk_NOT_LIKE a_expr ESCAPE a_expr
//  | a_expr ILIKE a_expr
//  | a_expr ILIKE a_expr ESCAPE a_expr
//  | a_expr nltk_NOT_ILIKE a_expr
//  | a_expr nltk_NOT_ILIKE a_expr ESCAPE a_expr
//  | a_expr SIMILAR TO a_expr
//  | a_expr SIMILAR TO a_expr ESCAPE a_expr
//  | a_expr nltk_NOT_SIMILAR TO a_expr
//  | a_expr nltk_NOT_SIMILAR TO a_expr ESCAPE a_expr
//  | a_expr IS NULL_P
//  | a_expr ISNULL
//  | a_expr IS NOT NULL_P
//  | a_expr NOTNULL
//  | row OVERLAPS row
//  | a_expr IS TRUE_P
//  | a_expr IS NOT TRUE_P
//  | a_expr IS FALSE_P
//  | a_expr IS NOT FALSE_P
//  | a_expr IS UNKNOWN
//  | a_expr IS NOT UNKNOWN
//  | a_expr IS DISTINCT FROM a_expr
//  | a_expr IS NOT DISTINCT FROM a_expr
//  | a_expr IS OF OPEN_PAREN type_list CLOSE_PAREN
//  | a_expr IS NOT OF OPEN_PAREN type_list CLOSE_PAREN
//  | a_expr BETWEEN opt_asymmetric b_expr AND b_expr
//  | a_expr nltk_NOT_BETWEEN opt_asymmetric b_expr AND b_expr
//  | a_expr BETWEEN SYMMETRIC b_expr AND b_expr
//  | a_expr nltk_NOT_BETWEEN SYMMETRIC b_expr AND b_expr
//  | a_expr IN_P in_expr
//  | a_expr nltk_NOT_IN in_expr
//  | a_expr subquery_Op sub_type select_with_parens
//  | a_expr subquery_Op sub_type OPEN_PAREN a_expr CLOSE_PAREN
//  | UNIQUE select_with_parens
//  | a_expr IS DOCUMENT_P
//  | a_expr IS NOT DOCUMENT_P
//  | PREDICT BY colId OPEN_PAREN FEATURES func_arg_list CLOSE_PAREN
//  ;
//
//b_expr  : c_expr
//  | b_expr TYPECAST typename
//  | PLUS b_expr
//  | MINUS b_expr
//  | AT b_expr
//  | b_expr PLUS b_expr
//  | b_expr MINUS b_expr
//  | b_expr STAR b_expr
//  | b_expr SLASH b_expr
//  | b_expr PERCENT b_expr
//  | b_expr CARET b_expr
//  | b_expr LT b_expr
//  | b_expr GT b_expr
//  | b_expr EQUAL b_expr
//  | b_expr AT b_expr
//  | b_expr CmpOp b_expr
//  | b_expr qual_Op b_expr
//  | b_expr CmpNullOp b_expr
//  | qual_Op b_expr
//  | b_expr qual_Op
//  | b_expr IS DISTINCT FROM b_expr
//  | b_expr IS NOT DISTINCT FROM b_expr
//  | b_expr IS OF OPEN_PAREN type_list CLOSE_PAREN
//  | b_expr IS NOT OF OPEN_PAREN type_list CLOSE_PAREN
//  | b_expr IS DOCUMENT_P
//  | b_expr IS NOT DOCUMENT_P
//  ;
//
//c_expr  : columnref
//  | aexprConst
//  | PRIOR OPEN_PAREN columnref CLOSE_PAREN
//  | PRIOR OPEN_PAREN c_expr COMMA func_arg_list CLOSE_PAREN
//  | PRIOR columnref
//  | PARAM opt_indirection
//  | OPEN_PAREN a_expr CLOSE_PAREN opt_indirection
//  | case_expr
//  | func_expr
//  | select_with_parens
//  | select_with_parens indirection
//  | EXISTS select_with_parens
//  | ARRAY select_with_parens
//  | ARRAY array_expr
//  | explicit_row
//  | implicit_row
//  | GROUPING_P OPEN_PAREN expr_list CLOSE_PAREN
//  | uservar_name
//  | set_ident_expr
//  ;
//
//c_expr_noparen  : columnref
//  | aexprConst
//  | PARAM opt_indirection
//  | case_expr
//  | func_expr
//  | select_with_parens
//  | select_with_parens indirection
//  | EXISTS select_with_parens
//  | ARRAY select_with_parens
//  | ARRAY array_expr
//  | explicit_row
//  | GROUPING_P OPEN_PAREN expr_list CLOSE_PAREN
//  ;
//
//func_expr  : func_application within_group_clause over_clause
//  | func_with_separator
//  | func_expr_common_subexpr
//  ;
//
//func_application  : func_name OPEN_PAREN func_arg_list opt_sort_clause CLOSE_PAREN
//  | func_application_special
//  ;
//
//func_application_special  : func_name OPEN_PAREN CLOSE_PAREN
//  | func_name OPEN_PAREN VARIADIC func_arg_expr opt_sort_clause CLOSE_PAREN
//  | func_name OPEN_PAREN func_arg_list COMMA VARIADIC func_arg_expr opt_sort_clause CLOSE_PAREN
//  | func_name OPEN_PAREN ALL func_arg_list opt_sort_clause CLOSE_PAREN
//  | func_name OPEN_PAREN DISTINCT func_arg_list opt_sort_clause CLOSE_PAREN
//  | func_name OPEN_PAREN STAR CLOSE_PAREN
//  ;
//
//func_with_separator  : func_name OPEN_PAREN func_arg_list opt_sort_clause SEPARATOR_P sconst CLOSE_PAREN
//  | func_name OPEN_PAREN DISTINCT func_arg_list opt_sort_clause SEPARATOR_P sconst CLOSE_PAREN
//  ;
//
//func_expr_windowless  : func_application
//  | func_expr_common_subexpr
//  ;
//
//func_expr_common_subexpr  : COLLATION FOR OPEN_PAREN a_expr CLOSE_PAREN
//  | CURRENT_DATE
//  | CURRENT_TIME
//  | CURRENT_TIME OPEN_PAREN iconst CLOSE_PAREN
//  | CURRENT_TIMESTAMP
//  | CURRENT_TIMESTAMP OPEN_PAREN iconst CLOSE_PAREN
//  | LOCALTIME
//  | LOCALTIME OPEN_PAREN iconst CLOSE_PAREN
//  | LOCALTIMESTAMP
//  | LOCALTIMESTAMP OPEN_PAREN iconst CLOSE_PAREN
//  | SYSDATE
//  | ROWNUM
//  | CURRENT_ROLE
//  | CURRENT_USER
//  | SESSION_USER
//  | USER
//  | CURRENT_CATALOG
//  | CURRENT_SCHEMA
//  | CAST OPEN_PAREN a_expr AS typename CLOSE_PAREN
//  | EXTRACT OPEN_PAREN extract_list CLOSE_PAREN
//  | TIMESTAMPDIFF OPEN_PAREN timestamp_arg_list CLOSE_PAREN
//  | OVERLAY OPEN_PAREN overlay_list CLOSE_PAREN
//  | POSITION OPEN_PAREN position_list CLOSE_PAREN
//  | SUBSTRING OPEN_PAREN substr_list CLOSE_PAREN
//  | TREAT OPEN_PAREN a_expr AS typename CLOSE_PAREN
//  | TRIM OPEN_PAREN BOTH trim_list CLOSE_PAREN
//  | TRIM OPEN_PAREN LEADING trim_list CLOSE_PAREN
//  | TRIM OPEN_PAREN TRAILING trim_list CLOSE_PAREN
//  | TRIM OPEN_PAREN trim_list CLOSE_PAREN
//  | NULLIF OPEN_PAREN a_expr COMMA a_expr CLOSE_PAREN
//  | NVL OPEN_PAREN a_expr COMMA a_expr CLOSE_PAREN
//  | COALESCE OPEN_PAREN expr_list CLOSE_PAREN
//  | GREATEST OPEN_PAREN expr_list CLOSE_PAREN
//  | LEAST OPEN_PAREN expr_list CLOSE_PAREN
//  | XMLCONCAT OPEN_PAREN expr_list CLOSE_PAREN
//  | XMLELEMENT OPEN_PAREN NAME_P colLabel CLOSE_PAREN
//  | XMLELEMENT OPEN_PAREN NAME_P colLabel COMMA xml_attributes CLOSE_PAREN
//  | XMLELEMENT OPEN_PAREN NAME_P colLabel COMMA expr_list CLOSE_PAREN
//  | XMLELEMENT OPEN_PAREN NAME_P colLabel COMMA xml_attributes COMMA expr_list CLOSE_PAREN
//  | XMLEXISTS OPEN_PAREN c_expr xmlexists_argument CLOSE_PAREN
//  | XMLFOREST OPEN_PAREN xml_attribute_list CLOSE_PAREN
//  | XMLPARSE OPEN_PAREN document_or_content a_expr xml_whitespace_option CLOSE_PAREN
//  | XMLPI OPEN_PAREN NAME_P colLabel CLOSE_PAREN
//  | XMLPI OPEN_PAREN NAME_P colLabel COMMA a_expr CLOSE_PAREN
//  | XMLROOT OPEN_PAREN a_expr COMMA xml_root_version opt_xml_root_standalone CLOSE_PAREN
//  | XMLSERIALIZE OPEN_PAREN document_or_content a_expr AS simpleTypename CLOSE_PAREN
//  ;
//
//xml_root_version  : VERSION_P a_expr
//  | VERSION_P NO VALUE_P
//  ;
//
//opt_xml_root_standalone  : COMMA STANDALONE_P YES_P
//  | COMMA STANDALONE_P NO
//  | COMMA STANDALONE_P NO VALUE_P
//  |
//  ;
//
//xml_attributes  : XMLATTRIBUTES OPEN_PAREN xml_attribute_list CLOSE_PAREN
//  ;
//
//xml_attribute_list  : xml_attribute_el
//  | xml_attribute_list COMMA xml_attribute_el
//  ;
//
//xml_attribute_el  : a_expr AS colLabel
//  | a_expr
//  ;
//
//document_or_content  : DOCUMENT_P
//  | CONTENT_P
//  ;
//
//xml_whitespace_option  : PRESERVE WHITESPACE_P
//  | STRIP_P WHITESPACE_P
//  |
//  ;
//
//xmlexists_argument  : PASSING c_expr
//  | PASSING c_expr BY REF
//  | PASSING BY REF c_expr
//  | PASSING BY REF c_expr BY REF
//  ;
//
//within_group_clause  : WITHIN GROUP_P OPEN_PAREN sort_clause CLOSE_PAREN
//  |
//  ;
//
//window_clause  : WINDOW window_definition_list
//  |
//  ;
//
//window_definition_list  : window_definition
//  | window_definition_list COMMA window_definition
//  ;
//
//window_definition  : colId AS window_specification
//  ;
//
//over_clause  : OVER window_specification
//  | OVER colId
//  |
//  ;
//
//window_specification  : OPEN_PAREN opt_existing_window_name opt_partition_clause opt_sort_clause opt_frame_clause CLOSE_PAREN
//  ;
//
//opt_existing_window_name  : colId
//  |
//  ;
//
//opt_partition_clause  : PARTITION BY expr_list
//  |
//  ;
//
//opt_frame_clause  : RANGE frame_extent
//  | ROWS frame_extent
//  |
//  ;
//
//frame_extent  : frame_bound
//  | BETWEEN frame_bound AND frame_bound
//  ;
//
//frame_bound  : UNBOUNDED PRECEDING
//  | UNBOUNDED FOLLOWING
//  | CURRENT_P ROW
//  | a_expr PRECEDING
//  | a_expr FOLLOWING
//  ;
//
//row  : ROW OPEN_PAREN expr_list CLOSE_PAREN
//  | ROW OPEN_PAREN CLOSE_PAREN
//  | OPEN_PAREN expr_list COMMA a_expr CLOSE_PAREN
//  ;
//
//explicit_row  : ROW OPEN_PAREN expr_list CLOSE_PAREN
//  | ROW OPEN_PAREN CLOSE_PAREN
//  ;
//
//implicit_row  : OPEN_PAREN expr_list COMMA a_expr CLOSE_PAREN
//  ;
//
//sub_type  : ANY
//  | SOME
//  | ALL
//  ;
//
//all_Op  : Op
//  | CmpOp
//  | CmpNullOp
//  | mathOp
//  ;
//
//mathOp  : PLUS
//  | MINUS
//  | STAR
//  | SLASH
//  | PERCENT
//  | CARET
//  | LT
//  | GT
//  | EQUAL
//  | AT
//  ;
//
//qual_Op  : Op
//  | OPERATOR OPEN_PAREN any_operator CLOSE_PAREN
//  ;
//
//qual_all_Op  : all_Op
//  | OPERATOR OPEN_PAREN any_operator CLOSE_PAREN
//  ;
//
//subquery_Op  : all_Op
//  | OPERATOR OPEN_PAREN any_operator CLOSE_PAREN
//  | LIKE
//  | nltk_NOT_LIKE
//  | ILIKE
//  | nltk_NOT_ILIKE
//  ;
//
//expr_list  : a_expr
//  | expr_list COMMA a_expr
//  ;
//
//func_arg_list  : func_arg_expr
//  | func_arg_list COMMA func_arg_expr
//  ;
//
//func_arg_expr  : a_expr
//  | param_name Colon_equals a_expr
//  | param_name PARA_EQUALS a_expr
//  ;
//
//type_list  : typename
//  | type_list COMMA typename
//  ;
//
//array_expr  : OPEN_BRACKET expr_list CLOSE_BRACKET
//  | OPEN_BRACKET array_expr_list CLOSE_BRACKET
//  | OPEN_BRACKET CLOSE_BRACKET
//  ;
//
//array_expr_list  : array_expr
//  | array_expr_list COMMA array_expr
//  ;
//
//extract_list  : extract_arg FROM a_expr
//  |
//  ;
//
//extract_arg  : IDENT
//  | YEAR_P
//  | MONTH_P
//  | DAY_P
//  | HOUR_P
//  | MINUTE_P
//  | SECOND_P
//  | sconst
//  ;
//
//timestamp_arg_list  : timestamp_units COMMA a_expr COMMA a_expr
//  |
//  ;
//
//timestamp_units  : IDENT
//  | YEAR_P
//  | MONTH_P
//  | DAY_P
//  | HOUR_P
//  | MINUTE_P
//  | SECOND_P
//  | sconst
//  ;
//
//overlay_list  : a_expr overlay_placing substr_from substr_for
//  | a_expr overlay_placing substr_from
//  ;
//
//overlay_placing  : PLACING a_expr
//  ;
//
//position_list  : b_expr IN_P b_expr
//  |
//  ;
//
//substr_list  : a_expr substr_from substr_for
//  | a_expr substr_for substr_from
//  | a_expr substr_from
//  | a_expr substr_for
//  | expr_list
//  |
//  ;
//
//substr_from  : FROM a_expr
//  ;
//
//substr_for  : FOR a_expr
//  ;
//
//trim_list  : a_expr FROM expr_list
//  | FROM expr_list
//  | expr_list
//  ;
//
//in_expr  : select_with_parens
//  | OPEN_PAREN expr_list CLOSE_PAREN
//  ;
//
//case_expr  : CASE case_arg when_clause_list case_default END_P
//  | DECODE OPEN_PAREN a_expr COMMA expr_list CLOSE_PAREN
//  ;
//
//when_clause_list  : when_clause
//  | when_clause_list when_clause
//  ;
//
//when_clause  : WHEN a_expr THEN a_expr
//  ;
//
//case_default  : ELSE a_expr
//  |
//  ;
//
//case_arg  : a_expr
//  |
//  ;
//
//columnref  : colId
//  | colId indirection
//  | EXCLUDED indirection
//  ;
//
//indirection_el  : DOT attr_name
//  | ORA_JOINOP
//  | DOT STAR
//  | OPEN_BRACKET a_expr CLOSE_BRACKET
//  | OPEN_BRACKET a_expr COLON a_expr CLOSE_BRACKET
//  | OPEN_BRACKET a_expr COMMA a_expr CLOSE_BRACKET
//  ;
//
//indirection  : indirection_el
//  | indirection indirection_el
//  ;
//
//opt_indirection  :
//  | opt_indirection indirection_el
//  ;
//
//opt_asymmetric  : ASYMMETRIC
//  |
//  ;
//
//ctext_expr  : a_expr
//  | DEFAULT
//  ;
//
//ctext_expr_list  : ctext_expr
//  | ctext_expr_list COMMA ctext_expr
//  ;
//
//ctext_row  : OPEN_PAREN ctext_expr_list CLOSE_PAREN
//  ;
//
//target_list  : target_el
//  | target_list COMMA target_el
//  ;
//
//target_el  : a_expr AS colLabel
//  | a_expr IDENT
//  | a_expr
//  | STAR
//  | c_expr VALUE_P
//  | c_expr NAME_P
//  | c_expr TYPE_P
//  | connect_by_root_expr
//  ;
//
//connect_by_root_expr  : a_expr IDENT DOT IDENT
//  | a_expr IDENT DOT IDENT as_empty IDENT
//  | a_expr IDENT as_empty IDENT
//  ;
//
//qualified_name_list  : qualified_name
//  | qualified_name_list COMMA qualified_name
//  ;
//
//qualified_name  : colId
//  | colId indirection
//  ;
//
//name_list  : name
//  | name_list COMMA name
//  ;
//
//name  : colId
//  ;
//
//database_name  : colId
//  ;
//
//access_method  : colId
//  ;
//
//attr_name  : colLabel
//  ;
//
//index_name  : colId
//  ;
//
//file_name  : sconst
//  ;
//
//func_name  : type_function_name
//  | colId indirection
//  ;
//
//func_name_opt_arg  : func_name
//  | IDENT BOGUS
//  | unreserved_keyword BOGUS
//  ;
//
//aexprConst  : iconst
//  | FCONST
//  | sconst
//  | BCONST
//  | XCONST
//  | func_name sconst
//  | func_name OPEN_PAREN func_arg_list opt_sort_clause CLOSE_PAREN sconst
//  | constTypename sconst
//  | constInterval sconst opt_interval
//  | constInterval OPEN_PAREN iconst CLOSE_PAREN sconst opt_interval
//  | TRUE_P
//  | FALSE_P
//  | NULL_P
//  ;
//
//iconst  : ICONST
//  ;
//
//sconst  : SCONST
//  ;
//
//roleId  : colId
//  ;
//
//signedIconst  : iconst
//  | PLUS iconst
//  | MINUS iconst
//  ;
//
//colId  : IDENT
//  | unreserved_keyword
//  | col_name_keyword
//  ;
//
//type_function_name  : IDENT
//  | unreserved_keyword
//  | type_func_name_keyword
//  ;
//
//colLabel  : IDENT
//  | unreserved_keyword
//  | col_name_keyword
//  | type_func_name_keyword
//  | reserved_keyword
//  ;
//
//delimiterStmt  : DELIMITER delimiter_str_names nltk_END_OF_INPUT
//  | DELIMITER delimiter_str_names nltk_END_OF_INPUT_COLON
//  ;
//
//delimiter_str_names  : delimiter_str_names delimiter_str_name
//  | delimiter_str_name
//  ;
//
//delimiter_str_name  : colId_or_Sconst
//  | all_Op
//  | SEMI
//  ;
//
//unreserved_keyword  : ABORT_P
//  | ABSOLUTE_P
//  | ACCESS
//  | ACCOUNT
//  | ACTION
//  | ADD_P
//  | ADMIN
//  | AFTER
//  | AGGREGATE
//  | ALGORITHM
//  | ALSO
//  | ALTER
//  | ALWAYS
//  | APP
//  | APPEND
//  | ARCHIVE
//  | ASSERTION
//  | ASSIGNMENT
//  | AT_P
//  | ATTRIBUTE
//  | AUDIT
//  | AUTOEXTEND
//  | AUTOMAPPED
//  | AUTO_INCREMENT
//  | BACKWARD
//  | BARRIER
//  | BEFORE
//  | BEGIN_P
//  | BEGIN_NON_ANOYBLOCK
//  | BLANKS
//  | BLOB_P
//  | BLOCKCHAIN
//  | BODY_P
//  | BY
//  | CACHE
//  | CALL
//  | CALLED
//  | CANCELABLE
//  | CASCADE
//  | CASCADED
//  | CATALOG_P
//  | CHAIN
//  | CHANGE
//  | CHARACTERISTICS
//  | CHARACTERSET
//  | CHECKPOINT
//  | CLASS
//  | CLEAN
//  | CLIENT
//  | CLIENT_MASTER_KEY
//  | CLIENT_MASTER_KEYS
//  | CLOB
//  | CLOSE
//  | CLUSTER
//  | COLUMN_ENCRYPTION_KEY
//  | COLUMN_ENCRYPTION_KEYS
//  | COLUMNS
//  | COMMENT
//  | COMMENTS
//  | COMMIT
//  | COMMITTED
//  | COMPATIBLE_ILLEGAL_CHARS
//  | COMPLETE
//  | COMPLETION
//  | COMPRESS
//  | CONDITION
//  | CONFIGURATION
//  | CONNECT
//  | CONNECTION
//  | CONSTANT
//  | CONSTRAINTS
//  | CONTENT_P
//  | CONTINUE_P
//  | CONTVIEW
//  | CONVERSION_P
//  | CONVERT_P
//  | COORDINATOR
//  | COORDINATORS
//  | COPY
//  | COST
//  | CSV
//  | CUBE
//  | CURRENT_P
//  | CURSOR
//  | CYCLE
//  | DATA_P
//  | DATABASE
//  | DATAFILE
//  | DATANODE
//  | DATANODES
//  | DATATYPE_CL
//  | DATE_FORMAT_P
//  | DAY_P
//  | DBCOMPATIBILITY_P
//  | DEALLOCATE
//  | DECLARE
//  | DEFAULTS
//  | DEFERRED
//  | DEFINER
//  | DELETE_P
//  | DELIMITER
//  | DELIMITERS
//  | DELTA
//  | DETERMINISTIC
//  | DICTIONARY
//  | DIRECT
//  | DIRECTORY
//  | DISABLE_P
//  | DISCARD
//  | DISCONNECT
//  | DISTRIBUTE
//  | DISTRIBUTION
//  | DOCUMENT_P
//  | DOMAIN_P
//  | DOUBLE_P
//  | DROP
//  | DUMPFILE
//  | DUPLICATE
//  | EACH
//  | ELASTIC
//  | ENABLE_P
//  | ENCLOSED
//  | ENCODING
//  | ENCRYPTED
//  | ENCRYPTED_VALUE
//  | ENCRYPTION
//  | ENCRYPTION_TYPE
//  | ENDS
//  | ENFORCED
//  | ENUM_P
//  | EOL
//  | ERRORS
//  | ESCAPE
//  | ESCAPED
//  | ESCAPING
//  | EVENT
//  | EVENTS
//  | EVERY
//  | EXCHANGE
//  | EXCLUDE
//  | EXCLUDING
//  | EXCLUSIVE
//  | EXECUTE
//  | EXPIRED_P
//  | EXPLAIN
//  | EXTENSION
//  | EXTERNAL
//  | FAMILY
//  | FAST
//  | FEATURES
//  | FENCED
//  | FIELDS
//  | FILEHEADER_P
//  | FILLER
//  | FILL_MISSING_FIELDS
//  | FILTER
//  | FIRST_P
//  | FIXED_P
//  | FOLLOWING
//  | FOLLOWS_P
//  | FORCE
//  | FORMATTER
//  | FORWARD
//  | FUNCTION
//  | FUNCTIONS
//  | GENERATED
//  | GLOBAL
//  | GRANTED
//  | HANDLER
//  | HEADER_P
//  | HOLD
//  | HOUR_P
//  | IDENTIFIED
//  | IDENTITY_P
//  | IF_P
//  | IGNORE
//  | IGNORE_EXTRA_DATA
//  | IMMEDIATE
//  | IMMUTABLE
//  | IMPLICIT_P
//  | INCLUDE
//  | INCLUDING
//  | INCREMENT
//  | INCREMENTAL
//  | INDEX
//  | INDEXES
//  | INFILE
//  | INHERIT
//  | INHERITS
//  | INITIAL_P
//  | INITRANS
//  | INLINE_P
//  | INPUT_P
//  | INSENSITIVE
//  | INSERT
//  | INSTEAD
//  | INTERNAL
//  | INVISIBLE
//  | INVOKER
//  | IP
//  | ISNULL
//  | ISOLATION
//  | KEY
//  | KEY_PATH
//  | KEY_STORE
//  | KILL
//  | LABEL
//  | LANGUAGE
//  | LARGE_P
//  | LAST_P
//  | LC_COLLATE_P
//  | LC_CTYPE_P
//  | LEAKPROOF
//  | LEVEL
//  | LINES
//  | LIST
//  | LISTEN
//  | LOAD
//  | LOCAL
//  | LOCATION
//  | LOCK_P
//  | LOCKED
//  | LOG_P
//  | LOGGING
//  | LOGIN_ANY
//  | LOGIN_FAILURE
//  | LOGIN_SUCCESS
//  | LOGOUT
//  | LOOP
//  | MAPPING
//  | MASKING
//  | MASTER
//  | MATCH
//  | MATCHED
//  | MATERIALIZED
//  | MAXEXTENTS
//  | MAXSIZE
//  | MAXTRANS
//  | MERGE
//  | MINEXTENTS
//  | MINUTE_P
//  | MINVALUE
//  | MODE
//  | MODEL
//  | MONTH_P
//  | MOVE
//  | MOVEMENT
//  | NAME_P
//  | NAMES
//  | NEXT
//  | NO
//  | NOCOMPRESS
//  | NODE
//  | NOLOGGING
//  | NOMAXVALUE
//  | NOMINVALUE
//  | NOTHING
//  | NOTIFY
//  | NOWAIT
//  | NULLCOLS
//  | NULLS_P
//  | NUMSTR
//  | OBJECT_P
//  | OF
//  | OFF
//  | OIDS
//  | OPERATOR
//  | OPTIMIZATION
//  | OPTION
//  | OPTIONALLY
//  | OPTIONS
//  | OVER
//  | OUTFILE
//  | OWNED
//  | OWNER
//  | PACKAGE
//  | PACKAGES
//  | PARSER
//  | PARTIAL
//  | PARTITION
//  | PARTITIONS
//  | PASSING
//  | PASSWORD
//  | PCTFREE
//  | PER_P
//  | PERCENT_P
//  | PERM
//  | PLAN
//  | PLANS
//  | POLICY
//  | POOL
//  | PRECEDES_P
//  | PRECEDING
//  | PREDICT
//  | PREFERRED
//  | PREFIX
//  | PREPARE
//  | PREPARED
//  | PRESERVE
//  | PRIOR
//  | PRIORER
//  | PRIVATE
//  | PRIVILEGE
//  | PRIVILEGES
//  | PROCEDURAL
//  | PROFILE
//  | PUBLICATION
//  | PUBLISH
//  | PURGE
//  | QUERY
//  | QUOTE
//  | RANDOMIZED
//  | RANGE
//  | RATIO
//  | RAW OPEN_PAREN iconst CLOSE_PAREN
//  | RAW
//  | READ
//  | REASSIGN
//  | REBUILD
//  | RECHECK
//  | RECURSIVE
//  | REDISANYVALUE
//  | REF
//  | REFRESH
//  | REINDEX
//  | RELATIVE_P
//  | RELEASE
//  | RELOPTIONS
//  | REMOTE_P
//  | REMOVE
//  | RENAME
//  | REPEAT
//  | REPEATABLE
//  | REPLACE
//  | REPLICA
//  | RESET
//  | RESIZE
//  | RESOURCE
//  | RESTART
//  | RESTRICT
//  | RETURN
//  | RETURNS
//  | REUSE
//  | REVOKE
//  | ROLE
//  | ROLES
//  | ROLLBACK
//  | ROLLUP
//  | ROTATION
//  | ROWS
//  | ROWTYPE_P
//  | RULE
//  | SAMPLE
//  | SAVEPOINT
//  | SCHEDULE
//  | SCHEMA
//  | SCROLL
//  | SEARCH
//  | SECOND_P
//  | SECURITY
//  | SEPARATOR_P
//  | SEQUENCE
//  | SEQUENCES
//  | SERIALIZABLE
//  | SERVER
//  | SESSION
//  | SET
//  | SETS
//  | SHARE
//  | SHIPPABLE
//  | SHOW
//  | SHUTDOWN
//  | SIBLINGS
//  | SIMPLE
//  | SIZE
//  | SKIP_P
//  | SLAVE
//  | SLICE
//  | SMALLDATETIME_FORMAT_P
//  | SNAPSHOT
//  | SOURCE_P
//  | SPACE
//  | SPILL
//  | SPLIT
//  | STABLE
//  | STANDALONE_P
//  | START
//  | STARTING
//  | STARTS
//  | STATEMENT
//  | STATEMENT_ID
//  | STATISTICS
//  | STDIN
//  | STDOUT
//  | STORAGE
//  | STORE_P
//  | STORED
//  | STRATIFY
//  | STREAM
//  | STRICT_P
//  | STRIP_P
//  | SUBPARTITION
//  | SUBPARTITIONS
//  | SUBSCRIPTION
//  | SYNONYM
//  | SYSID
//  | SYS_REFCURSOR
//  | SYSTEM_P
//  | TABLES
//  | TABLESPACE
//  | TARGET
//  | TEMP
//  | TEMPLATE
//  | TEMPORARY
//  | TERMINATED
//  | TEXT_P
//  | THAN
//  | TIMESTAMP_FORMAT_P
//  | TIME_FORMAT_P
//  | TRANSACTION
//  | TRANSFORM
//  | TRIGGER
//  | TRUNCATE
//  | TRUSTED
//  | TSFIELD
//  | TSTAG
//  | TSTIME
//  | TYPE_P
//  | TYPES_P
//  | UNBOUNDED
//  | UNCOMMITTED
//  | UNENCRYPTED
//  | UNKNOWN
//  | UNLIMITED
//  | UNLISTEN
//  | UNLOCK
//  | UNLOGGED
//  | UNTIL
//  | UNUSABLE
//  | UPDATE
//  | USE_P
//  | USEEOF
//  | VACUUM
//  | VALID
//  | VALIDATE
//  | VALIDATION
//  | VALIDATOR
//  | VALUE_P
//  | VARIABLES
//  | VARYING
//  | VCGROUP
//  | VERSION_P
//  | VIEW
//  | VISIBLE
//  | VOLATILE
//  | WAIT
//  | WEAK
//  | WHILE_P
//  | WHITESPACE_P
//  | WITHIN
//  | WITHOUT
//  | WORK
//  | WORKLOAD
//  | WRAPPER
//  | WRITE
//  | XML_P
//  | YEAR_P
//  | YES_P
//  | ZONE
//  ;
//
//col_name_keyword  : BETWEEN
//  | BIGINT
//  | BINARY_DOUBLE
//  | BINARY_INTEGER
//  | BIT
//  | BOOLEAN_P
//  | BUCKETCNT
//  | BYTEAWITHOUTORDER
//  | BYTEAWITHOUTORDERWITHEQUAL
//  | CHAR_P
//  | CHARACTER
//  | COALESCE
//  | DATE_P
//  | DEC
//  | DECIMAL_P
//  | DECODE
//  | EXISTS
//  | EXTRACT
//  | FLOAT_P
//  | GREATEST
//  | GROUPING_P
//  | INOUT
//  | INT_P
//  | INTEGER
//  | INTERVAL
//  | LEAST
//  | NATIONAL
//  | NCHAR
//  | NONE
//  | NULLIF
//  | NUMBER_P
//  | NUMERIC
//  | NVARCHAR
//  | NVARCHAR2
//  | NVL
//  | OUT_P
//  | OVERLAY
//  | POSITION
//  | PRECISION
//  | REAL
//  | ROW
//  | SETOF
//  | SMALLDATETIME
//  | SMALLINT
//  | SUBSTRING
//  | TIME
//  | TIMESTAMP
//  | TIMESTAMPDIFF
//  | TINYINT
//  | TREAT
//  | TRIM
//  | VALUES
//  | VARCHAR
//  | VARCHAR2
//  | XMLATTRIBUTES
//  | XMLCONCAT
//  | XMLELEMENT
//  | XMLEXISTS
//  | XMLFOREST
//  | XMLPARSE
//  | XMLPI
//  | XMLROOT
//  | XMLSERIALIZE
//  ;
//
//col_name_keyword_nonambiguous  : BETWEEN
//  | BIGINT
//  | BINARY_DOUBLE
//  | BINARY_INTEGER
//  | BIT
//  | BOOLEAN_P
//  | BUCKETCNT
//  | BYTEAWITHOUTORDER
//  | BYTEAWITHOUTORDERWITHEQUAL
//  | CHAR_P
//  | CHARACTER
//  | DATE_P
//  | DEC
//  | DECIMAL_P
//  | DECODE
//  | EXISTS
//  | FLOAT_P
//  | GROUPING_P
//  | INOUT
//  | INT_P
//  | INTEGER
//  | INTERVAL
//  | NATIONAL
//  | NCHAR
//  | NONE
//  | NUMBER_P
//  | NUMERIC
//  | NVARCHAR2
//  | OUT_P
//  | PRECISION
//  | REAL
//  | ROW
//  | SETOF
//  | SMALLDATETIME
//  | SMALLINT
//  | TIME
//  | TIMESTAMP
//  | TINYINT
//  | VALUES
//  | VARCHAR
//  | VARCHAR2
//  | XMLATTRIBUTES
//  ;
//
//type_func_name_keyword  : AUTHORIZATION
//  | BINARY
//  | COLLATION
//  | COMPACT
//  | CONCURRENTLY
//  | CROSS
//  | CSN
//  | CURRENT_SCHEMA
//  | DELTAMERGE
//  | FREEZE
//  | FULL
//  | HDFSDIRECTORY
//  | ILIKE
//  | INNER_P
//  | JOIN
//  | LEFT
//  | LIKE
//  | NATURAL
//  | NOTNULL
//  | OUTER_P
//  | OVERLAPS
//  | RECYCLEBIN
//  | RIGHT
//  | SIMILAR
//  | TABLESAMPLE
//  | TIMECAPSULE
//  | VERBOSE
//  ;
//
//reserved_keyword  : ALL
//  | ANALYSE
//  | ANALYZE
//  | AND
//  | ANY
//  | ARRAY
//  | AS
//  | ASC
//  | ASYMMETRIC
//  | AUTHID
//  | BOTH
//  | BUCKETS
//  | CASE
//  | CAST
//  | CHECK
//  | COLLATE
//  | COLUMN
//  | CONSTRAINT
//  | CREATE
//  | CURRENT_CATALOG
//  | CURRENT_DATE
//  | CURRENT_ROLE
//  | CURRENT_TIME
//  | CURRENT_TIMESTAMP
//  | CURRENT_USER
//  | DEFAULT
//  | DEFERRABLE
//  | DESC
//  | DISTINCT
//  | DO
//  | ELSE
//  | END_P
//  | EXCEPT
//  | EXCLUDED
//  | FALSE_P
//  | FETCH
//  | FOR
//  | FOREIGN
//  | FROM
//  | GRANT
//  | GROUP_P
//  | GROUPPARENT
//  | HAVING
//  | IN_P
//  | INITIALLY
//  | INTERSECT
//  | INTO
//  | IS
//  | LEADING
//  | LESS
//  | LIMIT
//  | LOCALTIME
//  | LOCALTIMESTAMP
//  | MAXVALUE
//  | MINUS_P
//  | MODIFY_P
//  | NOCYCLE
//  | NOT
//  | NULL_P
//  | OFFSET
//  | ON
//  | ONLY
//  | OR
//  | ORDER
//  | PERFORMANCE
//  | PLACING
//  | PRIMARY
//  | PROCEDURE
//  | REFERENCES
//  | REJECT_P
//  | RETURNING
//  | ROWNUM
//  | SELECT
//  | SESSION_USER
//  | SHRINK
//  | SOME
//  | SYMMETRIC
//  | SYSDATE
//  | TABLE
//  | THEN
//  | TO
//  | TRAILING
//  | TRUE_P
//  | UNION
//  | UNIQUE
//  | USER
//  | USING
//  | VARIADIC
//  | VERIFY
//  | WHEN
//  | WHERE
//  | WINDOW
//  | WITH
//  ;
//
///************************************************************************************************************************************************************/
///* HINT SQL GRAMMAR */
///************************************************************************************************************************************************************/
//
//join_hint_list  : join_hint_item join_hint_list
//  |
//  ;
//
//join_hint_item  : join_order_hint
//  | join_method_hint
//  | NO join_method_hint
//  | stream_hint
//  | NO stream_hint
//  | row_hint
//  | BlockName_P OPEN_PAREN IDENT CLOSE_PAREN
//  | scan_hint
//  | NO scan_hint
//  | skew_hint
//  | HINT_MULTI_NODE_P
//  | pred_push_hint
//  | pred_push_same_level_hint
//  | NO rewrite_hint
//  | gather_hint
//  | set_hint
//  | plancache_hint
//  | no_expand_hint
//  | no_gpc_hint
//  | SQL_IGNORE_P
//  ;
//
//gather_hint  : Gather_P OPEN_PAREN IDENT CLOSE_PAREN
//  ;
//
//no_gpc_hint  : NO_GPC_P
//  ;
//
//no_expand_hint  : No_expand_P
//  ;
//
//guc_value  : IDENT
//  | SCONST
//  | TRUE_P
//  | FALSE_P
//  | ON_P
//  | OFF_P
//  | ICONST
//  | PLUS ICONST
//  | MINUS ICONST
//  | FCONST
//  | PLUS FCONST
//  | MINUS FCONST
//  ;
//
//set_hint  : Set_P OPEN_PAREN IDENT guc_value CLOSE_PAREN
//  | Set_P OPEN_PAREN Rewrite_P guc_value CLOSE_PAREN
//  ;
//
//plancache_hint  : USE_CPLAN_P
//  | USE_GPLAN_P
//  | CHOOSE_ADAPTIVE_GPLAN_P
//  ;
//
//rewrite_hint  : Rewrite_P OPEN_PAREN ident_list CLOSE_PAREN
//  ;
//
//pred_push_hint  : Predpush_P OPEN_PAREN ident_list CLOSE_PAREN
//  | Predpush_P OPEN_PAREN ident_list COMMA IDENT CLOSE_PAREN
//  | NO Predpush_P
//  ;
//
//pred_push_same_level_hint  : PredpushSameLevel_P OPEN_PAREN ident_list COMMA IDENT CLOSE_PAREN
//  ;
//
//join_order_hint  : Leading_P OPEN_PAREN relation_list_with_p CLOSE_PAREN
//  | Leading_P relation_list_with_p
//  ;
//
//join_method_hint  : NestLoop_P OPEN_PAREN ident_list CLOSE_PAREN
//  | MergeJoin_P OPEN_PAREN ident_list CLOSE_PAREN
//  | HashJoin_P OPEN_PAREN ident_list CLOSE_PAREN
//  ;
//
//stream_hint  : Broadcast_P OPEN_PAREN ident_list CLOSE_PAREN
//  | Redistribute_P OPEN_PAREN ident_list CLOSE_PAREN
//  ;
//
//row_hint  : Rows_P OPEN_PAREN ident_list SHARP expr_const CLOSE_PAREN
//  | Rows_P OPEN_PAREN ident_list PLUS expr_const CLOSE_PAREN
//  | Rows_P OPEN_PAREN ident_list MINUS expr_const CLOSE_PAREN
//  | Rows_P OPEN_PAREN ident_list STAR expr_const CLOSE_PAREN
//  ;
//
//scan_hint  : TableScan_P OPEN_PAREN IDENT CLOSE_PAREN
//  | IndexScan_P OPEN_PAREN ident_list CLOSE_PAREN
//  | IndexOnlyScan_P OPEN_PAREN ident_list CLOSE_PAREN
//  ;
//
//skew_hint  : Skew_P OPEN_PAREN skew_relist column_list_p value_list_p CLOSE_PAREN
//  | Skew_P OPEN_PAREN skew_relist column_list_p CLOSE_PAREN
//  ;
//
//relation_list_with_p  : OPEN_PAREN relation_list CLOSE_PAREN
//  ;
//
//relation_item  : IDENT
//  | relation_list_with_p
//  ;
//
//relation_list  : relation_item relation_item
//  | relation_list relation_item
//  ;
//
//ident_list  : IDENT
//  | ident_list IDENT
//  ;
//
//expr_const  : ICONST
//  | FCONST
//  ;
//
//skew_relist  : IDENT
//  | OPEN_PAREN ident_list CLOSE_PAREN
//  ;
//
//column_list_p  : OPEN_PAREN column_list CLOSE_PAREN
//  ;
//
//column_list  : IDENT
//  | column_list IDENT
//  ;
//
//value_list_p  : OPEN_PAREN value_list CLOSE_PAREN
//  ;
//
//value_list  : value_list_item
//  | value_list_with_bracket
//  ;
//
//value_list_with_bracket  : value_list_p
//  | value_list_with_bracket value_list_p
//  ;
//
//value_list_item  : value_type
//  | value_list_item value_type
//  ;
//
//value_type  : ICONST
//  | FCONST
//  | SCONST
//  | BCONST
//  | XCONST
//  | NULL_P
//  | TRUE_P
//  | FALSE_P
//  ;
//
///************************************************************************************************************************************************************/
///* PL/SQL GRAMMAR */
///************************************************************************************************************************************************************/
//
//pl_body  : pl_package_spec
//  | pl_function
//  | pl_package_init
//  ;
//
//pl_package_spec  : PACKAGE decl_sect END
//  ;
//
//pl_package_init  : INSTANTIATION init_proc
//  ;
//
//pl_function  : comp_options pl_block opt_semi
//  ;
//
//comp_options  :
//  | comp_options comp_option
//  ;
//
//comp_option  : SHARP OPTION DUMP
//  | SHARP VARIABLE_CONFLICT ERROR
//  | SHARP VARIABLE_CONFLICT USE_VARIABLE
//  | SHARP VARIABLE_CONFLICT USE_COLUMN
//  ;
//
//opt_semi  :
//  | SEMI
//  ;
//
//pl_block  : decl_sect BEGIN declare_sect_b proc_sect exception_sect END opt_label
//  ;
//
//declare_sect_b  :
//  | declare_stmts
//  ;
//
//declare_stmts  : declare_stmts declare_stmt
//  | declare_stmt
//  ;
//
//declare_stmt  : T_DECLARE_CURSOR decl_varname CURSOR opt_scrollable decl_cursor_args decl_is_for decl_cursor_query
//  | T_DECLARE_CONDITION decl_varname CONDITION FOR condition_value SEMI
//  | T_DECLARE_HANDLER handler_type HANDLER FOR cond_list proc_stmt
//  ;
//
//handler_type  : EXIT
//  | CONTINUE
//  ;
//
//cond_list  : cond_list COMMA cond_element
//  | cond_element
//  ;
//
//cond_element  : any_identifier
//  | SQLSTATE
//  | SQLWARNING
//  | NOT FOUND
//  | SQLEXCEPTION
//  | ICONST
//  ;
//
//condition_value  : SQLSTATE
//  | ICONST
//  ;
//
//decl_sect  : opt_block_label
//  | opt_block_label decl_start
//  | opt_block_label decl_start decl_stmts
//  ;
//
//decl_start  : DECLARE
//  ;
//
//decl_stmts  : decl_stmts decl_stmt
//  | decl_stmt
//  ;
//
//decl_stmt  : decl_statement
//  | DECLARE
//  | LESS_LESS any_identifier GREATER_GREATER
//  ;
//
//pl_as_is  : IS
//  | AS
//  ;
//
//decl_statement  : decl_varname_list decl_const decl_datatype decl_collate decl_notnull decl_defval
//  | decl_varname_list ALIAS FOR decl_aliasitem SEMI
//  | CURSOR decl_varname opt_scrollable decl_cursor_args decl_is_for decl_cursor_query
//  | TYPE decl_varname pl_as_is REF CURSOR SEMI
//  | decl_varname_list T_REFCURSOR SEMI
//  | decl_varname_list SYS_REFCURSOR SEMI
//  | TYPE decl_varname pl_as_is VARRAY OPEN_PAREN ICONST CLOSE_PAREN OF decl_datatype SEMI
//  | TYPE decl_varname pl_as_is VARRAY OPEN_PAREN ICONST CLOSE_PAREN OF record_var SEMI
//  | TYPE decl_varname pl_as_is VARRAY OPEN_PAREN ICONST CLOSE_PAREN OF varray_var SEMI
//  | TYPE decl_varname pl_as_is VARRAY OPEN_PAREN ICONST CLOSE_PAREN OF table_var SEMI
//  | TYPE decl_varname pl_as_is VARRAY OPEN_PAREN ICONST CLOSE_PAREN OF T_REFCURSOR SEMI
//  | decl_varname_list decl_const varray_var decl_defval
//  | TYPE decl_varname pl_as_is TABLE OF decl_datatype decl_notnull SEMI
//  | TYPE decl_varname pl_as_is TABLE OF table_var decl_notnull SEMI
//  | TYPE decl_varname pl_as_is TABLE OF record_var decl_notnull SEMI
//  | TYPE decl_varname pl_as_is TABLE OF varray_var decl_notnull SEMI
//  | TYPE decl_varname pl_as_is TABLE OF T_REFCURSOR decl_notnull SEMI
//  | TYPE decl_varname pl_as_is TABLE OF varray_var decl_notnull INDEX BY decl_datatype SEMI
//  | TYPE decl_varname pl_as_is TABLE OF T_REFCURSOR decl_notnull INDEX BY decl_datatype SEMI
//  | TYPE decl_varname pl_as_is TABLE OF decl_datatype decl_notnull INDEX BY decl_datatype SEMI
//  | TYPE decl_varname pl_as_is TABLE OF table_var decl_notnull INDEX BY decl_datatype SEMI
//  | TYPE decl_varname pl_as_is TABLE OF record_var decl_notnull INDEX BY decl_datatype SEMI
//  | decl_varname_list decl_const table_var decl_defval
//  | TYPE decl_varname pl_as_is RECORD OPEN_PAREN record_attr_list CLOSE_PAREN SEMI
//  | decl_varname_list record_var decl_defval
//  | FUNCTION spec_proc
//  | PROCEDURE spec_proc
//  | PRAGMA any_identifier SEMI
//  | PRAGMA any_identifier OPEN_PAREN any_identifier COMMA error_code CLOSE_PAREN SEMI
//  ;
//
//error_code  : ICONST
//  | MINUS ICONST
//  ;
//
//spec_proc  :
//  ;
//
//init_proc  :
//  ;
//
//record_attr_list  : record_attr
//  | record_attr_list COMMA record_attr
//  ;
//
//record_attr  : pl_attr_name decl_datatype decl_notnull decl_rec_defval
//  | pl_attr_name record_var decl_notnull decl_rec_defval
//  | pl_attr_name T_REFCURSOR decl_notnull decl_rec_defval
//  | pl_attr_name varray_var decl_notnull decl_rec_defval
//  | pl_attr_name table_var decl_notnull decl_rec_defval
//  ;
//
//opt_scrollable  :
//  | NO SCROLL
//  | SCROLL
//  ;
//
//decl_cursor_query  :
//  ;
//
//decl_cursor_args  :
//  | OPEN_PAREN decl_cursor_arglist CLOSE_PAREN
//  ;
//
//decl_cursor_arglist  : decl_cursor_arg
//  | decl_cursor_arglist COMMA decl_cursor_arg
//  ;
//
//decl_cursor_arg  : decl_varname cursor_in_out_option decl_datatype
//  ;
//
//cursor_in_out_option  : IN
//  | OUT
//  |
//  ;
//
//decl_is_for  : IS
//  | FOR
//  ;
//
//decl_aliasitem  : T_WORD
//  | T_CWORD
//  ;
//
//decl_varname  : T_WORD
//  | pl_unreserved_keyword
//  | T_VARRAY
//  | T_RECORD
//  | T_TABLE
//  | T_REFCURSOR
//  | T_TABLE_VAR
//  | T_VARRAY_VAR
//  ;
//
//decl_varname_list  : decl_varname
//  | decl_varname_list COMMA decl_varname
//  ;
//
//decl_const  :
//  | CONSTANT
//  ;
//
//decl_datatype  :
//  ;
//
//decl_collate  :
//  | COLLATE T_WORD
//  | COLLATE T_CWORD
//  ;
//
//decl_notnull  :
//  | NOT NULL
//  ;
//
//decl_defval  : SEMI
//  | decl_defkey
//  ;
//
//decl_rec_defval  :
//  | decl_defkey
//  ;
//
//decl_defkey  : assign_operator
//  | DEFAULT
//  ;
//
//assign_operator  : EQUAL
//  | Colon_equals
//  ;
//
//proc_sect  :
//  | proc_stmts
//  ;
//
//proc_stmts  : proc_stmts proc_stmt
//  | proc_stmt
//  ;
//
//proc_stmt  : pl_block SEMI
//  | stmt_loop
//  | stmt_while
//  | stmt_for
//  | stmt_foreach_a
//  | stmt_commit
//  | stmt_rollback
//  | label_stmts
//  | stmt_savepoint
//  ;
//
//goto_block_label  :
//  | LESS_LESS any_identifier GREATER_GREATER
//  ;
//
//label_stmts  : goto_block_label label_stmt
//  ;
//
//label_stmt  : stmt_assign
//  | stmt_if
//  | stmt_case
//  | stmt_exit
//  | stmt_return
//  | stmt_raise
//  | stmt_execsql
//  | stmt_dynexecute
//  | stmt_perform
//  | stmt_getdiag
//  | stmt_goto
//  | stmt_open
//  | stmt_fetch
//  | stmt_move
//  | stmt_close
//  | stmt_null
//  ;
//
//stmt_perform  : PERFORM expr_until_semi
//  ;
//
//stmt_assign  : assign_var assign_operator expr_until_semi
//  | T_CWORD assign_operator expr_until_semi
//  ;
//
//stmt_getdiag  : GET getdiag_area_opt DIAGNOSTICS getdiag_list SEMI
//  ;
//
//getdiag_area_opt  :
//  | CURRENT
//  | STACKED
//  ;
//
//getdiag_list  : getdiag_list COMMA getdiag_list_item
//  | getdiag_list_item
//  ;
//
//getdiag_list_item  : getdiag_target assign_operator getdiag_item
//  ;
//
//getdiag_item  :
//  ;
//
//getdiag_target  : T_DATUM
//  | T_WORD
//  | T_CWORD
//  ;
//
//table_var  : T_TABLE
//  ;
//
//varray_var  : T_VARRAY
//  ;
//
//record_var  : T_RECORD
//  ;
//
//assign_var  : T_RECORD assign_list
//  | T_VARRAY_VAR assign_list
//  | T_TABLE_VAR assign_list
//  | T_DATUM assign_list
//  | T_PACKAGE_VARIABLE assign_list
//  ;
//
//assign_list  :
//  | assign_list assign_el
//  ;
//
//assign_el  : DOT pl_attr_name
//  | OPEN_PAREN expr_until_parenthesis
//  | OPEN_BRACKET expr_until_rightbracket
//  ;
//
//pl_attr_name  :
//  ;
//
//stmt_goto  : GOTO label_name
//  ;
//
//label_name  : T_WORD SEMI
//  ;
//
//stmt_if  : IF expr_until_then proc_sect stmt_elsifs stmt_else END IF SEMI
//  ;
//
//stmt_elsifs  :
//  | stmt_elsifs ELSIF expr_until_then proc_sect
//  ;
//
//stmt_else  :
//  | ELSE proc_sect
//  ;
//
//stmt_case  : CASE opt_expr_until_when case_when_list opt_case_else END CASE SEMI
//  ;
//
//opt_expr_until_when  :
//  ;
//
//case_when_list  : case_when_list case_when
//  | case_when
//  ;
//
//case_when  : WHEN expr_until_then proc_sect
//  ;
//
//opt_case_else  :
//  | ELSE proc_sect
//  ;
//
//stmt_loop  : opt_block_label LOOP loop_body
//  | label_loop loop_body
//  ;
//
//label_loop  : T_LABELLOOP
//  | COLON LOOP
//  ;
//
//stmt_while  : opt_block_label WHILE expr_until_while_loop loop_body
//  | label_while expr_until_while_loop loop_body
//  | opt_block_label WHILE expr_until_while_loop while_body
//  | label_while expr_until_while_loop while_body
//  | opt_block_label REPEAT proc_sect UNTIL repeat_condition
//  | label_repeat proc_sect UNTIL repeat_condition
//  ;
//
//label_while  : T_LABELWHILE
//  | COLON WHILE
//  ;
//
//label_repeat  : T_LABELREPEAT
//  | COLON REPEAT
//  ;
//
//stmt_for  : opt_block_label FOR for_control loop_body
//  | opt_block_label FORALL forall_control opt_save_exceptions forall_body
//  ;
//
//for_control  : for_variable IN
//  ;
//
//forall_control  : for_variable IN
//  ;
//
//opt_save_exceptions  : SAVE EXCEPTIONS
//  |
//  ;
//
//for_variable  : T_DATUM
//  | T_VARRAY_VAR
//  | T_TABLE_VAR
//  | T_WORD
//  | T_CWORD
//  ;
//
//stmt_foreach_a  : opt_block_label FOREACH for_variable foreach_slice IN ARRAY expr_until_loop loop_body
//  ;
//
//foreach_slice  :
//  | SLICE ICONST
//  ;
//
//forall_body  : stmt_dynexecute
//  | stmt_execsql
//  ;
//
//stmt_exit  : exit_type opt_label opt_exitcond
//  ;
//
//exit_type  : EXIT
//  | CONTINUE
//  | LEAVE
//  | ITERATE
//  ;
//
//stmt_return  : RETURN
//  ;
//
//stmt_raise  : RAISE
//  ;
//
//loop_body  : proc_sect END LOOP opt_label SEMI
//  ;
//
//while_body  : proc_sect END WHILE opt_label SEMI
//  ;
//
//repeat_condition  : repeat_condition_expr REPEAT opt_label SEMI
//  ;
//
//repeat_condition_expr  :
//  ;
//
//stmt_execsql  : ALTER
//  | INSERT
//  | REPLACE
//  | SELECT
//  | UPDATE
//  | DELETE
//  | WITH
//  | MERGE
//  | CALL
//  | T_WORD
//  | unreserved_keyword_func
//  | T_CWORD OPEN_PAREN
//  | T_CWORD SEMI
//  | T_ARRAY_TRIM
//  | T_ARRAY_EXTEND
//  | T_ARRAY_DELETE
//  ;
//
//stmt_dynexecute  : EXECUTE
//  ;
//
//stmt_open  : OPEN cursor_variable
//  ;
//
//stmt_fetch  : FETCH opt_fetch_direction cursor_variable INTO
//  | FETCH opt_fetch_direction cursor_variable BULK COLLECT INTO fetch_into_target fetch_limit_expr
//  ;
//
//stmt_move  : MOVE opt_fetch_direction cursor_variable SEMI
//  ;
//
//opt_fetch_direction  :
//  ;
//
//fetch_limit_expr  : LIMIT
//  | SEMI
//  ;
//
//fetch_into_target  :
//  ;
//
//stmt_close  : CLOSE cursor_variable SEMI
//  ;
//
//stmt_null  : NULL SEMI
//  ;
//
//stmt_commit  : opt_block_label COMMIT SEMI
//  ;
//
//savepoint_name  : any_identifier
//  ;
//
//opt_savepoint_name  : SAVEPOINT savepoint_name
//  | savepoint_name
//  ;
//
//opt_rollback_to  :
//  | TO opt_savepoint_name
//  ;
//
//stmt_rollback  : opt_block_label ROLLBACK opt_rollback_to SEMI
//  ;
//
//stmt_savepoint  : opt_block_label SAVEPOINT savepoint_name SEMI
//  | opt_block_label RELEASE opt_savepoint_name SEMI
//  ;
//
//cursor_variable  : T_DATUM
//  | T_PACKAGE_VARIABLE
//  | T_WORD
//  | T_CWORD
//  ;
//
//exception_sect  :
//  | EXCEPTION proc_exceptions
//  ;
//
//proc_exceptions  : proc_exceptions proc_exception
//  | proc_exception
//  ;
//
//proc_exception  : WHEN proc_conditions THEN proc_sect
//  ;
//
//proc_conditions  : proc_conditions OR proc_condition
//  | proc_condition
//  ;
//
//proc_condition  : any_identifier
//  ;
//
//expr_until_semi  :
//  ;
//
//expr_until_rightbracket  :
//  ;
//
//expr_until_parenthesis  :
//  ;
//
//expr_until_then  :
//  ;
//
//expr_until_loop  :
//  ;
//
//expr_until_while_loop  :
//  ;
//
//opt_block_label  :
//  | LESS_LESS any_identifier GREATER_GREATER
//  ;
//
//opt_label  :
//  | any_identifier
//  ;
//
//opt_exitcond  : SEMI
//  | WHEN expr_until_semi
//  ;
//
//any_identifier  : T_WORD
//  | T_DATUM
//  ;
//
//unreserved_keyword_func  : ABSOLUTE
//  | ALIAS
//  | BACKWARD
//  | CONSTANT
//  | CURRENT
//  | DEBUG
//  | DETAIL
//  | DUMP
//  | ERRCODE
//  | ERROR
//  | EXCEPTIONS
//  | FIRST
//  | FORWARD
//  | HINT
//  | INDEX
//  | INFO
//  | LAST
//  | LOG
//  | MESSAGE
//  | MESSAGE_TEXT
//  | MULTISET
//  | NEXT
//  | NO
//  | NOTICE
//  | OPTION
//  | PACKAGE
//  | INSTANTIATION
//  | PG_EXCEPTION_CONTEXT
//  | PG_EXCEPTION_DETAIL
//  | PG_EXCEPTION_HINT
//  | QUERY
//  | RECORD
//  | RELATIVE
//  | RESULT_OID
//  | RETURNED_SQLSTATE
//  | REVERSE
//  | ROW_COUNT
//  | SCROLL
//  | SLICE
//  | STACKED
//  | SYS_REFCURSOR
//  | USE_COLUMN
//  | USE_VARIABLE
//  | VARIABLE_CONFLICT
//  | VARRAY
//  | WARNING
//  ;
//
//pl_unreserved_keyword  : ABSOLUTE
//  | ALIAS
//  | ALTER
//  | ARRAY
//  | BACKWARD
//  | CALL
//  | COMMIT
//  | CONDITION
//  | CONSTANT
//  | CONTINUE
//  | CURRENT
//  | DEBUG
//  | DETAIL
//  | DISTINCT
//  | DUMP
//  | ERRCODE
//  | ERROR
//  | EXCEPT
//  | EXCEPTIONS
//  | FIRST
//  | FORWARD
//  | HINT
//  | INDEX
//  | INFO
//  | INTERSECT
//  | IS
//  | LAST
//  | LOG
//  | MERGE
//  | MESSAGE
//  | MESSAGE_TEXT
//  | MULTISET
//  | NEXT
//  | NO
//  | NOTICE
//  | OPTION
//  | PACKAGE
//  | INSTANTIATION
//  | PG_EXCEPTION_CONTEXT
//  | PG_EXCEPTION_DETAIL
//  | PG_EXCEPTION_HINT
//  | PRIOR
//  | QUERY
//  | RECORD
//  | RELATIVE
//  | RESULT_OID
//  | RETURNED_SQLSTATE
//  | REVERSE
//  | ROLLBACK
//  | ROW_COUNT
//  | ROWTYPE
//  | SAVE
//  | SCROLL
//  | SLICE
//  | SQLSTATE
//  | STACKED
//  | SYS_REFCURSOR
//  | TABLE
//  | UNION
//  | USE_COLUMN
//  | USE_VARIABLE
//  | VARIABLE_CONFLICT
//  | VARRAY
//  | WARNING
//  | WITH
//  ;
//
///************************************************************************************************************************************************************/
///* NULL TOKEN GRAMMAR */
///************************************************************************************************************************************************************/
//nltk_NULLS_FIRST : ;
//
//nltk_NULLS_LAST : ;
//
//nltk_WITH_TIME : ;
//
//nltk_INCLUDING_ALL : ;
//
//nltk_RENAME_PARTITION : ;
//
//nltk_PARTITION_FOR : ;
//
//nltk_SUBPARTITION_FOR : ;
//
//nltk_ADD_PARTITION : ;
//
//nltk_DROP_PARTITION : ;
//
//nltk_REBUILD_PARTITION : ;
//
//nltk_MODIFY_PARTITION : ;
//
//nltk_ADD_SUBPARTITION : ;
//
//nltk_DROP_SUBPARTITION : ;
//
//nltk_NOT_ENFORCED : ;
//
//nltk_VALID_BEGIN : ;
//
//nltk_DECLARE_CURSOR : ;
//
//nltk_ON_UPDATE_TIME : ;
//
//nltk_START_WITH : ;
//
//nltk_CONNECT_BY : ;
//
//nltk_SHOW_ERRORS : ;
//
//nltk_END_OF_INPUT : ;
//
//nltk_END_OF_INPUT_COLON : ;
//
//nltk_END_OF_PROC : ;
//
//nltk_EVENT_TRIGGER : ;
//
//nltk_NOT_IN : ;
//
//nltk_NOT_BETWEEN : ;
//
//nltk_NOT_LIKE : ;
//
//nltk_NOT_ILIKE : ;
//
//nltk_NOT_SIMILAR : ;
//
//nltk_FORCE_INDEX : ;
//
//nltk_USE_INDEX : ;
