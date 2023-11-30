package com.myplugin.plsqlic3.backend.casegen.tkmutation;

import com.myplugin.plsqlic3.backend.casegen.tkmutation.util.enums.MUT_OPS;
import com.myplugin.plsqlic3.backend.casegen.tkmutation.util.infonode.MutationInfo;
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;
import com.myplugin.plsqlic3.backend.parsers.parseplpgsql.PostgreSQLParser;
import com.myplugin.plsqlic3.backend.parsers.parserutil.token.PlSqlToken;

import java.util.ArrayList;
import java.util.Random;

import static com.myplugin.plsqlic3.backend.casegen.tkmutation.util.CasegenConstData.*;
import static com.myplugin.plsqlic3.backend.casegen.tkmutation.util.enums.CTX_ATTR.*;
import static com.myplugin.plsqlic3.backend.casegen.tkmutation.util.enums.MUT_TYPE.*;
import static com.myplugin.plsqlic3.backend.parsers.parseplpgsql.PostgreSQLParser.*;
import static com.myplugin.plsqlic3.backend.randatagen.GenerateRandom.getRandom;

public class PlPgSqlMutationOperator {
    static Object getRandomItem(Object[] arr) {
        Random r = new Random();
        int num = r.nextInt(arr.length);
        return arr[num];
    }

//    public static void MutantExecuter(Object mut_op, MutationInfo info) {
//        call("casegen.mutate.PlPgSqlMutationOperator-" + mut_op,
//                new Class[]{MutationInfo.class},
//                new MutationInfo[]{info}
//        );
//    }

    public static void MutantExecuter(MUT_OPS mut_op, MutationInfo info) {
        try {
            switch (mut_op) {
                case GMO_ABS:
                    GMO_ABS(info);
                    break;
                case GMO_AOR:
                    GMO_AOR(info);
                    break;
                case GMO_CRP:
                    GMO_CRP(info);
                    break;
                case GMO_SCR:
                    GMO_SCR(info);
                    break;
                case GMO_GLR:
                    GMO_GLR(info);
                    break;
                case GMO_LCR:
                    GMO_LCR(info);
                    break;
                case GMO_ROR:
                    GMO_ROR(info);
                    break;
                case GMO_RSR:
                    GMO_RSR(info);
                    break;
                case GMO_PCC:
                    GMO_PCC(info);
                    break;
                case GMO_CSR:
                    GMO_CSR(info);
                    break;
                case GMO_SVR:
                    GMO_SVR(info);
                    break;
                case GMO_AAR:
                    GMO_AAR(info);
                    break;
                case GMO_CAR:
                    GMO_CAR(info);
                    break;
                case GMO_ACR:
                    GMO_ACR(info);
                    break;
                case GMO_ASR:
                    GMO_ASR(info);
                    break;
                case GMO_CNR:
                    GMO_CNR(info);
                    break;
                case GMO_SAR:
                    GMO_SAR(info);
                    break;
                case SMO_SEL:
                    SMO_SEL(info);
                    break;
                case SMO_JOI:
                    SMO_JOI(info);
                    break;
                case SMO_SUB:
                    SMO_SUB(info);
                    break;
                case SMO_AGR:
                    SMO_AGR(info);
                    break;
                case SMO_UNI:
                    SMO_UNI(info);
                    break;
                case SMO_ORD:
                    SMO_ORD(info);
                    break;
                case SMO_ROR:
                    SMO_ROR(info);
                    break;
                case SMO_LCR:
                    SMO_LCR(info);
                    break;
                case SMO_UOI:
                    SMO_UOI(info);
                    break;
                case SMO_ABS:
                    SMO_ABS(info);
                    break;
                case SMO_AOR:
                    SMO_AOR(info);
                    break;
                case SMO_BTW:
                    SMO_BTW(info);
                    break;
                case SMO_LIKE:
                    SMO_LIKE(info);
                    break;
                case SMO_NLF:
                    SMO_NLF(info);
                    break;
                case SMO_NLS:
                    SMO_NLS(info);
                    break;
                case SMO_NLI:
                    SMO_NLI(info);
                    break;
                case SMO_NLO:
                    SMO_NLO(info);
                    break;
                case SMO_IRC:
                    SMO_IRC(info);
                    break;
                case SMO_IRT:
                    SMO_IRT(info);
                    break;
                case SMO_IRP:
                    SMO_IRP(info);
                    break;
                case SMO_IRH:
                    SMO_IRH(info);
                    break;
                case PMO_RBC:
                    PMO_RBC(info);
                    break;
                case PMO_OFR:
                    PMO_OFR(info);
                    break;
                case PMO_CMR:
                    PMO_CMR(info);
                    break;
                case PMO_EXI:
                    PMO_EXI(info);
                    break;
                case PMO_QER:
                    PMO_QER(info);
                    break;
                case PMO_OSR:
                    PMO_OSR(info);
                    break;
            }
        } catch (Exception ignore) {
        }
    }

