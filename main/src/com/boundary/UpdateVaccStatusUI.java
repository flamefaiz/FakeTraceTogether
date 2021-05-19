package com.boundary;

import com.controller.UpdateVaccStatusController;
import javax.swing.JOptionPane;

public class UpdateVaccStatusUI extends javax.swing.JFrame {

    public UpdateVaccStatusUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nricLabel = new javax.swing.JLabel();
        vaccStatusLabel = new javax.swing.JLabel();
        nricTextField = new javax.swing.JTextField();
        yesNoComboBox = new javax.swing.JComboBox();
        updateButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        updateVaccStatusLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        nricLabel.setText("NRIC:");

        vaccStatusLabel.setText("Vaccinated:");

        yesNoComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Yes", "No" }));
        yesNoComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesNoComboBoxActionPerformed(evt);
            }
        });

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        updateVaccStatusLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        updateVaccStatusLabel.setText("Update COVID Vaccination Status");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(updateButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                        .addComponent(backButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(vaccStatusLabel)
                            .addComponent(nricLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nricTextField)
                            .addComponent(yesNoComboBox, 0, 117, Short.MAX_VALUE))
                        .addGap(22, 22, 22)))
                .addContainerGap(81, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(updateVaccStatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(updateVaccStatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nricLabel)
                    .addComponent(nricTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vaccStatusLabel)
                    .addComponent(yesNoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateButton)
                    .addComponent(backButton))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void yesNoComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesNoComboBoxActionPerformed


    }//GEN-LAST:event_yesNoComboBoxActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed

        String username = nricTextField.getText();
        String vaccStatus = yesNoComboBox.getSelectedItem().toString();

        if (evt.getSource() == updateButton) {
            UpdateVaccStatusController updateVaccStatusController = new UpdateVaccStatusController();
            boolean updateResult = updateVaccStatusController.updateVaccStatusInEntity(username, vaccStatus);

            if (updateResult = true) {
                JOptionPane.showMessageDialog(null, "You have successfully updated the vaccination status of " + username);

            } else {
                JOptionPane.showMessageDialog(null, "Failed to update vaccination status", "Update Failed",
                        JOptionPane.ERROR_MESSAGE);
            }

        }


    }//GEN-LAST:event_updateButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel nricLabel;
    private javax.swing.JTextField nricTextField;
    private javax.swing.JButton updateButton;
    private javax.swing.JLabel updateVaccStatusLabel;
    private javax.swing.JLabel vaccStatusLabel;
    private javax.swing.JComboBox yesNoComboBox;
    // End of variables declaration//GEN-END:variables
}
