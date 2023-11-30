package com.myplugin.plsqlic3.backend.testbymrs.livecodemut.EMI.util;

import com.myplugin.plsqlic3.backend.testbymrs.livecodemut.ExecProfile;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Random;
import java.util.stream.IntStream;

import static com.myplugin.plsqlic3.backend.parsers.parserutil.parserutil.GeneralParserUtil.getFullTextByChildren;
import static com.myplugin.plsqlic3.backend.testbymrs.livecodemut.ExecProfile.basic_boolean;
import static com.myplugin.plsqlic3.backend.testbymrs.livecodemut.ExecProfile.basic_numeric;

public class SynthesizePredicate {
    public static ExprWithBoolean synPred(ExecProfile env, boolean expected, int depth) {
        if (depth == 0) {
            return synAtom(env, expected);
        }
        int flag = new Random().nextInt(4);
        switch (flag) {
            case 0:
                return synNeg(env, expected, depth);
            case 1:
                return synCon(env, expected, depth);
            case 2:
                return synDis(env, expected, depth);
            case 3:
                return synAtom(env, expected);
        }
        return null;
    }

    private static ExprWithBoolean synNeg(ExecProfile env, boolean expected, int depth) {
        ExprWithBoolean expr = synPred(env, !expected, depth - 1);
        assert expr != null;
        expr.setExpr(String.format("not (%s)", expr.getExpr()));
        expr.setValue(!expr.getValue());
        return expr;
    }

    private static ExprWithBoolean synCon(ExecProfile env, boolean expected, int depth) {
        boolean left, right;
        if (expected) {
            left = true;
            right = true;
        } else if (new Random().nextBoolean()) {
            left = true;
            right = false;
        } else {
            left = false;
            right = new Random().nextBoolean();
        }
        ExprWithBoolean left_pred = synPred(env, left, depth - 1);
        ExprWithBoolean right_pred = synPred(env, right, depth - 1);
        return new ExprWithBoolean(left && right,
                String.format("(%s) and (%s)", left_pred.getExpr(), right_pred.getExpr()));
    }

    private static ExprWithBoolean synDis(ExecProfile env, boolean expected, int depth) {
        boolean left, right;
        if (!expected) {
            left = false;
            right = false;
        } else if (new Random().nextBoolean()) {
            left = false;
            right = true;
        } else {
            left = true;
            right = new Random().nextBoolean();
        }
        ExprWithBoolean left_pred = synPred(env, left, depth - 1);
        ExprWithBoolean right_pred = synPred(env, right, depth - 1);
        assert left_pred != null;
        assert right_pred != null;
        return new ExprWithBoolean(left || right,
                String.format("(%s) or (%s)", left_pred.getExpr(), right_pred.getExpr()));
    }