    // GMOs
    // Absolute Value Insertion
    private static void GMO_ABS(MutationInfo info) {
        ParseTree pt = info.getTree();
        TerminalNode tn_OPEN_PAREN = new TerminalNodeImpl(new CommonToken(OPEN_PAREN, "("));
        TerminalNode tn_ABS = new TerminalNodeImpl(new CommonToken(Identifier, "ABS"));
        TerminalNode tn_CLOSE_PAREN = new TerminalNodeImpl(new CommonToken(CLOSE_PAREN, ")"));
        if (pt instanceof ParserRuleContext) {
            ParserRuleContext ctx = (ParserRuleContext) pt;
            ctx.children.add(0, tn_OPEN_PAREN);
            ctx.children.add(0, tn_ABS);
            ctx.children.add(tn_CLOSE_PAREN);
        } else if (pt instanceof TerminalNode) {
            TerminalNode tn = (TerminalNode) pt;
            if (tn.getParent() instanceof ParserRuleContext) {
                ParserRuleContext ctx = (ParserRuleContext) tn.getParent();
                ctx.children.add(ctx.children.indexOf(tn), tn_ABS);
                ctx.children.add(ctx.children.indexOf(tn), tn_OPEN_PAREN);
                ctx.children.add(ctx.children.indexOf(tn) + 1, tn_CLOSE_PAREN);
            }
        }
    }

    private static void GMO_AOR(MutationInfo info) {
        ParseTree pt = info.getTree();
        ParseTree op_to_add = (ParseTree) getRandomItem(new TerminalNodeImpl[]{
                new TerminalNodeImpl(new PlSqlToken(PLUS, "+")),
                new TerminalNodeImpl(new PlSqlToken(MINUS, "-")),
                new TerminalNodeImpl(new PlSqlToken(STAR, "*")),
                new TerminalNodeImpl(new PlSqlToken(SLASH, "/")),
                new TerminalNodeImpl(new PlSqlToken(SLASH, "%")),
                new TerminalNodeImpl(new PlSqlToken(SLASH, "^"))
        });
        if (pt instanceof ParserRuleContext) {
            PostgreSQLParser.MathopContext ctx = (PostgreSQLParser.MathopContext) pt;
            if (ctx.PLUS() != null || ctx.MINUS() != null || ctx.STAR() != null || ctx.SLASH() != null) {
                ctx.children.clear();
                ctx.children.add(op_to_add);
            }
        } else if (pt instanceof TerminalNode) {
            TerminalNode tn = (TerminalNode) pt;
            if (tn.getParent() instanceof ParserRuleContext) {
                ParserRuleContext ctx = (ParserRuleContext) tn.getParent();
                ctx.children.add(ctx.children.indexOf(tn), op_to_add);
                ctx.children.remove(tn);
            }
        }
    }

    private static void GMO_CRP(MutationInfo info) {
        ParseTree pt = info.getTree();
        if (pt instanceof TerminalNode) {
            TerminalNode tn = (TerminalNode) pt;
            if (tn.getParent() instanceof ParserRuleContext) {
                ParserRuleContext ctx = (ParserRuleContext) tn.getParent();
                ctx.children.add(ctx.children.indexOf(tn), new TerminalNodeImpl(new PlSqlToken(StringConstant, getRandom("char"))));
                ctx.children.remove(tn);
            }
        }
    }

