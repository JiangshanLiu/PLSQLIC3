package com.myplugin.plsqlic3.backend.testbymrs.livecodemut.EMI;

import com.myplugin.plsqlic3.backend.testbymrs.livecodemut.ExecProfile;

import static com.myplugin.plsqlic3.backend.testbymrs.livecodemut.EMI.util.SynthesizePredicate.synPred;

public class AlwaysTrueGuard {
    public static String getTG(ExecProfile env) {
        return String.format(" IF %s THEN ",
                synPred(env, true, 10));
    }
}
