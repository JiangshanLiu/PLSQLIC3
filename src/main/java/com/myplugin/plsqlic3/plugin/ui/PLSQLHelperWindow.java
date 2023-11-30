package com.myplugin.plsqlic3.plugin.ui;

import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.editor.EditorFactory;
import com.intellij.openapi.editor.SelectionModel;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowManager;
import com.intellij.psi.util.PsiUtilBase;
import com.intellij.ui.JBColor;
import com.intellij.util.ui.JBUI;
import com.myplugin.plsqlic3.backend.databaseutil.jdbcutil.SQLResState;
import com.myplugin.plsqlic3.backend.parsers.parseplpgsql.PostgreSQLLexer;
import com.myplugin.plsqlic3.backend.parsers.parseplpgsql.PostgreSQLParser;
import com.myplugin.plsqlic3.middleware.VerifyConsistency;
import com.myplugin.plsqlic3.middleware.data.CaseValidityData;
import com.myplugin.plsqlic3.middleware.data.InfoData;
import com.myplugin.plsqlic3.middleware.data.inconsistency.AbstractInconsistencyData;
import com.myplugin.plsqlic3.middleware.parser.PlPgSqlListenerImpForInconsistency;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableModel;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Objects;
import java.util.stream.Collectors;

import static com.myplugin.plsqlic3.backend.parsers.parseplpgsql.ERROR_MODE.EXCEPTION;
import static com.myplugin.plsqlic3.middleware.GenerateArgsByRandom.generateArgsByRandom;
import static com.myplugin.plsqlic3.plugin.listener.MyTextSelectionListener.registerListener;


public class PLSQLHelperWindow {

    private static class ColourRender extends DefaultTableCellRenderer {
        public Component getTableCellRendererComponent(JTable tblData,
                                                       Object value, boolean isSelected, boolean hasFocus, int row,
                                                       int column) {
            Component cellComponent = super.getTableCellRendererComponent(
                    tblData, value, isSelected, hasFocus, row, column);
            if ((row == 1 || row == 2) && column == 1 && value.equals(str_inconsistency)) {
                cellComponent.setForeground(JBColor.RED);
            } else if ((row == 1 || row == 2) && column == 1 && value.equals(str_consistency)) {
                cellComponent.setForeground(JBColor.GREEN);
            } else {
                cellComponent.setForeground(null);
            }
            return cellComponent;
        }
    }

    private JPanel contentPanel;
    private JButton editDatabaseConnectionConfigButton;
    private JTabbedPane tabbedPane;
    private JPanel jpanelInfo;
    private JTable tableInfo;
    private JLabel jlabelSetArgs;
    private JTable tableSetArgs;
    private JTextArea textAreaPLSQL;
    private JTextArea textAreaIncons;
    private JTextArea textAreaSQL;
    private JCheckBox checkBoxIfDetail;
    private JButton manualDisplayButton;
    private JTable table;
    private JButton verifyConsistencyButton;
    private JButton setByRandomButton;

    private final ColourRender colourRender = new ColourRender();
    private static final String str_consistency = "No inconsistency";
    private static final String str_inconsistency = "With inconsistency";

    private static void updateSizeAndWrap(JTextPane textPane) {
        int width = textPane.getWidth();
        textPane.setSize(new Dimension(width, Short.MAX_VALUE));
        textPane.revalidate();
    }

    private void init() {
        registerListener(this);

        tableInfo.getTableHeader().setReorderingAllowed(false);
        tableInfo.setEnabled(true);
        tableInfo.setModel(InfoData.emptyTableModel);

        jlabelSetArgs.setOpaque(true);

        tableSetArgs.getTableHeader().setReorderingAllowed(false);
        tableSetArgs.setEnabled(true);

        textAreaPLSQL.setEditable(false);
        textAreaPLSQL.setTabSize(4);
        textAreaPLSQL.setMargin(JBUI.insets(5, 10));

        textAreaIncons.setEditable(false);
        textAreaIncons.setTabSize(4);
        textAreaIncons.setLineWrap(true);
        textAreaIncons.setWrapStyleWord(true);
        textAreaIncons.setMargin(JBUI.insets(5, 10));

        textAreaSQL.setEditable(false);
        textAreaSQL.setTabSize(4);
        textAreaSQL.setMargin(JBUI.insets(5, 10));

        table.getTableHeader().setReorderingAllowed(false);
        table.setEnabled(true);
    }

