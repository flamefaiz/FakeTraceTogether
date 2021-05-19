
package com.boundary;

import com.controller.*;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class DeleteUserUI extends javax.swing.JFrame {

    /**
     * Creates new form searchUserUI
     */
    public DeleteUserUI() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        acct_type = new javax.swing.JLabel();
        accountTypeBox = new javax.swing.JComboBox<>();
        acct_username = new javax.swing.JLabel();
        usernameTxtField = new javax.swing.JTextField();
        deleteUserButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        acct_type.setText("Account Type :");

        accountTypeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Public", "Business", "Health Staff" }));

        acct_username.setText("Account Username :");

        deleteUserButton.setText("Delete User");
        deleteUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteUserButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(acct_type)
                            .addComponent(acct_username))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(accountTypeBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(usernameTxtField)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(deleteUserButton)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(acct_type)
                    .addComponent(accountTypeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(acct_username)
                    .addComponent(usernameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(deleteUserButton)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteUserButtonActionPerformed
        // TODO add your handling code here:
        String acctType ;
        String username;
        JTextArea accountData;
        JFrame report = new JFrame();
        
        report.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // to exit out of the current window
        report.setTitle("Delete User Account"); // set title of the frame
        report.setResizable(true); //prevent the window from being resized
        report.setSize(450, 200); // set the X and Y dimension of the window
        report.setLayout(new FlowLayout(FlowLayout.CENTER));  // set the lay out to FlowLayout
        report.setLocationRelativeTo(null);
        
        if(evt.getSource() == deleteUserButton )
        {
            acctType = String.valueOf(accountTypeBox.getSelectedItem());
            username = usernameTxtField.getText();
            boolean result = false;
            
            DeleteUserController duc = new DeleteUserController(acctType,username);
            result = duc.searchUser();
            if(result == true)
            {
                result = duc.deleteUser();
                
                if(result == true)
                {
                   JOptionPane.showMessageDialog(deleteUserButton, "User Succesfully deleted");
                }
                else
                {
                    JOptionPane.showMessageDialog(deleteUserButton, "Failed to delete user account", "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
            else
            {
                JOptionPane.showMessageDialog(deleteUserButton, "User Account Not Found!", "Error",
                                JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_deleteUserButtonActionPerformed

    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> accountTypeBox;
    private javax.swing.JLabel acct_type;
    private javax.swing.JLabel acct_username;
    private javax.swing.JButton deleteUserButton;
    private javax.swing.JTextField usernameTxtField;
    // End of variables declaration//GEN-END:variables
}