    private static void GMO_SCR(MutationInfo info) {
        ParseTree pt = info.getTree();
        if (pt instanceof TerminalNode) {
            TerminalNode tn = (TerminalNode) pt;
            if (tn.getParent() instanceof ParserRuleContext) {
                ParserRuleContext ctx = (ParserRuleContext) tn.getParent();
                if (info.ctx_attr_map.get(CTX_ATTR_CONSTSCAL)) {
                    Random random = new Random();
                    int index = random.nextInt(NUM_TYPE_SET.size());
                    String random_key = (String) NUM_TYPE_SET.keySet().toArray()[index];
                    ctx.children.add(ctx.children.indexOf(tn),
                            new TerminalNodeImpl(new CommonToken(NUM_TYPE_SET.get(random_key), getRandom(random_key))));
                    ctx.children.remove(tn);
                } else if (info.ctx_attr_map.get(CTX_ATTR_CONSTSTR)) {
                    Random random = new Random();
                    int index = random.nextInt(STR_TYPE_SET.size());
                    String random_key = (String) STR_TYPE_SET.keySet().toArray()[index];
                    ctx.children.add(ctx.children.indexOf(tn),
                            new TerminalNodeImpl(new CommonToken(STR_TYPE_SET.get(random_key), getRandom(random_key))));
                    ctx.children.remove(tn);
                }
                // can not parse other const
            }
        }
    }

    private static void GMO_GLR(MutationInfo info) {
        ParseTree pt = info.getTree();
    }

    private static void GMO_LCR(MutationInfo info) {
        ParseTree pt = info.getTree();
        ParseTree op_to_add = (ParseTree) getRandomItem(new TerminalNodeImpl[]{
                new TerminalNodeImpl(new PlSqlToken(AND, "AND")),
                new TerminalNodeImpl(new PlSqlToken(OR, "OR"))
        });
        if (pt instanceof TerminalNode) {
            TerminalNode tn = (TerminalNode) pt;
            if (tn.getParent() instanceof ParserRuleContext) {
                ParserRuleContext ctx = (ParserRuleContext) tn.getParent();
                ctx.children.add(ctx.children.indexOf(tn), op_to_add);
                ctx.children.remove(tn);
            }
        }
    }

    private static void GMO_ROR(MutationInfo info) {
        ParseTree pt = info.getTree();
        ParseTree op_to_add = (ParseTree) getRandomItem(new TerminalNodeImpl[]{
                new TerminalNodeImpl(new PlSqlToken(LT, "<")),
                new TerminalNodeImpl(new PlSqlToken(GT, ">")),
                new TerminalNodeImpl(new PlSqlToken(EQUAL, "=")),
                new TerminalNodeImpl(new PlSqlToken(LESS_EQUALS, "<=")),
                new TerminalNodeImpl(new PlSqlToken(GREATER_EQUALS, ">=")),
                new TerminalNodeImpl(new PlSqlToken(NOT_EQUALS, "<>"))
        });
        if (pt instanceof TerminalNode) {
            TerminalNode tn = (TerminalNode) pt;
            if (tn.getParent() instanceof ParserRuleContext) {
                ParserRuleContext ctx = (ParserRuleContext) tn.getParent();
                ctx.children.add(ctx.children.indexOf(tn), op_to_add);
                ctx.children.remove(tn);
            }
        }
    }

    private static void GMO_RSR(MutationInfo info) {
        ParseTree pt = info.getTree();
    }

    private static void GMO_PCC(MutationInfo info) {
        ParseTree pt = info.getTree();
        if (NUM_TYPE_SET.containsKey(pt.getText())) {
            ((ParserRuleContext) pt).children.clear();
            Random random = new Random();
            int index = random.nextInt(NUM_TYPE_NAME_TNODE.size());
            ((ParserRuleContext) pt).addChild(NUM_TYPE_NAME_TNODE.get(index));
        } else if (STR_TYPE_SET.containsKey(pt.getText())) {
            ((ParserRuleContext) pt).children.clear();
            Random random = new Random();
            int index = random.nextInt(STR_TYPE_NAME_TNODE.size());
            ((ParserRuleContext) pt).addChild(STR_TYPE_NAME_TNODE.get(index));
        }
    }