    public PLSQLHelperWindow(Project project, ToolWindow toolWindow) {
        init();

        setByRandomButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tableSetArgs.getRowCount() > 0) {
                    TableModel tableModel = tableSetArgs.getModel();
                    generateArgsByRandom(tableModel);
                }
            }
        });

        verifyConsistencyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Editor[] editors = EditorFactory.getInstance().getAllEditors();

                ArrayList<String> selectedStrings = new ArrayList<>();
                ArrayList<String> selectedFileNames = new ArrayList<>();
                for (Editor editor : editors) {
                    if (editor.getProject() == project) {
                        SelectionModel selectionModel = editor.getSelectionModel();
                        if (selectionModel.hasSelection()) {
                            selectedFileNames.add(Objects.requireNonNull(PsiUtilBase.getPsiFileInEditor(editor, project)).getVirtualFile().getName());
                            selectedStrings.add(selectionModel.getSelectedText());
                        }
                    }
                }

                if (selectedStrings.size() > 1) {
                    Messages.showMessageDialog(project, "Please select 1 of the multiple codes that you have selected", "Information", Messages.getInformationIcon());
                    return;
                } else if (selectedStrings.size() == 0) {
                    Messages.showMessageDialog(project, "Please select at least 1 code", "Information", Messages.getInformationIcon());
                    return;
                }

                ToolWindowManager toolWindowManager = ToolWindowManager.getInstance(project);
                ToolWindow toolWindow = toolWindowManager.getToolWindow("PLSQLIC3");
                if (toolWindow != null) {
                    toolWindow.show(null);
                }
                tabbedPane.setSelectedComponent(jpanelInfo);

                for (int i = 0; i < tableSetArgs.getModel().getRowCount(); ++i) {
                    if (tableSetArgs.getValueAt(i, 2).toString().length() == 0) {
                        Messages.showMessageDialog(project, "Please set incoming parameters for PL/SQL", "Warning", Messages.getWarningIcon());
                        blink();
                        return;
                    }
                }

                VerifyConsistency verifyConsistency = new VerifyConsistency();
                verifyConsistency.verifyPLSQL(selectedFileNames.get(0), selectedStrings.get(0), tableSetArgs.getModel());
                if (verifyConsistency.verifyData != null) {
                    ArrayList<AbstractInconsistencyData> incons_list = new ArrayList<>();
//                    if (infoData.if_inconsistent.equals(str_inconsistency)) {
                    PostgreSQLLexer lexer = new PostgreSQLLexer(CharStreams.fromString(selectedStrings.get(0)));
                    CommonTokenStream tokens = new CommonTokenStream(lexer);
                    PostgreSQLParser parser = new PostgreSQLParser(tokens);
                    parser.setErrorMode(EXCEPTION);
                    ParseTree plsql_root = parser.root();
                    parser.setBuildParseTree(true);
                    ParseTreeWalker walker = new ParseTreeWalker();
                    PlPgSqlListenerImpForInconsistency listener = new PlPgSqlListenerImpForInconsistency(selectedStrings.get(0), incons_list);
                    walker.walk(listener, plsql_root);

                    InfoData infoData = new InfoData(selectedFileNames.get(0),
                            verifyConsistency.verifyData.sql_res.sqlResState == SQLResState.ANOMALY ? str_inconsistency : str_consistency,
                            incons_list.size() > 0 ? str_inconsistency : str_consistency,
                            verifyConsistency.verifyData.sql_res.plsql_res.select_res.toString(),
                            verifyConsistency.verifyData.sql_res.sql_res.select_res.toString());
//                    }
                    tableInfo.setModel(infoData.tableModel);
                    textAreaPLSQL.setText(selectedStrings.get(0));
                    textAreaIncons.setText(incons_list.stream().map(Object::toString).collect(Collectors.joining("\n\n\n")));
                    textAreaSQL.setText(verifyConsistency.verifyData.code_sql);
                } else {
                    textAreaPLSQL.setText("");
                    textAreaIncons.setText("");
                    textAreaSQL.setText("");
                }

                tableInfo.getColumnModel().getColumn(1).setCellRenderer(colourRender);
                table.setModel(verifyConsistency.verifyData.tableModel);
            }
        });

        checkBoxIfDetail.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if (checkBoxIfDetail.isSelected()) {
                    manualDisplayButton.setEnabled(false);
                } else {
                    manualDisplayButton.setEnabled(true);
                }
            }
        });
    }

    public void setArgsTable(CaseValidityData caseValidityData) {
        tableSetArgs.setModel(caseValidityData.getTableModel());
        tableSetArgs.setEnabled(true);
    }

    public void setEmptyInfoTable() {
        tableInfo.setModel(InfoData.emptyTableModel);
    }

    public JPanel getContentPanel() {
        return contentPanel;
    }

    private void blink() {
        int blinkCount = 3;
        Color bgColor = jlabelSetArgs.getBackground();
        Timer timer = new Timer(300, new ActionListener() {
            private int blinkCounter = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                if (blinkCounter < blinkCount * 2) {
                    if (blinkCounter % 2 == 0) {
                        jlabelSetArgs.setBackground(JBColor.YELLOW);
                    } else {
                        jlabelSetArgs.setBackground(bgColor);
                    }
                    blinkCounter++;

                    if (blinkCounter == blinkCount * 2) {
                        jlabelSetArgs.setBackground(bgColor);
                        ((Timer) e.getSource()).stop();
                    }
                }
            }
        });
        timer.start();
    }
}
