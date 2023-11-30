package com.myplugin.plsqlic3.plugin.customlanguage.sql;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class SQLFileType extends LanguageFileType {
	public static final String FILE_EXTENSION = "sql";
		public static final SQLFileType INSTANCE = new SQLFileType();

	protected SQLFileType() {
		super(SQLLanguage.INSTANCE);
	}

	@NotNull
	@Override
	public String getName() {
		return "SQL";
	}

	@NotNull
	@Override
	public String getDescription() {
		return "SQL";
	}

	@NotNull
	@Override
	public String getDefaultExtension() {
		return FILE_EXTENSION;
	}

	@Nullable
	@Override
	public Icon getIcon() {
		return Icons.SAMPLE_ICON;
	}
}
