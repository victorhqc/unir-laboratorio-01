/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author v.quiroz-castro
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
        this.hideErrors();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        medicineDistributorBtnGroup = new javax.swing.ButtonGroup();
        title = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        medicineName = new javax.swing.JTextField();
        medicineNameLabel = new javax.swing.JLabel();
        medicineKind = new javax.swing.JComboBox<>();
        medicineKindLabel = new javax.swing.JLabel();
        medicineAmount = new javax.swing.JTextField();
        medicineAmountLabel = new javax.swing.JLabel();
        medicineDistributorLabel = new javax.swing.JLabel();
        medicineCistributor1 = new javax.swing.JRadioButton();
        medicineCistributor2 = new javax.swing.JRadioButton();
        medicineCistributor3 = new javax.swing.JRadioButton();
        medicineBranchLabel = new javax.swing.JLabel();
        medicineBranchMain = new javax.swing.JCheckBox();
        medicineBranchSecondary = new javax.swing.JCheckBox();
        cancelBtn = new javax.swing.JButton();
        confirmBtn = new javax.swing.JButton();
        errorLabelName = new javax.swing.JLabel();
        errorLabelKind = new javax.swing.JLabel();
        errorLabelAmount = new javax.swing.JLabel();
        errorLabelDistributor = new javax.swing.JLabel();
        errorLabelBranch = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        title.setFont(new java.awt.Font("Helvetica", 0, 18)); // NOI18N
        title.setText("Pedido de Medicamento");

        medicineName.setFont(new java.awt.Font("Helvetica", 0, 13)); // NOI18N
        medicineName.setToolTipText("Nomnre...");
        medicineName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicineNameActionPerformed(evt);
            }
        });

        medicineNameLabel.setFont(new java.awt.Font("Helvetica", 0, 13)); // NOI18N
        medicineNameLabel.setLabelFor(medicineName);
        medicineNameLabel.setText("Nombre de medicamento");

        medicineKind.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "analgésico", "analéptico", "anestésico", "antiácido", "antidepresivo", "antibiótico" }));
        medicineKind.setSelectedIndex(-1);

        medicineKindLabel.setFont(new java.awt.Font("Helvetica", 0, 13)); // NOI18N
        medicineKindLabel.setLabelFor(medicineKind);
        medicineKindLabel.setText("Tipo de medicamento");

        medicineAmount.setFont(new java.awt.Font("Helvetica", 0, 13)); // NOI18N
        medicineAmount.setToolTipText("Ingresa una cantidad...");

        medicineAmountLabel.setFont(new java.awt.Font("Helvetica", 0, 13)); // NOI18N
        medicineAmountLabel.setLabelFor(medicineAmount);
        medicineAmountLabel.setText("Cantidad");

        medicineDistributorLabel.setFont(new java.awt.Font("Helvetica", 0, 13)); // NOI18N
        medicineDistributorLabel.setLabelFor(medicineDistributorLabel);
        medicineDistributorLabel.setText("Distribuidor");

        medicineDistributorBtnGroup.add(medicineCistributor1);
        medicineCistributor1.setFont(new java.awt.Font("Helvetica", 0, 13)); // NOI18N
        medicineCistributor1.setText("Cofarma");
        medicineCistributor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicineCistributor1ActionPerformed(evt);
            }
        });

        medicineDistributorBtnGroup.add(medicineCistributor2);
        medicineCistributor2.setFont(new java.awt.Font("Helvetica", 0, 13)); // NOI18N
        medicineCistributor2.setText("Empsesphar");

        medicineDistributorBtnGroup.add(medicineCistributor3);
        medicineCistributor3.setFont(new java.awt.Font("Helvetica", 0, 13)); // NOI18N
        medicineCistributor3.setText("Cemefar");

        medicineBranchLabel.setFont(new java.awt.Font("Helvetica", 0, 13)); // NOI18N
        medicineBranchLabel.setText("Sucursal");

        medicineBranchMain.setFont(new java.awt.Font("Helvetica", 0, 13)); // NOI18N
        medicineBranchMain.setText("Principal");
        medicineBranchMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicineBranchMainActionPerformed(evt);
            }
        });

        medicineBranchSecondary.setFont(new java.awt.Font("Helvetica", 0, 13)); // NOI18N
        medicineBranchSecondary.setText("Secundaria");

        cancelBtn.setFont(new java.awt.Font("Helvetica", 0, 13)); // NOI18N
        cancelBtn.setText("Cancelar");
        cancelBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cancelBtnMouseReleased(evt);
            }
        });

        confirmBtn.setFont(new java.awt.Font("Helvetica", 0, 13)); // NOI18N
        confirmBtn.setText("Confirmar");
        confirmBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                confirmBtnMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 376, Short.MAX_VALUE)
                        .addComponent(cancelBtn)
                        .addGap(18, 18, 18)
                        .addComponent(confirmBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(medicineName, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(medicineKind, 0, 587, Short.MAX_VALUE)
                    .addComponent(medicineAmount)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(medicineNameLabel)
                            .addComponent(medicineKindLabel)
                            .addComponent(medicineAmountLabel)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(medicineBranchMain)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(medicineBranchSecondary))
                            .addComponent(medicineBranchLabel)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(medicineCistributor1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(medicineCistributor2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(medicineCistributor3))
                            .addComponent(medicineDistributorLabel))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(medicineNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(medicineName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(medicineKindLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(medicineKind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(medicineAmountLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(medicineAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(medicineDistributorLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(medicineCistributor1)
                    .addComponent(medicineCistributor2)
                    .addComponent(medicineCistributor3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(medicineBranchLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(medicineBranchMain)
                    .addComponent(medicineBranchSecondary))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelBtn))
                .addContainerGap())
        );

        errorLabelName.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        errorLabelName.setForeground(new java.awt.Color(242, 85, 85));
        errorLabelName.setLabelFor(medicineName);
        errorLabelName.setText("Nombre inválido, ingresa un nombre.");

        errorLabelKind.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        errorLabelKind.setForeground(new java.awt.Color(242, 85, 85));
        errorLabelKind.setLabelFor(medicineName);
        errorLabelKind.setText("Elige un tipo de medicamento.");

        errorLabelAmount.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        errorLabelAmount.setForeground(new java.awt.Color(242, 85, 85));
        errorLabelAmount.setLabelFor(medicineName);
        errorLabelAmount.setText("Cantidad inválida, ingresa una cantidad numérica.");

        errorLabelDistributor.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        errorLabelDistributor.setForeground(new java.awt.Color(242, 85, 85));
        errorLabelDistributor.setLabelFor(medicineName);
        errorLabelDistributor.setText("Elige un distribuidor.");

        errorLabelBranch.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        errorLabelBranch.setForeground(new java.awt.Color(242, 85, 85));
        errorLabelBranch.setLabelFor(medicineName);
        errorLabelBranch.setText("Elige una sucursal.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(errorLabelBranch)
                    .addComponent(errorLabelDistributor)
                    .addComponent(errorLabelAmount)
                    .addComponent(errorLabelKind)
                    .addComponent(errorLabelName)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(title)
                            .addGap(275, 275, 275))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(81, 81, 81)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorLabelName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorLabelKind)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorLabelAmount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorLabelDistributor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorLabelBranch)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void medicineNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicineNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medicineNameActionPerformed

    private void medicineCistributor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicineCistributor1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medicineCistributor1ActionPerformed

    private void medicineBranchMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicineBranchMainActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medicineBranchMainActionPerformed

    private void cancelBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelBtnMouseReleased
        this.emptyValues();
    }//GEN-LAST:event_cancelBtnMouseReleased

    private void confirmBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmBtnMouseReleased
        this.validateInputs();
    }//GEN-LAST:event_confirmBtnMouseReleased

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }
    
    private void emptyValues() {
        this.medicineName.setText("");
        this.medicineAmount.setText("");
        this.medicineKind.setSelectedIndex(-1);
        this.medicineDistributorBtnGroup.clearSelection();
        this.medicineBranchMain.setSelected(false);
        this.medicineBranchSecondary.setSelected(false);
    }
    
    private boolean validateInputs() {
        return (
                this.validateName() &&
                this.validateKind() &&
                this.validateAmount() &&
                this.validateDistributor() &&
                this.validateBranch()
        );
    }
    
    private boolean validateName() {
        boolean isValid = this.isNameValid();
        this.errorLabelName.setVisible(!isValid);
        
        return isValid;
    }
    
    private boolean isNameValid() {
        String name = this.medicineName.getText();
        
        return name.length() > 0;
    }
    
    private boolean validateKind() {
        boolean isValid = this.isKindValid();
        this.errorLabelKind.setVisible(!isValid);
        
        return isValid;
    }
    
    private boolean isKindValid() {
        int selectedIndex = this.medicineKind.getSelectedIndex();
        
        return selectedIndex >= 0;
    }
    
    private boolean validateAmount() {
        boolean isValid = this.isValidAmount();
        this.errorLabelAmount.setVisible(!isValid);
        
        return isValid;
    }
    
    private boolean isValidAmount() {
        String amountStr = this.medicineAmount.getText();
        
        if (amountStr.length() <= 0) {
            return false;
        }

        try {
            int amount = Integer.parseInt(amountStr);
        
            return amount >= 0;
        } catch (Exception e) {
            return false;
        }
        
    }
    
    private boolean validateDistributor() {
        boolean isValid = this.isDistributorValid();
        this.errorLabelDistributor.setVisible(!isValid);
        
        return isValid;
    }
    
    private boolean isDistributorValid() {
        return this.medicineDistributorBtnGroup.getSelection() != null;
    }
    
    private boolean validateBranch() {
        boolean isValid = this.isBranchValid();
        this.errorLabelBranch.setVisible(!isValid);
        
        return isValid;
    }
    
    private boolean isBranchValid() {
        return this.medicineBranchMain.isSelected() ||
        this.medicineBranchSecondary.isSelected();
    }
    
    private void hideErrors() {
        this.errorLabelName.setVisible(false);
        this.errorLabelKind.setVisible(false);
        this.errorLabelAmount.setVisible(false);
        this.errorLabelDistributor.setVisible(false);
        this.errorLabelBranch.setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBtn;
    private javax.swing.JButton confirmBtn;
    private javax.swing.JLabel errorLabelAmount;
    private javax.swing.JLabel errorLabelBranch;
    private javax.swing.JLabel errorLabelDistributor;
    private javax.swing.JLabel errorLabelKind;
    private javax.swing.JLabel errorLabelName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField medicineAmount;
    private javax.swing.JLabel medicineAmountLabel;
    private javax.swing.JLabel medicineBranchLabel;
    private javax.swing.JCheckBox medicineBranchMain;
    private javax.swing.JCheckBox medicineBranchSecondary;
    private javax.swing.JRadioButton medicineCistributor1;
    private javax.swing.JRadioButton medicineCistributor2;
    private javax.swing.JRadioButton medicineCistributor3;
    private javax.swing.ButtonGroup medicineDistributorBtnGroup;
    private javax.swing.JLabel medicineDistributorLabel;
    private javax.swing.JComboBox<String> medicineKind;
    private javax.swing.JLabel medicineKindLabel;
    private javax.swing.JTextField medicineName;
    private javax.swing.JLabel medicineNameLabel;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