    private static ExprWithBoolean synAtom(ExecProfile env, boolean expected) {
        if (env.profile.size() == 0 || env.profile.entrySet().iterator().next().getValue().getValue().size() == 0) {
            return new ExprWithBoolean(expected, Boolean.toString(expected));
        }

        ArrayList<String> shuffled_vars = new ArrayList<>(env.profile.keySet());
        Collections.shuffle(shuffled_vars);
        String selected_var = shuffled_vars.get(0);
        if (basic_boolean.contains(getFullTextByChildren(Objects.requireNonNull(env.profile.get(selected_var)).getKey()))) {
            if (Objects.requireNonNull(env.profile.get(selected_var)).getValue().stream().allMatch(Boolean::parseBoolean)) {
                return new ExprWithBoolean(expected, expected ? selected_var : "not " + selected_var);
            }
            if (Objects.requireNonNull(env.profile.get(selected_var)).getValue().stream().noneMatch(Boolean::parseBoolean)) {
                return new ExprWithBoolean(expected, expected ? "not " + selected_var : selected_var);
            }
        }
        if (basic_numeric.contains(getFullTextByChildren(Objects.requireNonNull(env.profile.get(selected_var)).getKey()))) {
            for (String var : env.profile.keySet()) {
                if (basic_numeric.contains(getFullTextByChildren(Objects.requireNonNull(env.profile.get(var)).getKey()))) {
                    ArrayList<String> list1 = Objects.requireNonNull(env.profile.get(selected_var)).getValue();
                    ArrayList<String> list2 = Objects.requireNonNull(env.profile.get(var)).getValue();
                    // list1 < list2 for each element
                    if (IntStream.range(0, list1.size()).allMatch(
                            i -> new BigDecimal(list1.get(i)).compareTo(new BigDecimal(list2.get(i))) < 0
                    )) {
                        return new ExprWithBoolean(expected, selected_var + (expected ? "<" : ">=") + var);
                    }
                    // list1 <= list2 for each element
                    if (IntStream.range(0, list1.size()).allMatch(
                            i -> new BigDecimal(list1.get(i)).compareTo(new BigDecimal(list2.get(i))) <= 0
                    )) {
                        return new ExprWithBoolean(expected, selected_var + (expected ? "<=" : ">") + var);
                    }
                    // list1 > list2 for each element
                    if (IntStream.range(0, list1.size()).allMatch(
                            i -> new BigDecimal(list1.get(i)).compareTo(new BigDecimal(list2.get(i))) > 0
                    )) {
                        return new ExprWithBoolean(expected, selected_var + (expected ? ">" : "<=") + var);
                    }
                    // list1 >= list2 for each element
                    if (IntStream.range(0, list1.size()).allMatch(
                            i -> new BigDecimal(list1.get(i)).compareTo(new BigDecimal(list2.get(i))) >= 0
                    )) {
                        return new ExprWithBoolean(expected, selected_var + (expected ? ">=" : "<") + var);
                    }
                    // list1 == list2 for each element
                    if (IntStream.range(0, list1.size()).allMatch(
                            i -> new BigDecimal(list1.get(i)).compareTo(new BigDecimal(list2.get(i))) == 0
                    )) {
                        return new ExprWithBoolean(expected, selected_var + (expected ? "==" : "!=") + var);
                    }
                    // list1 != list2 for each element
                    if (IntStream.range(0, list1.size()).allMatch(
                            i -> new BigDecimal(list1.get(i)).compareTo(new BigDecimal(list2.get(i))) != 0
                    )) {
                        return new ExprWithBoolean(expected, selected_var + (expected ? "!=" : "==") + var);
                    }
                }
            }
            String random_decimal = Double.toString(new Random().nextDouble());
            // list < random_decimal for each element
            if (Objects.requireNonNull(env.profile.get(selected_var)).getValue().stream().allMatch(
                    i -> new BigDecimal(i).compareTo(new BigDecimal(random_decimal)) < 0
            )) {
                return new ExprWithBoolean(expected, selected_var + (expected ? "<" : ">=") + random_decimal);
            }
            // list <= random_decimal for each element
            if (Objects.requireNonNull(env.profile.get(selected_var)).getValue().stream().allMatch(
                    i -> new BigDecimal(i).compareTo(new BigDecimal(random_decimal)) <= 0
            )) {
                return new ExprWithBoolean(expected, selected_var + (expected ? "<=" : ">") + random_decimal);
            }
            // list > random_decimal for each element
            if (Objects.requireNonNull(env.profile.get(selected_var)).getValue().stream().allMatch(
                    i -> new BigDecimal(i).compareTo(new BigDecimal(random_decimal)) > 0
            )) {
                return new ExprWithBoolean(expected, selected_var + (expected ? ">" : "<=") + random_decimal);
            }
            // list >= random_decimal for each element
            if (Objects.requireNonNull(env.profile.get(selected_var)).getValue().stream().allMatch(
                    i -> new BigDecimal(i).compareTo(new BigDecimal(random_decimal)) >= 0
            )) {
                return new ExprWithBoolean(expected, selected_var + (expected ? ">" : "<=") + random_decimal);
            }
            // list == random_decimal for each element
            if (Objects.requireNonNull(env.profile.get(selected_var)).getValue().stream().allMatch(
                    i -> new BigDecimal(i).compareTo(new BigDecimal(random_decimal)) == 0
            )) {
                return new ExprWithBoolean(expected, selected_var + (expected ? "==" : "!=") + random_decimal);
            }
            // list != random_decimal for each element
            if (Objects.requireNonNull(env.profile.get(selected_var)).getValue().stream().allMatch(
                    i -> new BigDecimal(i).compareTo(new BigDecimal(random_decimal)) != 0
            )) {
                return new ExprWithBoolean(expected, selected_var + (expected ? "!=" : "==") + random_decimal);
            }
        }
        return new ExprWithBoolean(expected, Boolean.toString(expected));
    }
}
