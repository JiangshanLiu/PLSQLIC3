package com.myplugin.plsqlic3.backend.testbymrs.livecodemut;

import com.myplugin.plsqlic3.backend.casegen.util.TestCase;
import org.apache.commons.lang3.tuple.Pair;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import com.myplugin.plsqlic3.backend.parsers.parseplpgsql.PostgreSQLLexer;
import com.myplugin.plsqlic3.backend.parsers.parseplpgsql.PostgreSQLParser;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Random;

import static com.myplugin.plsqlic3.backend.parsers.parseplpgsql.ERROR_MODE.EXCEPTION;
import static com.myplugin.plsqlic3.backend.parsers.parserutil.parserutil.GeneralParserUtil.getFullTextByChildren;
import static com.myplugin.plsqlic3.backend.parsers.parserutil.parserutil.GeneralParserUtil.readStringFromFile;
import static com.myplugin.plsqlic3.backend.testbymrs.livecodemut.EMI.AlwaysFalseConditionalBlock.getFCB;
import static com.myplugin.plsqlic3.backend.testbymrs.livecodemut.EMI.AlwaysTrueConditionalBlock.getTCB;
import static com.myplugin.plsqlic3.backend.testbymrs.livecodemut.EMI.AlwaysTrueGuard.getTG;

public class LiveCodeMutant {
    public ExecProfile prof = new ExecProfile();

    public static void main(String[] args) throws IOException {
        LiveCodeMutant liveCodeMutant = new LiveCodeMutant();
        String file_name = "./test_sql/test_plpgsql/seed_set/ray-pl.sql";
        TestCase test_case = new TestCase(file_name, readStringFromFile(file_name));
        for (int i = 0; i < 100; i++) {
            Pair<String, Integer> res = liveCodeMutant.getLiveCodeMutant(test_case);
            System.out.println(res.getValue() + "\t" + res.getKey());
        }
    }

    public Pair<String, Integer> getLiveCodeMutant(TestCase test_case) {
        PostgreSQLLexer lexer = new PostgreSQLLexer(CharStreams.fromString((String) test_case.case_code));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PostgreSQLParser parser = new PostgreSQLParser(tokens);
        parser.setErrorMode(EXCEPTION);
        parser.setBuildParseTree(true);
        PostgreSQLParser.RootContext root = parser.root();
        ParseTreeWalker walker = new ParseTreeWalker();
        PlPgSqlListenerForEMI listener = new PlPgSqlListenerForEMI(prof);
        walker.walk(listener, root);
        String plsql_with_pos = getFullTextByChildren(root);
        if (plsql_with_pos.endsWith("<EOF> ")) {
            plsql_with_pos = plsql_with_pos.substring(0, plsql_with_pos.length() - 6);    // delete "<EOF> "
        }
        prof.execProfile(plsql_with_pos, test_case.case_name);

        String STX = new String(new byte[]{0x02}, StandardCharsets.UTF_8);
        String ETX = new String(new byte[]{0x03}, StandardCharsets.UTF_8);
        String equivalent_plsql = null;
        int flag = new Random().nextInt(3);
        switch (flag) {
            case 0:
                equivalent_plsql = plsql_with_pos.replace(STX, getFCB(prof)).replace(ETX, "");
                break;
            case 1:
                equivalent_plsql = plsql_with_pos.replace(STX, getTG(prof)).replace(ETX, " END IF; ");
                break;
            case 2:
                equivalent_plsql = plsql_with_pos.replace(STX, getTCB(prof)).replace(ETX, "");
                break;
        }
        return Pair.of(equivalent_plsql, flag);
    }
}
