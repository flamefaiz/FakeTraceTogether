package com.boundary;

import com.controller.CheckInController;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PublicUserCheckInUI extends javax.swing.JFrame {

    String username;
    CheckInController checkInController;

    public PublicUserCheckInUI(String username) {
        checkInController = new CheckInController();
        this.username = username;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        checkInToBizLabel = new javax.swing.JLabel();
        bizLabel = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        businessList = new javax.swing.JComboBox<String>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        checkInToBizLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        checkInToBizLabel.setText("Check In to Business");

        bizLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        bizLabel.setText("Business:");

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        businessList.setModel(new javax.swing.DefaultComboBoxModel(getBusinesses()));
        businessList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                businessListActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(bizLabel)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(submitButton)
                                .addGap(30, 30, 30)
                                .addComponent(backButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(businessList, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(checkInToBizLabel)))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(checkInToBizLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bizLabel)
                    .addComponent(businessList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitButton)
                    .addComponent(backButton))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public String[] getBusinesses() {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/login",
                    "root", "");
            PreparedStatement st = connection
                    .prepareStatement("SELECT business_name from biz_login");

            ResultSet rs1 = st.executeQuery();

            ArrayList<String> listOfBiz = new ArrayList<>();

            while (rs1.next()) {
                listOfBiz.add(rs1.getString(1));
            };

            String[] toArray = listOfBiz.toArray(new String[listOfBiz.size()]);

            return toArray;

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();

        }
        return new String[1];
    }


    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        if (evt.getSource() == submitButton) {
            boolean result = false;
            String businessToCheckInto = (String) businessList.getSelectedItem();
            result = checkInController.checkIn(username, businessToCheckInto);
            if(result = true)
            {
                JOptionPane.showMessageDialog(null, "You have successfully checked in");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Failed to check in ", "Update Failed",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void businessListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_businessListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_businessListActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel bizLabel;
    private javax.swing.JComboBox<String> businessList;
    private javax.swing.JLabel checkInToBizLabel;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
