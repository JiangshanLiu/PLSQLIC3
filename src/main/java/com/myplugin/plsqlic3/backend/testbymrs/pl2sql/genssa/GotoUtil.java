package com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;
import com.myplugin.plsqlic3.backend.parsers.parseplpgsql.PostgreSQLParser;
import com.myplugin.plsqlic3.backend.parsers.parserutil.token.PlSqlToken;
import com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa.ssanode.*;
import com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa.struct.FunctionInfo;
import com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa.struct.GotoFromInfo;
import com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa.struct.Label;

import java.util.*;

import static com.myplugin.plsqlic3.backend.parsers.parseplpgsql.PostgreSQLLexer.*;
import static com.myplugin.plsqlic3.backend.runnable.DatabaseType.GAUSSDB;
import static com.myplugin.plsqlic3.backend.runnable.GlobalConfig.aux_ctrl_col;
import static com.myplugin.plsqlic3.backend.runnable.GlobalConfig.db_type;
import static com.myplugin.plsqlic3.backend.runnable.LogToFile.LOG_TYPE.PRINT;
import static com.myplugin.plsqlic3.backend.runnable.LogToFile.writeLog;
import static com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa.ssanode.AbstractSsaNode.LabelType.START;
import static com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa.ssanode.AbstractSsaNode.SsaNodeType.*;
import static com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa.ssanode.AssignExprType.*;
import static com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa.ssanode.IfelseSsaNode.IfelseLabelType.*;
import static com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa.ssanode.IterVirtualNode.IterLabelType;
import static com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa.ssanode.IterVirtualNode.IterLabelType.*;

public class GotoUtil {
    // handling nested loops
    private final Stack<IterVirtualNode> iter_stack_gamma = new Stack<>();
    // handling nested if else
    private final Stack<IfelseSsaNode> ifelse_stack_gamma = new Stack<>();
    // data structure of statement sequences
    public LinkedHashMap<Label, ArrayList<AbstractSsaNode>> block_dict_s = new LinkedHashMap<>();

    public FunctionInfo func_info = new FunctionInfo();

    private final boolean debug_flag = false;

    private static ParserRuleContext getTrampolineCond() {
        ParserRuleContext ctx_cond = new ParserRuleContext();
        ctx_cond.addChild(new TerminalNodeImpl(new PlSqlToken(Identifier, aux_ctrl_col[1])));
        ctx_cond.addChild(new TerminalNodeImpl(new PlSqlToken(EQUAL, "=")));
        ctx_cond.addChild(new TerminalNodeImpl(new PlSqlToken(StringConstant, "")));
        return ctx_cond;
    }

