/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mobileplanmgmt.presentation.view;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import mobileplanmgmt.domain.model.MobilePlan;
import mobileplanmgmt.domain.model.MobilePlanCreate;
import mobileplanmgmt.presentation.controller.CustomerController;
import mobileplanmgmt.presentation.controller.MobilePlanController;
import mobileplanmgmt.presentation.controller.SubscriptionController;
import static mobileplanmgmt.util.ValidationUtil.isValidDoubleInput;
import static mobileplanmgmt.util.ValidationUtil.isValidInput;
import static mobileplanmgmt.util.ValidationUtil.isValidIntegerInput;

/**
 *
 * @author Comp
 */
public class MainView extends javax.swing.JFrame {

    private MobilePlanController mobilePlanController;

    private CustomerController customerController;

    private SubscriptionController subscriptionController;

    /**
     * Creates new form MainView
     */
    public MainView() {
        this.mobilePlanController = new MobilePlanController();
        this.customerController = new CustomerController();
        this.subscriptionController = new SubscriptionController();
        initComponents();

        refreshMobilePlansTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabbedPanel = new javax.swing.JTabbedPane();
        mobilePlansPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mobilePlansTable = new javax.swing.JTable();
        mobilePlanNameInput = new javax.swing.JTextField();
        mobilePlanNameLabel = new javax.swing.JLabel();
        mobilePlanNameLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        mobilePlanDescInput = new javax.swing.JTextArea();
        dataLimitInput = new javax.swing.JTextField();
        minutesLimitInput = new javax.swing.JTextField();
        monthlyFeeInput = new javax.swing.JTextField();
        dataLimitLabel = new javax.swing.JLabel();
        minutesLimitLabel = new javax.swing.JLabel();
        monthlyFeeLabel = new javax.swing.JLabel();
        submitCreateMobilePlan = new javax.swing.JButton();
        customersPanel = new javax.swing.JPanel();
        subscriptionsPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mobilePlansTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Description", "Data limit", "Minutes limit", "Monthly Fee", "Active subscriptions", "Created at", "Updated at"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(mobilePlansTable);

        mobilePlanNameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobilePlanNameInputActionPerformed(evt);
            }
        });

        mobilePlanNameLabel.setText("Description");

        mobilePlanNameLabel1.setText("Name");

        mobilePlanDescInput.setColumns(20);
        mobilePlanDescInput.setRows(5);
        jScrollPane2.setViewportView(mobilePlanDescInput);

        dataLimitInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataLimitInputActionPerformed(evt);
            }
        });

        minutesLimitInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minutesLimitInputActionPerformed(evt);
            }
        });

        monthlyFeeInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthlyFeeInputActionPerformed(evt);
            }
        });

        dataLimitLabel.setText("Data limit  (MB)");

        minutesLimitLabel.setText("Minutes limit");

        monthlyFeeLabel.setText("Monthly Fee ($)");

        submitCreateMobilePlan.setText("Create mobile plan");
        submitCreateMobilePlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitCreateMobilePlanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mobilePlansPanelLayout = new javax.swing.GroupLayout(mobilePlansPanel);
        mobilePlansPanel.setLayout(mobilePlansPanelLayout);
        mobilePlansPanelLayout.setHorizontalGroup(
            mobilePlansPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mobilePlansPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 709, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(mobilePlansPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(submitCreateMobilePlan, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mobilePlansPanelLayout.createSequentialGroup()
                        .addGroup(mobilePlansPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dataLimitInput, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dataLimitLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(mobilePlansPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mobilePlansPanelLayout.createSequentialGroup()
                                .addComponent(minutesLimitLabel)
                                .addGap(13, 13, 13))
                            .addComponent(minutesLimitInput, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(mobilePlansPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(monthlyFeeLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(monthlyFeeInput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mobilePlansPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(mobilePlanNameLabel1)
                        .addComponent(mobilePlanNameLabel)
                        .addComponent(mobilePlanNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        mobilePlansPanelLayout.setVerticalGroup(
            mobilePlansPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mobilePlansPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(mobilePlansPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(mobilePlansPanelLayout.createSequentialGroup()
                        .addComponent(mobilePlanNameLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mobilePlanNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mobilePlanNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(mobilePlansPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dataLimitLabel)
                            .addComponent(minutesLimitLabel)
                            .addComponent(monthlyFeeLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mobilePlansPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dataLimitInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(minutesLimitInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(monthlyFeeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(submitCreateMobilePlan)))
                .addContainerGap(129, Short.MAX_VALUE))
        );

        tabbedPanel.addTab("Mobile plans", mobilePlansPanel);

        javax.swing.GroupLayout customersPanelLayout = new javax.swing.GroupLayout(customersPanel);
        customersPanel.setLayout(customersPanelLayout);
        customersPanelLayout.setHorizontalGroup(
            customersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1036, Short.MAX_VALUE)
        );
        customersPanelLayout.setVerticalGroup(
            customersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 415, Short.MAX_VALUE)
        );

        tabbedPanel.addTab("Customers", customersPanel);

        javax.swing.GroupLayout subscriptionsPanelLayout = new javax.swing.GroupLayout(subscriptionsPanel);
        subscriptionsPanel.setLayout(subscriptionsPanelLayout);
        subscriptionsPanelLayout.setHorizontalGroup(
            subscriptionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1036, Short.MAX_VALUE)
        );
        subscriptionsPanelLayout.setVerticalGroup(
            subscriptionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 415, Short.MAX_VALUE)
        );

        tabbedPanel.addTab("Subscriptions", subscriptionsPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabbedPanel)
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(tabbedPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mobilePlanNameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobilePlanNameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mobilePlanNameInputActionPerformed

    private void dataLimitInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataLimitInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataLimitInputActionPerformed

    private void minutesLimitInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minutesLimitInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_minutesLimitInputActionPerformed

    private void monthlyFeeInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthlyFeeInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monthlyFeeInputActionPerformed

    private void submitCreateMobilePlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitCreateMobilePlanActionPerformed
        ArrayList<Boolean> validations = new ArrayList();

        validations.add(isValidInput(this.mobilePlanNameInput, input -> !input.isEmpty()));
        validations.add(isValidInput(this.dataLimitInput, input -> isValidIntegerInput(input)));
        validations.add(isValidInput(this.minutesLimitInput, input -> isValidIntegerInput(input)));
        validations.add(isValidInput(this.monthlyFeeInput, input -> isValidDoubleInput(input)));

        if (validations.stream().allMatch(b -> b)) {
            MobilePlanCreate mobilePlanCreate = MobilePlanCreate.builder()
                    .name(this.mobilePlanNameInput.getText())
                    .description(this.mobilePlanDescInput.getText())
                    .dataLimit(Integer.parseInt(this.dataLimitInput.getText()))
                    .minutesLimit(Integer.parseInt(this.minutesLimitInput.getText()))
                    .monthlyFee(Double.parseDouble(this.monthlyFeeInput.getText()))
                    .build();

            MobilePlan mobilePlan = this.mobilePlanController.createMobilePlan(mobilePlanCreate);
            if (mobilePlan != null) {
                refreshMobilePlansTable();
            }

        }
    }//GEN-LAST:event_submitCreateMobilePlanActionPerformed

    private void refreshMobilePlansTable() {
        try {
            DefaultTableModel tableModel = (DefaultTableModel) this.mobilePlansTable.getModel();

            for (MobilePlan mobilePlan : this.mobilePlanController.getAllMobilePlans()) {
                tableModel.addRow(new Object[]{
                    mobilePlan.getName(),
                    mobilePlan.getDescription(),
                    mobilePlan.getDataLimit(),
                    mobilePlan.getMinutesLimit(),
                    mobilePlan.getMonthlyFee(),
                    mobilePlan.getCreatedAt(),
                    mobilePlan.getUpdatedAt()
                });
            }
        } catch (RuntimeException exception) {
            throw exception;
        }
    }

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
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel customersPanel;
    private javax.swing.JTextField dataLimitInput;
    private javax.swing.JLabel dataLimitLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField minutesLimitInput;
    private javax.swing.JLabel minutesLimitLabel;
    private javax.swing.JTextArea mobilePlanDescInput;
    private javax.swing.JTextField mobilePlanNameInput;
    private javax.swing.JLabel mobilePlanNameLabel;
    private javax.swing.JLabel mobilePlanNameLabel1;
    private javax.swing.JPanel mobilePlansPanel;
    private javax.swing.JTable mobilePlansTable;
    private javax.swing.JTextField monthlyFeeInput;
    private javax.swing.JLabel monthlyFeeLabel;
    private javax.swing.JButton submitCreateMobilePlan;
    private javax.swing.JPanel subscriptionsPanel;
    private javax.swing.JTabbedPane tabbedPanel;
    // End of variables declaration//GEN-END:variables
}