    private static void GMO_CSR(MutationInfo info) {
        ParseTree pt = info.getTree().getParent();
        if (info.idInfo != null) {
            if (info.idInfo.mut_type == MUT_TYPE_NUM) {
                ((ParserRuleContext) pt).children.clear();
                Random random = new Random();
                int index = random.nextInt(NUM_TYPE_SET.size());
                String random_key = (String) NUM_TYPE_SET.keySet().toArray()[index];
                ((ParserRuleContext) pt).addChild(new TerminalNodeImpl(new CommonToken(NUM_TYPE_SET.get(random_key), getRandom(random_key))));
            } else if (info.idInfo.mut_type == MUT_TYPE_STR) {
                ((ParserRuleContext) pt).children.clear();
                Random random = new Random();
                int index = random.nextInt(STR_TYPE_SET.size());
                String random_key = (String) STR_TYPE_SET.keySet().toArray()[index];
                ((ParserRuleContext) pt).addChild(new TerminalNodeImpl(new CommonToken(STR_TYPE_SET.get(random_key), getRandom(random_key))));
            } else {
                ((ParserRuleContext) pt).children.clear();
                ((ParserRuleContext) pt).addChild(new TerminalNodeImpl(new CommonToken(StringConstant, getRandom(info.idInfo.type_name))));
            }
        }
    }

    private static void GMO_SVR(MutationInfo info) {
        ParseTree pt = info.getTree();
    }

    private static void GMO_AAR(MutationInfo info) {
        ParseTree pt = info.getTree();
        Random random = new Random();
        if (random.nextBoolean()) {
            ((ParserRuleContext) pt.getParent()).children.add(
                    ((ParserRuleContext) pt.getParent()).children.indexOf(pt),
                    new TerminalNodeImpl(new CommonToken(PLUS, "+")));
        } else {
            ((ParserRuleContext) pt.getParent()).children.add(
                    ((ParserRuleContext) pt.getParent()).children.indexOf(pt),
                    new TerminalNodeImpl(new CommonToken(MINUS, "-")));
        }
        ((ParserRuleContext) pt.getParent()).children.add(
                ((ParserRuleContext) pt.getParent()).children.indexOf(pt),
                new TerminalNodeImpl(new CommonToken(Integral, "1")));
    }

    private static void GMO_CAR(MutationInfo info) {
        ParseTree pt = info.getTree();
//        String var_type = null;
        if (info.idInfo.mut_type == MUT_TYPE_NUM) {
            Random random = new Random();
            int index = random.nextInt(NUM_TYPE_SET.size());
            String random_key = (String) NUM_TYPE_SET.keySet().toArray()[index];
            ((ParserRuleContext) pt.getParent()).children.add(((ParserRuleContext) pt.getParent()).children.indexOf(pt),
                    new TerminalNodeImpl(new CommonToken(NUM_TYPE_SET.get(random_key), getRandom(random_key))));
            ((ParserRuleContext) pt.getParent()).children.remove(pt);
        } else if (info.idInfo.mut_type == MUT_TYPE_STR) {
            Random random = new Random();
            int index = random.nextInt(STR_TYPE_SET.size());
            String random_key = (String) STR_TYPE_SET.keySet().toArray()[index];
            ((ParserRuleContext) pt.getParent()).children.add(((ParserRuleContext) pt.getParent()).children.indexOf(pt),
                    new TerminalNodeImpl(new CommonToken(STR_TYPE_SET.get(random_key), getRandom(random_key))));
            ((ParserRuleContext) pt.getParent()).children.remove(pt);
        } else {
            ((ParserRuleContext) pt.getParent()).children.add(((ParserRuleContext) pt.getParent()).children.indexOf(pt),
                    new TerminalNodeImpl(new CommonToken(StringConstant, getRandom(info.idInfo.type_name))));
            ((ParserRuleContext) pt.getParent()).children.remove(pt);
        }
    }

