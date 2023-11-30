package com.myplugin.plsqlic3.backend.randatagen.mathutil;

import org.apache.commons.math3.distribution.BetaDistribution;

public class Beta {
    public static short getBetaSmallInt() {
        return (short) (betaSampler(0.05, 0.1) * 32767);
    }

    public static int getBetaInt() {
        return (int) (betaSampler(0.005, 0.01) * 2147483647);
    }

    public static long getBetaBigInt() {
        return (long) (betaSampler(0.0005, 0.001) * 9223372036854775807L);
    }

    private static double betaSampler(double alpha, double beta) {
        BetaDistribution betaa = new BetaDistribution(alpha, beta);
        return betaa.sample();
    }
}
