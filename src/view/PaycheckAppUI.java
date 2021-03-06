/*
 * Date:   5/14/18
 * Author: Lauren Wiebenga
 * File:   src/view/PaycheckAppUI.java
 */
package view;

import control.Controller;
import java.io.FileNotFoundException;
import java.io.IOException;
import model.Employee;

import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PaycheckAppUI extends javax.swing.JFrame {
    private Controller controller;
    private Employee selectedEmp;
    private boolean isInitialized;
    /**
     * Creates new form PaycheckAppUI
     */ 
    
    public PaycheckAppUI() {
        initComponents();
        this.setLocationRelativeTo(this);
        controller = new Controller();
        isInitialized = false;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sortOptions = new javax.swing.ButtonGroup();
        mainPanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        optionPanel = new javax.swing.JPanel();
        chooseFileLabel = new javax.swing.JLabel();
        chooseFileText = new javax.swing.JTextField();
        searchTextField = new javax.swing.JTextField();
        searchByLabel = new javax.swing.JLabel();
        nameRadioBttn = new javax.swing.JRadioButton();
        numberRadioBttn = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        searchBttn = new javax.swing.JButton();
        resultsPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        employeeTable = new javax.swing.JTable();
        displayInfoBttn = new javax.swing.JButton();
        exitBttn = new javax.swing.JButton();
        clearBttn = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        menuOpen = new javax.swing.JMenuItem();
        menuExit = new javax.swing.JMenuItem();
        menuHelp = new javax.swing.JMenu();
        menuHow = new javax.swing.JMenuItem();
        menuAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setFont(new java.awt.Font("Times", 1, 24)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Employee Paycheck Application");

        optionPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        chooseFileLabel.setText("Choose File:");

        chooseFileText.setEditable(false);
        chooseFileText.setText("select file ...");
        chooseFileText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chooseFileTextMouseClicked(evt);
            }
        });

        searchTextField.setText("enter search term ...");
        searchTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchTextFieldFocusGained(evt);
            }
        });

        searchByLabel.setText("Sort By:");

        sortOptions.add(nameRadioBttn);
        nameRadioBttn.setSelected(true);
        nameRadioBttn.setText("Employee Name");
        nameRadioBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameRadioBttnActionPerformed(evt);
            }
        });

        sortOptions.add(numberRadioBttn);
        numberRadioBttn.setText("Employee Number");
        numberRadioBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberRadioBttnActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(153, 153, 153));

        searchBttn.setText("search");
        searchBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBttnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout optionPanelLayout = new javax.swing.GroupLayout(optionPanel);
        optionPanel.setLayout(optionPanelLayout);
        optionPanelLayout.setHorizontalGroup(
            optionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(optionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(optionPanelLayout.createSequentialGroup()
                        .addComponent(chooseFileLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chooseFileText)
                        .addContainerGap())
                    .addGroup(optionPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchBttn)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, optionPanelLayout.createSequentialGroup()
                        .addGroup(optionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(optionPanelLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(searchByLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nameRadioBttn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numberRadioBttn))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))))
        );
        optionPanelLayout.setVerticalGroup(
            optionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(optionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chooseFileLabel)
                    .addComponent(chooseFileText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(optionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchByLabel)
                    .addComponent(nameRadioBttn)
                    .addComponent(numberRadioBttn))
                .addGap(18, 18, 18)
                .addGroup(optionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBttn))
                .addContainerGap())
        );

        resultsPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        employeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee Name", "Employee Number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        employeeTable.setColumnSelectionAllowed(true);
        employeeTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        employeeTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(employeeTable);
        employeeTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (employeeTable.getColumnModel().getColumnCount() > 0) {
            employeeTable.getColumnModel().getColumn(0).setResizable(false);
            employeeTable.getColumnModel().getColumn(1).setResizable(false);
        }

        displayInfoBttn.setText("Display Info");
        displayInfoBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayInfoBttnActionPerformed(evt);
            }
        });

        exitBttn.setText("Exit");
        exitBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBttnActionPerformed(evt);
            }
        });

        clearBttn.setText("Clear");
        clearBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBttnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout resultsPanelLayout = new javax.swing.GroupLayout(resultsPanel);
        resultsPanel.setLayout(resultsPanelLayout);
        resultsPanelLayout.setHorizontalGroup(
            resultsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(resultsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(resultsPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(resultsPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(displayInfoBttn)
                        .addGap(41, 41, 41)
                        .addComponent(clearBttn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exitBttn)
                        .addGap(30, 30, 30))))
        );
        resultsPanelLayout.setVerticalGroup(
            resultsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, resultsPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(resultsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(displayInfoBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(130, 130, 130))
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(resultsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(optionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(optionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resultsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menuFile.setText("File");

        menuOpen.setText("Open File");
        menuOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuOpenActionPerformed(evt);
            }
        });
        menuFile.add(menuOpen);

        menuExit.setText("Exit");
        menuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExitActionPerformed(evt);
            }
        });
        menuFile.add(menuExit);

        menuBar.add(menuFile);

        menuHelp.setText("Help");

        menuHow.setText("How to Use");
        menuHow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuHowActionPerformed(evt);
            }
        });
        menuHelp.add(menuHow);

        menuAbout.setText("About");
        menuAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAboutActionPerformed(evt);
            }
        });
        menuHelp.add(menuAbout);

        menuBar.add(menuHelp);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuExitActionPerformed

    private void exitBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBttnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitBttnActionPerformed

    private void displayInfoBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayInfoBttnActionPerformed
        if (isInitialized) {
            try {
                DefaultTableModel model = (DefaultTableModel) employeeTable.getModel();
                Object value = model.getValueAt(employeeTable.getSelectedRow(), 0);
                selectedEmp = controller.getEmployee((String) value);
                EmpInfoUI info = new EmpInfoUI(selectedEmp);
                info.setLocationRelativeTo(this);
                info.setVisible(isInitialized);
            }
            catch (NullPointerException np) {
                np.printStackTrace();
            }
            catch (ArrayIndexOutOfBoundsException ae) {
                searchTextField.setText("no employee found, try again");
            }
        }
    }//GEN-LAST:event_displayInfoBttnActionPerformed

    private void chooseFileTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chooseFileTextMouseClicked
        JFileChooser f = new JFileChooser("."); // display current dir
        JDialog jd = new JDialog();
        int rval = f.showOpenDialog(jd);
        String filename = f.getSelectedFile().getAbsolutePath();
        try {
            chooseFileText.setText(filename);
            controller.createDB(filename);
            controller.buildTable(employeeTable, nameRadioBttn.isSelected());
            isInitialized = true;
        }
        catch (FileNotFoundException ex) {
            chooseFileText.setText("Error occurred - no file found");
            isInitialized = false;
        }
        catch (IOException ioe) {
            chooseFileText.setText("Error occurred reading file");
            isInitialized = false;
        }
        catch (NullPointerException np) {
            chooseFileText.setText("Error occurred with file format");
            isInitialized = false;
        }
    }//GEN-LAST:event_chooseFileTextMouseClicked

    private void searchTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchTextFieldFocusGained
        searchTextField.setText("");
    }//GEN-LAST:event_searchTextFieldFocusGained

    private void searchBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBttnActionPerformed
        if (isInitialized) {
            if (searchTextField.getText().matches("[\\w ,-]{1,}")) {
                try {
                    selectedEmp = controller.getEmployee(searchTextField.getText());
                    EmpInfoUI info = new EmpInfoUI(selectedEmp);
                    info.setLocationRelativeTo(this);
                    info.setVisible(isInitialized); 
                }
                catch (NullPointerException npe) {
                    npe.printStackTrace();
                }
                catch (ArrayIndexOutOfBoundsException ae) {
                    searchTextField.setText("no employee found, try again");
                }
            }
        }
        else {
            searchTextField.setText("please load file before searching");
        }
    }//GEN-LAST:event_searchBttnActionPerformed

    private void clearBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBttnActionPerformed
        DefaultTableModel model = (DefaultTableModel) employeeTable.getModel();
        model.setRowCount(0);
        chooseFileText.setText("select file ...");
        searchTextField.setText("enter search term ...");
    }//GEN-LAST:event_clearBttnActionPerformed

    private void nameRadioBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameRadioBttnActionPerformed
        if (isInitialized) {
            controller.buildTable(employeeTable, nameRadioBttn.isSelected());
        }
    }//GEN-LAST:event_nameRadioBttnActionPerformed

    private void numberRadioBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberRadioBttnActionPerformed
        if (isInitialized) {
            controller.buildTable(employeeTable, nameRadioBttn.isSelected());
        }
    }//GEN-LAST:event_numberRadioBttnActionPerformed

    private void menuHowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuHowActionPerformed
        JOptionPane.showMessageDialog(this, "Display employee information and generate paycheck.\n"
                + "File format:\nName,ID,Wage,Hours");
    }//GEN-LAST:event_menuHowActionPerformed

    private void menuAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAboutActionPerformed
        JOptionPane.showMessageDialog(this,"Developed by Lauren Wiebenga.");
    }//GEN-LAST:event_menuAboutActionPerformed

    private void menuOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOpenActionPerformed
        JFileChooser f = new JFileChooser("."); // display current dir
        JDialog jd = new JDialog();
        int rval = f.showOpenDialog(jd);
        String filename = f.getSelectedFile().getAbsolutePath();
        try {
            chooseFileText.setText(filename);
            controller.createDB(filename);
            controller.buildTable(employeeTable, nameRadioBttn.isSelected());
            isInitialized = true;
        }
        catch (FileNotFoundException ex) {
            chooseFileText.setText("Error occurred - no file found");
            isInitialized = false;
        }
        catch (IOException ioe) {
            chooseFileText.setText("Error occurred reading file");
            isInitialized = false;
        }
        catch (NullPointerException np) {
            chooseFileText.setText("Error occurred with file format");
            isInitialized = false;
        }
    }//GEN-LAST:event_menuOpenActionPerformed

    
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PaycheckAppUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaycheckAppUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaycheckAppUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaycheckAppUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaycheckAppUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel chooseFileLabel;
    private javax.swing.JTextField chooseFileText;
    private javax.swing.JButton clearBttn;
    private javax.swing.JButton displayInfoBttn;
    private javax.swing.JTable employeeTable;
    private javax.swing.JButton exitBttn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JMenuItem menuAbout;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem menuExit;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenu menuHelp;
    private javax.swing.JMenuItem menuHow;
    private javax.swing.JMenuItem menuOpen;
    private javax.swing.JRadioButton nameRadioBttn;
    private javax.swing.JRadioButton numberRadioBttn;
    private javax.swing.JPanel optionPanel;
    private javax.swing.JPanel resultsPanel;
    private javax.swing.JButton searchBttn;
    private javax.swing.JLabel searchByLabel;
    private javax.swing.JTextField searchTextField;
    private javax.swing.ButtonGroup sortOptions;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
