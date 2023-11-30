package com.myplugin.plsqlic3.backend.testbymrs.livecodemut.EMI;

import com.myplugin.plsqlic3.backend.testbymrs.livecodemut.ExecProfile;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

import static com.myplugin.plsqlic3.backend.parsers.parserutil.parserutil.GeneralParserUtil.getFullTextByChildren;
import static com.myplugin.plsqlic3.backend.testbymrs.livecodemut.EMI.util.SynthesizePredicate.synPred;
import static com.myplugin.plsqlic3.backend.testbymrs.livecodemut.EMI.util.SynthesizeValidExpr.synExpr;

public class AlwaysTrueConditionalBlock {
    public static String getTCB(ExecProfile env) {
        ArrayList<String> vars = new ArrayList<>(env.profile.keySet());
        if (vars.size() > 0) {
            String selected_var = vars.get(new Random().nextInt(vars.size()));
            return String.format(" DECLARE backup_v_TCB %s = %s; BEGIN %s END; ",
                    getFullTextByChildren(Objects.requireNonNull(env.profile.get(selected_var)).getKey()),
                    synExpr(env, Objects.requireNonNull(env.profile.get(selected_var)).getKey()),
                    String.format(" IF %s THEN backup_v_TCB = %s; %s END IF; %s = backup_v_TCB; ",
                            synPred(env, true, 10),
                            selected_var,
                            new Random().nextBoolean() ?
                                    String.format(" IF %s THEN %s END IF; ",
                                            synPred(env, false, 10),
                                            String.format(" RAISE NOTICE '%%', %s; ", selected_var)
                                    ) :
                                    String.format(" WHILE %s LOOP %s END LOOP; ",
                                            synPred(env, false, 10),
                                            String.format(" RAISE NOTICE '%%', %s; ", selected_var)
                                    ),
                            selected_var
                    ));
        } else {
            return "";
        }
    }
}
