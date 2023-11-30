package com.myplugin.plsqlic3.plugin.customlanguage.sql.quickfix;

import com.intellij.codeInsight.intention.IntentionAction;
import com.intellij.codeInsight.intention.PsiElementBaseIntentionAction;
import com.intellij.codeInspection.util.IntentionFamilyName;
import com.intellij.openapi.command.WriteCommandAction;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiFileFactory;
import com.intellij.util.IncorrectOperationException;
import org.jetbrains.annotations.NotNull;

// deprecate
public class MyIntentionAction extends PsiElementBaseIntentionAction implements IntentionAction {
    PsiElement psiElement;

    public MyIntentionAction(PsiElement psiElement) {
        this.psiElement = psiElement;
    }

    @Override
    public void invoke(@NotNull Project project, Editor editor, @NotNull PsiElement element) throws IncorrectOperationException {
        PsiFile file = element.getContainingFile();
        WriteCommandAction.runWriteCommandAction(psiElement.getProject(), () -> {
            PsiElement parent = psiElement.getParent();
            PsiElement codeElementBefore = createCodeElement(file, "FLOOR(");
            PsiElement codeElementAfter = createCodeElement(file, ") ");
            int index = psiElement.getStartOffsetInParent();
            parent.addBefore(codeElementBefore, parent.getChildren()[index]);
            parent.addAfter(codeElementAfter, parent.getChildren()[index + 1]);
        });
    }

    private static PsiElement createCodeElement(@NotNull PsiFile file, @NotNull String codeToInsert) {
        return PsiFileFactory.getInstance(file.getProject())
                .createFileFromText("TempDummyFile", file.getFileType(), codeToInsert).getFirstChild();
    }

    @Override
    public boolean isAvailable(@NotNull Project project, Editor editor, @NotNull PsiElement element) {
        return true;
    }

    @Override
    public @NotNull String getText() {
        return getFamilyName();
    }

    @Override
    public @NotNull @IntentionFamilyName String getFamilyName() {
        return "Repair";
    }
}
