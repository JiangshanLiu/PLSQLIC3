package com.myplugin.plsqlic3.backend.casegen.tkmutation.util;

import com.myplugin.plsqlic3.backend.casegen.util.TestCase;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

import static com.myplugin.plsqlic3.backend.runnable.GlobalConfig.dir_seed_mutant;

public class SaveMutantCase {
    public static void saveMutantCase(TestCase test_case) {
        String case_name = test_case.case_name;
        String case_code = (String) test_case.case_code;

        File case_file = new File(dir_seed_mutant + "/" + test_case.case_name);
        boolean create_flag = false;
        if (!case_file.exists()) {
            try {
                create_flag = case_file.createNewFile();
            } catch (Exception ignored) {
            }
            FileOutputStream fos;
            if (create_flag && case_file.exists()) {
                try {
                    fos = new FileOutputStream(case_file, true);
                    OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
                    osw.write((String) test_case.case_code);
                    osw.flush();
                    osw.close();
                } catch (Exception ignore) {
                }
            }
        }
    }
}
