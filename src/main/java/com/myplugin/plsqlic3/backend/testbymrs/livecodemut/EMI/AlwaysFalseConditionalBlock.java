package com.myplugin.plsqlic3.backend.testbymrs.livecodemut.EMI;

import com.myplugin.plsqlic3.backend.testbymrs.livecodemut.ExecProfile;

import java.util.Objects;
import java.util.stream.Collectors;

import static com.myplugin.plsqlic3.backend.randatagen.GenerateRandom.getRandom;
import static com.myplugin.plsqlic3.backend.testbymrs.livecodemut.EMI.util.SynthesizePredicate.synPred;

public class AlwaysFalseConditionalBlock {
    public static String getFCB(ExecProfile env) {
        return String.format(" IF %s THEN %s END IF; ",
                synPred(env, false, 10),
                env.profile.keySet().stream()
                        .map(i -> i + "=" + getRandom(Objects.requireNonNull(env.profile.get(i)).getKey()) + "; ")
                        .collect(Collectors.joining()));
    }
}
