package com.myplugin.plsqlic3.plugin.customlanguage.sql.parser;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public interface PostgreSQLPlpgsqlInnerParserBaseInterfaseListener extends PostgreSQLPlpgsqlInnerParserListener{
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterRoot(PostgreSQLPlpgsqlInnerParser.RootContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitRoot(PostgreSQLPlpgsqlInnerParser.RootContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterPlsqlroot(PostgreSQLPlpgsqlInnerParser.PlsqlrootContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitPlsqlroot(PostgreSQLPlpgsqlInnerParser.PlsqlrootContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterStmtblock(PostgreSQLPlpgsqlInnerParser.StmtblockContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitStmtblock(PostgreSQLPlpgsqlInnerParser.StmtblockContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterStmtmulti(PostgreSQLPlpgsqlInnerParser.StmtmultiContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitStmtmulti(PostgreSQLPlpgsqlInnerParser.StmtmultiContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterStmt(PostgreSQLPlpgsqlInnerParser.StmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitStmt(PostgreSQLPlpgsqlInnerParser.StmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterPlsqlconsolecommand(PostgreSQLPlpgsqlInnerParser.PlsqlconsolecommandContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitPlsqlconsolecommand(PostgreSQLPlpgsqlInnerParser.PlsqlconsolecommandContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterCallstmt(PostgreSQLPlpgsqlInnerParser.CallstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitCallstmt(PostgreSQLPlpgsqlInnerParser.CallstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterCreaterolestmt(PostgreSQLPlpgsqlInnerParser.CreaterolestmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitCreaterolestmt(PostgreSQLPlpgsqlInnerParser.CreaterolestmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_with(PostgreSQLPlpgsqlInnerParser.Opt_withContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_with(PostgreSQLPlpgsqlInnerParser.Opt_withContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOptrolelist(PostgreSQLPlpgsqlInnerParser.OptrolelistContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOptrolelist(PostgreSQLPlpgsqlInnerParser.OptrolelistContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterAlteroptrolelist(PostgreSQLPlpgsqlInnerParser.AlteroptrolelistContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitAlteroptrolelist(PostgreSQLPlpgsqlInnerParser.AlteroptrolelistContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterAlteroptroleelem(PostgreSQLPlpgsqlInnerParser.AlteroptroleelemContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitAlteroptroleelem(PostgreSQLPlpgsqlInnerParser.AlteroptroleelemContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterCreateoptroleelem(PostgreSQLPlpgsqlInnerParser.CreateoptroleelemContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitCreateoptroleelem(PostgreSQLPlpgsqlInnerParser.CreateoptroleelemContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterCreateuserstmt(PostgreSQLPlpgsqlInnerParser.CreateuserstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitCreateuserstmt(PostgreSQLPlpgsqlInnerParser.CreateuserstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterAlterrolestmt(PostgreSQLPlpgsqlInnerParser.AlterrolestmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitAlterrolestmt(PostgreSQLPlpgsqlInnerParser.AlterrolestmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_in_database(PostgreSQLPlpgsqlInnerParser.Opt_in_databaseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_in_database(PostgreSQLPlpgsqlInnerParser.Opt_in_databaseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterAlterrolesetstmt(PostgreSQLPlpgsqlInnerParser.AlterrolesetstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitAlterrolesetstmt(PostgreSQLPlpgsqlInnerParser.AlterrolesetstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterDroprolestmt(PostgreSQLPlpgsqlInnerParser.DroprolestmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitDroprolestmt(PostgreSQLPlpgsqlInnerParser.DroprolestmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterCreategroupstmt(PostgreSQLPlpgsqlInnerParser.CreategroupstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitCreategroupstmt(PostgreSQLPlpgsqlInnerParser.CreategroupstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterAltergroupstmt(PostgreSQLPlpgsqlInnerParser.AltergroupstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitAltergroupstmt(PostgreSQLPlpgsqlInnerParser.AltergroupstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterAdd_drop(PostgreSQLPlpgsqlInnerParser.Add_dropContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitAdd_drop(PostgreSQLPlpgsqlInnerParser.Add_dropContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterCreateschemastmt(PostgreSQLPlpgsqlInnerParser.CreateschemastmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitCreateschemastmt(PostgreSQLPlpgsqlInnerParser.CreateschemastmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOptschemaname(PostgreSQLPlpgsqlInnerParser.OptschemanameContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOptschemaname(PostgreSQLPlpgsqlInnerParser.OptschemanameContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOptschemaeltlist(PostgreSQLPlpgsqlInnerParser.OptschemaeltlistContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOptschemaeltlist(PostgreSQLPlpgsqlInnerParser.OptschemaeltlistContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterSchema_stmt(PostgreSQLPlpgsqlInnerParser.Schema_stmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitSchema_stmt(PostgreSQLPlpgsqlInnerParser.Schema_stmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterVariablesetstmt(PostgreSQLPlpgsqlInnerParser.VariablesetstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitVariablesetstmt(PostgreSQLPlpgsqlInnerParser.VariablesetstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterSet_rest(PostgreSQLPlpgsqlInnerParser.Set_restContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitSet_rest(PostgreSQLPlpgsqlInnerParser.Set_restContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterGeneric_set(PostgreSQLPlpgsqlInnerParser.Generic_setContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitGeneric_set(PostgreSQLPlpgsqlInnerParser.Generic_setContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterSet_rest_more(PostgreSQLPlpgsqlInnerParser.Set_rest_moreContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitSet_rest_more(PostgreSQLPlpgsqlInnerParser.Set_rest_moreContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterVar_name(PostgreSQLPlpgsqlInnerParser.Var_nameContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitVar_name(PostgreSQLPlpgsqlInnerParser.Var_nameContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterVar_list(PostgreSQLPlpgsqlInnerParser.Var_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitVar_list(PostgreSQLPlpgsqlInnerParser.Var_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterVar_value(PostgreSQLPlpgsqlInnerParser.Var_valueContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitVar_value(PostgreSQLPlpgsqlInnerParser.Var_valueContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterIso_level(PostgreSQLPlpgsqlInnerParser.Iso_levelContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitIso_level(PostgreSQLPlpgsqlInnerParser.Iso_levelContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_boolean_or_string(PostgreSQLPlpgsqlInnerParser.Opt_boolean_or_stringContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_boolean_or_string(PostgreSQLPlpgsqlInnerParser.Opt_boolean_or_stringContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterZone_value(PostgreSQLPlpgsqlInnerParser.Zone_valueContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitZone_value(PostgreSQLPlpgsqlInnerParser.Zone_valueContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_encoding(PostgreSQLPlpgsqlInnerParser.Opt_encodingContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_encoding(PostgreSQLPlpgsqlInnerParser.Opt_encodingContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterNonreservedword_or_sconst(PostgreSQLPlpgsqlInnerParser.Nonreservedword_or_sconstContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitNonreservedword_or_sconst(PostgreSQLPlpgsqlInnerParser.Nonreservedword_or_sconstContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterVariableresetstmt(PostgreSQLPlpgsqlInnerParser.VariableresetstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitVariableresetstmt(PostgreSQLPlpgsqlInnerParser.VariableresetstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterReset_rest(PostgreSQLPlpgsqlInnerParser.Reset_restContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitReset_rest(PostgreSQLPlpgsqlInnerParser.Reset_restContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterGeneric_reset(PostgreSQLPlpgsqlInnerParser.Generic_resetContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitGeneric_reset(PostgreSQLPlpgsqlInnerParser.Generic_resetContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterSetresetclause(PostgreSQLPlpgsqlInnerParser.SetresetclauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitSetresetclause(PostgreSQLPlpgsqlInnerParser.SetresetclauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterFunctionsetresetclause(PostgreSQLPlpgsqlInnerParser.FunctionsetresetclauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitFunctionsetresetclause(PostgreSQLPlpgsqlInnerParser.FunctionsetresetclauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterVariableshowstmt(PostgreSQLPlpgsqlInnerParser.VariableshowstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitVariableshowstmt(PostgreSQLPlpgsqlInnerParser.VariableshowstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterConstraintssetstmt(PostgreSQLPlpgsqlInnerParser.ConstraintssetstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitConstraintssetstmt(PostgreSQLPlpgsqlInnerParser.ConstraintssetstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterConstraints_set_list(PostgreSQLPlpgsqlInnerParser.Constraints_set_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitConstraints_set_list(PostgreSQLPlpgsqlInnerParser.Constraints_set_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterConstraints_set_mode(PostgreSQLPlpgsqlInnerParser.Constraints_set_modeContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitConstraints_set_mode(PostgreSQLPlpgsqlInnerParser.Constraints_set_modeContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterCheckpointstmt(PostgreSQLPlpgsqlInnerParser.CheckpointstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitCheckpointstmt(PostgreSQLPlpgsqlInnerParser.CheckpointstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterDiscardstmt(PostgreSQLPlpgsqlInnerParser.DiscardstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitDiscardstmt(PostgreSQLPlpgsqlInnerParser.DiscardstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterAltertablestmt(PostgreSQLPlpgsqlInnerParser.AltertablestmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitAltertablestmt(PostgreSQLPlpgsqlInnerParser.AltertablestmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterAlter_table_cmds(PostgreSQLPlpgsqlInnerParser.Alter_table_cmdsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitAlter_table_cmds(PostgreSQLPlpgsqlInnerParser.Alter_table_cmdsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterPartition_cmd(PostgreSQLPlpgsqlInnerParser.Partition_cmdContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitPartition_cmd(PostgreSQLPlpgsqlInnerParser.Partition_cmdContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterIndex_partition_cmd(PostgreSQLPlpgsqlInnerParser.Index_partition_cmdContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitIndex_partition_cmd(PostgreSQLPlpgsqlInnerParser.Index_partition_cmdContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterAlter_table_cmd(PostgreSQLPlpgsqlInnerParser.Alter_table_cmdContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitAlter_table_cmd(PostgreSQLPlpgsqlInnerParser.Alter_table_cmdContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterAlter_column_default(PostgreSQLPlpgsqlInnerParser.Alter_column_defaultContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitAlter_column_default(PostgreSQLPlpgsqlInnerParser.Alter_column_defaultContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_drop_behavior(PostgreSQLPlpgsqlInnerParser.Opt_drop_behaviorContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_drop_behavior(PostgreSQLPlpgsqlInnerParser.Opt_drop_behaviorContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_collate_clause(PostgreSQLPlpgsqlInnerParser.Opt_collate_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_collate_clause(PostgreSQLPlpgsqlInnerParser.Opt_collate_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterAlter_using(PostgreSQLPlpgsqlInnerParser.Alter_usingContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitAlter_using(PostgreSQLPlpgsqlInnerParser.Alter_usingContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterReplica_identity(PostgreSQLPlpgsqlInnerParser.Replica_identityContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitReplica_identity(PostgreSQLPlpgsqlInnerParser.Replica_identityContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterReloptions(PostgreSQLPlpgsqlInnerParser.ReloptionsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitReloptions(PostgreSQLPlpgsqlInnerParser.ReloptionsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_reloptions(PostgreSQLPlpgsqlInnerParser.Opt_reloptionsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_reloptions(PostgreSQLPlpgsqlInnerParser.Opt_reloptionsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterReloption_list(PostgreSQLPlpgsqlInnerParser.Reloption_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitReloption_list(PostgreSQLPlpgsqlInnerParser.Reloption_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterReloption_elem(PostgreSQLPlpgsqlInnerParser.Reloption_elemContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitReloption_elem(PostgreSQLPlpgsqlInnerParser.Reloption_elemContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterAlter_identity_column_option_list(PostgreSQLPlpgsqlInnerParser.Alter_identity_column_option_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitAlter_identity_column_option_list(PostgreSQLPlpgsqlInnerParser.Alter_identity_column_option_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterAlter_identity_column_option(PostgreSQLPlpgsqlInnerParser.Alter_identity_column_optionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitAlter_identity_column_option(PostgreSQLPlpgsqlInnerParser.Alter_identity_column_optionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterPartitionboundspec(PostgreSQLPlpgsqlInnerParser.PartitionboundspecContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitPartitionboundspec(PostgreSQLPlpgsqlInnerParser.PartitionboundspecContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterHash_partbound_elem(PostgreSQLPlpgsqlInnerParser.Hash_partbound_elemContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitHash_partbound_elem(PostgreSQLPlpgsqlInnerParser.Hash_partbound_elemContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterHash_partbound(PostgreSQLPlpgsqlInnerParser.Hash_partboundContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitHash_partbound(PostgreSQLPlpgsqlInnerParser.Hash_partboundContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterAltercompositetypestmt(PostgreSQLPlpgsqlInnerParser.AltercompositetypestmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitAltercompositetypestmt(PostgreSQLPlpgsqlInnerParser.AltercompositetypestmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterAlter_type_cmds(PostgreSQLPlpgsqlInnerParser.Alter_type_cmdsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitAlter_type_cmds(PostgreSQLPlpgsqlInnerParser.Alter_type_cmdsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterAlter_type_cmd(PostgreSQLPlpgsqlInnerParser.Alter_type_cmdContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitAlter_type_cmd(PostgreSQLPlpgsqlInnerParser.Alter_type_cmdContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterCloseportalstmt(PostgreSQLPlpgsqlInnerParser.CloseportalstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitCloseportalstmt(PostgreSQLPlpgsqlInnerParser.CloseportalstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterCopystmt(PostgreSQLPlpgsqlInnerParser.CopystmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitCopystmt(PostgreSQLPlpgsqlInnerParser.CopystmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterCopy_from(PostgreSQLPlpgsqlInnerParser.Copy_fromContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitCopy_from(PostgreSQLPlpgsqlInnerParser.Copy_fromContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_program(PostgreSQLPlpgsqlInnerParser.Opt_programContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_program(PostgreSQLPlpgsqlInnerParser.Opt_programContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterCopy_file_name(PostgreSQLPlpgsqlInnerParser.Copy_file_nameContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitCopy_file_name(PostgreSQLPlpgsqlInnerParser.Copy_file_nameContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterCopy_options(PostgreSQLPlpgsqlInnerParser.Copy_optionsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitCopy_options(PostgreSQLPlpgsqlInnerParser.Copy_optionsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterCopy_opt_list(PostgreSQLPlpgsqlInnerParser.Copy_opt_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitCopy_opt_list(PostgreSQLPlpgsqlInnerParser.Copy_opt_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterCopy_opt_item(PostgreSQLPlpgsqlInnerParser.Copy_opt_itemContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitCopy_opt_item(PostgreSQLPlpgsqlInnerParser.Copy_opt_itemContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_binary(PostgreSQLPlpgsqlInnerParser.Opt_binaryContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_binary(PostgreSQLPlpgsqlInnerParser.Opt_binaryContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterCopy_delimiter(PostgreSQLPlpgsqlInnerParser.Copy_delimiterContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitCopy_delimiter(PostgreSQLPlpgsqlInnerParser.Copy_delimiterContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_using(PostgreSQLPlpgsqlInnerParser.Opt_usingContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_using(PostgreSQLPlpgsqlInnerParser.Opt_usingContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterCopy_generic_opt_list(PostgreSQLPlpgsqlInnerParser.Copy_generic_opt_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitCopy_generic_opt_list(PostgreSQLPlpgsqlInnerParser.Copy_generic_opt_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterCopy_generic_opt_elem(PostgreSQLPlpgsqlInnerParser.Copy_generic_opt_elemContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitCopy_generic_opt_elem(PostgreSQLPlpgsqlInnerParser.Copy_generic_opt_elemContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterCopy_generic_opt_arg(PostgreSQLPlpgsqlInnerParser.Copy_generic_opt_argContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitCopy_generic_opt_arg(PostgreSQLPlpgsqlInnerParser.Copy_generic_opt_argContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterCopy_generic_opt_arg_list(PostgreSQLPlpgsqlInnerParser.Copy_generic_opt_arg_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitCopy_generic_opt_arg_list(PostgreSQLPlpgsqlInnerParser.Copy_generic_opt_arg_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterCopy_generic_opt_arg_list_item(PostgreSQLPlpgsqlInnerParser.Copy_generic_opt_arg_list_itemContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitCopy_generic_opt_arg_list_item(PostgreSQLPlpgsqlInnerParser.Copy_generic_opt_arg_list_itemContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterCreatestmt(PostgreSQLPlpgsqlInnerParser.CreatestmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitCreatestmt(PostgreSQLPlpgsqlInnerParser.CreatestmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpttemp(PostgreSQLPlpgsqlInnerParser.OpttempContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpttemp(PostgreSQLPlpgsqlInnerParser.OpttempContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpttableelementlist(PostgreSQLPlpgsqlInnerParser.OpttableelementlistContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpttableelementlist(PostgreSQLPlpgsqlInnerParser.OpttableelementlistContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpttypedtableelementlist(PostgreSQLPlpgsqlInnerParser.OpttypedtableelementlistContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpttypedtableelementlist(PostgreSQLPlpgsqlInnerParser.OpttypedtableelementlistContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterTableelementlist(PostgreSQLPlpgsqlInnerParser.TableelementlistContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitTableelementlist(PostgreSQLPlpgsqlInnerParser.TableelementlistContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterTypedtableelementlist(PostgreSQLPlpgsqlInnerParser.TypedtableelementlistContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitTypedtableelementlist(PostgreSQLPlpgsqlInnerParser.TypedtableelementlistContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterTableelement(PostgreSQLPlpgsqlInnerParser.TableelementContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitTableelement(PostgreSQLPlpgsqlInnerParser.TableelementContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterTypedtableelement(PostgreSQLPlpgsqlInnerParser.TypedtableelementContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitTypedtableelement(PostgreSQLPlpgsqlInnerParser.TypedtableelementContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterColumnDef(PostgreSQLPlpgsqlInnerParser.ColumnDefContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitColumnDef(PostgreSQLPlpgsqlInnerParser.ColumnDefContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterColumnOptions(PostgreSQLPlpgsqlInnerParser.ColumnOptionsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitColumnOptions(PostgreSQLPlpgsqlInnerParser.ColumnOptionsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterColquallist(PostgreSQLPlpgsqlInnerParser.ColquallistContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitColquallist(PostgreSQLPlpgsqlInnerParser.ColquallistContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterColconstraint(PostgreSQLPlpgsqlInnerParser.ColconstraintContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitColconstraint(PostgreSQLPlpgsqlInnerParser.ColconstraintContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterColconstraintelem(PostgreSQLPlpgsqlInnerParser.ColconstraintelemContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitColconstraintelem(PostgreSQLPlpgsqlInnerParser.ColconstraintelemContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterGenerated_when(PostgreSQLPlpgsqlInnerParser.Generated_whenContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitGenerated_when(PostgreSQLPlpgsqlInnerParser.Generated_whenContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterConstraintattr(PostgreSQLPlpgsqlInnerParser.ConstraintattrContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitConstraintattr(PostgreSQLPlpgsqlInnerParser.ConstraintattrContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterTablelikeclause(PostgreSQLPlpgsqlInnerParser.TablelikeclauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitTablelikeclause(PostgreSQLPlpgsqlInnerParser.TablelikeclauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterTablelikeoptionlist(PostgreSQLPlpgsqlInnerParser.TablelikeoptionlistContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitTablelikeoptionlist(PostgreSQLPlpgsqlInnerParser.TablelikeoptionlistContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterTablelikeoption(PostgreSQLPlpgsqlInnerParser.TablelikeoptionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitTablelikeoption(PostgreSQLPlpgsqlInnerParser.TablelikeoptionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterTableconstraint(PostgreSQLPlpgsqlInnerParser.TableconstraintContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitTableconstraint(PostgreSQLPlpgsqlInnerParser.TableconstraintContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterConstraintelem(PostgreSQLPlpgsqlInnerParser.ConstraintelemContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitConstraintelem(PostgreSQLPlpgsqlInnerParser.ConstraintelemContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_no_inherit(PostgreSQLPlpgsqlInnerParser.Opt_no_inheritContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_no_inherit(PostgreSQLPlpgsqlInnerParser.Opt_no_inheritContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_column_list(PostgreSQLPlpgsqlInnerParser.Opt_column_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_column_list(PostgreSQLPlpgsqlInnerParser.Opt_column_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterColumnlist(PostgreSQLPlpgsqlInnerParser.ColumnlistContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitColumnlist(PostgreSQLPlpgsqlInnerParser.ColumnlistContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterColumnElem(PostgreSQLPlpgsqlInnerParser.ColumnElemContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitColumnElem(PostgreSQLPlpgsqlInnerParser.ColumnElemContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_c_include(PostgreSQLPlpgsqlInnerParser.Opt_c_includeContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_c_include(PostgreSQLPlpgsqlInnerParser.Opt_c_includeContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterKey_match(PostgreSQLPlpgsqlInnerParser.Key_matchContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitKey_match(PostgreSQLPlpgsqlInnerParser.Key_matchContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterExclusionconstraintlist(PostgreSQLPlpgsqlInnerParser.ExclusionconstraintlistContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitExclusionconstraintlist(PostgreSQLPlpgsqlInnerParser.ExclusionconstraintlistContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterExclusionconstraintelem(PostgreSQLPlpgsqlInnerParser.ExclusionconstraintelemContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitExclusionconstraintelem(PostgreSQLPlpgsqlInnerParser.ExclusionconstraintelemContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterExclusionwhereclause(PostgreSQLPlpgsqlInnerParser.ExclusionwhereclauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitExclusionwhereclause(PostgreSQLPlpgsqlInnerParser.ExclusionwhereclauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterKey_actions(PostgreSQLPlpgsqlInnerParser.Key_actionsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitKey_actions(PostgreSQLPlpgsqlInnerParser.Key_actionsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterKey_update(PostgreSQLPlpgsqlInnerParser.Key_updateContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitKey_update(PostgreSQLPlpgsqlInnerParser.Key_updateContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterKey_delete(PostgreSQLPlpgsqlInnerParser.Key_deleteContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitKey_delete(PostgreSQLPlpgsqlInnerParser.Key_deleteContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterKey_action(PostgreSQLPlpgsqlInnerParser.Key_actionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitKey_action(PostgreSQLPlpgsqlInnerParser.Key_actionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOptinherit(PostgreSQLPlpgsqlInnerParser.OptinheritContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOptinherit(PostgreSQLPlpgsqlInnerParser.OptinheritContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOptpartitionspec(PostgreSQLPlpgsqlInnerParser.OptpartitionspecContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOptpartitionspec(PostgreSQLPlpgsqlInnerParser.OptpartitionspecContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterPartitionspec(PostgreSQLPlpgsqlInnerParser.PartitionspecContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitPartitionspec(PostgreSQLPlpgsqlInnerParser.PartitionspecContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterPart_params(PostgreSQLPlpgsqlInnerParser.Part_paramsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitPart_params(PostgreSQLPlpgsqlInnerParser.Part_paramsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterPart_elem(PostgreSQLPlpgsqlInnerParser.Part_elemContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitPart_elem(PostgreSQLPlpgsqlInnerParser.Part_elemContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterTable_access_method_clause(PostgreSQLPlpgsqlInnerParser.Table_access_method_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitTable_access_method_clause(PostgreSQLPlpgsqlInnerParser.Table_access_method_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOptwith(PostgreSQLPlpgsqlInnerParser.OptwithContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOptwith(PostgreSQLPlpgsqlInnerParser.OptwithContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOncommitoption(PostgreSQLPlpgsqlInnerParser.OncommitoptionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOncommitoption(PostgreSQLPlpgsqlInnerParser.OncommitoptionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpttablespace(PostgreSQLPlpgsqlInnerParser.OpttablespaceContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpttablespace(PostgreSQLPlpgsqlInnerParser.OpttablespaceContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOptconstablespace(PostgreSQLPlpgsqlInnerParser.OptconstablespaceContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOptconstablespace(PostgreSQLPlpgsqlInnerParser.OptconstablespaceContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterExistingindex(PostgreSQLPlpgsqlInnerParser.ExistingindexContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitExistingindex(PostgreSQLPlpgsqlInnerParser.ExistingindexContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterCreatestatsstmt(PostgreSQLPlpgsqlInnerParser.CreatestatsstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitCreatestatsstmt(PostgreSQLPlpgsqlInnerParser.CreatestatsstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterAlterstatsstmt(PostgreSQLPlpgsqlInnerParser.AlterstatsstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitAlterstatsstmt(PostgreSQLPlpgsqlInnerParser.AlterstatsstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterCreateasstmt(PostgreSQLPlpgsqlInnerParser.CreateasstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitCreateasstmt(PostgreSQLPlpgsqlInnerParser.CreateasstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterCreate_as_target(PostgreSQLPlpgsqlInnerParser.Create_as_targetContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitCreate_as_target(PostgreSQLPlpgsqlInnerParser.Create_as_targetContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_with_data(PostgreSQLPlpgsqlInnerParser.Opt_with_dataContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_with_data(PostgreSQLPlpgsqlInnerParser.Opt_with_dataContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterCreatematviewstmt(PostgreSQLPlpgsqlInnerParser.CreatematviewstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitCreatematviewstmt(PostgreSQLPlpgsqlInnerParser.CreatematviewstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterCreate_mv_target(PostgreSQLPlpgsqlInnerParser.Create_mv_targetContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitCreate_mv_target(PostgreSQLPlpgsqlInnerParser.Create_mv_targetContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOptnolog(PostgreSQLPlpgsqlInnerParser.OptnologContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOptnolog(PostgreSQLPlpgsqlInnerParser.OptnologContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterRefreshmatviewstmt(PostgreSQLPlpgsqlInnerParser.RefreshmatviewstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitRefreshmatviewstmt(PostgreSQLPlpgsqlInnerParser.RefreshmatviewstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterCreateseqstmt(PostgreSQLPlpgsqlInnerParser.CreateseqstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitCreateseqstmt(PostgreSQLPlpgsqlInnerParser.CreateseqstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterAlterseqstmt(PostgreSQLPlpgsqlInnerParser.AlterseqstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitAlterseqstmt(PostgreSQLPlpgsqlInnerParser.AlterseqstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOptseqoptlist(PostgreSQLPlpgsqlInnerParser.OptseqoptlistContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOptseqoptlist(PostgreSQLPlpgsqlInnerParser.OptseqoptlistContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOptparenthesizedseqoptlist(PostgreSQLPlpgsqlInnerParser.OptparenthesizedseqoptlistContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOptparenthesizedseqoptlist(PostgreSQLPlpgsqlInnerParser.OptparenthesizedseqoptlistContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterSeqoptlist(PostgreSQLPlpgsqlInnerParser.SeqoptlistContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitSeqoptlist(PostgreSQLPlpgsqlInnerParser.SeqoptlistContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterSeqoptelem(PostgreSQLPlpgsqlInnerParser.SeqoptelemContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitSeqoptelem(PostgreSQLPlpgsqlInnerParser.SeqoptelemContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_by(PostgreSQLPlpgsqlInnerParser.Opt_byContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_by(PostgreSQLPlpgsqlInnerParser.Opt_byContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterNumericonly(PostgreSQLPlpgsqlInnerParser.NumericonlyContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitNumericonly(PostgreSQLPlpgsqlInnerParser.NumericonlyContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterNumericonly_list(PostgreSQLPlpgsqlInnerParser.Numericonly_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitNumericonly_list(PostgreSQLPlpgsqlInnerParser.Numericonly_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterCreateplangstmt(PostgreSQLPlpgsqlInnerParser.CreateplangstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitCreateplangstmt(PostgreSQLPlpgsqlInnerParser.CreateplangstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_trusted(PostgreSQLPlpgsqlInnerParser.Opt_trustedContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_trusted(PostgreSQLPlpgsqlInnerParser.Opt_trustedContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterHandler_name(PostgreSQLPlpgsqlInnerParser.Handler_nameContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitHandler_name(PostgreSQLPlpgsqlInnerParser.Handler_nameContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_inline_handler(PostgreSQLPlpgsqlInnerParser.Opt_inline_handlerContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_inline_handler(PostgreSQLPlpgsqlInnerParser.Opt_inline_handlerContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterValidator_clause(PostgreSQLPlpgsqlInnerParser.Validator_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitValidator_clause(PostgreSQLPlpgsqlInnerParser.Validator_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_validator(PostgreSQLPlpgsqlInnerParser.Opt_validatorContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_validator(PostgreSQLPlpgsqlInnerParser.Opt_validatorContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_procedural(PostgreSQLPlpgsqlInnerParser.Opt_proceduralContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_procedural(PostgreSQLPlpgsqlInnerParser.Opt_proceduralContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterCreatetablespacestmt(PostgreSQLPlpgsqlInnerParser.CreatetablespacestmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitCreatetablespacestmt(PostgreSQLPlpgsqlInnerParser.CreatetablespacestmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpttablespaceowner(PostgreSQLPlpgsqlInnerParser.OpttablespaceownerContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpttablespaceowner(PostgreSQLPlpgsqlInnerParser.OpttablespaceownerContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterDroptablespacestmt(PostgreSQLPlpgsqlInnerParser.DroptablespacestmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitDroptablespacestmt(PostgreSQLPlpgsqlInnerParser.DroptablespacestmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterCreateextensionstmt(PostgreSQLPlpgsqlInnerParser.CreateextensionstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitCreateextensionstmt(PostgreSQLPlpgsqlInnerParser.CreateextensionstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterCreate_extension_opt_list(PostgreSQLPlpgsqlInnerParser.Create_extension_opt_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitCreate_extension_opt_list(PostgreSQLPlpgsqlInnerParser.Create_extension_opt_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterCreate_extension_opt_item(PostgreSQLPlpgsqlInnerParser.Create_extension_opt_itemContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitCreate_extension_opt_item(PostgreSQLPlpgsqlInnerParser.Create_extension_opt_itemContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterAlterextensionstmt(PostgreSQLPlpgsqlInnerParser.AlterextensionstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitAlterextensionstmt(PostgreSQLPlpgsqlInnerParser.AlterextensionstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterAlter_extension_opt_list(PostgreSQLPlpgsqlInnerParser.Alter_extension_opt_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitAlter_extension_opt_list(PostgreSQLPlpgsqlInnerParser.Alter_extension_opt_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterAlter_extension_opt_item(PostgreSQLPlpgsqlInnerParser.Alter_extension_opt_itemContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitAlter_extension_opt_item(PostgreSQLPlpgsqlInnerParser.Alter_extension_opt_itemContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterAlterextensioncontentsstmt(PostgreSQLPlpgsqlInnerParser.AlterextensioncontentsstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitAlterextensioncontentsstmt(PostgreSQLPlpgsqlInnerParser.AlterextensioncontentsstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterCreatefdwstmt(PostgreSQLPlpgsqlInnerParser.CreatefdwstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitCreatefdwstmt(PostgreSQLPlpgsqlInnerParser.CreatefdwstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterFdw_option(PostgreSQLPlpgsqlInnerParser.Fdw_optionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitFdw_option(PostgreSQLPlpgsqlInnerParser.Fdw_optionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterFdw_options(PostgreSQLPlpgsqlInnerParser.Fdw_optionsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitFdw_options(PostgreSQLPlpgsqlInnerParser.Fdw_optionsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_fdw_options(PostgreSQLPlpgsqlInnerParser.Opt_fdw_optionsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_fdw_options(PostgreSQLPlpgsqlInnerParser.Opt_fdw_optionsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterAlterfdwstmt(PostgreSQLPlpgsqlInnerParser.AlterfdwstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitAlterfdwstmt(PostgreSQLPlpgsqlInnerParser.AlterfdwstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterCreate_generic_options(PostgreSQLPlpgsqlInnerParser.Create_generic_optionsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitCreate_generic_options(PostgreSQLPlpgsqlInnerParser.Create_generic_optionsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterGeneric_option_list(PostgreSQLPlpgsqlInnerParser.Generic_option_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitGeneric_option_list(PostgreSQLPlpgsqlInnerParser.Generic_option_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterAlter_generic_options(PostgreSQLPlpgsqlInnerParser.Alter_generic_optionsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitAlter_generic_options(PostgreSQLPlpgsqlInnerParser.Alter_generic_optionsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterAlter_generic_option_list(PostgreSQLPlpgsqlInnerParser.Alter_generic_option_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitAlter_generic_option_list(PostgreSQLPlpgsqlInnerParser.Alter_generic_option_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterAlter_generic_option_elem(PostgreSQLPlpgsqlInnerParser.Alter_generic_option_elemContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitAlter_generic_option_elem(PostgreSQLPlpgsqlInnerParser.Alter_generic_option_elemContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterGeneric_option_elem(PostgreSQLPlpgsqlInnerParser.Generic_option_elemContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitGeneric_option_elem(PostgreSQLPlpgsqlInnerParser.Generic_option_elemContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterGeneric_option_name(PostgreSQLPlpgsqlInnerParser.Generic_option_nameContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitGeneric_option_name(PostgreSQLPlpgsqlInnerParser.Generic_option_nameContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterGeneric_option_arg(PostgreSQLPlpgsqlInnerParser.Generic_option_argContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitGeneric_option_arg(PostgreSQLPlpgsqlInnerParser.Generic_option_argContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterCreateforeignserverstmt(PostgreSQLPlpgsqlInnerParser.CreateforeignserverstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitCreateforeignserverstmt(PostgreSQLPlpgsqlInnerParser.CreateforeignserverstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_type(PostgreSQLPlpgsqlInnerParser.Opt_typeContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_type(PostgreSQLPlpgsqlInnerParser.Opt_typeContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterForeign_server_version(PostgreSQLPlpgsqlInnerParser.Foreign_server_versionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitForeign_server_version(PostgreSQLPlpgsqlInnerParser.Foreign_server_versionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_foreign_server_version(PostgreSQLPlpgsqlInnerParser.Opt_foreign_server_versionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_foreign_server_version(PostgreSQLPlpgsqlInnerParser.Opt_foreign_server_versionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterAlterforeignserverstmt(PostgreSQLPlpgsqlInnerParser.AlterforeignserverstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitAlterforeignserverstmt(PostgreSQLPlpgsqlInnerParser.AlterforeignserverstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterCreateforeigntablestmt(PostgreSQLPlpgsqlInnerParser.CreateforeigntablestmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitCreateforeigntablestmt(PostgreSQLPlpgsqlInnerParser.CreateforeigntablestmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterImportforeignschemastmt(PostgreSQLPlpgsqlInnerParser.ImportforeignschemastmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitImportforeignschemastmt(PostgreSQLPlpgsqlInnerParser.ImportforeignschemastmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterImport_qualification_type(PostgreSQLPlpgsqlInnerParser.Import_qualification_typeContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitImport_qualification_type(PostgreSQLPlpgsqlInnerParser.Import_qualification_typeContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterImport_qualification(PostgreSQLPlpgsqlInnerParser.Import_qualificationContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitImport_qualification(PostgreSQLPlpgsqlInnerParser.Import_qualificationContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterCreateusermappingstmt(PostgreSQLPlpgsqlInnerParser.CreateusermappingstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitCreateusermappingstmt(PostgreSQLPlpgsqlInnerParser.CreateusermappingstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterAuth_ident(PostgreSQLPlpgsqlInnerParser.Auth_identContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitAuth_ident(PostgreSQLPlpgsqlInnerParser.Auth_identContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterDropusermappingstmt(PostgreSQLPlpgsqlInnerParser.DropusermappingstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitDropusermappingstmt(PostgreSQLPlpgsqlInnerParser.DropusermappingstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterAlterusermappingstmt(PostgreSQLPlpgsqlInnerParser.AlterusermappingstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitAlterusermappingstmt(PostgreSQLPlpgsqlInnerParser.AlterusermappingstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterCreatepolicystmt(PostgreSQLPlpgsqlInnerParser.CreatepolicystmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitCreatepolicystmt(PostgreSQLPlpgsqlInnerParser.CreatepolicystmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterAlterpolicystmt(PostgreSQLPlpgsqlInnerParser.AlterpolicystmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitAlterpolicystmt(PostgreSQLPlpgsqlInnerParser.AlterpolicystmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterRowsecurityoptionalexpr(PostgreSQLPlpgsqlInnerParser.RowsecurityoptionalexprContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitRowsecurityoptionalexpr(PostgreSQLPlpgsqlInnerParser.RowsecurityoptionalexprContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterRowsecurityoptionalwithcheck(PostgreSQLPlpgsqlInnerParser.RowsecurityoptionalwithcheckContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitRowsecurityoptionalwithcheck(PostgreSQLPlpgsqlInnerParser.RowsecurityoptionalwithcheckContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterRowsecuritydefaulttorole(PostgreSQLPlpgsqlInnerParser.RowsecuritydefaulttoroleContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitRowsecuritydefaulttorole(PostgreSQLPlpgsqlInnerParser.RowsecuritydefaulttoroleContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterRowsecurityoptionaltorole(PostgreSQLPlpgsqlInnerParser.RowsecurityoptionaltoroleContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitRowsecurityoptionaltorole(PostgreSQLPlpgsqlInnerParser.RowsecurityoptionaltoroleContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterRowsecuritydefaultpermissive(PostgreSQLPlpgsqlInnerParser.RowsecuritydefaultpermissiveContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitRowsecuritydefaultpermissive(PostgreSQLPlpgsqlInnerParser.RowsecuritydefaultpermissiveContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterRowsecuritydefaultforcmd(PostgreSQLPlpgsqlInnerParser.RowsecuritydefaultforcmdContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitRowsecuritydefaultforcmd(PostgreSQLPlpgsqlInnerParser.RowsecuritydefaultforcmdContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterRow_security_cmd(PostgreSQLPlpgsqlInnerParser.Row_security_cmdContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitRow_security_cmd(PostgreSQLPlpgsqlInnerParser.Row_security_cmdContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterCreateamstmt(PostgreSQLPlpgsqlInnerParser.CreateamstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitCreateamstmt(PostgreSQLPlpgsqlInnerParser.CreateamstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterAm_type(PostgreSQLPlpgsqlInnerParser.Am_typeContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitAm_type(PostgreSQLPlpgsqlInnerParser.Am_typeContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterCreatetrigstmt(PostgreSQLPlpgsqlInnerParser.CreatetrigstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitCreatetrigstmt(PostgreSQLPlpgsqlInnerParser.CreatetrigstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterTriggeractiontime(PostgreSQLPlpgsqlInnerParser.TriggeractiontimeContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitTriggeractiontime(PostgreSQLPlpgsqlInnerParser.TriggeractiontimeContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterTriggerevents(PostgreSQLPlpgsqlInnerParser.TriggereventsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitTriggerevents(PostgreSQLPlpgsqlInnerParser.TriggereventsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterTriggeroneevent(PostgreSQLPlpgsqlInnerParser.TriggeroneeventContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitTriggeroneevent(PostgreSQLPlpgsqlInnerParser.TriggeroneeventContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterTriggerreferencing(PostgreSQLPlpgsqlInnerParser.TriggerreferencingContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitTriggerreferencing(PostgreSQLPlpgsqlInnerParser.TriggerreferencingContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterTriggertransitions(PostgreSQLPlpgsqlInnerParser.TriggertransitionsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitTriggertransitions(PostgreSQLPlpgsqlInnerParser.TriggertransitionsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterTriggertransition(PostgreSQLPlpgsqlInnerParser.TriggertransitionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitTriggertransition(PostgreSQLPlpgsqlInnerParser.TriggertransitionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterTransitionoldornew(PostgreSQLPlpgsqlInnerParser.TransitionoldornewContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitTransitionoldornew(PostgreSQLPlpgsqlInnerParser.TransitionoldornewContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterTransitionrowortable(PostgreSQLPlpgsqlInnerParser.TransitionrowortableContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitTransitionrowortable(PostgreSQLPlpgsqlInnerParser.TransitionrowortableContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterTransitionrelname(PostgreSQLPlpgsqlInnerParser.TransitionrelnameContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitTransitionrelname(PostgreSQLPlpgsqlInnerParser.TransitionrelnameContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterTriggerforspec(PostgreSQLPlpgsqlInnerParser.TriggerforspecContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitTriggerforspec(PostgreSQLPlpgsqlInnerParser.TriggerforspecContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterTriggerforopteach(PostgreSQLPlpgsqlInnerParser.TriggerforopteachContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitTriggerforopteach(PostgreSQLPlpgsqlInnerParser.TriggerforopteachContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterTriggerfortype(PostgreSQLPlpgsqlInnerParser.TriggerfortypeContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitTriggerfortype(PostgreSQLPlpgsqlInnerParser.TriggerfortypeContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterTriggerwhen(PostgreSQLPlpgsqlInnerParser.TriggerwhenContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitTriggerwhen(PostgreSQLPlpgsqlInnerParser.TriggerwhenContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterFunction_or_procedure(PostgreSQLPlpgsqlInnerParser.Function_or_procedureContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitFunction_or_procedure(PostgreSQLPlpgsqlInnerParser.Function_or_procedureContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterTriggerfuncargs(PostgreSQLPlpgsqlInnerParser.TriggerfuncargsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitTriggerfuncargs(PostgreSQLPlpgsqlInnerParser.TriggerfuncargsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterTriggerfuncarg(PostgreSQLPlpgsqlInnerParser.TriggerfuncargContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitTriggerfuncarg(PostgreSQLPlpgsqlInnerParser.TriggerfuncargContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOptconstrfromtable(PostgreSQLPlpgsqlInnerParser.OptconstrfromtableContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOptconstrfromtable(PostgreSQLPlpgsqlInnerParser.OptconstrfromtableContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterConstraintattributespec(PostgreSQLPlpgsqlInnerParser.ConstraintattributespecContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitConstraintattributespec(PostgreSQLPlpgsqlInnerParser.ConstraintattributespecContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterConstraintattributeElem(PostgreSQLPlpgsqlInnerParser.ConstraintattributeElemContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitConstraintattributeElem(PostgreSQLPlpgsqlInnerParser.ConstraintattributeElemContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterCreateeventtrigstmt(PostgreSQLPlpgsqlInnerParser.CreateeventtrigstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitCreateeventtrigstmt(PostgreSQLPlpgsqlInnerParser.CreateeventtrigstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterEvent_trigger_when_list(PostgreSQLPlpgsqlInnerParser.Event_trigger_when_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitEvent_trigger_when_list(PostgreSQLPlpgsqlInnerParser.Event_trigger_when_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterEvent_trigger_when_item(PostgreSQLPlpgsqlInnerParser.Event_trigger_when_itemContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitEvent_trigger_when_item(PostgreSQLPlpgsqlInnerParser.Event_trigger_when_itemContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterEvent_trigger_value_list(PostgreSQLPlpgsqlInnerParser.Event_trigger_value_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitEvent_trigger_value_list(PostgreSQLPlpgsqlInnerParser.Event_trigger_value_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterAltereventtrigstmt(PostgreSQLPlpgsqlInnerParser.AltereventtrigstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitAltereventtrigstmt(PostgreSQLPlpgsqlInnerParser.AltereventtrigstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterEnable_trigger(PostgreSQLPlpgsqlInnerParser.Enable_triggerContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitEnable_trigger(PostgreSQLPlpgsqlInnerParser.Enable_triggerContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterCreateassertionstmt(PostgreSQLPlpgsqlInnerParser.CreateassertionstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitCreateassertionstmt(PostgreSQLPlpgsqlInnerParser.CreateassertionstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterDefinestmt(PostgreSQLPlpgsqlInnerParser.DefinestmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitDefinestmt(PostgreSQLPlpgsqlInnerParser.DefinestmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterDefinition(PostgreSQLPlpgsqlInnerParser.DefinitionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitDefinition(PostgreSQLPlpgsqlInnerParser.DefinitionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterDef_list(PostgreSQLPlpgsqlInnerParser.Def_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitDef_list(PostgreSQLPlpgsqlInnerParser.Def_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterDef_elem(PostgreSQLPlpgsqlInnerParser.Def_elemContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitDef_elem(PostgreSQLPlpgsqlInnerParser.Def_elemContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterDef_arg(PostgreSQLPlpgsqlInnerParser.Def_argContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitDef_arg(PostgreSQLPlpgsqlInnerParser.Def_argContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOld_aggr_definition(PostgreSQLPlpgsqlInnerParser.Old_aggr_definitionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOld_aggr_definition(PostgreSQLPlpgsqlInnerParser.Old_aggr_definitionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOld_aggr_list(PostgreSQLPlpgsqlInnerParser.Old_aggr_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOld_aggr_list(PostgreSQLPlpgsqlInnerParser.Old_aggr_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOld_aggr_elem(PostgreSQLPlpgsqlInnerParser.Old_aggr_elemContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOld_aggr_elem(PostgreSQLPlpgsqlInnerParser.Old_aggr_elemContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_enum_val_list(PostgreSQLPlpgsqlInnerParser.Opt_enum_val_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_enum_val_list(PostgreSQLPlpgsqlInnerParser.Opt_enum_val_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterEnum_val_list(PostgreSQLPlpgsqlInnerParser.Enum_val_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitEnum_val_list(PostgreSQLPlpgsqlInnerParser.Enum_val_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterAlterenumstmt(PostgreSQLPlpgsqlInnerParser.AlterenumstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitAlterenumstmt(PostgreSQLPlpgsqlInnerParser.AlterenumstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_if_not_exists(PostgreSQLPlpgsqlInnerParser.Opt_if_not_existsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_if_not_exists(PostgreSQLPlpgsqlInnerParser.Opt_if_not_existsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterCreateopclassstmt(PostgreSQLPlpgsqlInnerParser.CreateopclassstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitCreateopclassstmt(PostgreSQLPlpgsqlInnerParser.CreateopclassstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpclass_item_list(PostgreSQLPlpgsqlInnerParser.Opclass_item_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpclass_item_list(PostgreSQLPlpgsqlInnerParser.Opclass_item_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpclass_item(PostgreSQLPlpgsqlInnerParser.Opclass_itemContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpclass_item(PostgreSQLPlpgsqlInnerParser.Opclass_itemContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_default(PostgreSQLPlpgsqlInnerParser.Opt_defaultContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_default(PostgreSQLPlpgsqlInnerParser.Opt_defaultContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_opfamily(PostgreSQLPlpgsqlInnerParser.Opt_opfamilyContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_opfamily(PostgreSQLPlpgsqlInnerParser.Opt_opfamilyContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpclass_purpose(PostgreSQLPlpgsqlInnerParser.Opclass_purposeContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpclass_purpose(PostgreSQLPlpgsqlInnerParser.Opclass_purposeContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_recheck(PostgreSQLPlpgsqlInnerParser.Opt_recheckContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_recheck(PostgreSQLPlpgsqlInnerParser.Opt_recheckContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterCreateopfamilystmt(PostgreSQLPlpgsqlInnerParser.CreateopfamilystmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitCreateopfamilystmt(PostgreSQLPlpgsqlInnerParser.CreateopfamilystmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterAlteropfamilystmt(PostgreSQLPlpgsqlInnerParser.AlteropfamilystmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitAlteropfamilystmt(PostgreSQLPlpgsqlInnerParser.AlteropfamilystmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpclass_drop_list(PostgreSQLPlpgsqlInnerParser.Opclass_drop_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpclass_drop_list(PostgreSQLPlpgsqlInnerParser.Opclass_drop_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpclass_drop(PostgreSQLPlpgsqlInnerParser.Opclass_dropContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpclass_drop(PostgreSQLPlpgsqlInnerParser.Opclass_dropContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterDropopclassstmt(PostgreSQLPlpgsqlInnerParser.DropopclassstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitDropopclassstmt(PostgreSQLPlpgsqlInnerParser.DropopclassstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterDropopfamilystmt(PostgreSQLPlpgsqlInnerParser.DropopfamilystmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitDropopfamilystmt(PostgreSQLPlpgsqlInnerParser.DropopfamilystmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterDropownedstmt(PostgreSQLPlpgsqlInnerParser.DropownedstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitDropownedstmt(PostgreSQLPlpgsqlInnerParser.DropownedstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterReassignownedstmt(PostgreSQLPlpgsqlInnerParser.ReassignownedstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitReassignownedstmt(PostgreSQLPlpgsqlInnerParser.ReassignownedstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterDropstmt(PostgreSQLPlpgsqlInnerParser.DropstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitDropstmt(PostgreSQLPlpgsqlInnerParser.DropstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterObject_type_any_name(PostgreSQLPlpgsqlInnerParser.Object_type_any_nameContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitObject_type_any_name(PostgreSQLPlpgsqlInnerParser.Object_type_any_nameContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterObject_type_name(PostgreSQLPlpgsqlInnerParser.Object_type_nameContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitObject_type_name(PostgreSQLPlpgsqlInnerParser.Object_type_nameContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterDrop_type_name(PostgreSQLPlpgsqlInnerParser.Drop_type_nameContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitDrop_type_name(PostgreSQLPlpgsqlInnerParser.Drop_type_nameContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterObject_type_name_on_any_name(PostgreSQLPlpgsqlInnerParser.Object_type_name_on_any_nameContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitObject_type_name_on_any_name(PostgreSQLPlpgsqlInnerParser.Object_type_name_on_any_nameContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterAny_name_list(PostgreSQLPlpgsqlInnerParser.Any_name_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitAny_name_list(PostgreSQLPlpgsqlInnerParser.Any_name_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterAny_name(PostgreSQLPlpgsqlInnerParser.Any_nameContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitAny_name(PostgreSQLPlpgsqlInnerParser.Any_nameContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterAttrs(PostgreSQLPlpgsqlInnerParser.AttrsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitAttrs(PostgreSQLPlpgsqlInnerParser.AttrsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterType_name_list(PostgreSQLPlpgsqlInnerParser.Type_name_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitType_name_list(PostgreSQLPlpgsqlInnerParser.Type_name_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterTruncatestmt(PostgreSQLPlpgsqlInnerParser.TruncatestmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitTruncatestmt(PostgreSQLPlpgsqlInnerParser.TruncatestmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_restart_seqs(PostgreSQLPlpgsqlInnerParser.Opt_restart_seqsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_restart_seqs(PostgreSQLPlpgsqlInnerParser.Opt_restart_seqsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterCommentstmt(PostgreSQLPlpgsqlInnerParser.CommentstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitCommentstmt(PostgreSQLPlpgsqlInnerParser.CommentstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterComment_text(PostgreSQLPlpgsqlInnerParser.Comment_textContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitComment_text(PostgreSQLPlpgsqlInnerParser.Comment_textContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterSeclabelstmt(PostgreSQLPlpgsqlInnerParser.SeclabelstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitSeclabelstmt(PostgreSQLPlpgsqlInnerParser.SeclabelstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_provider(PostgreSQLPlpgsqlInnerParser.Opt_providerContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_provider(PostgreSQLPlpgsqlInnerParser.Opt_providerContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterSecurity_label(PostgreSQLPlpgsqlInnerParser.Security_labelContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitSecurity_label(PostgreSQLPlpgsqlInnerParser.Security_labelContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterFetchstmt(PostgreSQLPlpgsqlInnerParser.FetchstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitFetchstmt(PostgreSQLPlpgsqlInnerParser.FetchstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterFetch_args(PostgreSQLPlpgsqlInnerParser.Fetch_argsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitFetch_args(PostgreSQLPlpgsqlInnerParser.Fetch_argsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterFrom_in(PostgreSQLPlpgsqlInnerParser.From_inContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitFrom_in(PostgreSQLPlpgsqlInnerParser.From_inContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_from_in(PostgreSQLPlpgsqlInnerParser.Opt_from_inContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_from_in(PostgreSQLPlpgsqlInnerParser.Opt_from_inContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterGrantstmt(PostgreSQLPlpgsqlInnerParser.GrantstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitGrantstmt(PostgreSQLPlpgsqlInnerParser.GrantstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterRevokestmt(PostgreSQLPlpgsqlInnerParser.RevokestmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitRevokestmt(PostgreSQLPlpgsqlInnerParser.RevokestmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterPrivileges(PostgreSQLPlpgsqlInnerParser.PrivilegesContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitPrivileges(PostgreSQLPlpgsqlInnerParser.PrivilegesContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterPrivilege_list(PostgreSQLPlpgsqlInnerParser.Privilege_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitPrivilege_list(PostgreSQLPlpgsqlInnerParser.Privilege_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterPrivilege(PostgreSQLPlpgsqlInnerParser.PrivilegeContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitPrivilege(PostgreSQLPlpgsqlInnerParser.PrivilegeContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterPrivilege_target(PostgreSQLPlpgsqlInnerParser.Privilege_targetContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitPrivilege_target(PostgreSQLPlpgsqlInnerParser.Privilege_targetContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterGrantee_list(PostgreSQLPlpgsqlInnerParser.Grantee_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitGrantee_list(PostgreSQLPlpgsqlInnerParser.Grantee_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterGrantee(PostgreSQLPlpgsqlInnerParser.GranteeContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitGrantee(PostgreSQLPlpgsqlInnerParser.GranteeContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_grant_grant_option(PostgreSQLPlpgsqlInnerParser.Opt_grant_grant_optionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_grant_grant_option(PostgreSQLPlpgsqlInnerParser.Opt_grant_grant_optionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterGrantrolestmt(PostgreSQLPlpgsqlInnerParser.GrantrolestmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitGrantrolestmt(PostgreSQLPlpgsqlInnerParser.GrantrolestmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterRevokerolestmt(PostgreSQLPlpgsqlInnerParser.RevokerolestmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitRevokerolestmt(PostgreSQLPlpgsqlInnerParser.RevokerolestmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_grant_admin_option(PostgreSQLPlpgsqlInnerParser.Opt_grant_admin_optionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_grant_admin_option(PostgreSQLPlpgsqlInnerParser.Opt_grant_admin_optionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_granted_by(PostgreSQLPlpgsqlInnerParser.Opt_granted_byContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_granted_by(PostgreSQLPlpgsqlInnerParser.Opt_granted_byContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterAlterdefaultprivilegesstmt(PostgreSQLPlpgsqlInnerParser.AlterdefaultprivilegesstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitAlterdefaultprivilegesstmt(PostgreSQLPlpgsqlInnerParser.AlterdefaultprivilegesstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterDefacloptionlist(PostgreSQLPlpgsqlInnerParser.DefacloptionlistContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitDefacloptionlist(PostgreSQLPlpgsqlInnerParser.DefacloptionlistContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterDefacloption(PostgreSQLPlpgsqlInnerParser.DefacloptionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitDefacloption(PostgreSQLPlpgsqlInnerParser.DefacloptionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterDefaclaction(PostgreSQLPlpgsqlInnerParser.DefaclactionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitDefaclaction(PostgreSQLPlpgsqlInnerParser.DefaclactionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterDefacl_privilege_target(PostgreSQLPlpgsqlInnerParser.Defacl_privilege_targetContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitDefacl_privilege_target(PostgreSQLPlpgsqlInnerParser.Defacl_privilege_targetContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterIndexstmt(PostgreSQLPlpgsqlInnerParser.IndexstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitIndexstmt(PostgreSQLPlpgsqlInnerParser.IndexstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_unique(PostgreSQLPlpgsqlInnerParser.Opt_uniqueContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_unique(PostgreSQLPlpgsqlInnerParser.Opt_uniqueContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_concurrently(PostgreSQLPlpgsqlInnerParser.Opt_concurrentlyContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_concurrently(PostgreSQLPlpgsqlInnerParser.Opt_concurrentlyContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_index_name(PostgreSQLPlpgsqlInnerParser.Opt_index_nameContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_index_name(PostgreSQLPlpgsqlInnerParser.Opt_index_nameContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterAccess_method_clause(PostgreSQLPlpgsqlInnerParser.Access_method_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitAccess_method_clause(PostgreSQLPlpgsqlInnerParser.Access_method_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterIndex_params(PostgreSQLPlpgsqlInnerParser.Index_paramsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitIndex_params(PostgreSQLPlpgsqlInnerParser.Index_paramsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterIndex_elem_options(PostgreSQLPlpgsqlInnerParser.Index_elem_optionsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitIndex_elem_options(PostgreSQLPlpgsqlInnerParser.Index_elem_optionsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterIndex_elem(PostgreSQLPlpgsqlInnerParser.Index_elemContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitIndex_elem(PostgreSQLPlpgsqlInnerParser.Index_elemContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_include(PostgreSQLPlpgsqlInnerParser.Opt_includeContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_include(PostgreSQLPlpgsqlInnerParser.Opt_includeContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterIndex_including_params(PostgreSQLPlpgsqlInnerParser.Index_including_paramsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitIndex_including_params(PostgreSQLPlpgsqlInnerParser.Index_including_paramsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_collate(PostgreSQLPlpgsqlInnerParser.Opt_collateContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_collate(PostgreSQLPlpgsqlInnerParser.Opt_collateContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_class(PostgreSQLPlpgsqlInnerParser.Opt_classContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_class(PostgreSQLPlpgsqlInnerParser.Opt_classContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_asc_desc(PostgreSQLPlpgsqlInnerParser.Opt_asc_descContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_asc_desc(PostgreSQLPlpgsqlInnerParser.Opt_asc_descContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_nulls_order(PostgreSQLPlpgsqlInnerParser.Opt_nulls_orderContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_nulls_order(PostgreSQLPlpgsqlInnerParser.Opt_nulls_orderContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterCreatefunctionstmt(PostgreSQLPlpgsqlInnerParser.CreatefunctionstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitCreatefunctionstmt(PostgreSQLPlpgsqlInnerParser.CreatefunctionstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_or_replace(PostgreSQLPlpgsqlInnerParser.Opt_or_replaceContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_or_replace(PostgreSQLPlpgsqlInnerParser.Opt_or_replaceContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterFunc_args(PostgreSQLPlpgsqlInnerParser.Func_argsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitFunc_args(PostgreSQLPlpgsqlInnerParser.Func_argsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterFunc_args_list(PostgreSQLPlpgsqlInnerParser.Func_args_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitFunc_args_list(PostgreSQLPlpgsqlInnerParser.Func_args_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterFunction_with_argtypes_list(PostgreSQLPlpgsqlInnerParser.Function_with_argtypes_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitFunction_with_argtypes_list(PostgreSQLPlpgsqlInnerParser.Function_with_argtypes_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterFunction_with_argtypes(PostgreSQLPlpgsqlInnerParser.Function_with_argtypesContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitFunction_with_argtypes(PostgreSQLPlpgsqlInnerParser.Function_with_argtypesContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterFunc_args_with_defaults(PostgreSQLPlpgsqlInnerParser.Func_args_with_defaultsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitFunc_args_with_defaults(PostgreSQLPlpgsqlInnerParser.Func_args_with_defaultsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterFunc_args_with_defaults_list(PostgreSQLPlpgsqlInnerParser.Func_args_with_defaults_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitFunc_args_with_defaults_list(PostgreSQLPlpgsqlInnerParser.Func_args_with_defaults_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterFunc_arg(PostgreSQLPlpgsqlInnerParser.Func_argContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitFunc_arg(PostgreSQLPlpgsqlInnerParser.Func_argContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterArg_class(PostgreSQLPlpgsqlInnerParser.Arg_classContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitArg_class(PostgreSQLPlpgsqlInnerParser.Arg_classContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterParam_name(PostgreSQLPlpgsqlInnerParser.Param_nameContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitParam_name(PostgreSQLPlpgsqlInnerParser.Param_nameContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterFunc_return(PostgreSQLPlpgsqlInnerParser.Func_returnContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitFunc_return(PostgreSQLPlpgsqlInnerParser.Func_returnContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterFunc_type(PostgreSQLPlpgsqlInnerParser.Func_typeContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitFunc_type(PostgreSQLPlpgsqlInnerParser.Func_typeContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterFunc_arg_with_default(PostgreSQLPlpgsqlInnerParser.Func_arg_with_defaultContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitFunc_arg_with_default(PostgreSQLPlpgsqlInnerParser.Func_arg_with_defaultContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterAggr_arg(PostgreSQLPlpgsqlInnerParser.Aggr_argContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitAggr_arg(PostgreSQLPlpgsqlInnerParser.Aggr_argContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterAggr_args(PostgreSQLPlpgsqlInnerParser.Aggr_argsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitAggr_args(PostgreSQLPlpgsqlInnerParser.Aggr_argsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterAggr_args_list(PostgreSQLPlpgsqlInnerParser.Aggr_args_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitAggr_args_list(PostgreSQLPlpgsqlInnerParser.Aggr_args_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterAggregate_with_argtypes(PostgreSQLPlpgsqlInnerParser.Aggregate_with_argtypesContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitAggregate_with_argtypes(PostgreSQLPlpgsqlInnerParser.Aggregate_with_argtypesContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterAggregate_with_argtypes_list(PostgreSQLPlpgsqlInnerParser.Aggregate_with_argtypes_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitAggregate_with_argtypes_list(PostgreSQLPlpgsqlInnerParser.Aggregate_with_argtypes_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterCreatefunc_opt_list(PostgreSQLPlpgsqlInnerParser.Createfunc_opt_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitCreatefunc_opt_list(PostgreSQLPlpgsqlInnerParser.Createfunc_opt_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterCommon_func_opt_item(PostgreSQLPlpgsqlInnerParser.Common_func_opt_itemContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitCommon_func_opt_item(PostgreSQLPlpgsqlInnerParser.Common_func_opt_itemContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterCreatefunc_opt_item(PostgreSQLPlpgsqlInnerParser.Createfunc_opt_itemContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitCreatefunc_opt_item(PostgreSQLPlpgsqlInnerParser.Createfunc_opt_itemContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterFunc_as(PostgreSQLPlpgsqlInnerParser.Func_asContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitFunc_as(PostgreSQLPlpgsqlInnerParser.Func_asContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterTransform_type_list(PostgreSQLPlpgsqlInnerParser.Transform_type_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitTransform_type_list(PostgreSQLPlpgsqlInnerParser.Transform_type_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_definition(PostgreSQLPlpgsqlInnerParser.Opt_definitionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_definition(PostgreSQLPlpgsqlInnerParser.Opt_definitionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterTable_func_column(PostgreSQLPlpgsqlInnerParser.Table_func_columnContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitTable_func_column(PostgreSQLPlpgsqlInnerParser.Table_func_columnContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterTable_func_column_list(PostgreSQLPlpgsqlInnerParser.Table_func_column_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitTable_func_column_list(PostgreSQLPlpgsqlInnerParser.Table_func_column_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterAlterfunctionstmt(PostgreSQLPlpgsqlInnerParser.AlterfunctionstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitAlterfunctionstmt(PostgreSQLPlpgsqlInnerParser.AlterfunctionstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterAlterfunc_opt_list(PostgreSQLPlpgsqlInnerParser.Alterfunc_opt_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitAlterfunc_opt_list(PostgreSQLPlpgsqlInnerParser.Alterfunc_opt_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_restrict(PostgreSQLPlpgsqlInnerParser.Opt_restrictContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_restrict(PostgreSQLPlpgsqlInnerParser.Opt_restrictContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterRemovefuncstmt(PostgreSQLPlpgsqlInnerParser.RemovefuncstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitRemovefuncstmt(PostgreSQLPlpgsqlInnerParser.RemovefuncstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterRemoveaggrstmt(PostgreSQLPlpgsqlInnerParser.RemoveaggrstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitRemoveaggrstmt(PostgreSQLPlpgsqlInnerParser.RemoveaggrstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterRemoveoperstmt(PostgreSQLPlpgsqlInnerParser.RemoveoperstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitRemoveoperstmt(PostgreSQLPlpgsqlInnerParser.RemoveoperstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOper_argtypes(PostgreSQLPlpgsqlInnerParser.Oper_argtypesContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOper_argtypes(PostgreSQLPlpgsqlInnerParser.Oper_argtypesContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterAny_operator(PostgreSQLPlpgsqlInnerParser.Any_operatorContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitAny_operator(PostgreSQLPlpgsqlInnerParser.Any_operatorContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOperator_with_argtypes_list(PostgreSQLPlpgsqlInnerParser.Operator_with_argtypes_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOperator_with_argtypes_list(PostgreSQLPlpgsqlInnerParser.Operator_with_argtypes_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOperator_with_argtypes(PostgreSQLPlpgsqlInnerParser.Operator_with_argtypesContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOperator_with_argtypes(PostgreSQLPlpgsqlInnerParser.Operator_with_argtypesContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterDostmt(PostgreSQLPlpgsqlInnerParser.DostmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitDostmt(PostgreSQLPlpgsqlInnerParser.DostmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterDostmt_opt_list(PostgreSQLPlpgsqlInnerParser.Dostmt_opt_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitDostmt_opt_list(PostgreSQLPlpgsqlInnerParser.Dostmt_opt_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterDostmt_opt_item(PostgreSQLPlpgsqlInnerParser.Dostmt_opt_itemContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitDostmt_opt_item(PostgreSQLPlpgsqlInnerParser.Dostmt_opt_itemContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterCreatecaststmt(PostgreSQLPlpgsqlInnerParser.CreatecaststmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitCreatecaststmt(PostgreSQLPlpgsqlInnerParser.CreatecaststmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterCast_context(PostgreSQLPlpgsqlInnerParser.Cast_contextContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitCast_context(PostgreSQLPlpgsqlInnerParser.Cast_contextContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterDropcaststmt(PostgreSQLPlpgsqlInnerParser.DropcaststmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitDropcaststmt(PostgreSQLPlpgsqlInnerParser.DropcaststmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_if_exists(PostgreSQLPlpgsqlInnerParser.Opt_if_existsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_if_exists(PostgreSQLPlpgsqlInnerParser.Opt_if_existsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterCreatetransformstmt(PostgreSQLPlpgsqlInnerParser.CreatetransformstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitCreatetransformstmt(PostgreSQLPlpgsqlInnerParser.CreatetransformstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterTransform_element_list(PostgreSQLPlpgsqlInnerParser.Transform_element_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitTransform_element_list(PostgreSQLPlpgsqlInnerParser.Transform_element_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterDroptransformstmt(PostgreSQLPlpgsqlInnerParser.DroptransformstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitDroptransformstmt(PostgreSQLPlpgsqlInnerParser.DroptransformstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterReindexstmt(PostgreSQLPlpgsqlInnerParser.ReindexstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitReindexstmt(PostgreSQLPlpgsqlInnerParser.ReindexstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterReindex_target_type(PostgreSQLPlpgsqlInnerParser.Reindex_target_typeContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitReindex_target_type(PostgreSQLPlpgsqlInnerParser.Reindex_target_typeContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterReindex_target_multitable(PostgreSQLPlpgsqlInnerParser.Reindex_target_multitableContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitReindex_target_multitable(PostgreSQLPlpgsqlInnerParser.Reindex_target_multitableContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterReindex_option_list(PostgreSQLPlpgsqlInnerParser.Reindex_option_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitReindex_option_list(PostgreSQLPlpgsqlInnerParser.Reindex_option_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterReindex_option_elem(PostgreSQLPlpgsqlInnerParser.Reindex_option_elemContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitReindex_option_elem(PostgreSQLPlpgsqlInnerParser.Reindex_option_elemContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterAltertblspcstmt(PostgreSQLPlpgsqlInnerParser.AltertblspcstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitAltertblspcstmt(PostgreSQLPlpgsqlInnerParser.AltertblspcstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterRenamestmt(PostgreSQLPlpgsqlInnerParser.RenamestmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitRenamestmt(PostgreSQLPlpgsqlInnerParser.RenamestmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_column(PostgreSQLPlpgsqlInnerParser.Opt_columnContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_column(PostgreSQLPlpgsqlInnerParser.Opt_columnContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_set_data(PostgreSQLPlpgsqlInnerParser.Opt_set_dataContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_set_data(PostgreSQLPlpgsqlInnerParser.Opt_set_dataContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterAlterobjectdependsstmt(PostgreSQLPlpgsqlInnerParser.AlterobjectdependsstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitAlterobjectdependsstmt(PostgreSQLPlpgsqlInnerParser.AlterobjectdependsstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_no(PostgreSQLPlpgsqlInnerParser.Opt_noContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_no(PostgreSQLPlpgsqlInnerParser.Opt_noContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterAlterobjectschemastmt(PostgreSQLPlpgsqlInnerParser.AlterobjectschemastmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitAlterobjectschemastmt(PostgreSQLPlpgsqlInnerParser.AlterobjectschemastmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterAlteroperatorstmt(PostgreSQLPlpgsqlInnerParser.AlteroperatorstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitAlteroperatorstmt(PostgreSQLPlpgsqlInnerParser.AlteroperatorstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOperator_def_list(PostgreSQLPlpgsqlInnerParser.Operator_def_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOperator_def_list(PostgreSQLPlpgsqlInnerParser.Operator_def_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOperator_def_elem(PostgreSQLPlpgsqlInnerParser.Operator_def_elemContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOperator_def_elem(PostgreSQLPlpgsqlInnerParser.Operator_def_elemContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOperator_def_arg(PostgreSQLPlpgsqlInnerParser.Operator_def_argContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOperator_def_arg(PostgreSQLPlpgsqlInnerParser.Operator_def_argContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterAltertypestmt(PostgreSQLPlpgsqlInnerParser.AltertypestmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitAltertypestmt(PostgreSQLPlpgsqlInnerParser.AltertypestmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterAlterownerstmt(PostgreSQLPlpgsqlInnerParser.AlterownerstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitAlterownerstmt(PostgreSQLPlpgsqlInnerParser.AlterownerstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterCreatepublicationstmt(PostgreSQLPlpgsqlInnerParser.CreatepublicationstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitCreatepublicationstmt(PostgreSQLPlpgsqlInnerParser.CreatepublicationstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_publication_for_tables(PostgreSQLPlpgsqlInnerParser.Opt_publication_for_tablesContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_publication_for_tables(PostgreSQLPlpgsqlInnerParser.Opt_publication_for_tablesContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterPublication_for_tables(PostgreSQLPlpgsqlInnerParser.Publication_for_tablesContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitPublication_for_tables(PostgreSQLPlpgsqlInnerParser.Publication_for_tablesContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterAlterpublicationstmt(PostgreSQLPlpgsqlInnerParser.AlterpublicationstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitAlterpublicationstmt(PostgreSQLPlpgsqlInnerParser.AlterpublicationstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterCreatesubscriptionstmt(PostgreSQLPlpgsqlInnerParser.CreatesubscriptionstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitCreatesubscriptionstmt(PostgreSQLPlpgsqlInnerParser.CreatesubscriptionstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterPublication_name_list(PostgreSQLPlpgsqlInnerParser.Publication_name_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitPublication_name_list(PostgreSQLPlpgsqlInnerParser.Publication_name_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterPublication_name_item(PostgreSQLPlpgsqlInnerParser.Publication_name_itemContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitPublication_name_item(PostgreSQLPlpgsqlInnerParser.Publication_name_itemContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterAltersubscriptionstmt(PostgreSQLPlpgsqlInnerParser.AltersubscriptionstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitAltersubscriptionstmt(PostgreSQLPlpgsqlInnerParser.AltersubscriptionstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterDropsubscriptionstmt(PostgreSQLPlpgsqlInnerParser.DropsubscriptionstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitDropsubscriptionstmt(PostgreSQLPlpgsqlInnerParser.DropsubscriptionstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterRulestmt(PostgreSQLPlpgsqlInnerParser.RulestmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitRulestmt(PostgreSQLPlpgsqlInnerParser.RulestmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterRuleactionlist(PostgreSQLPlpgsqlInnerParser.RuleactionlistContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitRuleactionlist(PostgreSQLPlpgsqlInnerParser.RuleactionlistContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterRuleactionmulti(PostgreSQLPlpgsqlInnerParser.RuleactionmultiContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitRuleactionmulti(PostgreSQLPlpgsqlInnerParser.RuleactionmultiContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterRuleactionstmt(PostgreSQLPlpgsqlInnerParser.RuleactionstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitRuleactionstmt(PostgreSQLPlpgsqlInnerParser.RuleactionstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterRuleactionstmtOrEmpty(PostgreSQLPlpgsqlInnerParser.RuleactionstmtOrEmptyContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitRuleactionstmtOrEmpty(PostgreSQLPlpgsqlInnerParser.RuleactionstmtOrEmptyContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterEvent(PostgreSQLPlpgsqlInnerParser.EventContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitEvent(PostgreSQLPlpgsqlInnerParser.EventContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_instead(PostgreSQLPlpgsqlInnerParser.Opt_insteadContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_instead(PostgreSQLPlpgsqlInnerParser.Opt_insteadContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterNotifystmt(PostgreSQLPlpgsqlInnerParser.NotifystmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitNotifystmt(PostgreSQLPlpgsqlInnerParser.NotifystmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterNotify_payload(PostgreSQLPlpgsqlInnerParser.Notify_payloadContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitNotify_payload(PostgreSQLPlpgsqlInnerParser.Notify_payloadContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterListenstmt(PostgreSQLPlpgsqlInnerParser.ListenstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitListenstmt(PostgreSQLPlpgsqlInnerParser.ListenstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterUnlistenstmt(PostgreSQLPlpgsqlInnerParser.UnlistenstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitUnlistenstmt(PostgreSQLPlpgsqlInnerParser.UnlistenstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterTransactionstmt(PostgreSQLPlpgsqlInnerParser.TransactionstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitTransactionstmt(PostgreSQLPlpgsqlInnerParser.TransactionstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_transaction(PostgreSQLPlpgsqlInnerParser.Opt_transactionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_transaction(PostgreSQLPlpgsqlInnerParser.Opt_transactionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterTransaction_mode_item(PostgreSQLPlpgsqlInnerParser.Transaction_mode_itemContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitTransaction_mode_item(PostgreSQLPlpgsqlInnerParser.Transaction_mode_itemContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterTransaction_mode_list(PostgreSQLPlpgsqlInnerParser.Transaction_mode_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitTransaction_mode_list(PostgreSQLPlpgsqlInnerParser.Transaction_mode_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterTransaction_mode_list_or_empty(PostgreSQLPlpgsqlInnerParser.Transaction_mode_list_or_emptyContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitTransaction_mode_list_or_empty(PostgreSQLPlpgsqlInnerParser.Transaction_mode_list_or_emptyContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_transaction_chain(PostgreSQLPlpgsqlInnerParser.Opt_transaction_chainContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_transaction_chain(PostgreSQLPlpgsqlInnerParser.Opt_transaction_chainContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterViewstmt(PostgreSQLPlpgsqlInnerParser.ViewstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitViewstmt(PostgreSQLPlpgsqlInnerParser.ViewstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_check_option(PostgreSQLPlpgsqlInnerParser.Opt_check_optionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_check_option(PostgreSQLPlpgsqlInnerParser.Opt_check_optionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterLoadstmt(PostgreSQLPlpgsqlInnerParser.LoadstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitLoadstmt(PostgreSQLPlpgsqlInnerParser.LoadstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterCreatedbstmt(PostgreSQLPlpgsqlInnerParser.CreatedbstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitCreatedbstmt(PostgreSQLPlpgsqlInnerParser.CreatedbstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterCreatedb_opt_list(PostgreSQLPlpgsqlInnerParser.Createdb_opt_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitCreatedb_opt_list(PostgreSQLPlpgsqlInnerParser.Createdb_opt_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterCreatedb_opt_items(PostgreSQLPlpgsqlInnerParser.Createdb_opt_itemsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitCreatedb_opt_items(PostgreSQLPlpgsqlInnerParser.Createdb_opt_itemsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterCreatedb_opt_item(PostgreSQLPlpgsqlInnerParser.Createdb_opt_itemContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitCreatedb_opt_item(PostgreSQLPlpgsqlInnerParser.Createdb_opt_itemContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterCreatedb_opt_name(PostgreSQLPlpgsqlInnerParser.Createdb_opt_nameContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitCreatedb_opt_name(PostgreSQLPlpgsqlInnerParser.Createdb_opt_nameContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_equal(PostgreSQLPlpgsqlInnerParser.Opt_equalContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_equal(PostgreSQLPlpgsqlInnerParser.Opt_equalContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterAlterdatabasestmt(PostgreSQLPlpgsqlInnerParser.AlterdatabasestmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitAlterdatabasestmt(PostgreSQLPlpgsqlInnerParser.AlterdatabasestmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterAlterdatabasesetstmt(PostgreSQLPlpgsqlInnerParser.AlterdatabasesetstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitAlterdatabasesetstmt(PostgreSQLPlpgsqlInnerParser.AlterdatabasesetstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterDropdbstmt(PostgreSQLPlpgsqlInnerParser.DropdbstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitDropdbstmt(PostgreSQLPlpgsqlInnerParser.DropdbstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterDrop_option_list(PostgreSQLPlpgsqlInnerParser.Drop_option_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitDrop_option_list(PostgreSQLPlpgsqlInnerParser.Drop_option_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterDrop_option(PostgreSQLPlpgsqlInnerParser.Drop_optionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitDrop_option(PostgreSQLPlpgsqlInnerParser.Drop_optionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterAltercollationstmt(PostgreSQLPlpgsqlInnerParser.AltercollationstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitAltercollationstmt(PostgreSQLPlpgsqlInnerParser.AltercollationstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterAltersystemstmt(PostgreSQLPlpgsqlInnerParser.AltersystemstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitAltersystemstmt(PostgreSQLPlpgsqlInnerParser.AltersystemstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterCreatedomainstmt(PostgreSQLPlpgsqlInnerParser.CreatedomainstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitCreatedomainstmt(PostgreSQLPlpgsqlInnerParser.CreatedomainstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterAlterdomainstmt(PostgreSQLPlpgsqlInnerParser.AlterdomainstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitAlterdomainstmt(PostgreSQLPlpgsqlInnerParser.AlterdomainstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_as(PostgreSQLPlpgsqlInnerParser.Opt_asContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_as(PostgreSQLPlpgsqlInnerParser.Opt_asContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterAltertsdictionarystmt(PostgreSQLPlpgsqlInnerParser.AltertsdictionarystmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitAltertsdictionarystmt(PostgreSQLPlpgsqlInnerParser.AltertsdictionarystmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterAltertsconfigurationstmt(PostgreSQLPlpgsqlInnerParser.AltertsconfigurationstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitAltertsconfigurationstmt(PostgreSQLPlpgsqlInnerParser.AltertsconfigurationstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterAny_with(PostgreSQLPlpgsqlInnerParser.Any_withContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitAny_with(PostgreSQLPlpgsqlInnerParser.Any_withContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterCreateconversionstmt(PostgreSQLPlpgsqlInnerParser.CreateconversionstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitCreateconversionstmt(PostgreSQLPlpgsqlInnerParser.CreateconversionstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterClusterstmt(PostgreSQLPlpgsqlInnerParser.ClusterstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitClusterstmt(PostgreSQLPlpgsqlInnerParser.ClusterstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterCluster_index_specification(PostgreSQLPlpgsqlInnerParser.Cluster_index_specificationContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitCluster_index_specification(PostgreSQLPlpgsqlInnerParser.Cluster_index_specificationContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterVacuumstmt(PostgreSQLPlpgsqlInnerParser.VacuumstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitVacuumstmt(PostgreSQLPlpgsqlInnerParser.VacuumstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterAnalyzestmt(PostgreSQLPlpgsqlInnerParser.AnalyzestmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitAnalyzestmt(PostgreSQLPlpgsqlInnerParser.AnalyzestmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterVac_analyze_option_list(PostgreSQLPlpgsqlInnerParser.Vac_analyze_option_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitVac_analyze_option_list(PostgreSQLPlpgsqlInnerParser.Vac_analyze_option_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterAnalyze_keyword(PostgreSQLPlpgsqlInnerParser.Analyze_keywordContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitAnalyze_keyword(PostgreSQLPlpgsqlInnerParser.Analyze_keywordContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterVac_analyze_option_elem(PostgreSQLPlpgsqlInnerParser.Vac_analyze_option_elemContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitVac_analyze_option_elem(PostgreSQLPlpgsqlInnerParser.Vac_analyze_option_elemContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterVac_analyze_option_name(PostgreSQLPlpgsqlInnerParser.Vac_analyze_option_nameContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitVac_analyze_option_name(PostgreSQLPlpgsqlInnerParser.Vac_analyze_option_nameContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterVac_analyze_option_arg(PostgreSQLPlpgsqlInnerParser.Vac_analyze_option_argContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitVac_analyze_option_arg(PostgreSQLPlpgsqlInnerParser.Vac_analyze_option_argContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_analyze(PostgreSQLPlpgsqlInnerParser.Opt_analyzeContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_analyze(PostgreSQLPlpgsqlInnerParser.Opt_analyzeContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_verbose(PostgreSQLPlpgsqlInnerParser.Opt_verboseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_verbose(PostgreSQLPlpgsqlInnerParser.Opt_verboseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_full(PostgreSQLPlpgsqlInnerParser.Opt_fullContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_full(PostgreSQLPlpgsqlInnerParser.Opt_fullContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_freeze(PostgreSQLPlpgsqlInnerParser.Opt_freezeContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_freeze(PostgreSQLPlpgsqlInnerParser.Opt_freezeContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_name_list(PostgreSQLPlpgsqlInnerParser.Opt_name_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_name_list(PostgreSQLPlpgsqlInnerParser.Opt_name_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterVacuum_relation(PostgreSQLPlpgsqlInnerParser.Vacuum_relationContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitVacuum_relation(PostgreSQLPlpgsqlInnerParser.Vacuum_relationContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterVacuum_relation_list(PostgreSQLPlpgsqlInnerParser.Vacuum_relation_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitVacuum_relation_list(PostgreSQLPlpgsqlInnerParser.Vacuum_relation_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_vacuum_relation_list(PostgreSQLPlpgsqlInnerParser.Opt_vacuum_relation_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_vacuum_relation_list(PostgreSQLPlpgsqlInnerParser.Opt_vacuum_relation_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterExplainstmt(PostgreSQLPlpgsqlInnerParser.ExplainstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitExplainstmt(PostgreSQLPlpgsqlInnerParser.ExplainstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterExplainablestmt(PostgreSQLPlpgsqlInnerParser.ExplainablestmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitExplainablestmt(PostgreSQLPlpgsqlInnerParser.ExplainablestmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterExplain_option_list(PostgreSQLPlpgsqlInnerParser.Explain_option_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitExplain_option_list(PostgreSQLPlpgsqlInnerParser.Explain_option_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterExplain_option_elem(PostgreSQLPlpgsqlInnerParser.Explain_option_elemContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitExplain_option_elem(PostgreSQLPlpgsqlInnerParser.Explain_option_elemContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterExplain_option_name(PostgreSQLPlpgsqlInnerParser.Explain_option_nameContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitExplain_option_name(PostgreSQLPlpgsqlInnerParser.Explain_option_nameContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterExplain_option_arg(PostgreSQLPlpgsqlInnerParser.Explain_option_argContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitExplain_option_arg(PostgreSQLPlpgsqlInnerParser.Explain_option_argContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterPreparestmt(PostgreSQLPlpgsqlInnerParser.PreparestmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitPreparestmt(PostgreSQLPlpgsqlInnerParser.PreparestmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterPrep_type_clause(PostgreSQLPlpgsqlInnerParser.Prep_type_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitPrep_type_clause(PostgreSQLPlpgsqlInnerParser.Prep_type_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterPreparablestmt(PostgreSQLPlpgsqlInnerParser.PreparablestmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitPreparablestmt(PostgreSQLPlpgsqlInnerParser.PreparablestmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterExecutestmt(PostgreSQLPlpgsqlInnerParser.ExecutestmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitExecutestmt(PostgreSQLPlpgsqlInnerParser.ExecutestmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterExecute_param_clause(PostgreSQLPlpgsqlInnerParser.Execute_param_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitExecute_param_clause(PostgreSQLPlpgsqlInnerParser.Execute_param_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterDeallocatestmt(PostgreSQLPlpgsqlInnerParser.DeallocatestmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitDeallocatestmt(PostgreSQLPlpgsqlInnerParser.DeallocatestmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterInsertstmt(PostgreSQLPlpgsqlInnerParser.InsertstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitInsertstmt(PostgreSQLPlpgsqlInnerParser.InsertstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterInsert_target(PostgreSQLPlpgsqlInnerParser.Insert_targetContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitInsert_target(PostgreSQLPlpgsqlInnerParser.Insert_targetContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterInsert_rest(PostgreSQLPlpgsqlInnerParser.Insert_restContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitInsert_rest(PostgreSQLPlpgsqlInnerParser.Insert_restContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOverride_kind(PostgreSQLPlpgsqlInnerParser.Override_kindContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOverride_kind(PostgreSQLPlpgsqlInnerParser.Override_kindContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterInsert_column_list(PostgreSQLPlpgsqlInnerParser.Insert_column_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitInsert_column_list(PostgreSQLPlpgsqlInnerParser.Insert_column_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterInsert_column_item(PostgreSQLPlpgsqlInnerParser.Insert_column_itemContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitInsert_column_item(PostgreSQLPlpgsqlInnerParser.Insert_column_itemContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_on_conflict(PostgreSQLPlpgsqlInnerParser.Opt_on_conflictContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_on_conflict(PostgreSQLPlpgsqlInnerParser.Opt_on_conflictContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_conf_expr(PostgreSQLPlpgsqlInnerParser.Opt_conf_exprContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_conf_expr(PostgreSQLPlpgsqlInnerParser.Opt_conf_exprContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterReturning_clause(PostgreSQLPlpgsqlInnerParser.Returning_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitReturning_clause(PostgreSQLPlpgsqlInnerParser.Returning_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterDeletestmt(PostgreSQLPlpgsqlInnerParser.DeletestmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitDeletestmt(PostgreSQLPlpgsqlInnerParser.DeletestmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterUsing_clause(PostgreSQLPlpgsqlInnerParser.Using_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitUsing_clause(PostgreSQLPlpgsqlInnerParser.Using_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterLockstmt(PostgreSQLPlpgsqlInnerParser.LockstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitLockstmt(PostgreSQLPlpgsqlInnerParser.LockstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_lock(PostgreSQLPlpgsqlInnerParser.Opt_lockContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_lock(PostgreSQLPlpgsqlInnerParser.Opt_lockContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterLock_type(PostgreSQLPlpgsqlInnerParser.Lock_typeContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitLock_type(PostgreSQLPlpgsqlInnerParser.Lock_typeContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_nowait(PostgreSQLPlpgsqlInnerParser.Opt_nowaitContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_nowait(PostgreSQLPlpgsqlInnerParser.Opt_nowaitContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_nowait_or_skip(PostgreSQLPlpgsqlInnerParser.Opt_nowait_or_skipContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_nowait_or_skip(PostgreSQLPlpgsqlInnerParser.Opt_nowait_or_skipContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterUpdatestmt(PostgreSQLPlpgsqlInnerParser.UpdatestmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitUpdatestmt(PostgreSQLPlpgsqlInnerParser.UpdatestmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterSet_clause_list(PostgreSQLPlpgsqlInnerParser.Set_clause_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitSet_clause_list(PostgreSQLPlpgsqlInnerParser.Set_clause_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterSet_clause(PostgreSQLPlpgsqlInnerParser.Set_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitSet_clause(PostgreSQLPlpgsqlInnerParser.Set_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterSet_target(PostgreSQLPlpgsqlInnerParser.Set_targetContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitSet_target(PostgreSQLPlpgsqlInnerParser.Set_targetContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterSet_target_list(PostgreSQLPlpgsqlInnerParser.Set_target_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitSet_target_list(PostgreSQLPlpgsqlInnerParser.Set_target_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterDeclarecursorstmt(PostgreSQLPlpgsqlInnerParser.DeclarecursorstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitDeclarecursorstmt(PostgreSQLPlpgsqlInnerParser.DeclarecursorstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterCursor_name(PostgreSQLPlpgsqlInnerParser.Cursor_nameContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitCursor_name(PostgreSQLPlpgsqlInnerParser.Cursor_nameContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterCursor_options(PostgreSQLPlpgsqlInnerParser.Cursor_optionsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitCursor_options(PostgreSQLPlpgsqlInnerParser.Cursor_optionsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_hold(PostgreSQLPlpgsqlInnerParser.Opt_holdContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_hold(PostgreSQLPlpgsqlInnerParser.Opt_holdContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterSelectstmt(PostgreSQLPlpgsqlInnerParser.SelectstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitSelectstmt(PostgreSQLPlpgsqlInnerParser.SelectstmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterSelect_with_parens(PostgreSQLPlpgsqlInnerParser.Select_with_parensContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitSelect_with_parens(PostgreSQLPlpgsqlInnerParser.Select_with_parensContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterSelect_no_parens(PostgreSQLPlpgsqlInnerParser.Select_no_parensContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitSelect_no_parens(PostgreSQLPlpgsqlInnerParser.Select_no_parensContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterSelect_clause(PostgreSQLPlpgsqlInnerParser.Select_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitSelect_clause(PostgreSQLPlpgsqlInnerParser.Select_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterSimple_select(PostgreSQLPlpgsqlInnerParser.Simple_selectContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitSimple_select(PostgreSQLPlpgsqlInnerParser.Simple_selectContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterUnion(PostgreSQLPlpgsqlInnerParser.UnionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitUnion(PostgreSQLPlpgsqlInnerParser.UnionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterIntersect(PostgreSQLPlpgsqlInnerParser.IntersectContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitIntersect(PostgreSQLPlpgsqlInnerParser.IntersectContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterExcept(PostgreSQLPlpgsqlInnerParser.ExceptContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitExcept(PostgreSQLPlpgsqlInnerParser.ExceptContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterSet_operator_with_all_or_distinct(PostgreSQLPlpgsqlInnerParser.Set_operator_with_all_or_distinctContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitSet_operator_with_all_or_distinct(PostgreSQLPlpgsqlInnerParser.Set_operator_with_all_or_distinctContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterWith_clause(PostgreSQLPlpgsqlInnerParser.With_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitWith_clause(PostgreSQLPlpgsqlInnerParser.With_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterCte_list(PostgreSQLPlpgsqlInnerParser.Cte_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitCte_list(PostgreSQLPlpgsqlInnerParser.Cte_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterCommon_table_expr(PostgreSQLPlpgsqlInnerParser.Common_table_exprContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitCommon_table_expr(PostgreSQLPlpgsqlInnerParser.Common_table_exprContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_materialized(PostgreSQLPlpgsqlInnerParser.Opt_materializedContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_materialized(PostgreSQLPlpgsqlInnerParser.Opt_materializedContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_with_clause(PostgreSQLPlpgsqlInnerParser.Opt_with_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_with_clause(PostgreSQLPlpgsqlInnerParser.Opt_with_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterInto_clause(PostgreSQLPlpgsqlInnerParser.Into_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitInto_clause(PostgreSQLPlpgsqlInnerParser.Into_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_strict(PostgreSQLPlpgsqlInnerParser.Opt_strictContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_strict(PostgreSQLPlpgsqlInnerParser.Opt_strictContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpttempTableName(PostgreSQLPlpgsqlInnerParser.OpttempTableNameContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpttempTableName(PostgreSQLPlpgsqlInnerParser.OpttempTableNameContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_table(PostgreSQLPlpgsqlInnerParser.Opt_tableContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_table(PostgreSQLPlpgsqlInnerParser.Opt_tableContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterAll_or_distinct(PostgreSQLPlpgsqlInnerParser.All_or_distinctContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitAll_or_distinct(PostgreSQLPlpgsqlInnerParser.All_or_distinctContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterDistinct_clause(PostgreSQLPlpgsqlInnerParser.Distinct_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitDistinct_clause(PostgreSQLPlpgsqlInnerParser.Distinct_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_all_clause(PostgreSQLPlpgsqlInnerParser.Opt_all_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_all_clause(PostgreSQLPlpgsqlInnerParser.Opt_all_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_sort_clause(PostgreSQLPlpgsqlInnerParser.Opt_sort_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_sort_clause(PostgreSQLPlpgsqlInnerParser.Opt_sort_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterSort_clause(PostgreSQLPlpgsqlInnerParser.Sort_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitSort_clause(PostgreSQLPlpgsqlInnerParser.Sort_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterSortby_list(PostgreSQLPlpgsqlInnerParser.Sortby_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitSortby_list(PostgreSQLPlpgsqlInnerParser.Sortby_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterSortby(PostgreSQLPlpgsqlInnerParser.SortbyContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitSortby(PostgreSQLPlpgsqlInnerParser.SortbyContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterSelect_limit(PostgreSQLPlpgsqlInnerParser.Select_limitContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitSelect_limit(PostgreSQLPlpgsqlInnerParser.Select_limitContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_select_limit(PostgreSQLPlpgsqlInnerParser.Opt_select_limitContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_select_limit(PostgreSQLPlpgsqlInnerParser.Opt_select_limitContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterLimit_clause(PostgreSQLPlpgsqlInnerParser.Limit_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitLimit_clause(PostgreSQLPlpgsqlInnerParser.Limit_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOffset_clause(PostgreSQLPlpgsqlInnerParser.Offset_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOffset_clause(PostgreSQLPlpgsqlInnerParser.Offset_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterSelect_limit_value(PostgreSQLPlpgsqlInnerParser.Select_limit_valueContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitSelect_limit_value(PostgreSQLPlpgsqlInnerParser.Select_limit_valueContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterSelect_offset_value(PostgreSQLPlpgsqlInnerParser.Select_offset_valueContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitSelect_offset_value(PostgreSQLPlpgsqlInnerParser.Select_offset_valueContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterSelect_fetch_first_value(PostgreSQLPlpgsqlInnerParser.Select_fetch_first_valueContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitSelect_fetch_first_value(PostgreSQLPlpgsqlInnerParser.Select_fetch_first_valueContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterI_or_f_const(PostgreSQLPlpgsqlInnerParser.I_or_f_constContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitI_or_f_const(PostgreSQLPlpgsqlInnerParser.I_or_f_constContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterRow_or_rows(PostgreSQLPlpgsqlInnerParser.Row_or_rowsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitRow_or_rows(PostgreSQLPlpgsqlInnerParser.Row_or_rowsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterFirst_or_next(PostgreSQLPlpgsqlInnerParser.First_or_nextContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitFirst_or_next(PostgreSQLPlpgsqlInnerParser.First_or_nextContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterGroup_clause(PostgreSQLPlpgsqlInnerParser.Group_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitGroup_clause(PostgreSQLPlpgsqlInnerParser.Group_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterGroup_by_list(PostgreSQLPlpgsqlInnerParser.Group_by_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitGroup_by_list(PostgreSQLPlpgsqlInnerParser.Group_by_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterGroup_by_item(PostgreSQLPlpgsqlInnerParser.Group_by_itemContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitGroup_by_item(PostgreSQLPlpgsqlInnerParser.Group_by_itemContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterEmpty_grouping_set(PostgreSQLPlpgsqlInnerParser.Empty_grouping_setContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitEmpty_grouping_set(PostgreSQLPlpgsqlInnerParser.Empty_grouping_setContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterRollup_clause(PostgreSQLPlpgsqlInnerParser.Rollup_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitRollup_clause(PostgreSQLPlpgsqlInnerParser.Rollup_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterCube_clause(PostgreSQLPlpgsqlInnerParser.Cube_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitCube_clause(PostgreSQLPlpgsqlInnerParser.Cube_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterGrouping_sets_clause(PostgreSQLPlpgsqlInnerParser.Grouping_sets_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitGrouping_sets_clause(PostgreSQLPlpgsqlInnerParser.Grouping_sets_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterHaving_clause(PostgreSQLPlpgsqlInnerParser.Having_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitHaving_clause(PostgreSQLPlpgsqlInnerParser.Having_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterFor_locking_clause(PostgreSQLPlpgsqlInnerParser.For_locking_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitFor_locking_clause(PostgreSQLPlpgsqlInnerParser.For_locking_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_for_locking_clause(PostgreSQLPlpgsqlInnerParser.Opt_for_locking_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_for_locking_clause(PostgreSQLPlpgsqlInnerParser.Opt_for_locking_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterFor_locking_items(PostgreSQLPlpgsqlInnerParser.For_locking_itemsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitFor_locking_items(PostgreSQLPlpgsqlInnerParser.For_locking_itemsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterFor_locking_item(PostgreSQLPlpgsqlInnerParser.For_locking_itemContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitFor_locking_item(PostgreSQLPlpgsqlInnerParser.For_locking_itemContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterFor_locking_strength(PostgreSQLPlpgsqlInnerParser.For_locking_strengthContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitFor_locking_strength(PostgreSQLPlpgsqlInnerParser.For_locking_strengthContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterLocked_rels_list(PostgreSQLPlpgsqlInnerParser.Locked_rels_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitLocked_rels_list(PostgreSQLPlpgsqlInnerParser.Locked_rels_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterValues_clause(PostgreSQLPlpgsqlInnerParser.Values_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitValues_clause(PostgreSQLPlpgsqlInnerParser.Values_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterFrom_clause(PostgreSQLPlpgsqlInnerParser.From_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitFrom_clause(PostgreSQLPlpgsqlInnerParser.From_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterFrom_list(PostgreSQLPlpgsqlInnerParser.From_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitFrom_list(PostgreSQLPlpgsqlInnerParser.From_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterTable_ref(PostgreSQLPlpgsqlInnerParser.Table_refContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitTable_ref(PostgreSQLPlpgsqlInnerParser.Table_refContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterAlias_clause(PostgreSQLPlpgsqlInnerParser.Alias_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitAlias_clause(PostgreSQLPlpgsqlInnerParser.Alias_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_alias_clause(PostgreSQLPlpgsqlInnerParser.Opt_alias_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_alias_clause(PostgreSQLPlpgsqlInnerParser.Opt_alias_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterFunc_alias_clause(PostgreSQLPlpgsqlInnerParser.Func_alias_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitFunc_alias_clause(PostgreSQLPlpgsqlInnerParser.Func_alias_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterJoin_type(PostgreSQLPlpgsqlInnerParser.Join_typeContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitJoin_type(PostgreSQLPlpgsqlInnerParser.Join_typeContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterJoin_qual(PostgreSQLPlpgsqlInnerParser.Join_qualContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitJoin_qual(PostgreSQLPlpgsqlInnerParser.Join_qualContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterRelation_expr(PostgreSQLPlpgsqlInnerParser.Relation_exprContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitRelation_expr(PostgreSQLPlpgsqlInnerParser.Relation_exprContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterRelation_expr_list(PostgreSQLPlpgsqlInnerParser.Relation_expr_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitRelation_expr_list(PostgreSQLPlpgsqlInnerParser.Relation_expr_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterRelation_expr_opt_alias(PostgreSQLPlpgsqlInnerParser.Relation_expr_opt_aliasContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitRelation_expr_opt_alias(PostgreSQLPlpgsqlInnerParser.Relation_expr_opt_aliasContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterTablesample_clause(PostgreSQLPlpgsqlInnerParser.Tablesample_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitTablesample_clause(PostgreSQLPlpgsqlInnerParser.Tablesample_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_repeatable_clause(PostgreSQLPlpgsqlInnerParser.Opt_repeatable_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_repeatable_clause(PostgreSQLPlpgsqlInnerParser.Opt_repeatable_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterFunc_table(PostgreSQLPlpgsqlInnerParser.Func_tableContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitFunc_table(PostgreSQLPlpgsqlInnerParser.Func_tableContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterRowsfrom_item(PostgreSQLPlpgsqlInnerParser.Rowsfrom_itemContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitRowsfrom_item(PostgreSQLPlpgsqlInnerParser.Rowsfrom_itemContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterRowsfrom_list(PostgreSQLPlpgsqlInnerParser.Rowsfrom_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitRowsfrom_list(PostgreSQLPlpgsqlInnerParser.Rowsfrom_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_col_def_list(PostgreSQLPlpgsqlInnerParser.Opt_col_def_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_col_def_list(PostgreSQLPlpgsqlInnerParser.Opt_col_def_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_ordinality(PostgreSQLPlpgsqlInnerParser.Opt_ordinalityContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_ordinality(PostgreSQLPlpgsqlInnerParser.Opt_ordinalityContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterWhere_clause(PostgreSQLPlpgsqlInnerParser.Where_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitWhere_clause(PostgreSQLPlpgsqlInnerParser.Where_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterWhere_or_current_clause(PostgreSQLPlpgsqlInnerParser.Where_or_current_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitWhere_or_current_clause(PostgreSQLPlpgsqlInnerParser.Where_or_current_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpttablefuncelementlist(PostgreSQLPlpgsqlInnerParser.OpttablefuncelementlistContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpttablefuncelementlist(PostgreSQLPlpgsqlInnerParser.OpttablefuncelementlistContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterTablefuncelementlist(PostgreSQLPlpgsqlInnerParser.TablefuncelementlistContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitTablefuncelementlist(PostgreSQLPlpgsqlInnerParser.TablefuncelementlistContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterTablefuncelement(PostgreSQLPlpgsqlInnerParser.TablefuncelementContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitTablefuncelement(PostgreSQLPlpgsqlInnerParser.TablefuncelementContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterXmltable(PostgreSQLPlpgsqlInnerParser.XmltableContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitXmltable(PostgreSQLPlpgsqlInnerParser.XmltableContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterXmltable_column_list(PostgreSQLPlpgsqlInnerParser.Xmltable_column_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitXmltable_column_list(PostgreSQLPlpgsqlInnerParser.Xmltable_column_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterXmltable_column_el(PostgreSQLPlpgsqlInnerParser.Xmltable_column_elContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitXmltable_column_el(PostgreSQLPlpgsqlInnerParser.Xmltable_column_elContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterXmltable_column_option_list(PostgreSQLPlpgsqlInnerParser.Xmltable_column_option_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitXmltable_column_option_list(PostgreSQLPlpgsqlInnerParser.Xmltable_column_option_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterXmltable_column_option_el(PostgreSQLPlpgsqlInnerParser.Xmltable_column_option_elContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitXmltable_column_option_el(PostgreSQLPlpgsqlInnerParser.Xmltable_column_option_elContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterXml_namespace_list(PostgreSQLPlpgsqlInnerParser.Xml_namespace_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitXml_namespace_list(PostgreSQLPlpgsqlInnerParser.Xml_namespace_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterXml_namespace_el(PostgreSQLPlpgsqlInnerParser.Xml_namespace_elContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitXml_namespace_el(PostgreSQLPlpgsqlInnerParser.Xml_namespace_elContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterTypename(PostgreSQLPlpgsqlInnerParser.TypenameContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitTypename(PostgreSQLPlpgsqlInnerParser.TypenameContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_array_bounds(PostgreSQLPlpgsqlInnerParser.Opt_array_boundsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_array_bounds(PostgreSQLPlpgsqlInnerParser.Opt_array_boundsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterSimpletypename(PostgreSQLPlpgsqlInnerParser.SimpletypenameContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitSimpletypename(PostgreSQLPlpgsqlInnerParser.SimpletypenameContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterConsttypename(PostgreSQLPlpgsqlInnerParser.ConsttypenameContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitConsttypename(PostgreSQLPlpgsqlInnerParser.ConsttypenameContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterGenerictype(PostgreSQLPlpgsqlInnerParser.GenerictypeContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitGenerictype(PostgreSQLPlpgsqlInnerParser.GenerictypeContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_type_modifiers(PostgreSQLPlpgsqlInnerParser.Opt_type_modifiersContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_type_modifiers(PostgreSQLPlpgsqlInnerParser.Opt_type_modifiersContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterNumeric(PostgreSQLPlpgsqlInnerParser.NumericContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitNumeric(PostgreSQLPlpgsqlInnerParser.NumericContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_float(PostgreSQLPlpgsqlInnerParser.Opt_floatContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_float(PostgreSQLPlpgsqlInnerParser.Opt_floatContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterBit(PostgreSQLPlpgsqlInnerParser.BitContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitBit(PostgreSQLPlpgsqlInnerParser.BitContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterConstbit(PostgreSQLPlpgsqlInnerParser.ConstbitContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitConstbit(PostgreSQLPlpgsqlInnerParser.ConstbitContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterBitwithlength(PostgreSQLPlpgsqlInnerParser.BitwithlengthContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitBitwithlength(PostgreSQLPlpgsqlInnerParser.BitwithlengthContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterBitwithoutlength(PostgreSQLPlpgsqlInnerParser.BitwithoutlengthContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitBitwithoutlength(PostgreSQLPlpgsqlInnerParser.BitwithoutlengthContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterCharacter(PostgreSQLPlpgsqlInnerParser.CharacterContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitCharacter(PostgreSQLPlpgsqlInnerParser.CharacterContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterConstcharacter(PostgreSQLPlpgsqlInnerParser.ConstcharacterContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitConstcharacter(PostgreSQLPlpgsqlInnerParser.ConstcharacterContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterCharacter_c(PostgreSQLPlpgsqlInnerParser.Character_cContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitCharacter_c(PostgreSQLPlpgsqlInnerParser.Character_cContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_varying(PostgreSQLPlpgsqlInnerParser.Opt_varyingContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_varying(PostgreSQLPlpgsqlInnerParser.Opt_varyingContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterConstdatetime(PostgreSQLPlpgsqlInnerParser.ConstdatetimeContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitConstdatetime(PostgreSQLPlpgsqlInnerParser.ConstdatetimeContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterConstinterval(PostgreSQLPlpgsqlInnerParser.ConstintervalContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitConstinterval(PostgreSQLPlpgsqlInnerParser.ConstintervalContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_timezone(PostgreSQLPlpgsqlInnerParser.Opt_timezoneContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_timezone(PostgreSQLPlpgsqlInnerParser.Opt_timezoneContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_interval(PostgreSQLPlpgsqlInnerParser.Opt_intervalContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_interval(PostgreSQLPlpgsqlInnerParser.Opt_intervalContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterInterval_second(PostgreSQLPlpgsqlInnerParser.Interval_secondContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitInterval_second(PostgreSQLPlpgsqlInnerParser.Interval_secondContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_escape(PostgreSQLPlpgsqlInnerParser.Opt_escapeContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_escape(PostgreSQLPlpgsqlInnerParser.Opt_escapeContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterA_expr(PostgreSQLPlpgsqlInnerParser.A_exprContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitA_expr(PostgreSQLPlpgsqlInnerParser.A_exprContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterA_expr_qual(PostgreSQLPlpgsqlInnerParser.A_expr_qualContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitA_expr_qual(PostgreSQLPlpgsqlInnerParser.A_expr_qualContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterA_expr_lessless(PostgreSQLPlpgsqlInnerParser.A_expr_lesslessContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitA_expr_lessless(PostgreSQLPlpgsqlInnerParser.A_expr_lesslessContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterA_expr_or(PostgreSQLPlpgsqlInnerParser.A_expr_orContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitA_expr_or(PostgreSQLPlpgsqlInnerParser.A_expr_orContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterA_expr_and(PostgreSQLPlpgsqlInnerParser.A_expr_andContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitA_expr_and(PostgreSQLPlpgsqlInnerParser.A_expr_andContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterA_expr_in(PostgreSQLPlpgsqlInnerParser.A_expr_inContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitA_expr_in(PostgreSQLPlpgsqlInnerParser.A_expr_inContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterA_expr_unary_not(PostgreSQLPlpgsqlInnerParser.A_expr_unary_notContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitA_expr_unary_not(PostgreSQLPlpgsqlInnerParser.A_expr_unary_notContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterA_expr_isnull(PostgreSQLPlpgsqlInnerParser.A_expr_isnullContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitA_expr_isnull(PostgreSQLPlpgsqlInnerParser.A_expr_isnullContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterA_expr_is_not(PostgreSQLPlpgsqlInnerParser.A_expr_is_notContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitA_expr_is_not(PostgreSQLPlpgsqlInnerParser.A_expr_is_notContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterA_expr_compare(PostgreSQLPlpgsqlInnerParser.A_expr_compareContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitA_expr_compare(PostgreSQLPlpgsqlInnerParser.A_expr_compareContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterA_expr_like(PostgreSQLPlpgsqlInnerParser.A_expr_likeContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitA_expr_like(PostgreSQLPlpgsqlInnerParser.A_expr_likeContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterA_expr_qual_op(PostgreSQLPlpgsqlInnerParser.A_expr_qual_opContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitA_expr_qual_op(PostgreSQLPlpgsqlInnerParser.A_expr_qual_opContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterA_expr_unary_qualop(PostgreSQLPlpgsqlInnerParser.A_expr_unary_qualopContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitA_expr_unary_qualop(PostgreSQLPlpgsqlInnerParser.A_expr_unary_qualopContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterA_expr_add(PostgreSQLPlpgsqlInnerParser.A_expr_addContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitA_expr_add(PostgreSQLPlpgsqlInnerParser.A_expr_addContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterA_expr_mul(PostgreSQLPlpgsqlInnerParser.A_expr_mulContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitA_expr_mul(PostgreSQLPlpgsqlInnerParser.A_expr_mulContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterA_expr_caret(PostgreSQLPlpgsqlInnerParser.A_expr_caretContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitA_expr_caret(PostgreSQLPlpgsqlInnerParser.A_expr_caretContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterA_expr_unary_sign(PostgreSQLPlpgsqlInnerParser.A_expr_unary_signContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitA_expr_unary_sign(PostgreSQLPlpgsqlInnerParser.A_expr_unary_signContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterA_expr_at_time_zone(PostgreSQLPlpgsqlInnerParser.A_expr_at_time_zoneContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitA_expr_at_time_zone(PostgreSQLPlpgsqlInnerParser.A_expr_at_time_zoneContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterA_expr_collate(PostgreSQLPlpgsqlInnerParser.A_expr_collateContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitA_expr_collate(PostgreSQLPlpgsqlInnerParser.A_expr_collateContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterA_expr_typecast(PostgreSQLPlpgsqlInnerParser.A_expr_typecastContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitA_expr_typecast(PostgreSQLPlpgsqlInnerParser.A_expr_typecastContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterB_expr(PostgreSQLPlpgsqlInnerParser.B_exprContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitB_expr(PostgreSQLPlpgsqlInnerParser.B_exprContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterC_expr_exists(PostgreSQLPlpgsqlInnerParser.C_expr_existsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitC_expr_exists(PostgreSQLPlpgsqlInnerParser.C_expr_existsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterC_expr_expr(PostgreSQLPlpgsqlInnerParser.C_expr_exprContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitC_expr_expr(PostgreSQLPlpgsqlInnerParser.C_expr_exprContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterC_expr_case(PostgreSQLPlpgsqlInnerParser.C_expr_caseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitC_expr_case(PostgreSQLPlpgsqlInnerParser.C_expr_caseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterPlsqlvariablename(PostgreSQLPlpgsqlInnerParser.PlsqlvariablenameContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitPlsqlvariablename(PostgreSQLPlpgsqlInnerParser.PlsqlvariablenameContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterFunc_application(PostgreSQLPlpgsqlInnerParser.Func_applicationContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitFunc_application(PostgreSQLPlpgsqlInnerParser.Func_applicationContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterFunc_expr(PostgreSQLPlpgsqlInnerParser.Func_exprContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitFunc_expr(PostgreSQLPlpgsqlInnerParser.Func_exprContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterFunc_expr_windowless(PostgreSQLPlpgsqlInnerParser.Func_expr_windowlessContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitFunc_expr_windowless(PostgreSQLPlpgsqlInnerParser.Func_expr_windowlessContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterFunc_expr_common_subexpr(PostgreSQLPlpgsqlInnerParser.Func_expr_common_subexprContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitFunc_expr_common_subexpr(PostgreSQLPlpgsqlInnerParser.Func_expr_common_subexprContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterXml_root_version(PostgreSQLPlpgsqlInnerParser.Xml_root_versionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitXml_root_version(PostgreSQLPlpgsqlInnerParser.Xml_root_versionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_xml_root_standalone(PostgreSQLPlpgsqlInnerParser.Opt_xml_root_standaloneContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_xml_root_standalone(PostgreSQLPlpgsqlInnerParser.Opt_xml_root_standaloneContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterXml_attributes(PostgreSQLPlpgsqlInnerParser.Xml_attributesContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitXml_attributes(PostgreSQLPlpgsqlInnerParser.Xml_attributesContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterXml_attribute_list(PostgreSQLPlpgsqlInnerParser.Xml_attribute_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitXml_attribute_list(PostgreSQLPlpgsqlInnerParser.Xml_attribute_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterXml_attribute_el(PostgreSQLPlpgsqlInnerParser.Xml_attribute_elContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitXml_attribute_el(PostgreSQLPlpgsqlInnerParser.Xml_attribute_elContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterDocument_or_content(PostgreSQLPlpgsqlInnerParser.Document_or_contentContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitDocument_or_content(PostgreSQLPlpgsqlInnerParser.Document_or_contentContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterXml_whitespace_option(PostgreSQLPlpgsqlInnerParser.Xml_whitespace_optionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitXml_whitespace_option(PostgreSQLPlpgsqlInnerParser.Xml_whitespace_optionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterXmlexists_argument(PostgreSQLPlpgsqlInnerParser.Xmlexists_argumentContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitXmlexists_argument(PostgreSQLPlpgsqlInnerParser.Xmlexists_argumentContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterXml_passing_mech(PostgreSQLPlpgsqlInnerParser.Xml_passing_mechContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitXml_passing_mech(PostgreSQLPlpgsqlInnerParser.Xml_passing_mechContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterWithin_group_clause(PostgreSQLPlpgsqlInnerParser.Within_group_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitWithin_group_clause(PostgreSQLPlpgsqlInnerParser.Within_group_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterFilter_clause(PostgreSQLPlpgsqlInnerParser.Filter_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitFilter_clause(PostgreSQLPlpgsqlInnerParser.Filter_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterWindow_clause(PostgreSQLPlpgsqlInnerParser.Window_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitWindow_clause(PostgreSQLPlpgsqlInnerParser.Window_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterWindow_definition_list(PostgreSQLPlpgsqlInnerParser.Window_definition_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitWindow_definition_list(PostgreSQLPlpgsqlInnerParser.Window_definition_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterWindow_definition(PostgreSQLPlpgsqlInnerParser.Window_definitionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitWindow_definition(PostgreSQLPlpgsqlInnerParser.Window_definitionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOver_clause(PostgreSQLPlpgsqlInnerParser.Over_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOver_clause(PostgreSQLPlpgsqlInnerParser.Over_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterWindow_specification(PostgreSQLPlpgsqlInnerParser.Window_specificationContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitWindow_specification(PostgreSQLPlpgsqlInnerParser.Window_specificationContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_existing_window_name(PostgreSQLPlpgsqlInnerParser.Opt_existing_window_nameContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_existing_window_name(PostgreSQLPlpgsqlInnerParser.Opt_existing_window_nameContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_partition_clause(PostgreSQLPlpgsqlInnerParser.Opt_partition_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_partition_clause(PostgreSQLPlpgsqlInnerParser.Opt_partition_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_frame_clause(PostgreSQLPlpgsqlInnerParser.Opt_frame_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_frame_clause(PostgreSQLPlpgsqlInnerParser.Opt_frame_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterFrame_extent(PostgreSQLPlpgsqlInnerParser.Frame_extentContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitFrame_extent(PostgreSQLPlpgsqlInnerParser.Frame_extentContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterFrame_bound(PostgreSQLPlpgsqlInnerParser.Frame_boundContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitFrame_bound(PostgreSQLPlpgsqlInnerParser.Frame_boundContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_window_exclusion_clause(PostgreSQLPlpgsqlInnerParser.Opt_window_exclusion_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_window_exclusion_clause(PostgreSQLPlpgsqlInnerParser.Opt_window_exclusion_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterRow(PostgreSQLPlpgsqlInnerParser.RowContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitRow(PostgreSQLPlpgsqlInnerParser.RowContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterExplicit_row(PostgreSQLPlpgsqlInnerParser.Explicit_rowContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitExplicit_row(PostgreSQLPlpgsqlInnerParser.Explicit_rowContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterImplicit_row(PostgreSQLPlpgsqlInnerParser.Implicit_rowContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitImplicit_row(PostgreSQLPlpgsqlInnerParser.Implicit_rowContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterSub_type(PostgreSQLPlpgsqlInnerParser.Sub_typeContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitSub_type(PostgreSQLPlpgsqlInnerParser.Sub_typeContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterAll_op(PostgreSQLPlpgsqlInnerParser.All_opContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitAll_op(PostgreSQLPlpgsqlInnerParser.All_opContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterMathop(PostgreSQLPlpgsqlInnerParser.MathopContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitMathop(PostgreSQLPlpgsqlInnerParser.MathopContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterQual_op(PostgreSQLPlpgsqlInnerParser.Qual_opContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitQual_op(PostgreSQLPlpgsqlInnerParser.Qual_opContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterQual_all_op(PostgreSQLPlpgsqlInnerParser.Qual_all_opContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitQual_all_op(PostgreSQLPlpgsqlInnerParser.Qual_all_opContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterSubquery_Op(PostgreSQLPlpgsqlInnerParser.Subquery_OpContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitSubquery_Op(PostgreSQLPlpgsqlInnerParser.Subquery_OpContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterExpr_list(PostgreSQLPlpgsqlInnerParser.Expr_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitExpr_list(PostgreSQLPlpgsqlInnerParser.Expr_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterFunc_arg_list(PostgreSQLPlpgsqlInnerParser.Func_arg_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitFunc_arg_list(PostgreSQLPlpgsqlInnerParser.Func_arg_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterFunc_arg_expr(PostgreSQLPlpgsqlInnerParser.Func_arg_exprContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitFunc_arg_expr(PostgreSQLPlpgsqlInnerParser.Func_arg_exprContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterType_list(PostgreSQLPlpgsqlInnerParser.Type_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitType_list(PostgreSQLPlpgsqlInnerParser.Type_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterArray_expr(PostgreSQLPlpgsqlInnerParser.Array_exprContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitArray_expr(PostgreSQLPlpgsqlInnerParser.Array_exprContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterArray_expr_list(PostgreSQLPlpgsqlInnerParser.Array_expr_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitArray_expr_list(PostgreSQLPlpgsqlInnerParser.Array_expr_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterExtract_list(PostgreSQLPlpgsqlInnerParser.Extract_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitExtract_list(PostgreSQLPlpgsqlInnerParser.Extract_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterExtract_arg(PostgreSQLPlpgsqlInnerParser.Extract_argContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitExtract_arg(PostgreSQLPlpgsqlInnerParser.Extract_argContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterUnicode_normal_form(PostgreSQLPlpgsqlInnerParser.Unicode_normal_formContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitUnicode_normal_form(PostgreSQLPlpgsqlInnerParser.Unicode_normal_formContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOverlay_list(PostgreSQLPlpgsqlInnerParser.Overlay_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOverlay_list(PostgreSQLPlpgsqlInnerParser.Overlay_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterPosition_list(PostgreSQLPlpgsqlInnerParser.Position_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitPosition_list(PostgreSQLPlpgsqlInnerParser.Position_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterSubstr_list(PostgreSQLPlpgsqlInnerParser.Substr_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitSubstr_list(PostgreSQLPlpgsqlInnerParser.Substr_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterTrim_list(PostgreSQLPlpgsqlInnerParser.Trim_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitTrim_list(PostgreSQLPlpgsqlInnerParser.Trim_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterIn_expr_select(PostgreSQLPlpgsqlInnerParser.In_expr_selectContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitIn_expr_select(PostgreSQLPlpgsqlInnerParser.In_expr_selectContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterIn_expr_list(PostgreSQLPlpgsqlInnerParser.In_expr_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitIn_expr_list(PostgreSQLPlpgsqlInnerParser.In_expr_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterCase_expr(PostgreSQLPlpgsqlInnerParser.Case_exprContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitCase_expr(PostgreSQLPlpgsqlInnerParser.Case_exprContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterWhen_clause_list(PostgreSQLPlpgsqlInnerParser.When_clause_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitWhen_clause_list(PostgreSQLPlpgsqlInnerParser.When_clause_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterWhen_clause(PostgreSQLPlpgsqlInnerParser.When_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitWhen_clause(PostgreSQLPlpgsqlInnerParser.When_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterCase_default(PostgreSQLPlpgsqlInnerParser.Case_defaultContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitCase_default(PostgreSQLPlpgsqlInnerParser.Case_defaultContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterCase_arg(PostgreSQLPlpgsqlInnerParser.Case_argContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitCase_arg(PostgreSQLPlpgsqlInnerParser.Case_argContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterColumnref(PostgreSQLPlpgsqlInnerParser.ColumnrefContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitColumnref(PostgreSQLPlpgsqlInnerParser.ColumnrefContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterIndirection_el(PostgreSQLPlpgsqlInnerParser.Indirection_elContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitIndirection_el(PostgreSQLPlpgsqlInnerParser.Indirection_elContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_slice_bound(PostgreSQLPlpgsqlInnerParser.Opt_slice_boundContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_slice_bound(PostgreSQLPlpgsqlInnerParser.Opt_slice_boundContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterIndirection(PostgreSQLPlpgsqlInnerParser.IndirectionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitIndirection(PostgreSQLPlpgsqlInnerParser.IndirectionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_indirection(PostgreSQLPlpgsqlInnerParser.Opt_indirectionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_indirection(PostgreSQLPlpgsqlInnerParser.Opt_indirectionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_target_list(PostgreSQLPlpgsqlInnerParser.Opt_target_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_target_list(PostgreSQLPlpgsqlInnerParser.Opt_target_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterTarget_list(PostgreSQLPlpgsqlInnerParser.Target_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitTarget_list(PostgreSQLPlpgsqlInnerParser.Target_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterTarget_label(PostgreSQLPlpgsqlInnerParser.Target_labelContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitTarget_label(PostgreSQLPlpgsqlInnerParser.Target_labelContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterTarget_star(PostgreSQLPlpgsqlInnerParser.Target_starContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitTarget_star(PostgreSQLPlpgsqlInnerParser.Target_starContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterQualified_name_list(PostgreSQLPlpgsqlInnerParser.Qualified_name_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitQualified_name_list(PostgreSQLPlpgsqlInnerParser.Qualified_name_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterQualified_name(PostgreSQLPlpgsqlInnerParser.Qualified_nameContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitQualified_name(PostgreSQLPlpgsqlInnerParser.Qualified_nameContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterName_list(PostgreSQLPlpgsqlInnerParser.Name_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitName_list(PostgreSQLPlpgsqlInnerParser.Name_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterName(PostgreSQLPlpgsqlInnerParser.NameContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitName(PostgreSQLPlpgsqlInnerParser.NameContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterAttr_name(PostgreSQLPlpgsqlInnerParser.Attr_nameContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitAttr_name(PostgreSQLPlpgsqlInnerParser.Attr_nameContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterFile_name(PostgreSQLPlpgsqlInnerParser.File_nameContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitFile_name(PostgreSQLPlpgsqlInnerParser.File_nameContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterFunc_name(PostgreSQLPlpgsqlInnerParser.Func_nameContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitFunc_name(PostgreSQLPlpgsqlInnerParser.Func_nameContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterAexprconst(PostgreSQLPlpgsqlInnerParser.AexprconstContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitAexprconst(PostgreSQLPlpgsqlInnerParser.AexprconstContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterXconst(PostgreSQLPlpgsqlInnerParser.XconstContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitXconst(PostgreSQLPlpgsqlInnerParser.XconstContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterBconst(PostgreSQLPlpgsqlInnerParser.BconstContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitBconst(PostgreSQLPlpgsqlInnerParser.BconstContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterFconst(PostgreSQLPlpgsqlInnerParser.FconstContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitFconst(PostgreSQLPlpgsqlInnerParser.FconstContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterIconst(PostgreSQLPlpgsqlInnerParser.IconstContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitIconst(PostgreSQLPlpgsqlInnerParser.IconstContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterSconst(PostgreSQLPlpgsqlInnerParser.SconstContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitSconst(PostgreSQLPlpgsqlInnerParser.SconstContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterAnysconst(PostgreSQLPlpgsqlInnerParser.AnysconstContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitAnysconst(PostgreSQLPlpgsqlInnerParser.AnysconstContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_uescape(PostgreSQLPlpgsqlInnerParser.Opt_uescapeContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_uescape(PostgreSQLPlpgsqlInnerParser.Opt_uescapeContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterSignediconst(PostgreSQLPlpgsqlInnerParser.SignediconstContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitSignediconst(PostgreSQLPlpgsqlInnerParser.SignediconstContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterRoleid(PostgreSQLPlpgsqlInnerParser.RoleidContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitRoleid(PostgreSQLPlpgsqlInnerParser.RoleidContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterRolespec(PostgreSQLPlpgsqlInnerParser.RolespecContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitRolespec(PostgreSQLPlpgsqlInnerParser.RolespecContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterRole_list(PostgreSQLPlpgsqlInnerParser.Role_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitRole_list(PostgreSQLPlpgsqlInnerParser.Role_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterColid(PostgreSQLPlpgsqlInnerParser.ColidContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitColid(PostgreSQLPlpgsqlInnerParser.ColidContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterType_function_name(PostgreSQLPlpgsqlInnerParser.Type_function_nameContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitType_function_name(PostgreSQLPlpgsqlInnerParser.Type_function_nameContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterNonreservedword(PostgreSQLPlpgsqlInnerParser.NonreservedwordContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitNonreservedword(PostgreSQLPlpgsqlInnerParser.NonreservedwordContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterCollabel(PostgreSQLPlpgsqlInnerParser.CollabelContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitCollabel(PostgreSQLPlpgsqlInnerParser.CollabelContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterIdentifier(PostgreSQLPlpgsqlInnerParser.IdentifierContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitIdentifier(PostgreSQLPlpgsqlInnerParser.IdentifierContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterPlsqlidentifier(PostgreSQLPlpgsqlInnerParser.PlsqlidentifierContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitPlsqlidentifier(PostgreSQLPlpgsqlInnerParser.PlsqlidentifierContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterUnreserved_keyword(PostgreSQLPlpgsqlInnerParser.Unreserved_keywordContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitUnreserved_keyword(PostgreSQLPlpgsqlInnerParser.Unreserved_keywordContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterCol_name_keyword(PostgreSQLPlpgsqlInnerParser.Col_name_keywordContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitCol_name_keyword(PostgreSQLPlpgsqlInnerParser.Col_name_keywordContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterType_func_name_keyword(PostgreSQLPlpgsqlInnerParser.Type_func_name_keywordContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitType_func_name_keyword(PostgreSQLPlpgsqlInnerParser.Type_func_name_keywordContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterReserved_keyword(PostgreSQLPlpgsqlInnerParser.Reserved_keywordContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitReserved_keyword(PostgreSQLPlpgsqlInnerParser.Reserved_keywordContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterPl_function(PostgreSQLPlpgsqlInnerParser.Pl_functionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitPl_function(PostgreSQLPlpgsqlInnerParser.Pl_functionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterComp_options(PostgreSQLPlpgsqlInnerParser.Comp_optionsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitComp_options(PostgreSQLPlpgsqlInnerParser.Comp_optionsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterComp_option(PostgreSQLPlpgsqlInnerParser.Comp_optionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitComp_option(PostgreSQLPlpgsqlInnerParser.Comp_optionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterSharp(PostgreSQLPlpgsqlInnerParser.SharpContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitSharp(PostgreSQLPlpgsqlInnerParser.SharpContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOption_value(PostgreSQLPlpgsqlInnerParser.Option_valueContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOption_value(PostgreSQLPlpgsqlInnerParser.Option_valueContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_semi(PostgreSQLPlpgsqlInnerParser.Opt_semiContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_semi(PostgreSQLPlpgsqlInnerParser.Opt_semiContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterPl_block(PostgreSQLPlpgsqlInnerParser.Pl_blockContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitPl_block(PostgreSQLPlpgsqlInnerParser.Pl_blockContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterDecl_sect(PostgreSQLPlpgsqlInnerParser.Decl_sectContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitDecl_sect(PostgreSQLPlpgsqlInnerParser.Decl_sectContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterDecl_start(PostgreSQLPlpgsqlInnerParser.Decl_startContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitDecl_start(PostgreSQLPlpgsqlInnerParser.Decl_startContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterDecl_stmts(PostgreSQLPlpgsqlInnerParser.Decl_stmtsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitDecl_stmts(PostgreSQLPlpgsqlInnerParser.Decl_stmtsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterLabel_decl(PostgreSQLPlpgsqlInnerParser.Label_declContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitLabel_decl(PostgreSQLPlpgsqlInnerParser.Label_declContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterDecl_stmt(PostgreSQLPlpgsqlInnerParser.Decl_stmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitDecl_stmt(PostgreSQLPlpgsqlInnerParser.Decl_stmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterDecl_statement(PostgreSQLPlpgsqlInnerParser.Decl_statementContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitDecl_statement(PostgreSQLPlpgsqlInnerParser.Decl_statementContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_scrollable(PostgreSQLPlpgsqlInnerParser.Opt_scrollableContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_scrollable(PostgreSQLPlpgsqlInnerParser.Opt_scrollableContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterDecl_cursor_query(PostgreSQLPlpgsqlInnerParser.Decl_cursor_queryContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitDecl_cursor_query(PostgreSQLPlpgsqlInnerParser.Decl_cursor_queryContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterDecl_cursor_args(PostgreSQLPlpgsqlInnerParser.Decl_cursor_argsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitDecl_cursor_args(PostgreSQLPlpgsqlInnerParser.Decl_cursor_argsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterDecl_cursor_arglist(PostgreSQLPlpgsqlInnerParser.Decl_cursor_arglistContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitDecl_cursor_arglist(PostgreSQLPlpgsqlInnerParser.Decl_cursor_arglistContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterDecl_cursor_arg(PostgreSQLPlpgsqlInnerParser.Decl_cursor_argContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitDecl_cursor_arg(PostgreSQLPlpgsqlInnerParser.Decl_cursor_argContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterDecl_is_for(PostgreSQLPlpgsqlInnerParser.Decl_is_forContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitDecl_is_for(PostgreSQLPlpgsqlInnerParser.Decl_is_forContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterDecl_aliasitem(PostgreSQLPlpgsqlInnerParser.Decl_aliasitemContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitDecl_aliasitem(PostgreSQLPlpgsqlInnerParser.Decl_aliasitemContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterDecl_varname(PostgreSQLPlpgsqlInnerParser.Decl_varnameContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitDecl_varname(PostgreSQLPlpgsqlInnerParser.Decl_varnameContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterDecl_const(PostgreSQLPlpgsqlInnerParser.Decl_constContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitDecl_const(PostgreSQLPlpgsqlInnerParser.Decl_constContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterDecl_datatype(PostgreSQLPlpgsqlInnerParser.Decl_datatypeContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitDecl_datatype(PostgreSQLPlpgsqlInnerParser.Decl_datatypeContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterDecl_collate(PostgreSQLPlpgsqlInnerParser.Decl_collateContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitDecl_collate(PostgreSQLPlpgsqlInnerParser.Decl_collateContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterDecl_notnull(PostgreSQLPlpgsqlInnerParser.Decl_notnullContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitDecl_notnull(PostgreSQLPlpgsqlInnerParser.Decl_notnullContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterDecl_defval(PostgreSQLPlpgsqlInnerParser.Decl_defvalContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitDecl_defval(PostgreSQLPlpgsqlInnerParser.Decl_defvalContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterDecl_defkey(PostgreSQLPlpgsqlInnerParser.Decl_defkeyContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitDecl_defkey(PostgreSQLPlpgsqlInnerParser.Decl_defkeyContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterAssign_operator(PostgreSQLPlpgsqlInnerParser.Assign_operatorContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitAssign_operator(PostgreSQLPlpgsqlInnerParser.Assign_operatorContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterProc_sect(PostgreSQLPlpgsqlInnerParser.Proc_sectContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitProc_sect(PostgreSQLPlpgsqlInnerParser.Proc_sectContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterProc_stmt(PostgreSQLPlpgsqlInnerParser.Proc_stmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitProc_stmt(PostgreSQLPlpgsqlInnerParser.Proc_stmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterStmt_perform(PostgreSQLPlpgsqlInnerParser.Stmt_performContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitStmt_perform(PostgreSQLPlpgsqlInnerParser.Stmt_performContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterStmt_call(PostgreSQLPlpgsqlInnerParser.Stmt_callContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitStmt_call(PostgreSQLPlpgsqlInnerParser.Stmt_callContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_expr_list(PostgreSQLPlpgsqlInnerParser.Opt_expr_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_expr_list(PostgreSQLPlpgsqlInnerParser.Opt_expr_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterStmt_assign(PostgreSQLPlpgsqlInnerParser.Stmt_assignContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitStmt_assign(PostgreSQLPlpgsqlInnerParser.Stmt_assignContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterStmt_getdiag(PostgreSQLPlpgsqlInnerParser.Stmt_getdiagContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitStmt_getdiag(PostgreSQLPlpgsqlInnerParser.Stmt_getdiagContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterGetdiag_area_opt(PostgreSQLPlpgsqlInnerParser.Getdiag_area_optContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitGetdiag_area_opt(PostgreSQLPlpgsqlInnerParser.Getdiag_area_optContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterGetdiag_list(PostgreSQLPlpgsqlInnerParser.Getdiag_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitGetdiag_list(PostgreSQLPlpgsqlInnerParser.Getdiag_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterGetdiag_list_item(PostgreSQLPlpgsqlInnerParser.Getdiag_list_itemContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitGetdiag_list_item(PostgreSQLPlpgsqlInnerParser.Getdiag_list_itemContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterGetdiag_item(PostgreSQLPlpgsqlInnerParser.Getdiag_itemContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitGetdiag_item(PostgreSQLPlpgsqlInnerParser.Getdiag_itemContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterGetdiag_target(PostgreSQLPlpgsqlInnerParser.Getdiag_targetContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitGetdiag_target(PostgreSQLPlpgsqlInnerParser.Getdiag_targetContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterAssign_var(PostgreSQLPlpgsqlInnerParser.Assign_varContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitAssign_var(PostgreSQLPlpgsqlInnerParser.Assign_varContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterStmt_if(PostgreSQLPlpgsqlInnerParser.Stmt_ifContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitStmt_if(PostgreSQLPlpgsqlInnerParser.Stmt_ifContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterStmt_elsifs(PostgreSQLPlpgsqlInnerParser.Stmt_elsifsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitStmt_elsifs(PostgreSQLPlpgsqlInnerParser.Stmt_elsifsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterStmt_else(PostgreSQLPlpgsqlInnerParser.Stmt_elseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitStmt_else(PostgreSQLPlpgsqlInnerParser.Stmt_elseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterStmt_case(PostgreSQLPlpgsqlInnerParser.Stmt_caseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitStmt_case(PostgreSQLPlpgsqlInnerParser.Stmt_caseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_expr_until_when(PostgreSQLPlpgsqlInnerParser.Opt_expr_until_whenContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_expr_until_when(PostgreSQLPlpgsqlInnerParser.Opt_expr_until_whenContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterCase_when_list(PostgreSQLPlpgsqlInnerParser.Case_when_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitCase_when_list(PostgreSQLPlpgsqlInnerParser.Case_when_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterCase_when(PostgreSQLPlpgsqlInnerParser.Case_whenContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitCase_when(PostgreSQLPlpgsqlInnerParser.Case_whenContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_case_else(PostgreSQLPlpgsqlInnerParser.Opt_case_elseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_case_else(PostgreSQLPlpgsqlInnerParser.Opt_case_elseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterStmt_loop(PostgreSQLPlpgsqlInnerParser.Stmt_loopContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitStmt_loop(PostgreSQLPlpgsqlInnerParser.Stmt_loopContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterStmt_while(PostgreSQLPlpgsqlInnerParser.Stmt_whileContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitStmt_while(PostgreSQLPlpgsqlInnerParser.Stmt_whileContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterStmt_for(PostgreSQLPlpgsqlInnerParser.Stmt_forContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitStmt_for(PostgreSQLPlpgsqlInnerParser.Stmt_forContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterFor_control(PostgreSQLPlpgsqlInnerParser.For_controlContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitFor_control(PostgreSQLPlpgsqlInnerParser.For_controlContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_for_using_expression(PostgreSQLPlpgsqlInnerParser.Opt_for_using_expressionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_for_using_expression(PostgreSQLPlpgsqlInnerParser.Opt_for_using_expressionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_cursor_parameters(PostgreSQLPlpgsqlInnerParser.Opt_cursor_parametersContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_cursor_parameters(PostgreSQLPlpgsqlInnerParser.Opt_cursor_parametersContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_reverse(PostgreSQLPlpgsqlInnerParser.Opt_reverseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_reverse(PostgreSQLPlpgsqlInnerParser.Opt_reverseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_by_expression(PostgreSQLPlpgsqlInnerParser.Opt_by_expressionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_by_expression(PostgreSQLPlpgsqlInnerParser.Opt_by_expressionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterFor_variable(PostgreSQLPlpgsqlInnerParser.For_variableContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitFor_variable(PostgreSQLPlpgsqlInnerParser.For_variableContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterStmt_foreach_a(PostgreSQLPlpgsqlInnerParser.Stmt_foreach_aContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitStmt_foreach_a(PostgreSQLPlpgsqlInnerParser.Stmt_foreach_aContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterForeach_slice(PostgreSQLPlpgsqlInnerParser.Foreach_sliceContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitForeach_slice(PostgreSQLPlpgsqlInnerParser.Foreach_sliceContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterStmt_exit(PostgreSQLPlpgsqlInnerParser.Stmt_exitContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitStmt_exit(PostgreSQLPlpgsqlInnerParser.Stmt_exitContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterExit_type(PostgreSQLPlpgsqlInnerParser.Exit_typeContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitExit_type(PostgreSQLPlpgsqlInnerParser.Exit_typeContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterStmt_return(PostgreSQLPlpgsqlInnerParser.Stmt_returnContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitStmt_return(PostgreSQLPlpgsqlInnerParser.Stmt_returnContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_return_result(PostgreSQLPlpgsqlInnerParser.Opt_return_resultContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_return_result(PostgreSQLPlpgsqlInnerParser.Opt_return_resultContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterStmt_raise(PostgreSQLPlpgsqlInnerParser.Stmt_raiseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitStmt_raise(PostgreSQLPlpgsqlInnerParser.Stmt_raiseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_stmt_raise_level(PostgreSQLPlpgsqlInnerParser.Opt_stmt_raise_levelContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_stmt_raise_level(PostgreSQLPlpgsqlInnerParser.Opt_stmt_raise_levelContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_raise_list(PostgreSQLPlpgsqlInnerParser.Opt_raise_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_raise_list(PostgreSQLPlpgsqlInnerParser.Opt_raise_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_raise_using(PostgreSQLPlpgsqlInnerParser.Opt_raise_usingContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_raise_using(PostgreSQLPlpgsqlInnerParser.Opt_raise_usingContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_raise_using_elem(PostgreSQLPlpgsqlInnerParser.Opt_raise_using_elemContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_raise_using_elem(PostgreSQLPlpgsqlInnerParser.Opt_raise_using_elemContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_raise_using_elem_list(PostgreSQLPlpgsqlInnerParser.Opt_raise_using_elem_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_raise_using_elem_list(PostgreSQLPlpgsqlInnerParser.Opt_raise_using_elem_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterStmt_assert(PostgreSQLPlpgsqlInnerParser.Stmt_assertContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitStmt_assert(PostgreSQLPlpgsqlInnerParser.Stmt_assertContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_stmt_assert_message(PostgreSQLPlpgsqlInnerParser.Opt_stmt_assert_messageContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_stmt_assert_message(PostgreSQLPlpgsqlInnerParser.Opt_stmt_assert_messageContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterLoop_body(PostgreSQLPlpgsqlInnerParser.Loop_bodyContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitLoop_body(PostgreSQLPlpgsqlInnerParser.Loop_bodyContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterStmt_execsql(PostgreSQLPlpgsqlInnerParser.Stmt_execsqlContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitStmt_execsql(PostgreSQLPlpgsqlInnerParser.Stmt_execsqlContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterStmt_dynexecute(PostgreSQLPlpgsqlInnerParser.Stmt_dynexecuteContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitStmt_dynexecute(PostgreSQLPlpgsqlInnerParser.Stmt_dynexecuteContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_execute_using(PostgreSQLPlpgsqlInnerParser.Opt_execute_usingContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_execute_using(PostgreSQLPlpgsqlInnerParser.Opt_execute_usingContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_execute_using_list(PostgreSQLPlpgsqlInnerParser.Opt_execute_using_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_execute_using_list(PostgreSQLPlpgsqlInnerParser.Opt_execute_using_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_execute_into(PostgreSQLPlpgsqlInnerParser.Opt_execute_intoContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_execute_into(PostgreSQLPlpgsqlInnerParser.Opt_execute_intoContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterStmt_open(PostgreSQLPlpgsqlInnerParser.Stmt_openContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitStmt_open(PostgreSQLPlpgsqlInnerParser.Stmt_openContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_open_bound_list_item(PostgreSQLPlpgsqlInnerParser.Opt_open_bound_list_itemContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_open_bound_list_item(PostgreSQLPlpgsqlInnerParser.Opt_open_bound_list_itemContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_open_bound_list(PostgreSQLPlpgsqlInnerParser.Opt_open_bound_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_open_bound_list(PostgreSQLPlpgsqlInnerParser.Opt_open_bound_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_open_using(PostgreSQLPlpgsqlInnerParser.Opt_open_usingContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_open_using(PostgreSQLPlpgsqlInnerParser.Opt_open_usingContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_scroll_option(PostgreSQLPlpgsqlInnerParser.Opt_scroll_optionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_scroll_option(PostgreSQLPlpgsqlInnerParser.Opt_scroll_optionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_scroll_option_no(PostgreSQLPlpgsqlInnerParser.Opt_scroll_option_noContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_scroll_option_no(PostgreSQLPlpgsqlInnerParser.Opt_scroll_option_noContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterStmt_fetch(PostgreSQLPlpgsqlInnerParser.Stmt_fetchContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitStmt_fetch(PostgreSQLPlpgsqlInnerParser.Stmt_fetchContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterInto_target(PostgreSQLPlpgsqlInnerParser.Into_targetContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitInto_target(PostgreSQLPlpgsqlInnerParser.Into_targetContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_cursor_from(PostgreSQLPlpgsqlInnerParser.Opt_cursor_fromContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_cursor_from(PostgreSQLPlpgsqlInnerParser.Opt_cursor_fromContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_fetch_direction(PostgreSQLPlpgsqlInnerParser.Opt_fetch_directionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_fetch_direction(PostgreSQLPlpgsqlInnerParser.Opt_fetch_directionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterStmt_move(PostgreSQLPlpgsqlInnerParser.Stmt_moveContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitStmt_move(PostgreSQLPlpgsqlInnerParser.Stmt_moveContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterStmt_close(PostgreSQLPlpgsqlInnerParser.Stmt_closeContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitStmt_close(PostgreSQLPlpgsqlInnerParser.Stmt_closeContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterStmt_null(PostgreSQLPlpgsqlInnerParser.Stmt_nullContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitStmt_null(PostgreSQLPlpgsqlInnerParser.Stmt_nullContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterStmt_commit(PostgreSQLPlpgsqlInnerParser.Stmt_commitContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitStmt_commit(PostgreSQLPlpgsqlInnerParser.Stmt_commitContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterStmt_rollback(PostgreSQLPlpgsqlInnerParser.Stmt_rollbackContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitStmt_rollback(PostgreSQLPlpgsqlInnerParser.Stmt_rollbackContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterPlsql_opt_transaction_chain(PostgreSQLPlpgsqlInnerParser.Plsql_opt_transaction_chainContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitPlsql_opt_transaction_chain(PostgreSQLPlpgsqlInnerParser.Plsql_opt_transaction_chainContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterStmt_set(PostgreSQLPlpgsqlInnerParser.Stmt_setContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitStmt_set(PostgreSQLPlpgsqlInnerParser.Stmt_setContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterCursor_variable(PostgreSQLPlpgsqlInnerParser.Cursor_variableContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitCursor_variable(PostgreSQLPlpgsqlInnerParser.Cursor_variableContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterException_sect(PostgreSQLPlpgsqlInnerParser.Exception_sectContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitException_sect(PostgreSQLPlpgsqlInnerParser.Exception_sectContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterProc_exceptions(PostgreSQLPlpgsqlInnerParser.Proc_exceptionsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitProc_exceptions(PostgreSQLPlpgsqlInnerParser.Proc_exceptionsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterProc_exception(PostgreSQLPlpgsqlInnerParser.Proc_exceptionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitProc_exception(PostgreSQLPlpgsqlInnerParser.Proc_exceptionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterProc_conditions(PostgreSQLPlpgsqlInnerParser.Proc_conditionsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitProc_conditions(PostgreSQLPlpgsqlInnerParser.Proc_conditionsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterProc_condition(PostgreSQLPlpgsqlInnerParser.Proc_conditionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitProc_condition(PostgreSQLPlpgsqlInnerParser.Proc_conditionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_block_label(PostgreSQLPlpgsqlInnerParser.Opt_block_labelContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_block_label(PostgreSQLPlpgsqlInnerParser.Opt_block_labelContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_loop_label(PostgreSQLPlpgsqlInnerParser.Opt_loop_labelContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_loop_label(PostgreSQLPlpgsqlInnerParser.Opt_loop_labelContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_label(PostgreSQLPlpgsqlInnerParser.Opt_labelContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_label(PostgreSQLPlpgsqlInnerParser.Opt_labelContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_exitcond(PostgreSQLPlpgsqlInnerParser.Opt_exitcondContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_exitcond(PostgreSQLPlpgsqlInnerParser.Opt_exitcondContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterAny_identifier(PostgreSQLPlpgsqlInnerParser.Any_identifierContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitAny_identifier(PostgreSQLPlpgsqlInnerParser.Any_identifierContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterPlsql_unreserved_keyword(PostgreSQLPlpgsqlInnerParser.Plsql_unreserved_keywordContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitPlsql_unreserved_keyword(PostgreSQLPlpgsqlInnerParser.Plsql_unreserved_keywordContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterSql_expression(PostgreSQLPlpgsqlInnerParser.Sql_expressionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitSql_expression(PostgreSQLPlpgsqlInnerParser.Sql_expressionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterExpr_until_then(PostgreSQLPlpgsqlInnerParser.Expr_until_thenContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitExpr_until_then(PostgreSQLPlpgsqlInnerParser.Expr_until_thenContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterExpr_until_semi(PostgreSQLPlpgsqlInnerParser.Expr_until_semiContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitExpr_until_semi(PostgreSQLPlpgsqlInnerParser.Expr_until_semiContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterExpr_until_rightbracket(PostgreSQLPlpgsqlInnerParser.Expr_until_rightbracketContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitExpr_until_rightbracket(PostgreSQLPlpgsqlInnerParser.Expr_until_rightbracketContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterExpr_until_loop(PostgreSQLPlpgsqlInnerParser.Expr_until_loopContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitExpr_until_loop(PostgreSQLPlpgsqlInnerParser.Expr_until_loopContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterMake_execsql_stmt(PostgreSQLPlpgsqlInnerParser.Make_execsql_stmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitMake_execsql_stmt(PostgreSQLPlpgsqlInnerParser.Make_execsql_stmtContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterOpt_returning_clause_into(PostgreSQLPlpgsqlInnerParser.Opt_returning_clause_intoContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitOpt_returning_clause_into(PostgreSQLPlpgsqlInnerParser.Opt_returning_clause_intoContext ctx) { }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void enterEveryRule(ParserRuleContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void exitEveryRule(ParserRuleContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void visitTerminal(TerminalNode node) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override default void visitErrorNode(ErrorNode node) { }
}