    private static void GMO_ACR(MutationInfo info) {
        ParseTree pt = info.getTree();
        ArrayList<MutationInfo> candidate_infos = new ArrayList<>();
        if (info.ctx_attr_map.get(CTX_ATTR_CONSTSCAL)) {
            for (MutationInfo mut_info : info.mut_list) {
                if (mut_info.ctx_attr_map.get(CTX_ATTR_ARRVAR) && mut_info.idInfo.mut_type == MUT_TYPE_NUM) {
                    candidate_infos.add(mut_info);
                }
            }
        } else if (info.ctx_attr_map.get(CTX_ATTR_CONSTSTR)) {
            for (MutationInfo mut_info : info.mut_list) {
                if (mut_info.ctx_attr_map.get(CTX_ATTR_ARRVAR) && mut_info.idInfo.mut_type == MUT_TYPE_STR) {
                    candidate_infos.add(mut_info);
                }
            }
        }
        // can not parse other const
        Random random = new Random();
        if (candidate_infos.size() > 0) {
            int index = random.nextInt(candidate_infos.size());
            ((ParserRuleContext) pt.getParent()).children.add(
                    ((ParserRuleContext) pt.getParent()).children.indexOf(pt),
                    new TerminalNodeImpl(new CommonToken(Identifier, candidate_infos.get(index).getTree().getText())));
            ((ParserRuleContext) pt.getParent()).children.remove(pt);
        }
    }

    private static void GMO_ASR(MutationInfo info) {
        ParseTree pt = info.getTree();
        ArrayList<MutationInfo> candidate_infos = new ArrayList<>();
        if (info.idInfo != null && info.idInfo.mut_type == MUT_TYPE_NUM) {
            for (MutationInfo mut_info : info.mut_list) {
                if (mut_info.ctx_attr_map.get(CTX_ATTR_ARRVAR) && mut_info.idInfo.mut_type == MUT_TYPE_NUM) {
                    candidate_infos.add(mut_info);
                }
            }
        } else if (info.idInfo != null && info.idInfo.mut_type == MUT_TYPE_STR) {
            for (MutationInfo mut_info : info.mut_list) {
                if (mut_info.ctx_attr_map.get(CTX_ATTR_ARRVAR) && mut_info.idInfo.mut_type == MUT_TYPE_STR) {
                    candidate_infos.add(mut_info);
                }
            }
        } else if (info.idInfo != null && info.idInfo.mut_type == MUT_TYPE_OTHER) {
            for (MutationInfo mut_info : info.mut_list) {
                if (mut_info.ctx_attr_map.get(CTX_ATTR_ARRVAR) && mut_info.idInfo.type_name.equals(info.idInfo.type_name)) {
                    candidate_infos.add(mut_info);
                }
            }
        }
        Random random = new Random();
        if (candidate_infos.size() > 0) {
            int index = random.nextInt(candidate_infos.size());
            ((ParserRuleContext) pt.getParent()).children.add(
                    ((ParserRuleContext) pt.getParent()).children.indexOf(pt),
                    new TerminalNodeImpl(new CommonToken(Identifier, candidate_infos.get(index).getTree().getText())));
            ((ParserRuleContext) pt.getParent()).children.remove(pt);
        }
    }

    private static void GMO_CNR(MutationInfo info) {
        ParseTree pt = info.getTree();
        ArrayList<String> candidate_arrvars = new ArrayList<>();
        if (info.idInfo != null && info.idInfo.mut_type == MUT_TYPE_NUM) {
            for (String arrvar : info.mut_list.var_type_map.keySet()) {
                if (info.mut_list.var_type_map.get(arrvar).is_array
                        && info.mut_list.var_type_map.get(arrvar).mut_type == MUT_TYPE_NUM) {
                    candidate_arrvars.add(arrvar);
                }
            }
        } else if (info.idInfo != null && info.idInfo.mut_type == MUT_TYPE_STR) {
            for (String arrvar : info.mut_list.var_type_map.keySet()) {
                if (info.mut_list.var_type_map.get(arrvar).is_array
                        && info.mut_list.var_type_map.get(arrvar).mut_type == MUT_TYPE_STR) {
                    candidate_arrvars.add(arrvar);
                }
            }
        } else if (info.idInfo != null && info.idInfo.mut_type == MUT_TYPE_OTHER) {
            for (String arrvar : info.mut_list.var_type_map.keySet()) {
                if (info.mut_list.var_type_map.get(arrvar).is_array
                        && info.mut_list.var_type_map.get(arrvar).type_name.equals(info.idInfo.type_name)) {
                    candidate_arrvars.add(arrvar);
                }
            }
        }
        Random random = new Random();
        if (candidate_arrvars.size() > 0) {
            int index = random.nextInt(candidate_arrvars.size());
            ((ParserRuleContext) pt.getParent()).children.add(
                    ((ParserRuleContext) pt.getParent()).children.indexOf(pt),
                    new TerminalNodeImpl(new CommonToken(Identifier, candidate_arrvars.get(index))));
            ((ParserRuleContext) pt.getParent()).children.remove(pt);
        }
    }

