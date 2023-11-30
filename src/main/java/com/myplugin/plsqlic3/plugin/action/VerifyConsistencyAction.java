package com.myplugin.plsqlic3.plugin.action;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.editor.SelectionModel;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowManager;
import com.myplugin.plsqlic3.plugin.customlanguage.sql.SQLFileType;

import java.util.Objects;

public class VerifyConsistencyAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        // TODO: insert action logic here
        ToolWindowManager toolWindowManager = ToolWindowManager.getInstance(Objects.requireNonNull(e.getProject()));
        ToolWindow toolWindow = toolWindowManager.getToolWindow("PLSQLIC3");
        if (toolWindow != null) {
            toolWindow.show(null);
        }

        String file_name = e.getRequiredData(CommonDataKeys.PSI_FILE).getViewProvider().getVirtualFile().getName();
        Editor editor = e.getRequiredData(CommonDataKeys.EDITOR);
        SelectionModel selectionModel = editor.getSelectionModel();
        String selectedText = selectionModel.getSelectedText();

//        Project project = e.getData(PlatformDataKeys.PROJECT);
//        Messages.showMessageDialog(project, selectedText, "Info", Messages.getInformationIcon());

//        DBConnConfigDialog dbConnConfigDialog = new DBConnConfigDialog();
//        dbConnConfigDialog.show();



//        VerifyConsistency verifyConsistency = new VerifyConsistency();
//        verifyConsistency.verifyPLSQL(file_name, selectedText);

    }

    @Override
    public void update(AnActionEvent e) {
        boolean isSQLFile = e.getRequiredData(CommonDataKeys.PSI_FILE).getViewProvider().getVirtualFile().getFileType() instanceof SQLFileType;
        Editor editor = e.getData(PlatformDataKeys.EDITOR);
        boolean isSelectedWords = editor != null && editor.getSelectionModel().hasSelection();
        e.getPresentation().setEnabledAndVisible(isSQLFile && isSelectedWords);
    }
}
