package com.myplugin.plsqlic3.backend.casegen.tkmutation.util;

import com.myplugin.plsqlic3.backend.casegen.tkmutation.util.enums.CTX_ATTR;
import com.myplugin.plsqlic3.backend.casegen.tkmutation.util.enums.MUT_OPS;
import com.myplugin.plsqlic3.backend.casegen.tkmutation.util.enums.MUT_TYPE;
import com.myplugin.plsqlic3.backend.casegen.tkmutation.util.infonode.DeclareIdInfo;
import com.myplugin.plsqlic3.backend.casegen.tkmutation.util.infonode.MutationInfo;
import com.myplugin.plsqlic3.backend.testbymrs.pl2sql.util.SqlIdMap;

import java.util.ArrayList;
import java.util.Collections;

public class MutationList extends ArrayList<MutationInfo> {
    public SqlIdMap<String, DeclareIdInfo> var_type_map = new SqlIdMap<>();

    static class ItemMayNullException extends RuntimeException {
    }

    @Override
    public boolean add(MutationInfo info) {
        throw new ItemMayNullException();
    }

    public void addParseTree(MutationInfo info) {
        if (info.tree != null) {
            super.add(info);
        }
        info.mut_list = this;
    }

    public ArrayList<MutationInfo> getShuffledSample(MUT_OPS op, double probability) {
        ArrayList<MutationInfo> list_ret = new ArrayList<>();
        if (this.size() == 0) {
            return list_ret;
        }
        // without filter
//            ArrayList<ParseTree> list_ret = new ArrayList<>(this.keySet());
//            Collections.shuffle(list_ret);
//            list_ret = new ArrayList<>(list_ret.subList(0, (int) Math.round(probability * list_ret.size())));
//            return list_ret;
        // with filter
        switch (op) {
            case GMO_ABS:
                for (MutationInfo info : this) {
                    if (info.ctx_attr_map.get(CTX_ATTR.CTX_ATTR_PL)
                            && info.ctx_attr_map.get(CTX_ATTR.CTX_ATTR_MUTABLE)
                            && info.ctx_attr_map.get(CTX_ATTR.CTX_ATTR_IDENTIFIER)
                            && info.idInfo != null
                            && info.idInfo.mut_type == MUT_TYPE.MUT_TYPE_NUM
                            && !info.idInfo.is_array
                    ) {
                        list_ret.add(info);
                    }
                }
                Collections.shuffle(list_ret);
                list_ret = new ArrayList<>(list_ret.subList(0, (int) Math.round(probability * list_ret.size())));
                return list_ret;
            case GMO_AOR:
                for (MutationInfo info : this) {
                    if (info.ctx_attr_map.get(CTX_ATTR.CTX_ATTR_PL)
                            && info.ctx_attr_map.get(CTX_ATTR.CTX_ATTR_MUTABLE)
                            && info.ctx_attr_map.get(CTX_ATTR.CTX_ATTR_MATHOP)
                    ) {
                        list_ret.add(info);
                    }
                }
                Collections.shuffle(list_ret);
                list_ret = new ArrayList<>(list_ret.subList(0, (int) Math.round(probability * list_ret.size())));
                return list_ret;
            case GMO_CRP:
                for (MutationInfo info : this) {
                    if (info.ctx_attr_map.get(CTX_ATTR.CTX_ATTR_PL)
                            && info.ctx_attr_map.get(CTX_ATTR.CTX_ATTR_MUTABLE)
                            && info.ctx_attr_map.get(CTX_ATTR.CTX_ATTR_CONSTSTR)
                    ) {
                        list_ret.add(info);
                    }
                }
                Collections.shuffle(list_ret);
                list_ret = new ArrayList<>(list_ret.subList(0, (int) Math.round(probability * list_ret.size())));
                return list_ret;
            case GMO_SCR:
                for (MutationInfo info : this) {
                    if (info.ctx_attr_map.get(CTX_ATTR.CTX_ATTR_PL)
                            && info.ctx_attr_map.get(CTX_ATTR.CTX_ATTR_MUTABLE)
                            && (info.ctx_attr_map.get(CTX_ATTR.CTX_ATTR_CONSTSTR) || info.ctx_attr_map.get(CTX_ATTR.CTX_ATTR_CONSTSCAL))
                    ) {
                        list_ret.add(info);
                    }
                }
                Collections.shuffle(list_ret);
                list_ret = new ArrayList<>(list_ret.subList(0, (int) Math.round(probability * list_ret.size())));
                return list_ret;
            case GMO_GLR:
                return list_ret;
            case GMO_LCR:
                for (MutationInfo info : this) {
                    if (info.ctx_attr_map.get(CTX_ATTR.CTX_ATTR_PL)
                            && info.ctx_attr_map.get(CTX_ATTR.CTX_ATTR_MUTABLE)
                            && info.ctx_attr_map.get(CTX_ATTR.CTX_ATTR_LOGICALOP)
                    ) {
                        list_ret.add(info);
                    }
                }
                Collections.shuffle(list_ret);
                list_ret = new ArrayList<>(list_ret.subList(0, (int) Math.round(probability * list_ret.size())));
                return list_ret;
            case GMO_ROR:
                for (MutationInfo info : this) {
                    if (info.ctx_attr_map.get(CTX_ATTR.CTX_ATTR_PL)
                            && info.ctx_attr_map.get(CTX_ATTR.CTX_ATTR_MUTABLE)
                            && info.ctx_attr_map.get(CTX_ATTR.CTX_ATTR_RELATIONOP)
                    ) {
                        list_ret.add(info);
                    }
                }
                Collections.shuffle(list_ret);
                list_ret = new ArrayList<>(list_ret.subList(0, (int) Math.round(probability * list_ret.size())));
                return list_ret;
            case GMO_RSR:
                return list_ret;
            case GMO_PCC:
                for (MutationInfo info : this) {
                    if (info.ctx_attr_map.get(CTX_ATTR.CTX_ATTR_PL)
                            && info.ctx_attr_map.get(CTX_ATTR.CTX_ATTR_MUTABLE)
                            && info.ctx_attr_map.get(CTX_ATTR.CTX_ATTR_TYPENAME)
                    ) {
                        list_ret.add(info);
                    }
                }
                Collections.shuffle(list_ret);
                list_ret = new ArrayList<>(list_ret.subList(0, (int) Math.round(probability * list_ret.size())));
                return list_ret;
            case GMO_CSR:
                for (MutationInfo info : this) {
                    if (info.ctx_attr_map.get(CTX_ATTR.CTX_ATTR_PL)
                            && info.ctx_attr_map.get(CTX_ATTR.CTX_ATTR_MUTABLE)
                            && info.ctx_attr_map.get(CTX_ATTR.CTX_ATTR_IDENTIFIER)
                            && info.idInfo != null
                            && !info.idInfo.is_array
                    ) {
                        list_ret.add(info);
                    }
                }
                Collections.shuffle(list_ret);
                list_ret = new ArrayList<>(list_ret.subList(0, (int) Math.round(probability * list_ret.size())));
                return list_ret;
            case GMO_SVR:
                return list_ret;
            case GMO_AAR:
                for (MutationInfo info : this) {
                    if (info.ctx_attr_map.get(CTX_ATTR.CTX_ATTR_PL)
                            && info.ctx_attr_map.get(CTX_ATTR.CTX_ATTR_ARRCLOSEBRACKET)
                    ) {
                        list_ret.add(info);
                    }
                }
                Collections.shuffle(list_ret);
                list_ret = new ArrayList<>(list_ret.subList(0, (int) Math.round(probability * list_ret.size())));
                return list_ret;
            case GMO_CAR:
                for (MutationInfo info : this) {
                    if (info.ctx_attr_map.get(CTX_ATTR.CTX_ATTR_PL)
                            && info.ctx_attr_map.get(CTX_ATTR.CTX_ATTR_MUTABLE)
                            && info.idInfo != null
                            && info.idInfo.is_array
                            && info.ctx_attr_map.get(CTX_ATTR.CTX_ATTR_ARRVAR)
                    ) {
                        list_ret.add(info);
                    }
                }
                Collections.shuffle(list_ret);
                list_ret = new ArrayList<>(list_ret.subList(0, (int) Math.round(probability * list_ret.size())));
                return list_ret;
            case GMO_ACR:
                for (MutationInfo info : this) {
                    if (info.ctx_attr_map.get(CTX_ATTR.CTX_ATTR_PL)
                            && info.ctx_attr_map.get(CTX_ATTR.CTX_ATTR_MUTABLE)
                            && (info.ctx_attr_map.get(CTX_ATTR.CTX_ATTR_CONSTSTR) || info.ctx_attr_map.get(CTX_ATTR.CTX_ATTR_CONSTSCAL))
                    ) {
                        list_ret.add(info);
                    }
                }
                Collections.shuffle(list_ret);
                list_ret = new ArrayList<>(list_ret.subList(0, (int) Math.round(probability * list_ret.size())));
                return list_ret;
            case GMO_ASR:
                for (MutationInfo info : this) {
                    if (info.ctx_attr_map.get(CTX_ATTR.CTX_ATTR_PL)
                            && info.ctx_attr_map.get(CTX_ATTR.CTX_ATTR_IDENTIFIER)
                            && info.idInfo != null
                            && !info.idInfo.is_array
                    ) {
                        list_ret.add(info);
                    }
                }
                Collections.shuffle(list_ret);
                list_ret = new ArrayList<>(list_ret.subList(0, (int) Math.round(probability * list_ret.size())));
                return list_ret;
            case GMO_CNR:
                for (MutationInfo info : this) {
                    if (info.ctx_attr_map.get(CTX_ATTR.CTX_ATTR_PL)
                            && info.ctx_attr_map.get(CTX_ATTR.CTX_ATTR_IDENTIFIER)
                            && info.idInfo != null
                            && info.idInfo.is_array
                    ) {
                        list_ret.add(info);
                    }
                }
                Collections.shuffle(list_ret);
                list_ret = new ArrayList<>(list_ret.subList(0, (int) Math.round(probability * list_ret.size())));
                return list_ret;
            case GMO_SAR:
                for (MutationInfo info : this) {
                    if (info.ctx_attr_map.get(CTX_ATTR.CTX_ATTR_PL)
                            && info.idInfo != null
                            && info.idInfo.is_array
                            && info.ctx_attr_map.get(CTX_ATTR.CTX_ATTR_ARRVAR)
                    ) {
                        list_ret.add(info);
                    }
                }
                Collections.shuffle(list_ret);
                list_ret = new ArrayList<>(list_ret.subList(0, (int) Math.round(probability * list_ret.size())));
                return list_ret;
            case SMO_SEL:
            case SMO_JOI:
            case SMO_SUB:
            case SMO_AGR:
            case SMO_UNI:
            case SMO_ORD:
            case SMO_ROR:
            case SMO_LCR:
            case SMO_UOI:
            case SMO_ABS:
            case SMO_AOR:
            case SMO_BTW:
            case SMO_LIKE:
            case SMO_NLF:
            case SMO_NLS:
            case SMO_NLI:
            case SMO_NLO:
            case SMO_IRC:
            case SMO_IRT:
            case SMO_IRP:
            case SMO_IRH:
            case PMO_RBC:
            case PMO_OFR:
            case PMO_CMR:
            case PMO_EXI:
            case PMO_QER:
            case PMO_OSR:
            default:
                return list_ret;
        }
    }
}
