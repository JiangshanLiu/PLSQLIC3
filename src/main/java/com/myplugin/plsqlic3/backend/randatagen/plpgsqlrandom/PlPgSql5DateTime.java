package com.myplugin.plsqlic3.backend.randatagen.plpgsqlrandom;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.stream.LongStream;

import static com.myplugin.plsqlic3.backend.runnable.GlobalConfig.rdm_time_bound;

public class PlPgSql5DateTime {
    static private String[] ime_zones = new String[]{
            "ACDT", "ACSST", "ACST", "ACT", "ACWST", "ADT", "AEDT", "AESST", "AEST", "AFT", "AKDT", "AKST", "ALMST",
            "ALMT", "AMST", "AMT", "ANAST", "ANAT", "ARST", "ART", "AST", "AWSST", "AWST", "AZOST", "AZOT", "AZST",
            "AZT", "BDST", "BDT", "BNT", "BORT", "BOT", "BRA", "BRST", "BRT", "BST", "BTT", "CADT", "CAST", "CCT",
            "CDT", "CEST", "CET", "CETDST", "CHADT", "CHAST", "CHUT", "CKT", "CLST", "CLT", "COT", "CST", "CXT",
            "DAVT", "DDUT", "EASST", "EAST", "EAT", "EDT", "EEST", "EET", "EETDST", "EGST", "EGT", "EST", "FET",
            "FJST", "FJT", "FKST", "FKT", "FNST", "FNT", "GALT", "GAMT", "GEST", "GET", "GFT", "GILT", "GMT", "GYT",
            "HKT", "HST", "ICT", "IDT", "IOT", "IRKST", "IRKT", "IRT", "IST", "JAYT", "JST", "KDT", "KGST", "KGT",
            "KOST", "KRAST", "KRAT", "KST", "LHDT", "LHST", "LIGT", "LINT", "LKT", "MAGST", "MAGT", "MART", "MAWT",
            "MDT", "MEST", "MESZ", "MET", "METDST", "MEZ", "MHT", "MMT", "MPT", "MSD", "MSK", "MST", "MUST", "MUT",
            "MVT", "MYT", "NDT", "NFT", "NOVST", "NOVT", "NPT", "NST", "NUT", "NZDT", "NZST", "NZT", "OMSST", "OMST",
            "PDT", "PET", "PETST", "PETT", "PGT", "PHOT", "PHT", "PKST", "PKT", "PMDT", "PMST", "PONT", "PST", "PWT",
            "PYST", "PYT", "RET", "SADT", "SAST", "SCT", "SGT", "TAHT", "TFT", "TJT", "TKT", "TMT", "TOT", "TRUT",
            "TVT", "UCT", "ULAST", "ULAT", "UT", "UTC", "UYST", "UYT", "UZST", "UZT", "VET", "VLAST", "VLAT", "VOLT",
            "VUT", "WADT", "WAKT", "WAST", "WAT", "WDT", "WET", "WETDST", "WFT", "WGST", "WGT", "XJT", "YAKST", "YAKT",
            "YAPT", "YEKST", "YEKT", "Z", "ZULU"};

    static private String getRandomTimeZone() {
        Random r = new Random();
        int num = r.nextInt(ime_zones.length);
        return ime_zones[num];
    }

    public static String getPlPgSqlTimestamp(int p) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Random r = new Random();
        LongStream longs = r.longs(1, 0, rdm_time_bound);
        Date randomTime = new Date(longs.toArray()[0]);
        return "TIMESTAMP '" + sdf.format(randomTime) + "'";
    }

    public static String getPlPgSqlTimestampWithTimeZone(int p) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Random r = new Random();
        LongStream longs = r.longs(1, 0, rdm_time_bound);
        Date randomTime = new Date(longs.toArray()[0]);
        return "TIMESTAMP WITH TIME ZONE '" + sdf.format(randomTime) + " " + getRandomTimeZone() + "'";
    }

    public static String getPlPgSqlDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Random r = new Random();
        LongStream longs = r.longs(1, 0, rdm_time_bound);
        Date randomTime = new Date(longs.toArray()[0]);
        return "DATE '" + sdf.format(randomTime) + "'";
    }

    public static String getPlPgSqlTime(int p) {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        Random r = new Random();
        LongStream longs = r.longs(1, 0, rdm_time_bound);
        Date randomTime = new Date(longs.toArray()[0]);
        return "TIME '" + sdf.format(randomTime) + "'";
    }

    public static String getPlPgSqlTimeWithTimeZone(int p) {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        Random r = new Random();
        LongStream longs = r.longs(1, 0, rdm_time_bound);
        Date randomTime = new Date(longs.toArray()[0]);
        return "TIME WITH TIME ZONE '" + sdf.format(randomTime) + " " + getRandomTimeZone() + "'";
    }

    public static String getPlPgSqlInterval(int p) {
        Random r = new Random();
        String interval = String.format("P%s-%s-%sT%s:%s:%s",
                r.nextInt(3000),
                r.nextInt(12),
                r.nextInt(31),
                r.nextInt(24),
                r.nextInt(60),
                r.nextInt(60));
        return "INTERVAL '" + interval + "'";
    }
}
