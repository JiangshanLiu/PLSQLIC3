package com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa.struct;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;
import com.myplugin.plsqlic3.backend.testbymrs.pl2sql.util.SqlIdMap;

import java.util.ArrayList;
import java.util.HashMap;

public class FunctionInfo {
    public String full_function_name = "";
    public String function_name = "";
    public ArrayList<TerminalNode> function_args = new ArrayList<>();
    public SqlIdMap<String, ParserRuleContext> id_type_pair = new SqlIdMap<>();
    public ParserRuleContext return_type = null;
    public HashMap<Label, ArrayList<GotoFromInfo>> source_blocks_map = null;
    public ArrayList<String> preprocess_sql = new ArrayList<>();
}
