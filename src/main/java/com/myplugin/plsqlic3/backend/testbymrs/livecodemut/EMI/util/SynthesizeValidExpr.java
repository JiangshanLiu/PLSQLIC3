package com.myplugin.plsqlic3.backend.testbymrs.livecodemut.EMI.util;

import com.myplugin.plsqlic3.backend.parsers.parseplpgsql.PostgreSQLParser;
import com.myplugin.plsqlic3.backend.testbymrs.livecodemut.ExecProfile;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Random;

import static com.myplugin.plsqlic3.backend.parsers.parserutil.parserutil.GeneralParserUtil.getFullTextByChildren;
import static com.myplugin.plsqlic3.backend.testbymrs.livecodemut.ExecProfile.*;

public class SynthesizeValidExpr {
    public static ExprWithType synExpr(ExecProfile env, PostgreSQLParser.TypenameContext type) {
        ArrayList<String> worklist = new ArrayList<>();
        for (String var : env.profile.keySet()) {
            if (getFullTextByChildren(type).equals(getFullTextByChildren(Objects.requireNonNull(env.profile.get(var)).getKey()))) {
                worklist.add(var);
            }
        }
        Collections.shuffle(worklist);
        worklist = new ArrayList<>(worklist.subList(0, Math.min(1, new Random().nextInt(worklist.size()))));
        if (basic_numeric.contains(getFullTextByChildren(type))) {
            Random random = new Random();
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < worklist.size(); i++) {
                sb.append(worklist.get(i));
                if (i != worklist.size() - 1) {
                    int operatorIndex = random.nextInt(2);
                    switch (operatorIndex) {
                        case 0:
                            sb.append(" + ");
                            break;
                        case 1:
                            sb.append(" - ");
                            break;
                    }
                }
            }
            return new ExprWithType(type, sb.toString());
        }
        if (basic_character.contains(getFullTextByChildren(type))) {
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < worklist.size(); i++) {
                sb.append(worklist.get(i));
                if (i != worklist.size() - 1) {
                    sb.append(" || ");
                }
            }
            return new ExprWithType(type, sb.toString());
        }
        if (basic_boolean.contains(getFullTextByChildren(type))) {
            Random random = new Random();
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < worklist.size(); i++) {
                sb.append(worklist.get(i));
                if (i != worklist.size() - 1) {
                    int operatorIndex = random.nextInt(2);
                    switch (operatorIndex) {
                        case 0:
                            sb.append(" and ");
                            break;
                        case 1:
                            sb.append(" or ");
                            break;
                    }
                }
            }
            return new ExprWithType(type, sb.toString());
        }
        return null;
    }
}