    private static void GMO_SAR(MutationInfo info) {
        ParseTree pt = info.getTree();
        ArrayList<String> candidate_vars = new ArrayList<>();
        for (String var_name : info.mut_list.var_type_map.keySet()) {
            if (!info.mut_list.var_type_map.get(var_name).is_array && info.idInfo != null) {
                if (info.idInfo.mut_type != MUT_TYPE_OTHER && info.idInfo.mut_type == info.mut_list.var_type_map.get(var_name).mut_type
                        || info.idInfo.mut_type == MUT_TYPE_OTHER && info.idInfo.type_name.equals(info.mut_list.var_type_map.get(var_name).type_name)) {
                    candidate_vars.add(var_name);
                }
            }
        }
        if (candidate_vars.size() > 0) {
            Random random = new Random();
            int index = random.nextInt(candidate_vars.size());
            ((ParserRuleContext) pt.getParent()).children.add(
                    ((ParserRuleContext) pt.getParent()).children.indexOf(pt),
                    new TerminalNodeImpl(new CommonToken(Identifier, candidate_vars.get(index))));
            ((ParserRuleContext) pt.getParent()).children.remove(pt);
        }
    }

    //SMOs
    private static void SMO_SEL(MutationInfo info) {
        ParseTree pt = info.getTree();
    }

    private static void SMO_JOI(MutationInfo info) {
        ParseTree pt = info.getTree();
    }

    private static void SMO_SUB(MutationInfo info) {
        ParseTree pt = info.getTree();
    }

    private static void SMO_AGR(MutationInfo info) {
        ParseTree pt = info.getTree();
    }

    private static void SMO_UNI(MutationInfo info) {
        ParseTree pt = info.getTree();
    }

    private static void SMO_ORD(MutationInfo info) {
        ParseTree pt = info.getTree();
    }

    private static void SMO_ROR(MutationInfo info) {
        ParseTree pt = info.getTree();
    }

    private static void SMO_LCR(MutationInfo info) {
        ParseTree pt = info.getTree();
    }

    private static void SMO_UOI(MutationInfo info) {
        ParseTree pt = info.getTree();
    }

    private static void SMO_ABS(MutationInfo info) {
        ParseTree pt = info.getTree();
    }

    private static void SMO_AOR(MutationInfo info) {
        ParseTree pt = info.getTree();
    }

    private static void SMO_BTW(MutationInfo info) {
        ParseTree pt = info.getTree();
    }

    private static void SMO_LIKE(MutationInfo info) {
        ParseTree pt = info.getTree();
    }

    private static void SMO_NLF(MutationInfo info) {
        ParseTree pt = info.getTree();
    }

    private static void SMO_NLS(MutationInfo info) {
        ParseTree pt = info.getTree();
    }

    private static void SMO_NLI(MutationInfo info) {
        ParseTree pt = info.getTree();
    }

    private static void SMO_NLO(MutationInfo info) {
        ParseTree pt = info.getTree();
    }

    private static void SMO_IRC(MutationInfo info) {
        ParseTree pt = info.getTree();
    }

    private static void SMO_IRT(MutationInfo info) {
        ParseTree pt = info.getTree();
    }

    private static void SMO_IRP(MutationInfo info) {
        ParseTree pt = info.getTree();
    }

    private static void SMO_IRH(MutationInfo info) {
        ParseTree pt = info.getTree();
    }

    // PMOs
    private static void PMO_RBC(MutationInfo info) {
        ParseTree pt = info.getTree();
    }

    private static void PMO_OFR(MutationInfo info) {
        ParseTree pt = info.getTree();
    }

    private static void PMO_CMR(MutationInfo info) {
        ParseTree pt = info.getTree();
    }

    private static void PMO_EXI(MutationInfo info) {
        ParseTree pt = info.getTree();
    }

    private static void PMO_QER(MutationInfo info) {
        ParseTree pt = info.getTree();
    }

    private static void PMO_OSR(MutationInfo info) {
        ParseTree pt = info.getTree();
    }
}
