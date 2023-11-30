package com.myplugin.plsqlic3.plugin.customlanguage.sql;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import org.jetbrains.annotations.NotNull;

public class SQLFileTypeFactory extends FileTypeFactory {
	@Override
	public void createFileTypes(@NotNull FileTypeConsumer fileTypeConsumer) {
		fileTypeConsumer.consume(SQLFileType.INSTANCE, SQLFileType.FILE_EXTENSION);
	}
}
