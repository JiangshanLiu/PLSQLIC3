package com.myplugin.plsqlic3.plugin.customlanguage.sql.quickfix.inspection;

import com.intellij.codeInsight.intention.preview.IntentionPreviewInfo;
import com.intellij.codeInspection.InspectionManager;
import com.intellij.codeInspection.LocalInspectionTool;
import com.intellij.codeInspection.LocalQuickFix;
import com.intellij.codeInspection.ProblemDescriptor;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.fileEditor.FileDocumentManager;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.TextRange;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiDocumentManager;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.myplugin.plsqlic3.plugin.customlanguage.sql.inconsinfo.InconsistenciesType;
import com.myplugin.plsqlic3.plugin.customlanguage.sql.psi.InconsSQLPsiElementVisitor;
import com.myplugin.plsqlic3.plugin.customlanguage.sql.psi.SQLPSIFile;
import org.jetbrains.annotations.NotNull;

import static com.myplugin.plsqlic3.plugin.customlanguage.sql.inconsinfo.InconsistenciesType.FOR_LOOP_LOWER_BOUND_NONINT;
import static com.myplugin.plsqlic3.plugin.customlanguage.sql.inconsinfo.InconsistenciesType.FOR_LOOP_UPPER_BOUND_NONINT;

public class LoopBoundNonintInspection extends LocalInspectionTool {
    @NotNull
    @Override
    public ProblemDescriptor[] checkFile(@NotNull PsiFile file, @NotNull InspectionManager manager, boolean isOnTheFly) {
        if (!(file instanceof SQLPSIFile)) {
            return ProblemDescriptor.EMPTY_ARRAY;
        }

        SQLPSIFile sqlFile = (SQLPSIFile) file;

        InconsSQLPsiElementVisitor visitor =
                new InconsSQLPsiElementVisitor(
                        new InconsistenciesType[]{FOR_LOOP_LOWER_BOUND_NONINT, FOR_LOOP_UPPER_BOUND_NONINT},
                        manager,
                        isOnTheFly,
                        new LocalQuickFix[]{new CastToIntByFloorQuickFix(),
                                new CastToIntByCeilQuickFix(),
                                new CastToIntByRoundQuickFix()});
        sqlFile.accept(visitor);

        return visitor.getProblemDescriptors();
    }


    private static class CastToIntByFloorQuickFix implements LocalQuickFix {
        @NotNull
        @Override
        public String getName() {
            return "Round down to integer";
        }

        @Override
        public void applyFix(@NotNull Project project, @NotNull ProblemDescriptor descriptor) {
            VirtualFile virtualFile = descriptor.getPsiElement().getContainingFile().getVirtualFile();
            Document document = FileDocumentManager.getInstance().getDocument(virtualFile);
            PsiElement psiElement = descriptor.getPsiElement();
            assert document != null;
            int startOffset = psiElement.getTextRange().getStartOffset();
            int endOffset = psiElement.getTextRange().getEndOffset();
            int tail_whitespace = 0;
            for (int i = psiElement.getText().length() - 1; i >= 0 && Character.isWhitespace(psiElement.getText().charAt(i)); i--) {
                tail_whitespace++;
            }
            document.insertString(endOffset - tail_whitespace, ")");
            document.insertString(startOffset, "FLOOR(");
            PsiDocumentManager.getInstance(project).commitDocument(document);

//            PsiElement element = descriptor.getPsiElement();
//            if (element != null) {
//                PsiFile file = element.getContainingFile();
//                WriteCommandAction.runWriteCommandAction(element.getProject(), () -> {
//                    PsiElement parent = element.getParent();
//                    PsiElement codeElementBefore = createCodeElement(file, "FLOOR(");
//                    PsiElement codeElementAfter = createCodeElement(file, ") ");
//                    int index = element.getStartOffsetInParent();
//                    parent.addBefore(codeElementBefore, parent.getChildren()[index]);
//                    parent.addAfter(codeElementAfter, parent.getChildren()[index + 1]);
//                });
//            }
        }

        @Override
        public @NotNull IntentionPreviewInfo generatePreview(@NotNull Project project, @NotNull ProblemDescriptor previewDescriptor) {
            if (!startInWriteAction()) return IntentionPreviewInfo.EMPTY;
            PsiElement element = previewDescriptor.getStartElement();
            if (element == null) return IntentionPreviewInfo.EMPTY;
            PsiFile file = element.getContainingFile();
            String origText = file.getText();
            TextRange textOffset = element.getTextRange();
            StringBuilder sb_modifiedText = new StringBuilder(origText);
            int tail_whitespace = 0;
            for (int i = element.getText().length() - 1; i >= 0 && Character.isWhitespace(element.getText().charAt(i)); i--) {
                tail_whitespace++;
            }
            sb_modifiedText.insert(textOffset.getEndOffset() - tail_whitespace, ")");
            sb_modifiedText.insert(textOffset.getStartOffset(), "FLOOR(");
            return new IntentionPreviewInfo.CustomDiff(file.getFileType(), origText, sb_modifiedText.toString());
        }

        @NotNull
        public String getFamilyName() {
            return getName();
        }
    }

    private static class CastToIntByCeilQuickFix implements LocalQuickFix {
        @NotNull
        @Override
        public String getName() {
            return "Round up to integer";
        }

