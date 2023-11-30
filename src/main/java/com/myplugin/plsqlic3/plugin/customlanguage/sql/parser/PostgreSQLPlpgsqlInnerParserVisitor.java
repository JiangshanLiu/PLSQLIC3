// Generated from java-escape by ANTLR 4.11.1
package com.myplugin.plsqlic3.plugin.customlanguage.sql.parser;


import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PostgreSQLPlpgsqlInnerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PostgreSQLPlpgsqlInnerParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(PostgreSQLPlpgsqlInnerParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#plsqlroot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlsqlroot(PostgreSQLPlpgsqlInnerParser.PlsqlrootContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmtblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtblock(PostgreSQLPlpgsqlInnerParser.StmtblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmtmulti}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtmulti(PostgreSQLPlpgsqlInnerParser.StmtmultiContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(PostgreSQLPlpgsqlInnerParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#plsqlconsolecommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlsqlconsolecommand(PostgreSQLPlpgsqlInnerParser.PlsqlconsolecommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#callstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallstmt(PostgreSQLPlpgsqlInnerParser.CallstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createrolestmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreaterolestmt(PostgreSQLPlpgsqlInnerParser.CreaterolestmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_with}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_with(PostgreSQLPlpgsqlInnerParser.Opt_withContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#optrolelist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptrolelist(PostgreSQLPlpgsqlInnerParser.OptrolelistContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alteroptrolelist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlteroptrolelist(PostgreSQLPlpgsqlInnerParser.AlteroptrolelistContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alteroptroleelem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlteroptroleelem(PostgreSQLPlpgsqlInnerParser.AlteroptroleelemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createoptroleelem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateoptroleelem(PostgreSQLPlpgsqlInnerParser.CreateoptroleelemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createuserstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateuserstmt(PostgreSQLPlpgsqlInnerParser.CreateuserstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alterrolestmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterrolestmt(PostgreSQLPlpgsqlInnerParser.AlterrolestmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_in_database}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_in_database(PostgreSQLPlpgsqlInnerParser.Opt_in_databaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alterrolesetstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterrolesetstmt(PostgreSQLPlpgsqlInnerParser.AlterrolesetstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#droprolestmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDroprolestmt(PostgreSQLPlpgsqlInnerParser.DroprolestmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#creategroupstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreategroupstmt(PostgreSQLPlpgsqlInnerParser.CreategroupstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#altergroupstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAltergroupstmt(PostgreSQLPlpgsqlInnerParser.AltergroupstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#add_drop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_drop(PostgreSQLPlpgsqlInnerParser.Add_dropContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createschemastmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateschemastmt(PostgreSQLPlpgsqlInnerParser.CreateschemastmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#optschemaname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptschemaname(PostgreSQLPlpgsqlInnerParser.OptschemanameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#optschemaeltlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptschemaeltlist(PostgreSQLPlpgsqlInnerParser.OptschemaeltlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#schema_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchema_stmt(PostgreSQLPlpgsqlInnerParser.Schema_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#variablesetstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariablesetstmt(PostgreSQLPlpgsqlInnerParser.VariablesetstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#set_rest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_rest(PostgreSQLPlpgsqlInnerParser.Set_restContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#generic_set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_set(PostgreSQLPlpgsqlInnerParser.Generic_setContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#set_rest_more}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_rest_more(PostgreSQLPlpgsqlInnerParser.Set_rest_moreContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#var_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_name(PostgreSQLPlpgsqlInnerParser.Var_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#var_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_list(PostgreSQLPlpgsqlInnerParser.Var_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#var_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_value(PostgreSQLPlpgsqlInnerParser.Var_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#iso_level}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIso_level(PostgreSQLPlpgsqlInnerParser.Iso_levelContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_boolean_or_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_boolean_or_string(PostgreSQLPlpgsqlInnerParser.Opt_boolean_or_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#zone_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZone_value(PostgreSQLPlpgsqlInnerParser.Zone_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_encoding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_encoding(PostgreSQLPlpgsqlInnerParser.Opt_encodingContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#nonreservedword_or_sconst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonreservedword_or_sconst(PostgreSQLPlpgsqlInnerParser.Nonreservedword_or_sconstContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#variableresetstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableresetstmt(PostgreSQLPlpgsqlInnerParser.VariableresetstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#reset_rest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReset_rest(PostgreSQLPlpgsqlInnerParser.Reset_restContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#generic_reset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_reset(PostgreSQLPlpgsqlInnerParser.Generic_resetContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#setresetclause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetresetclause(PostgreSQLPlpgsqlInnerParser.SetresetclauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#functionsetresetclause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionsetresetclause(PostgreSQLPlpgsqlInnerParser.FunctionsetresetclauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#variableshowstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableshowstmt(PostgreSQLPlpgsqlInnerParser.VariableshowstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#constraintssetstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintssetstmt(PostgreSQLPlpgsqlInnerParser.ConstraintssetstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#constraints_set_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraints_set_list(PostgreSQLPlpgsqlInnerParser.Constraints_set_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#constraints_set_mode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraints_set_mode(PostgreSQLPlpgsqlInnerParser.Constraints_set_modeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#checkpointstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckpointstmt(PostgreSQLPlpgsqlInnerParser.CheckpointstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#discardstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiscardstmt(PostgreSQLPlpgsqlInnerParser.DiscardstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#altertablestmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAltertablestmt(PostgreSQLPlpgsqlInnerParser.AltertablestmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alter_table_cmds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_cmds(PostgreSQLPlpgsqlInnerParser.Alter_table_cmdsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#partition_cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartition_cmd(PostgreSQLPlpgsqlInnerParser.Partition_cmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#index_partition_cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_partition_cmd(PostgreSQLPlpgsqlInnerParser.Index_partition_cmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alter_table_cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_cmd(PostgreSQLPlpgsqlInnerParser.Alter_table_cmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alter_column_default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_column_default(PostgreSQLPlpgsqlInnerParser.Alter_column_defaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_drop_behavior}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_drop_behavior(PostgreSQLPlpgsqlInnerParser.Opt_drop_behaviorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_collate_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_collate_clause(PostgreSQLPlpgsqlInnerParser.Opt_collate_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alter_using}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_using(PostgreSQLPlpgsqlInnerParser.Alter_usingContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#replica_identity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReplica_identity(PostgreSQLPlpgsqlInnerParser.Replica_identityContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#reloptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReloptions(PostgreSQLPlpgsqlInnerParser.ReloptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_reloptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_reloptions(PostgreSQLPlpgsqlInnerParser.Opt_reloptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#reloption_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReloption_list(PostgreSQLPlpgsqlInnerParser.Reloption_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#reloption_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReloption_elem(PostgreSQLPlpgsqlInnerParser.Reloption_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alter_identity_column_option_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_identity_column_option_list(PostgreSQLPlpgsqlInnerParser.Alter_identity_column_option_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alter_identity_column_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_identity_column_option(PostgreSQLPlpgsqlInnerParser.Alter_identity_column_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#partitionboundspec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionboundspec(PostgreSQLPlpgsqlInnerParser.PartitionboundspecContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#hash_partbound_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHash_partbound_elem(PostgreSQLPlpgsqlInnerParser.Hash_partbound_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#hash_partbound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHash_partbound(PostgreSQLPlpgsqlInnerParser.Hash_partboundContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#altercompositetypestmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAltercompositetypestmt(PostgreSQLPlpgsqlInnerParser.AltercompositetypestmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alter_type_cmds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_type_cmds(PostgreSQLPlpgsqlInnerParser.Alter_type_cmdsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alter_type_cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_type_cmd(PostgreSQLPlpgsqlInnerParser.Alter_type_cmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#closeportalstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloseportalstmt(PostgreSQLPlpgsqlInnerParser.CloseportalstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#copystmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopystmt(PostgreSQLPlpgsqlInnerParser.CopystmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#copy_from}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_from(PostgreSQLPlpgsqlInnerParser.Copy_fromContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_program(PostgreSQLPlpgsqlInnerParser.Opt_programContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#copy_file_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_file_name(PostgreSQLPlpgsqlInnerParser.Copy_file_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#copy_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_options(PostgreSQLPlpgsqlInnerParser.Copy_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#copy_opt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_opt_list(PostgreSQLPlpgsqlInnerParser.Copy_opt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#copy_opt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_opt_item(PostgreSQLPlpgsqlInnerParser.Copy_opt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_binary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_binary(PostgreSQLPlpgsqlInnerParser.Opt_binaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#copy_delimiter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_delimiter(PostgreSQLPlpgsqlInnerParser.Copy_delimiterContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_using}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_using(PostgreSQLPlpgsqlInnerParser.Opt_usingContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#copy_generic_opt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_generic_opt_list(PostgreSQLPlpgsqlInnerParser.Copy_generic_opt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#copy_generic_opt_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_generic_opt_elem(PostgreSQLPlpgsqlInnerParser.Copy_generic_opt_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#copy_generic_opt_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_generic_opt_arg(PostgreSQLPlpgsqlInnerParser.Copy_generic_opt_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#copy_generic_opt_arg_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_generic_opt_arg_list(PostgreSQLPlpgsqlInnerParser.Copy_generic_opt_arg_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#copy_generic_opt_arg_list_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_generic_opt_arg_list_item(PostgreSQLPlpgsqlInnerParser.Copy_generic_opt_arg_list_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatestmt(PostgreSQLPlpgsqlInnerParser.CreatestmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opttemp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpttemp(PostgreSQLPlpgsqlInnerParser.OpttempContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opttableelementlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpttableelementlist(PostgreSQLPlpgsqlInnerParser.OpttableelementlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opttypedtableelementlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpttypedtableelementlist(PostgreSQLPlpgsqlInnerParser.OpttypedtableelementlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#tableelementlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableelementlist(PostgreSQLPlpgsqlInnerParser.TableelementlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#typedtableelementlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedtableelementlist(PostgreSQLPlpgsqlInnerParser.TypedtableelementlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#tableelement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableelement(PostgreSQLPlpgsqlInnerParser.TableelementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#typedtableelement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedtableelement(PostgreSQLPlpgsqlInnerParser.TypedtableelementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#columnDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnDef(PostgreSQLPlpgsqlInnerParser.ColumnDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#columnOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnOptions(PostgreSQLPlpgsqlInnerParser.ColumnOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#colquallist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColquallist(PostgreSQLPlpgsqlInnerParser.ColquallistContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#colconstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColconstraint(PostgreSQLPlpgsqlInnerParser.ColconstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#colconstraintelem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColconstraintelem(PostgreSQLPlpgsqlInnerParser.ColconstraintelemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#generated_when}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenerated_when(PostgreSQLPlpgsqlInnerParser.Generated_whenContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#constraintattr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintattr(PostgreSQLPlpgsqlInnerParser.ConstraintattrContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#tablelikeclause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablelikeclause(PostgreSQLPlpgsqlInnerParser.TablelikeclauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#tablelikeoptionlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablelikeoptionlist(PostgreSQLPlpgsqlInnerParser.TablelikeoptionlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#tablelikeoption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablelikeoption(PostgreSQLPlpgsqlInnerParser.TablelikeoptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#tableconstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableconstraint(PostgreSQLPlpgsqlInnerParser.TableconstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#constraintelem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintelem(PostgreSQLPlpgsqlInnerParser.ConstraintelemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_no_inherit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_no_inherit(PostgreSQLPlpgsqlInnerParser.Opt_no_inheritContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_column_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_column_list(PostgreSQLPlpgsqlInnerParser.Opt_column_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#columnlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnlist(PostgreSQLPlpgsqlInnerParser.ColumnlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#columnElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnElem(PostgreSQLPlpgsqlInnerParser.ColumnElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_c_include}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_c_include(PostgreSQLPlpgsqlInnerParser.Opt_c_includeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#key_match}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey_match(PostgreSQLPlpgsqlInnerParser.Key_matchContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#exclusionconstraintlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusionconstraintlist(PostgreSQLPlpgsqlInnerParser.ExclusionconstraintlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#exclusionconstraintelem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusionconstraintelem(PostgreSQLPlpgsqlInnerParser.ExclusionconstraintelemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#exclusionwhereclause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusionwhereclause(PostgreSQLPlpgsqlInnerParser.ExclusionwhereclauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#key_actions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey_actions(PostgreSQLPlpgsqlInnerParser.Key_actionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#key_update}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey_update(PostgreSQLPlpgsqlInnerParser.Key_updateContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#key_delete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey_delete(PostgreSQLPlpgsqlInnerParser.Key_deleteContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#key_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey_action(PostgreSQLPlpgsqlInnerParser.Key_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#optinherit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptinherit(PostgreSQLPlpgsqlInnerParser.OptinheritContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#optpartitionspec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptpartitionspec(PostgreSQLPlpgsqlInnerParser.OptpartitionspecContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#partitionspec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionspec(PostgreSQLPlpgsqlInnerParser.PartitionspecContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#part_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPart_params(PostgreSQLPlpgsqlInnerParser.Part_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#part_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPart_elem(PostgreSQLPlpgsqlInnerParser.Part_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#table_access_method_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_access_method_clause(PostgreSQLPlpgsqlInnerParser.Table_access_method_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#optwith}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptwith(PostgreSQLPlpgsqlInnerParser.OptwithContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#oncommitoption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOncommitoption(PostgreSQLPlpgsqlInnerParser.OncommitoptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opttablespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpttablespace(PostgreSQLPlpgsqlInnerParser.OpttablespaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#optconstablespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptconstablespace(PostgreSQLPlpgsqlInnerParser.OptconstablespaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#existingindex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExistingindex(PostgreSQLPlpgsqlInnerParser.ExistingindexContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createstatsstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatestatsstmt(PostgreSQLPlpgsqlInnerParser.CreatestatsstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alterstatsstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterstatsstmt(PostgreSQLPlpgsqlInnerParser.AlterstatsstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createasstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateasstmt(PostgreSQLPlpgsqlInnerParser.CreateasstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#create_as_target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_as_target(PostgreSQLPlpgsqlInnerParser.Create_as_targetContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_with_data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_with_data(PostgreSQLPlpgsqlInnerParser.Opt_with_dataContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#creatematviewstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatematviewstmt(PostgreSQLPlpgsqlInnerParser.CreatematviewstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#create_mv_target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_mv_target(PostgreSQLPlpgsqlInnerParser.Create_mv_targetContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#optnolog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptnolog(PostgreSQLPlpgsqlInnerParser.OptnologContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#refreshmatviewstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefreshmatviewstmt(PostgreSQLPlpgsqlInnerParser.RefreshmatviewstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createseqstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateseqstmt(PostgreSQLPlpgsqlInnerParser.CreateseqstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alterseqstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterseqstmt(PostgreSQLPlpgsqlInnerParser.AlterseqstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#optseqoptlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptseqoptlist(PostgreSQLPlpgsqlInnerParser.OptseqoptlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#optparenthesizedseqoptlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptparenthesizedseqoptlist(PostgreSQLPlpgsqlInnerParser.OptparenthesizedseqoptlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#seqoptlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeqoptlist(PostgreSQLPlpgsqlInnerParser.SeqoptlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#seqoptelem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeqoptelem(PostgreSQLPlpgsqlInnerParser.SeqoptelemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_by}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_by(PostgreSQLPlpgsqlInnerParser.Opt_byContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#numericonly}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericonly(PostgreSQLPlpgsqlInnerParser.NumericonlyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#numericonly_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericonly_list(PostgreSQLPlpgsqlInnerParser.Numericonly_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createplangstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateplangstmt(PostgreSQLPlpgsqlInnerParser.CreateplangstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_trusted}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_trusted(PostgreSQLPlpgsqlInnerParser.Opt_trustedContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#handler_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandler_name(PostgreSQLPlpgsqlInnerParser.Handler_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_inline_handler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_inline_handler(PostgreSQLPlpgsqlInnerParser.Opt_inline_handlerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#validator_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValidator_clause(PostgreSQLPlpgsqlInnerParser.Validator_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_validator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_validator(PostgreSQLPlpgsqlInnerParser.Opt_validatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_procedural}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_procedural(PostgreSQLPlpgsqlInnerParser.Opt_proceduralContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createtablespacestmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatetablespacestmt(PostgreSQLPlpgsqlInnerParser.CreatetablespacestmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opttablespaceowner}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpttablespaceowner(PostgreSQLPlpgsqlInnerParser.OpttablespaceownerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#droptablespacestmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDroptablespacestmt(PostgreSQLPlpgsqlInnerParser.DroptablespacestmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createextensionstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateextensionstmt(PostgreSQLPlpgsqlInnerParser.CreateextensionstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#create_extension_opt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_extension_opt_list(PostgreSQLPlpgsqlInnerParser.Create_extension_opt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#create_extension_opt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_extension_opt_item(PostgreSQLPlpgsqlInnerParser.Create_extension_opt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alterextensionstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterextensionstmt(PostgreSQLPlpgsqlInnerParser.AlterextensionstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alter_extension_opt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_extension_opt_list(PostgreSQLPlpgsqlInnerParser.Alter_extension_opt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alter_extension_opt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_extension_opt_item(PostgreSQLPlpgsqlInnerParser.Alter_extension_opt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alterextensioncontentsstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterextensioncontentsstmt(PostgreSQLPlpgsqlInnerParser.AlterextensioncontentsstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createfdwstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatefdwstmt(PostgreSQLPlpgsqlInnerParser.CreatefdwstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#fdw_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFdw_option(PostgreSQLPlpgsqlInnerParser.Fdw_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#fdw_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFdw_options(PostgreSQLPlpgsqlInnerParser.Fdw_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_fdw_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_fdw_options(PostgreSQLPlpgsqlInnerParser.Opt_fdw_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alterfdwstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterfdwstmt(PostgreSQLPlpgsqlInnerParser.AlterfdwstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#create_generic_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_generic_options(PostgreSQLPlpgsqlInnerParser.Create_generic_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#generic_option_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_option_list(PostgreSQLPlpgsqlInnerParser.Generic_option_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alter_generic_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_generic_options(PostgreSQLPlpgsqlInnerParser.Alter_generic_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alter_generic_option_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_generic_option_list(PostgreSQLPlpgsqlInnerParser.Alter_generic_option_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alter_generic_option_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_generic_option_elem(PostgreSQLPlpgsqlInnerParser.Alter_generic_option_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#generic_option_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_option_elem(PostgreSQLPlpgsqlInnerParser.Generic_option_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#generic_option_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_option_name(PostgreSQLPlpgsqlInnerParser.Generic_option_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#generic_option_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_option_arg(PostgreSQLPlpgsqlInnerParser.Generic_option_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createforeignserverstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateforeignserverstmt(PostgreSQLPlpgsqlInnerParser.CreateforeignserverstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_type(PostgreSQLPlpgsqlInnerParser.Opt_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#foreign_server_version}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeign_server_version(PostgreSQLPlpgsqlInnerParser.Foreign_server_versionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_foreign_server_version}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_foreign_server_version(PostgreSQLPlpgsqlInnerParser.Opt_foreign_server_versionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alterforeignserverstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterforeignserverstmt(PostgreSQLPlpgsqlInnerParser.AlterforeignserverstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createforeigntablestmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateforeigntablestmt(PostgreSQLPlpgsqlInnerParser.CreateforeigntablestmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#importforeignschemastmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportforeignschemastmt(PostgreSQLPlpgsqlInnerParser.ImportforeignschemastmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#import_qualification_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_qualification_type(PostgreSQLPlpgsqlInnerParser.Import_qualification_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#import_qualification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_qualification(PostgreSQLPlpgsqlInnerParser.Import_qualificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createusermappingstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateusermappingstmt(PostgreSQLPlpgsqlInnerParser.CreateusermappingstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#auth_ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuth_ident(PostgreSQLPlpgsqlInnerParser.Auth_identContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#dropusermappingstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropusermappingstmt(PostgreSQLPlpgsqlInnerParser.DropusermappingstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alterusermappingstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterusermappingstmt(PostgreSQLPlpgsqlInnerParser.AlterusermappingstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createpolicystmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatepolicystmt(PostgreSQLPlpgsqlInnerParser.CreatepolicystmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alterpolicystmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterpolicystmt(PostgreSQLPlpgsqlInnerParser.AlterpolicystmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#rowsecurityoptionalexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowsecurityoptionalexpr(PostgreSQLPlpgsqlInnerParser.RowsecurityoptionalexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#rowsecurityoptionalwithcheck}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowsecurityoptionalwithcheck(PostgreSQLPlpgsqlInnerParser.RowsecurityoptionalwithcheckContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#rowsecuritydefaulttorole}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowsecuritydefaulttorole(PostgreSQLPlpgsqlInnerParser.RowsecuritydefaulttoroleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#rowsecurityoptionaltorole}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowsecurityoptionaltorole(PostgreSQLPlpgsqlInnerParser.RowsecurityoptionaltoroleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#rowsecuritydefaultpermissive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowsecuritydefaultpermissive(PostgreSQLPlpgsqlInnerParser.RowsecuritydefaultpermissiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#rowsecuritydefaultforcmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowsecuritydefaultforcmd(PostgreSQLPlpgsqlInnerParser.RowsecuritydefaultforcmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#row_security_cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow_security_cmd(PostgreSQLPlpgsqlInnerParser.Row_security_cmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createamstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateamstmt(PostgreSQLPlpgsqlInnerParser.CreateamstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#am_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAm_type(PostgreSQLPlpgsqlInnerParser.Am_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createtrigstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatetrigstmt(PostgreSQLPlpgsqlInnerParser.CreatetrigstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#triggeractiontime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggeractiontime(PostgreSQLPlpgsqlInnerParser.TriggeractiontimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#triggerevents}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerevents(PostgreSQLPlpgsqlInnerParser.TriggereventsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#triggeroneevent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggeroneevent(PostgreSQLPlpgsqlInnerParser.TriggeroneeventContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#triggerreferencing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerreferencing(PostgreSQLPlpgsqlInnerParser.TriggerreferencingContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#triggertransitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggertransitions(PostgreSQLPlpgsqlInnerParser.TriggertransitionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#triggertransition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggertransition(PostgreSQLPlpgsqlInnerParser.TriggertransitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#transitionoldornew}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransitionoldornew(PostgreSQLPlpgsqlInnerParser.TransitionoldornewContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#transitionrowortable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransitionrowortable(PostgreSQLPlpgsqlInnerParser.TransitionrowortableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#transitionrelname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransitionrelname(PostgreSQLPlpgsqlInnerParser.TransitionrelnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#triggerforspec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerforspec(PostgreSQLPlpgsqlInnerParser.TriggerforspecContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#triggerforopteach}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerforopteach(PostgreSQLPlpgsqlInnerParser.TriggerforopteachContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#triggerfortype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerfortype(PostgreSQLPlpgsqlInnerParser.TriggerfortypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#triggerwhen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerwhen(PostgreSQLPlpgsqlInnerParser.TriggerwhenContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#function_or_procedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_or_procedure(PostgreSQLPlpgsqlInnerParser.Function_or_procedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#triggerfuncargs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerfuncargs(PostgreSQLPlpgsqlInnerParser.TriggerfuncargsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#triggerfuncarg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerfuncarg(PostgreSQLPlpgsqlInnerParser.TriggerfuncargContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#optconstrfromtable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptconstrfromtable(PostgreSQLPlpgsqlInnerParser.OptconstrfromtableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#constraintattributespec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintattributespec(PostgreSQLPlpgsqlInnerParser.ConstraintattributespecContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#constraintattributeElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintattributeElem(PostgreSQLPlpgsqlInnerParser.ConstraintattributeElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createeventtrigstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateeventtrigstmt(PostgreSQLPlpgsqlInnerParser.CreateeventtrigstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#event_trigger_when_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent_trigger_when_list(PostgreSQLPlpgsqlInnerParser.Event_trigger_when_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#event_trigger_when_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent_trigger_when_item(PostgreSQLPlpgsqlInnerParser.Event_trigger_when_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#event_trigger_value_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent_trigger_value_list(PostgreSQLPlpgsqlInnerParser.Event_trigger_value_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#altereventtrigstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAltereventtrigstmt(PostgreSQLPlpgsqlInnerParser.AltereventtrigstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#enable_trigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnable_trigger(PostgreSQLPlpgsqlInnerParser.Enable_triggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createassertionstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateassertionstmt(PostgreSQLPlpgsqlInnerParser.CreateassertionstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#definestmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinestmt(PostgreSQLPlpgsqlInnerParser.DefinestmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition(PostgreSQLPlpgsqlInnerParser.DefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#def_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_list(PostgreSQLPlpgsqlInnerParser.Def_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#def_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_elem(PostgreSQLPlpgsqlInnerParser.Def_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#def_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_arg(PostgreSQLPlpgsqlInnerParser.Def_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#old_aggr_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOld_aggr_definition(PostgreSQLPlpgsqlInnerParser.Old_aggr_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#old_aggr_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOld_aggr_list(PostgreSQLPlpgsqlInnerParser.Old_aggr_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#old_aggr_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOld_aggr_elem(PostgreSQLPlpgsqlInnerParser.Old_aggr_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_enum_val_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_enum_val_list(PostgreSQLPlpgsqlInnerParser.Opt_enum_val_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#enum_val_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_val_list(PostgreSQLPlpgsqlInnerParser.Enum_val_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alterenumstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterenumstmt(PostgreSQLPlpgsqlInnerParser.AlterenumstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_if_not_exists}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_if_not_exists(PostgreSQLPlpgsqlInnerParser.Opt_if_not_existsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createopclassstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateopclassstmt(PostgreSQLPlpgsqlInnerParser.CreateopclassstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opclass_item_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpclass_item_list(PostgreSQLPlpgsqlInnerParser.Opclass_item_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opclass_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpclass_item(PostgreSQLPlpgsqlInnerParser.Opclass_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_default(PostgreSQLPlpgsqlInnerParser.Opt_defaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_opfamily}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_opfamily(PostgreSQLPlpgsqlInnerParser.Opt_opfamilyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opclass_purpose}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpclass_purpose(PostgreSQLPlpgsqlInnerParser.Opclass_purposeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_recheck}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_recheck(PostgreSQLPlpgsqlInnerParser.Opt_recheckContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createopfamilystmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateopfamilystmt(PostgreSQLPlpgsqlInnerParser.CreateopfamilystmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alteropfamilystmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlteropfamilystmt(PostgreSQLPlpgsqlInnerParser.AlteropfamilystmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opclass_drop_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpclass_drop_list(PostgreSQLPlpgsqlInnerParser.Opclass_drop_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opclass_drop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpclass_drop(PostgreSQLPlpgsqlInnerParser.Opclass_dropContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#dropopclassstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropopclassstmt(PostgreSQLPlpgsqlInnerParser.DropopclassstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#dropopfamilystmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropopfamilystmt(PostgreSQLPlpgsqlInnerParser.DropopfamilystmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#dropownedstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropownedstmt(PostgreSQLPlpgsqlInnerParser.DropownedstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#reassignownedstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReassignownedstmt(PostgreSQLPlpgsqlInnerParser.ReassignownedstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#dropstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropstmt(PostgreSQLPlpgsqlInnerParser.DropstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#object_type_any_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_type_any_name(PostgreSQLPlpgsqlInnerParser.Object_type_any_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#object_type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_type_name(PostgreSQLPlpgsqlInnerParser.Object_type_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#drop_type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_type_name(PostgreSQLPlpgsqlInnerParser.Drop_type_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#object_type_name_on_any_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_type_name_on_any_name(PostgreSQLPlpgsqlInnerParser.Object_type_name_on_any_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#any_name_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_name_list(PostgreSQLPlpgsqlInnerParser.Any_name_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#any_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_name(PostgreSQLPlpgsqlInnerParser.Any_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#attrs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrs(PostgreSQLPlpgsqlInnerParser.AttrsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#type_name_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_name_list(PostgreSQLPlpgsqlInnerParser.Type_name_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#truncatestmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruncatestmt(PostgreSQLPlpgsqlInnerParser.TruncatestmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_restart_seqs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_restart_seqs(PostgreSQLPlpgsqlInnerParser.Opt_restart_seqsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#commentstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommentstmt(PostgreSQLPlpgsqlInnerParser.CommentstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#comment_text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment_text(PostgreSQLPlpgsqlInnerParser.Comment_textContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#seclabelstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeclabelstmt(PostgreSQLPlpgsqlInnerParser.SeclabelstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_provider}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_provider(PostgreSQLPlpgsqlInnerParser.Opt_providerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#security_label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecurity_label(PostgreSQLPlpgsqlInnerParser.Security_labelContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#fetchstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFetchstmt(PostgreSQLPlpgsqlInnerParser.FetchstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#fetch_args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFetch_args(PostgreSQLPlpgsqlInnerParser.Fetch_argsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#from_in}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_in(PostgreSQLPlpgsqlInnerParser.From_inContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_from_in}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_from_in(PostgreSQLPlpgsqlInnerParser.Opt_from_inContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#grantstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantstmt(PostgreSQLPlpgsqlInnerParser.GrantstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#revokestmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevokestmt(PostgreSQLPlpgsqlInnerParser.RevokestmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#privileges}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivileges(PostgreSQLPlpgsqlInnerParser.PrivilegesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#privilege_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivilege_list(PostgreSQLPlpgsqlInnerParser.Privilege_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#privilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivilege(PostgreSQLPlpgsqlInnerParser.PrivilegeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#privilege_target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivilege_target(PostgreSQLPlpgsqlInnerParser.Privilege_targetContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#grantee_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantee_list(PostgreSQLPlpgsqlInnerParser.Grantee_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#grantee}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantee(PostgreSQLPlpgsqlInnerParser.GranteeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_grant_grant_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_grant_grant_option(PostgreSQLPlpgsqlInnerParser.Opt_grant_grant_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#grantrolestmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantrolestmt(PostgreSQLPlpgsqlInnerParser.GrantrolestmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#revokerolestmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevokerolestmt(PostgreSQLPlpgsqlInnerParser.RevokerolestmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_grant_admin_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_grant_admin_option(PostgreSQLPlpgsqlInnerParser.Opt_grant_admin_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_granted_by}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_granted_by(PostgreSQLPlpgsqlInnerParser.Opt_granted_byContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alterdefaultprivilegesstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterdefaultprivilegesstmt(PostgreSQLPlpgsqlInnerParser.AlterdefaultprivilegesstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#defacloptionlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefacloptionlist(PostgreSQLPlpgsqlInnerParser.DefacloptionlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#defacloption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefacloption(PostgreSQLPlpgsqlInnerParser.DefacloptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#defaclaction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaclaction(PostgreSQLPlpgsqlInnerParser.DefaclactionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#defacl_privilege_target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefacl_privilege_target(PostgreSQLPlpgsqlInnerParser.Defacl_privilege_targetContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#indexstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexstmt(PostgreSQLPlpgsqlInnerParser.IndexstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_unique}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_unique(PostgreSQLPlpgsqlInnerParser.Opt_uniqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_concurrently}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_concurrently(PostgreSQLPlpgsqlInnerParser.Opt_concurrentlyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_index_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_index_name(PostgreSQLPlpgsqlInnerParser.Opt_index_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#access_method_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccess_method_clause(PostgreSQLPlpgsqlInnerParser.Access_method_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#index_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_params(PostgreSQLPlpgsqlInnerParser.Index_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#index_elem_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_elem_options(PostgreSQLPlpgsqlInnerParser.Index_elem_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#index_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_elem(PostgreSQLPlpgsqlInnerParser.Index_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_include}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_include(PostgreSQLPlpgsqlInnerParser.Opt_includeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#index_including_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_including_params(PostgreSQLPlpgsqlInnerParser.Index_including_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_collate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_collate(PostgreSQLPlpgsqlInnerParser.Opt_collateContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_class(PostgreSQLPlpgsqlInnerParser.Opt_classContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_asc_desc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_asc_desc(PostgreSQLPlpgsqlInnerParser.Opt_asc_descContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_nulls_order}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_nulls_order(PostgreSQLPlpgsqlInnerParser.Opt_nulls_orderContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createfunctionstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatefunctionstmt(PostgreSQLPlpgsqlInnerParser.CreatefunctionstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_or_replace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_or_replace(PostgreSQLPlpgsqlInnerParser.Opt_or_replaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#func_args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_args(PostgreSQLPlpgsqlInnerParser.Func_argsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#func_args_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_args_list(PostgreSQLPlpgsqlInnerParser.Func_args_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#function_with_argtypes_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_with_argtypes_list(PostgreSQLPlpgsqlInnerParser.Function_with_argtypes_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#function_with_argtypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_with_argtypes(PostgreSQLPlpgsqlInnerParser.Function_with_argtypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#func_args_with_defaults}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_args_with_defaults(PostgreSQLPlpgsqlInnerParser.Func_args_with_defaultsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#func_args_with_defaults_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_args_with_defaults_list(PostgreSQLPlpgsqlInnerParser.Func_args_with_defaults_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#func_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_arg(PostgreSQLPlpgsqlInnerParser.Func_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#arg_class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg_class(PostgreSQLPlpgsqlInnerParser.Arg_classContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#param_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_name(PostgreSQLPlpgsqlInnerParser.Param_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#func_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_return(PostgreSQLPlpgsqlInnerParser.Func_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#func_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_type(PostgreSQLPlpgsqlInnerParser.Func_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#func_arg_with_default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_arg_with_default(PostgreSQLPlpgsqlInnerParser.Func_arg_with_defaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#aggr_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggr_arg(PostgreSQLPlpgsqlInnerParser.Aggr_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#aggr_args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggr_args(PostgreSQLPlpgsqlInnerParser.Aggr_argsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#aggr_args_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggr_args_list(PostgreSQLPlpgsqlInnerParser.Aggr_args_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#aggregate_with_argtypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregate_with_argtypes(PostgreSQLPlpgsqlInnerParser.Aggregate_with_argtypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#aggregate_with_argtypes_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregate_with_argtypes_list(PostgreSQLPlpgsqlInnerParser.Aggregate_with_argtypes_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createfunc_opt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatefunc_opt_list(PostgreSQLPlpgsqlInnerParser.Createfunc_opt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#common_func_opt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommon_func_opt_item(PostgreSQLPlpgsqlInnerParser.Common_func_opt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createfunc_opt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatefunc_opt_item(PostgreSQLPlpgsqlInnerParser.Createfunc_opt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#func_as}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_as(PostgreSQLPlpgsqlInnerParser.Func_asContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#transform_type_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransform_type_list(PostgreSQLPlpgsqlInnerParser.Transform_type_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_definition(PostgreSQLPlpgsqlInnerParser.Opt_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#table_func_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_func_column(PostgreSQLPlpgsqlInnerParser.Table_func_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#table_func_column_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_func_column_list(PostgreSQLPlpgsqlInnerParser.Table_func_column_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alterfunctionstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterfunctionstmt(PostgreSQLPlpgsqlInnerParser.AlterfunctionstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alterfunc_opt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterfunc_opt_list(PostgreSQLPlpgsqlInnerParser.Alterfunc_opt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_restrict}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_restrict(PostgreSQLPlpgsqlInnerParser.Opt_restrictContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#removefuncstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRemovefuncstmt(PostgreSQLPlpgsqlInnerParser.RemovefuncstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#removeaggrstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRemoveaggrstmt(PostgreSQLPlpgsqlInnerParser.RemoveaggrstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#removeoperstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRemoveoperstmt(PostgreSQLPlpgsqlInnerParser.RemoveoperstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#oper_argtypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOper_argtypes(PostgreSQLPlpgsqlInnerParser.Oper_argtypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#any_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_operator(PostgreSQLPlpgsqlInnerParser.Any_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#operator_with_argtypes_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator_with_argtypes_list(PostgreSQLPlpgsqlInnerParser.Operator_with_argtypes_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#operator_with_argtypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator_with_argtypes(PostgreSQLPlpgsqlInnerParser.Operator_with_argtypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#dostmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDostmt(PostgreSQLPlpgsqlInnerParser.DostmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#dostmt_opt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDostmt_opt_list(PostgreSQLPlpgsqlInnerParser.Dostmt_opt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#dostmt_opt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDostmt_opt_item(PostgreSQLPlpgsqlInnerParser.Dostmt_opt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createcaststmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatecaststmt(PostgreSQLPlpgsqlInnerParser.CreatecaststmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#cast_context}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCast_context(PostgreSQLPlpgsqlInnerParser.Cast_contextContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#dropcaststmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropcaststmt(PostgreSQLPlpgsqlInnerParser.DropcaststmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_if_exists}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_if_exists(PostgreSQLPlpgsqlInnerParser.Opt_if_existsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createtransformstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatetransformstmt(PostgreSQLPlpgsqlInnerParser.CreatetransformstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#transform_element_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransform_element_list(PostgreSQLPlpgsqlInnerParser.Transform_element_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#droptransformstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDroptransformstmt(PostgreSQLPlpgsqlInnerParser.DroptransformstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#reindexstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReindexstmt(PostgreSQLPlpgsqlInnerParser.ReindexstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#reindex_target_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReindex_target_type(PostgreSQLPlpgsqlInnerParser.Reindex_target_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#reindex_target_multitable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReindex_target_multitable(PostgreSQLPlpgsqlInnerParser.Reindex_target_multitableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#reindex_option_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReindex_option_list(PostgreSQLPlpgsqlInnerParser.Reindex_option_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#reindex_option_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReindex_option_elem(PostgreSQLPlpgsqlInnerParser.Reindex_option_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#altertblspcstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAltertblspcstmt(PostgreSQLPlpgsqlInnerParser.AltertblspcstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#renamestmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenamestmt(PostgreSQLPlpgsqlInnerParser.RenamestmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_column(PostgreSQLPlpgsqlInnerParser.Opt_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_set_data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_set_data(PostgreSQLPlpgsqlInnerParser.Opt_set_dataContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alterobjectdependsstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterobjectdependsstmt(PostgreSQLPlpgsqlInnerParser.AlterobjectdependsstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_no}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_no(PostgreSQLPlpgsqlInnerParser.Opt_noContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alterobjectschemastmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterobjectschemastmt(PostgreSQLPlpgsqlInnerParser.AlterobjectschemastmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alteroperatorstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlteroperatorstmt(PostgreSQLPlpgsqlInnerParser.AlteroperatorstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#operator_def_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator_def_list(PostgreSQLPlpgsqlInnerParser.Operator_def_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#operator_def_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator_def_elem(PostgreSQLPlpgsqlInnerParser.Operator_def_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#operator_def_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator_def_arg(PostgreSQLPlpgsqlInnerParser.Operator_def_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#altertypestmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAltertypestmt(PostgreSQLPlpgsqlInnerParser.AltertypestmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alterownerstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterownerstmt(PostgreSQLPlpgsqlInnerParser.AlterownerstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createpublicationstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatepublicationstmt(PostgreSQLPlpgsqlInnerParser.CreatepublicationstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_publication_for_tables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_publication_for_tables(PostgreSQLPlpgsqlInnerParser.Opt_publication_for_tablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#publication_for_tables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPublication_for_tables(PostgreSQLPlpgsqlInnerParser.Publication_for_tablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alterpublicationstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterpublicationstmt(PostgreSQLPlpgsqlInnerParser.AlterpublicationstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createsubscriptionstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatesubscriptionstmt(PostgreSQLPlpgsqlInnerParser.CreatesubscriptionstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#publication_name_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPublication_name_list(PostgreSQLPlpgsqlInnerParser.Publication_name_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#publication_name_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPublication_name_item(PostgreSQLPlpgsqlInnerParser.Publication_name_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#altersubscriptionstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAltersubscriptionstmt(PostgreSQLPlpgsqlInnerParser.AltersubscriptionstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#dropsubscriptionstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropsubscriptionstmt(PostgreSQLPlpgsqlInnerParser.DropsubscriptionstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#rulestmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRulestmt(PostgreSQLPlpgsqlInnerParser.RulestmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#ruleactionlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleactionlist(PostgreSQLPlpgsqlInnerParser.RuleactionlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#ruleactionmulti}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleactionmulti(PostgreSQLPlpgsqlInnerParser.RuleactionmultiContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#ruleactionstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleactionstmt(PostgreSQLPlpgsqlInnerParser.RuleactionstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#ruleactionstmtOrEmpty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleactionstmtOrEmpty(PostgreSQLPlpgsqlInnerParser.RuleactionstmtOrEmptyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#event}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent(PostgreSQLPlpgsqlInnerParser.EventContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_instead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_instead(PostgreSQLPlpgsqlInnerParser.Opt_insteadContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#notifystmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotifystmt(PostgreSQLPlpgsqlInnerParser.NotifystmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#notify_payload}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotify_payload(PostgreSQLPlpgsqlInnerParser.Notify_payloadContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#listenstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListenstmt(PostgreSQLPlpgsqlInnerParser.ListenstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#unlistenstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnlistenstmt(PostgreSQLPlpgsqlInnerParser.UnlistenstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#transactionstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransactionstmt(PostgreSQLPlpgsqlInnerParser.TransactionstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_transaction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_transaction(PostgreSQLPlpgsqlInnerParser.Opt_transactionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#transaction_mode_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransaction_mode_item(PostgreSQLPlpgsqlInnerParser.Transaction_mode_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#transaction_mode_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransaction_mode_list(PostgreSQLPlpgsqlInnerParser.Transaction_mode_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#transaction_mode_list_or_empty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransaction_mode_list_or_empty(PostgreSQLPlpgsqlInnerParser.Transaction_mode_list_or_emptyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_transaction_chain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_transaction_chain(PostgreSQLPlpgsqlInnerParser.Opt_transaction_chainContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#viewstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitViewstmt(PostgreSQLPlpgsqlInnerParser.ViewstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_check_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_check_option(PostgreSQLPlpgsqlInnerParser.Opt_check_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#loadstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoadstmt(PostgreSQLPlpgsqlInnerParser.LoadstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createdbstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatedbstmt(PostgreSQLPlpgsqlInnerParser.CreatedbstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createdb_opt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatedb_opt_list(PostgreSQLPlpgsqlInnerParser.Createdb_opt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createdb_opt_items}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatedb_opt_items(PostgreSQLPlpgsqlInnerParser.Createdb_opt_itemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createdb_opt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatedb_opt_item(PostgreSQLPlpgsqlInnerParser.Createdb_opt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createdb_opt_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatedb_opt_name(PostgreSQLPlpgsqlInnerParser.Createdb_opt_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_equal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_equal(PostgreSQLPlpgsqlInnerParser.Opt_equalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alterdatabasestmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterdatabasestmt(PostgreSQLPlpgsqlInnerParser.AlterdatabasestmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alterdatabasesetstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterdatabasesetstmt(PostgreSQLPlpgsqlInnerParser.AlterdatabasesetstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#dropdbstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropdbstmt(PostgreSQLPlpgsqlInnerParser.DropdbstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#drop_option_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_option_list(PostgreSQLPlpgsqlInnerParser.Drop_option_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#drop_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_option(PostgreSQLPlpgsqlInnerParser.Drop_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#altercollationstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAltercollationstmt(PostgreSQLPlpgsqlInnerParser.AltercollationstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#altersystemstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAltersystemstmt(PostgreSQLPlpgsqlInnerParser.AltersystemstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createdomainstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatedomainstmt(PostgreSQLPlpgsqlInnerParser.CreatedomainstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alterdomainstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterdomainstmt(PostgreSQLPlpgsqlInnerParser.AlterdomainstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_as}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_as(PostgreSQLPlpgsqlInnerParser.Opt_asContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#altertsdictionarystmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAltertsdictionarystmt(PostgreSQLPlpgsqlInnerParser.AltertsdictionarystmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#altertsconfigurationstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAltertsconfigurationstmt(PostgreSQLPlpgsqlInnerParser.AltertsconfigurationstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#any_with}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_with(PostgreSQLPlpgsqlInnerParser.Any_withContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#createconversionstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateconversionstmt(PostgreSQLPlpgsqlInnerParser.CreateconversionstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#clusterstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClusterstmt(PostgreSQLPlpgsqlInnerParser.ClusterstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#cluster_index_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCluster_index_specification(PostgreSQLPlpgsqlInnerParser.Cluster_index_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#vacuumstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVacuumstmt(PostgreSQLPlpgsqlInnerParser.VacuumstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#analyzestmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnalyzestmt(PostgreSQLPlpgsqlInnerParser.AnalyzestmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#vac_analyze_option_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVac_analyze_option_list(PostgreSQLPlpgsqlInnerParser.Vac_analyze_option_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#analyze_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnalyze_keyword(PostgreSQLPlpgsqlInnerParser.Analyze_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#vac_analyze_option_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVac_analyze_option_elem(PostgreSQLPlpgsqlInnerParser.Vac_analyze_option_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#vac_analyze_option_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVac_analyze_option_name(PostgreSQLPlpgsqlInnerParser.Vac_analyze_option_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#vac_analyze_option_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVac_analyze_option_arg(PostgreSQLPlpgsqlInnerParser.Vac_analyze_option_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_analyze}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_analyze(PostgreSQLPlpgsqlInnerParser.Opt_analyzeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_verbose}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_verbose(PostgreSQLPlpgsqlInnerParser.Opt_verboseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_full}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_full(PostgreSQLPlpgsqlInnerParser.Opt_fullContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_freeze}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_freeze(PostgreSQLPlpgsqlInnerParser.Opt_freezeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_name_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_name_list(PostgreSQLPlpgsqlInnerParser.Opt_name_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#vacuum_relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVacuum_relation(PostgreSQLPlpgsqlInnerParser.Vacuum_relationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#vacuum_relation_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVacuum_relation_list(PostgreSQLPlpgsqlInnerParser.Vacuum_relation_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_vacuum_relation_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_vacuum_relation_list(PostgreSQLPlpgsqlInnerParser.Opt_vacuum_relation_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#explainstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplainstmt(PostgreSQLPlpgsqlInnerParser.ExplainstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#explainablestmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplainablestmt(PostgreSQLPlpgsqlInnerParser.ExplainablestmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#explain_option_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplain_option_list(PostgreSQLPlpgsqlInnerParser.Explain_option_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#explain_option_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplain_option_elem(PostgreSQLPlpgsqlInnerParser.Explain_option_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#explain_option_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplain_option_name(PostgreSQLPlpgsqlInnerParser.Explain_option_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#explain_option_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplain_option_arg(PostgreSQLPlpgsqlInnerParser.Explain_option_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#preparestmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreparestmt(PostgreSQLPlpgsqlInnerParser.PreparestmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#prep_type_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrep_type_clause(PostgreSQLPlpgsqlInnerParser.Prep_type_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#preparablestmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreparablestmt(PostgreSQLPlpgsqlInnerParser.PreparablestmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#executestmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecutestmt(PostgreSQLPlpgsqlInnerParser.ExecutestmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#execute_param_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute_param_clause(PostgreSQLPlpgsqlInnerParser.Execute_param_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#deallocatestmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeallocatestmt(PostgreSQLPlpgsqlInnerParser.DeallocatestmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#insertstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertstmt(PostgreSQLPlpgsqlInnerParser.InsertstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#insert_target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_target(PostgreSQLPlpgsqlInnerParser.Insert_targetContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#insert_rest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_rest(PostgreSQLPlpgsqlInnerParser.Insert_restContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#override_kind}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOverride_kind(PostgreSQLPlpgsqlInnerParser.Override_kindContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#insert_column_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_column_list(PostgreSQLPlpgsqlInnerParser.Insert_column_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#insert_column_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_column_item(PostgreSQLPlpgsqlInnerParser.Insert_column_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_on_conflict}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_on_conflict(PostgreSQLPlpgsqlInnerParser.Opt_on_conflictContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_conf_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_conf_expr(PostgreSQLPlpgsqlInnerParser.Opt_conf_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#returning_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturning_clause(PostgreSQLPlpgsqlInnerParser.Returning_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#deletestmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeletestmt(PostgreSQLPlpgsqlInnerParser.DeletestmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#using_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsing_clause(PostgreSQLPlpgsqlInnerParser.Using_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#lockstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLockstmt(PostgreSQLPlpgsqlInnerParser.LockstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_lock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_lock(PostgreSQLPlpgsqlInnerParser.Opt_lockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#lock_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLock_type(PostgreSQLPlpgsqlInnerParser.Lock_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_nowait}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_nowait(PostgreSQLPlpgsqlInnerParser.Opt_nowaitContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_nowait_or_skip}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_nowait_or_skip(PostgreSQLPlpgsqlInnerParser.Opt_nowait_or_skipContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#updatestmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdatestmt(PostgreSQLPlpgsqlInnerParser.UpdatestmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#set_clause_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_clause_list(PostgreSQLPlpgsqlInnerParser.Set_clause_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#set_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_clause(PostgreSQLPlpgsqlInnerParser.Set_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#set_target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_target(PostgreSQLPlpgsqlInnerParser.Set_targetContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#set_target_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_target_list(PostgreSQLPlpgsqlInnerParser.Set_target_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#declarecursorstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarecursorstmt(PostgreSQLPlpgsqlInnerParser.DeclarecursorstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#cursor_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_name(PostgreSQLPlpgsqlInnerParser.Cursor_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#cursor_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_options(PostgreSQLPlpgsqlInnerParser.Cursor_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_hold}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_hold(PostgreSQLPlpgsqlInnerParser.Opt_holdContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#selectstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectstmt(PostgreSQLPlpgsqlInnerParser.SelectstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#select_with_parens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_with_parens(PostgreSQLPlpgsqlInnerParser.Select_with_parensContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#select_no_parens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_no_parens(PostgreSQLPlpgsqlInnerParser.Select_no_parensContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#select_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_clause(PostgreSQLPlpgsqlInnerParser.Select_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#simple_select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_select(PostgreSQLPlpgsqlInnerParser.Simple_selectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code union}
	 * labeled alternative in {@link PostgreSQLPlpgsqlInnerParser#set_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion(PostgreSQLPlpgsqlInnerParser.UnionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intersect}
	 * labeled alternative in {@link PostgreSQLPlpgsqlInnerParser#set_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntersect(PostgreSQLPlpgsqlInnerParser.IntersectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code except}
	 * labeled alternative in {@link PostgreSQLPlpgsqlInnerParser#set_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExcept(PostgreSQLPlpgsqlInnerParser.ExceptContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#set_operator_with_all_or_distinct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_operator_with_all_or_distinct(PostgreSQLPlpgsqlInnerParser.Set_operator_with_all_or_distinctContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#with_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_clause(PostgreSQLPlpgsqlInnerParser.With_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#cte_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCte_list(PostgreSQLPlpgsqlInnerParser.Cte_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#common_table_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommon_table_expr(PostgreSQLPlpgsqlInnerParser.Common_table_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_materialized}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_materialized(PostgreSQLPlpgsqlInnerParser.Opt_materializedContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_with_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_with_clause(PostgreSQLPlpgsqlInnerParser.Opt_with_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#into_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInto_clause(PostgreSQLPlpgsqlInnerParser.Into_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_strict}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_strict(PostgreSQLPlpgsqlInnerParser.Opt_strictContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opttempTableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpttempTableName(PostgreSQLPlpgsqlInnerParser.OpttempTableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_table(PostgreSQLPlpgsqlInnerParser.Opt_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#all_or_distinct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAll_or_distinct(PostgreSQLPlpgsqlInnerParser.All_or_distinctContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#distinct_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDistinct_clause(PostgreSQLPlpgsqlInnerParser.Distinct_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_all_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_all_clause(PostgreSQLPlpgsqlInnerParser.Opt_all_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_sort_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_sort_clause(PostgreSQLPlpgsqlInnerParser.Opt_sort_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#sort_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSort_clause(PostgreSQLPlpgsqlInnerParser.Sort_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#sortby_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortby_list(PostgreSQLPlpgsqlInnerParser.Sortby_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#sortby}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortby(PostgreSQLPlpgsqlInnerParser.SortbyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#select_limit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_limit(PostgreSQLPlpgsqlInnerParser.Select_limitContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_select_limit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_select_limit(PostgreSQLPlpgsqlInnerParser.Opt_select_limitContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#limit_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimit_clause(PostgreSQLPlpgsqlInnerParser.Limit_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#offset_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOffset_clause(PostgreSQLPlpgsqlInnerParser.Offset_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#select_limit_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_limit_value(PostgreSQLPlpgsqlInnerParser.Select_limit_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#select_offset_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_offset_value(PostgreSQLPlpgsqlInnerParser.Select_offset_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#select_fetch_first_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_fetch_first_value(PostgreSQLPlpgsqlInnerParser.Select_fetch_first_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#i_or_f_const}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitI_or_f_const(PostgreSQLPlpgsqlInnerParser.I_or_f_constContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#row_or_rows}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow_or_rows(PostgreSQLPlpgsqlInnerParser.Row_or_rowsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#first_or_next}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirst_or_next(PostgreSQLPlpgsqlInnerParser.First_or_nextContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#group_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_clause(PostgreSQLPlpgsqlInnerParser.Group_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#group_by_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_by_list(PostgreSQLPlpgsqlInnerParser.Group_by_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#group_by_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_by_item(PostgreSQLPlpgsqlInnerParser.Group_by_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#empty_grouping_set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmpty_grouping_set(PostgreSQLPlpgsqlInnerParser.Empty_grouping_setContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#rollup_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollup_clause(PostgreSQLPlpgsqlInnerParser.Rollup_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#cube_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCube_clause(PostgreSQLPlpgsqlInnerParser.Cube_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#grouping_sets_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrouping_sets_clause(PostgreSQLPlpgsqlInnerParser.Grouping_sets_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#having_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHaving_clause(PostgreSQLPlpgsqlInnerParser.Having_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#for_locking_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_locking_clause(PostgreSQLPlpgsqlInnerParser.For_locking_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_for_locking_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_for_locking_clause(PostgreSQLPlpgsqlInnerParser.Opt_for_locking_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#for_locking_items}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_locking_items(PostgreSQLPlpgsqlInnerParser.For_locking_itemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#for_locking_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_locking_item(PostgreSQLPlpgsqlInnerParser.For_locking_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#for_locking_strength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_locking_strength(PostgreSQLPlpgsqlInnerParser.For_locking_strengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#locked_rels_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocked_rels_list(PostgreSQLPlpgsqlInnerParser.Locked_rels_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#values_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValues_clause(PostgreSQLPlpgsqlInnerParser.Values_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#from_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_clause(PostgreSQLPlpgsqlInnerParser.From_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#from_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_list(PostgreSQLPlpgsqlInnerParser.From_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#table_ref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_ref(PostgreSQLPlpgsqlInnerParser.Table_refContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#alias_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias_clause(PostgreSQLPlpgsqlInnerParser.Alias_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_alias_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_alias_clause(PostgreSQLPlpgsqlInnerParser.Opt_alias_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#func_alias_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_alias_clause(PostgreSQLPlpgsqlInnerParser.Func_alias_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#join_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_type(PostgreSQLPlpgsqlInnerParser.Join_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#join_qual}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_qual(PostgreSQLPlpgsqlInnerParser.Join_qualContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#relation_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelation_expr(PostgreSQLPlpgsqlInnerParser.Relation_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#relation_expr_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelation_expr_list(PostgreSQLPlpgsqlInnerParser.Relation_expr_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#relation_expr_opt_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelation_expr_opt_alias(PostgreSQLPlpgsqlInnerParser.Relation_expr_opt_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#tablesample_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablesample_clause(PostgreSQLPlpgsqlInnerParser.Tablesample_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_repeatable_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_repeatable_clause(PostgreSQLPlpgsqlInnerParser.Opt_repeatable_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#func_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_table(PostgreSQLPlpgsqlInnerParser.Func_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#rowsfrom_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowsfrom_item(PostgreSQLPlpgsqlInnerParser.Rowsfrom_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#rowsfrom_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowsfrom_list(PostgreSQLPlpgsqlInnerParser.Rowsfrom_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_col_def_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_col_def_list(PostgreSQLPlpgsqlInnerParser.Opt_col_def_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_ordinality}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_ordinality(PostgreSQLPlpgsqlInnerParser.Opt_ordinalityContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#where_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere_clause(PostgreSQLPlpgsqlInnerParser.Where_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#where_or_current_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere_or_current_clause(PostgreSQLPlpgsqlInnerParser.Where_or_current_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opttablefuncelementlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpttablefuncelementlist(PostgreSQLPlpgsqlInnerParser.OpttablefuncelementlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#tablefuncelementlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablefuncelementlist(PostgreSQLPlpgsqlInnerParser.TablefuncelementlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#tablefuncelement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablefuncelement(PostgreSQLPlpgsqlInnerParser.TablefuncelementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#xmltable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmltable(PostgreSQLPlpgsqlInnerParser.XmltableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#xmltable_column_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmltable_column_list(PostgreSQLPlpgsqlInnerParser.Xmltable_column_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#xmltable_column_el}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmltable_column_el(PostgreSQLPlpgsqlInnerParser.Xmltable_column_elContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#xmltable_column_option_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmltable_column_option_list(PostgreSQLPlpgsqlInnerParser.Xmltable_column_option_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#xmltable_column_option_el}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmltable_column_option_el(PostgreSQLPlpgsqlInnerParser.Xmltable_column_option_elContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#xml_namespace_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_namespace_list(PostgreSQLPlpgsqlInnerParser.Xml_namespace_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#xml_namespace_el}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_namespace_el(PostgreSQLPlpgsqlInnerParser.Xml_namespace_elContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#typename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypename(PostgreSQLPlpgsqlInnerParser.TypenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_array_bounds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_array_bounds(PostgreSQLPlpgsqlInnerParser.Opt_array_boundsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#simpletypename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpletypename(PostgreSQLPlpgsqlInnerParser.SimpletypenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#consttypename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsttypename(PostgreSQLPlpgsqlInnerParser.ConsttypenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#generictype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenerictype(PostgreSQLPlpgsqlInnerParser.GenerictypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_type_modifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_type_modifiers(PostgreSQLPlpgsqlInnerParser.Opt_type_modifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#numeric}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric(PostgreSQLPlpgsqlInnerParser.NumericContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_float}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_float(PostgreSQLPlpgsqlInnerParser.Opt_floatContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#bit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBit(PostgreSQLPlpgsqlInnerParser.BitContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#constbit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstbit(PostgreSQLPlpgsqlInnerParser.ConstbitContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#bitwithlength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwithlength(PostgreSQLPlpgsqlInnerParser.BitwithlengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#bitwithoutlength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwithoutlength(PostgreSQLPlpgsqlInnerParser.BitwithoutlengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#character}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter(PostgreSQLPlpgsqlInnerParser.CharacterContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#constcharacter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstcharacter(PostgreSQLPlpgsqlInnerParser.ConstcharacterContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#character_c}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter_c(PostgreSQLPlpgsqlInnerParser.Character_cContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_varying}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_varying(PostgreSQLPlpgsqlInnerParser.Opt_varyingContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#constdatetime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstdatetime(PostgreSQLPlpgsqlInnerParser.ConstdatetimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#constinterval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstinterval(PostgreSQLPlpgsqlInnerParser.ConstintervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_timezone}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_timezone(PostgreSQLPlpgsqlInnerParser.Opt_timezoneContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_interval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_interval(PostgreSQLPlpgsqlInnerParser.Opt_intervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#interval_second}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval_second(PostgreSQLPlpgsqlInnerParser.Interval_secondContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_escape}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_escape(PostgreSQLPlpgsqlInnerParser.Opt_escapeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#a_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA_expr(PostgreSQLPlpgsqlInnerParser.A_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#a_expr_qual}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA_expr_qual(PostgreSQLPlpgsqlInnerParser.A_expr_qualContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#a_expr_lessless}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA_expr_lessless(PostgreSQLPlpgsqlInnerParser.A_expr_lesslessContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#a_expr_or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA_expr_or(PostgreSQLPlpgsqlInnerParser.A_expr_orContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#a_expr_and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA_expr_and(PostgreSQLPlpgsqlInnerParser.A_expr_andContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#a_expr_in}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA_expr_in(PostgreSQLPlpgsqlInnerParser.A_expr_inContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#a_expr_unary_not}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA_expr_unary_not(PostgreSQLPlpgsqlInnerParser.A_expr_unary_notContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#a_expr_isnull}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA_expr_isnull(PostgreSQLPlpgsqlInnerParser.A_expr_isnullContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#a_expr_is_not}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA_expr_is_not(PostgreSQLPlpgsqlInnerParser.A_expr_is_notContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#a_expr_compare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA_expr_compare(PostgreSQLPlpgsqlInnerParser.A_expr_compareContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#a_expr_like}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA_expr_like(PostgreSQLPlpgsqlInnerParser.A_expr_likeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#a_expr_qual_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA_expr_qual_op(PostgreSQLPlpgsqlInnerParser.A_expr_qual_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#a_expr_unary_qualop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA_expr_unary_qualop(PostgreSQLPlpgsqlInnerParser.A_expr_unary_qualopContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#a_expr_add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA_expr_add(PostgreSQLPlpgsqlInnerParser.A_expr_addContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#a_expr_mul}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA_expr_mul(PostgreSQLPlpgsqlInnerParser.A_expr_mulContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#a_expr_caret}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA_expr_caret(PostgreSQLPlpgsqlInnerParser.A_expr_caretContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#a_expr_unary_sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA_expr_unary_sign(PostgreSQLPlpgsqlInnerParser.A_expr_unary_signContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#a_expr_at_time_zone}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA_expr_at_time_zone(PostgreSQLPlpgsqlInnerParser.A_expr_at_time_zoneContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#a_expr_collate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA_expr_collate(PostgreSQLPlpgsqlInnerParser.A_expr_collateContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#a_expr_typecast}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA_expr_typecast(PostgreSQLPlpgsqlInnerParser.A_expr_typecastContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#b_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitB_expr(PostgreSQLPlpgsqlInnerParser.B_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code c_expr_exists}
	 * labeled alternative in {@link PostgreSQLPlpgsqlInnerParser#c_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_expr_exists(PostgreSQLPlpgsqlInnerParser.C_expr_existsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code c_expr_expr}
	 * labeled alternative in {@link PostgreSQLPlpgsqlInnerParser#c_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_expr_expr(PostgreSQLPlpgsqlInnerParser.C_expr_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code c_expr_case}
	 * labeled alternative in {@link PostgreSQLPlpgsqlInnerParser#c_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_expr_case(PostgreSQLPlpgsqlInnerParser.C_expr_caseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#plsqlvariablename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlsqlvariablename(PostgreSQLPlpgsqlInnerParser.PlsqlvariablenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#func_application}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_application(PostgreSQLPlpgsqlInnerParser.Func_applicationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#func_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_expr(PostgreSQLPlpgsqlInnerParser.Func_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#func_expr_windowless}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_expr_windowless(PostgreSQLPlpgsqlInnerParser.Func_expr_windowlessContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#func_expr_common_subexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_expr_common_subexpr(PostgreSQLPlpgsqlInnerParser.Func_expr_common_subexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#xml_root_version}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_root_version(PostgreSQLPlpgsqlInnerParser.Xml_root_versionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_xml_root_standalone}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_xml_root_standalone(PostgreSQLPlpgsqlInnerParser.Opt_xml_root_standaloneContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#xml_attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_attributes(PostgreSQLPlpgsqlInnerParser.Xml_attributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#xml_attribute_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_attribute_list(PostgreSQLPlpgsqlInnerParser.Xml_attribute_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#xml_attribute_el}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_attribute_el(PostgreSQLPlpgsqlInnerParser.Xml_attribute_elContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#document_or_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocument_or_content(PostgreSQLPlpgsqlInnerParser.Document_or_contentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#xml_whitespace_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_whitespace_option(PostgreSQLPlpgsqlInnerParser.Xml_whitespace_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#xmlexists_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlexists_argument(PostgreSQLPlpgsqlInnerParser.Xmlexists_argumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#xml_passing_mech}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_passing_mech(PostgreSQLPlpgsqlInnerParser.Xml_passing_mechContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#within_group_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithin_group_clause(PostgreSQLPlpgsqlInnerParser.Within_group_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#filter_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter_clause(PostgreSQLPlpgsqlInnerParser.Filter_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#window_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_clause(PostgreSQLPlpgsqlInnerParser.Window_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#window_definition_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_definition_list(PostgreSQLPlpgsqlInnerParser.Window_definition_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#window_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_definition(PostgreSQLPlpgsqlInnerParser.Window_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#over_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOver_clause(PostgreSQLPlpgsqlInnerParser.Over_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#window_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_specification(PostgreSQLPlpgsqlInnerParser.Window_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_existing_window_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_existing_window_name(PostgreSQLPlpgsqlInnerParser.Opt_existing_window_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_partition_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_partition_clause(PostgreSQLPlpgsqlInnerParser.Opt_partition_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_frame_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_frame_clause(PostgreSQLPlpgsqlInnerParser.Opt_frame_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#frame_extent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrame_extent(PostgreSQLPlpgsqlInnerParser.Frame_extentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#frame_bound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrame_bound(PostgreSQLPlpgsqlInnerParser.Frame_boundContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_window_exclusion_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_window_exclusion_clause(PostgreSQLPlpgsqlInnerParser.Opt_window_exclusion_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow(PostgreSQLPlpgsqlInnerParser.RowContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#explicit_row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicit_row(PostgreSQLPlpgsqlInnerParser.Explicit_rowContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#implicit_row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplicit_row(PostgreSQLPlpgsqlInnerParser.Implicit_rowContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#sub_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub_type(PostgreSQLPlpgsqlInnerParser.Sub_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#all_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAll_op(PostgreSQLPlpgsqlInnerParser.All_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#mathop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathop(PostgreSQLPlpgsqlInnerParser.MathopContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#qual_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQual_op(PostgreSQLPlpgsqlInnerParser.Qual_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#qual_all_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQual_all_op(PostgreSQLPlpgsqlInnerParser.Qual_all_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#subquery_Op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery_Op(PostgreSQLPlpgsqlInnerParser.Subquery_OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#expr_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_list(PostgreSQLPlpgsqlInnerParser.Expr_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#func_arg_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_arg_list(PostgreSQLPlpgsqlInnerParser.Func_arg_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#func_arg_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_arg_expr(PostgreSQLPlpgsqlInnerParser.Func_arg_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#type_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_list(PostgreSQLPlpgsqlInnerParser.Type_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#array_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_expr(PostgreSQLPlpgsqlInnerParser.Array_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#array_expr_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_expr_list(PostgreSQLPlpgsqlInnerParser.Array_expr_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#extract_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtract_list(PostgreSQLPlpgsqlInnerParser.Extract_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#extract_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtract_arg(PostgreSQLPlpgsqlInnerParser.Extract_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#unicode_normal_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnicode_normal_form(PostgreSQLPlpgsqlInnerParser.Unicode_normal_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#overlay_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOverlay_list(PostgreSQLPlpgsqlInnerParser.Overlay_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#position_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPosition_list(PostgreSQLPlpgsqlInnerParser.Position_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#substr_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstr_list(PostgreSQLPlpgsqlInnerParser.Substr_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#trim_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrim_list(PostgreSQLPlpgsqlInnerParser.Trim_listContext ctx);
	/**
	 * Visit a parse tree produced by the {@code in_expr_select}
	 * labeled alternative in {@link PostgreSQLPlpgsqlInnerParser#in_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_expr_select(PostgreSQLPlpgsqlInnerParser.In_expr_selectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code in_expr_list}
	 * labeled alternative in {@link PostgreSQLPlpgsqlInnerParser#in_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_expr_list(PostgreSQLPlpgsqlInnerParser.In_expr_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#case_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_expr(PostgreSQLPlpgsqlInnerParser.Case_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#when_clause_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhen_clause_list(PostgreSQLPlpgsqlInnerParser.When_clause_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#when_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhen_clause(PostgreSQLPlpgsqlInnerParser.When_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#case_default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_default(PostgreSQLPlpgsqlInnerParser.Case_defaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#case_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_arg(PostgreSQLPlpgsqlInnerParser.Case_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#columnref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnref(PostgreSQLPlpgsqlInnerParser.ColumnrefContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#indirection_el}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndirection_el(PostgreSQLPlpgsqlInnerParser.Indirection_elContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_slice_bound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_slice_bound(PostgreSQLPlpgsqlInnerParser.Opt_slice_boundContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#indirection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndirection(PostgreSQLPlpgsqlInnerParser.IndirectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_indirection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_indirection(PostgreSQLPlpgsqlInnerParser.Opt_indirectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_target_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_target_list(PostgreSQLPlpgsqlInnerParser.Opt_target_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#target_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTarget_list(PostgreSQLPlpgsqlInnerParser.Target_listContext ctx);
	/**
	 * Visit a parse tree produced by the {@code target_label}
	 * labeled alternative in {@link PostgreSQLPlpgsqlInnerParser#target_el}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTarget_label(PostgreSQLPlpgsqlInnerParser.Target_labelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code target_star}
	 * labeled alternative in {@link PostgreSQLPlpgsqlInnerParser#target_el}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTarget_star(PostgreSQLPlpgsqlInnerParser.Target_starContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#qualified_name_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualified_name_list(PostgreSQLPlpgsqlInnerParser.Qualified_name_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#qualified_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualified_name(PostgreSQLPlpgsqlInnerParser.Qualified_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#name_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName_list(PostgreSQLPlpgsqlInnerParser.Name_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(PostgreSQLPlpgsqlInnerParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#attr_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttr_name(PostgreSQLPlpgsqlInnerParser.Attr_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#file_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_name(PostgreSQLPlpgsqlInnerParser.File_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#func_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_name(PostgreSQLPlpgsqlInnerParser.Func_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#aexprconst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAexprconst(PostgreSQLPlpgsqlInnerParser.AexprconstContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#xconst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXconst(PostgreSQLPlpgsqlInnerParser.XconstContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#bconst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBconst(PostgreSQLPlpgsqlInnerParser.BconstContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#fconst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFconst(PostgreSQLPlpgsqlInnerParser.FconstContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#iconst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIconst(PostgreSQLPlpgsqlInnerParser.IconstContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#sconst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSconst(PostgreSQLPlpgsqlInnerParser.SconstContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#anysconst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnysconst(PostgreSQLPlpgsqlInnerParser.AnysconstContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_uescape}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_uescape(PostgreSQLPlpgsqlInnerParser.Opt_uescapeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#signediconst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignediconst(PostgreSQLPlpgsqlInnerParser.SignediconstContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#roleid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoleid(PostgreSQLPlpgsqlInnerParser.RoleidContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#rolespec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRolespec(PostgreSQLPlpgsqlInnerParser.RolespecContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#role_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRole_list(PostgreSQLPlpgsqlInnerParser.Role_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#colid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColid(PostgreSQLPlpgsqlInnerParser.ColidContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#type_function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_function_name(PostgreSQLPlpgsqlInnerParser.Type_function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#nonreservedword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonreservedword(PostgreSQLPlpgsqlInnerParser.NonreservedwordContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#collabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollabel(PostgreSQLPlpgsqlInnerParser.CollabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(PostgreSQLPlpgsqlInnerParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#plsqlidentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlsqlidentifier(PostgreSQLPlpgsqlInnerParser.PlsqlidentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#unreserved_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnreserved_keyword(PostgreSQLPlpgsqlInnerParser.Unreserved_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#col_name_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCol_name_keyword(PostgreSQLPlpgsqlInnerParser.Col_name_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#type_func_name_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_func_name_keyword(PostgreSQLPlpgsqlInnerParser.Type_func_name_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#reserved_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReserved_keyword(PostgreSQLPlpgsqlInnerParser.Reserved_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#pl_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPl_function(PostgreSQLPlpgsqlInnerParser.Pl_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#comp_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_options(PostgreSQLPlpgsqlInnerParser.Comp_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#comp_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_option(PostgreSQLPlpgsqlInnerParser.Comp_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#sharp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSharp(PostgreSQLPlpgsqlInnerParser.SharpContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#option_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOption_value(PostgreSQLPlpgsqlInnerParser.Option_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_semi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_semi(PostgreSQLPlpgsqlInnerParser.Opt_semiContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#pl_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPl_block(PostgreSQLPlpgsqlInnerParser.Pl_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#decl_sect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_sect(PostgreSQLPlpgsqlInnerParser.Decl_sectContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#decl_start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_start(PostgreSQLPlpgsqlInnerParser.Decl_startContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#decl_stmts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_stmts(PostgreSQLPlpgsqlInnerParser.Decl_stmtsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#label_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel_decl(PostgreSQLPlpgsqlInnerParser.Label_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#decl_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_stmt(PostgreSQLPlpgsqlInnerParser.Decl_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#decl_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_statement(PostgreSQLPlpgsqlInnerParser.Decl_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_scrollable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_scrollable(PostgreSQLPlpgsqlInnerParser.Opt_scrollableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#decl_cursor_query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_cursor_query(PostgreSQLPlpgsqlInnerParser.Decl_cursor_queryContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#decl_cursor_args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_cursor_args(PostgreSQLPlpgsqlInnerParser.Decl_cursor_argsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#decl_cursor_arglist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_cursor_arglist(PostgreSQLPlpgsqlInnerParser.Decl_cursor_arglistContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#decl_cursor_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_cursor_arg(PostgreSQLPlpgsqlInnerParser.Decl_cursor_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#decl_is_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_is_for(PostgreSQLPlpgsqlInnerParser.Decl_is_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#decl_aliasitem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_aliasitem(PostgreSQLPlpgsqlInnerParser.Decl_aliasitemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#decl_varname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_varname(PostgreSQLPlpgsqlInnerParser.Decl_varnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#decl_const}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_const(PostgreSQLPlpgsqlInnerParser.Decl_constContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#decl_datatype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_datatype(PostgreSQLPlpgsqlInnerParser.Decl_datatypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#decl_collate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_collate(PostgreSQLPlpgsqlInnerParser.Decl_collateContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#decl_notnull}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_notnull(PostgreSQLPlpgsqlInnerParser.Decl_notnullContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#decl_defval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_defval(PostgreSQLPlpgsqlInnerParser.Decl_defvalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#decl_defkey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_defkey(PostgreSQLPlpgsqlInnerParser.Decl_defkeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#assign_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_operator(PostgreSQLPlpgsqlInnerParser.Assign_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#proc_sect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc_sect(PostgreSQLPlpgsqlInnerParser.Proc_sectContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#proc_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc_stmt(PostgreSQLPlpgsqlInnerParser.Proc_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmt_perform}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_perform(PostgreSQLPlpgsqlInnerParser.Stmt_performContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmt_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_call(PostgreSQLPlpgsqlInnerParser.Stmt_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_expr_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_expr_list(PostgreSQLPlpgsqlInnerParser.Opt_expr_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmt_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_assign(PostgreSQLPlpgsqlInnerParser.Stmt_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmt_getdiag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_getdiag(PostgreSQLPlpgsqlInnerParser.Stmt_getdiagContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#getdiag_area_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetdiag_area_opt(PostgreSQLPlpgsqlInnerParser.Getdiag_area_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#getdiag_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetdiag_list(PostgreSQLPlpgsqlInnerParser.Getdiag_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#getdiag_list_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetdiag_list_item(PostgreSQLPlpgsqlInnerParser.Getdiag_list_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#getdiag_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetdiag_item(PostgreSQLPlpgsqlInnerParser.Getdiag_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#getdiag_target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetdiag_target(PostgreSQLPlpgsqlInnerParser.Getdiag_targetContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#assign_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_var(PostgreSQLPlpgsqlInnerParser.Assign_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmt_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_if(PostgreSQLPlpgsqlInnerParser.Stmt_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmt_elsifs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_elsifs(PostgreSQLPlpgsqlInnerParser.Stmt_elsifsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmt_else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_else(PostgreSQLPlpgsqlInnerParser.Stmt_elseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmt_case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_case(PostgreSQLPlpgsqlInnerParser.Stmt_caseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_expr_until_when}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_expr_until_when(PostgreSQLPlpgsqlInnerParser.Opt_expr_until_whenContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#case_when_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_when_list(PostgreSQLPlpgsqlInnerParser.Case_when_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#case_when}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_when(PostgreSQLPlpgsqlInnerParser.Case_whenContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_case_else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_case_else(PostgreSQLPlpgsqlInnerParser.Opt_case_elseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmt_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_loop(PostgreSQLPlpgsqlInnerParser.Stmt_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmt_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_while(PostgreSQLPlpgsqlInnerParser.Stmt_whileContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmt_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_for(PostgreSQLPlpgsqlInnerParser.Stmt_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#for_control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_control(PostgreSQLPlpgsqlInnerParser.For_controlContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_for_using_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_for_using_expression(PostgreSQLPlpgsqlInnerParser.Opt_for_using_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_cursor_parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_cursor_parameters(PostgreSQLPlpgsqlInnerParser.Opt_cursor_parametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_reverse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_reverse(PostgreSQLPlpgsqlInnerParser.Opt_reverseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_by_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_by_expression(PostgreSQLPlpgsqlInnerParser.Opt_by_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#for_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_variable(PostgreSQLPlpgsqlInnerParser.For_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmt_foreach_a}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_foreach_a(PostgreSQLPlpgsqlInnerParser.Stmt_foreach_aContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#foreach_slice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeach_slice(PostgreSQLPlpgsqlInnerParser.Foreach_sliceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmt_exit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_exit(PostgreSQLPlpgsqlInnerParser.Stmt_exitContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#exit_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExit_type(PostgreSQLPlpgsqlInnerParser.Exit_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmt_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_return(PostgreSQLPlpgsqlInnerParser.Stmt_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_return_result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_return_result(PostgreSQLPlpgsqlInnerParser.Opt_return_resultContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmt_raise}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_raise(PostgreSQLPlpgsqlInnerParser.Stmt_raiseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_stmt_raise_level}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_stmt_raise_level(PostgreSQLPlpgsqlInnerParser.Opt_stmt_raise_levelContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_raise_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_raise_list(PostgreSQLPlpgsqlInnerParser.Opt_raise_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_raise_using}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_raise_using(PostgreSQLPlpgsqlInnerParser.Opt_raise_usingContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_raise_using_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_raise_using_elem(PostgreSQLPlpgsqlInnerParser.Opt_raise_using_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_raise_using_elem_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_raise_using_elem_list(PostgreSQLPlpgsqlInnerParser.Opt_raise_using_elem_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmt_assert}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_assert(PostgreSQLPlpgsqlInnerParser.Stmt_assertContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_stmt_assert_message}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_stmt_assert_message(PostgreSQLPlpgsqlInnerParser.Opt_stmt_assert_messageContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#loop_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_body(PostgreSQLPlpgsqlInnerParser.Loop_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmt_execsql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_execsql(PostgreSQLPlpgsqlInnerParser.Stmt_execsqlContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmt_dynexecute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_dynexecute(PostgreSQLPlpgsqlInnerParser.Stmt_dynexecuteContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_execute_using}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_execute_using(PostgreSQLPlpgsqlInnerParser.Opt_execute_usingContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_execute_using_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_execute_using_list(PostgreSQLPlpgsqlInnerParser.Opt_execute_using_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_execute_into}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_execute_into(PostgreSQLPlpgsqlInnerParser.Opt_execute_intoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmt_open}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_open(PostgreSQLPlpgsqlInnerParser.Stmt_openContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_open_bound_list_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_open_bound_list_item(PostgreSQLPlpgsqlInnerParser.Opt_open_bound_list_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_open_bound_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_open_bound_list(PostgreSQLPlpgsqlInnerParser.Opt_open_bound_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_open_using}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_open_using(PostgreSQLPlpgsqlInnerParser.Opt_open_usingContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_scroll_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_scroll_option(PostgreSQLPlpgsqlInnerParser.Opt_scroll_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_scroll_option_no}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_scroll_option_no(PostgreSQLPlpgsqlInnerParser.Opt_scroll_option_noContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmt_fetch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_fetch(PostgreSQLPlpgsqlInnerParser.Stmt_fetchContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#into_target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInto_target(PostgreSQLPlpgsqlInnerParser.Into_targetContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_cursor_from}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_cursor_from(PostgreSQLPlpgsqlInnerParser.Opt_cursor_fromContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_fetch_direction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_fetch_direction(PostgreSQLPlpgsqlInnerParser.Opt_fetch_directionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmt_move}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_move(PostgreSQLPlpgsqlInnerParser.Stmt_moveContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmt_close}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_close(PostgreSQLPlpgsqlInnerParser.Stmt_closeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmt_null}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_null(PostgreSQLPlpgsqlInnerParser.Stmt_nullContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmt_commit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_commit(PostgreSQLPlpgsqlInnerParser.Stmt_commitContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmt_rollback}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_rollback(PostgreSQLPlpgsqlInnerParser.Stmt_rollbackContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#plsql_opt_transaction_chain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlsql_opt_transaction_chain(PostgreSQLPlpgsqlInnerParser.Plsql_opt_transaction_chainContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#stmt_set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_set(PostgreSQLPlpgsqlInnerParser.Stmt_setContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#cursor_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_variable(PostgreSQLPlpgsqlInnerParser.Cursor_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#exception_sect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitException_sect(PostgreSQLPlpgsqlInnerParser.Exception_sectContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#proc_exceptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc_exceptions(PostgreSQLPlpgsqlInnerParser.Proc_exceptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#proc_exception}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc_exception(PostgreSQLPlpgsqlInnerParser.Proc_exceptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#proc_conditions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc_conditions(PostgreSQLPlpgsqlInnerParser.Proc_conditionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#proc_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc_condition(PostgreSQLPlpgsqlInnerParser.Proc_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_block_label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_block_label(PostgreSQLPlpgsqlInnerParser.Opt_block_labelContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_loop_label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_loop_label(PostgreSQLPlpgsqlInnerParser.Opt_loop_labelContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_label(PostgreSQLPlpgsqlInnerParser.Opt_labelContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_exitcond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_exitcond(PostgreSQLPlpgsqlInnerParser.Opt_exitcondContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#any_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_identifier(PostgreSQLPlpgsqlInnerParser.Any_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#plsql_unreserved_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlsql_unreserved_keyword(PostgreSQLPlpgsqlInnerParser.Plsql_unreserved_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#sql_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_expression(PostgreSQLPlpgsqlInnerParser.Sql_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#expr_until_then}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_until_then(PostgreSQLPlpgsqlInnerParser.Expr_until_thenContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#expr_until_semi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_until_semi(PostgreSQLPlpgsqlInnerParser.Expr_until_semiContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#expr_until_rightbracket}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_until_rightbracket(PostgreSQLPlpgsqlInnerParser.Expr_until_rightbracketContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#expr_until_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_until_loop(PostgreSQLPlpgsqlInnerParser.Expr_until_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#make_execsql_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMake_execsql_stmt(PostgreSQLPlpgsqlInnerParser.Make_execsql_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLPlpgsqlInnerParser#opt_returning_clause_into}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpt_returning_clause_into(PostgreSQLPlpgsqlInnerParser.Opt_returning_clause_intoContext ctx);
}