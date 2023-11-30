package com.myplugin.plsqlic3.backend.databaseutil.jdbcutil;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public interface AbstractJDBCUtil {
    void Connect();

    List<HashMap<String, Object>> Select(String sql);

    SelectResWithMsg SelectWithExcep(String sql);

    HashSet<String> ExecuteWithNotice(String sql);

    Boolean Insert(String sql);

    void Delete(String sql);

    void setSchemaByFileName(String file_name);

    void close();
}
