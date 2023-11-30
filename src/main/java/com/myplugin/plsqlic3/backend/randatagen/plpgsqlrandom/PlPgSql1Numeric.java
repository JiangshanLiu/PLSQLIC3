package com.myplugin.plsqlic3.backend.randatagen.plpgsqlrandom;

import java.util.Random;

import static com.myplugin.plsqlic3.backend.randatagen.mathutil.Beta.*;
import static com.myplugin.plsqlic3.backend.runnable.GlobalConfig.*;

/**
 * 名字					存储尺寸		描述	                范围
 * smallint				2字节	小范围整数			-32768 to +32767
 * integer				4字节	整数的典型选择			-2147483648 to +2147483647
 * bigint				8字节	大范围整数			-9223372036854775808 to +9223372036854775807
 * decimal				可变		用户指定精度，精确		最高小数点前131072位，以及小数点后16383位
 * numeric				可变		用户指定精度，精确		最高小数点前131072位，以及小数点后16383位
 * real					4字节	可变精度，不精确		6位十进制精度
 * double precision		8字节	可变精度，不精确		15位十进制精度
 * smallserial			2字节	自动增加的小整数		1到32767
 * serial				4字节	自动增加的整数			1到2147483647
 * bigserial			8字节	自动增长的大整数		1到9223372036854775807
 */
public class PlPgSql1Numeric {
    public static String getPlPgSqlSmallint() {
        if (if_beta_sampled) {
            short res = getBetaSmallInt();
            if (res == 0) {
                Random r = new Random();
                short num = (short) (-32769 + r.nextInt((+32767) - (-32769)));
                return String.valueOf(num);
            } else {
                return String.valueOf(res);
            }
        } else {
            Random r = new Random();
            short num = (short) (-32769 + r.nextInt((+32767) - (-32769)));
            return String.valueOf(num);
        }
    }

    public static String getPlPgSqlInteger() {
        if (if_beta_sampled) {
            int res = getBetaInt();
            if (res == 0) {
                Random r = new Random();
                int num = r.nextInt(rdm_int_max);
                return String.valueOf(num);
            } else {
                return String.valueOf(res);
            }
        } else {
            Random r = new Random();
            int num = r.nextInt(rdm_int_max);
            return String.valueOf(num);
        }
    }

    public static String getPlPgSqlBigint() {
        if (if_beta_sampled) {
            long res = getBetaBigInt();
            if (res == 0) {
                Random r = new Random();
                long num = r.nextLong();
                return String.valueOf(num);
            } else {
                return String.valueOf(res);
            }
        } else {
            Random r = new Random();
            long num = r.nextLong();
            return String.valueOf(num);
        }
    }

    // Uncritical
    public static String getPlPgSqlNumeric(int p, int s) {
        if (!(p > 0 && s >= 0)) {
            Random r = new Random();
            return String.valueOf(r.nextDouble() * Math.pow(10, r.nextInt(rdm_numeric_default_power_max)));
        }
        Random r = new Random();
        int num = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < p; i++) {
            num = r.nextInt(p);
            while (i == 0 && num == 0) {
                num = r.nextInt(p);
            }
            sb.append(num);
        }
        if (s == 0) {
            return sb.toString();
        }
        if (p > s) {
            sb.insert(p - s, ".");
        } else {
            sb.append(".0");
        }
        return sb.toString();
    }

    public static String getPlPgSqlReal() {
        Random r = new Random();
        float num = r.nextFloat();
        return String.valueOf(num);
    }

    public static String getPlPgSqlDoublePrecision() {
        Random r = new Random();
        double num = r.nextDouble();
        return String.valueOf(num);
    }
}
