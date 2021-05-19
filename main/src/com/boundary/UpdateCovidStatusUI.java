package com.boundary;

import com.controller.UpdateCovidStatusController;
import javax.swing.JOptionPane;

public class UpdateCovidStatusUI extends javax.swing.JFrame {

    UpdateCovidStatusController updateCovidStatusController;

    public UpdateCovidStatusUI() {
        updateCovidStatusController = new UpdateCovidStatusController();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nricLabel = new javax.swing.JLabel();
        covidStatusLabel = new javax.swing.JLabel();
        nricTextField = new javax.swing.JTextField();
        posNegComboBox = new javax.swing.JComboBox();
        updateButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        updateCovidStatusLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        nricLabel.setText("NRIC:");

        covidStatusLabel.setText(" Covid Status:");

        posNegComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Positive", "Negative" }));
        posNegComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                posNegComboBoxActionPerformed(evt);
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

        updateCovidStatusLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        updateCovidStatusLabel.setText("Update COVID Status");

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
                            .addComponent(covidStatusLabel)
                            .addComponent(nricLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nricTextField)
                            .addComponent(posNegComboBox, 0, 117, Short.MAX_VALUE))
                        .addGap(22, 22, 22)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 113, Short.MAX_VALUE)
                .addComponent(updateCovidStatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(updateCovidStatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nricLabel)
                    .addComponent(nricTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(covidStatusLabel)
                    .addComponent(posNegComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateButton)
                    .addComponent(backButton))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void posNegComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_posNegComboBoxActionPerformed


    }//GEN-LAST:event_posNegComboBoxActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed

        String username = nricTextField.getText();
        String covidStatus = posNegComboBox.getSelectedItem().toString();

        if (evt.getSource() == updateButton) {
            boolean updateResult = updateCovidStatusController.updateCovidStatusInEntity(username, covidStatus);

            if (updateResult = true) {
                JOptionPane.showMessageDialog(null, "You have successfully updated the Covid status of " + username);

            } else {
                JOptionPane.showMessageDialog(null, "Failed to update Covid status");
            }

        }


    }//GEN-LAST:event_updateButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel covidStatusLabel;
    private javax.swing.JLabel nricLabel;
    private javax.swing.JTextField nricTextField;
    private javax.swing.JComboBox posNegComboBox;
    private javax.swing.JButton updateButton;
    private javax.swing.JLabel updateCovidStatusLabel;
    // End of variables declaration//GEN-END:variables
}
