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
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        distribuidorMedicamentoBtnGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
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
        medicineBranchSecundary = new javax.swing.JCheckBox();
        cancelBtn = new javax.swing.JButton();
        confirmBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Helvetica", 0, 18)); // NOI18N
        jLabel1.setText("Pedido de Medicamento");

        medicineName.setFont(new java.awt.Font("Helvetica", 0, 13)); // NOI18N
        medicineName.setToolTipText("Nomnre...");
        medicineName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicineNameActionPerformed(evt);
            }
        });

        medicineNameLabel.setFont(new java.awt.Font("Helvetica", 0, 13)); // NOI18N
        medicineNameLabel.setText("Nombre de medicamento");

        medicineKind.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "analgésico", "analéptico", "anestésico", "antiácido", "antidepresivo", "antibiótico" }));

        medicineKindLabel.setFont(new java.awt.Font("Helvetica", 0, 13)); // NOI18N
        medicineKindLabel.setText("Tipo de medicamento");

        medicineAmount.setFont(new java.awt.Font("Helvetica", 0, 13)); // NOI18N
        medicineAmount.setToolTipText("Ingresa una cantidad...");
        medicineAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicineAmountActionPerformed(evt);
            }
        });

        medicineAmountLabel.setFont(new java.awt.Font("Helvetica", 0, 13)); // NOI18N
        medicineAmountLabel.setText("Cantidad");

        medicineDistributorLabel.setFont(new java.awt.Font("Helvetica", 0, 13)); // NOI18N
        medicineDistributorLabel.setText("Distribuidor");

        distribuidorMedicamentoBtnGroup.add(medicineCistributor1);
        medicineCistributor1.setFont(new java.awt.Font("Helvetica", 0, 13)); // NOI18N
        medicineCistributor1.setText("Cofarma");
        medicineCistributor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicineCistributor1ActionPerformed(evt);
            }
        });

        distribuidorMedicamentoBtnGroup.add(medicineCistributor2);
        medicineCistributor2.setFont(new java.awt.Font("Helvetica", 0, 13)); // NOI18N
        medicineCistributor2.setText("Empsesphar");

        distribuidorMedicamentoBtnGroup.add(medicineCistributor3);
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

        medicineBranchSecundary.setFont(new java.awt.Font("Helvetica", 0, 13)); // NOI18N
        medicineBranchSecundary.setText("Secundaria");

        cancelBtn.setFont(new java.awt.Font("Helvetica", 0, 13)); // NOI18N
        cancelBtn.setText("Cancelar");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        confirmBtn.setFont(new java.awt.Font("Helvetica", 0, 13)); // NOI18N
        confirmBtn.setText("Confirmar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(medicineNameLabel)
                            .addComponent(medicineKindLabel)
                            .addComponent(medicineAmountLabel))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cancelBtn)
                                .addGap(18, 18, 18)
                                .addComponent(confirmBtn))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(medicineKind, javax.swing.GroupLayout.Alignment.LEADING, 0, 547, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(medicineBranchMain)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(medicineBranchSecundary))
                                .addComponent(medicineBranchLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(medicineCistributor1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(medicineCistributor2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(medicineCistributor3))
                                .addComponent(medicineDistributorLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(medicineName, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(medicineAmount, javax.swing.GroupLayout.Alignment.LEADING)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                    .addComponent(medicineBranchSecundary))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelBtn)
                    .addComponent(confirmBtn))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(275, 275, 275))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(155, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(117, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void medicineNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicineNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medicineNameActionPerformed

    private void medicineAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicineAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medicineAmountActionPerformed

    private void medicineCistributor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicineCistributor1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medicineCistributor1ActionPerformed

    private void medicineBranchMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicineBranchMainActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medicineBranchMainActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelBtnActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBtn;
    private javax.swing.JButton confirmBtn;
    private javax.swing.ButtonGroup distribuidorMedicamentoBtnGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField medicineAmount;
    private javax.swing.JLabel medicineAmountLabel;
    private javax.swing.JLabel medicineBranchLabel;
    private javax.swing.JCheckBox medicineBranchMain;
    private javax.swing.JCheckBox medicineBranchSecundary;
    private javax.swing.JRadioButton medicineCistributor1;
    private javax.swing.JRadioButton medicineCistributor2;
    private javax.swing.JRadioButton medicineCistributor3;
    private javax.swing.JLabel medicineDistributorLabel;
    private javax.swing.JComboBox<String> medicineKind;
    private javax.swing.JLabel medicineKindLabel;
    private javax.swing.JTextField medicineName;
    private javax.swing.JLabel medicineNameLabel;
    // End of variables declaration//GEN-END:variables
}