    public GotoUtil() {
        switch (db_type) {
            case ORACLE:
//            Label.setStatic_trampline_cond(PlPgSqlListenerImp.getTrampolineCond());
                break;
            case POSTGRES:
            case GAUSSDB:
                Label.setStatic_trampline_cond(getTrampolineCond());
                break;
        }

        Label label_start = new Label(START.toString());
        block_dict_s.put(label_start, new ArrayList<>());
        Label.setPre_label(label_start);
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        for (Map.Entry<Label, ArrayList<AbstractSsaNode>> entry : block_dict_s.entrySet()) {
            Label label = entry.getKey();
            sb.append(label).append(":\t").append(label.label_comment).append("\n");
            for (AbstractSsaNode as_node : block_dict_s.get(label)) {
                sb.append(as_node.toString());
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public void addNode(AbstractSsaNode node) {
        block_dict_s.get(Label.getPre_label()).add(node);
    }

    public void updateLabel(Label label) {
        Label.setPre_label(label);
    }

    // Fig.16 Decl
    // Fig.16 Decl0
    // Fig.16 Assign
    // ATTENTION!!!
    // because ANTLR should get a Token
    public void establishAssignNode(ParserRuleContext ctx_id, ParserRuleContext ctx_expr, AssignExprType assign_type) {
        if (debug_flag) {
            writeLog(PRINT, "ASN:\t" + ctx_id.getText() + ctx_expr.getText());
        }
        AssignSsaNode a_node = new AssignSsaNode(ctx_id, ctx_expr, assign_type);
        addNode(a_node);
        if (db_type == GAUSSDB) {
            Label label_next = new Label("NEXT");
            block_dict_s.put(label_next, new ArrayList<>());
            GotoSsaNode g_node_next = new GotoSsaNode(label_next);
            addNode(g_node_next);
            updateLabel(label_next);
        }
    }

    // Fig.16 Iter
    // This function is called by Loop, While and For, so it is private
    private HashMap<IterLabelType, Label> establishIterNode() {
        IterVirtualNode i_node = new IterVirtualNode();
        iter_stack_gamma.push(i_node);

        Label label_init = new Label(INIT.toString());
        i_node.label_list.put(INIT, label_init);
        block_dict_s.put(label_init, new ArrayList<>());

        Label label_head = new Label(HEAD.toString());
        i_node.label_list.put(HEAD, label_head);
        block_dict_s.put(label_head, new ArrayList<>());

        Label label_body = new Label(BODY.toString());
        i_node.label_list.put(BODY, label_body);
        block_dict_s.put(label_body, new ArrayList<>());

        Label label_end = new Label(END.toString());
        i_node.label_list.put(END, label_end);
        block_dict_s.put(label_end, new ArrayList<>());

        GotoSsaNode g_node_init = new GotoSsaNode(label_init);
        addNode(g_node_init);

        return i_node.label_list;
    }

    // Fig.16 Loop
    public void establishLoopNode() {
        if (debug_flag) {
            writeLog(PRINT, "LOP");
        }
        HashMap<IterLabelType, Label> iter_label_list = establishIterNode();

        updateLabel(iter_label_list.get(INIT));
        addNode(new GotoSsaNode(iter_label_list.get(HEAD)));

        updateLabel(iter_label_list.get(HEAD));
        addNode(new GotoSsaNode(iter_label_list.get(BODY)));

        updateLabel(iter_label_list.get(BODY));
    }

    public void endLoop() {
        Label label_head = iter_stack_gamma.peek().label_list.get(HEAD);
        Label label_end = iter_stack_gamma.peek().label_list.get(END);
        GotoSsaNode g_node_head = new GotoSsaNode(label_head);
        addNode(g_node_head);
        updateLabel(label_end);

        iter_stack_gamma.pop();
    }

    // Fig.16 While
    public void establishWhileNode(ParserRuleContext ctx_cond_var, ParserRuleContext ctx_cond) {
        if (debug_flag) {
            writeLog(PRINT, "WHL:\t" + ctx_cond.getText());
        }
        HashMap<IterLabelType, Label> iter_label_list = establishIterNode();

        updateLabel(iter_label_list.get(INIT));
        addNode(new GotoSsaNode(iter_label_list.get(HEAD)));

        updateLabel(iter_label_list.get(HEAD));
        AssignSsaNode cond_a_node = new AssignSsaNode(ctx_cond_var, ctx_cond, ASSIGN_EXPR);
        addNode(cond_a_node);
        GotoSsaNode g_node_body = new GotoSsaNode(iter_label_list.get(BODY));
        GotoSsaNode g_node_end = new GotoSsaNode(iter_label_list.get(END));
        IfelseSsaNode i_node = new IfelseSsaNode(ctx_cond_var, g_node_body, g_node_end);
        addNode(i_node);

        updateLabel(iter_label_list.get(BODY));
    }

    public void endWhile() {
        Label label_head = iter_stack_gamma.peek().label_list.get(HEAD);
        Label label_end = iter_stack_gamma.peek().label_list.get(END);
        GotoSsaNode g_node_head = new GotoSsaNode(label_head);
        addNode(g_node_head);
        updateLabel(label_end);

        iter_stack_gamma.pop();
    }

    // Fig.16 For
    public void establishForIntNode(ParserRuleContext ctx_var,
                                    ParserRuleContext ctx_init,
                                    ParserRuleContext ctx_term,
                                    ParserRuleContext ctx_cond_var,
                                    ParserRuleContext ctx_cond,
                                    ParserRuleContext ctx_assign_var,
                                    ParserRuleContext ctx_assign_value) {
        if (debug_flag) {
            writeLog(PRINT, "FOR:\t" + ctx_var.getText() + " IN " + ctx_init.getText() + " .. " + ctx_term.getText());
        }
        HashMap<IterLabelType, Label> iter_label_list = establishIterNode();

        updateLabel(iter_label_list.get(INIT));
        establishAssignNode(ctx_var, ctx_init, ASSIGN_EXPR);
        addNode(new GotoSsaNode(iter_label_list.get(HEAD)));

        updateLabel(iter_label_list.get(HEAD));
        AssignSsaNode cond_a_node = new AssignSsaNode(ctx_cond_var, ctx_cond, ASSIGN_CONST);
        addNode(cond_a_node);
        GotoSsaNode g_node_body = new GotoSsaNode(iter_label_list.get(BODY));
        GotoSsaNode g_node_end = new GotoSsaNode(iter_label_list.get(END));
        IfelseSsaNode i_node = new IfelseSsaNode(ctx_cond_var, g_node_body, g_node_end);
        addNode(i_node);

        updateLabel(iter_label_list.get(BODY));
        if (ctx_assign_var != null && ctx_assign_value != null) {
            AssignSsaNode corsor_a_node = new AssignSsaNode(ctx_assign_var,
                    ctx_assign_value,
                    ctx_assign_var.parent instanceof PostgreSQLParser.Stmt_foreach_aContext ? ASSIGN_EXPR : ASSIGN_SQL);
            addNode(corsor_a_node);
        }
    }

    public void endForInt(ParserRuleContext ctx_var, ParserRuleContext ctx_iter) {
        establishAssignNode(ctx_var, ctx_iter, ASSIGN_EXPR);

        Label label_head = iter_stack_gamma.peek().label_list.get(HEAD);
        Label label_end = iter_stack_gamma.peek().label_list.get(END);
        GotoSsaNode g_node_head = new GotoSsaNode(label_head);
        addNode(g_node_head);
        updateLabel(label_end);

        iter_stack_gamma.pop();
    }

    // Fig.16 Exit
    public void establishExitNode() {
        if (debug_flag) {
            writeLog(PRINT, "EXI");
        }

        Label label_end = iter_stack_gamma.peek().label_list.get(END);
        GotoSsaNode g_node_end = new GotoSsaNode(label_end);
        addNode(g_node_end);
    }

    // Fig.16 Cont
    public void establishContinueNode() {
        if (debug_flag) {
            writeLog(PRINT, "CON");
        }

        Label label_head = iter_stack_gamma.peek().label_list.get(HEAD);
        GotoSsaNode g_node_head = new GotoSsaNode(label_head);
        addNode(g_node_head);
    }

    // Fig.16 IfElse
    // Fig.16 If
    public void establishIfelseNode(ParserRuleContext ctx_cond_var, ParserRuleContext ctx_cond) {
        if (debug_flag) {
            writeLog(PRINT, "IFS:\t" + ctx_cond.getText());
        }

        Label label_then = new Label(IFELSE_THEN.toString());
        block_dict_s.put(label_then, new ArrayList<>());
        GotoSsaNode g_node_then = new GotoSsaNode(label_then);

        Label label_else = new Label(IFELSE_ELSE.toString());
        block_dict_s.put(label_else, new ArrayList<>());
        GotoSsaNode g_node_else = new GotoSsaNode(label_else);

        Label label_meet = new Label(IFELSE_MEET.toString());
        block_dict_s.put(label_meet, new ArrayList<>());

        AssignSsaNode cond_a_node = new AssignSsaNode(ctx_cond_var, ctx_cond, ASSIGN_EXPR);
        addNode(cond_a_node);
        IfelseSsaNode i_node = new IfelseSsaNode(ctx_cond_var, g_node_then, g_node_else);
        i_node.label_list.put(IFELSE_THEN, label_then);
        i_node.label_list.put(IFELSE_ELSE, label_else);
        i_node.label_list.put(IFELSE_MEET, label_meet);

        addNode(i_node);
        updateLabel(i_node.label_list.get(IFELSE_THEN));
        ifelse_stack_gamma.push(i_node);
    }

    public void endThen() {
        IfelseSsaNode i_node = ifelse_stack_gamma.peek();
        GotoSsaNode g_node_meet = new GotoSsaNode(i_node.label_list.get(IFELSE_MEET));
        addNode(g_node_meet);
        updateLabel(i_node.label_list.get(IFELSE_ELSE));
    }

    public void endElse() {
        IfelseSsaNode i_node = ifelse_stack_gamma.peek();
        GotoSsaNode g_node_meet = new GotoSsaNode(i_node.label_list.get(IFELSE_MEET));
        addNode(g_node_meet);
        updateLabel(i_node.label_list.get(IFELSE_MEET));

        ifelse_stack_gamma.pop();
    }

    // Fig.16 Return
    public void establishReturnNode(ParserRuleContext ctx_retexpr) {
        if (debug_flag) {
            writeLog(PRINT, "RET:\t" + ctx_retexpr.getText());
        }
        ReturnSsaNode r_node = new ReturnSsaNode();
        try {
            r_node.has_ret_value = true;
            r_node.ret_expr = ctx_retexpr;
            if (ctx_retexpr.getText().equals("")) {
                r_node.has_ret_value = false;
            }
        } catch (NullPointerException ignored) {
            r_node.has_ret_value = false;
        }
        addNode(r_node);
    }

    /* Origin goto blocks have too much redundancy,
     * delete redundant nodes behind first goto node;
     * put dominated blocks in one block.
     * */
    public void simplifyGoto() {
        for (Label lab : block_dict_s.keySet()) {
            if (block_dict_s.get(lab).size() == 0) {
                ReturnSsaNode r_node = new ReturnSsaNode();
                r_node.has_ret_value = false;
//                r_node.has_ret_value = true;
//                r_node.ret_expr = new ParserRuleContext() {{
//                    addChild(new TerminalNodeImpl(new PlSqlToken(NULL_P, "null")));
//                }};
                block_dict_s.get(lab).add(r_node);
            }
        }
        // key: to, value: from
        HashMap<Label, ArrayList<GotoFromInfo>> source_blocks_map = new HashMap<>();
        List<Label> label_list = new ArrayList<>(block_dict_s.keySet());
        Collections.sort(label_list);

        // empty block_with_goto
        for (Label label : label_list) {
            source_blocks_map.put(label, new ArrayList<>());
        }

        // visit all node of source code to:
        // 1. delete redundant nodes behind first goto node
        // 2. fill with the block_with_goto
        for (Label label : label_list) {
            boolean before_exit_flag = true;
            Iterator<AbstractSsaNode> it = block_dict_s.get(label).iterator();
            while (it.hasNext()) {
                AbstractSsaNode asn = it.next();
                if (before_exit_flag) {
                    if (asn.getNode_type() == NODE_GOTO) {
                        source_blocks_map.get(((GotoSsaNode) asn).goto_label).add(new GotoFromInfo(label, block_dict_s.get(label), block_dict_s.get(label).indexOf(asn)));
                        before_exit_flag = false;
                    } else if (asn.getNode_type() == NODE_IFELSE) {
                        for (AbstractSsaNode asn_then : ((IfelseSsaNode) asn).then_block) {
                            if (asn_then.getNode_type() == NODE_GOTO) {
                                source_blocks_map.get(((GotoSsaNode) asn_then).goto_label).add(new GotoFromInfo(label, ((IfelseSsaNode) asn).then_block, ((IfelseSsaNode) asn).then_block.indexOf(asn_then)));
                            }
                        }
                        for (AbstractSsaNode asn_else : ((IfelseSsaNode) asn).else_block) {
                            if (asn_else.getNode_type() == NODE_GOTO) {
                                source_blocks_map.get(((GotoSsaNode) asn_else).goto_label).add(new GotoFromInfo(label, ((IfelseSsaNode) asn).else_block, ((IfelseSsaNode) asn).else_block.indexOf(asn_else)));
                            }
                        }
                    } else if (asn.getNode_type() == NODE_RETURN) {
                        before_exit_flag = false;
                    }
                } else {
                    // delete redundant nodes behind first goto node
                    it.remove();
                }
            }
        }

        switch (db_type) {
            case GAUSSDB:

                break;

            case POSTGRES:

                // put dominated blocks in one block
                for (Label label : label_list) {
                    // Only 1 block goto label block, move label block to Goto node
                    if (source_blocks_map.get(label).size() == 1) {
                        // add all nodes from dest block of GOTO to source block of GOTO
                        int index = source_blocks_map.get(label).get(0).from_block_index;
                        source_blocks_map.get(label).get(0).from_block.addAll(index + 1, block_dict_s.get(label));
                        source_blocks_map.get(label).get(0).from_block.remove(index);
                        // update block_with_goto
                        for (Label label1 : label_list) {
                            for (GotoFromInfo gfi : source_blocks_map.get(label1)) {
                                if (gfi.from_label == label) {
                                    gfi.from_label = source_blocks_map.get(label).get(0).from_label;
                                    // when goto node is in dest block directly, move action will change the from_block
                                    try {
                                        AbstractSsaNode asn_goto = gfi.from_block.get(gfi.from_block_index);        // bug!!!
                                        if (block_dict_s.get(label).contains(asn_goto)) {
                                            gfi.from_block = source_blocks_map.get(label).get(0).from_block;
                                            gfi.from_block_index = gfi.from_block.indexOf(asn_goto);
                                        }
                                    } catch (IndexOutOfBoundsException e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                        }
                        // remove dest block of GOTO
                        block_dict_s.remove(label);
                    } else {
                        // the dest block has only 1 goto node, although more than 1 source blocks goto this dest block
                        if (block_dict_s.get(label).size() == 1 && block_dict_s.get(label).get(0).getNode_type() == NODE_GOTO) {
                            for (GotoFromInfo gfi : source_blocks_map.get(label)) {
                                // move goto node in dest block to all the source blocks
                                // this may cause one goto node copy (not deep copy) to many blocks,
                                // it will interfere SSA arguments index defination when changing GOTO to ANF,
                                // so we should use deep copy by new goto nodes.
                                gfi.from_block.add(gfi.from_block_index + 1, new GotoSsaNode((GotoSsaNode) block_dict_s.get(label).get(0)));
                                gfi.from_block.remove(gfi.from_block_index);
                            }
                            // update block_with_goto
                            ArrayList<GotoFromInfo> gfi_list_src = source_blocks_map.get(label);
                            ArrayList<GotoFromInfo> gfi_list_dest = source_blocks_map.get(((GotoSsaNode) block_dict_s.get(label).get(0)).goto_label);
                            gfi_list_dest.clear();
                            gfi_list_dest.addAll(gfi_list_src);
                            // remove dest block of GOTO
                            block_dict_s.remove(label);
                        }
                    }
                }
                break;

            default:
                break;
        }
        func_info.source_blocks_map = source_blocks_map;
    }

    /* Origin goto blocks have too much redundancy,
     * delete redundant nodes behind first goto node;
     * put dominated blocks in one block.
     * */
    public void simplifyGoto_() {
        // key: to, value: from
        HashMap<Label, ArrayList<Label>> opst_cfg = new HashMap<>();
        Set<Label> label_set = block_dict_s.keySet();
        List<Label> label_list = new ArrayList<>(label_set);
        HashMap<Label, Boolean> if_has_ifelse = new HashMap<>();
        Collections.sort(label_list);
        // empty opst_cfg
        for (Label label : label_list) {
            opst_cfg.put(label, new ArrayList<>());
        }

        // establish opst_cfg
        for (Label label : label_list) {
            // after meet first exit (goto or return), following nodes should be removed
            boolean first_exit_flag = true;
            Iterator<AbstractSsaNode> it = block_dict_s.get(label).iterator();
            while (it.hasNext()) {
                AbstractSsaNode asn = it.next();
                // delete redundant nodes behind first goto node
                if (!first_exit_flag) {
                    it.remove();
                }
                // To avoid nested if-else block
                if (asn.getNode_type() == NODE_IFELSE) {
                    if_has_ifelse.put(label, true);
                } else {
                    if_has_ifelse.put(label, false);
                }
                // establish opst_cfg
                if (asn.getNode_type() == NODE_GOTO) {
                    if (first_exit_flag) {
                        opst_cfg.get(((GotoSsaNode) asn).goto_label).add(label);
                        first_exit_flag = false;
                    }
                } else if (asn.getNode_type() == NODE_IFELSE) {
                    for (AbstractSsaNode asn_then : ((IfelseSsaNode) asn).then_block) {
                        if (asn_then.getNode_type() == NODE_GOTO) {
                            opst_cfg.get(((GotoSsaNode) asn_then).goto_label).add(label);
                        }
                    }
                    for (AbstractSsaNode asn_else : ((IfelseSsaNode) asn).else_block) {
                        if (asn_else.getNode_type() == NODE_GOTO) {
                            opst_cfg.get(((GotoSsaNode) asn_else).goto_label).add(label);
                        }
                    }
                } else if (asn.getNode_type() == NODE_RETURN) {
                    if (first_exit_flag) {
                        first_exit_flag = false;
                    }
                }
            }
        }

        // put dominated blocks in one block
        Iterator<Label> it_label = label_list.iterator();
        while (it_label.hasNext()) {
            // Only 1 block goto label block, move label block to Goto node
            Label label = it_label.next();
            if (opst_cfg.get(label).size() == 1) {
                boolean if_add = false;
                ArrayList<AbstractSsaNode> from_block = null;
                ArrayList<AbstractSsaNode> to_block = null;
                int add_index = -1;
                ArrayList<AbstractSsaNode> it_block = block_dict_s.get(opst_cfg.get(label).get(0));
                Iterator<AbstractSsaNode> it = it_block.iterator();
                while (it.hasNext()) {
                    AbstractSsaNode it_asn = it.next();
                    if (it_asn.getNode_type() == NODE_GOTO) {
                        if (((GotoSsaNode) it_asn).goto_label == label) {
                            if_add = true;
                            from_block = it_block;
                            to_block = block_dict_s.get(label);
                            add_index = from_block.indexOf(it_asn);
                            it.remove();
                        }
                    } else if (it_asn.getNode_type() == NODE_IFELSE) {
                        ArrayList<AbstractSsaNode> then_block = ((IfelseSsaNode) it_asn).then_block;
                        Iterator<AbstractSsaNode> it_then = then_block.iterator();
                        while (it_then.hasNext()) {
                            AbstractSsaNode asn_then = it_then.next();
                            if (asn_then.getNode_type() == NODE_GOTO) {
                                Label goto_label = ((GotoSsaNode) asn_then).goto_label;
                                if (goto_label == label && !if_has_ifelse.get(goto_label)) {
                                    if_add = true;
                                    from_block = then_block;
                                    to_block = block_dict_s.get(label);
                                    add_index = from_block.indexOf(asn_then);
                                    it_then.remove();
                                }
                            }
                        }
                        ArrayList<AbstractSsaNode> else_block = ((IfelseSsaNode) it_asn).else_block;
                        Iterator<AbstractSsaNode> it_else = else_block.iterator();
                        while (it_else.hasNext()) {
                            AbstractSsaNode asn_else = it_else.next();
                            if (asn_else.getNode_type() == NODE_GOTO) {
                                Label goto_label = ((GotoSsaNode) asn_else).goto_label;
                                if (goto_label == label && !if_has_ifelse.get(goto_label)) {
                                    if_add = true;
                                    from_block = else_block;
                                    to_block = block_dict_s.get(label);
                                    add_index = from_block.indexOf(asn_else);
                                    it_else.remove();
                                }
                            }
                        }
                    }
                }
                if (if_add) {
                    from_block.addAll(add_index, to_block);
                    block_dict_s.remove(label);
                    it_label.remove();
                    // update opst_cfg
                    for (Label label1 : label_list) {
                        if (opst_cfg.get(label1).contains(label)) {
                            opst_cfg.get(label1).add(opst_cfg.get(label).get(0));
                            opst_cfg.get(label1).remove(label);
                        }
                    }
                    opst_cfg.remove(label);
                }
            }
        }
    }
}