        @Override
        public void applyFix(@NotNull Project project, @NotNull ProblemDescriptor descriptor) {
            VirtualFile virtualFile = descriptor.getPsiElement().getContainingFile().getVirtualFile();
            Document document = FileDocumentManager.getInstance().getDocument(virtualFile);
            PsiElement psiElement = descriptor.getPsiElement();
            assert document != null;
            int startOffset = psiElement.getTextRange().getStartOffset();
            int endOffset = psiElement.getTextRange().getEndOffset();
            int tail_whitespace = 0;
            for (int i = psiElement.getText().length() - 1; i >= 0 && Character.isWhitespace(psiElement.getText().charAt(i)); i--) {
                tail_whitespace++;
            }
            document.insertString(endOffset - tail_whitespace, ")");
            document.insertString(startOffset, "CEIL(");
            PsiDocumentManager.getInstance(project).commitDocument(document);

//            PsiElement element = descriptor.getPsiElement();
//            if (element != null) {
//                PsiFile file = element.getContainingFile();
//                WriteCommandAction.runWriteCommandAction(element.getProject(), () -> {
//                    PsiElement parent = element.getParent();
//                    PsiElement codeElementBefore = createCodeElement(file, "CEIL(");
//                    PsiElement codeElementAfter = createCodeElement(file, ") ");
//                    int index = element.getStartOffsetInParent();
//                    parent.addBefore(codeElementBefore, parent.getChildren()[index]);
//                    parent.addAfter(codeElementAfter, parent.getChildren()[index + 1]);
//                });
//            }
        }

        @Override
        public @NotNull IntentionPreviewInfo generatePreview(@NotNull Project project, @NotNull ProblemDescriptor previewDescriptor) {
            if (!startInWriteAction()) return IntentionPreviewInfo.EMPTY;
            PsiElement element = previewDescriptor.getStartElement();
            if (element == null) return IntentionPreviewInfo.EMPTY;
            PsiFile file = element.getContainingFile();
            String origText = file.getText();
            TextRange textOffset = element.getTextRange();
            StringBuilder sb_modifiedText = new StringBuilder(origText);
            int tail_whitespace = 0;
            for (int i = element.getText().length() - 1; i >= 0 && Character.isWhitespace(element.getText().charAt(i)); i--) {
                tail_whitespace++;
            }
            sb_modifiedText.insert(textOffset.getEndOffset() - tail_whitespace, ")");
            sb_modifiedText.insert(textOffset.getStartOffset(), "CEIL(");
            return new IntentionPreviewInfo.CustomDiff(file.getFileType(), origText, sb_modifiedText.toString());
        }

        @NotNull
        public String getFamilyName() {
            return getName();
        }
    }


    private static class CastToIntByRoundQuickFix implements LocalQuickFix {
        @NotNull
        @Override
        public String getName() {
            return "Round to nearest integer";
        }


        @Override
        public void applyFix(@NotNull Project project, @NotNull ProblemDescriptor descriptor) {
            VirtualFile virtualFile = descriptor.getPsiElement().getContainingFile().getVirtualFile();
            Document document = FileDocumentManager.getInstance().getDocument(virtualFile);
            PsiElement psiElement = descriptor.getPsiElement();
            assert document != null;
            int startOffset = psiElement.getTextRange().getStartOffset();
            int endOffset = psiElement.getTextRange().getEndOffset();
            int tail_whitespace = 0;
            for (int i = psiElement.getText().length() - 1; i >= 0 && Character.isWhitespace(psiElement.getText().charAt(i)); i--) {
                tail_whitespace++;
            }
            document.insertString(endOffset - tail_whitespace, ")");
            document.insertString(startOffset, "FLOOR(");
            PsiDocumentManager.getInstance(project).commitDocument(document);

//            PsiElement element = descriptor.getPsiElement();
//            if (element != null) {
//                PsiFile file = element.getContainingFile();
//                WriteCommandAction.runWriteCommandAction(element.getProject(), () -> {
//                    PsiElement parent = element.getParent();
//                    PsiElement codeElementBefore = createCodeElement(file, "ROUND(");
//                    PsiElement codeElementAfter = createCodeElement(file, ") ");
//                    int index = element.getStartOffsetInParent();
//                    parent.addBefore(codeElementBefore, parent.getChildren()[index]);
//                    parent.addAfter(codeElementAfter, parent.getChildren()[index + 1]);
//                });
//            }
        }

        @Override
        public @NotNull IntentionPreviewInfo generatePreview(@NotNull Project project, @NotNull ProblemDescriptor previewDescriptor) {
            if (!startInWriteAction()) return IntentionPreviewInfo.EMPTY;
            PsiElement element = previewDescriptor.getStartElement();
            if (element == null) return IntentionPreviewInfo.EMPTY;
            PsiFile file = element.getContainingFile();
            String origText = file.getText();
            TextRange textOffset = element.getTextRange();
            StringBuilder sb_modifiedText = new StringBuilder(origText);
            int tail_whitespace = 0;
            for (int i = element.getText().length() - 1; i >= 0 && Character.isWhitespace(element.getText().charAt(i)); i--) {
                tail_whitespace++;
            }
            sb_modifiedText.insert(textOffset.getEndOffset() - tail_whitespace, ")");
            sb_modifiedText.insert(textOffset.getStartOffset(), "ROUND(");
            return new IntentionPreviewInfo.CustomDiff(file.getFileType(), origText, sb_modifiedText.toString());
        }

        @NotNull
        public String getFamilyName() {
            return getName();
        }
    }
}
