// Generated from java-escape by ANTLR 4.11.1
package com.myplugin.plsqlic3.plugin.customlanguage.sql.parser;


import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PostgreSQLPlpgsqlInnerParser}.
 */
public interface PostgreSQLPlpgsqlInnerParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(PostgreSQLPlpgsqlInnerParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(PostgreSQLPlpgsqlInnerParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#plsqlroot}.
	 * @param ctx the parse tree
	 */
	void enterPlsqlroot(PostgreSQLPlpgsqlInnerParser.PlsqlrootContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#plsqlroot}.
	 * @param ctx the parse tree
	 */
	void exitPlsqlroot(PostgreSQLPlpgsqlInnerParser.PlsqlrootContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmtblock}.
	 * @param ctx the parse tree
	 */
	void enterStmtblock(PostgreSQLPlpgsqlInnerParser.StmtblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmtblock}.
	 * @param ctx the parse tree
	 */
	void exitStmtblock(PostgreSQLPlpgsqlInnerParser.StmtblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmtmulti}.
	 * @param ctx the parse tree
	 */
	void enterStmtmulti(PostgreSQLPlpgsqlInnerParser.StmtmultiContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmtmulti}.
	 * @param ctx the parse tree
	 */
	void exitStmtmulti(PostgreSQLPlpgsqlInnerParser.StmtmultiContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(PostgreSQLPlpgsqlInnerParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(PostgreSQLPlpgsqlInnerParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#plsqlconsolecommand}.
	 * @param ctx the parse tree
	 */
	void enterPlsqlconsolecommand(PostgreSQLPlpgsqlInnerParser.PlsqlconsolecommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#plsqlconsolecommand}.
	 * @param ctx the parse tree
	 */
	void exitPlsqlconsolecommand(PostgreSQLPlpgsqlInnerParser.PlsqlconsolecommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#callstmt}.
	 * @param ctx the parse tree
	 */
	void enterCallstmt(PostgreSQLPlpgsqlInnerParser.CallstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#callstmt}.
	 * @param ctx the parse tree
	 */
	void exitCallstmt(PostgreSQLPlpgsqlInnerParser.CallstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createrolestmt}.
	 * @param ctx the parse tree
	 */
	void enterCreaterolestmt(PostgreSQLPlpgsqlInnerParser.CreaterolestmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createrolestmt}.
	 * @param ctx the parse tree
	 */
	void exitCreaterolestmt(PostgreSQLPlpgsqlInnerParser.CreaterolestmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_with}.
	 * @param ctx the parse tree
	 */
	void enterOpt_with(PostgreSQLPlpgsqlInnerParser.Opt_withContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_with}.
	 * @param ctx the parse tree
	 */
	void exitOpt_with(PostgreSQLPlpgsqlInnerParser.Opt_withContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#optrolelist}.
	 * @param ctx the parse tree
	 */
	void enterOptrolelist(PostgreSQLPlpgsqlInnerParser.OptrolelistContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#optrolelist}.
	 * @param ctx the parse tree
	 */
	void exitOptrolelist(PostgreSQLPlpgsqlInnerParser.OptrolelistContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alteroptrolelist}.
	 * @param ctx the parse tree
	 */
	void enterAlteroptrolelist(PostgreSQLPlpgsqlInnerParser.AlteroptrolelistContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alteroptrolelist}.
	 * @param ctx the parse tree
	 */
	void exitAlteroptrolelist(PostgreSQLPlpgsqlInnerParser.AlteroptrolelistContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alteroptroleelem}.
	 * @param ctx the parse tree
	 */
	void enterAlteroptroleelem(PostgreSQLPlpgsqlInnerParser.AlteroptroleelemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alteroptroleelem}.
	 * @param ctx the parse tree
	 */
	void exitAlteroptroleelem(PostgreSQLPlpgsqlInnerParser.AlteroptroleelemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createoptroleelem}.
	 * @param ctx the parse tree
	 */
	void enterCreateoptroleelem(PostgreSQLPlpgsqlInnerParser.CreateoptroleelemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createoptroleelem}.
	 * @param ctx the parse tree
	 */
	void exitCreateoptroleelem(PostgreSQLPlpgsqlInnerParser.CreateoptroleelemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createuserstmt}.
	 * @param ctx the parse tree
	 */
	void enterCreateuserstmt(PostgreSQLPlpgsqlInnerParser.CreateuserstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createuserstmt}.
	 * @param ctx the parse tree
	 */
	void exitCreateuserstmt(PostgreSQLPlpgsqlInnerParser.CreateuserstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alterrolestmt}.
	 * @param ctx the parse tree
	 */
	void enterAlterrolestmt(PostgreSQLPlpgsqlInnerParser.AlterrolestmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alterrolestmt}.
	 * @param ctx the parse tree
	 */
	void exitAlterrolestmt(PostgreSQLPlpgsqlInnerParser.AlterrolestmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_in_database}.
	 * @param ctx the parse tree
	 */
	void enterOpt_in_database(PostgreSQLPlpgsqlInnerParser.Opt_in_databaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_in_database}.
	 * @param ctx the parse tree
	 */
	void exitOpt_in_database(PostgreSQLPlpgsqlInnerParser.Opt_in_databaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alterrolesetstmt}.
	 * @param ctx the parse tree
	 */
	void enterAlterrolesetstmt(PostgreSQLPlpgsqlInnerParser.AlterrolesetstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alterrolesetstmt}.
	 * @param ctx the parse tree
	 */
	void exitAlterrolesetstmt(PostgreSQLPlpgsqlInnerParser.AlterrolesetstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#droprolestmt}.
	 * @param ctx the parse tree
	 */
	void enterDroprolestmt(PostgreSQLPlpgsqlInnerParser.DroprolestmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#droprolestmt}.
	 * @param ctx the parse tree
	 */
	void exitDroprolestmt(PostgreSQLPlpgsqlInnerParser.DroprolestmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#creategroupstmt}.
	 * @param ctx the parse tree
	 */
	void enterCreategroupstmt(PostgreSQLPlpgsqlInnerParser.CreategroupstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#creategroupstmt}.
	 * @param ctx the parse tree
	 */
	void exitCreategroupstmt(PostgreSQLPlpgsqlInnerParser.CreategroupstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#altergroupstmt}.
	 * @param ctx the parse tree
	 */
	void enterAltergroupstmt(PostgreSQLPlpgsqlInnerParser.AltergroupstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#altergroupstmt}.
	 * @param ctx the parse tree
	 */
	void exitAltergroupstmt(PostgreSQLPlpgsqlInnerParser.AltergroupstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#add_drop}.
	 * @param ctx the parse tree
	 */
	void enterAdd_drop(PostgreSQLPlpgsqlInnerParser.Add_dropContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#add_drop}.
	 * @param ctx the parse tree
	 */
	void exitAdd_drop(PostgreSQLPlpgsqlInnerParser.Add_dropContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createschemastmt}.
	 * @param ctx the parse tree
	 */
	void enterCreateschemastmt(PostgreSQLPlpgsqlInnerParser.CreateschemastmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createschemastmt}.
	 * @param ctx the parse tree
	 */
	void exitCreateschemastmt(PostgreSQLPlpgsqlInnerParser.CreateschemastmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#optschemaname}.
	 * @param ctx the parse tree
	 */
	void enterOptschemaname(PostgreSQLPlpgsqlInnerParser.OptschemanameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#optschemaname}.
	 * @param ctx the parse tree
	 */
	void exitOptschemaname(PostgreSQLPlpgsqlInnerParser.OptschemanameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#optschemaeltlist}.
	 * @param ctx the parse tree
	 */
	void enterOptschemaeltlist(PostgreSQLPlpgsqlInnerParser.OptschemaeltlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#optschemaeltlist}.
	 * @param ctx the parse tree
	 */
	void exitOptschemaeltlist(PostgreSQLPlpgsqlInnerParser.OptschemaeltlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#schema_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSchema_stmt(PostgreSQLPlpgsqlInnerParser.Schema_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#schema_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSchema_stmt(PostgreSQLPlpgsqlInnerParser.Schema_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#variablesetstmt}.
	 * @param ctx the parse tree
	 */
	void enterVariablesetstmt(PostgreSQLPlpgsqlInnerParser.VariablesetstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#variablesetstmt}.
	 * @param ctx the parse tree
	 */
	void exitVariablesetstmt(PostgreSQLPlpgsqlInnerParser.VariablesetstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#set_rest}.
	 * @param ctx the parse tree
	 */
	void enterSet_rest(PostgreSQLPlpgsqlInnerParser.Set_restContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#set_rest}.
	 * @param ctx the parse tree
	 */
	void exitSet_rest(PostgreSQLPlpgsqlInnerParser.Set_restContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#generic_set}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_set(PostgreSQLPlpgsqlInnerParser.Generic_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#generic_set}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_set(PostgreSQLPlpgsqlInnerParser.Generic_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#set_rest_more}.
	 * @param ctx the parse tree
	 */
	void enterSet_rest_more(PostgreSQLPlpgsqlInnerParser.Set_rest_moreContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#set_rest_more}.
	 * @param ctx the parse tree
	 */
	void exitSet_rest_more(PostgreSQLPlpgsqlInnerParser.Set_rest_moreContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#var_name}.
	 * @param ctx the parse tree
	 */
	void enterVar_name(PostgreSQLPlpgsqlInnerParser.Var_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#var_name}.
	 * @param ctx the parse tree
	 */
	void exitVar_name(PostgreSQLPlpgsqlInnerParser.Var_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#var_list}.
	 * @param ctx the parse tree
	 */
	void enterVar_list(PostgreSQLPlpgsqlInnerParser.Var_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#var_list}.
	 * @param ctx the parse tree
	 */
	void exitVar_list(PostgreSQLPlpgsqlInnerParser.Var_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#var_value}.
	 * @param ctx the parse tree
	 */
	void enterVar_value(PostgreSQLPlpgsqlInnerParser.Var_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#var_value}.
	 * @param ctx the parse tree
	 */
	void exitVar_value(PostgreSQLPlpgsqlInnerParser.Var_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#iso_level}.
	 * @param ctx the parse tree
	 */
	void enterIso_level(PostgreSQLPlpgsqlInnerParser.Iso_levelContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#iso_level}.
	 * @param ctx the parse tree
	 */
	void exitIso_level(PostgreSQLPlpgsqlInnerParser.Iso_levelContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_boolean_or_string}.
	 * @param ctx the parse tree
	 */
	void enterOpt_boolean_or_string(PostgreSQLPlpgsqlInnerParser.Opt_boolean_or_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_boolean_or_string}.
	 * @param ctx the parse tree
	 */
	void exitOpt_boolean_or_string(PostgreSQLPlpgsqlInnerParser.Opt_boolean_or_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#zone_value}.
	 * @param ctx the parse tree
	 */
	void enterZone_value(PostgreSQLPlpgsqlInnerParser.Zone_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#zone_value}.
	 * @param ctx the parse tree
	 */
	void exitZone_value(PostgreSQLPlpgsqlInnerParser.Zone_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_encoding}.
	 * @param ctx the parse tree
	 */
	void enterOpt_encoding(PostgreSQLPlpgsqlInnerParser.Opt_encodingContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_encoding}.
	 * @param ctx the parse tree
	 */
	void exitOpt_encoding(PostgreSQLPlpgsqlInnerParser.Opt_encodingContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#nonreservedword_or_sconst}.
	 * @param ctx the parse tree
	 */
	void enterNonreservedword_or_sconst(PostgreSQLPlpgsqlInnerParser.Nonreservedword_or_sconstContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#nonreservedword_or_sconst}.
	 * @param ctx the parse tree
	 */
	void exitNonreservedword_or_sconst(PostgreSQLPlpgsqlInnerParser.Nonreservedword_or_sconstContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#variableresetstmt}.
	 * @param ctx the parse tree
	 */
	void enterVariableresetstmt(PostgreSQLPlpgsqlInnerParser.VariableresetstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#variableresetstmt}.
	 * @param ctx the parse tree
	 */
	void exitVariableresetstmt(PostgreSQLPlpgsqlInnerParser.VariableresetstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#reset_rest}.
	 * @param ctx the parse tree
	 */
	void enterReset_rest(PostgreSQLPlpgsqlInnerParser.Reset_restContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#reset_rest}.
	 * @param ctx the parse tree
	 */
	void exitReset_rest(PostgreSQLPlpgsqlInnerParser.Reset_restContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#generic_reset}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_reset(PostgreSQLPlpgsqlInnerParser.Generic_resetContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#generic_reset}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_reset(PostgreSQLPlpgsqlInnerParser.Generic_resetContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#setresetclause}.
	 * @param ctx the parse tree
	 */
	void enterSetresetclause(PostgreSQLPlpgsqlInnerParser.SetresetclauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#setresetclause}.
	 * @param ctx the parse tree
	 */
	void exitSetresetclause(PostgreSQLPlpgsqlInnerParser.SetresetclauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#functionsetresetclause}.
	 * @param ctx the parse tree
	 */
	void enterFunctionsetresetclause(PostgreSQLPlpgsqlInnerParser.FunctionsetresetclauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#functionsetresetclause}.
	 * @param ctx the parse tree
	 */
	void exitFunctionsetresetclause(PostgreSQLPlpgsqlInnerParser.FunctionsetresetclauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#variableshowstmt}.
	 * @param ctx the parse tree
	 */
	void enterVariableshowstmt(PostgreSQLPlpgsqlInnerParser.VariableshowstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#variableshowstmt}.
	 * @param ctx the parse tree
	 */
	void exitVariableshowstmt(PostgreSQLPlpgsqlInnerParser.VariableshowstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#constraintssetstmt}.
	 * @param ctx the parse tree
	 */
	void enterConstraintssetstmt(PostgreSQLPlpgsqlInnerParser.ConstraintssetstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#constraintssetstmt}.
	 * @param ctx the parse tree
	 */
	void exitConstraintssetstmt(PostgreSQLPlpgsqlInnerParser.ConstraintssetstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#constraints_set_list}.
	 * @param ctx the parse tree
	 */
	void enterConstraints_set_list(PostgreSQLPlpgsqlInnerParser.Constraints_set_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#constraints_set_list}.
	 * @param ctx the parse tree
	 */
	void exitConstraints_set_list(PostgreSQLPlpgsqlInnerParser.Constraints_set_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#constraints_set_mode}.
	 * @param ctx the parse tree
	 */
	void enterConstraints_set_mode(PostgreSQLPlpgsqlInnerParser.Constraints_set_modeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#constraints_set_mode}.
	 * @param ctx the parse tree
	 */
	void exitConstraints_set_mode(PostgreSQLPlpgsqlInnerParser.Constraints_set_modeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#checkpointstmt}.
	 * @param ctx the parse tree
	 */
	void enterCheckpointstmt(PostgreSQLPlpgsqlInnerParser.CheckpointstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#checkpointstmt}.
	 * @param ctx the parse tree
	 */
	void exitCheckpointstmt(PostgreSQLPlpgsqlInnerParser.CheckpointstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#discardstmt}.
	 * @param ctx the parse tree
	 */
	void enterDiscardstmt(PostgreSQLPlpgsqlInnerParser.DiscardstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#discardstmt}.
	 * @param ctx the parse tree
	 */
	void exitDiscardstmt(PostgreSQLPlpgsqlInnerParser.DiscardstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#altertablestmt}.
	 * @param ctx the parse tree
	 */
	void enterAltertablestmt(PostgreSQLPlpgsqlInnerParser.AltertablestmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#altertablestmt}.
	 * @param ctx the parse tree
	 */
	void exitAltertablestmt(PostgreSQLPlpgsqlInnerParser.AltertablestmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alter_table_cmds}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_cmds(PostgreSQLPlpgsqlInnerParser.Alter_table_cmdsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alter_table_cmds}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_cmds(PostgreSQLPlpgsqlInnerParser.Alter_table_cmdsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#partition_cmd}.
	 * @param ctx the parse tree
	 */
	void enterPartition_cmd(PostgreSQLPlpgsqlInnerParser.Partition_cmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#partition_cmd}.
	 * @param ctx the parse tree
	 */
	void exitPartition_cmd(PostgreSQLPlpgsqlInnerParser.Partition_cmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#index_partition_cmd}.
	 * @param ctx the parse tree
	 */
	void enterIndex_partition_cmd(PostgreSQLPlpgsqlInnerParser.Index_partition_cmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#index_partition_cmd}.
	 * @param ctx the parse tree
	 */
	void exitIndex_partition_cmd(PostgreSQLPlpgsqlInnerParser.Index_partition_cmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alter_table_cmd}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_cmd(PostgreSQLPlpgsqlInnerParser.Alter_table_cmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alter_table_cmd}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_cmd(PostgreSQLPlpgsqlInnerParser.Alter_table_cmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alter_column_default}.
	 * @param ctx the parse tree
	 */
	void enterAlter_column_default(PostgreSQLPlpgsqlInnerParser.Alter_column_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alter_column_default}.
	 * @param ctx the parse tree
	 */
	void exitAlter_column_default(PostgreSQLPlpgsqlInnerParser.Alter_column_defaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_drop_behavior}.
	 * @param ctx the parse tree
	 */
	void enterOpt_drop_behavior(PostgreSQLPlpgsqlInnerParser.Opt_drop_behaviorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_drop_behavior}.
	 * @param ctx the parse tree
	 */
	void exitOpt_drop_behavior(PostgreSQLPlpgsqlInnerParser.Opt_drop_behaviorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_collate_clause}.
	 * @param ctx the parse tree
	 */
	void enterOpt_collate_clause(PostgreSQLPlpgsqlInnerParser.Opt_collate_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_collate_clause}.
	 * @param ctx the parse tree
	 */
	void exitOpt_collate_clause(PostgreSQLPlpgsqlInnerParser.Opt_collate_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alter_using}.
	 * @param ctx the parse tree
	 */
	void enterAlter_using(PostgreSQLPlpgsqlInnerParser.Alter_usingContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alter_using}.
	 * @param ctx the parse tree
	 */
	void exitAlter_using(PostgreSQLPlpgsqlInnerParser.Alter_usingContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#replica_identity}.
	 * @param ctx the parse tree
	 */
	void enterReplica_identity(PostgreSQLPlpgsqlInnerParser.Replica_identityContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#replica_identity}.
	 * @param ctx the parse tree
	 */
	void exitReplica_identity(PostgreSQLPlpgsqlInnerParser.Replica_identityContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#reloptions}.
	 * @param ctx the parse tree
	 */
	void enterReloptions(PostgreSQLPlpgsqlInnerParser.ReloptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#reloptions}.
	 * @param ctx the parse tree
	 */
	void exitReloptions(PostgreSQLPlpgsqlInnerParser.ReloptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_reloptions}.
	 * @param ctx the parse tree
	 */
	void enterOpt_reloptions(PostgreSQLPlpgsqlInnerParser.Opt_reloptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_reloptions}.
	 * @param ctx the parse tree
	 */
	void exitOpt_reloptions(PostgreSQLPlpgsqlInnerParser.Opt_reloptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#reloption_list}.
	 * @param ctx the parse tree
	 */
	void enterReloption_list(PostgreSQLPlpgsqlInnerParser.Reloption_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#reloption_list}.
	 * @param ctx the parse tree
	 */
	void exitReloption_list(PostgreSQLPlpgsqlInnerParser.Reloption_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#reloption_elem}.
	 * @param ctx the parse tree
	 */
	void enterReloption_elem(PostgreSQLPlpgsqlInnerParser.Reloption_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#reloption_elem}.
	 * @param ctx the parse tree
	 */
	void exitReloption_elem(PostgreSQLPlpgsqlInnerParser.Reloption_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alter_identity_column_option_list}.
	 * @param ctx the parse tree
	 */
	void enterAlter_identity_column_option_list(PostgreSQLPlpgsqlInnerParser.Alter_identity_column_option_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alter_identity_column_option_list}.
	 * @param ctx the parse tree
	 */
	void exitAlter_identity_column_option_list(PostgreSQLPlpgsqlInnerParser.Alter_identity_column_option_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alter_identity_column_option}.
	 * @param ctx the parse tree
	 */
	void enterAlter_identity_column_option(PostgreSQLPlpgsqlInnerParser.Alter_identity_column_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alter_identity_column_option}.
	 * @param ctx the parse tree
	 */
	void exitAlter_identity_column_option(PostgreSQLPlpgsqlInnerParser.Alter_identity_column_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#partitionboundspec}.
	 * @param ctx the parse tree
	 */
	void enterPartitionboundspec(PostgreSQLPlpgsqlInnerParser.PartitionboundspecContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#partitionboundspec}.
	 * @param ctx the parse tree
	 */
	void exitPartitionboundspec(PostgreSQLPlpgsqlInnerParser.PartitionboundspecContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#hash_partbound_elem}.
	 * @param ctx the parse tree
	 */
	void enterHash_partbound_elem(PostgreSQLPlpgsqlInnerParser.Hash_partbound_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#hash_partbound_elem}.
	 * @param ctx the parse tree
	 */
	void exitHash_partbound_elem(PostgreSQLPlpgsqlInnerParser.Hash_partbound_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#hash_partbound}.
	 * @param ctx the parse tree
	 */
	void enterHash_partbound(PostgreSQLPlpgsqlInnerParser.Hash_partboundContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#hash_partbound}.
	 * @param ctx the parse tree
	 */
	void exitHash_partbound(PostgreSQLPlpgsqlInnerParser.Hash_partboundContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#altercompositetypestmt}.
	 * @param ctx the parse tree
	 */
	void enterAltercompositetypestmt(PostgreSQLPlpgsqlInnerParser.AltercompositetypestmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#altercompositetypestmt}.
	 * @param ctx the parse tree
	 */
	void exitAltercompositetypestmt(PostgreSQLPlpgsqlInnerParser.AltercompositetypestmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alter_type_cmds}.
	 * @param ctx the parse tree
	 */
	void enterAlter_type_cmds(PostgreSQLPlpgsqlInnerParser.Alter_type_cmdsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alter_type_cmds}.
	 * @param ctx the parse tree
	 */
	void exitAlter_type_cmds(PostgreSQLPlpgsqlInnerParser.Alter_type_cmdsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alter_type_cmd}.
	 * @param ctx the parse tree
	 */
	void enterAlter_type_cmd(PostgreSQLPlpgsqlInnerParser.Alter_type_cmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alter_type_cmd}.
	 * @param ctx the parse tree
	 */
	void exitAlter_type_cmd(PostgreSQLPlpgsqlInnerParser.Alter_type_cmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#closeportalstmt}.
	 * @param ctx the parse tree
	 */
	void enterCloseportalstmt(PostgreSQLPlpgsqlInnerParser.CloseportalstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#closeportalstmt}.
	 * @param ctx the parse tree
	 */
	void exitCloseportalstmt(PostgreSQLPlpgsqlInnerParser.CloseportalstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#copystmt}.
	 * @param ctx the parse tree
	 */
	void enterCopystmt(PostgreSQLPlpgsqlInnerParser.CopystmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#copystmt}.
	 * @param ctx the parse tree
	 */
	void exitCopystmt(PostgreSQLPlpgsqlInnerParser.CopystmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#copy_from}.
	 * @param ctx the parse tree
	 */
	void enterCopy_from(PostgreSQLPlpgsqlInnerParser.Copy_fromContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#copy_from}.
	 * @param ctx the parse tree
	 */
	void exitCopy_from(PostgreSQLPlpgsqlInnerParser.Copy_fromContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_program}.
	 * @param ctx the parse tree
	 */
	void enterOpt_program(PostgreSQLPlpgsqlInnerParser.Opt_programContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_program}.
	 * @param ctx the parse tree
	 */
	void exitOpt_program(PostgreSQLPlpgsqlInnerParser.Opt_programContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#copy_file_name}.
	 * @param ctx the parse tree
	 */
	void enterCopy_file_name(PostgreSQLPlpgsqlInnerParser.Copy_file_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#copy_file_name}.
	 * @param ctx the parse tree
	 */
	void exitCopy_file_name(PostgreSQLPlpgsqlInnerParser.Copy_file_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#copy_options}.
	 * @param ctx the parse tree
	 */
	void enterCopy_options(PostgreSQLPlpgsqlInnerParser.Copy_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#copy_options}.
	 * @param ctx the parse tree
	 */
	void exitCopy_options(PostgreSQLPlpgsqlInnerParser.Copy_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#copy_opt_list}.
	 * @param ctx the parse tree
	 */
	void enterCopy_opt_list(PostgreSQLPlpgsqlInnerParser.Copy_opt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#copy_opt_list}.
	 * @param ctx the parse tree
	 */
	void exitCopy_opt_list(PostgreSQLPlpgsqlInnerParser.Copy_opt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#copy_opt_item}.
	 * @param ctx the parse tree
	 */
	void enterCopy_opt_item(PostgreSQLPlpgsqlInnerParser.Copy_opt_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#copy_opt_item}.
	 * @param ctx the parse tree
	 */
	void exitCopy_opt_item(PostgreSQLPlpgsqlInnerParser.Copy_opt_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_binary}.
	 * @param ctx the parse tree
	 */
	void enterOpt_binary(PostgreSQLPlpgsqlInnerParser.Opt_binaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_binary}.
	 * @param ctx the parse tree
	 */
	void exitOpt_binary(PostgreSQLPlpgsqlInnerParser.Opt_binaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#copy_delimiter}.
	 * @param ctx the parse tree
	 */
	void enterCopy_delimiter(PostgreSQLPlpgsqlInnerParser.Copy_delimiterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#copy_delimiter}.
	 * @param ctx the parse tree
	 */
	void exitCopy_delimiter(PostgreSQLPlpgsqlInnerParser.Copy_delimiterContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_using}.
	 * @param ctx the parse tree
	 */
	void enterOpt_using(PostgreSQLPlpgsqlInnerParser.Opt_usingContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_using}.
	 * @param ctx the parse tree
	 */
	void exitOpt_using(PostgreSQLPlpgsqlInnerParser.Opt_usingContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#copy_generic_opt_list}.
	 * @param ctx the parse tree
	 */
	void enterCopy_generic_opt_list(PostgreSQLPlpgsqlInnerParser.Copy_generic_opt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#copy_generic_opt_list}.
	 * @param ctx the parse tree
	 */
	void exitCopy_generic_opt_list(PostgreSQLPlpgsqlInnerParser.Copy_generic_opt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#copy_generic_opt_elem}.
	 * @param ctx the parse tree
	 */
	void enterCopy_generic_opt_elem(PostgreSQLPlpgsqlInnerParser.Copy_generic_opt_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#copy_generic_opt_elem}.
	 * @param ctx the parse tree
	 */
	void exitCopy_generic_opt_elem(PostgreSQLPlpgsqlInnerParser.Copy_generic_opt_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#copy_generic_opt_arg}.
	 * @param ctx the parse tree
	 */
	void enterCopy_generic_opt_arg(PostgreSQLPlpgsqlInnerParser.Copy_generic_opt_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#copy_generic_opt_arg}.
	 * @param ctx the parse tree
	 */
	void exitCopy_generic_opt_arg(PostgreSQLPlpgsqlInnerParser.Copy_generic_opt_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#copy_generic_opt_arg_list}.
	 * @param ctx the parse tree
	 */
	void enterCopy_generic_opt_arg_list(PostgreSQLPlpgsqlInnerParser.Copy_generic_opt_arg_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#copy_generic_opt_arg_list}.
	 * @param ctx the parse tree
	 */
	void exitCopy_generic_opt_arg_list(PostgreSQLPlpgsqlInnerParser.Copy_generic_opt_arg_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#copy_generic_opt_arg_list_item}.
	 * @param ctx the parse tree
	 */
	void enterCopy_generic_opt_arg_list_item(PostgreSQLPlpgsqlInnerParser.Copy_generic_opt_arg_list_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#copy_generic_opt_arg_list_item}.
	 * @param ctx the parse tree
	 */
	void exitCopy_generic_opt_arg_list_item(PostgreSQLPlpgsqlInnerParser.Copy_generic_opt_arg_list_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createstmt}.
	 * @param ctx the parse tree
	 */
	void enterCreatestmt(PostgreSQLPlpgsqlInnerParser.CreatestmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createstmt}.
	 * @param ctx the parse tree
	 */
	void exitCreatestmt(PostgreSQLPlpgsqlInnerParser.CreatestmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opttemp}.
	 * @param ctx the parse tree
	 */
	void enterOpttemp(PostgreSQLPlpgsqlInnerParser.OpttempContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opttemp}.
	 * @param ctx the parse tree
	 */
	void exitOpttemp(PostgreSQLPlpgsqlInnerParser.OpttempContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opttableelementlist}.
	 * @param ctx the parse tree
	 */
	void enterOpttableelementlist(PostgreSQLPlpgsqlInnerParser.OpttableelementlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opttableelementlist}.
	 * @param ctx the parse tree
	 */
	void exitOpttableelementlist(PostgreSQLPlpgsqlInnerParser.OpttableelementlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opttypedtableelementlist}.
	 * @param ctx the parse tree
	 */
	void enterOpttypedtableelementlist(PostgreSQLPlpgsqlInnerParser.OpttypedtableelementlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opttypedtableelementlist}.
	 * @param ctx the parse tree
	 */
	void exitOpttypedtableelementlist(PostgreSQLPlpgsqlInnerParser.OpttypedtableelementlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#tableelementlist}.
	 * @param ctx the parse tree
	 */
	void enterTableelementlist(PostgreSQLPlpgsqlInnerParser.TableelementlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#tableelementlist}.
	 * @param ctx the parse tree
	 */
	void exitTableelementlist(PostgreSQLPlpgsqlInnerParser.TableelementlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#typedtableelementlist}.
	 * @param ctx the parse tree
	 */
	void enterTypedtableelementlist(PostgreSQLPlpgsqlInnerParser.TypedtableelementlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#typedtableelementlist}.
	 * @param ctx the parse tree
	 */
	void exitTypedtableelementlist(PostgreSQLPlpgsqlInnerParser.TypedtableelementlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#tableelement}.
	 * @param ctx the parse tree
	 */
	void enterTableelement(PostgreSQLPlpgsqlInnerParser.TableelementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#tableelement}.
	 * @param ctx the parse tree
	 */
	void exitTableelement(PostgreSQLPlpgsqlInnerParser.TableelementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#typedtableelement}.
	 * @param ctx the parse tree
	 */
	void enterTypedtableelement(PostgreSQLPlpgsqlInnerParser.TypedtableelementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#typedtableelement}.
	 * @param ctx the parse tree
	 */
	void exitTypedtableelement(PostgreSQLPlpgsqlInnerParser.TypedtableelementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#columnDef}.
	 * @param ctx the parse tree
	 */
	void enterColumnDef(PostgreSQLPlpgsqlInnerParser.ColumnDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#columnDef}.
	 * @param ctx the parse tree
	 */
	void exitColumnDef(PostgreSQLPlpgsqlInnerParser.ColumnDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#columnOptions}.
	 * @param ctx the parse tree
	 */
	void enterColumnOptions(PostgreSQLPlpgsqlInnerParser.ColumnOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#columnOptions}.
	 * @param ctx the parse tree
	 */
	void exitColumnOptions(PostgreSQLPlpgsqlInnerParser.ColumnOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#colquallist}.
	 * @param ctx the parse tree
	 */
	void enterColquallist(PostgreSQLPlpgsqlInnerParser.ColquallistContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#colquallist}.
	 * @param ctx the parse tree
	 */
	void exitColquallist(PostgreSQLPlpgsqlInnerParser.ColquallistContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#colconstraint}.
	 * @param ctx the parse tree
	 */
	void enterColconstraint(PostgreSQLPlpgsqlInnerParser.ColconstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#colconstraint}.
	 * @param ctx the parse tree
	 */
	void exitColconstraint(PostgreSQLPlpgsqlInnerParser.ColconstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#colconstraintelem}.
	 * @param ctx the parse tree
	 */
	void enterColconstraintelem(PostgreSQLPlpgsqlInnerParser.ColconstraintelemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#colconstraintelem}.
	 * @param ctx the parse tree
	 */
	void exitColconstraintelem(PostgreSQLPlpgsqlInnerParser.ColconstraintelemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#generated_when}.
	 * @param ctx the parse tree
	 */
	void enterGenerated_when(PostgreSQLPlpgsqlInnerParser.Generated_whenContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#generated_when}.
	 * @param ctx the parse tree
	 */
	void exitGenerated_when(PostgreSQLPlpgsqlInnerParser.Generated_whenContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#constraintattr}.
	 * @param ctx the parse tree
	 */
	void enterConstraintattr(PostgreSQLPlpgsqlInnerParser.ConstraintattrContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#constraintattr}.
	 * @param ctx the parse tree
	 */
	void exitConstraintattr(PostgreSQLPlpgsqlInnerParser.ConstraintattrContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#tablelikeclause}.
	 * @param ctx the parse tree
	 */
	void enterTablelikeclause(PostgreSQLPlpgsqlInnerParser.TablelikeclauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#tablelikeclause}.
	 * @param ctx the parse tree
	 */
	void exitTablelikeclause(PostgreSQLPlpgsqlInnerParser.TablelikeclauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#tablelikeoptionlist}.
	 * @param ctx the parse tree
	 */
	void enterTablelikeoptionlist(PostgreSQLPlpgsqlInnerParser.TablelikeoptionlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#tablelikeoptionlist}.
	 * @param ctx the parse tree
	 */
	void exitTablelikeoptionlist(PostgreSQLPlpgsqlInnerParser.TablelikeoptionlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#tablelikeoption}.
	 * @param ctx the parse tree
	 */
	void enterTablelikeoption(PostgreSQLPlpgsqlInnerParser.TablelikeoptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#tablelikeoption}.
	 * @param ctx the parse tree
	 */
	void exitTablelikeoption(PostgreSQLPlpgsqlInnerParser.TablelikeoptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#tableconstraint}.
	 * @param ctx the parse tree
	 */
	void enterTableconstraint(PostgreSQLPlpgsqlInnerParser.TableconstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#tableconstraint}.
	 * @param ctx the parse tree
	 */
	void exitTableconstraint(PostgreSQLPlpgsqlInnerParser.TableconstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#constraintelem}.
	 * @param ctx the parse tree
	 */
	void enterConstraintelem(PostgreSQLPlpgsqlInnerParser.ConstraintelemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#constraintelem}.
	 * @param ctx the parse tree
	 */
	void exitConstraintelem(PostgreSQLPlpgsqlInnerParser.ConstraintelemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_no_inherit}.
	 * @param ctx the parse tree
	 */
	void enterOpt_no_inherit(PostgreSQLPlpgsqlInnerParser.Opt_no_inheritContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_no_inherit}.
	 * @param ctx the parse tree
	 */
	void exitOpt_no_inherit(PostgreSQLPlpgsqlInnerParser.Opt_no_inheritContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_column_list}.
	 * @param ctx the parse tree
	 */
	void enterOpt_column_list(PostgreSQLPlpgsqlInnerParser.Opt_column_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_column_list}.
	 * @param ctx the parse tree
	 */
	void exitOpt_column_list(PostgreSQLPlpgsqlInnerParser.Opt_column_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#columnlist}.
	 * @param ctx the parse tree
	 */
	void enterColumnlist(PostgreSQLPlpgsqlInnerParser.ColumnlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#columnlist}.
	 * @param ctx the parse tree
	 */
	void exitColumnlist(PostgreSQLPlpgsqlInnerParser.ColumnlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#columnElem}.
	 * @param ctx the parse tree
	 */
	void enterColumnElem(PostgreSQLPlpgsqlInnerParser.ColumnElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#columnElem}.
	 * @param ctx the parse tree
	 */
	void exitColumnElem(PostgreSQLPlpgsqlInnerParser.ColumnElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_c_include}.
	 * @param ctx the parse tree
	 */
	void enterOpt_c_include(PostgreSQLPlpgsqlInnerParser.Opt_c_includeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_c_include}.
	 * @param ctx the parse tree
	 */
	void exitOpt_c_include(PostgreSQLPlpgsqlInnerParser.Opt_c_includeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#key_match}.
	 * @param ctx the parse tree
	 */
	void enterKey_match(PostgreSQLPlpgsqlInnerParser.Key_matchContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#key_match}.
	 * @param ctx the parse tree
	 */
	void exitKey_match(PostgreSQLPlpgsqlInnerParser.Key_matchContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#exclusionconstraintlist}.
	 * @param ctx the parse tree
	 */
	void enterExclusionconstraintlist(PostgreSQLPlpgsqlInnerParser.ExclusionconstraintlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#exclusionconstraintlist}.
	 * @param ctx the parse tree
	 */
	void exitExclusionconstraintlist(PostgreSQLPlpgsqlInnerParser.ExclusionconstraintlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#exclusionconstraintelem}.
	 * @param ctx the parse tree
	 */
	void enterExclusionconstraintelem(PostgreSQLPlpgsqlInnerParser.ExclusionconstraintelemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#exclusionconstraintelem}.
	 * @param ctx the parse tree
	 */
	void exitExclusionconstraintelem(PostgreSQLPlpgsqlInnerParser.ExclusionconstraintelemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#exclusionwhereclause}.
	 * @param ctx the parse tree
	 */
	void enterExclusionwhereclause(PostgreSQLPlpgsqlInnerParser.ExclusionwhereclauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#exclusionwhereclause}.
	 * @param ctx the parse tree
	 */
	void exitExclusionwhereclause(PostgreSQLPlpgsqlInnerParser.ExclusionwhereclauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#key_actions}.
	 * @param ctx the parse tree
	 */
	void enterKey_actions(PostgreSQLPlpgsqlInnerParser.Key_actionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#key_actions}.
	 * @param ctx the parse tree
	 */
	void exitKey_actions(PostgreSQLPlpgsqlInnerParser.Key_actionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#key_update}.
	 * @param ctx the parse tree
	 */
	void enterKey_update(PostgreSQLPlpgsqlInnerParser.Key_updateContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#key_update}.
	 * @param ctx the parse tree
	 */
	void exitKey_update(PostgreSQLPlpgsqlInnerParser.Key_updateContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#key_delete}.
	 * @param ctx the parse tree
	 */
	void enterKey_delete(PostgreSQLPlpgsqlInnerParser.Key_deleteContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#key_delete}.
	 * @param ctx the parse tree
	 */
	void exitKey_delete(PostgreSQLPlpgsqlInnerParser.Key_deleteContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#key_action}.
	 * @param ctx the parse tree
	 */
	void enterKey_action(PostgreSQLPlpgsqlInnerParser.Key_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#key_action}.
	 * @param ctx the parse tree
	 */
	void exitKey_action(PostgreSQLPlpgsqlInnerParser.Key_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#optinherit}.
	 * @param ctx the parse tree
	 */
	void enterOptinherit(PostgreSQLPlpgsqlInnerParser.OptinheritContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#optinherit}.
	 * @param ctx the parse tree
	 */
	void exitOptinherit(PostgreSQLPlpgsqlInnerParser.OptinheritContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#optpartitionspec}.
	 * @param ctx the parse tree
	 */
	void enterOptpartitionspec(PostgreSQLPlpgsqlInnerParser.OptpartitionspecContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#optpartitionspec}.
	 * @param ctx the parse tree
	 */
	void exitOptpartitionspec(PostgreSQLPlpgsqlInnerParser.OptpartitionspecContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#partitionspec}.
	 * @param ctx the parse tree
	 */
	void enterPartitionspec(PostgreSQLPlpgsqlInnerParser.PartitionspecContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#partitionspec}.
	 * @param ctx the parse tree
	 */
	void exitPartitionspec(PostgreSQLPlpgsqlInnerParser.PartitionspecContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#part_params}.
	 * @param ctx the parse tree
	 */
	void enterPart_params(PostgreSQLPlpgsqlInnerParser.Part_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#part_params}.
	 * @param ctx the parse tree
	 */
	void exitPart_params(PostgreSQLPlpgsqlInnerParser.Part_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#part_elem}.
	 * @param ctx the parse tree
	 */
	void enterPart_elem(PostgreSQLPlpgsqlInnerParser.Part_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#part_elem}.
	 * @param ctx the parse tree
	 */
	void exitPart_elem(PostgreSQLPlpgsqlInnerParser.Part_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#table_access_method_clause}.
	 * @param ctx the parse tree
	 */
	void enterTable_access_method_clause(PostgreSQLPlpgsqlInnerParser.Table_access_method_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#table_access_method_clause}.
	 * @param ctx the parse tree
	 */
	void exitTable_access_method_clause(PostgreSQLPlpgsqlInnerParser.Table_access_method_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#optwith}.
	 * @param ctx the parse tree
	 */
	void enterOptwith(PostgreSQLPlpgsqlInnerParser.OptwithContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#optwith}.
	 * @param ctx the parse tree
	 */
	void exitOptwith(PostgreSQLPlpgsqlInnerParser.OptwithContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#oncommitoption}.
	 * @param ctx the parse tree
	 */
	void enterOncommitoption(PostgreSQLPlpgsqlInnerParser.OncommitoptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#oncommitoption}.
	 * @param ctx the parse tree
	 */
	void exitOncommitoption(PostgreSQLPlpgsqlInnerParser.OncommitoptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opttablespace}.
	 * @param ctx the parse tree
	 */
	void enterOpttablespace(PostgreSQLPlpgsqlInnerParser.OpttablespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opttablespace}.
	 * @param ctx the parse tree
	 */
	void exitOpttablespace(PostgreSQLPlpgsqlInnerParser.OpttablespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#optconstablespace}.
	 * @param ctx the parse tree
	 */
	void enterOptconstablespace(PostgreSQLPlpgsqlInnerParser.OptconstablespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#optconstablespace}.
	 * @param ctx the parse tree
	 */
	void exitOptconstablespace(PostgreSQLPlpgsqlInnerParser.OptconstablespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#existingindex}.
	 * @param ctx the parse tree
	 */
	void enterExistingindex(PostgreSQLPlpgsqlInnerParser.ExistingindexContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#existingindex}.
	 * @param ctx the parse tree
	 */
	void exitExistingindex(PostgreSQLPlpgsqlInnerParser.ExistingindexContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createstatsstmt}.
	 * @param ctx the parse tree
	 */
	void enterCreatestatsstmt(PostgreSQLPlpgsqlInnerParser.CreatestatsstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createstatsstmt}.
	 * @param ctx the parse tree
	 */
	void exitCreatestatsstmt(PostgreSQLPlpgsqlInnerParser.CreatestatsstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alterstatsstmt}.
	 * @param ctx the parse tree
	 */
	void enterAlterstatsstmt(PostgreSQLPlpgsqlInnerParser.AlterstatsstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alterstatsstmt}.
	 * @param ctx the parse tree
	 */
	void exitAlterstatsstmt(PostgreSQLPlpgsqlInnerParser.AlterstatsstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createasstmt}.
	 * @param ctx the parse tree
	 */
	void enterCreateasstmt(PostgreSQLPlpgsqlInnerParser.CreateasstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createasstmt}.
	 * @param ctx the parse tree
	 */
	void exitCreateasstmt(PostgreSQLPlpgsqlInnerParser.CreateasstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#create_as_target}.
	 * @param ctx the parse tree
	 */
	void enterCreate_as_target(PostgreSQLPlpgsqlInnerParser.Create_as_targetContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#create_as_target}.
	 * @param ctx the parse tree
	 */
	void exitCreate_as_target(PostgreSQLPlpgsqlInnerParser.Create_as_targetContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_with_data}.
	 * @param ctx the parse tree
	 */
	void enterOpt_with_data(PostgreSQLPlpgsqlInnerParser.Opt_with_dataContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_with_data}.
	 * @param ctx the parse tree
	 */
	void exitOpt_with_data(PostgreSQLPlpgsqlInnerParser.Opt_with_dataContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#creatematviewstmt}.
	 * @param ctx the parse tree
	 */
	void enterCreatematviewstmt(PostgreSQLPlpgsqlInnerParser.CreatematviewstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#creatematviewstmt}.
	 * @param ctx the parse tree
	 */
	void exitCreatematviewstmt(PostgreSQLPlpgsqlInnerParser.CreatematviewstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#create_mv_target}.
	 * @param ctx the parse tree
	 */
	void enterCreate_mv_target(PostgreSQLPlpgsqlInnerParser.Create_mv_targetContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#create_mv_target}.
	 * @param ctx the parse tree
	 */
	void exitCreate_mv_target(PostgreSQLPlpgsqlInnerParser.Create_mv_targetContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#optnolog}.
	 * @param ctx the parse tree
	 */
	void enterOptnolog(PostgreSQLPlpgsqlInnerParser.OptnologContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#optnolog}.
	 * @param ctx the parse tree
	 */
	void exitOptnolog(PostgreSQLPlpgsqlInnerParser.OptnologContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#refreshmatviewstmt}.
	 * @param ctx the parse tree
	 */
	void enterRefreshmatviewstmt(PostgreSQLPlpgsqlInnerParser.RefreshmatviewstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#refreshmatviewstmt}.
	 * @param ctx the parse tree
	 */
	void exitRefreshmatviewstmt(PostgreSQLPlpgsqlInnerParser.RefreshmatviewstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createseqstmt}.
	 * @param ctx the parse tree
	 */
	void enterCreateseqstmt(PostgreSQLPlpgsqlInnerParser.CreateseqstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createseqstmt}.
	 * @param ctx the parse tree
	 */
	void exitCreateseqstmt(PostgreSQLPlpgsqlInnerParser.CreateseqstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alterseqstmt}.
	 * @param ctx the parse tree
	 */
	void enterAlterseqstmt(PostgreSQLPlpgsqlInnerParser.AlterseqstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alterseqstmt}.
	 * @param ctx the parse tree
	 */
	void exitAlterseqstmt(PostgreSQLPlpgsqlInnerParser.AlterseqstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#optseqoptlist}.
	 * @param ctx the parse tree
	 */
	void enterOptseqoptlist(PostgreSQLPlpgsqlInnerParser.OptseqoptlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#optseqoptlist}.
	 * @param ctx the parse tree
	 */
	void exitOptseqoptlist(PostgreSQLPlpgsqlInnerParser.OptseqoptlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#optparenthesizedseqoptlist}.
	 * @param ctx the parse tree
	 */
	void enterOptparenthesizedseqoptlist(PostgreSQLPlpgsqlInnerParser.OptparenthesizedseqoptlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#optparenthesizedseqoptlist}.
	 * @param ctx the parse tree
	 */
	void exitOptparenthesizedseqoptlist(PostgreSQLPlpgsqlInnerParser.OptparenthesizedseqoptlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#seqoptlist}.
	 * @param ctx the parse tree
	 */
	void enterSeqoptlist(PostgreSQLPlpgsqlInnerParser.SeqoptlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#seqoptlist}.
	 * @param ctx the parse tree
	 */
	void exitSeqoptlist(PostgreSQLPlpgsqlInnerParser.SeqoptlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#seqoptelem}.
	 * @param ctx the parse tree
	 */
	void enterSeqoptelem(PostgreSQLPlpgsqlInnerParser.SeqoptelemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#seqoptelem}.
	 * @param ctx the parse tree
	 */
	void exitSeqoptelem(PostgreSQLPlpgsqlInnerParser.SeqoptelemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_by}.
	 * @param ctx the parse tree
	 */
	void enterOpt_by(PostgreSQLPlpgsqlInnerParser.Opt_byContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_by}.
	 * @param ctx the parse tree
	 */
	void exitOpt_by(PostgreSQLPlpgsqlInnerParser.Opt_byContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#numericonly}.
	 * @param ctx the parse tree
	 */
	void enterNumericonly(PostgreSQLPlpgsqlInnerParser.NumericonlyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#numericonly}.
	 * @param ctx the parse tree
	 */
	void exitNumericonly(PostgreSQLPlpgsqlInnerParser.NumericonlyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#numericonly_list}.
	 * @param ctx the parse tree
	 */
	void enterNumericonly_list(PostgreSQLPlpgsqlInnerParser.Numericonly_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#numericonly_list}.
	 * @param ctx the parse tree
	 */
	void exitNumericonly_list(PostgreSQLPlpgsqlInnerParser.Numericonly_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createplangstmt}.
	 * @param ctx the parse tree
	 */
	void enterCreateplangstmt(PostgreSQLPlpgsqlInnerParser.CreateplangstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createplangstmt}.
	 * @param ctx the parse tree
	 */
	void exitCreateplangstmt(PostgreSQLPlpgsqlInnerParser.CreateplangstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_trusted}.
	 * @param ctx the parse tree
	 */
	void enterOpt_trusted(PostgreSQLPlpgsqlInnerParser.Opt_trustedContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_trusted}.
	 * @param ctx the parse tree
	 */
	void exitOpt_trusted(PostgreSQLPlpgsqlInnerParser.Opt_trustedContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#handler_name}.
	 * @param ctx the parse tree
	 */
	void enterHandler_name(PostgreSQLPlpgsqlInnerParser.Handler_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#handler_name}.
	 * @param ctx the parse tree
	 */
	void exitHandler_name(PostgreSQLPlpgsqlInnerParser.Handler_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_inline_handler}.
	 * @param ctx the parse tree
	 */
	void enterOpt_inline_handler(PostgreSQLPlpgsqlInnerParser.Opt_inline_handlerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_inline_handler}.
	 * @param ctx the parse tree
	 */
	void exitOpt_inline_handler(PostgreSQLPlpgsqlInnerParser.Opt_inline_handlerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#validator_clause}.
	 * @param ctx the parse tree
	 */
	void enterValidator_clause(PostgreSQLPlpgsqlInnerParser.Validator_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#validator_clause}.
	 * @param ctx the parse tree
	 */
	void exitValidator_clause(PostgreSQLPlpgsqlInnerParser.Validator_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_validator}.
	 * @param ctx the parse tree
	 */
	void enterOpt_validator(PostgreSQLPlpgsqlInnerParser.Opt_validatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_validator}.
	 * @param ctx the parse tree
	 */
	void exitOpt_validator(PostgreSQLPlpgsqlInnerParser.Opt_validatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_procedural}.
	 * @param ctx the parse tree
	 */
	void enterOpt_procedural(PostgreSQLPlpgsqlInnerParser.Opt_proceduralContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_procedural}.
	 * @param ctx the parse tree
	 */
	void exitOpt_procedural(PostgreSQLPlpgsqlInnerParser.Opt_proceduralContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createtablespacestmt}.
	 * @param ctx the parse tree
	 */
	void enterCreatetablespacestmt(PostgreSQLPlpgsqlInnerParser.CreatetablespacestmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createtablespacestmt}.
	 * @param ctx the parse tree
	 */
	void exitCreatetablespacestmt(PostgreSQLPlpgsqlInnerParser.CreatetablespacestmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opttablespaceowner}.
	 * @param ctx the parse tree
	 */
	void enterOpttablespaceowner(PostgreSQLPlpgsqlInnerParser.OpttablespaceownerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opttablespaceowner}.
	 * @param ctx the parse tree
	 */
	void exitOpttablespaceowner(PostgreSQLPlpgsqlInnerParser.OpttablespaceownerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#droptablespacestmt}.
	 * @param ctx the parse tree
	 */
	void enterDroptablespacestmt(PostgreSQLPlpgsqlInnerParser.DroptablespacestmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#droptablespacestmt}.
	 * @param ctx the parse tree
	 */
	void exitDroptablespacestmt(PostgreSQLPlpgsqlInnerParser.DroptablespacestmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createextensionstmt}.
	 * @param ctx the parse tree
	 */
	void enterCreateextensionstmt(PostgreSQLPlpgsqlInnerParser.CreateextensionstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createextensionstmt}.
	 * @param ctx the parse tree
	 */
	void exitCreateextensionstmt(PostgreSQLPlpgsqlInnerParser.CreateextensionstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#create_extension_opt_list}.
	 * @param ctx the parse tree
	 */
	void enterCreate_extension_opt_list(PostgreSQLPlpgsqlInnerParser.Create_extension_opt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#create_extension_opt_list}.
	 * @param ctx the parse tree
	 */
	void exitCreate_extension_opt_list(PostgreSQLPlpgsqlInnerParser.Create_extension_opt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#create_extension_opt_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_extension_opt_item(PostgreSQLPlpgsqlInnerParser.Create_extension_opt_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#create_extension_opt_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_extension_opt_item(PostgreSQLPlpgsqlInnerParser.Create_extension_opt_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alterextensionstmt}.
	 * @param ctx the parse tree
	 */
	void enterAlterextensionstmt(PostgreSQLPlpgsqlInnerParser.AlterextensionstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alterextensionstmt}.
	 * @param ctx the parse tree
	 */
	void exitAlterextensionstmt(PostgreSQLPlpgsqlInnerParser.AlterextensionstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alter_extension_opt_list}.
	 * @param ctx the parse tree
	 */
	void enterAlter_extension_opt_list(PostgreSQLPlpgsqlInnerParser.Alter_extension_opt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alter_extension_opt_list}.
	 * @param ctx the parse tree
	 */
	void exitAlter_extension_opt_list(PostgreSQLPlpgsqlInnerParser.Alter_extension_opt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alter_extension_opt_item}.
	 * @param ctx the parse tree
	 */
	void enterAlter_extension_opt_item(PostgreSQLPlpgsqlInnerParser.Alter_extension_opt_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alter_extension_opt_item}.
	 * @param ctx the parse tree
	 */
	void exitAlter_extension_opt_item(PostgreSQLPlpgsqlInnerParser.Alter_extension_opt_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alterextensioncontentsstmt}.
	 * @param ctx the parse tree
	 */
	void enterAlterextensioncontentsstmt(PostgreSQLPlpgsqlInnerParser.AlterextensioncontentsstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alterextensioncontentsstmt}.
	 * @param ctx the parse tree
	 */
	void exitAlterextensioncontentsstmt(PostgreSQLPlpgsqlInnerParser.AlterextensioncontentsstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createfdwstmt}.
	 * @param ctx the parse tree
	 */
	void enterCreatefdwstmt(PostgreSQLPlpgsqlInnerParser.CreatefdwstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createfdwstmt}.
	 * @param ctx the parse tree
	 */
	void exitCreatefdwstmt(PostgreSQLPlpgsqlInnerParser.CreatefdwstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#fdw_option}.
	 * @param ctx the parse tree
	 */
	void enterFdw_option(PostgreSQLPlpgsqlInnerParser.Fdw_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#fdw_option}.
	 * @param ctx the parse tree
	 */
	void exitFdw_option(PostgreSQLPlpgsqlInnerParser.Fdw_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#fdw_options}.
	 * @param ctx the parse tree
	 */
	void enterFdw_options(PostgreSQLPlpgsqlInnerParser.Fdw_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#fdw_options}.
	 * @param ctx the parse tree
	 */
	void exitFdw_options(PostgreSQLPlpgsqlInnerParser.Fdw_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_fdw_options}.
	 * @param ctx the parse tree
	 */
	void enterOpt_fdw_options(PostgreSQLPlpgsqlInnerParser.Opt_fdw_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_fdw_options}.
	 * @param ctx the parse tree
	 */
	void exitOpt_fdw_options(PostgreSQLPlpgsqlInnerParser.Opt_fdw_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alterfdwstmt}.
	 * @param ctx the parse tree
	 */
	void enterAlterfdwstmt(PostgreSQLPlpgsqlInnerParser.AlterfdwstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alterfdwstmt}.
	 * @param ctx the parse tree
	 */
	void exitAlterfdwstmt(PostgreSQLPlpgsqlInnerParser.AlterfdwstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#create_generic_options}.
	 * @param ctx the parse tree
	 */
	void enterCreate_generic_options(PostgreSQLPlpgsqlInnerParser.Create_generic_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#create_generic_options}.
	 * @param ctx the parse tree
	 */
	void exitCreate_generic_options(PostgreSQLPlpgsqlInnerParser.Create_generic_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#generic_option_list}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_option_list(PostgreSQLPlpgsqlInnerParser.Generic_option_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#generic_option_list}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_option_list(PostgreSQLPlpgsqlInnerParser.Generic_option_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alter_generic_options}.
	 * @param ctx the parse tree
	 */
	void enterAlter_generic_options(PostgreSQLPlpgsqlInnerParser.Alter_generic_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alter_generic_options}.
	 * @param ctx the parse tree
	 */
	void exitAlter_generic_options(PostgreSQLPlpgsqlInnerParser.Alter_generic_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alter_generic_option_list}.
	 * @param ctx the parse tree
	 */
	void enterAlter_generic_option_list(PostgreSQLPlpgsqlInnerParser.Alter_generic_option_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alter_generic_option_list}.
	 * @param ctx the parse tree
	 */
	void exitAlter_generic_option_list(PostgreSQLPlpgsqlInnerParser.Alter_generic_option_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alter_generic_option_elem}.
	 * @param ctx the parse tree
	 */
	void enterAlter_generic_option_elem(PostgreSQLPlpgsqlInnerParser.Alter_generic_option_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alter_generic_option_elem}.
	 * @param ctx the parse tree
	 */
	void exitAlter_generic_option_elem(PostgreSQLPlpgsqlInnerParser.Alter_generic_option_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#generic_option_elem}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_option_elem(PostgreSQLPlpgsqlInnerParser.Generic_option_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#generic_option_elem}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_option_elem(PostgreSQLPlpgsqlInnerParser.Generic_option_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#generic_option_name}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_option_name(PostgreSQLPlpgsqlInnerParser.Generic_option_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#generic_option_name}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_option_name(PostgreSQLPlpgsqlInnerParser.Generic_option_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#generic_option_arg}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_option_arg(PostgreSQLPlpgsqlInnerParser.Generic_option_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#generic_option_arg}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_option_arg(PostgreSQLPlpgsqlInnerParser.Generic_option_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createforeignserverstmt}.
	 * @param ctx the parse tree
	 */
	void enterCreateforeignserverstmt(PostgreSQLPlpgsqlInnerParser.CreateforeignserverstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createforeignserverstmt}.
	 * @param ctx the parse tree
	 */
	void exitCreateforeignserverstmt(PostgreSQLPlpgsqlInnerParser.CreateforeignserverstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_type}.
	 * @param ctx the parse tree
	 */
	void enterOpt_type(PostgreSQLPlpgsqlInnerParser.Opt_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_type}.
	 * @param ctx the parse tree
	 */
	void exitOpt_type(PostgreSQLPlpgsqlInnerParser.Opt_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#foreign_server_version}.
	 * @param ctx the parse tree
	 */
	void enterForeign_server_version(PostgreSQLPlpgsqlInnerParser.Foreign_server_versionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#foreign_server_version}.
	 * @param ctx the parse tree
	 */
	void exitForeign_server_version(PostgreSQLPlpgsqlInnerParser.Foreign_server_versionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_foreign_server_version}.
	 * @param ctx the parse tree
	 */
	void enterOpt_foreign_server_version(PostgreSQLPlpgsqlInnerParser.Opt_foreign_server_versionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_foreign_server_version}.
	 * @param ctx the parse tree
	 */
	void exitOpt_foreign_server_version(PostgreSQLPlpgsqlInnerParser.Opt_foreign_server_versionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alterforeignserverstmt}.
	 * @param ctx the parse tree
	 */
	void enterAlterforeignserverstmt(PostgreSQLPlpgsqlInnerParser.AlterforeignserverstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alterforeignserverstmt}.
	 * @param ctx the parse tree
	 */
	void exitAlterforeignserverstmt(PostgreSQLPlpgsqlInnerParser.AlterforeignserverstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createforeigntablestmt}.
	 * @param ctx the parse tree
	 */
	void enterCreateforeigntablestmt(PostgreSQLPlpgsqlInnerParser.CreateforeigntablestmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createforeigntablestmt}.
	 * @param ctx the parse tree
	 */
	void exitCreateforeigntablestmt(PostgreSQLPlpgsqlInnerParser.CreateforeigntablestmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#importforeignschemastmt}.
	 * @param ctx the parse tree
	 */
	void enterImportforeignschemastmt(PostgreSQLPlpgsqlInnerParser.ImportforeignschemastmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#importforeignschemastmt}.
	 * @param ctx the parse tree
	 */
	void exitImportforeignschemastmt(PostgreSQLPlpgsqlInnerParser.ImportforeignschemastmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#import_qualification_type}.
	 * @param ctx the parse tree
	 */
	void enterImport_qualification_type(PostgreSQLPlpgsqlInnerParser.Import_qualification_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#import_qualification_type}.
	 * @param ctx the parse tree
	 */
	void exitImport_qualification_type(PostgreSQLPlpgsqlInnerParser.Import_qualification_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#import_qualification}.
	 * @param ctx the parse tree
	 */
	void enterImport_qualification(PostgreSQLPlpgsqlInnerParser.Import_qualificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#import_qualification}.
	 * @param ctx the parse tree
	 */
	void exitImport_qualification(PostgreSQLPlpgsqlInnerParser.Import_qualificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createusermappingstmt}.
	 * @param ctx the parse tree
	 */
	void enterCreateusermappingstmt(PostgreSQLPlpgsqlInnerParser.CreateusermappingstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createusermappingstmt}.
	 * @param ctx the parse tree
	 */
	void exitCreateusermappingstmt(PostgreSQLPlpgsqlInnerParser.CreateusermappingstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#auth_ident}.
	 * @param ctx the parse tree
	 */
	void enterAuth_ident(PostgreSQLPlpgsqlInnerParser.Auth_identContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#auth_ident}.
	 * @param ctx the parse tree
	 */
	void exitAuth_ident(PostgreSQLPlpgsqlInnerParser.Auth_identContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#dropusermappingstmt}.
	 * @param ctx the parse tree
	 */
	void enterDropusermappingstmt(PostgreSQLPlpgsqlInnerParser.DropusermappingstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#dropusermappingstmt}.
	 * @param ctx the parse tree
	 */
	void exitDropusermappingstmt(PostgreSQLPlpgsqlInnerParser.DropusermappingstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alterusermappingstmt}.
	 * @param ctx the parse tree
	 */
	void enterAlterusermappingstmt(PostgreSQLPlpgsqlInnerParser.AlterusermappingstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alterusermappingstmt}.
	 * @param ctx the parse tree
	 */
	void exitAlterusermappingstmt(PostgreSQLPlpgsqlInnerParser.AlterusermappingstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createpolicystmt}.
	 * @param ctx the parse tree
	 */
	void enterCreatepolicystmt(PostgreSQLPlpgsqlInnerParser.CreatepolicystmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createpolicystmt}.
	 * @param ctx the parse tree
	 */
	void exitCreatepolicystmt(PostgreSQLPlpgsqlInnerParser.CreatepolicystmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alterpolicystmt}.
	 * @param ctx the parse tree
	 */
	void enterAlterpolicystmt(PostgreSQLPlpgsqlInnerParser.AlterpolicystmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alterpolicystmt}.
	 * @param ctx the parse tree
	 */
	void exitAlterpolicystmt(PostgreSQLPlpgsqlInnerParser.AlterpolicystmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#rowsecurityoptionalexpr}.
	 * @param ctx the parse tree
	 */
	void enterRowsecurityoptionalexpr(PostgreSQLPlpgsqlInnerParser.RowsecurityoptionalexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#rowsecurityoptionalexpr}.
	 * @param ctx the parse tree
	 */
	void exitRowsecurityoptionalexpr(PostgreSQLPlpgsqlInnerParser.RowsecurityoptionalexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#rowsecurityoptionalwithcheck}.
	 * @param ctx the parse tree
	 */
	void enterRowsecurityoptionalwithcheck(PostgreSQLPlpgsqlInnerParser.RowsecurityoptionalwithcheckContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#rowsecurityoptionalwithcheck}.
	 * @param ctx the parse tree
	 */
	void exitRowsecurityoptionalwithcheck(PostgreSQLPlpgsqlInnerParser.RowsecurityoptionalwithcheckContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#rowsecuritydefaulttorole}.
	 * @param ctx the parse tree
	 */
	void enterRowsecuritydefaulttorole(PostgreSQLPlpgsqlInnerParser.RowsecuritydefaulttoroleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#rowsecuritydefaulttorole}.
	 * @param ctx the parse tree
	 */
	void exitRowsecuritydefaulttorole(PostgreSQLPlpgsqlInnerParser.RowsecuritydefaulttoroleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#rowsecurityoptionaltorole}.
	 * @param ctx the parse tree
	 */
	void enterRowsecurityoptionaltorole(PostgreSQLPlpgsqlInnerParser.RowsecurityoptionaltoroleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#rowsecurityoptionaltorole}.
	 * @param ctx the parse tree
	 */
	void exitRowsecurityoptionaltorole(PostgreSQLPlpgsqlInnerParser.RowsecurityoptionaltoroleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#rowsecuritydefaultpermissive}.
	 * @param ctx the parse tree
	 */
	void enterRowsecuritydefaultpermissive(PostgreSQLPlpgsqlInnerParser.RowsecuritydefaultpermissiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#rowsecuritydefaultpermissive}.
	 * @param ctx the parse tree
	 */
	void exitRowsecuritydefaultpermissive(PostgreSQLPlpgsqlInnerParser.RowsecuritydefaultpermissiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#rowsecuritydefaultforcmd}.
	 * @param ctx the parse tree
	 */
	void enterRowsecuritydefaultforcmd(PostgreSQLPlpgsqlInnerParser.RowsecuritydefaultforcmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#rowsecuritydefaultforcmd}.
	 * @param ctx the parse tree
	 */
	void exitRowsecuritydefaultforcmd(PostgreSQLPlpgsqlInnerParser.RowsecuritydefaultforcmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#row_security_cmd}.
	 * @param ctx the parse tree
	 */
	void enterRow_security_cmd(PostgreSQLPlpgsqlInnerParser.Row_security_cmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#row_security_cmd}.
	 * @param ctx the parse tree
	 */
	void exitRow_security_cmd(PostgreSQLPlpgsqlInnerParser.Row_security_cmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createamstmt}.
	 * @param ctx the parse tree
	 */
	void enterCreateamstmt(PostgreSQLPlpgsqlInnerParser.CreateamstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createamstmt}.
	 * @param ctx the parse tree
	 */
	void exitCreateamstmt(PostgreSQLPlpgsqlInnerParser.CreateamstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#am_type}.
	 * @param ctx the parse tree
	 */
	void enterAm_type(PostgreSQLPlpgsqlInnerParser.Am_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#am_type}.
	 * @param ctx the parse tree
	 */
	void exitAm_type(PostgreSQLPlpgsqlInnerParser.Am_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createtrigstmt}.
	 * @param ctx the parse tree
	 */
	void enterCreatetrigstmt(PostgreSQLPlpgsqlInnerParser.CreatetrigstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createtrigstmt}.
	 * @param ctx the parse tree
	 */
	void exitCreatetrigstmt(PostgreSQLPlpgsqlInnerParser.CreatetrigstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#triggeractiontime}.
	 * @param ctx the parse tree
	 */
	void enterTriggeractiontime(PostgreSQLPlpgsqlInnerParser.TriggeractiontimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#triggeractiontime}.
	 * @param ctx the parse tree
	 */
	void exitTriggeractiontime(PostgreSQLPlpgsqlInnerParser.TriggeractiontimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#triggerevents}.
	 * @param ctx the parse tree
	 */
	void enterTriggerevents(PostgreSQLPlpgsqlInnerParser.TriggereventsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#triggerevents}.
	 * @param ctx the parse tree
	 */
	void exitTriggerevents(PostgreSQLPlpgsqlInnerParser.TriggereventsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#triggeroneevent}.
	 * @param ctx the parse tree
	 */
	void enterTriggeroneevent(PostgreSQLPlpgsqlInnerParser.TriggeroneeventContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#triggeroneevent}.
	 * @param ctx the parse tree
	 */
	void exitTriggeroneevent(PostgreSQLPlpgsqlInnerParser.TriggeroneeventContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#triggerreferencing}.
	 * @param ctx the parse tree
	 */
	void enterTriggerreferencing(PostgreSQLPlpgsqlInnerParser.TriggerreferencingContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#triggerreferencing}.
	 * @param ctx the parse tree
	 */
	void exitTriggerreferencing(PostgreSQLPlpgsqlInnerParser.TriggerreferencingContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#triggertransitions}.
	 * @param ctx the parse tree
	 */
	void enterTriggertransitions(PostgreSQLPlpgsqlInnerParser.TriggertransitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#triggertransitions}.
	 * @param ctx the parse tree
	 */
	void exitTriggertransitions(PostgreSQLPlpgsqlInnerParser.TriggertransitionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#triggertransition}.
	 * @param ctx the parse tree
	 */
	void enterTriggertransition(PostgreSQLPlpgsqlInnerParser.TriggertransitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#triggertransition}.
	 * @param ctx the parse tree
	 */
	void exitTriggertransition(PostgreSQLPlpgsqlInnerParser.TriggertransitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#transitionoldornew}.
	 * @param ctx the parse tree
	 */
	void enterTransitionoldornew(PostgreSQLPlpgsqlInnerParser.TransitionoldornewContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#transitionoldornew}.
	 * @param ctx the parse tree
	 */
	void exitTransitionoldornew(PostgreSQLPlpgsqlInnerParser.TransitionoldornewContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#transitionrowortable}.
	 * @param ctx the parse tree
	 */
	void enterTransitionrowortable(PostgreSQLPlpgsqlInnerParser.TransitionrowortableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#transitionrowortable}.
	 * @param ctx the parse tree
	 */
	void exitTransitionrowortable(PostgreSQLPlpgsqlInnerParser.TransitionrowortableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#transitionrelname}.
	 * @param ctx the parse tree
	 */
	void enterTransitionrelname(PostgreSQLPlpgsqlInnerParser.TransitionrelnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#transitionrelname}.
	 * @param ctx the parse tree
	 */
	void exitTransitionrelname(PostgreSQLPlpgsqlInnerParser.TransitionrelnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#triggerforspec}.
	 * @param ctx the parse tree
	 */
	void enterTriggerforspec(PostgreSQLPlpgsqlInnerParser.TriggerforspecContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#triggerforspec}.
	 * @param ctx the parse tree
	 */
	void exitTriggerforspec(PostgreSQLPlpgsqlInnerParser.TriggerforspecContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#triggerforopteach}.
	 * @param ctx the parse tree
	 */
	void enterTriggerforopteach(PostgreSQLPlpgsqlInnerParser.TriggerforopteachContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#triggerforopteach}.
	 * @param ctx the parse tree
	 */
	void exitTriggerforopteach(PostgreSQLPlpgsqlInnerParser.TriggerforopteachContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#triggerfortype}.
	 * @param ctx the parse tree
	 */
	void enterTriggerfortype(PostgreSQLPlpgsqlInnerParser.TriggerfortypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#triggerfortype}.
	 * @param ctx the parse tree
	 */
	void exitTriggerfortype(PostgreSQLPlpgsqlInnerParser.TriggerfortypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#triggerwhen}.
	 * @param ctx the parse tree
	 */
	void enterTriggerwhen(PostgreSQLPlpgsqlInnerParser.TriggerwhenContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#triggerwhen}.
	 * @param ctx the parse tree
	 */
	void exitTriggerwhen(PostgreSQLPlpgsqlInnerParser.TriggerwhenContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#function_or_procedure}.
	 * @param ctx the parse tree
	 */
	void enterFunction_or_procedure(PostgreSQLPlpgsqlInnerParser.Function_or_procedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#function_or_procedure}.
	 * @param ctx the parse tree
	 */
	void exitFunction_or_procedure(PostgreSQLPlpgsqlInnerParser.Function_or_procedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#triggerfuncargs}.
	 * @param ctx the parse tree
	 */
	void enterTriggerfuncargs(PostgreSQLPlpgsqlInnerParser.TriggerfuncargsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#triggerfuncargs}.
	 * @param ctx the parse tree
	 */
	void exitTriggerfuncargs(PostgreSQLPlpgsqlInnerParser.TriggerfuncargsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#triggerfuncarg}.
	 * @param ctx the parse tree
	 */
	void enterTriggerfuncarg(PostgreSQLPlpgsqlInnerParser.TriggerfuncargContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#triggerfuncarg}.
	 * @param ctx the parse tree
	 */
	void exitTriggerfuncarg(PostgreSQLPlpgsqlInnerParser.TriggerfuncargContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#optconstrfromtable}.
	 * @param ctx the parse tree
	 */
	void enterOptconstrfromtable(PostgreSQLPlpgsqlInnerParser.OptconstrfromtableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#optconstrfromtable}.
	 * @param ctx the parse tree
	 */
	void exitOptconstrfromtable(PostgreSQLPlpgsqlInnerParser.OptconstrfromtableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#constraintattributespec}.
	 * @param ctx the parse tree
	 */
	void enterConstraintattributespec(PostgreSQLPlpgsqlInnerParser.ConstraintattributespecContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#constraintattributespec}.
	 * @param ctx the parse tree
	 */
	void exitConstraintattributespec(PostgreSQLPlpgsqlInnerParser.ConstraintattributespecContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#constraintattributeElem}.
	 * @param ctx the parse tree
	 */
	void enterConstraintattributeElem(PostgreSQLPlpgsqlInnerParser.ConstraintattributeElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#constraintattributeElem}.
	 * @param ctx the parse tree
	 */
	void exitConstraintattributeElem(PostgreSQLPlpgsqlInnerParser.ConstraintattributeElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createeventtrigstmt}.
	 * @param ctx the parse tree
	 */
	void enterCreateeventtrigstmt(PostgreSQLPlpgsqlInnerParser.CreateeventtrigstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createeventtrigstmt}.
	 * @param ctx the parse tree
	 */
	void exitCreateeventtrigstmt(PostgreSQLPlpgsqlInnerParser.CreateeventtrigstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#event_trigger_when_list}.
	 * @param ctx the parse tree
	 */
	void enterEvent_trigger_when_list(PostgreSQLPlpgsqlInnerParser.Event_trigger_when_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#event_trigger_when_list}.
	 * @param ctx the parse tree
	 */
	void exitEvent_trigger_when_list(PostgreSQLPlpgsqlInnerParser.Event_trigger_when_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#event_trigger_when_item}.
	 * @param ctx the parse tree
	 */
	void enterEvent_trigger_when_item(PostgreSQLPlpgsqlInnerParser.Event_trigger_when_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#event_trigger_when_item}.
	 * @param ctx the parse tree
	 */
	void exitEvent_trigger_when_item(PostgreSQLPlpgsqlInnerParser.Event_trigger_when_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#event_trigger_value_list}.
	 * @param ctx the parse tree
	 */
	void enterEvent_trigger_value_list(PostgreSQLPlpgsqlInnerParser.Event_trigger_value_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#event_trigger_value_list}.
	 * @param ctx the parse tree
	 */
	void exitEvent_trigger_value_list(PostgreSQLPlpgsqlInnerParser.Event_trigger_value_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#altereventtrigstmt}.
	 * @param ctx the parse tree
	 */
	void enterAltereventtrigstmt(PostgreSQLPlpgsqlInnerParser.AltereventtrigstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#altereventtrigstmt}.
	 * @param ctx the parse tree
	 */
	void exitAltereventtrigstmt(PostgreSQLPlpgsqlInnerParser.AltereventtrigstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#enable_trigger}.
	 * @param ctx the parse tree
	 */
	void enterEnable_trigger(PostgreSQLPlpgsqlInnerParser.Enable_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#enable_trigger}.
	 * @param ctx the parse tree
	 */
	void exitEnable_trigger(PostgreSQLPlpgsqlInnerParser.Enable_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createassertionstmt}.
	 * @param ctx the parse tree
	 */
	void enterCreateassertionstmt(PostgreSQLPlpgsqlInnerParser.CreateassertionstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createassertionstmt}.
	 * @param ctx the parse tree
	 */
	void exitCreateassertionstmt(PostgreSQLPlpgsqlInnerParser.CreateassertionstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#definestmt}.
	 * @param ctx the parse tree
	 */
	void enterDefinestmt(PostgreSQLPlpgsqlInnerParser.DefinestmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#definestmt}.
	 * @param ctx the parse tree
	 */
	void exitDefinestmt(PostgreSQLPlpgsqlInnerParser.DefinestmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#definition}.
	 * @param ctx the parse tree
	 */
	void enterDefinition(PostgreSQLPlpgsqlInnerParser.DefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#definition}.
	 * @param ctx the parse tree
	 */
	void exitDefinition(PostgreSQLPlpgsqlInnerParser.DefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#def_list}.
	 * @param ctx the parse tree
	 */
	void enterDef_list(PostgreSQLPlpgsqlInnerParser.Def_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#def_list}.
	 * @param ctx the parse tree
	 */
	void exitDef_list(PostgreSQLPlpgsqlInnerParser.Def_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#def_elem}.
	 * @param ctx the parse tree
	 */
	void enterDef_elem(PostgreSQLPlpgsqlInnerParser.Def_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#def_elem}.
	 * @param ctx the parse tree
	 */
	void exitDef_elem(PostgreSQLPlpgsqlInnerParser.Def_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#def_arg}.
	 * @param ctx the parse tree
	 */
	void enterDef_arg(PostgreSQLPlpgsqlInnerParser.Def_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#def_arg}.
	 * @param ctx the parse tree
	 */
	void exitDef_arg(PostgreSQLPlpgsqlInnerParser.Def_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#old_aggr_definition}.
	 * @param ctx the parse tree
	 */
	void enterOld_aggr_definition(PostgreSQLPlpgsqlInnerParser.Old_aggr_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#old_aggr_definition}.
	 * @param ctx the parse tree
	 */
	void exitOld_aggr_definition(PostgreSQLPlpgsqlInnerParser.Old_aggr_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#old_aggr_list}.
	 * @param ctx the parse tree
	 */
	void enterOld_aggr_list(PostgreSQLPlpgsqlInnerParser.Old_aggr_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#old_aggr_list}.
	 * @param ctx the parse tree
	 */
	void exitOld_aggr_list(PostgreSQLPlpgsqlInnerParser.Old_aggr_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#old_aggr_elem}.
	 * @param ctx the parse tree
	 */
	void enterOld_aggr_elem(PostgreSQLPlpgsqlInnerParser.Old_aggr_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#old_aggr_elem}.
	 * @param ctx the parse tree
	 */
	void exitOld_aggr_elem(PostgreSQLPlpgsqlInnerParser.Old_aggr_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_enum_val_list}.
	 * @param ctx the parse tree
	 */
	void enterOpt_enum_val_list(PostgreSQLPlpgsqlInnerParser.Opt_enum_val_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_enum_val_list}.
	 * @param ctx the parse tree
	 */
	void exitOpt_enum_val_list(PostgreSQLPlpgsqlInnerParser.Opt_enum_val_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#enum_val_list}.
	 * @param ctx the parse tree
	 */
	void enterEnum_val_list(PostgreSQLPlpgsqlInnerParser.Enum_val_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#enum_val_list}.
	 * @param ctx the parse tree
	 */
	void exitEnum_val_list(PostgreSQLPlpgsqlInnerParser.Enum_val_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alterenumstmt}.
	 * @param ctx the parse tree
	 */
	void enterAlterenumstmt(PostgreSQLPlpgsqlInnerParser.AlterenumstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alterenumstmt}.
	 * @param ctx the parse tree
	 */
	void exitAlterenumstmt(PostgreSQLPlpgsqlInnerParser.AlterenumstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_if_not_exists}.
	 * @param ctx the parse tree
	 */
	void enterOpt_if_not_exists(PostgreSQLPlpgsqlInnerParser.Opt_if_not_existsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_if_not_exists}.
	 * @param ctx the parse tree
	 */
	void exitOpt_if_not_exists(PostgreSQLPlpgsqlInnerParser.Opt_if_not_existsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createopclassstmt}.
	 * @param ctx the parse tree
	 */
	void enterCreateopclassstmt(PostgreSQLPlpgsqlInnerParser.CreateopclassstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createopclassstmt}.
	 * @param ctx the parse tree
	 */
	void exitCreateopclassstmt(PostgreSQLPlpgsqlInnerParser.CreateopclassstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opclass_item_list}.
	 * @param ctx the parse tree
	 */
	void enterOpclass_item_list(PostgreSQLPlpgsqlInnerParser.Opclass_item_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opclass_item_list}.
	 * @param ctx the parse tree
	 */
	void exitOpclass_item_list(PostgreSQLPlpgsqlInnerParser.Opclass_item_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opclass_item}.
	 * @param ctx the parse tree
	 */
	void enterOpclass_item(PostgreSQLPlpgsqlInnerParser.Opclass_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opclass_item}.
	 * @param ctx the parse tree
	 */
	void exitOpclass_item(PostgreSQLPlpgsqlInnerParser.Opclass_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_default}.
	 * @param ctx the parse tree
	 */
	void enterOpt_default(PostgreSQLPlpgsqlInnerParser.Opt_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_default}.
	 * @param ctx the parse tree
	 */
	void exitOpt_default(PostgreSQLPlpgsqlInnerParser.Opt_defaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_opfamily}.
	 * @param ctx the parse tree
	 */
	void enterOpt_opfamily(PostgreSQLPlpgsqlInnerParser.Opt_opfamilyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_opfamily}.
	 * @param ctx the parse tree
	 */
	void exitOpt_opfamily(PostgreSQLPlpgsqlInnerParser.Opt_opfamilyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opclass_purpose}.
	 * @param ctx the parse tree
	 */
	void enterOpclass_purpose(PostgreSQLPlpgsqlInnerParser.Opclass_purposeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opclass_purpose}.
	 * @param ctx the parse tree
	 */
	void exitOpclass_purpose(PostgreSQLPlpgsqlInnerParser.Opclass_purposeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_recheck}.
	 * @param ctx the parse tree
	 */
	void enterOpt_recheck(PostgreSQLPlpgsqlInnerParser.Opt_recheckContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_recheck}.
	 * @param ctx the parse tree
	 */
	void exitOpt_recheck(PostgreSQLPlpgsqlInnerParser.Opt_recheckContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createopfamilystmt}.
	 * @param ctx the parse tree
	 */
	void enterCreateopfamilystmt(PostgreSQLPlpgsqlInnerParser.CreateopfamilystmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createopfamilystmt}.
	 * @param ctx the parse tree
	 */
	void exitCreateopfamilystmt(PostgreSQLPlpgsqlInnerParser.CreateopfamilystmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alteropfamilystmt}.
	 * @param ctx the parse tree
	 */
	void enterAlteropfamilystmt(PostgreSQLPlpgsqlInnerParser.AlteropfamilystmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alteropfamilystmt}.
	 * @param ctx the parse tree
	 */
	void exitAlteropfamilystmt(PostgreSQLPlpgsqlInnerParser.AlteropfamilystmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opclass_drop_list}.
	 * @param ctx the parse tree
	 */
	void enterOpclass_drop_list(PostgreSQLPlpgsqlInnerParser.Opclass_drop_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opclass_drop_list}.
	 * @param ctx the parse tree
	 */
	void exitOpclass_drop_list(PostgreSQLPlpgsqlInnerParser.Opclass_drop_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opclass_drop}.
	 * @param ctx the parse tree
	 */
	void enterOpclass_drop(PostgreSQLPlpgsqlInnerParser.Opclass_dropContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opclass_drop}.
	 * @param ctx the parse tree
	 */
	void exitOpclass_drop(PostgreSQLPlpgsqlInnerParser.Opclass_dropContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#dropopclassstmt}.
	 * @param ctx the parse tree
	 */
	void enterDropopclassstmt(PostgreSQLPlpgsqlInnerParser.DropopclassstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#dropopclassstmt}.
	 * @param ctx the parse tree
	 */
	void exitDropopclassstmt(PostgreSQLPlpgsqlInnerParser.DropopclassstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#dropopfamilystmt}.
	 * @param ctx the parse tree
	 */
	void enterDropopfamilystmt(PostgreSQLPlpgsqlInnerParser.DropopfamilystmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#dropopfamilystmt}.
	 * @param ctx the parse tree
	 */
	void exitDropopfamilystmt(PostgreSQLPlpgsqlInnerParser.DropopfamilystmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#dropownedstmt}.
	 * @param ctx the parse tree
	 */
	void enterDropownedstmt(PostgreSQLPlpgsqlInnerParser.DropownedstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#dropownedstmt}.
	 * @param ctx the parse tree
	 */
	void exitDropownedstmt(PostgreSQLPlpgsqlInnerParser.DropownedstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#reassignownedstmt}.
	 * @param ctx the parse tree
	 */
	void enterReassignownedstmt(PostgreSQLPlpgsqlInnerParser.ReassignownedstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#reassignownedstmt}.
	 * @param ctx the parse tree
	 */
	void exitReassignownedstmt(PostgreSQLPlpgsqlInnerParser.ReassignownedstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#dropstmt}.
	 * @param ctx the parse tree
	 */
	void enterDropstmt(PostgreSQLPlpgsqlInnerParser.DropstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#dropstmt}.
	 * @param ctx the parse tree
	 */
	void exitDropstmt(PostgreSQLPlpgsqlInnerParser.DropstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#object_type_any_name}.
	 * @param ctx the parse tree
	 */
	void enterObject_type_any_name(PostgreSQLPlpgsqlInnerParser.Object_type_any_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#object_type_any_name}.
	 * @param ctx the parse tree
	 */
	void exitObject_type_any_name(PostgreSQLPlpgsqlInnerParser.Object_type_any_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#object_type_name}.
	 * @param ctx the parse tree
	 */
	void enterObject_type_name(PostgreSQLPlpgsqlInnerParser.Object_type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#object_type_name}.
	 * @param ctx the parse tree
	 */
	void exitObject_type_name(PostgreSQLPlpgsqlInnerParser.Object_type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#drop_type_name}.
	 * @param ctx the parse tree
	 */
	void enterDrop_type_name(PostgreSQLPlpgsqlInnerParser.Drop_type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#drop_type_name}.
	 * @param ctx the parse tree
	 */
	void exitDrop_type_name(PostgreSQLPlpgsqlInnerParser.Drop_type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#object_type_name_on_any_name}.
	 * @param ctx the parse tree
	 */
	void enterObject_type_name_on_any_name(PostgreSQLPlpgsqlInnerParser.Object_type_name_on_any_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#object_type_name_on_any_name}.
	 * @param ctx the parse tree
	 */
	void exitObject_type_name_on_any_name(PostgreSQLPlpgsqlInnerParser.Object_type_name_on_any_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#any_name_list}.
	 * @param ctx the parse tree
	 */
	void enterAny_name_list(PostgreSQLPlpgsqlInnerParser.Any_name_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#any_name_list}.
	 * @param ctx the parse tree
	 */
	void exitAny_name_list(PostgreSQLPlpgsqlInnerParser.Any_name_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#any_name}.
	 * @param ctx the parse tree
	 */
	void enterAny_name(PostgreSQLPlpgsqlInnerParser.Any_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#any_name}.
	 * @param ctx the parse tree
	 */
	void exitAny_name(PostgreSQLPlpgsqlInnerParser.Any_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#attrs}.
	 * @param ctx the parse tree
	 */
	void enterAttrs(PostgreSQLPlpgsqlInnerParser.AttrsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#attrs}.
	 * @param ctx the parse tree
	 */
	void exitAttrs(PostgreSQLPlpgsqlInnerParser.AttrsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#type_name_list}.
	 * @param ctx the parse tree
	 */
	void enterType_name_list(PostgreSQLPlpgsqlInnerParser.Type_name_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#type_name_list}.
	 * @param ctx the parse tree
	 */
	void exitType_name_list(PostgreSQLPlpgsqlInnerParser.Type_name_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#truncatestmt}.
	 * @param ctx the parse tree
	 */
	void enterTruncatestmt(PostgreSQLPlpgsqlInnerParser.TruncatestmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#truncatestmt}.
	 * @param ctx the parse tree
	 */
	void exitTruncatestmt(PostgreSQLPlpgsqlInnerParser.TruncatestmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_restart_seqs}.
	 * @param ctx the parse tree
	 */
	void enterOpt_restart_seqs(PostgreSQLPlpgsqlInnerParser.Opt_restart_seqsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_restart_seqs}.
	 * @param ctx the parse tree
	 */
	void exitOpt_restart_seqs(PostgreSQLPlpgsqlInnerParser.Opt_restart_seqsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#commentstmt}.
	 * @param ctx the parse tree
	 */
	void enterCommentstmt(PostgreSQLPlpgsqlInnerParser.CommentstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#commentstmt}.
	 * @param ctx the parse tree
	 */
	void exitCommentstmt(PostgreSQLPlpgsqlInnerParser.CommentstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#comment_text}.
	 * @param ctx the parse tree
	 */
	void enterComment_text(PostgreSQLPlpgsqlInnerParser.Comment_textContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#comment_text}.
	 * @param ctx the parse tree
	 */
	void exitComment_text(PostgreSQLPlpgsqlInnerParser.Comment_textContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#seclabelstmt}.
	 * @param ctx the parse tree
	 */
	void enterSeclabelstmt(PostgreSQLPlpgsqlInnerParser.SeclabelstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#seclabelstmt}.
	 * @param ctx the parse tree
	 */
	void exitSeclabelstmt(PostgreSQLPlpgsqlInnerParser.SeclabelstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_provider}.
	 * @param ctx the parse tree
	 */
	void enterOpt_provider(PostgreSQLPlpgsqlInnerParser.Opt_providerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_provider}.
	 * @param ctx the parse tree
	 */
	void exitOpt_provider(PostgreSQLPlpgsqlInnerParser.Opt_providerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#security_label}.
	 * @param ctx the parse tree
	 */
	void enterSecurity_label(PostgreSQLPlpgsqlInnerParser.Security_labelContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#security_label}.
	 * @param ctx the parse tree
	 */
	void exitSecurity_label(PostgreSQLPlpgsqlInnerParser.Security_labelContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#fetchstmt}.
	 * @param ctx the parse tree
	 */
	void enterFetchstmt(PostgreSQLPlpgsqlInnerParser.FetchstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#fetchstmt}.
	 * @param ctx the parse tree
	 */
	void exitFetchstmt(PostgreSQLPlpgsqlInnerParser.FetchstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#fetch_args}.
	 * @param ctx the parse tree
	 */
	void enterFetch_args(PostgreSQLPlpgsqlInnerParser.Fetch_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#fetch_args}.
	 * @param ctx the parse tree
	 */
	void exitFetch_args(PostgreSQLPlpgsqlInnerParser.Fetch_argsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#from_in}.
	 * @param ctx the parse tree
	 */
	void enterFrom_in(PostgreSQLPlpgsqlInnerParser.From_inContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#from_in}.
	 * @param ctx the parse tree
	 */
	void exitFrom_in(PostgreSQLPlpgsqlInnerParser.From_inContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_from_in}.
	 * @param ctx the parse tree
	 */
	void enterOpt_from_in(PostgreSQLPlpgsqlInnerParser.Opt_from_inContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_from_in}.
	 * @param ctx the parse tree
	 */
	void exitOpt_from_in(PostgreSQLPlpgsqlInnerParser.Opt_from_inContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#grantstmt}.
	 * @param ctx the parse tree
	 */
	void enterGrantstmt(PostgreSQLPlpgsqlInnerParser.GrantstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#grantstmt}.
	 * @param ctx the parse tree
	 */
	void exitGrantstmt(PostgreSQLPlpgsqlInnerParser.GrantstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#revokestmt}.
	 * @param ctx the parse tree
	 */
	void enterRevokestmt(PostgreSQLPlpgsqlInnerParser.RevokestmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#revokestmt}.
	 * @param ctx the parse tree
	 */
	void exitRevokestmt(PostgreSQLPlpgsqlInnerParser.RevokestmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#privileges}.
	 * @param ctx the parse tree
	 */
	void enterPrivileges(PostgreSQLPlpgsqlInnerParser.PrivilegesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#privileges}.
	 * @param ctx the parse tree
	 */
	void exitPrivileges(PostgreSQLPlpgsqlInnerParser.PrivilegesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#privilege_list}.
	 * @param ctx the parse tree
	 */
	void enterPrivilege_list(PostgreSQLPlpgsqlInnerParser.Privilege_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#privilege_list}.
	 * @param ctx the parse tree
	 */
	void exitPrivilege_list(PostgreSQLPlpgsqlInnerParser.Privilege_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#privilege}.
	 * @param ctx the parse tree
	 */
	void enterPrivilege(PostgreSQLPlpgsqlInnerParser.PrivilegeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#privilege}.
	 * @param ctx the parse tree
	 */
	void exitPrivilege(PostgreSQLPlpgsqlInnerParser.PrivilegeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#privilege_target}.
	 * @param ctx the parse tree
	 */
	void enterPrivilege_target(PostgreSQLPlpgsqlInnerParser.Privilege_targetContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#privilege_target}.
	 * @param ctx the parse tree
	 */
	void exitPrivilege_target(PostgreSQLPlpgsqlInnerParser.Privilege_targetContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#grantee_list}.
	 * @param ctx the parse tree
	 */
	void enterGrantee_list(PostgreSQLPlpgsqlInnerParser.Grantee_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#grantee_list}.
	 * @param ctx the parse tree
	 */
	void exitGrantee_list(PostgreSQLPlpgsqlInnerParser.Grantee_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#grantee}.
	 * @param ctx the parse tree
	 */
	void enterGrantee(PostgreSQLPlpgsqlInnerParser.GranteeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#grantee}.
	 * @param ctx the parse tree
	 */
	void exitGrantee(PostgreSQLPlpgsqlInnerParser.GranteeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_grant_grant_option}.
	 * @param ctx the parse tree
	 */
	void enterOpt_grant_grant_option(PostgreSQLPlpgsqlInnerParser.Opt_grant_grant_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_grant_grant_option}.
	 * @param ctx the parse tree
	 */
	void exitOpt_grant_grant_option(PostgreSQLPlpgsqlInnerParser.Opt_grant_grant_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#grantrolestmt}.
	 * @param ctx the parse tree
	 */
	void enterGrantrolestmt(PostgreSQLPlpgsqlInnerParser.GrantrolestmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#grantrolestmt}.
	 * @param ctx the parse tree
	 */
	void exitGrantrolestmt(PostgreSQLPlpgsqlInnerParser.GrantrolestmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#revokerolestmt}.
	 * @param ctx the parse tree
	 */
	void enterRevokerolestmt(PostgreSQLPlpgsqlInnerParser.RevokerolestmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#revokerolestmt}.
	 * @param ctx the parse tree
	 */
	void exitRevokerolestmt(PostgreSQLPlpgsqlInnerParser.RevokerolestmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_grant_admin_option}.
	 * @param ctx the parse tree
	 */
	void enterOpt_grant_admin_option(PostgreSQLPlpgsqlInnerParser.Opt_grant_admin_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_grant_admin_option}.
	 * @param ctx the parse tree
	 */
	void exitOpt_grant_admin_option(PostgreSQLPlpgsqlInnerParser.Opt_grant_admin_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_granted_by}.
	 * @param ctx the parse tree
	 */
	void enterOpt_granted_by(PostgreSQLPlpgsqlInnerParser.Opt_granted_byContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_granted_by}.
	 * @param ctx the parse tree
	 */
	void exitOpt_granted_by(PostgreSQLPlpgsqlInnerParser.Opt_granted_byContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alterdefaultprivilegesstmt}.
	 * @param ctx the parse tree
	 */
	void enterAlterdefaultprivilegesstmt(PostgreSQLPlpgsqlInnerParser.AlterdefaultprivilegesstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alterdefaultprivilegesstmt}.
	 * @param ctx the parse tree
	 */
	void exitAlterdefaultprivilegesstmt(PostgreSQLPlpgsqlInnerParser.AlterdefaultprivilegesstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#defacloptionlist}.
	 * @param ctx the parse tree
	 */
	void enterDefacloptionlist(PostgreSQLPlpgsqlInnerParser.DefacloptionlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#defacloptionlist}.
	 * @param ctx the parse tree
	 */
	void exitDefacloptionlist(PostgreSQLPlpgsqlInnerParser.DefacloptionlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#defacloption}.
	 * @param ctx the parse tree
	 */
	void enterDefacloption(PostgreSQLPlpgsqlInnerParser.DefacloptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#defacloption}.
	 * @param ctx the parse tree
	 */
	void exitDefacloption(PostgreSQLPlpgsqlInnerParser.DefacloptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#defaclaction}.
	 * @param ctx the parse tree
	 */
	void enterDefaclaction(PostgreSQLPlpgsqlInnerParser.DefaclactionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#defaclaction}.
	 * @param ctx the parse tree
	 */
	void exitDefaclaction(PostgreSQLPlpgsqlInnerParser.DefaclactionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#defacl_privilege_target}.
	 * @param ctx the parse tree
	 */
	void enterDefacl_privilege_target(PostgreSQLPlpgsqlInnerParser.Defacl_privilege_targetContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#defacl_privilege_target}.
	 * @param ctx the parse tree
	 */
	void exitDefacl_privilege_target(PostgreSQLPlpgsqlInnerParser.Defacl_privilege_targetContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#indexstmt}.
	 * @param ctx the parse tree
	 */
	void enterIndexstmt(PostgreSQLPlpgsqlInnerParser.IndexstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#indexstmt}.
	 * @param ctx the parse tree
	 */
	void exitIndexstmt(PostgreSQLPlpgsqlInnerParser.IndexstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_unique}.
	 * @param ctx the parse tree
	 */
	void enterOpt_unique(PostgreSQLPlpgsqlInnerParser.Opt_uniqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_unique}.
	 * @param ctx the parse tree
	 */
	void exitOpt_unique(PostgreSQLPlpgsqlInnerParser.Opt_uniqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_concurrently}.
	 * @param ctx the parse tree
	 */
	void enterOpt_concurrently(PostgreSQLPlpgsqlInnerParser.Opt_concurrentlyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_concurrently}.
	 * @param ctx the parse tree
	 */
	void exitOpt_concurrently(PostgreSQLPlpgsqlInnerParser.Opt_concurrentlyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_index_name}.
	 * @param ctx the parse tree
	 */
	void enterOpt_index_name(PostgreSQLPlpgsqlInnerParser.Opt_index_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_index_name}.
	 * @param ctx the parse tree
	 */
	void exitOpt_index_name(PostgreSQLPlpgsqlInnerParser.Opt_index_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#access_method_clause}.
	 * @param ctx the parse tree
	 */
	void enterAccess_method_clause(PostgreSQLPlpgsqlInnerParser.Access_method_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#access_method_clause}.
	 * @param ctx the parse tree
	 */
	void exitAccess_method_clause(PostgreSQLPlpgsqlInnerParser.Access_method_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#index_params}.
	 * @param ctx the parse tree
	 */
	void enterIndex_params(PostgreSQLPlpgsqlInnerParser.Index_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#index_params}.
	 * @param ctx the parse tree
	 */
	void exitIndex_params(PostgreSQLPlpgsqlInnerParser.Index_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#index_elem_options}.
	 * @param ctx the parse tree
	 */
	void enterIndex_elem_options(PostgreSQLPlpgsqlInnerParser.Index_elem_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#index_elem_options}.
	 * @param ctx the parse tree
	 */
	void exitIndex_elem_options(PostgreSQLPlpgsqlInnerParser.Index_elem_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#index_elem}.
	 * @param ctx the parse tree
	 */
	void enterIndex_elem(PostgreSQLPlpgsqlInnerParser.Index_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#index_elem}.
	 * @param ctx the parse tree
	 */
	void exitIndex_elem(PostgreSQLPlpgsqlInnerParser.Index_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_include}.
	 * @param ctx the parse tree
	 */
	void enterOpt_include(PostgreSQLPlpgsqlInnerParser.Opt_includeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_include}.
	 * @param ctx the parse tree
	 */
	void exitOpt_include(PostgreSQLPlpgsqlInnerParser.Opt_includeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#index_including_params}.
	 * @param ctx the parse tree
	 */
	void enterIndex_including_params(PostgreSQLPlpgsqlInnerParser.Index_including_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#index_including_params}.
	 * @param ctx the parse tree
	 */
	void exitIndex_including_params(PostgreSQLPlpgsqlInnerParser.Index_including_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_collate}.
	 * @param ctx the parse tree
	 */
	void enterOpt_collate(PostgreSQLPlpgsqlInnerParser.Opt_collateContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_collate}.
	 * @param ctx the parse tree
	 */
	void exitOpt_collate(PostgreSQLPlpgsqlInnerParser.Opt_collateContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_class}.
	 * @param ctx the parse tree
	 */
	void enterOpt_class(PostgreSQLPlpgsqlInnerParser.Opt_classContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_class}.
	 * @param ctx the parse tree
	 */
	void exitOpt_class(PostgreSQLPlpgsqlInnerParser.Opt_classContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_asc_desc}.
	 * @param ctx the parse tree
	 */
	void enterOpt_asc_desc(PostgreSQLPlpgsqlInnerParser.Opt_asc_descContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_asc_desc}.
	 * @param ctx the parse tree
	 */
	void exitOpt_asc_desc(PostgreSQLPlpgsqlInnerParser.Opt_asc_descContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_nulls_order}.
	 * @param ctx the parse tree
	 */
	void enterOpt_nulls_order(PostgreSQLPlpgsqlInnerParser.Opt_nulls_orderContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_nulls_order}.
	 * @param ctx the parse tree
	 */
	void exitOpt_nulls_order(PostgreSQLPlpgsqlInnerParser.Opt_nulls_orderContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createfunctionstmt}.
	 * @param ctx the parse tree
	 */
	void enterCreatefunctionstmt(PostgreSQLPlpgsqlInnerParser.CreatefunctionstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createfunctionstmt}.
	 * @param ctx the parse tree
	 */
	void exitCreatefunctionstmt(PostgreSQLPlpgsqlInnerParser.CreatefunctionstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_or_replace}.
	 * @param ctx the parse tree
	 */
	void enterOpt_or_replace(PostgreSQLPlpgsqlInnerParser.Opt_or_replaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_or_replace}.
	 * @param ctx the parse tree
	 */
	void exitOpt_or_replace(PostgreSQLPlpgsqlInnerParser.Opt_or_replaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#func_args}.
	 * @param ctx the parse tree
	 */
	void enterFunc_args(PostgreSQLPlpgsqlInnerParser.Func_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#func_args}.
	 * @param ctx the parse tree
	 */
	void exitFunc_args(PostgreSQLPlpgsqlInnerParser.Func_argsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#func_args_list}.
	 * @param ctx the parse tree
	 */
	void enterFunc_args_list(PostgreSQLPlpgsqlInnerParser.Func_args_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#func_args_list}.
	 * @param ctx the parse tree
	 */
	void exitFunc_args_list(PostgreSQLPlpgsqlInnerParser.Func_args_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#function_with_argtypes_list}.
	 * @param ctx the parse tree
	 */
	void enterFunction_with_argtypes_list(PostgreSQLPlpgsqlInnerParser.Function_with_argtypes_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#function_with_argtypes_list}.
	 * @param ctx the parse tree
	 */
	void exitFunction_with_argtypes_list(PostgreSQLPlpgsqlInnerParser.Function_with_argtypes_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#function_with_argtypes}.
	 * @param ctx the parse tree
	 */
	void enterFunction_with_argtypes(PostgreSQLPlpgsqlInnerParser.Function_with_argtypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#function_with_argtypes}.
	 * @param ctx the parse tree
	 */
	void exitFunction_with_argtypes(PostgreSQLPlpgsqlInnerParser.Function_with_argtypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#func_args_with_defaults}.
	 * @param ctx the parse tree
	 */
	void enterFunc_args_with_defaults(PostgreSQLPlpgsqlInnerParser.Func_args_with_defaultsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#func_args_with_defaults}.
	 * @param ctx the parse tree
	 */
	void exitFunc_args_with_defaults(PostgreSQLPlpgsqlInnerParser.Func_args_with_defaultsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#func_args_with_defaults_list}.
	 * @param ctx the parse tree
	 */
	void enterFunc_args_with_defaults_list(PostgreSQLPlpgsqlInnerParser.Func_args_with_defaults_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#func_args_with_defaults_list}.
	 * @param ctx the parse tree
	 */
	void exitFunc_args_with_defaults_list(PostgreSQLPlpgsqlInnerParser.Func_args_with_defaults_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#func_arg}.
	 * @param ctx the parse tree
	 */
	void enterFunc_arg(PostgreSQLPlpgsqlInnerParser.Func_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#func_arg}.
	 * @param ctx the parse tree
	 */
	void exitFunc_arg(PostgreSQLPlpgsqlInnerParser.Func_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#arg_class}.
	 * @param ctx the parse tree
	 */
	void enterArg_class(PostgreSQLPlpgsqlInnerParser.Arg_classContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#arg_class}.
	 * @param ctx the parse tree
	 */
	void exitArg_class(PostgreSQLPlpgsqlInnerParser.Arg_classContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#param_name}.
	 * @param ctx the parse tree
	 */
	void enterParam_name(PostgreSQLPlpgsqlInnerParser.Param_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#param_name}.
	 * @param ctx the parse tree
	 */
	void exitParam_name(PostgreSQLPlpgsqlInnerParser.Param_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#func_return}.
	 * @param ctx the parse tree
	 */
	void enterFunc_return(PostgreSQLPlpgsqlInnerParser.Func_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#func_return}.
	 * @param ctx the parse tree
	 */
	void exitFunc_return(PostgreSQLPlpgsqlInnerParser.Func_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#func_type}.
	 * @param ctx the parse tree
	 */
	void enterFunc_type(PostgreSQLPlpgsqlInnerParser.Func_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#func_type}.
	 * @param ctx the parse tree
	 */
	void exitFunc_type(PostgreSQLPlpgsqlInnerParser.Func_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#func_arg_with_default}.
	 * @param ctx the parse tree
	 */
	void enterFunc_arg_with_default(PostgreSQLPlpgsqlInnerParser.Func_arg_with_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#func_arg_with_default}.
	 * @param ctx the parse tree
	 */
	void exitFunc_arg_with_default(PostgreSQLPlpgsqlInnerParser.Func_arg_with_defaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#aggr_arg}.
	 * @param ctx the parse tree
	 */
	void enterAggr_arg(PostgreSQLPlpgsqlInnerParser.Aggr_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#aggr_arg}.
	 * @param ctx the parse tree
	 */
	void exitAggr_arg(PostgreSQLPlpgsqlInnerParser.Aggr_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#aggr_args}.
	 * @param ctx the parse tree
	 */
	void enterAggr_args(PostgreSQLPlpgsqlInnerParser.Aggr_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#aggr_args}.
	 * @param ctx the parse tree
	 */
	void exitAggr_args(PostgreSQLPlpgsqlInnerParser.Aggr_argsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#aggr_args_list}.
	 * @param ctx the parse tree
	 */
	void enterAggr_args_list(PostgreSQLPlpgsqlInnerParser.Aggr_args_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#aggr_args_list}.
	 * @param ctx the parse tree
	 */
	void exitAggr_args_list(PostgreSQLPlpgsqlInnerParser.Aggr_args_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#aggregate_with_argtypes}.
	 * @param ctx the parse tree
	 */
	void enterAggregate_with_argtypes(PostgreSQLPlpgsqlInnerParser.Aggregate_with_argtypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#aggregate_with_argtypes}.
	 * @param ctx the parse tree
	 */
	void exitAggregate_with_argtypes(PostgreSQLPlpgsqlInnerParser.Aggregate_with_argtypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#aggregate_with_argtypes_list}.
	 * @param ctx the parse tree
	 */
	void enterAggregate_with_argtypes_list(PostgreSQLPlpgsqlInnerParser.Aggregate_with_argtypes_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#aggregate_with_argtypes_list}.
	 * @param ctx the parse tree
	 */
	void exitAggregate_with_argtypes_list(PostgreSQLPlpgsqlInnerParser.Aggregate_with_argtypes_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createfunc_opt_list}.
	 * @param ctx the parse tree
	 */
	void enterCreatefunc_opt_list(PostgreSQLPlpgsqlInnerParser.Createfunc_opt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createfunc_opt_list}.
	 * @param ctx the parse tree
	 */
	void exitCreatefunc_opt_list(PostgreSQLPlpgsqlInnerParser.Createfunc_opt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#common_func_opt_item}.
	 * @param ctx the parse tree
	 */
	void enterCommon_func_opt_item(PostgreSQLPlpgsqlInnerParser.Common_func_opt_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#common_func_opt_item}.
	 * @param ctx the parse tree
	 */
	void exitCommon_func_opt_item(PostgreSQLPlpgsqlInnerParser.Common_func_opt_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createfunc_opt_item}.
	 * @param ctx the parse tree
	 */
	void enterCreatefunc_opt_item(PostgreSQLPlpgsqlInnerParser.Createfunc_opt_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createfunc_opt_item}.
	 * @param ctx the parse tree
	 */
	void exitCreatefunc_opt_item(PostgreSQLPlpgsqlInnerParser.Createfunc_opt_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#func_as}.
	 * @param ctx the parse tree
	 */
	void enterFunc_as(PostgreSQLPlpgsqlInnerParser.Func_asContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#func_as}.
	 * @param ctx the parse tree
	 */
	void exitFunc_as(PostgreSQLPlpgsqlInnerParser.Func_asContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#transform_type_list}.
	 * @param ctx the parse tree
	 */
	void enterTransform_type_list(PostgreSQLPlpgsqlInnerParser.Transform_type_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#transform_type_list}.
	 * @param ctx the parse tree
	 */
	void exitTransform_type_list(PostgreSQLPlpgsqlInnerParser.Transform_type_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_definition}.
	 * @param ctx the parse tree
	 */
	void enterOpt_definition(PostgreSQLPlpgsqlInnerParser.Opt_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_definition}.
	 * @param ctx the parse tree
	 */
	void exitOpt_definition(PostgreSQLPlpgsqlInnerParser.Opt_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#table_func_column}.
	 * @param ctx the parse tree
	 */
	void enterTable_func_column(PostgreSQLPlpgsqlInnerParser.Table_func_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#table_func_column}.
	 * @param ctx the parse tree
	 */
	void exitTable_func_column(PostgreSQLPlpgsqlInnerParser.Table_func_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#table_func_column_list}.
	 * @param ctx the parse tree
	 */
	void enterTable_func_column_list(PostgreSQLPlpgsqlInnerParser.Table_func_column_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#table_func_column_list}.
	 * @param ctx the parse tree
	 */
	void exitTable_func_column_list(PostgreSQLPlpgsqlInnerParser.Table_func_column_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alterfunctionstmt}.
	 * @param ctx the parse tree
	 */
	void enterAlterfunctionstmt(PostgreSQLPlpgsqlInnerParser.AlterfunctionstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alterfunctionstmt}.
	 * @param ctx the parse tree
	 */
	void exitAlterfunctionstmt(PostgreSQLPlpgsqlInnerParser.AlterfunctionstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alterfunc_opt_list}.
	 * @param ctx the parse tree
	 */
	void enterAlterfunc_opt_list(PostgreSQLPlpgsqlInnerParser.Alterfunc_opt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alterfunc_opt_list}.
	 * @param ctx the parse tree
	 */
	void exitAlterfunc_opt_list(PostgreSQLPlpgsqlInnerParser.Alterfunc_opt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_restrict}.
	 * @param ctx the parse tree
	 */
	void enterOpt_restrict(PostgreSQLPlpgsqlInnerParser.Opt_restrictContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_restrict}.
	 * @param ctx the parse tree
	 */
	void exitOpt_restrict(PostgreSQLPlpgsqlInnerParser.Opt_restrictContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#removefuncstmt}.
	 * @param ctx the parse tree
	 */
	void enterRemovefuncstmt(PostgreSQLPlpgsqlInnerParser.RemovefuncstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#removefuncstmt}.
	 * @param ctx the parse tree
	 */
	void exitRemovefuncstmt(PostgreSQLPlpgsqlInnerParser.RemovefuncstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#removeaggrstmt}.
	 * @param ctx the parse tree
	 */
	void enterRemoveaggrstmt(PostgreSQLPlpgsqlInnerParser.RemoveaggrstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#removeaggrstmt}.
	 * @param ctx the parse tree
	 */
	void exitRemoveaggrstmt(PostgreSQLPlpgsqlInnerParser.RemoveaggrstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#removeoperstmt}.
	 * @param ctx the parse tree
	 */
	void enterRemoveoperstmt(PostgreSQLPlpgsqlInnerParser.RemoveoperstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#removeoperstmt}.
	 * @param ctx the parse tree
	 */
	void exitRemoveoperstmt(PostgreSQLPlpgsqlInnerParser.RemoveoperstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#oper_argtypes}.
	 * @param ctx the parse tree
	 */
	void enterOper_argtypes(PostgreSQLPlpgsqlInnerParser.Oper_argtypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#oper_argtypes}.
	 * @param ctx the parse tree
	 */
	void exitOper_argtypes(PostgreSQLPlpgsqlInnerParser.Oper_argtypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#any_operator}.
	 * @param ctx the parse tree
	 */
	void enterAny_operator(PostgreSQLPlpgsqlInnerParser.Any_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#any_operator}.
	 * @param ctx the parse tree
	 */
	void exitAny_operator(PostgreSQLPlpgsqlInnerParser.Any_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#operator_with_argtypes_list}.
	 * @param ctx the parse tree
	 */
	void enterOperator_with_argtypes_list(PostgreSQLPlpgsqlInnerParser.Operator_with_argtypes_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#operator_with_argtypes_list}.
	 * @param ctx the parse tree
	 */
	void exitOperator_with_argtypes_list(PostgreSQLPlpgsqlInnerParser.Operator_with_argtypes_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#operator_with_argtypes}.
	 * @param ctx the parse tree
	 */
	void enterOperator_with_argtypes(PostgreSQLPlpgsqlInnerParser.Operator_with_argtypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#operator_with_argtypes}.
	 * @param ctx the parse tree
	 */
	void exitOperator_with_argtypes(PostgreSQLPlpgsqlInnerParser.Operator_with_argtypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#dostmt}.
	 * @param ctx the parse tree
	 */
	void enterDostmt(PostgreSQLPlpgsqlInnerParser.DostmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#dostmt}.
	 * @param ctx the parse tree
	 */
	void exitDostmt(PostgreSQLPlpgsqlInnerParser.DostmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#dostmt_opt_list}.
	 * @param ctx the parse tree
	 */
	void enterDostmt_opt_list(PostgreSQLPlpgsqlInnerParser.Dostmt_opt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#dostmt_opt_list}.
	 * @param ctx the parse tree
	 */
	void exitDostmt_opt_list(PostgreSQLPlpgsqlInnerParser.Dostmt_opt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#dostmt_opt_item}.
	 * @param ctx the parse tree
	 */
	void enterDostmt_opt_item(PostgreSQLPlpgsqlInnerParser.Dostmt_opt_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#dostmt_opt_item}.
	 * @param ctx the parse tree
	 */
	void exitDostmt_opt_item(PostgreSQLPlpgsqlInnerParser.Dostmt_opt_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createcaststmt}.
	 * @param ctx the parse tree
	 */
	void enterCreatecaststmt(PostgreSQLPlpgsqlInnerParser.CreatecaststmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createcaststmt}.
	 * @param ctx the parse tree
	 */
	void exitCreatecaststmt(PostgreSQLPlpgsqlInnerParser.CreatecaststmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#cast_context}.
	 * @param ctx the parse tree
	 */
	void enterCast_context(PostgreSQLPlpgsqlInnerParser.Cast_contextContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#cast_context}.
	 * @param ctx the parse tree
	 */
	void exitCast_context(PostgreSQLPlpgsqlInnerParser.Cast_contextContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#dropcaststmt}.
	 * @param ctx the parse tree
	 */
	void enterDropcaststmt(PostgreSQLPlpgsqlInnerParser.DropcaststmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#dropcaststmt}.
	 * @param ctx the parse tree
	 */
	void exitDropcaststmt(PostgreSQLPlpgsqlInnerParser.DropcaststmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_if_exists}.
	 * @param ctx the parse tree
	 */
	void enterOpt_if_exists(PostgreSQLPlpgsqlInnerParser.Opt_if_existsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_if_exists}.
	 * @param ctx the parse tree
	 */
	void exitOpt_if_exists(PostgreSQLPlpgsqlInnerParser.Opt_if_existsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createtransformstmt}.
	 * @param ctx the parse tree
	 */
	void enterCreatetransformstmt(PostgreSQLPlpgsqlInnerParser.CreatetransformstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createtransformstmt}.
	 * @param ctx the parse tree
	 */
	void exitCreatetransformstmt(PostgreSQLPlpgsqlInnerParser.CreatetransformstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#transform_element_list}.
	 * @param ctx the parse tree
	 */
	void enterTransform_element_list(PostgreSQLPlpgsqlInnerParser.Transform_element_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#transform_element_list}.
	 * @param ctx the parse tree
	 */
	void exitTransform_element_list(PostgreSQLPlpgsqlInnerParser.Transform_element_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#droptransformstmt}.
	 * @param ctx the parse tree
	 */
	void enterDroptransformstmt(PostgreSQLPlpgsqlInnerParser.DroptransformstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#droptransformstmt}.
	 * @param ctx the parse tree
	 */
	void exitDroptransformstmt(PostgreSQLPlpgsqlInnerParser.DroptransformstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#reindexstmt}.
	 * @param ctx the parse tree
	 */
	void enterReindexstmt(PostgreSQLPlpgsqlInnerParser.ReindexstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#reindexstmt}.
	 * @param ctx the parse tree
	 */
	void exitReindexstmt(PostgreSQLPlpgsqlInnerParser.ReindexstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#reindex_target_type}.
	 * @param ctx the parse tree
	 */
	void enterReindex_target_type(PostgreSQLPlpgsqlInnerParser.Reindex_target_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#reindex_target_type}.
	 * @param ctx the parse tree
	 */
	void exitReindex_target_type(PostgreSQLPlpgsqlInnerParser.Reindex_target_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#reindex_target_multitable}.
	 * @param ctx the parse tree
	 */
	void enterReindex_target_multitable(PostgreSQLPlpgsqlInnerParser.Reindex_target_multitableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#reindex_target_multitable}.
	 * @param ctx the parse tree
	 */
	void exitReindex_target_multitable(PostgreSQLPlpgsqlInnerParser.Reindex_target_multitableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#reindex_option_list}.
	 * @param ctx the parse tree
	 */
	void enterReindex_option_list(PostgreSQLPlpgsqlInnerParser.Reindex_option_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#reindex_option_list}.
	 * @param ctx the parse tree
	 */
	void exitReindex_option_list(PostgreSQLPlpgsqlInnerParser.Reindex_option_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#reindex_option_elem}.
	 * @param ctx the parse tree
	 */
	void enterReindex_option_elem(PostgreSQLPlpgsqlInnerParser.Reindex_option_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#reindex_option_elem}.
	 * @param ctx the parse tree
	 */
	void exitReindex_option_elem(PostgreSQLPlpgsqlInnerParser.Reindex_option_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#altertblspcstmt}.
	 * @param ctx the parse tree
	 */
	void enterAltertblspcstmt(PostgreSQLPlpgsqlInnerParser.AltertblspcstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#altertblspcstmt}.
	 * @param ctx the parse tree
	 */
	void exitAltertblspcstmt(PostgreSQLPlpgsqlInnerParser.AltertblspcstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#renamestmt}.
	 * @param ctx the parse tree
	 */
	void enterRenamestmt(PostgreSQLPlpgsqlInnerParser.RenamestmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#renamestmt}.
	 * @param ctx the parse tree
	 */
	void exitRenamestmt(PostgreSQLPlpgsqlInnerParser.RenamestmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_column}.
	 * @param ctx the parse tree
	 */
	void enterOpt_column(PostgreSQLPlpgsqlInnerParser.Opt_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_column}.
	 * @param ctx the parse tree
	 */
	void exitOpt_column(PostgreSQLPlpgsqlInnerParser.Opt_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_set_data}.
	 * @param ctx the parse tree
	 */
	void enterOpt_set_data(PostgreSQLPlpgsqlInnerParser.Opt_set_dataContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_set_data}.
	 * @param ctx the parse tree
	 */
	void exitOpt_set_data(PostgreSQLPlpgsqlInnerParser.Opt_set_dataContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alterobjectdependsstmt}.
	 * @param ctx the parse tree
	 */
	void enterAlterobjectdependsstmt(PostgreSQLPlpgsqlInnerParser.AlterobjectdependsstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alterobjectdependsstmt}.
	 * @param ctx the parse tree
	 */
	void exitAlterobjectdependsstmt(PostgreSQLPlpgsqlInnerParser.AlterobjectdependsstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_no}.
	 * @param ctx the parse tree
	 */
	void enterOpt_no(PostgreSQLPlpgsqlInnerParser.Opt_noContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_no}.
	 * @param ctx the parse tree
	 */
	void exitOpt_no(PostgreSQLPlpgsqlInnerParser.Opt_noContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alterobjectschemastmt}.
	 * @param ctx the parse tree
	 */
	void enterAlterobjectschemastmt(PostgreSQLPlpgsqlInnerParser.AlterobjectschemastmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alterobjectschemastmt}.
	 * @param ctx the parse tree
	 */
	void exitAlterobjectschemastmt(PostgreSQLPlpgsqlInnerParser.AlterobjectschemastmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alteroperatorstmt}.
	 * @param ctx the parse tree
	 */
	void enterAlteroperatorstmt(PostgreSQLPlpgsqlInnerParser.AlteroperatorstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alteroperatorstmt}.
	 * @param ctx the parse tree
	 */
	void exitAlteroperatorstmt(PostgreSQLPlpgsqlInnerParser.AlteroperatorstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#operator_def_list}.
	 * @param ctx the parse tree
	 */
	void enterOperator_def_list(PostgreSQLPlpgsqlInnerParser.Operator_def_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#operator_def_list}.
	 * @param ctx the parse tree
	 */
	void exitOperator_def_list(PostgreSQLPlpgsqlInnerParser.Operator_def_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#operator_def_elem}.
	 * @param ctx the parse tree
	 */
	void enterOperator_def_elem(PostgreSQLPlpgsqlInnerParser.Operator_def_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#operator_def_elem}.
	 * @param ctx the parse tree
	 */
	void exitOperator_def_elem(PostgreSQLPlpgsqlInnerParser.Operator_def_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#operator_def_arg}.
	 * @param ctx the parse tree
	 */
	void enterOperator_def_arg(PostgreSQLPlpgsqlInnerParser.Operator_def_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#operator_def_arg}.
	 * @param ctx the parse tree
	 */
	void exitOperator_def_arg(PostgreSQLPlpgsqlInnerParser.Operator_def_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#altertypestmt}.
	 * @param ctx the parse tree
	 */
	void enterAltertypestmt(PostgreSQLPlpgsqlInnerParser.AltertypestmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#altertypestmt}.
	 * @param ctx the parse tree
	 */
	void exitAltertypestmt(PostgreSQLPlpgsqlInnerParser.AltertypestmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alterownerstmt}.
	 * @param ctx the parse tree
	 */
	void enterAlterownerstmt(PostgreSQLPlpgsqlInnerParser.AlterownerstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alterownerstmt}.
	 * @param ctx the parse tree
	 */
	void exitAlterownerstmt(PostgreSQLPlpgsqlInnerParser.AlterownerstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createpublicationstmt}.
	 * @param ctx the parse tree
	 */
	void enterCreatepublicationstmt(PostgreSQLPlpgsqlInnerParser.CreatepublicationstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createpublicationstmt}.
	 * @param ctx the parse tree
	 */
	void exitCreatepublicationstmt(PostgreSQLPlpgsqlInnerParser.CreatepublicationstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_publication_for_tables}.
	 * @param ctx the parse tree
	 */
	void enterOpt_publication_for_tables(PostgreSQLPlpgsqlInnerParser.Opt_publication_for_tablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_publication_for_tables}.
	 * @param ctx the parse tree
	 */
	void exitOpt_publication_for_tables(PostgreSQLPlpgsqlInnerParser.Opt_publication_for_tablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#publication_for_tables}.
	 * @param ctx the parse tree
	 */
	void enterPublication_for_tables(PostgreSQLPlpgsqlInnerParser.Publication_for_tablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#publication_for_tables}.
	 * @param ctx the parse tree
	 */
	void exitPublication_for_tables(PostgreSQLPlpgsqlInnerParser.Publication_for_tablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alterpublicationstmt}.
	 * @param ctx the parse tree
	 */
	void enterAlterpublicationstmt(PostgreSQLPlpgsqlInnerParser.AlterpublicationstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alterpublicationstmt}.
	 * @param ctx the parse tree
	 */
	void exitAlterpublicationstmt(PostgreSQLPlpgsqlInnerParser.AlterpublicationstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createsubscriptionstmt}.
	 * @param ctx the parse tree
	 */
	void enterCreatesubscriptionstmt(PostgreSQLPlpgsqlInnerParser.CreatesubscriptionstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createsubscriptionstmt}.
	 * @param ctx the parse tree
	 */
	void exitCreatesubscriptionstmt(PostgreSQLPlpgsqlInnerParser.CreatesubscriptionstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#publication_name_list}.
	 * @param ctx the parse tree
	 */
	void enterPublication_name_list(PostgreSQLPlpgsqlInnerParser.Publication_name_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#publication_name_list}.
	 * @param ctx the parse tree
	 */
	void exitPublication_name_list(PostgreSQLPlpgsqlInnerParser.Publication_name_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#publication_name_item}.
	 * @param ctx the parse tree
	 */
	void enterPublication_name_item(PostgreSQLPlpgsqlInnerParser.Publication_name_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#publication_name_item}.
	 * @param ctx the parse tree
	 */
	void exitPublication_name_item(PostgreSQLPlpgsqlInnerParser.Publication_name_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#altersubscriptionstmt}.
	 * @param ctx the parse tree
	 */
	void enterAltersubscriptionstmt(PostgreSQLPlpgsqlInnerParser.AltersubscriptionstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#altersubscriptionstmt}.
	 * @param ctx the parse tree
	 */
	void exitAltersubscriptionstmt(PostgreSQLPlpgsqlInnerParser.AltersubscriptionstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#dropsubscriptionstmt}.
	 * @param ctx the parse tree
	 */
	void enterDropsubscriptionstmt(PostgreSQLPlpgsqlInnerParser.DropsubscriptionstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#dropsubscriptionstmt}.
	 * @param ctx the parse tree
	 */
	void exitDropsubscriptionstmt(PostgreSQLPlpgsqlInnerParser.DropsubscriptionstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#rulestmt}.
	 * @param ctx the parse tree
	 */
	void enterRulestmt(PostgreSQLPlpgsqlInnerParser.RulestmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#rulestmt}.
	 * @param ctx the parse tree
	 */
	void exitRulestmt(PostgreSQLPlpgsqlInnerParser.RulestmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#ruleactionlist}.
	 * @param ctx the parse tree
	 */
	void enterRuleactionlist(PostgreSQLPlpgsqlInnerParser.RuleactionlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#ruleactionlist}.
	 * @param ctx the parse tree
	 */
	void exitRuleactionlist(PostgreSQLPlpgsqlInnerParser.RuleactionlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#ruleactionmulti}.
	 * @param ctx the parse tree
	 */
	void enterRuleactionmulti(PostgreSQLPlpgsqlInnerParser.RuleactionmultiContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#ruleactionmulti}.
	 * @param ctx the parse tree
	 */
	void exitRuleactionmulti(PostgreSQLPlpgsqlInnerParser.RuleactionmultiContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#ruleactionstmt}.
	 * @param ctx the parse tree
	 */
	void enterRuleactionstmt(PostgreSQLPlpgsqlInnerParser.RuleactionstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#ruleactionstmt}.
	 * @param ctx the parse tree
	 */
	void exitRuleactionstmt(PostgreSQLPlpgsqlInnerParser.RuleactionstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#ruleactionstmtOrEmpty}.
	 * @param ctx the parse tree
	 */
	void enterRuleactionstmtOrEmpty(PostgreSQLPlpgsqlInnerParser.RuleactionstmtOrEmptyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#ruleactionstmtOrEmpty}.
	 * @param ctx the parse tree
	 */
	void exitRuleactionstmtOrEmpty(PostgreSQLPlpgsqlInnerParser.RuleactionstmtOrEmptyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#event}.
	 * @param ctx the parse tree
	 */
	void enterEvent(PostgreSQLPlpgsqlInnerParser.EventContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#event}.
	 * @param ctx the parse tree
	 */
	void exitEvent(PostgreSQLPlpgsqlInnerParser.EventContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_instead}.
	 * @param ctx the parse tree
	 */
	void enterOpt_instead(PostgreSQLPlpgsqlInnerParser.Opt_insteadContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_instead}.
	 * @param ctx the parse tree
	 */
	void exitOpt_instead(PostgreSQLPlpgsqlInnerParser.Opt_insteadContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#notifystmt}.
	 * @param ctx the parse tree
	 */
	void enterNotifystmt(PostgreSQLPlpgsqlInnerParser.NotifystmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#notifystmt}.
	 * @param ctx the parse tree
	 */
	void exitNotifystmt(PostgreSQLPlpgsqlInnerParser.NotifystmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#notify_payload}.
	 * @param ctx the parse tree
	 */
	void enterNotify_payload(PostgreSQLPlpgsqlInnerParser.Notify_payloadContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#notify_payload}.
	 * @param ctx the parse tree
	 */
	void exitNotify_payload(PostgreSQLPlpgsqlInnerParser.Notify_payloadContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#listenstmt}.
	 * @param ctx the parse tree
	 */
	void enterListenstmt(PostgreSQLPlpgsqlInnerParser.ListenstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#listenstmt}.
	 * @param ctx the parse tree
	 */
	void exitListenstmt(PostgreSQLPlpgsqlInnerParser.ListenstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#unlistenstmt}.
	 * @param ctx the parse tree
	 */
	void enterUnlistenstmt(PostgreSQLPlpgsqlInnerParser.UnlistenstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#unlistenstmt}.
	 * @param ctx the parse tree
	 */
	void exitUnlistenstmt(PostgreSQLPlpgsqlInnerParser.UnlistenstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#transactionstmt}.
	 * @param ctx the parse tree
	 */
	void enterTransactionstmt(PostgreSQLPlpgsqlInnerParser.TransactionstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#transactionstmt}.
	 * @param ctx the parse tree
	 */
	void exitTransactionstmt(PostgreSQLPlpgsqlInnerParser.TransactionstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_transaction}.
	 * @param ctx the parse tree
	 */
	void enterOpt_transaction(PostgreSQLPlpgsqlInnerParser.Opt_transactionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_transaction}.
	 * @param ctx the parse tree
	 */
	void exitOpt_transaction(PostgreSQLPlpgsqlInnerParser.Opt_transactionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#transaction_mode_item}.
	 * @param ctx the parse tree
	 */
	void enterTransaction_mode_item(PostgreSQLPlpgsqlInnerParser.Transaction_mode_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#transaction_mode_item}.
	 * @param ctx the parse tree
	 */
	void exitTransaction_mode_item(PostgreSQLPlpgsqlInnerParser.Transaction_mode_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#transaction_mode_list}.
	 * @param ctx the parse tree
	 */
	void enterTransaction_mode_list(PostgreSQLPlpgsqlInnerParser.Transaction_mode_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#transaction_mode_list}.
	 * @param ctx the parse tree
	 */
	void exitTransaction_mode_list(PostgreSQLPlpgsqlInnerParser.Transaction_mode_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#transaction_mode_list_or_empty}.
	 * @param ctx the parse tree
	 */
	void enterTransaction_mode_list_or_empty(PostgreSQLPlpgsqlInnerParser.Transaction_mode_list_or_emptyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#transaction_mode_list_or_empty}.
	 * @param ctx the parse tree
	 */
	void exitTransaction_mode_list_or_empty(PostgreSQLPlpgsqlInnerParser.Transaction_mode_list_or_emptyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_transaction_chain}.
	 * @param ctx the parse tree
	 */
	void enterOpt_transaction_chain(PostgreSQLPlpgsqlInnerParser.Opt_transaction_chainContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_transaction_chain}.
	 * @param ctx the parse tree
	 */
	void exitOpt_transaction_chain(PostgreSQLPlpgsqlInnerParser.Opt_transaction_chainContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#viewstmt}.
	 * @param ctx the parse tree
	 */
	void enterViewstmt(PostgreSQLPlpgsqlInnerParser.ViewstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#viewstmt}.
	 * @param ctx the parse tree
	 */
	void exitViewstmt(PostgreSQLPlpgsqlInnerParser.ViewstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_check_option}.
	 * @param ctx the parse tree
	 */
	void enterOpt_check_option(PostgreSQLPlpgsqlInnerParser.Opt_check_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_check_option}.
	 * @param ctx the parse tree
	 */
	void exitOpt_check_option(PostgreSQLPlpgsqlInnerParser.Opt_check_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#loadstmt}.
	 * @param ctx the parse tree
	 */
	void enterLoadstmt(PostgreSQLPlpgsqlInnerParser.LoadstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#loadstmt}.
	 * @param ctx the parse tree
	 */
	void exitLoadstmt(PostgreSQLPlpgsqlInnerParser.LoadstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createdbstmt}.
	 * @param ctx the parse tree
	 */
	void enterCreatedbstmt(PostgreSQLPlpgsqlInnerParser.CreatedbstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createdbstmt}.
	 * @param ctx the parse tree
	 */
	void exitCreatedbstmt(PostgreSQLPlpgsqlInnerParser.CreatedbstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createdb_opt_list}.
	 * @param ctx the parse tree
	 */
	void enterCreatedb_opt_list(PostgreSQLPlpgsqlInnerParser.Createdb_opt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createdb_opt_list}.
	 * @param ctx the parse tree
	 */
	void exitCreatedb_opt_list(PostgreSQLPlpgsqlInnerParser.Createdb_opt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createdb_opt_items}.
	 * @param ctx the parse tree
	 */
	void enterCreatedb_opt_items(PostgreSQLPlpgsqlInnerParser.Createdb_opt_itemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createdb_opt_items}.
	 * @param ctx the parse tree
	 */
	void exitCreatedb_opt_items(PostgreSQLPlpgsqlInnerParser.Createdb_opt_itemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createdb_opt_item}.
	 * @param ctx the parse tree
	 */
	void enterCreatedb_opt_item(PostgreSQLPlpgsqlInnerParser.Createdb_opt_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createdb_opt_item}.
	 * @param ctx the parse tree
	 */
	void exitCreatedb_opt_item(PostgreSQLPlpgsqlInnerParser.Createdb_opt_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createdb_opt_name}.
	 * @param ctx the parse tree
	 */
	void enterCreatedb_opt_name(PostgreSQLPlpgsqlInnerParser.Createdb_opt_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createdb_opt_name}.
	 * @param ctx the parse tree
	 */
	void exitCreatedb_opt_name(PostgreSQLPlpgsqlInnerParser.Createdb_opt_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_equal}.
	 * @param ctx the parse tree
	 */
	void enterOpt_equal(PostgreSQLPlpgsqlInnerParser.Opt_equalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_equal}.
	 * @param ctx the parse tree
	 */
	void exitOpt_equal(PostgreSQLPlpgsqlInnerParser.Opt_equalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alterdatabasestmt}.
	 * @param ctx the parse tree
	 */
	void enterAlterdatabasestmt(PostgreSQLPlpgsqlInnerParser.AlterdatabasestmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alterdatabasestmt}.
	 * @param ctx the parse tree
	 */
	void exitAlterdatabasestmt(PostgreSQLPlpgsqlInnerParser.AlterdatabasestmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alterdatabasesetstmt}.
	 * @param ctx the parse tree
	 */
	void enterAlterdatabasesetstmt(PostgreSQLPlpgsqlInnerParser.AlterdatabasesetstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alterdatabasesetstmt}.
	 * @param ctx the parse tree
	 */
	void exitAlterdatabasesetstmt(PostgreSQLPlpgsqlInnerParser.AlterdatabasesetstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#dropdbstmt}.
	 * @param ctx the parse tree
	 */
	void enterDropdbstmt(PostgreSQLPlpgsqlInnerParser.DropdbstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#dropdbstmt}.
	 * @param ctx the parse tree
	 */
	void exitDropdbstmt(PostgreSQLPlpgsqlInnerParser.DropdbstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#drop_option_list}.
	 * @param ctx the parse tree
	 */
	void enterDrop_option_list(PostgreSQLPlpgsqlInnerParser.Drop_option_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#drop_option_list}.
	 * @param ctx the parse tree
	 */
	void exitDrop_option_list(PostgreSQLPlpgsqlInnerParser.Drop_option_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#drop_option}.
	 * @param ctx the parse tree
	 */
	void enterDrop_option(PostgreSQLPlpgsqlInnerParser.Drop_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#drop_option}.
	 * @param ctx the parse tree
	 */
	void exitDrop_option(PostgreSQLPlpgsqlInnerParser.Drop_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#altercollationstmt}.
	 * @param ctx the parse tree
	 */
	void enterAltercollationstmt(PostgreSQLPlpgsqlInnerParser.AltercollationstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#altercollationstmt}.
	 * @param ctx the parse tree
	 */
	void exitAltercollationstmt(PostgreSQLPlpgsqlInnerParser.AltercollationstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#altersystemstmt}.
	 * @param ctx the parse tree
	 */
	void enterAltersystemstmt(PostgreSQLPlpgsqlInnerParser.AltersystemstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#altersystemstmt}.
	 * @param ctx the parse tree
	 */
	void exitAltersystemstmt(PostgreSQLPlpgsqlInnerParser.AltersystemstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createdomainstmt}.
	 * @param ctx the parse tree
	 */
	void enterCreatedomainstmt(PostgreSQLPlpgsqlInnerParser.CreatedomainstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createdomainstmt}.
	 * @param ctx the parse tree
	 */
	void exitCreatedomainstmt(PostgreSQLPlpgsqlInnerParser.CreatedomainstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alterdomainstmt}.
	 * @param ctx the parse tree
	 */
	void enterAlterdomainstmt(PostgreSQLPlpgsqlInnerParser.AlterdomainstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alterdomainstmt}.
	 * @param ctx the parse tree
	 */
	void exitAlterdomainstmt(PostgreSQLPlpgsqlInnerParser.AlterdomainstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_as}.
	 * @param ctx the parse tree
	 */
	void enterOpt_as(PostgreSQLPlpgsqlInnerParser.Opt_asContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_as}.
	 * @param ctx the parse tree
	 */
	void exitOpt_as(PostgreSQLPlpgsqlInnerParser.Opt_asContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#altertsdictionarystmt}.
	 * @param ctx the parse tree
	 */
	void enterAltertsdictionarystmt(PostgreSQLPlpgsqlInnerParser.AltertsdictionarystmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#altertsdictionarystmt}.
	 * @param ctx the parse tree
	 */
	void exitAltertsdictionarystmt(PostgreSQLPlpgsqlInnerParser.AltertsdictionarystmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#altertsconfigurationstmt}.
	 * @param ctx the parse tree
	 */
	void enterAltertsconfigurationstmt(PostgreSQLPlpgsqlInnerParser.AltertsconfigurationstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#altertsconfigurationstmt}.
	 * @param ctx the parse tree
	 */
	void exitAltertsconfigurationstmt(PostgreSQLPlpgsqlInnerParser.AltertsconfigurationstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#any_with}.
	 * @param ctx the parse tree
	 */
	void enterAny_with(PostgreSQLPlpgsqlInnerParser.Any_withContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#any_with}.
	 * @param ctx the parse tree
	 */
	void exitAny_with(PostgreSQLPlpgsqlInnerParser.Any_withContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createconversionstmt}.
	 * @param ctx the parse tree
	 */
	void enterCreateconversionstmt(PostgreSQLPlpgsqlInnerParser.CreateconversionstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createconversionstmt}.
	 * @param ctx the parse tree
	 */
	void exitCreateconversionstmt(PostgreSQLPlpgsqlInnerParser.CreateconversionstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#clusterstmt}.
	 * @param ctx the parse tree
	 */
	void enterClusterstmt(PostgreSQLPlpgsqlInnerParser.ClusterstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#clusterstmt}.
	 * @param ctx the parse tree
	 */
	void exitClusterstmt(PostgreSQLPlpgsqlInnerParser.ClusterstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#cluster_index_specification}.
	 * @param ctx the parse tree
	 */
	void enterCluster_index_specification(PostgreSQLPlpgsqlInnerParser.Cluster_index_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#cluster_index_specification}.
	 * @param ctx the parse tree
	 */
	void exitCluster_index_specification(PostgreSQLPlpgsqlInnerParser.Cluster_index_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#vacuumstmt}.
	 * @param ctx the parse tree
	 */
	void enterVacuumstmt(PostgreSQLPlpgsqlInnerParser.VacuumstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#vacuumstmt}.
	 * @param ctx the parse tree
	 */
	void exitVacuumstmt(PostgreSQLPlpgsqlInnerParser.VacuumstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#analyzestmt}.
	 * @param ctx the parse tree
	 */
	void enterAnalyzestmt(PostgreSQLPlpgsqlInnerParser.AnalyzestmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#analyzestmt}.
	 * @param ctx the parse tree
	 */
	void exitAnalyzestmt(PostgreSQLPlpgsqlInnerParser.AnalyzestmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#vac_analyze_option_list}.
	 * @param ctx the parse tree
	 */
	void enterVac_analyze_option_list(PostgreSQLPlpgsqlInnerParser.Vac_analyze_option_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#vac_analyze_option_list}.
	 * @param ctx the parse tree
	 */
	void exitVac_analyze_option_list(PostgreSQLPlpgsqlInnerParser.Vac_analyze_option_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#analyze_keyword}.
	 * @param ctx the parse tree
	 */
	void enterAnalyze_keyword(PostgreSQLPlpgsqlInnerParser.Analyze_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#analyze_keyword}.
	 * @param ctx the parse tree
	 */
	void exitAnalyze_keyword(PostgreSQLPlpgsqlInnerParser.Analyze_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#vac_analyze_option_elem}.
	 * @param ctx the parse tree
	 */
	void enterVac_analyze_option_elem(PostgreSQLPlpgsqlInnerParser.Vac_analyze_option_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#vac_analyze_option_elem}.
	 * @param ctx the parse tree
	 */
	void exitVac_analyze_option_elem(PostgreSQLPlpgsqlInnerParser.Vac_analyze_option_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#vac_analyze_option_name}.
	 * @param ctx the parse tree
	 */
	void enterVac_analyze_option_name(PostgreSQLPlpgsqlInnerParser.Vac_analyze_option_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#vac_analyze_option_name}.
	 * @param ctx the parse tree
	 */
	void exitVac_analyze_option_name(PostgreSQLPlpgsqlInnerParser.Vac_analyze_option_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#vac_analyze_option_arg}.
	 * @param ctx the parse tree
	 */
	void enterVac_analyze_option_arg(PostgreSQLPlpgsqlInnerParser.Vac_analyze_option_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#vac_analyze_option_arg}.
	 * @param ctx the parse tree
	 */
	void exitVac_analyze_option_arg(PostgreSQLPlpgsqlInnerParser.Vac_analyze_option_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_analyze}.
	 * @param ctx the parse tree
	 */
	void enterOpt_analyze(PostgreSQLPlpgsqlInnerParser.Opt_analyzeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_analyze}.
	 * @param ctx the parse tree
	 */
	void exitOpt_analyze(PostgreSQLPlpgsqlInnerParser.Opt_analyzeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_verbose}.
	 * @param ctx the parse tree
	 */
	void enterOpt_verbose(PostgreSQLPlpgsqlInnerParser.Opt_verboseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_verbose}.
	 * @param ctx the parse tree
	 */
	void exitOpt_verbose(PostgreSQLPlpgsqlInnerParser.Opt_verboseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_full}.
	 * @param ctx the parse tree
	 */
	void enterOpt_full(PostgreSQLPlpgsqlInnerParser.Opt_fullContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_full}.
	 * @param ctx the parse tree
	 */
	void exitOpt_full(PostgreSQLPlpgsqlInnerParser.Opt_fullContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_freeze}.
	 * @param ctx the parse tree
	 */
	void enterOpt_freeze(PostgreSQLPlpgsqlInnerParser.Opt_freezeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_freeze}.
	 * @param ctx the parse tree
	 */
	void exitOpt_freeze(PostgreSQLPlpgsqlInnerParser.Opt_freezeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_name_list}.
	 * @param ctx the parse tree
	 */
	void enterOpt_name_list(PostgreSQLPlpgsqlInnerParser.Opt_name_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_name_list}.
	 * @param ctx the parse tree
	 */
	void exitOpt_name_list(PostgreSQLPlpgsqlInnerParser.Opt_name_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#vacuum_relation}.
	 * @param ctx the parse tree
	 */
	void enterVacuum_relation(PostgreSQLPlpgsqlInnerParser.Vacuum_relationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#vacuum_relation}.
	 * @param ctx the parse tree
	 */
	void exitVacuum_relation(PostgreSQLPlpgsqlInnerParser.Vacuum_relationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#vacuum_relation_list}.
	 * @param ctx the parse tree
	 */
	void enterVacuum_relation_list(PostgreSQLPlpgsqlInnerParser.Vacuum_relation_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#vacuum_relation_list}.
	 * @param ctx the parse tree
	 */
	void exitVacuum_relation_list(PostgreSQLPlpgsqlInnerParser.Vacuum_relation_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_vacuum_relation_list}.
	 * @param ctx the parse tree
	 */
	void enterOpt_vacuum_relation_list(PostgreSQLPlpgsqlInnerParser.Opt_vacuum_relation_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_vacuum_relation_list}.
	 * @param ctx the parse tree
	 */
	void exitOpt_vacuum_relation_list(PostgreSQLPlpgsqlInnerParser.Opt_vacuum_relation_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#explainstmt}.
	 * @param ctx the parse tree
	 */
	void enterExplainstmt(PostgreSQLPlpgsqlInnerParser.ExplainstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#explainstmt}.
	 * @param ctx the parse tree
	 */
	void exitExplainstmt(PostgreSQLPlpgsqlInnerParser.ExplainstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#explainablestmt}.
	 * @param ctx the parse tree
	 */
	void enterExplainablestmt(PostgreSQLPlpgsqlInnerParser.ExplainablestmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#explainablestmt}.
	 * @param ctx the parse tree
	 */
	void exitExplainablestmt(PostgreSQLPlpgsqlInnerParser.ExplainablestmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#explain_option_list}.
	 * @param ctx the parse tree
	 */
	void enterExplain_option_list(PostgreSQLPlpgsqlInnerParser.Explain_option_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#explain_option_list}.
	 * @param ctx the parse tree
	 */
	void exitExplain_option_list(PostgreSQLPlpgsqlInnerParser.Explain_option_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#explain_option_elem}.
	 * @param ctx the parse tree
	 */
	void enterExplain_option_elem(PostgreSQLPlpgsqlInnerParser.Explain_option_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#explain_option_elem}.
	 * @param ctx the parse tree
	 */
	void exitExplain_option_elem(PostgreSQLPlpgsqlInnerParser.Explain_option_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#explain_option_name}.
	 * @param ctx the parse tree
	 */
	void enterExplain_option_name(PostgreSQLPlpgsqlInnerParser.Explain_option_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#explain_option_name}.
	 * @param ctx the parse tree
	 */
	void exitExplain_option_name(PostgreSQLPlpgsqlInnerParser.Explain_option_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#explain_option_arg}.
	 * @param ctx the parse tree
	 */
	void enterExplain_option_arg(PostgreSQLPlpgsqlInnerParser.Explain_option_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#explain_option_arg}.
	 * @param ctx the parse tree
	 */
	void exitExplain_option_arg(PostgreSQLPlpgsqlInnerParser.Explain_option_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#preparestmt}.
	 * @param ctx the parse tree
	 */
	void enterPreparestmt(PostgreSQLPlpgsqlInnerParser.PreparestmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#preparestmt}.
	 * @param ctx the parse tree
	 */
	void exitPreparestmt(PostgreSQLPlpgsqlInnerParser.PreparestmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#prep_type_clause}.
	 * @param ctx the parse tree
	 */
	void enterPrep_type_clause(PostgreSQLPlpgsqlInnerParser.Prep_type_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#prep_type_clause}.
	 * @param ctx the parse tree
	 */
	void exitPrep_type_clause(PostgreSQLPlpgsqlInnerParser.Prep_type_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#preparablestmt}.
	 * @param ctx the parse tree
	 */
	void enterPreparablestmt(PostgreSQLPlpgsqlInnerParser.PreparablestmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#preparablestmt}.
	 * @param ctx the parse tree
	 */
	void exitPreparablestmt(PostgreSQLPlpgsqlInnerParser.PreparablestmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#executestmt}.
	 * @param ctx the parse tree
	 */
	void enterExecutestmt(PostgreSQLPlpgsqlInnerParser.ExecutestmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#executestmt}.
	 * @param ctx the parse tree
	 */
	void exitExecutestmt(PostgreSQLPlpgsqlInnerParser.ExecutestmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#execute_param_clause}.
	 * @param ctx the parse tree
	 */
	void enterExecute_param_clause(PostgreSQLPlpgsqlInnerParser.Execute_param_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#execute_param_clause}.
	 * @param ctx the parse tree
	 */
	void exitExecute_param_clause(PostgreSQLPlpgsqlInnerParser.Execute_param_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#deallocatestmt}.
	 * @param ctx the parse tree
	 */
	void enterDeallocatestmt(PostgreSQLPlpgsqlInnerParser.DeallocatestmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#deallocatestmt}.
	 * @param ctx the parse tree
	 */
	void exitDeallocatestmt(PostgreSQLPlpgsqlInnerParser.DeallocatestmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#insertstmt}.
	 * @param ctx the parse tree
	 */
	void enterInsertstmt(PostgreSQLPlpgsqlInnerParser.InsertstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#insertstmt}.
	 * @param ctx the parse tree
	 */
	void exitInsertstmt(PostgreSQLPlpgsqlInnerParser.InsertstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#insert_target}.
	 * @param ctx the parse tree
	 */
	void enterInsert_target(PostgreSQLPlpgsqlInnerParser.Insert_targetContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#insert_target}.
	 * @param ctx the parse tree
	 */
	void exitInsert_target(PostgreSQLPlpgsqlInnerParser.Insert_targetContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#insert_rest}.
	 * @param ctx the parse tree
	 */
	void enterInsert_rest(PostgreSQLPlpgsqlInnerParser.Insert_restContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#insert_rest}.
	 * @param ctx the parse tree
	 */
	void exitInsert_rest(PostgreSQLPlpgsqlInnerParser.Insert_restContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#override_kind}.
	 * @param ctx the parse tree
	 */
	void enterOverride_kind(PostgreSQLPlpgsqlInnerParser.Override_kindContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#override_kind}.
	 * @param ctx the parse tree
	 */
	void exitOverride_kind(PostgreSQLPlpgsqlInnerParser.Override_kindContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#insert_column_list}.
	 * @param ctx the parse tree
	 */
	void enterInsert_column_list(PostgreSQLPlpgsqlInnerParser.Insert_column_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#insert_column_list}.
	 * @param ctx the parse tree
	 */
	void exitInsert_column_list(PostgreSQLPlpgsqlInnerParser.Insert_column_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#insert_column_item}.
	 * @param ctx the parse tree
	 */
	void enterInsert_column_item(PostgreSQLPlpgsqlInnerParser.Insert_column_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#insert_column_item}.
	 * @param ctx the parse tree
	 */
	void exitInsert_column_item(PostgreSQLPlpgsqlInnerParser.Insert_column_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_on_conflict}.
	 * @param ctx the parse tree
	 */
	void enterOpt_on_conflict(PostgreSQLPlpgsqlInnerParser.Opt_on_conflictContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_on_conflict}.
	 * @param ctx the parse tree
	 */
	void exitOpt_on_conflict(PostgreSQLPlpgsqlInnerParser.Opt_on_conflictContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_conf_expr}.
	 * @param ctx the parse tree
	 */
	void enterOpt_conf_expr(PostgreSQLPlpgsqlInnerParser.Opt_conf_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_conf_expr}.
	 * @param ctx the parse tree
	 */
	void exitOpt_conf_expr(PostgreSQLPlpgsqlInnerParser.Opt_conf_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#returning_clause}.
	 * @param ctx the parse tree
	 */
	void enterReturning_clause(PostgreSQLPlpgsqlInnerParser.Returning_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#returning_clause}.
	 * @param ctx the parse tree
	 */
	void exitReturning_clause(PostgreSQLPlpgsqlInnerParser.Returning_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#deletestmt}.
	 * @param ctx the parse tree
	 */
	void enterDeletestmt(PostgreSQLPlpgsqlInnerParser.DeletestmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#deletestmt}.
	 * @param ctx the parse tree
	 */
	void exitDeletestmt(PostgreSQLPlpgsqlInnerParser.DeletestmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#using_clause}.
	 * @param ctx the parse tree
	 */
	void enterUsing_clause(PostgreSQLPlpgsqlInnerParser.Using_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#using_clause}.
	 * @param ctx the parse tree
	 */
	void exitUsing_clause(PostgreSQLPlpgsqlInnerParser.Using_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#lockstmt}.
	 * @param ctx the parse tree
	 */
	void enterLockstmt(PostgreSQLPlpgsqlInnerParser.LockstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#lockstmt}.
	 * @param ctx the parse tree
	 */
	void exitLockstmt(PostgreSQLPlpgsqlInnerParser.LockstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_lock}.
	 * @param ctx the parse tree
	 */
	void enterOpt_lock(PostgreSQLPlpgsqlInnerParser.Opt_lockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_lock}.
	 * @param ctx the parse tree
	 */
	void exitOpt_lock(PostgreSQLPlpgsqlInnerParser.Opt_lockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#lock_type}.
	 * @param ctx the parse tree
	 */
	void enterLock_type(PostgreSQLPlpgsqlInnerParser.Lock_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#lock_type}.
	 * @param ctx the parse tree
	 */
	void exitLock_type(PostgreSQLPlpgsqlInnerParser.Lock_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_nowait}.
	 * @param ctx the parse tree
	 */
	void enterOpt_nowait(PostgreSQLPlpgsqlInnerParser.Opt_nowaitContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_nowait}.
	 * @param ctx the parse tree
	 */
	void exitOpt_nowait(PostgreSQLPlpgsqlInnerParser.Opt_nowaitContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_nowait_or_skip}.
	 * @param ctx the parse tree
	 */
	void enterOpt_nowait_or_skip(PostgreSQLPlpgsqlInnerParser.Opt_nowait_or_skipContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_nowait_or_skip}.
	 * @param ctx the parse tree
	 */
	void exitOpt_nowait_or_skip(PostgreSQLPlpgsqlInnerParser.Opt_nowait_or_skipContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#updatestmt}.
	 * @param ctx the parse tree
	 */
	void enterUpdatestmt(PostgreSQLPlpgsqlInnerParser.UpdatestmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#updatestmt}.
	 * @param ctx the parse tree
	 */
	void exitUpdatestmt(PostgreSQLPlpgsqlInnerParser.UpdatestmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#set_clause_list}.
	 * @param ctx the parse tree
	 */
	void enterSet_clause_list(PostgreSQLPlpgsqlInnerParser.Set_clause_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#set_clause_list}.
	 * @param ctx the parse tree
	 */
	void exitSet_clause_list(PostgreSQLPlpgsqlInnerParser.Set_clause_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#set_clause}.
	 * @param ctx the parse tree
	 */
	void enterSet_clause(PostgreSQLPlpgsqlInnerParser.Set_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#set_clause}.
	 * @param ctx the parse tree
	 */
	void exitSet_clause(PostgreSQLPlpgsqlInnerParser.Set_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#set_target}.
	 * @param ctx the parse tree
	 */
	void enterSet_target(PostgreSQLPlpgsqlInnerParser.Set_targetContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#set_target}.
	 * @param ctx the parse tree
	 */
	void exitSet_target(PostgreSQLPlpgsqlInnerParser.Set_targetContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#set_target_list}.
	 * @param ctx the parse tree
	 */
	void enterSet_target_list(PostgreSQLPlpgsqlInnerParser.Set_target_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#set_target_list}.
	 * @param ctx the parse tree
	 */
	void exitSet_target_list(PostgreSQLPlpgsqlInnerParser.Set_target_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#declarecursorstmt}.
	 * @param ctx the parse tree
	 */
	void enterDeclarecursorstmt(PostgreSQLPlpgsqlInnerParser.DeclarecursorstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#declarecursorstmt}.
	 * @param ctx the parse tree
	 */
	void exitDeclarecursorstmt(PostgreSQLPlpgsqlInnerParser.DeclarecursorstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#cursor_name}.
	 * @param ctx the parse tree
	 */
	void enterCursor_name(PostgreSQLPlpgsqlInnerParser.Cursor_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#cursor_name}.
	 * @param ctx the parse tree
	 */
	void exitCursor_name(PostgreSQLPlpgsqlInnerParser.Cursor_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#cursor_options}.
	 * @param ctx the parse tree
	 */
	void enterCursor_options(PostgreSQLPlpgsqlInnerParser.Cursor_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#cursor_options}.
	 * @param ctx the parse tree
	 */
	void exitCursor_options(PostgreSQLPlpgsqlInnerParser.Cursor_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_hold}.
	 * @param ctx the parse tree
	 */
	void enterOpt_hold(PostgreSQLPlpgsqlInnerParser.Opt_holdContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_hold}.
	 * @param ctx the parse tree
	 */
	void exitOpt_hold(PostgreSQLPlpgsqlInnerParser.Opt_holdContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#selectstmt}.
	 * @param ctx the parse tree
	 */
	void enterSelectstmt(PostgreSQLPlpgsqlInnerParser.SelectstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#selectstmt}.
	 * @param ctx the parse tree
	 */
	void exitSelectstmt(PostgreSQLPlpgsqlInnerParser.SelectstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#select_with_parens}.
	 * @param ctx the parse tree
	 */
	void enterSelect_with_parens(PostgreSQLPlpgsqlInnerParser.Select_with_parensContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#select_with_parens}.
	 * @param ctx the parse tree
	 */
	void exitSelect_with_parens(PostgreSQLPlpgsqlInnerParser.Select_with_parensContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#select_no_parens}.
	 * @param ctx the parse tree
	 */
	void enterSelect_no_parens(PostgreSQLPlpgsqlInnerParser.Select_no_parensContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#select_no_parens}.
	 * @param ctx the parse tree
	 */
	void exitSelect_no_parens(PostgreSQLPlpgsqlInnerParser.Select_no_parensContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#select_clause}.
	 * @param ctx the parse tree
	 */
	void enterSelect_clause(PostgreSQLPlpgsqlInnerParser.Select_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#select_clause}.
	 * @param ctx the parse tree
	 */
	void exitSelect_clause(PostgreSQLPlpgsqlInnerParser.Select_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#simple_select}.
	 * @param ctx the parse tree
	 */
	void enterSimple_select(PostgreSQLPlpgsqlInnerParser.Simple_selectContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#simple_select}.
	 * @param ctx the parse tree
	 */
	void exitSimple_select(PostgreSQLPlpgsqlInnerParser.Simple_selectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code union}
	 * labeled alternative in {@link PostgreSQLPlpgsqlInnerParser#set_operator}.
	 * @param ctx the parse tree
	 */
	void enterUnion(PostgreSQLPlpgsqlInnerParser.UnionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code union}
	 * labeled alternative in {@link PostgreSQLPlpgsqlInnerParser#set_operator}.
	 * @param ctx the parse tree
	 */
	void exitUnion(PostgreSQLPlpgsqlInnerParser.UnionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intersect}
	 * labeled alternative in {@link PostgreSQLPlpgsqlInnerParser#set_operator}.
	 * @param ctx the parse tree
	 */
	void enterIntersect(PostgreSQLPlpgsqlInnerParser.IntersectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intersect}
	 * labeled alternative in {@link PostgreSQLPlpgsqlInnerParser#set_operator}.
	 * @param ctx the parse tree
	 */
	void exitIntersect(PostgreSQLPlpgsqlInnerParser.IntersectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code except}
	 * labeled alternative in {@link PostgreSQLPlpgsqlInnerParser#set_operator}.
	 * @param ctx the parse tree
	 */
	void enterExcept(PostgreSQLPlpgsqlInnerParser.ExceptContext ctx);
	/**
	 * Exit a parse tree produced by the {@code except}
	 * labeled alternative in {@link PostgreSQLPlpgsqlInnerParser#set_operator}.
	 * @param ctx the parse tree
	 */
	void exitExcept(PostgreSQLPlpgsqlInnerParser.ExceptContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#set_operator_with_all_or_distinct}.
	 * @param ctx the parse tree
	 */
	void enterSet_operator_with_all_or_distinct(PostgreSQLPlpgsqlInnerParser.Set_operator_with_all_or_distinctContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#set_operator_with_all_or_distinct}.
	 * @param ctx the parse tree
	 */
	void exitSet_operator_with_all_or_distinct(PostgreSQLPlpgsqlInnerParser.Set_operator_with_all_or_distinctContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#with_clause}.
	 * @param ctx the parse tree
	 */
	void enterWith_clause(PostgreSQLPlpgsqlInnerParser.With_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#with_clause}.
	 * @param ctx the parse tree
	 */
	void exitWith_clause(PostgreSQLPlpgsqlInnerParser.With_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#cte_list}.
	 * @param ctx the parse tree
	 */
	void enterCte_list(PostgreSQLPlpgsqlInnerParser.Cte_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#cte_list}.
	 * @param ctx the parse tree
	 */
	void exitCte_list(PostgreSQLPlpgsqlInnerParser.Cte_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#common_table_expr}.
	 * @param ctx the parse tree
	 */
	void enterCommon_table_expr(PostgreSQLPlpgsqlInnerParser.Common_table_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#common_table_expr}.
	 * @param ctx the parse tree
	 */
	void exitCommon_table_expr(PostgreSQLPlpgsqlInnerParser.Common_table_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_materialized}.
	 * @param ctx the parse tree
	 */
	void enterOpt_materialized(PostgreSQLPlpgsqlInnerParser.Opt_materializedContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_materialized}.
	 * @param ctx the parse tree
	 */
	void exitOpt_materialized(PostgreSQLPlpgsqlInnerParser.Opt_materializedContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_with_clause}.
	 * @param ctx the parse tree
	 */
	void enterOpt_with_clause(PostgreSQLPlpgsqlInnerParser.Opt_with_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_with_clause}.
	 * @param ctx the parse tree
	 */
	void exitOpt_with_clause(PostgreSQLPlpgsqlInnerParser.Opt_with_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#into_clause}.
	 * @param ctx the parse tree
	 */
	void enterInto_clause(PostgreSQLPlpgsqlInnerParser.Into_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#into_clause}.
	 * @param ctx the parse tree
	 */
	void exitInto_clause(PostgreSQLPlpgsqlInnerParser.Into_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_strict}.
	 * @param ctx the parse tree
	 */
	void enterOpt_strict(PostgreSQLPlpgsqlInnerParser.Opt_strictContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_strict}.
	 * @param ctx the parse tree
	 */
	void exitOpt_strict(PostgreSQLPlpgsqlInnerParser.Opt_strictContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opttempTableName}.
	 * @param ctx the parse tree
	 */
	void enterOpttempTableName(PostgreSQLPlpgsqlInnerParser.OpttempTableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opttempTableName}.
	 * @param ctx the parse tree
	 */
	void exitOpttempTableName(PostgreSQLPlpgsqlInnerParser.OpttempTableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_table}.
	 * @param ctx the parse tree
	 */
	void enterOpt_table(PostgreSQLPlpgsqlInnerParser.Opt_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_table}.
	 * @param ctx the parse tree
	 */
	void exitOpt_table(PostgreSQLPlpgsqlInnerParser.Opt_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#all_or_distinct}.
	 * @param ctx the parse tree
	 */
	void enterAll_or_distinct(PostgreSQLPlpgsqlInnerParser.All_or_distinctContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#all_or_distinct}.
	 * @param ctx the parse tree
	 */
	void exitAll_or_distinct(PostgreSQLPlpgsqlInnerParser.All_or_distinctContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#distinct_clause}.
	 * @param ctx the parse tree
	 */
	void enterDistinct_clause(PostgreSQLPlpgsqlInnerParser.Distinct_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#distinct_clause}.
	 * @param ctx the parse tree
	 */
	void exitDistinct_clause(PostgreSQLPlpgsqlInnerParser.Distinct_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_all_clause}.
	 * @param ctx the parse tree
	 */
	void enterOpt_all_clause(PostgreSQLPlpgsqlInnerParser.Opt_all_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_all_clause}.
	 * @param ctx the parse tree
	 */
	void exitOpt_all_clause(PostgreSQLPlpgsqlInnerParser.Opt_all_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_sort_clause}.
	 * @param ctx the parse tree
	 */
	void enterOpt_sort_clause(PostgreSQLPlpgsqlInnerParser.Opt_sort_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_sort_clause}.
	 * @param ctx the parse tree
	 */
	void exitOpt_sort_clause(PostgreSQLPlpgsqlInnerParser.Opt_sort_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#sort_clause}.
	 * @param ctx the parse tree
	 */
	void enterSort_clause(PostgreSQLPlpgsqlInnerParser.Sort_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#sort_clause}.
	 * @param ctx the parse tree
	 */
	void exitSort_clause(PostgreSQLPlpgsqlInnerParser.Sort_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#sortby_list}.
	 * @param ctx the parse tree
	 */
	void enterSortby_list(PostgreSQLPlpgsqlInnerParser.Sortby_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#sortby_list}.
	 * @param ctx the parse tree
	 */
	void exitSortby_list(PostgreSQLPlpgsqlInnerParser.Sortby_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#sortby}.
	 * @param ctx the parse tree
	 */
	void enterSortby(PostgreSQLPlpgsqlInnerParser.SortbyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#sortby}.
	 * @param ctx the parse tree
	 */
	void exitSortby(PostgreSQLPlpgsqlInnerParser.SortbyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#select_limit}.
	 * @param ctx the parse tree
	 */
	void enterSelect_limit(PostgreSQLPlpgsqlInnerParser.Select_limitContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#select_limit}.
	 * @param ctx the parse tree
	 */
	void exitSelect_limit(PostgreSQLPlpgsqlInnerParser.Select_limitContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_select_limit}.
	 * @param ctx the parse tree
	 */
	void enterOpt_select_limit(PostgreSQLPlpgsqlInnerParser.Opt_select_limitContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_select_limit}.
	 * @param ctx the parse tree
	 */
	void exitOpt_select_limit(PostgreSQLPlpgsqlInnerParser.Opt_select_limitContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#limit_clause}.
	 * @param ctx the parse tree
	 */
	void enterLimit_clause(PostgreSQLPlpgsqlInnerParser.Limit_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#limit_clause}.
	 * @param ctx the parse tree
	 */
	void exitLimit_clause(PostgreSQLPlpgsqlInnerParser.Limit_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#offset_clause}.
	 * @param ctx the parse tree
	 */
	void enterOffset_clause(PostgreSQLPlpgsqlInnerParser.Offset_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#offset_clause}.
	 * @param ctx the parse tree
	 */
	void exitOffset_clause(PostgreSQLPlpgsqlInnerParser.Offset_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#select_limit_value}.
	 * @param ctx the parse tree
	 */
	void enterSelect_limit_value(PostgreSQLPlpgsqlInnerParser.Select_limit_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#select_limit_value}.
	 * @param ctx the parse tree
	 */
	void exitSelect_limit_value(PostgreSQLPlpgsqlInnerParser.Select_limit_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#select_offset_value}.
	 * @param ctx the parse tree
	 */
	void enterSelect_offset_value(PostgreSQLPlpgsqlInnerParser.Select_offset_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#select_offset_value}.
	 * @param ctx the parse tree
	 */
	void exitSelect_offset_value(PostgreSQLPlpgsqlInnerParser.Select_offset_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#select_fetch_first_value}.
	 * @param ctx the parse tree
	 */
	void enterSelect_fetch_first_value(PostgreSQLPlpgsqlInnerParser.Select_fetch_first_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#select_fetch_first_value}.
	 * @param ctx the parse tree
	 */
	void exitSelect_fetch_first_value(PostgreSQLPlpgsqlInnerParser.Select_fetch_first_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#i_or_f_const}.
	 * @param ctx the parse tree
	 */
	void enterI_or_f_const(PostgreSQLPlpgsqlInnerParser.I_or_f_constContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#i_or_f_const}.
	 * @param ctx the parse tree
	 */
	void exitI_or_f_const(PostgreSQLPlpgsqlInnerParser.I_or_f_constContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#row_or_rows}.
	 * @param ctx the parse tree
	 */
	void enterRow_or_rows(PostgreSQLPlpgsqlInnerParser.Row_or_rowsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#row_or_rows}.
	 * @param ctx the parse tree
	 */
	void exitRow_or_rows(PostgreSQLPlpgsqlInnerParser.Row_or_rowsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#first_or_next}.
	 * @param ctx the parse tree
	 */
	void enterFirst_or_next(PostgreSQLPlpgsqlInnerParser.First_or_nextContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#first_or_next}.
	 * @param ctx the parse tree
	 */
	void exitFirst_or_next(PostgreSQLPlpgsqlInnerParser.First_or_nextContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#group_clause}.
	 * @param ctx the parse tree
	 */
	void enterGroup_clause(PostgreSQLPlpgsqlInnerParser.Group_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#group_clause}.
	 * @param ctx the parse tree
	 */
	void exitGroup_clause(PostgreSQLPlpgsqlInnerParser.Group_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#group_by_list}.
	 * @param ctx the parse tree
	 */
	void enterGroup_by_list(PostgreSQLPlpgsqlInnerParser.Group_by_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#group_by_list}.
	 * @param ctx the parse tree
	 */
	void exitGroup_by_list(PostgreSQLPlpgsqlInnerParser.Group_by_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#group_by_item}.
	 * @param ctx the parse tree
	 */
	void enterGroup_by_item(PostgreSQLPlpgsqlInnerParser.Group_by_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#group_by_item}.
	 * @param ctx the parse tree
	 */
	void exitGroup_by_item(PostgreSQLPlpgsqlInnerParser.Group_by_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#empty_grouping_set}.
	 * @param ctx the parse tree
	 */
	void enterEmpty_grouping_set(PostgreSQLPlpgsqlInnerParser.Empty_grouping_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#empty_grouping_set}.
	 * @param ctx the parse tree
	 */
	void exitEmpty_grouping_set(PostgreSQLPlpgsqlInnerParser.Empty_grouping_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#rollup_clause}.
	 * @param ctx the parse tree
	 */
	void enterRollup_clause(PostgreSQLPlpgsqlInnerParser.Rollup_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#rollup_clause}.
	 * @param ctx the parse tree
	 */
	void exitRollup_clause(PostgreSQLPlpgsqlInnerParser.Rollup_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#cube_clause}.
	 * @param ctx the parse tree
	 */
	void enterCube_clause(PostgreSQLPlpgsqlInnerParser.Cube_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#cube_clause}.
	 * @param ctx the parse tree
	 */
	void exitCube_clause(PostgreSQLPlpgsqlInnerParser.Cube_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#grouping_sets_clause}.
	 * @param ctx the parse tree
	 */
	void enterGrouping_sets_clause(PostgreSQLPlpgsqlInnerParser.Grouping_sets_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#grouping_sets_clause}.
	 * @param ctx the parse tree
	 */
	void exitGrouping_sets_clause(PostgreSQLPlpgsqlInnerParser.Grouping_sets_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#having_clause}.
	 * @param ctx the parse tree
	 */
	void enterHaving_clause(PostgreSQLPlpgsqlInnerParser.Having_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#having_clause}.
	 * @param ctx the parse tree
	 */
	void exitHaving_clause(PostgreSQLPlpgsqlInnerParser.Having_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#for_locking_clause}.
	 * @param ctx the parse tree
	 */
	void enterFor_locking_clause(PostgreSQLPlpgsqlInnerParser.For_locking_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#for_locking_clause}.
	 * @param ctx the parse tree
	 */
	void exitFor_locking_clause(PostgreSQLPlpgsqlInnerParser.For_locking_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_for_locking_clause}.
	 * @param ctx the parse tree
	 */
	void enterOpt_for_locking_clause(PostgreSQLPlpgsqlInnerParser.Opt_for_locking_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_for_locking_clause}.
	 * @param ctx the parse tree
	 */
	void exitOpt_for_locking_clause(PostgreSQLPlpgsqlInnerParser.Opt_for_locking_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#for_locking_items}.
	 * @param ctx the parse tree
	 */
	void enterFor_locking_items(PostgreSQLPlpgsqlInnerParser.For_locking_itemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#for_locking_items}.
	 * @param ctx the parse tree
	 */
	void exitFor_locking_items(PostgreSQLPlpgsqlInnerParser.For_locking_itemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#for_locking_item}.
	 * @param ctx the parse tree
	 */
	void enterFor_locking_item(PostgreSQLPlpgsqlInnerParser.For_locking_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#for_locking_item}.
	 * @param ctx the parse tree
	 */
	void exitFor_locking_item(PostgreSQLPlpgsqlInnerParser.For_locking_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#for_locking_strength}.
	 * @param ctx the parse tree
	 */
	void enterFor_locking_strength(PostgreSQLPlpgsqlInnerParser.For_locking_strengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#for_locking_strength}.
	 * @param ctx the parse tree
	 */
	void exitFor_locking_strength(PostgreSQLPlpgsqlInnerParser.For_locking_strengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#locked_rels_list}.
	 * @param ctx the parse tree
	 */
	void enterLocked_rels_list(PostgreSQLPlpgsqlInnerParser.Locked_rels_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#locked_rels_list}.
	 * @param ctx the parse tree
	 */
	void exitLocked_rels_list(PostgreSQLPlpgsqlInnerParser.Locked_rels_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#values_clause}.
	 * @param ctx the parse tree
	 */
	void enterValues_clause(PostgreSQLPlpgsqlInnerParser.Values_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#values_clause}.
	 * @param ctx the parse tree
	 */
	void exitValues_clause(PostgreSQLPlpgsqlInnerParser.Values_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#from_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_clause(PostgreSQLPlpgsqlInnerParser.From_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#from_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_clause(PostgreSQLPlpgsqlInnerParser.From_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#from_list}.
	 * @param ctx the parse tree
	 */
	void enterFrom_list(PostgreSQLPlpgsqlInnerParser.From_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#from_list}.
	 * @param ctx the parse tree
	 */
	void exitFrom_list(PostgreSQLPlpgsqlInnerParser.From_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#table_ref}.
	 * @param ctx the parse tree
	 */
	void enterTable_ref(PostgreSQLPlpgsqlInnerParser.Table_refContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#table_ref}.
	 * @param ctx the parse tree
	 */
	void exitTable_ref(PostgreSQLPlpgsqlInnerParser.Table_refContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alias_clause}.
	 * @param ctx the parse tree
	 */
	void enterAlias_clause(PostgreSQLPlpgsqlInnerParser.Alias_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alias_clause}.
	 * @param ctx the parse tree
	 */
	void exitAlias_clause(PostgreSQLPlpgsqlInnerParser.Alias_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_alias_clause}.
	 * @param ctx the parse tree
	 */
	void enterOpt_alias_clause(PostgreSQLPlpgsqlInnerParser.Opt_alias_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_alias_clause}.
	 * @param ctx the parse tree
	 */
	void exitOpt_alias_clause(PostgreSQLPlpgsqlInnerParser.Opt_alias_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#func_alias_clause}.
	 * @param ctx the parse tree
	 */
	void enterFunc_alias_clause(PostgreSQLPlpgsqlInnerParser.Func_alias_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#func_alias_clause}.
	 * @param ctx the parse tree
	 */
	void exitFunc_alias_clause(PostgreSQLPlpgsqlInnerParser.Func_alias_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#join_type}.
	 * @param ctx the parse tree
	 */
	void enterJoin_type(PostgreSQLPlpgsqlInnerParser.Join_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#join_type}.
	 * @param ctx the parse tree
	 */
	void exitJoin_type(PostgreSQLPlpgsqlInnerParser.Join_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#join_qual}.
	 * @param ctx the parse tree
	 */
	void enterJoin_qual(PostgreSQLPlpgsqlInnerParser.Join_qualContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#join_qual}.
	 * @param ctx the parse tree
	 */
	void exitJoin_qual(PostgreSQLPlpgsqlInnerParser.Join_qualContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#relation_expr}.
	 * @param ctx the parse tree
	 */
	void enterRelation_expr(PostgreSQLPlpgsqlInnerParser.Relation_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#relation_expr}.
	 * @param ctx the parse tree
	 */
	void exitRelation_expr(PostgreSQLPlpgsqlInnerParser.Relation_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#relation_expr_list}.
	 * @param ctx the parse tree
	 */
	void enterRelation_expr_list(PostgreSQLPlpgsqlInnerParser.Relation_expr_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#relation_expr_list}.
	 * @param ctx the parse tree
	 */
	void exitRelation_expr_list(PostgreSQLPlpgsqlInnerParser.Relation_expr_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#relation_expr_opt_alias}.
	 * @param ctx the parse tree
	 */
	void enterRelation_expr_opt_alias(PostgreSQLPlpgsqlInnerParser.Relation_expr_opt_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#relation_expr_opt_alias}.
	 * @param ctx the parse tree
	 */
	void exitRelation_expr_opt_alias(PostgreSQLPlpgsqlInnerParser.Relation_expr_opt_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#tablesample_clause}.
	 * @param ctx the parse tree
	 */
	void enterTablesample_clause(PostgreSQLPlpgsqlInnerParser.Tablesample_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#tablesample_clause}.
	 * @param ctx the parse tree
	 */
	void exitTablesample_clause(PostgreSQLPlpgsqlInnerParser.Tablesample_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_repeatable_clause}.
	 * @param ctx the parse tree
	 */
	void enterOpt_repeatable_clause(PostgreSQLPlpgsqlInnerParser.Opt_repeatable_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_repeatable_clause}.
	 * @param ctx the parse tree
	 */
	void exitOpt_repeatable_clause(PostgreSQLPlpgsqlInnerParser.Opt_repeatable_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#func_table}.
	 * @param ctx the parse tree
	 */
	void enterFunc_table(PostgreSQLPlpgsqlInnerParser.Func_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#func_table}.
	 * @param ctx the parse tree
	 */
	void exitFunc_table(PostgreSQLPlpgsqlInnerParser.Func_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#rowsfrom_item}.
	 * @param ctx the parse tree
	 */
	void enterRowsfrom_item(PostgreSQLPlpgsqlInnerParser.Rowsfrom_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#rowsfrom_item}.
	 * @param ctx the parse tree
	 */
	void exitRowsfrom_item(PostgreSQLPlpgsqlInnerParser.Rowsfrom_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#rowsfrom_list}.
	 * @param ctx the parse tree
	 */
	void enterRowsfrom_list(PostgreSQLPlpgsqlInnerParser.Rowsfrom_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#rowsfrom_list}.
	 * @param ctx the parse tree
	 */
	void exitRowsfrom_list(PostgreSQLPlpgsqlInnerParser.Rowsfrom_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_col_def_list}.
	 * @param ctx the parse tree
	 */
	void enterOpt_col_def_list(PostgreSQLPlpgsqlInnerParser.Opt_col_def_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_col_def_list}.
	 * @param ctx the parse tree
	 */
	void exitOpt_col_def_list(PostgreSQLPlpgsqlInnerParser.Opt_col_def_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_ordinality}.
	 * @param ctx the parse tree
	 */
	void enterOpt_ordinality(PostgreSQLPlpgsqlInnerParser.Opt_ordinalityContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_ordinality}.
	 * @param ctx the parse tree
	 */
	void exitOpt_ordinality(PostgreSQLPlpgsqlInnerParser.Opt_ordinalityContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void enterWhere_clause(PostgreSQLPlpgsqlInnerParser.Where_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void exitWhere_clause(PostgreSQLPlpgsqlInnerParser.Where_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#where_or_current_clause}.
	 * @param ctx the parse tree
	 */
	void enterWhere_or_current_clause(PostgreSQLPlpgsqlInnerParser.Where_or_current_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#where_or_current_clause}.
	 * @param ctx the parse tree
	 */
	void exitWhere_or_current_clause(PostgreSQLPlpgsqlInnerParser.Where_or_current_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opttablefuncelementlist}.
	 * @param ctx the parse tree
	 */
	void enterOpttablefuncelementlist(PostgreSQLPlpgsqlInnerParser.OpttablefuncelementlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opttablefuncelementlist}.
	 * @param ctx the parse tree
	 */
	void exitOpttablefuncelementlist(PostgreSQLPlpgsqlInnerParser.OpttablefuncelementlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#tablefuncelementlist}.
	 * @param ctx the parse tree
	 */
	void enterTablefuncelementlist(PostgreSQLPlpgsqlInnerParser.TablefuncelementlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#tablefuncelementlist}.
	 * @param ctx the parse tree
	 */
	void exitTablefuncelementlist(PostgreSQLPlpgsqlInnerParser.TablefuncelementlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#tablefuncelement}.
	 * @param ctx the parse tree
	 */
	void enterTablefuncelement(PostgreSQLPlpgsqlInnerParser.TablefuncelementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#tablefuncelement}.
	 * @param ctx the parse tree
	 */
	void exitTablefuncelement(PostgreSQLPlpgsqlInnerParser.TablefuncelementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#xmltable}.
	 * @param ctx the parse tree
	 */
	void enterXmltable(PostgreSQLPlpgsqlInnerParser.XmltableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#xmltable}.
	 * @param ctx the parse tree
	 */
	void exitXmltable(PostgreSQLPlpgsqlInnerParser.XmltableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#xmltable_column_list}.
	 * @param ctx the parse tree
	 */
	void enterXmltable_column_list(PostgreSQLPlpgsqlInnerParser.Xmltable_column_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#xmltable_column_list}.
	 * @param ctx the parse tree
	 */
	void exitXmltable_column_list(PostgreSQLPlpgsqlInnerParser.Xmltable_column_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#xmltable_column_el}.
	 * @param ctx the parse tree
	 */
	void enterXmltable_column_el(PostgreSQLPlpgsqlInnerParser.Xmltable_column_elContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#xmltable_column_el}.
	 * @param ctx the parse tree
	 */
	void exitXmltable_column_el(PostgreSQLPlpgsqlInnerParser.Xmltable_column_elContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#xmltable_column_option_list}.
	 * @param ctx the parse tree
	 */
	void enterXmltable_column_option_list(PostgreSQLPlpgsqlInnerParser.Xmltable_column_option_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#xmltable_column_option_list}.
	 * @param ctx the parse tree
	 */
	void exitXmltable_column_option_list(PostgreSQLPlpgsqlInnerParser.Xmltable_column_option_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#xmltable_column_option_el}.
	 * @param ctx the parse tree
	 */
	void enterXmltable_column_option_el(PostgreSQLPlpgsqlInnerParser.Xmltable_column_option_elContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#xmltable_column_option_el}.
	 * @param ctx the parse tree
	 */
	void exitXmltable_column_option_el(PostgreSQLPlpgsqlInnerParser.Xmltable_column_option_elContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#xml_namespace_list}.
	 * @param ctx the parse tree
	 */
	void enterXml_namespace_list(PostgreSQLPlpgsqlInnerParser.Xml_namespace_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#xml_namespace_list}.
	 * @param ctx the parse tree
	 */
	void exitXml_namespace_list(PostgreSQLPlpgsqlInnerParser.Xml_namespace_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#xml_namespace_el}.
	 * @param ctx the parse tree
	 */
	void enterXml_namespace_el(PostgreSQLPlpgsqlInnerParser.Xml_namespace_elContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#xml_namespace_el}.
	 * @param ctx the parse tree
	 */
	void exitXml_namespace_el(PostgreSQLPlpgsqlInnerParser.Xml_namespace_elContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#typename}.
	 * @param ctx the parse tree
	 */
	void enterTypename(PostgreSQLPlpgsqlInnerParser.TypenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#typename}.
	 * @param ctx the parse tree
	 */
	void exitTypename(PostgreSQLPlpgsqlInnerParser.TypenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_array_bounds}.
	 * @param ctx the parse tree
	 */
	void enterOpt_array_bounds(PostgreSQLPlpgsqlInnerParser.Opt_array_boundsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_array_bounds}.
	 * @param ctx the parse tree
	 */
	void exitOpt_array_bounds(PostgreSQLPlpgsqlInnerParser.Opt_array_boundsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#simpletypename}.
	 * @param ctx the parse tree
	 */
	void enterSimpletypename(PostgreSQLPlpgsqlInnerParser.SimpletypenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#simpletypename}.
	 * @param ctx the parse tree
	 */
	void exitSimpletypename(PostgreSQLPlpgsqlInnerParser.SimpletypenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#consttypename}.
	 * @param ctx the parse tree
	 */
	void enterConsttypename(PostgreSQLPlpgsqlInnerParser.ConsttypenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#consttypename}.
	 * @param ctx the parse tree
	 */
	void exitConsttypename(PostgreSQLPlpgsqlInnerParser.ConsttypenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#generictype}.
	 * @param ctx the parse tree
	 */
	void enterGenerictype(PostgreSQLPlpgsqlInnerParser.GenerictypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#generictype}.
	 * @param ctx the parse tree
	 */
	void exitGenerictype(PostgreSQLPlpgsqlInnerParser.GenerictypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_type_modifiers}.
	 * @param ctx the parse tree
	 */
	void enterOpt_type_modifiers(PostgreSQLPlpgsqlInnerParser.Opt_type_modifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_type_modifiers}.
	 * @param ctx the parse tree
	 */
	void exitOpt_type_modifiers(PostgreSQLPlpgsqlInnerParser.Opt_type_modifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#numeric}.
	 * @param ctx the parse tree
	 */
	void enterNumeric(PostgreSQLPlpgsqlInnerParser.NumericContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#numeric}.
	 * @param ctx the parse tree
	 */
	void exitNumeric(PostgreSQLPlpgsqlInnerParser.NumericContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_float}.
	 * @param ctx the parse tree
	 */
	void enterOpt_float(PostgreSQLPlpgsqlInnerParser.Opt_floatContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_float}.
	 * @param ctx the parse tree
	 */
	void exitOpt_float(PostgreSQLPlpgsqlInnerParser.Opt_floatContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#bit}.
	 * @param ctx the parse tree
	 */
	void enterBit(PostgreSQLPlpgsqlInnerParser.BitContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#bit}.
	 * @param ctx the parse tree
	 */
	void exitBit(PostgreSQLPlpgsqlInnerParser.BitContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#constbit}.
	 * @param ctx the parse tree
	 */
	void enterConstbit(PostgreSQLPlpgsqlInnerParser.ConstbitContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#constbit}.
	 * @param ctx the parse tree
	 */
	void exitConstbit(PostgreSQLPlpgsqlInnerParser.ConstbitContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#bitwithlength}.
	 * @param ctx the parse tree
	 */
	void enterBitwithlength(PostgreSQLPlpgsqlInnerParser.BitwithlengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#bitwithlength}.
	 * @param ctx the parse tree
	 */
	void exitBitwithlength(PostgreSQLPlpgsqlInnerParser.BitwithlengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#bitwithoutlength}.
	 * @param ctx the parse tree
	 */
	void enterBitwithoutlength(PostgreSQLPlpgsqlInnerParser.BitwithoutlengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#bitwithoutlength}.
	 * @param ctx the parse tree
	 */
	void exitBitwithoutlength(PostgreSQLPlpgsqlInnerParser.BitwithoutlengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#character}.
	 * @param ctx the parse tree
	 */
	void enterCharacter(PostgreSQLPlpgsqlInnerParser.CharacterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#character}.
	 * @param ctx the parse tree
	 */
	void exitCharacter(PostgreSQLPlpgsqlInnerParser.CharacterContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#constcharacter}.
	 * @param ctx the parse tree
	 */
	void enterConstcharacter(PostgreSQLPlpgsqlInnerParser.ConstcharacterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#constcharacter}.
	 * @param ctx the parse tree
	 */
	void exitConstcharacter(PostgreSQLPlpgsqlInnerParser.ConstcharacterContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#character_c}.
	 * @param ctx the parse tree
	 */
	void enterCharacter_c(PostgreSQLPlpgsqlInnerParser.Character_cContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#character_c}.
	 * @param ctx the parse tree
	 */
	void exitCharacter_c(PostgreSQLPlpgsqlInnerParser.Character_cContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_varying}.
	 * @param ctx the parse tree
	 */
	void enterOpt_varying(PostgreSQLPlpgsqlInnerParser.Opt_varyingContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_varying}.
	 * @param ctx the parse tree
	 */
	void exitOpt_varying(PostgreSQLPlpgsqlInnerParser.Opt_varyingContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#constdatetime}.
	 * @param ctx the parse tree
	 */
	void enterConstdatetime(PostgreSQLPlpgsqlInnerParser.ConstdatetimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#constdatetime}.
	 * @param ctx the parse tree
	 */
	void exitConstdatetime(PostgreSQLPlpgsqlInnerParser.ConstdatetimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#constinterval}.
	 * @param ctx the parse tree
	 */
	void enterConstinterval(PostgreSQLPlpgsqlInnerParser.ConstintervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#constinterval}.
	 * @param ctx the parse tree
	 */
	void exitConstinterval(PostgreSQLPlpgsqlInnerParser.ConstintervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_timezone}.
	 * @param ctx the parse tree
	 */
	void enterOpt_timezone(PostgreSQLPlpgsqlInnerParser.Opt_timezoneContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_timezone}.
	 * @param ctx the parse tree
	 */
	void exitOpt_timezone(PostgreSQLPlpgsqlInnerParser.Opt_timezoneContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_interval}.
	 * @param ctx the parse tree
	 */
	void enterOpt_interval(PostgreSQLPlpgsqlInnerParser.Opt_intervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_interval}.
	 * @param ctx the parse tree
	 */
	void exitOpt_interval(PostgreSQLPlpgsqlInnerParser.Opt_intervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#interval_second}.
	 * @param ctx the parse tree
	 */
	void enterInterval_second(PostgreSQLPlpgsqlInnerParser.Interval_secondContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#interval_second}.
	 * @param ctx the parse tree
	 */
	void exitInterval_second(PostgreSQLPlpgsqlInnerParser.Interval_secondContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_escape}.
	 * @param ctx the parse tree
	 */
	void enterOpt_escape(PostgreSQLPlpgsqlInnerParser.Opt_escapeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_escape}.
	 * @param ctx the parse tree
	 */
	void exitOpt_escape(PostgreSQLPlpgsqlInnerParser.Opt_escapeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#a_expr}.
	 * @param ctx the parse tree
	 */
	void enterA_expr(PostgreSQLPlpgsqlInnerParser.A_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#a_expr}.
	 * @param ctx the parse tree
	 */
	void exitA_expr(PostgreSQLPlpgsqlInnerParser.A_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#a_expr_qual}.
	 * @param ctx the parse tree
	 */
	void enterA_expr_qual(PostgreSQLPlpgsqlInnerParser.A_expr_qualContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#a_expr_qual}.
	 * @param ctx the parse tree
	 */
	void exitA_expr_qual(PostgreSQLPlpgsqlInnerParser.A_expr_qualContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#a_expr_lessless}.
	 * @param ctx the parse tree
	 */
	void enterA_expr_lessless(PostgreSQLPlpgsqlInnerParser.A_expr_lesslessContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#a_expr_lessless}.
	 * @param ctx the parse tree
	 */
	void exitA_expr_lessless(PostgreSQLPlpgsqlInnerParser.A_expr_lesslessContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#a_expr_or}.
	 * @param ctx the parse tree
	 */
	void enterA_expr_or(PostgreSQLPlpgsqlInnerParser.A_expr_orContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#a_expr_or}.
	 * @param ctx the parse tree
	 */
	void exitA_expr_or(PostgreSQLPlpgsqlInnerParser.A_expr_orContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#a_expr_and}.
	 * @param ctx the parse tree
	 */
	void enterA_expr_and(PostgreSQLPlpgsqlInnerParser.A_expr_andContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#a_expr_and}.
	 * @param ctx the parse tree
	 */
	void exitA_expr_and(PostgreSQLPlpgsqlInnerParser.A_expr_andContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#a_expr_in}.
	 * @param ctx the parse tree
	 */
	void enterA_expr_in(PostgreSQLPlpgsqlInnerParser.A_expr_inContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#a_expr_in}.
	 * @param ctx the parse tree
	 */
	void exitA_expr_in(PostgreSQLPlpgsqlInnerParser.A_expr_inContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#a_expr_unary_not}.
	 * @param ctx the parse tree
	 */
	void enterA_expr_unary_not(PostgreSQLPlpgsqlInnerParser.A_expr_unary_notContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#a_expr_unary_not}.
	 * @param ctx the parse tree
	 */
	void exitA_expr_unary_not(PostgreSQLPlpgsqlInnerParser.A_expr_unary_notContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#a_expr_isnull}.
	 * @param ctx the parse tree
	 */
	void enterA_expr_isnull(PostgreSQLPlpgsqlInnerParser.A_expr_isnullContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#a_expr_isnull}.
	 * @param ctx the parse tree
	 */
	void exitA_expr_isnull(PostgreSQLPlpgsqlInnerParser.A_expr_isnullContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#a_expr_is_not}.
	 * @param ctx the parse tree
	 */
	void enterA_expr_is_not(PostgreSQLPlpgsqlInnerParser.A_expr_is_notContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#a_expr_is_not}.
	 * @param ctx the parse tree
	 */
	void exitA_expr_is_not(PostgreSQLPlpgsqlInnerParser.A_expr_is_notContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#a_expr_compare}.
	 * @param ctx the parse tree
	 */
	void enterA_expr_compare(PostgreSQLPlpgsqlInnerParser.A_expr_compareContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#a_expr_compare}.
	 * @param ctx the parse tree
	 */
	void exitA_expr_compare(PostgreSQLPlpgsqlInnerParser.A_expr_compareContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#a_expr_like}.
	 * @param ctx the parse tree
	 */
	void enterA_expr_like(PostgreSQLPlpgsqlInnerParser.A_expr_likeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#a_expr_like}.
	 * @param ctx the parse tree
	 */
	void exitA_expr_like(PostgreSQLPlpgsqlInnerParser.A_expr_likeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#a_expr_qual_op}.
	 * @param ctx the parse tree
	 */
	void enterA_expr_qual_op(PostgreSQLPlpgsqlInnerParser.A_expr_qual_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#a_expr_qual_op}.
	 * @param ctx the parse tree
	 */
	void exitA_expr_qual_op(PostgreSQLPlpgsqlInnerParser.A_expr_qual_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#a_expr_unary_qualop}.
	 * @param ctx the parse tree
	 */
	void enterA_expr_unary_qualop(PostgreSQLPlpgsqlInnerParser.A_expr_unary_qualopContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#a_expr_unary_qualop}.
	 * @param ctx the parse tree
	 */
	void exitA_expr_unary_qualop(PostgreSQLPlpgsqlInnerParser.A_expr_unary_qualopContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#a_expr_add}.
	 * @param ctx the parse tree
	 */
	void enterA_expr_add(PostgreSQLPlpgsqlInnerParser.A_expr_addContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#a_expr_add}.
	 * @param ctx the parse tree
	 */
	void exitA_expr_add(PostgreSQLPlpgsqlInnerParser.A_expr_addContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#a_expr_mul}.
	 * @param ctx the parse tree
	 */
	void enterA_expr_mul(PostgreSQLPlpgsqlInnerParser.A_expr_mulContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#a_expr_mul}.
	 * @param ctx the parse tree
	 */
	void exitA_expr_mul(PostgreSQLPlpgsqlInnerParser.A_expr_mulContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#a_expr_caret}.
	 * @param ctx the parse tree
	 */
	void enterA_expr_caret(PostgreSQLPlpgsqlInnerParser.A_expr_caretContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#a_expr_caret}.
	 * @param ctx the parse tree
	 */
	void exitA_expr_caret(PostgreSQLPlpgsqlInnerParser.A_expr_caretContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#a_expr_unary_sign}.
	 * @param ctx the parse tree
	 */
	void enterA_expr_unary_sign(PostgreSQLPlpgsqlInnerParser.A_expr_unary_signContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#a_expr_unary_sign}.
	 * @param ctx the parse tree
	 */
	void exitA_expr_unary_sign(PostgreSQLPlpgsqlInnerParser.A_expr_unary_signContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#a_expr_at_time_zone}.
	 * @param ctx the parse tree
	 */
	void enterA_expr_at_time_zone(PostgreSQLPlpgsqlInnerParser.A_expr_at_time_zoneContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#a_expr_at_time_zone}.
	 * @param ctx the parse tree
	 */
	void exitA_expr_at_time_zone(PostgreSQLPlpgsqlInnerParser.A_expr_at_time_zoneContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#a_expr_collate}.
	 * @param ctx the parse tree
	 */
	void enterA_expr_collate(PostgreSQLPlpgsqlInnerParser.A_expr_collateContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#a_expr_collate}.
	 * @param ctx the parse tree
	 */
	void exitA_expr_collate(PostgreSQLPlpgsqlInnerParser.A_expr_collateContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#a_expr_typecast}.
	 * @param ctx the parse tree
	 */
	void enterA_expr_typecast(PostgreSQLPlpgsqlInnerParser.A_expr_typecastContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#a_expr_typecast}.
	 * @param ctx the parse tree
	 */
	void exitA_expr_typecast(PostgreSQLPlpgsqlInnerParser.A_expr_typecastContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#b_expr}.
	 * @param ctx the parse tree
	 */
	void enterB_expr(PostgreSQLPlpgsqlInnerParser.B_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#b_expr}.
	 * @param ctx the parse tree
	 */
	void exitB_expr(PostgreSQLPlpgsqlInnerParser.B_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code c_expr_exists}
	 * labeled alternative in {@link PostgreSQLPlpgsqlInnerParser#c_expr}.
	 * @param ctx the parse tree
	 */
	void enterC_expr_exists(PostgreSQLPlpgsqlInnerParser.C_expr_existsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code c_expr_exists}
	 * labeled alternative in {@link PostgreSQLPlpgsqlInnerParser#c_expr}.
	 * @param ctx the parse tree
	 */
	void exitC_expr_exists(PostgreSQLPlpgsqlInnerParser.C_expr_existsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code c_expr_expr}
	 * labeled alternative in {@link PostgreSQLPlpgsqlInnerParser#c_expr}.
	 * @param ctx the parse tree
	 */
	void enterC_expr_expr(PostgreSQLPlpgsqlInnerParser.C_expr_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code c_expr_expr}
	 * labeled alternative in {@link PostgreSQLPlpgsqlInnerParser#c_expr}.
	 * @param ctx the parse tree
	 */
	void exitC_expr_expr(PostgreSQLPlpgsqlInnerParser.C_expr_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code c_expr_case}
	 * labeled alternative in {@link PostgreSQLPlpgsqlInnerParser#c_expr}.
	 * @param ctx the parse tree
	 */
	void enterC_expr_case(PostgreSQLPlpgsqlInnerParser.C_expr_caseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code c_expr_case}
	 * labeled alternative in {@link PostgreSQLPlpgsqlInnerParser#c_expr}.
	 * @param ctx the parse tree
	 */
	void exitC_expr_case(PostgreSQLPlpgsqlInnerParser.C_expr_caseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#plsqlvariablename}.
	 * @param ctx the parse tree
	 */
	void enterPlsqlvariablename(PostgreSQLPlpgsqlInnerParser.PlsqlvariablenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#plsqlvariablename}.
	 * @param ctx the parse tree
	 */
	void exitPlsqlvariablename(PostgreSQLPlpgsqlInnerParser.PlsqlvariablenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#func_application}.
	 * @param ctx the parse tree
	 */
	void enterFunc_application(PostgreSQLPlpgsqlInnerParser.Func_applicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#func_application}.
	 * @param ctx the parse tree
	 */
	void exitFunc_application(PostgreSQLPlpgsqlInnerParser.Func_applicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#func_expr}.
	 * @param ctx the parse tree
	 */
	void enterFunc_expr(PostgreSQLPlpgsqlInnerParser.Func_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#func_expr}.
	 * @param ctx the parse tree
	 */
	void exitFunc_expr(PostgreSQLPlpgsqlInnerParser.Func_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#func_expr_windowless}.
	 * @param ctx the parse tree
	 */
	void enterFunc_expr_windowless(PostgreSQLPlpgsqlInnerParser.Func_expr_windowlessContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#func_expr_windowless}.
	 * @param ctx the parse tree
	 */
	void exitFunc_expr_windowless(PostgreSQLPlpgsqlInnerParser.Func_expr_windowlessContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#func_expr_common_subexpr}.
	 * @param ctx the parse tree
	 */
	void enterFunc_expr_common_subexpr(PostgreSQLPlpgsqlInnerParser.Func_expr_common_subexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#func_expr_common_subexpr}.
	 * @param ctx the parse tree
	 */
	void exitFunc_expr_common_subexpr(PostgreSQLPlpgsqlInnerParser.Func_expr_common_subexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#xml_root_version}.
	 * @param ctx the parse tree
	 */
	void enterXml_root_version(PostgreSQLPlpgsqlInnerParser.Xml_root_versionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#xml_root_version}.
	 * @param ctx the parse tree
	 */
	void exitXml_root_version(PostgreSQLPlpgsqlInnerParser.Xml_root_versionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_xml_root_standalone}.
	 * @param ctx the parse tree
	 */
	void enterOpt_xml_root_standalone(PostgreSQLPlpgsqlInnerParser.Opt_xml_root_standaloneContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_xml_root_standalone}.
	 * @param ctx the parse tree
	 */
	void exitOpt_xml_root_standalone(PostgreSQLPlpgsqlInnerParser.Opt_xml_root_standaloneContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#xml_attributes}.
	 * @param ctx the parse tree
	 */
	void enterXml_attributes(PostgreSQLPlpgsqlInnerParser.Xml_attributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#xml_attributes}.
	 * @param ctx the parse tree
	 */
	void exitXml_attributes(PostgreSQLPlpgsqlInnerParser.Xml_attributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#xml_attribute_list}.
	 * @param ctx the parse tree
	 */
	void enterXml_attribute_list(PostgreSQLPlpgsqlInnerParser.Xml_attribute_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#xml_attribute_list}.
	 * @param ctx the parse tree
	 */
	void exitXml_attribute_list(PostgreSQLPlpgsqlInnerParser.Xml_attribute_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#xml_attribute_el}.
	 * @param ctx the parse tree
	 */
	void enterXml_attribute_el(PostgreSQLPlpgsqlInnerParser.Xml_attribute_elContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#xml_attribute_el}.
	 * @param ctx the parse tree
	 */
	void exitXml_attribute_el(PostgreSQLPlpgsqlInnerParser.Xml_attribute_elContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#document_or_content}.
	 * @param ctx the parse tree
	 */
	void enterDocument_or_content(PostgreSQLPlpgsqlInnerParser.Document_or_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#document_or_content}.
	 * @param ctx the parse tree
	 */
	void exitDocument_or_content(PostgreSQLPlpgsqlInnerParser.Document_or_contentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#xml_whitespace_option}.
	 * @param ctx the parse tree
	 */
	void enterXml_whitespace_option(PostgreSQLPlpgsqlInnerParser.Xml_whitespace_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#xml_whitespace_option}.
	 * @param ctx the parse tree
	 */
	void exitXml_whitespace_option(PostgreSQLPlpgsqlInnerParser.Xml_whitespace_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#xmlexists_argument}.
	 * @param ctx the parse tree
	 */
	void enterXmlexists_argument(PostgreSQLPlpgsqlInnerParser.Xmlexists_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#xmlexists_argument}.
	 * @param ctx the parse tree
	 */
	void exitXmlexists_argument(PostgreSQLPlpgsqlInnerParser.Xmlexists_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#xml_passing_mech}.
	 * @param ctx the parse tree
	 */
	void enterXml_passing_mech(PostgreSQLPlpgsqlInnerParser.Xml_passing_mechContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#xml_passing_mech}.
	 * @param ctx the parse tree
	 */
	void exitXml_passing_mech(PostgreSQLPlpgsqlInnerParser.Xml_passing_mechContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#within_group_clause}.
	 * @param ctx the parse tree
	 */
	void enterWithin_group_clause(PostgreSQLPlpgsqlInnerParser.Within_group_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#within_group_clause}.
	 * @param ctx the parse tree
	 */
	void exitWithin_group_clause(PostgreSQLPlpgsqlInnerParser.Within_group_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#filter_clause}.
	 * @param ctx the parse tree
	 */
	void enterFilter_clause(PostgreSQLPlpgsqlInnerParser.Filter_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#filter_clause}.
	 * @param ctx the parse tree
	 */
	void exitFilter_clause(PostgreSQLPlpgsqlInnerParser.Filter_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#window_clause}.
	 * @param ctx the parse tree
	 */
	void enterWindow_clause(PostgreSQLPlpgsqlInnerParser.Window_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#window_clause}.
	 * @param ctx the parse tree
	 */
	void exitWindow_clause(PostgreSQLPlpgsqlInnerParser.Window_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#window_definition_list}.
	 * @param ctx the parse tree
	 */
	void enterWindow_definition_list(PostgreSQLPlpgsqlInnerParser.Window_definition_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#window_definition_list}.
	 * @param ctx the parse tree
	 */
	void exitWindow_definition_list(PostgreSQLPlpgsqlInnerParser.Window_definition_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#window_definition}.
	 * @param ctx the parse tree
	 */
	void enterWindow_definition(PostgreSQLPlpgsqlInnerParser.Window_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#window_definition}.
	 * @param ctx the parse tree
	 */
	void exitWindow_definition(PostgreSQLPlpgsqlInnerParser.Window_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#over_clause}.
	 * @param ctx the parse tree
	 */
	void enterOver_clause(PostgreSQLPlpgsqlInnerParser.Over_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#over_clause}.
	 * @param ctx the parse tree
	 */
	void exitOver_clause(PostgreSQLPlpgsqlInnerParser.Over_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#window_specification}.
	 * @param ctx the parse tree
	 */
	void enterWindow_specification(PostgreSQLPlpgsqlInnerParser.Window_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#window_specification}.
	 * @param ctx the parse tree
	 */
	void exitWindow_specification(PostgreSQLPlpgsqlInnerParser.Window_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_existing_window_name}.
	 * @param ctx the parse tree
	 */
	void enterOpt_existing_window_name(PostgreSQLPlpgsqlInnerParser.Opt_existing_window_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_existing_window_name}.
	 * @param ctx the parse tree
	 */
	void exitOpt_existing_window_name(PostgreSQLPlpgsqlInnerParser.Opt_existing_window_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_partition_clause}.
	 * @param ctx the parse tree
	 */
	void enterOpt_partition_clause(PostgreSQLPlpgsqlInnerParser.Opt_partition_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_partition_clause}.
	 * @param ctx the parse tree
	 */
	void exitOpt_partition_clause(PostgreSQLPlpgsqlInnerParser.Opt_partition_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_frame_clause}.
	 * @param ctx the parse tree
	 */
	void enterOpt_frame_clause(PostgreSQLPlpgsqlInnerParser.Opt_frame_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_frame_clause}.
	 * @param ctx the parse tree
	 */
	void exitOpt_frame_clause(PostgreSQLPlpgsqlInnerParser.Opt_frame_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#frame_extent}.
	 * @param ctx the parse tree
	 */
	void enterFrame_extent(PostgreSQLPlpgsqlInnerParser.Frame_extentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#frame_extent}.
	 * @param ctx the parse tree
	 */
	void exitFrame_extent(PostgreSQLPlpgsqlInnerParser.Frame_extentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#frame_bound}.
	 * @param ctx the parse tree
	 */
	void enterFrame_bound(PostgreSQLPlpgsqlInnerParser.Frame_boundContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#frame_bound}.
	 * @param ctx the parse tree
	 */
	void exitFrame_bound(PostgreSQLPlpgsqlInnerParser.Frame_boundContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_window_exclusion_clause}.
	 * @param ctx the parse tree
	 */
	void enterOpt_window_exclusion_clause(PostgreSQLPlpgsqlInnerParser.Opt_window_exclusion_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_window_exclusion_clause}.
	 * @param ctx the parse tree
	 */
	void exitOpt_window_exclusion_clause(PostgreSQLPlpgsqlInnerParser.Opt_window_exclusion_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#row}.
	 * @param ctx the parse tree
	 */
	void enterRow(PostgreSQLPlpgsqlInnerParser.RowContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#row}.
	 * @param ctx the parse tree
	 */
	void exitRow(PostgreSQLPlpgsqlInnerParser.RowContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#explicit_row}.
	 * @param ctx the parse tree
	 */
	void enterExplicit_row(PostgreSQLPlpgsqlInnerParser.Explicit_rowContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#explicit_row}.
	 * @param ctx the parse tree
	 */
	void exitExplicit_row(PostgreSQLPlpgsqlInnerParser.Explicit_rowContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#implicit_row}.
	 * @param ctx the parse tree
	 */
	void enterImplicit_row(PostgreSQLPlpgsqlInnerParser.Implicit_rowContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#implicit_row}.
	 * @param ctx the parse tree
	 */
	void exitImplicit_row(PostgreSQLPlpgsqlInnerParser.Implicit_rowContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#sub_type}.
	 * @param ctx the parse tree
	 */
	void enterSub_type(PostgreSQLPlpgsqlInnerParser.Sub_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#sub_type}.
	 * @param ctx the parse tree
	 */
	void exitSub_type(PostgreSQLPlpgsqlInnerParser.Sub_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#all_op}.
	 * @param ctx the parse tree
	 */
	void enterAll_op(PostgreSQLPlpgsqlInnerParser.All_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#all_op}.
	 * @param ctx the parse tree
	 */
	void exitAll_op(PostgreSQLPlpgsqlInnerParser.All_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#mathop}.
	 * @param ctx the parse tree
	 */
	void enterMathop(PostgreSQLPlpgsqlInnerParser.MathopContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#mathop}.
	 * @param ctx the parse tree
	 */
	void exitMathop(PostgreSQLPlpgsqlInnerParser.MathopContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#qual_op}.
	 * @param ctx the parse tree
	 */
	void enterQual_op(PostgreSQLPlpgsqlInnerParser.Qual_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#qual_op}.
	 * @param ctx the parse tree
	 */
	void exitQual_op(PostgreSQLPlpgsqlInnerParser.Qual_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#qual_all_op}.
	 * @param ctx the parse tree
	 */
	void enterQual_all_op(PostgreSQLPlpgsqlInnerParser.Qual_all_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#qual_all_op}.
	 * @param ctx the parse tree
	 */
	void exitQual_all_op(PostgreSQLPlpgsqlInnerParser.Qual_all_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#subquery_Op}.
	 * @param ctx the parse tree
	 */
	void enterSubquery_Op(PostgreSQLPlpgsqlInnerParser.Subquery_OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#subquery_Op}.
	 * @param ctx the parse tree
	 */
	void exitSubquery_Op(PostgreSQLPlpgsqlInnerParser.Subquery_OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#expr_list}.
	 * @param ctx the parse tree
	 */
	void enterExpr_list(PostgreSQLPlpgsqlInnerParser.Expr_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#expr_list}.
	 * @param ctx the parse tree
	 */
	void exitExpr_list(PostgreSQLPlpgsqlInnerParser.Expr_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#func_arg_list}.
	 * @param ctx the parse tree
	 */
	void enterFunc_arg_list(PostgreSQLPlpgsqlInnerParser.Func_arg_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#func_arg_list}.
	 * @param ctx the parse tree
	 */
	void exitFunc_arg_list(PostgreSQLPlpgsqlInnerParser.Func_arg_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#func_arg_expr}.
	 * @param ctx the parse tree
	 */
	void enterFunc_arg_expr(PostgreSQLPlpgsqlInnerParser.Func_arg_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#func_arg_expr}.
	 * @param ctx the parse tree
	 */
	void exitFunc_arg_expr(PostgreSQLPlpgsqlInnerParser.Func_arg_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#type_list}.
	 * @param ctx the parse tree
	 */
	void enterType_list(PostgreSQLPlpgsqlInnerParser.Type_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#type_list}.
	 * @param ctx the parse tree
	 */
	void exitType_list(PostgreSQLPlpgsqlInnerParser.Type_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#array_expr}.
	 * @param ctx the parse tree
	 */
	void enterArray_expr(PostgreSQLPlpgsqlInnerParser.Array_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#array_expr}.
	 * @param ctx the parse tree
	 */
	void exitArray_expr(PostgreSQLPlpgsqlInnerParser.Array_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#array_expr_list}.
	 * @param ctx the parse tree
	 */
	void enterArray_expr_list(PostgreSQLPlpgsqlInnerParser.Array_expr_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#array_expr_list}.
	 * @param ctx the parse tree
	 */
	void exitArray_expr_list(PostgreSQLPlpgsqlInnerParser.Array_expr_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#extract_list}.
	 * @param ctx the parse tree
	 */
	void enterExtract_list(PostgreSQLPlpgsqlInnerParser.Extract_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#extract_list}.
	 * @param ctx the parse tree
	 */
	void exitExtract_list(PostgreSQLPlpgsqlInnerParser.Extract_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#extract_arg}.
	 * @param ctx the parse tree
	 */
	void enterExtract_arg(PostgreSQLPlpgsqlInnerParser.Extract_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#extract_arg}.
	 * @param ctx the parse tree
	 */
	void exitExtract_arg(PostgreSQLPlpgsqlInnerParser.Extract_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#unicode_normal_form}.
	 * @param ctx the parse tree
	 */
	void enterUnicode_normal_form(PostgreSQLPlpgsqlInnerParser.Unicode_normal_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#unicode_normal_form}.
	 * @param ctx the parse tree
	 */
	void exitUnicode_normal_form(PostgreSQLPlpgsqlInnerParser.Unicode_normal_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#overlay_list}.
	 * @param ctx the parse tree
	 */
	void enterOverlay_list(PostgreSQLPlpgsqlInnerParser.Overlay_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#overlay_list}.
	 * @param ctx the parse tree
	 */
	void exitOverlay_list(PostgreSQLPlpgsqlInnerParser.Overlay_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#position_list}.
	 * @param ctx the parse tree
	 */
	void enterPosition_list(PostgreSQLPlpgsqlInnerParser.Position_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#position_list}.
	 * @param ctx the parse tree
	 */
	void exitPosition_list(PostgreSQLPlpgsqlInnerParser.Position_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#substr_list}.
	 * @param ctx the parse tree
	 */
	void enterSubstr_list(PostgreSQLPlpgsqlInnerParser.Substr_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#substr_list}.
	 * @param ctx the parse tree
	 */
	void exitSubstr_list(PostgreSQLPlpgsqlInnerParser.Substr_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#trim_list}.
	 * @param ctx the parse tree
	 */
	void enterTrim_list(PostgreSQLPlpgsqlInnerParser.Trim_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#trim_list}.
	 * @param ctx the parse tree
	 */
	void exitTrim_list(PostgreSQLPlpgsqlInnerParser.Trim_listContext ctx);
	/**
	 * Enter a parse tree produced by the {@code in_expr_select}
	 * labeled alternative in {@link PostgreSQLPlpgsqlInnerParser#in_expr}.
	 * @param ctx the parse tree
	 */
	void enterIn_expr_select(PostgreSQLPlpgsqlInnerParser.In_expr_selectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code in_expr_select}
	 * labeled alternative in {@link PostgreSQLPlpgsqlInnerParser#in_expr}.
	 * @param ctx the parse tree
	 */
	void exitIn_expr_select(PostgreSQLPlpgsqlInnerParser.In_expr_selectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code in_expr_list}
	 * labeled alternative in {@link PostgreSQLPlpgsqlInnerParser#in_expr}.
	 * @param ctx the parse tree
	 */
	void enterIn_expr_list(PostgreSQLPlpgsqlInnerParser.In_expr_listContext ctx);
	/**
	 * Exit a parse tree produced by the {@code in_expr_list}
	 * labeled alternative in {@link PostgreSQLPlpgsqlInnerParser#in_expr}.
	 * @param ctx the parse tree
	 */
	void exitIn_expr_list(PostgreSQLPlpgsqlInnerParser.In_expr_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#case_expr}.
	 * @param ctx the parse tree
	 */
	void enterCase_expr(PostgreSQLPlpgsqlInnerParser.Case_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#case_expr}.
	 * @param ctx the parse tree
	 */
	void exitCase_expr(PostgreSQLPlpgsqlInnerParser.Case_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#when_clause_list}.
	 * @param ctx the parse tree
	 */
	void enterWhen_clause_list(PostgreSQLPlpgsqlInnerParser.When_clause_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#when_clause_list}.
	 * @param ctx the parse tree
	 */
	void exitWhen_clause_list(PostgreSQLPlpgsqlInnerParser.When_clause_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#when_clause}.
	 * @param ctx the parse tree
	 */
	void enterWhen_clause(PostgreSQLPlpgsqlInnerParser.When_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#when_clause}.
	 * @param ctx the parse tree
	 */
	void exitWhen_clause(PostgreSQLPlpgsqlInnerParser.When_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#case_default}.
	 * @param ctx the parse tree
	 */
	void enterCase_default(PostgreSQLPlpgsqlInnerParser.Case_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#case_default}.
	 * @param ctx the parse tree
	 */
	void exitCase_default(PostgreSQLPlpgsqlInnerParser.Case_defaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#case_arg}.
	 * @param ctx the parse tree
	 */
	void enterCase_arg(PostgreSQLPlpgsqlInnerParser.Case_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#case_arg}.
	 * @param ctx the parse tree
	 */
	void exitCase_arg(PostgreSQLPlpgsqlInnerParser.Case_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#columnref}.
	 * @param ctx the parse tree
	 */
	void enterColumnref(PostgreSQLPlpgsqlInnerParser.ColumnrefContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#columnref}.
	 * @param ctx the parse tree
	 */
	void exitColumnref(PostgreSQLPlpgsqlInnerParser.ColumnrefContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#indirection_el}.
	 * @param ctx the parse tree
	 */
	void enterIndirection_el(PostgreSQLPlpgsqlInnerParser.Indirection_elContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#indirection_el}.
	 * @param ctx the parse tree
	 */
	void exitIndirection_el(PostgreSQLPlpgsqlInnerParser.Indirection_elContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_slice_bound}.
	 * @param ctx the parse tree
	 */
	void enterOpt_slice_bound(PostgreSQLPlpgsqlInnerParser.Opt_slice_boundContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_slice_bound}.
	 * @param ctx the parse tree
	 */
	void exitOpt_slice_bound(PostgreSQLPlpgsqlInnerParser.Opt_slice_boundContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#indirection}.
	 * @param ctx the parse tree
	 */
	void enterIndirection(PostgreSQLPlpgsqlInnerParser.IndirectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#indirection}.
	 * @param ctx the parse tree
	 */
	void exitIndirection(PostgreSQLPlpgsqlInnerParser.IndirectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_indirection}.
	 * @param ctx the parse tree
	 */
	void enterOpt_indirection(PostgreSQLPlpgsqlInnerParser.Opt_indirectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_indirection}.
	 * @param ctx the parse tree
	 */
	void exitOpt_indirection(PostgreSQLPlpgsqlInnerParser.Opt_indirectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_target_list}.
	 * @param ctx the parse tree
	 */
	void enterOpt_target_list(PostgreSQLPlpgsqlInnerParser.Opt_target_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_target_list}.
	 * @param ctx the parse tree
	 */
	void exitOpt_target_list(PostgreSQLPlpgsqlInnerParser.Opt_target_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#target_list}.
	 * @param ctx the parse tree
	 */
	void enterTarget_list(PostgreSQLPlpgsqlInnerParser.Target_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#target_list}.
	 * @param ctx the parse tree
	 */
	void exitTarget_list(PostgreSQLPlpgsqlInnerParser.Target_listContext ctx);
	/**
	 * Enter a parse tree produced by the {@code target_label}
	 * labeled alternative in {@link PostgreSQLPlpgsqlInnerParser#target_el}.
	 * @param ctx the parse tree
	 */
	void enterTarget_label(PostgreSQLPlpgsqlInnerParser.Target_labelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code target_label}
	 * labeled alternative in {@link PostgreSQLPlpgsqlInnerParser#target_el}.
	 * @param ctx the parse tree
	 */
	void exitTarget_label(PostgreSQLPlpgsqlInnerParser.Target_labelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code target_star}
	 * labeled alternative in {@link PostgreSQLPlpgsqlInnerParser#target_el}.
	 * @param ctx the parse tree
	 */
	void enterTarget_star(PostgreSQLPlpgsqlInnerParser.Target_starContext ctx);
	/**
	 * Exit a parse tree produced by the {@code target_star}
	 * labeled alternative in {@link PostgreSQLPlpgsqlInnerParser#target_el}.
	 * @param ctx the parse tree
	 */
	void exitTarget_star(PostgreSQLPlpgsqlInnerParser.Target_starContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#qualified_name_list}.
	 * @param ctx the parse tree
	 */
	void enterQualified_name_list(PostgreSQLPlpgsqlInnerParser.Qualified_name_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#qualified_name_list}.
	 * @param ctx the parse tree
	 */
	void exitQualified_name_list(PostgreSQLPlpgsqlInnerParser.Qualified_name_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#qualified_name}.
	 * @param ctx the parse tree
	 */
	void enterQualified_name(PostgreSQLPlpgsqlInnerParser.Qualified_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#qualified_name}.
	 * @param ctx the parse tree
	 */
	void exitQualified_name(PostgreSQLPlpgsqlInnerParser.Qualified_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#name_list}.
	 * @param ctx the parse tree
	 */
	void enterName_list(PostgreSQLPlpgsqlInnerParser.Name_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#name_list}.
	 * @param ctx the parse tree
	 */
	void exitName_list(PostgreSQLPlpgsqlInnerParser.Name_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(PostgreSQLPlpgsqlInnerParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(PostgreSQLPlpgsqlInnerParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#attr_name}.
	 * @param ctx the parse tree
	 */
	void enterAttr_name(PostgreSQLPlpgsqlInnerParser.Attr_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#attr_name}.
	 * @param ctx the parse tree
	 */
	void exitAttr_name(PostgreSQLPlpgsqlInnerParser.Attr_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#file_name}.
	 * @param ctx the parse tree
	 */
	void enterFile_name(PostgreSQLPlpgsqlInnerParser.File_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#file_name}.
	 * @param ctx the parse tree
	 */
	void exitFile_name(PostgreSQLPlpgsqlInnerParser.File_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#func_name}.
	 * @param ctx the parse tree
	 */
	void enterFunc_name(PostgreSQLPlpgsqlInnerParser.Func_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#func_name}.
	 * @param ctx the parse tree
	 */
	void exitFunc_name(PostgreSQLPlpgsqlInnerParser.Func_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#aexprconst}.
	 * @param ctx the parse tree
	 */
	void enterAexprconst(PostgreSQLPlpgsqlInnerParser.AexprconstContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#aexprconst}.
	 * @param ctx the parse tree
	 */
	void exitAexprconst(PostgreSQLPlpgsqlInnerParser.AexprconstContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#xconst}.
	 * @param ctx the parse tree
	 */
	void enterXconst(PostgreSQLPlpgsqlInnerParser.XconstContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#xconst}.
	 * @param ctx the parse tree
	 */
	void exitXconst(PostgreSQLPlpgsqlInnerParser.XconstContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#bconst}.
	 * @param ctx the parse tree
	 */
	void enterBconst(PostgreSQLPlpgsqlInnerParser.BconstContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#bconst}.
	 * @param ctx the parse tree
	 */
	void exitBconst(PostgreSQLPlpgsqlInnerParser.BconstContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#fconst}.
	 * @param ctx the parse tree
	 */
	void enterFconst(PostgreSQLPlpgsqlInnerParser.FconstContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#fconst}.
	 * @param ctx the parse tree
	 */
	void exitFconst(PostgreSQLPlpgsqlInnerParser.FconstContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#iconst}.
	 * @param ctx the parse tree
	 */
	void enterIconst(PostgreSQLPlpgsqlInnerParser.IconstContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#iconst}.
	 * @param ctx the parse tree
	 */
	void exitIconst(PostgreSQLPlpgsqlInnerParser.IconstContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#sconst}.
	 * @param ctx the parse tree
	 */
	void enterSconst(PostgreSQLPlpgsqlInnerParser.SconstContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#sconst}.
	 * @param ctx the parse tree
	 */
	void exitSconst(PostgreSQLPlpgsqlInnerParser.SconstContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#anysconst}.
	 * @param ctx the parse tree
	 */
	void enterAnysconst(PostgreSQLPlpgsqlInnerParser.AnysconstContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#anysconst}.
	 * @param ctx the parse tree
	 */
	void exitAnysconst(PostgreSQLPlpgsqlInnerParser.AnysconstContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_uescape}.
	 * @param ctx the parse tree
	 */
	void enterOpt_uescape(PostgreSQLPlpgsqlInnerParser.Opt_uescapeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_uescape}.
	 * @param ctx the parse tree
	 */
	void exitOpt_uescape(PostgreSQLPlpgsqlInnerParser.Opt_uescapeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#signediconst}.
	 * @param ctx the parse tree
	 */
	void enterSignediconst(PostgreSQLPlpgsqlInnerParser.SignediconstContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#signediconst}.
	 * @param ctx the parse tree
	 */
	void exitSignediconst(PostgreSQLPlpgsqlInnerParser.SignediconstContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#roleid}.
	 * @param ctx the parse tree
	 */
	void enterRoleid(PostgreSQLPlpgsqlInnerParser.RoleidContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#roleid}.
	 * @param ctx the parse tree
	 */
	void exitRoleid(PostgreSQLPlpgsqlInnerParser.RoleidContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#rolespec}.
	 * @param ctx the parse tree
	 */
	void enterRolespec(PostgreSQLPlpgsqlInnerParser.RolespecContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#rolespec}.
	 * @param ctx the parse tree
	 */
	void exitRolespec(PostgreSQLPlpgsqlInnerParser.RolespecContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#role_list}.
	 * @param ctx the parse tree
	 */
	void enterRole_list(PostgreSQLPlpgsqlInnerParser.Role_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#role_list}.
	 * @param ctx the parse tree
	 */
	void exitRole_list(PostgreSQLPlpgsqlInnerParser.Role_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#colid}.
	 * @param ctx the parse tree
	 */
	void enterColid(PostgreSQLPlpgsqlInnerParser.ColidContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#colid}.
	 * @param ctx the parse tree
	 */
	void exitColid(PostgreSQLPlpgsqlInnerParser.ColidContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#type_function_name}.
	 * @param ctx the parse tree
	 */
	void enterType_function_name(PostgreSQLPlpgsqlInnerParser.Type_function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#type_function_name}.
	 * @param ctx the parse tree
	 */
	void exitType_function_name(PostgreSQLPlpgsqlInnerParser.Type_function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#nonreservedword}.
	 * @param ctx the parse tree
	 */
	void enterNonreservedword(PostgreSQLPlpgsqlInnerParser.NonreservedwordContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#nonreservedword}.
	 * @param ctx the parse tree
	 */
	void exitNonreservedword(PostgreSQLPlpgsqlInnerParser.NonreservedwordContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#collabel}.
	 * @param ctx the parse tree
	 */
	void enterCollabel(PostgreSQLPlpgsqlInnerParser.CollabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#collabel}.
	 * @param ctx the parse tree
	 */
	void exitCollabel(PostgreSQLPlpgsqlInnerParser.CollabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(PostgreSQLPlpgsqlInnerParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(PostgreSQLPlpgsqlInnerParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#plsqlidentifier}.
	 * @param ctx the parse tree
	 */
	void enterPlsqlidentifier(PostgreSQLPlpgsqlInnerParser.PlsqlidentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#plsqlidentifier}.
	 * @param ctx the parse tree
	 */
	void exitPlsqlidentifier(PostgreSQLPlpgsqlInnerParser.PlsqlidentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#unreserved_keyword}.
	 * @param ctx the parse tree
	 */
	void enterUnreserved_keyword(PostgreSQLPlpgsqlInnerParser.Unreserved_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#unreserved_keyword}.
	 * @param ctx the parse tree
	 */
	void exitUnreserved_keyword(PostgreSQLPlpgsqlInnerParser.Unreserved_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#col_name_keyword}.
	 * @param ctx the parse tree
	 */
	void enterCol_name_keyword(PostgreSQLPlpgsqlInnerParser.Col_name_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#col_name_keyword}.
	 * @param ctx the parse tree
	 */
	void exitCol_name_keyword(PostgreSQLPlpgsqlInnerParser.Col_name_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#type_func_name_keyword}.
	 * @param ctx the parse tree
	 */
	void enterType_func_name_keyword(PostgreSQLPlpgsqlInnerParser.Type_func_name_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#type_func_name_keyword}.
	 * @param ctx the parse tree
	 */
	void exitType_func_name_keyword(PostgreSQLPlpgsqlInnerParser.Type_func_name_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#reserved_keyword}.
	 * @param ctx the parse tree
	 */
	void enterReserved_keyword(PostgreSQLPlpgsqlInnerParser.Reserved_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#reserved_keyword}.
	 * @param ctx the parse tree
	 */
	void exitReserved_keyword(PostgreSQLPlpgsqlInnerParser.Reserved_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#pl_function}.
	 * @param ctx the parse tree
	 */
	void enterPl_function(PostgreSQLPlpgsqlInnerParser.Pl_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#pl_function}.
	 * @param ctx the parse tree
	 */
	void exitPl_function(PostgreSQLPlpgsqlInnerParser.Pl_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#comp_options}.
	 * @param ctx the parse tree
	 */
	void enterComp_options(PostgreSQLPlpgsqlInnerParser.Comp_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#comp_options}.
	 * @param ctx the parse tree
	 */
	void exitComp_options(PostgreSQLPlpgsqlInnerParser.Comp_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#comp_option}.
	 * @param ctx the parse tree
	 */
	void enterComp_option(PostgreSQLPlpgsqlInnerParser.Comp_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#comp_option}.
	 * @param ctx the parse tree
	 */
	void exitComp_option(PostgreSQLPlpgsqlInnerParser.Comp_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#sharp}.
	 * @param ctx the parse tree
	 */
	void enterSharp(PostgreSQLPlpgsqlInnerParser.SharpContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#sharp}.
	 * @param ctx the parse tree
	 */
	void exitSharp(PostgreSQLPlpgsqlInnerParser.SharpContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#option_value}.
	 * @param ctx the parse tree
	 */
	void enterOption_value(PostgreSQLPlpgsqlInnerParser.Option_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#option_value}.
	 * @param ctx the parse tree
	 */
	void exitOption_value(PostgreSQLPlpgsqlInnerParser.Option_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_semi}.
	 * @param ctx the parse tree
	 */
	void enterOpt_semi(PostgreSQLPlpgsqlInnerParser.Opt_semiContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_semi}.
	 * @param ctx the parse tree
	 */
	void exitOpt_semi(PostgreSQLPlpgsqlInnerParser.Opt_semiContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#pl_block}.
	 * @param ctx the parse tree
	 */
	void enterPl_block(PostgreSQLPlpgsqlInnerParser.Pl_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#pl_block}.
	 * @param ctx the parse tree
	 */
	void exitPl_block(PostgreSQLPlpgsqlInnerParser.Pl_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#decl_sect}.
	 * @param ctx the parse tree
	 */
	void enterDecl_sect(PostgreSQLPlpgsqlInnerParser.Decl_sectContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#decl_sect}.
	 * @param ctx the parse tree
	 */
	void exitDecl_sect(PostgreSQLPlpgsqlInnerParser.Decl_sectContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#decl_start}.
	 * @param ctx the parse tree
	 */
	void enterDecl_start(PostgreSQLPlpgsqlInnerParser.Decl_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#decl_start}.
	 * @param ctx the parse tree
	 */
	void exitDecl_start(PostgreSQLPlpgsqlInnerParser.Decl_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#decl_stmts}.
	 * @param ctx the parse tree
	 */
	void enterDecl_stmts(PostgreSQLPlpgsqlInnerParser.Decl_stmtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#decl_stmts}.
	 * @param ctx the parse tree
	 */
	void exitDecl_stmts(PostgreSQLPlpgsqlInnerParser.Decl_stmtsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#label_decl}.
	 * @param ctx the parse tree
	 */
	void enterLabel_decl(PostgreSQLPlpgsqlInnerParser.Label_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#label_decl}.
	 * @param ctx the parse tree
	 */
	void exitLabel_decl(PostgreSQLPlpgsqlInnerParser.Label_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#decl_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDecl_stmt(PostgreSQLPlpgsqlInnerParser.Decl_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#decl_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDecl_stmt(PostgreSQLPlpgsqlInnerParser.Decl_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#decl_statement}.
	 * @param ctx the parse tree
	 */
	void enterDecl_statement(PostgreSQLPlpgsqlInnerParser.Decl_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#decl_statement}.
	 * @param ctx the parse tree
	 */
	void exitDecl_statement(PostgreSQLPlpgsqlInnerParser.Decl_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_scrollable}.
	 * @param ctx the parse tree
	 */
	void enterOpt_scrollable(PostgreSQLPlpgsqlInnerParser.Opt_scrollableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_scrollable}.
	 * @param ctx the parse tree
	 */
	void exitOpt_scrollable(PostgreSQLPlpgsqlInnerParser.Opt_scrollableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#decl_cursor_query}.
	 * @param ctx the parse tree
	 */
	void enterDecl_cursor_query(PostgreSQLPlpgsqlInnerParser.Decl_cursor_queryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#decl_cursor_query}.
	 * @param ctx the parse tree
	 */
	void exitDecl_cursor_query(PostgreSQLPlpgsqlInnerParser.Decl_cursor_queryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#decl_cursor_args}.
	 * @param ctx the parse tree
	 */
	void enterDecl_cursor_args(PostgreSQLPlpgsqlInnerParser.Decl_cursor_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#decl_cursor_args}.
	 * @param ctx the parse tree
	 */
	void exitDecl_cursor_args(PostgreSQLPlpgsqlInnerParser.Decl_cursor_argsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#decl_cursor_arglist}.
	 * @param ctx the parse tree
	 */
	void enterDecl_cursor_arglist(PostgreSQLPlpgsqlInnerParser.Decl_cursor_arglistContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#decl_cursor_arglist}.
	 * @param ctx the parse tree
	 */
	void exitDecl_cursor_arglist(PostgreSQLPlpgsqlInnerParser.Decl_cursor_arglistContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#decl_cursor_arg}.
	 * @param ctx the parse tree
	 */
	void enterDecl_cursor_arg(PostgreSQLPlpgsqlInnerParser.Decl_cursor_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#decl_cursor_arg}.
	 * @param ctx the parse tree
	 */
	void exitDecl_cursor_arg(PostgreSQLPlpgsqlInnerParser.Decl_cursor_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#decl_is_for}.
	 * @param ctx the parse tree
	 */
	void enterDecl_is_for(PostgreSQLPlpgsqlInnerParser.Decl_is_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#decl_is_for}.
	 * @param ctx the parse tree
	 */
	void exitDecl_is_for(PostgreSQLPlpgsqlInnerParser.Decl_is_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#decl_aliasitem}.
	 * @param ctx the parse tree
	 */
	void enterDecl_aliasitem(PostgreSQLPlpgsqlInnerParser.Decl_aliasitemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#decl_aliasitem}.
	 * @param ctx the parse tree
	 */
	void exitDecl_aliasitem(PostgreSQLPlpgsqlInnerParser.Decl_aliasitemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#decl_varname}.
	 * @param ctx the parse tree
	 */
	void enterDecl_varname(PostgreSQLPlpgsqlInnerParser.Decl_varnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#decl_varname}.
	 * @param ctx the parse tree
	 */
	void exitDecl_varname(PostgreSQLPlpgsqlInnerParser.Decl_varnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#decl_const}.
	 * @param ctx the parse tree
	 */
	void enterDecl_const(PostgreSQLPlpgsqlInnerParser.Decl_constContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#decl_const}.
	 * @param ctx the parse tree
	 */
	void exitDecl_const(PostgreSQLPlpgsqlInnerParser.Decl_constContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#decl_datatype}.
	 * @param ctx the parse tree
	 */
	void enterDecl_datatype(PostgreSQLPlpgsqlInnerParser.Decl_datatypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#decl_datatype}.
	 * @param ctx the parse tree
	 */
	void exitDecl_datatype(PostgreSQLPlpgsqlInnerParser.Decl_datatypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#decl_collate}.
	 * @param ctx the parse tree
	 */
	void enterDecl_collate(PostgreSQLPlpgsqlInnerParser.Decl_collateContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#decl_collate}.
	 * @param ctx the parse tree
	 */
	void exitDecl_collate(PostgreSQLPlpgsqlInnerParser.Decl_collateContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#decl_notnull}.
	 * @param ctx the parse tree
	 */
	void enterDecl_notnull(PostgreSQLPlpgsqlInnerParser.Decl_notnullContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#decl_notnull}.
	 * @param ctx the parse tree
	 */
	void exitDecl_notnull(PostgreSQLPlpgsqlInnerParser.Decl_notnullContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#decl_defval}.
	 * @param ctx the parse tree
	 */
	void enterDecl_defval(PostgreSQLPlpgsqlInnerParser.Decl_defvalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#decl_defval}.
	 * @param ctx the parse tree
	 */
	void exitDecl_defval(PostgreSQLPlpgsqlInnerParser.Decl_defvalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#decl_defkey}.
	 * @param ctx the parse tree
	 */
	void enterDecl_defkey(PostgreSQLPlpgsqlInnerParser.Decl_defkeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#decl_defkey}.
	 * @param ctx the parse tree
	 */
	void exitDecl_defkey(PostgreSQLPlpgsqlInnerParser.Decl_defkeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#assign_operator}.
	 * @param ctx the parse tree
	 */
	void enterAssign_operator(PostgreSQLPlpgsqlInnerParser.Assign_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#assign_operator}.
	 * @param ctx the parse tree
	 */
	void exitAssign_operator(PostgreSQLPlpgsqlInnerParser.Assign_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#proc_sect}.
	 * @param ctx the parse tree
	 */
	void enterProc_sect(PostgreSQLPlpgsqlInnerParser.Proc_sectContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#proc_sect}.
	 * @param ctx the parse tree
	 */
	void exitProc_sect(PostgreSQLPlpgsqlInnerParser.Proc_sectContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#proc_stmt}.
	 * @param ctx the parse tree
	 */
	void enterProc_stmt(PostgreSQLPlpgsqlInnerParser.Proc_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#proc_stmt}.
	 * @param ctx the parse tree
	 */
	void exitProc_stmt(PostgreSQLPlpgsqlInnerParser.Proc_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmt_perform}.
	 * @param ctx the parse tree
	 */
	void enterStmt_perform(PostgreSQLPlpgsqlInnerParser.Stmt_performContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmt_perform}.
	 * @param ctx the parse tree
	 */
	void exitStmt_perform(PostgreSQLPlpgsqlInnerParser.Stmt_performContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmt_call}.
	 * @param ctx the parse tree
	 */
	void enterStmt_call(PostgreSQLPlpgsqlInnerParser.Stmt_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmt_call}.
	 * @param ctx the parse tree
	 */
	void exitStmt_call(PostgreSQLPlpgsqlInnerParser.Stmt_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_expr_list}.
	 * @param ctx the parse tree
	 */
	void enterOpt_expr_list(PostgreSQLPlpgsqlInnerParser.Opt_expr_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_expr_list}.
	 * @param ctx the parse tree
	 */
	void exitOpt_expr_list(PostgreSQLPlpgsqlInnerParser.Opt_expr_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmt_assign}.
	 * @param ctx the parse tree
	 */
	void enterStmt_assign(PostgreSQLPlpgsqlInnerParser.Stmt_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmt_assign}.
	 * @param ctx the parse tree
	 */
	void exitStmt_assign(PostgreSQLPlpgsqlInnerParser.Stmt_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmt_getdiag}.
	 * @param ctx the parse tree
	 */
	void enterStmt_getdiag(PostgreSQLPlpgsqlInnerParser.Stmt_getdiagContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmt_getdiag}.
	 * @param ctx the parse tree
	 */
	void exitStmt_getdiag(PostgreSQLPlpgsqlInnerParser.Stmt_getdiagContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#getdiag_area_opt}.
	 * @param ctx the parse tree
	 */
	void enterGetdiag_area_opt(PostgreSQLPlpgsqlInnerParser.Getdiag_area_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#getdiag_area_opt}.
	 * @param ctx the parse tree
	 */
	void exitGetdiag_area_opt(PostgreSQLPlpgsqlInnerParser.Getdiag_area_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#getdiag_list}.
	 * @param ctx the parse tree
	 */
	void enterGetdiag_list(PostgreSQLPlpgsqlInnerParser.Getdiag_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#getdiag_list}.
	 * @param ctx the parse tree
	 */
	void exitGetdiag_list(PostgreSQLPlpgsqlInnerParser.Getdiag_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#getdiag_list_item}.
	 * @param ctx the parse tree
	 */
	void enterGetdiag_list_item(PostgreSQLPlpgsqlInnerParser.Getdiag_list_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#getdiag_list_item}.
	 * @param ctx the parse tree
	 */
	void exitGetdiag_list_item(PostgreSQLPlpgsqlInnerParser.Getdiag_list_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#getdiag_item}.
	 * @param ctx the parse tree
	 */
	void enterGetdiag_item(PostgreSQLPlpgsqlInnerParser.Getdiag_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#getdiag_item}.
	 * @param ctx the parse tree
	 */
	void exitGetdiag_item(PostgreSQLPlpgsqlInnerParser.Getdiag_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#getdiag_target}.
	 * @param ctx the parse tree
	 */
	void enterGetdiag_target(PostgreSQLPlpgsqlInnerParser.Getdiag_targetContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#getdiag_target}.
	 * @param ctx the parse tree
	 */
	void exitGetdiag_target(PostgreSQLPlpgsqlInnerParser.Getdiag_targetContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#assign_var}.
	 * @param ctx the parse tree
	 */
	void enterAssign_var(PostgreSQLPlpgsqlInnerParser.Assign_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#assign_var}.
	 * @param ctx the parse tree
	 */
	void exitAssign_var(PostgreSQLPlpgsqlInnerParser.Assign_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmt_if}.
	 * @param ctx the parse tree
	 */
	void enterStmt_if(PostgreSQLPlpgsqlInnerParser.Stmt_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmt_if}.
	 * @param ctx the parse tree
	 */
	void exitStmt_if(PostgreSQLPlpgsqlInnerParser.Stmt_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmt_elsifs}.
	 * @param ctx the parse tree
	 */
	void enterStmt_elsifs(PostgreSQLPlpgsqlInnerParser.Stmt_elsifsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmt_elsifs}.
	 * @param ctx the parse tree
	 */
	void exitStmt_elsifs(PostgreSQLPlpgsqlInnerParser.Stmt_elsifsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmt_else}.
	 * @param ctx the parse tree
	 */
	void enterStmt_else(PostgreSQLPlpgsqlInnerParser.Stmt_elseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmt_else}.
	 * @param ctx the parse tree
	 */
	void exitStmt_else(PostgreSQLPlpgsqlInnerParser.Stmt_elseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmt_case}.
	 * @param ctx the parse tree
	 */
	void enterStmt_case(PostgreSQLPlpgsqlInnerParser.Stmt_caseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmt_case}.
	 * @param ctx the parse tree
	 */
	void exitStmt_case(PostgreSQLPlpgsqlInnerParser.Stmt_caseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_expr_until_when}.
	 * @param ctx the parse tree
	 */
	void enterOpt_expr_until_when(PostgreSQLPlpgsqlInnerParser.Opt_expr_until_whenContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_expr_until_when}.
	 * @param ctx the parse tree
	 */
	void exitOpt_expr_until_when(PostgreSQLPlpgsqlInnerParser.Opt_expr_until_whenContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#case_when_list}.
	 * @param ctx the parse tree
	 */
	void enterCase_when_list(PostgreSQLPlpgsqlInnerParser.Case_when_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#case_when_list}.
	 * @param ctx the parse tree
	 */
	void exitCase_when_list(PostgreSQLPlpgsqlInnerParser.Case_when_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#case_when}.
	 * @param ctx the parse tree
	 */
	void enterCase_when(PostgreSQLPlpgsqlInnerParser.Case_whenContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#case_when}.
	 * @param ctx the parse tree
	 */
	void exitCase_when(PostgreSQLPlpgsqlInnerParser.Case_whenContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_case_else}.
	 * @param ctx the parse tree
	 */
	void enterOpt_case_else(PostgreSQLPlpgsqlInnerParser.Opt_case_elseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_case_else}.
	 * @param ctx the parse tree
	 */
	void exitOpt_case_else(PostgreSQLPlpgsqlInnerParser.Opt_case_elseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmt_loop}.
	 * @param ctx the parse tree
	 */
	void enterStmt_loop(PostgreSQLPlpgsqlInnerParser.Stmt_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmt_loop}.
	 * @param ctx the parse tree
	 */
	void exitStmt_loop(PostgreSQLPlpgsqlInnerParser.Stmt_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmt_while}.
	 * @param ctx the parse tree
	 */
	void enterStmt_while(PostgreSQLPlpgsqlInnerParser.Stmt_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmt_while}.
	 * @param ctx the parse tree
	 */
	void exitStmt_while(PostgreSQLPlpgsqlInnerParser.Stmt_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmt_for}.
	 * @param ctx the parse tree
	 */
	void enterStmt_for(PostgreSQLPlpgsqlInnerParser.Stmt_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmt_for}.
	 * @param ctx the parse tree
	 */
	void exitStmt_for(PostgreSQLPlpgsqlInnerParser.Stmt_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#for_control}.
	 * @param ctx the parse tree
	 */
	void enterFor_control(PostgreSQLPlpgsqlInnerParser.For_controlContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#for_control}.
	 * @param ctx the parse tree
	 */
	void exitFor_control(PostgreSQLPlpgsqlInnerParser.For_controlContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_for_using_expression}.
	 * @param ctx the parse tree
	 */
	void enterOpt_for_using_expression(PostgreSQLPlpgsqlInnerParser.Opt_for_using_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_for_using_expression}.
	 * @param ctx the parse tree
	 */
	void exitOpt_for_using_expression(PostgreSQLPlpgsqlInnerParser.Opt_for_using_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_cursor_parameters}.
	 * @param ctx the parse tree
	 */
	void enterOpt_cursor_parameters(PostgreSQLPlpgsqlInnerParser.Opt_cursor_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_cursor_parameters}.
	 * @param ctx the parse tree
	 */
	void exitOpt_cursor_parameters(PostgreSQLPlpgsqlInnerParser.Opt_cursor_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_reverse}.
	 * @param ctx the parse tree
	 */
	void enterOpt_reverse(PostgreSQLPlpgsqlInnerParser.Opt_reverseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_reverse}.
	 * @param ctx the parse tree
	 */
	void exitOpt_reverse(PostgreSQLPlpgsqlInnerParser.Opt_reverseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_by_expression}.
	 * @param ctx the parse tree
	 */
	void enterOpt_by_expression(PostgreSQLPlpgsqlInnerParser.Opt_by_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_by_expression}.
	 * @param ctx the parse tree
	 */
	void exitOpt_by_expression(PostgreSQLPlpgsqlInnerParser.Opt_by_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#for_variable}.
	 * @param ctx the parse tree
	 */
	void enterFor_variable(PostgreSQLPlpgsqlInnerParser.For_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#for_variable}.
	 * @param ctx the parse tree
	 */
	void exitFor_variable(PostgreSQLPlpgsqlInnerParser.For_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmt_foreach_a}.
	 * @param ctx the parse tree
	 */
	void enterStmt_foreach_a(PostgreSQLPlpgsqlInnerParser.Stmt_foreach_aContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmt_foreach_a}.
	 * @param ctx the parse tree
	 */
	void exitStmt_foreach_a(PostgreSQLPlpgsqlInnerParser.Stmt_foreach_aContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#foreach_slice}.
	 * @param ctx the parse tree
	 */
	void enterForeach_slice(PostgreSQLPlpgsqlInnerParser.Foreach_sliceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#foreach_slice}.
	 * @param ctx the parse tree
	 */
	void exitForeach_slice(PostgreSQLPlpgsqlInnerParser.Foreach_sliceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmt_exit}.
	 * @param ctx the parse tree
	 */
	void enterStmt_exit(PostgreSQLPlpgsqlInnerParser.Stmt_exitContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmt_exit}.
	 * @param ctx the parse tree
	 */
	void exitStmt_exit(PostgreSQLPlpgsqlInnerParser.Stmt_exitContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#exit_type}.
	 * @param ctx the parse tree
	 */
	void enterExit_type(PostgreSQLPlpgsqlInnerParser.Exit_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#exit_type}.
	 * @param ctx the parse tree
	 */
	void exitExit_type(PostgreSQLPlpgsqlInnerParser.Exit_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmt_return}.
	 * @param ctx the parse tree
	 */
	void enterStmt_return(PostgreSQLPlpgsqlInnerParser.Stmt_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmt_return}.
	 * @param ctx the parse tree
	 */
	void exitStmt_return(PostgreSQLPlpgsqlInnerParser.Stmt_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_return_result}.
	 * @param ctx the parse tree
	 */
	void enterOpt_return_result(PostgreSQLPlpgsqlInnerParser.Opt_return_resultContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_return_result}.
	 * @param ctx the parse tree
	 */
	void exitOpt_return_result(PostgreSQLPlpgsqlInnerParser.Opt_return_resultContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmt_raise}.
	 * @param ctx the parse tree
	 */
	void enterStmt_raise(PostgreSQLPlpgsqlInnerParser.Stmt_raiseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmt_raise}.
	 * @param ctx the parse tree
	 */
	void exitStmt_raise(PostgreSQLPlpgsqlInnerParser.Stmt_raiseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_stmt_raise_level}.
	 * @param ctx the parse tree
	 */
	void enterOpt_stmt_raise_level(PostgreSQLPlpgsqlInnerParser.Opt_stmt_raise_levelContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_stmt_raise_level}.
	 * @param ctx the parse tree
	 */
	void exitOpt_stmt_raise_level(PostgreSQLPlpgsqlInnerParser.Opt_stmt_raise_levelContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_raise_list}.
	 * @param ctx the parse tree
	 */
	void enterOpt_raise_list(PostgreSQLPlpgsqlInnerParser.Opt_raise_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_raise_list}.
	 * @param ctx the parse tree
	 */
	void exitOpt_raise_list(PostgreSQLPlpgsqlInnerParser.Opt_raise_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_raise_using}.
	 * @param ctx the parse tree
	 */
	void enterOpt_raise_using(PostgreSQLPlpgsqlInnerParser.Opt_raise_usingContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_raise_using}.
	 * @param ctx the parse tree
	 */
	void exitOpt_raise_using(PostgreSQLPlpgsqlInnerParser.Opt_raise_usingContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_raise_using_elem}.
	 * @param ctx the parse tree
	 */
	void enterOpt_raise_using_elem(PostgreSQLPlpgsqlInnerParser.Opt_raise_using_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_raise_using_elem}.
	 * @param ctx the parse tree
	 */
	void exitOpt_raise_using_elem(PostgreSQLPlpgsqlInnerParser.Opt_raise_using_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_raise_using_elem_list}.
	 * @param ctx the parse tree
	 */
	void enterOpt_raise_using_elem_list(PostgreSQLPlpgsqlInnerParser.Opt_raise_using_elem_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_raise_using_elem_list}.
	 * @param ctx the parse tree
	 */
	void exitOpt_raise_using_elem_list(PostgreSQLPlpgsqlInnerParser.Opt_raise_using_elem_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmt_assert}.
	 * @param ctx the parse tree
	 */
	void enterStmt_assert(PostgreSQLPlpgsqlInnerParser.Stmt_assertContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmt_assert}.
	 * @param ctx the parse tree
	 */
	void exitStmt_assert(PostgreSQLPlpgsqlInnerParser.Stmt_assertContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_stmt_assert_message}.
	 * @param ctx the parse tree
	 */
	void enterOpt_stmt_assert_message(PostgreSQLPlpgsqlInnerParser.Opt_stmt_assert_messageContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_stmt_assert_message}.
	 * @param ctx the parse tree
	 */
	void exitOpt_stmt_assert_message(PostgreSQLPlpgsqlInnerParser.Opt_stmt_assert_messageContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#loop_body}.
	 * @param ctx the parse tree
	 */
	void enterLoop_body(PostgreSQLPlpgsqlInnerParser.Loop_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#loop_body}.
	 * @param ctx the parse tree
	 */
	void exitLoop_body(PostgreSQLPlpgsqlInnerParser.Loop_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmt_execsql}.
	 * @param ctx the parse tree
	 */
	void enterStmt_execsql(PostgreSQLPlpgsqlInnerParser.Stmt_execsqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmt_execsql}.
	 * @param ctx the parse tree
	 */
	void exitStmt_execsql(PostgreSQLPlpgsqlInnerParser.Stmt_execsqlContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmt_dynexecute}.
	 * @param ctx the parse tree
	 */
	void enterStmt_dynexecute(PostgreSQLPlpgsqlInnerParser.Stmt_dynexecuteContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmt_dynexecute}.
	 * @param ctx the parse tree
	 */
	void exitStmt_dynexecute(PostgreSQLPlpgsqlInnerParser.Stmt_dynexecuteContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_execute_using}.
	 * @param ctx the parse tree
	 */
	void enterOpt_execute_using(PostgreSQLPlpgsqlInnerParser.Opt_execute_usingContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_execute_using}.
	 * @param ctx the parse tree
	 */
	void exitOpt_execute_using(PostgreSQLPlpgsqlInnerParser.Opt_execute_usingContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_execute_using_list}.
	 * @param ctx the parse tree
	 */
	void enterOpt_execute_using_list(PostgreSQLPlpgsqlInnerParser.Opt_execute_using_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_execute_using_list}.
	 * @param ctx the parse tree
	 */
	void exitOpt_execute_using_list(PostgreSQLPlpgsqlInnerParser.Opt_execute_using_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_execute_into}.
	 * @param ctx the parse tree
	 */
	void enterOpt_execute_into(PostgreSQLPlpgsqlInnerParser.Opt_execute_intoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_execute_into}.
	 * @param ctx the parse tree
	 */
	void exitOpt_execute_into(PostgreSQLPlpgsqlInnerParser.Opt_execute_intoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmt_open}.
	 * @param ctx the parse tree
	 */
	void enterStmt_open(PostgreSQLPlpgsqlInnerParser.Stmt_openContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmt_open}.
	 * @param ctx the parse tree
	 */
	void exitStmt_open(PostgreSQLPlpgsqlInnerParser.Stmt_openContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_open_bound_list_item}.
	 * @param ctx the parse tree
	 */
	void enterOpt_open_bound_list_item(PostgreSQLPlpgsqlInnerParser.Opt_open_bound_list_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_open_bound_list_item}.
	 * @param ctx the parse tree
	 */
	void exitOpt_open_bound_list_item(PostgreSQLPlpgsqlInnerParser.Opt_open_bound_list_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_open_bound_list}.
	 * @param ctx the parse tree
	 */
	void enterOpt_open_bound_list(PostgreSQLPlpgsqlInnerParser.Opt_open_bound_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_open_bound_list}.
	 * @param ctx the parse tree
	 */
	void exitOpt_open_bound_list(PostgreSQLPlpgsqlInnerParser.Opt_open_bound_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_open_using}.
	 * @param ctx the parse tree
	 */
	void enterOpt_open_using(PostgreSQLPlpgsqlInnerParser.Opt_open_usingContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_open_using}.
	 * @param ctx the parse tree
	 */
	void exitOpt_open_using(PostgreSQLPlpgsqlInnerParser.Opt_open_usingContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_scroll_option}.
	 * @param ctx the parse tree
	 */
	void enterOpt_scroll_option(PostgreSQLPlpgsqlInnerParser.Opt_scroll_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_scroll_option}.
	 * @param ctx the parse tree
	 */
	void exitOpt_scroll_option(PostgreSQLPlpgsqlInnerParser.Opt_scroll_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_scroll_option_no}.
	 * @param ctx the parse tree
	 */
	void enterOpt_scroll_option_no(PostgreSQLPlpgsqlInnerParser.Opt_scroll_option_noContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_scroll_option_no}.
	 * @param ctx the parse tree
	 */
	void exitOpt_scroll_option_no(PostgreSQLPlpgsqlInnerParser.Opt_scroll_option_noContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmt_fetch}.
	 * @param ctx the parse tree
	 */
	void enterStmt_fetch(PostgreSQLPlpgsqlInnerParser.Stmt_fetchContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmt_fetch}.
	 * @param ctx the parse tree
	 */
	void exitStmt_fetch(PostgreSQLPlpgsqlInnerParser.Stmt_fetchContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#into_target}.
	 * @param ctx the parse tree
	 */
	void enterInto_target(PostgreSQLPlpgsqlInnerParser.Into_targetContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#into_target}.
	 * @param ctx the parse tree
	 */
	void exitInto_target(PostgreSQLPlpgsqlInnerParser.Into_targetContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_cursor_from}.
	 * @param ctx the parse tree
	 */
	void enterOpt_cursor_from(PostgreSQLPlpgsqlInnerParser.Opt_cursor_fromContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_cursor_from}.
	 * @param ctx the parse tree
	 */
	void exitOpt_cursor_from(PostgreSQLPlpgsqlInnerParser.Opt_cursor_fromContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_fetch_direction}.
	 * @param ctx the parse tree
	 */
	void enterOpt_fetch_direction(PostgreSQLPlpgsqlInnerParser.Opt_fetch_directionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_fetch_direction}.
	 * @param ctx the parse tree
	 */
	void exitOpt_fetch_direction(PostgreSQLPlpgsqlInnerParser.Opt_fetch_directionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmt_move}.
	 * @param ctx the parse tree
	 */
	void enterStmt_move(PostgreSQLPlpgsqlInnerParser.Stmt_moveContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmt_move}.
	 * @param ctx the parse tree
	 */
	void exitStmt_move(PostgreSQLPlpgsqlInnerParser.Stmt_moveContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmt_close}.
	 * @param ctx the parse tree
	 */
	void enterStmt_close(PostgreSQLPlpgsqlInnerParser.Stmt_closeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmt_close}.
	 * @param ctx the parse tree
	 */
	void exitStmt_close(PostgreSQLPlpgsqlInnerParser.Stmt_closeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmt_null}.
	 * @param ctx the parse tree
	 */
	void enterStmt_null(PostgreSQLPlpgsqlInnerParser.Stmt_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmt_null}.
	 * @param ctx the parse tree
	 */
	void exitStmt_null(PostgreSQLPlpgsqlInnerParser.Stmt_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmt_commit}.
	 * @param ctx the parse tree
	 */
	void enterStmt_commit(PostgreSQLPlpgsqlInnerParser.Stmt_commitContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmt_commit}.
	 * @param ctx the parse tree
	 */
	void exitStmt_commit(PostgreSQLPlpgsqlInnerParser.Stmt_commitContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmt_rollback}.
	 * @param ctx the parse tree
	 */
	void enterStmt_rollback(PostgreSQLPlpgsqlInnerParser.Stmt_rollbackContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmt_rollback}.
	 * @param ctx the parse tree
	 */
	void exitStmt_rollback(PostgreSQLPlpgsqlInnerParser.Stmt_rollbackContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#plsql_opt_transaction_chain}.
	 * @param ctx the parse tree
	 */
	void enterPlsql_opt_transaction_chain(PostgreSQLPlpgsqlInnerParser.Plsql_opt_transaction_chainContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#plsql_opt_transaction_chain}.
	 * @param ctx the parse tree
	 */
	void exitPlsql_opt_transaction_chain(PostgreSQLPlpgsqlInnerParser.Plsql_opt_transaction_chainContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmt_set}.
	 * @param ctx the parse tree
	 */
	void enterStmt_set(PostgreSQLPlpgsqlInnerParser.Stmt_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmt_set}.
	 * @param ctx the parse tree
	 */
	void exitStmt_set(PostgreSQLPlpgsqlInnerParser.Stmt_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#cursor_variable}.
	 * @param ctx the parse tree
	 */
	void enterCursor_variable(PostgreSQLPlpgsqlInnerParser.Cursor_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#cursor_variable}.
	 * @param ctx the parse tree
	 */
	void exitCursor_variable(PostgreSQLPlpgsqlInnerParser.Cursor_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#exception_sect}.
	 * @param ctx the parse tree
	 */
	void enterException_sect(PostgreSQLPlpgsqlInnerParser.Exception_sectContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#exception_sect}.
	 * @param ctx the parse tree
	 */
	void exitException_sect(PostgreSQLPlpgsqlInnerParser.Exception_sectContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#proc_exceptions}.
	 * @param ctx the parse tree
	 */
	void enterProc_exceptions(PostgreSQLPlpgsqlInnerParser.Proc_exceptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#proc_exceptions}.
	 * @param ctx the parse tree
	 */
	void exitProc_exceptions(PostgreSQLPlpgsqlInnerParser.Proc_exceptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#proc_exception}.
	 * @param ctx the parse tree
	 */
	void enterProc_exception(PostgreSQLPlpgsqlInnerParser.Proc_exceptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#proc_exception}.
	 * @param ctx the parse tree
	 */
	void exitProc_exception(PostgreSQLPlpgsqlInnerParser.Proc_exceptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#proc_conditions}.
	 * @param ctx the parse tree
	 */
	void enterProc_conditions(PostgreSQLPlpgsqlInnerParser.Proc_conditionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#proc_conditions}.
	 * @param ctx the parse tree
	 */
	void exitProc_conditions(PostgreSQLPlpgsqlInnerParser.Proc_conditionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#proc_condition}.
	 * @param ctx the parse tree
	 */
	void enterProc_condition(PostgreSQLPlpgsqlInnerParser.Proc_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#proc_condition}.
	 * @param ctx the parse tree
	 */
	void exitProc_condition(PostgreSQLPlpgsqlInnerParser.Proc_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_block_label}.
	 * @param ctx the parse tree
	 */
	void enterOpt_block_label(PostgreSQLPlpgsqlInnerParser.Opt_block_labelContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_block_label}.
	 * @param ctx the parse tree
	 */
	void exitOpt_block_label(PostgreSQLPlpgsqlInnerParser.Opt_block_labelContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_loop_label}.
	 * @param ctx the parse tree
	 */
	void enterOpt_loop_label(PostgreSQLPlpgsqlInnerParser.Opt_loop_labelContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_loop_label}.
	 * @param ctx the parse tree
	 */
	void exitOpt_loop_label(PostgreSQLPlpgsqlInnerParser.Opt_loop_labelContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_label}.
	 * @param ctx the parse tree
	 */
	void enterOpt_label(PostgreSQLPlpgsqlInnerParser.Opt_labelContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_label}.
	 * @param ctx the parse tree
	 */
	void exitOpt_label(PostgreSQLPlpgsqlInnerParser.Opt_labelContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_exitcond}.
	 * @param ctx the parse tree
	 */
	void enterOpt_exitcond(PostgreSQLPlpgsqlInnerParser.Opt_exitcondContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_exitcond}.
	 * @param ctx the parse tree
	 */
	void exitOpt_exitcond(PostgreSQLPlpgsqlInnerParser.Opt_exitcondContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#any_identifier}.
	 * @param ctx the parse tree
	 */
	void enterAny_identifier(PostgreSQLPlpgsqlInnerParser.Any_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#any_identifier}.
	 * @param ctx the parse tree
	 */
	void exitAny_identifier(PostgreSQLPlpgsqlInnerParser.Any_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#plsql_unreserved_keyword}.
	 * @param ctx the parse tree
	 */
	void enterPlsql_unreserved_keyword(PostgreSQLPlpgsqlInnerParser.Plsql_unreserved_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#plsql_unreserved_keyword}.
	 * @param ctx the parse tree
	 */
	void exitPlsql_unreserved_keyword(PostgreSQLPlpgsqlInnerParser.Plsql_unreserved_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#sql_expression}.
	 * @param ctx the parse tree
	 */
	void enterSql_expression(PostgreSQLPlpgsqlInnerParser.Sql_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#sql_expression}.
	 * @param ctx the parse tree
	 */
	void exitSql_expression(PostgreSQLPlpgsqlInnerParser.Sql_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#expr_until_then}.
	 * @param ctx the parse tree
	 */
	void enterExpr_until_then(PostgreSQLPlpgsqlInnerParser.Expr_until_thenContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#expr_until_then}.
	 * @param ctx the parse tree
	 */
	void exitExpr_until_then(PostgreSQLPlpgsqlInnerParser.Expr_until_thenContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#expr_until_semi}.
	 * @param ctx the parse tree
	 */
	void enterExpr_until_semi(PostgreSQLPlpgsqlInnerParser.Expr_until_semiContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#expr_until_semi}.
	 * @param ctx the parse tree
	 */
	void exitExpr_until_semi(PostgreSQLPlpgsqlInnerParser.Expr_until_semiContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#expr_until_rightbracket}.
	 * @param ctx the parse tree
	 */
	void enterExpr_until_rightbracket(PostgreSQLPlpgsqlInnerParser.Expr_until_rightbracketContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#expr_until_rightbracket}.
	 * @param ctx the parse tree
	 */
	void exitExpr_until_rightbracket(PostgreSQLPlpgsqlInnerParser.Expr_until_rightbracketContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#expr_until_loop}.
	 * @param ctx the parse tree
	 */
	void enterExpr_until_loop(PostgreSQLPlpgsqlInnerParser.Expr_until_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#expr_until_loop}.
	 * @param ctx the parse tree
	 */
	void exitExpr_until_loop(PostgreSQLPlpgsqlInnerParser.Expr_until_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#make_execsql_stmt}.
	 * @param ctx the parse tree
	 */
	void enterMake_execsql_stmt(PostgreSQLPlpgsqlInnerParser.Make_execsql_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#make_execsql_stmt}.
	 * @param ctx the parse tree
	 */
	void exitMake_execsql_stmt(PostgreSQLPlpgsqlInnerParser.Make_execsql_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_returning_clause_into}.
	 * @param ctx the parse tree
	 */
	void enterOpt_returning_clause_into(PostgreSQLPlpgsqlInnerParser.Opt_returning_clause_intoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_returning_clause_into}.
	 * @param ctx the parse tree
	 */
	void exitOpt_returning_clause_into(PostgreSQLPlpgsqlInnerParser.Opt_returning_clause_intoContext ctx);
}