package com.myplugin.plsqlic3.plugin.customlanguage.sql.quickfix;

import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiFileFactory;
import org.jetbrains.annotations.NotNull;

public class QuickFixUtil {
    public static PsiElement createCodeElement(@NotNull PsiFile file, @NotNull String codeToInsert) {
        return PsiFileFactory.getInstance(file.getProject())
                .createFileFromText("TempDummyFile", file.getFileType(), codeToInsert).getFirstChild();
    }
}
