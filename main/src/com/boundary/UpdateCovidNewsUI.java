package com.boundary;

import com.controller.UpdateCovidNewsController;
import javax.swing.JOptionPane;

public class UpdateCovidNewsUI extends javax.swing.JFrame {

    HealthStaffUserUI healthStaffUserUI;
    String username;

    public UpdateCovidNewsUI(String username) {
        this.username = username;
        initComponents();
    }

    public UpdateCovidNewsUI(HealthStaffUserUI healthStaffUserUI) {
        this.healthStaffUserUI = new HealthStaffUserUI(username);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        updateCovidNewsLabel = new javax.swing.JLabel();
        newsLabel = new javax.swing.JLabel();
        newsTextField = new javax.swing.JTextField();
        updateNewsButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        updateCovidNewsLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        updateCovidNewsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        updateCovidNewsLabel.setText("Update Covid News");

        newsLabel.setText("News:");

        updateNewsButton.setText("Update News");
        updateNewsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateNewsButtonActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(updateCovidNewsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150))
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(newsLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(updateNewsButton)
                        .addGap(106, 106, 106)
                        .addComponent(backButton))
                    .addComponent(newsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(updateCovidNewsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateNewsButton)
                    .addComponent(backButton))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        if (evt.getSource() == backButton) {
//            hs.setVisible(true);
//            hs.pack();
//            hs.setLocationRelativeTo(null);
            this.dispose();

        }
    }//GEN-LAST:event_backButtonActionPerformed

    private void updateNewsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateNewsButtonActionPerformed
        if (evt.getSource() == updateNewsButton) {
            boolean result = false;
            String news = newsTextField.getText();
            UpdateCovidNewsController updateCovidNewsController = new UpdateCovidNewsController();
            result = updateCovidNewsController.updateNewsInEntity(news);
            if(result = true)
            {
                JOptionPane.showMessageDialog(null, "You have successfully updated the Covid news");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Failed to update Covid news", "Update Failed",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_updateNewsButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel newsLabel;
    private javax.swing.JTextField newsTextField;
    private javax.swing.JLabel updateCovidNewsLabel;
    private javax.swing.JButton updateNewsButton;
    // End of variables declaration//GEN-END:variables
}
