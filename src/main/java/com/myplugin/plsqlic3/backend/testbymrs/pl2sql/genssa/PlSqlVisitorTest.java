package com.myplugin.plsqlic3.backend.testbymrs.pl2sql.genssa;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import com.myplugin.plsqlic3.backend.parsers.parseplsql.PlSqlLexer;
import com.myplugin.plsqlic3.backend.parsers.parseplsql.PlSqlParser;
import com.myplugin.plsqlic3.backend.parsers.parseplsql.PlSqlParserVisitor;

import java.io.IOException;

/* Use listener instead of visitor */
public class PlSqlVisitorTest {
    public static void exec(String input){
        PlSqlLexer lexer = new PlSqlLexer(CharStreams.fromString(input));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PlSqlParser parser = new PlSqlParser(tokens);
        parser.setBuildParseTree(true);
        ParseTree root = parser.sql_script();

        PlSqlParserVisitor<String> visitor = new PlSqlVisitorImp();
//        root.accept(visitor);
        visitor.visit(root);
    }

    public static void main(String[] args) throws IOException {
//        String input = "select a,b,a,f,afd,g,asdg,asdg,df from t;";
        String input = "DECLARE\n" +
                "  TYPE catid_array IS TABLE OF NUMBER(10) INDEX BY PLS_INTEGER;\n" +
                "  v_catid_array   catid_array;\n" +
                "  v_product       products%ROWTYPE;\n" +
                "  v_products_num  NUMBER(3);\n" +
                "  v_tempnum       NUMBER(1);\n" +
                "  v_count         NUMBER(3);\n" +
                "BEGIN\n" +
                "  v_count := 0;\n" +
                "  -- 先处理嵌套子查询，查询结果放入变量中\n" +
                "  FOR v_num IN 1 .. 10 LOOP\n" +
                "    SELECT category_id INTO v_tempnum\n" +
                "      FROM products WHERE product_id = v_num;\n" +
                "    IF v_catid_array.exists(0) THEN\n" +
                "      FOR v_exist_catid IN v_catid_array.first .. v_catid_array.last LOOP\n" +
                "        IF v_tempnum = v_catid_array(v_exist_catid) THEN\n" +
                "          EXIT;\n" +
                "        END IF;\n" +
                "        IF v_exist_catid = v_catid_array.last THEN\n" +
                "          v_catid_array(v_catid_array.count) := v_tempnum;\n" +
                "        END IF;\n" +
                "      END LOOP;\n" +
                "    ELSE\n" +
                "      v_catid_array(v_catid_array.count) := v_tempnum;\n" +
                "    END IF;\n" +
                "  END LOOP;\n" +
                "  -- 输出检查正确与否\n" +
                "  FOR v_exist_catid IN v_catid_array.first .. v_catid_array.last LOOP\n" +
                "    dbms_output.put_line(to_char(v_catid_array(v_exist_catid)));\n" +
                "  END LOOP;\n" +
                "  -- 获取products表行数\n" +
                "  SELECT num_rows INTO v_products_num\n" +
                "    FROM user_tables WHERE table_name='PRODUCTS';\n" +
                "  -- 遍历products表\n" +
                "  FOR v_num IN 1 .. v_products_num LOOP\n" +
                "    SELECT category_id INTO v_tempnum\n" +
                "      FROM products WHERE product_id = v_num;\n" +
                "    FOR v_exist_catid IN v_catid_array.first .. v_catid_array.last LOOP\n" +
                "      IF v_tempnum = v_catid_array(v_exist_catid) THEN\n" +
                "        v_count := v_count + 1;\n" +
                "      END IF;\n" +
                "    END LOOP;\n" +
                "  END LOOP;\n" +
                "  -- 输出最终结果\n" +
                "  dbms_output.put_line(to_char(v_count));\n" +
                "END;";
        exec(input);
    }
}
