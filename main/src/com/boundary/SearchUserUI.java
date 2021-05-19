package com.boundary;

import com.controller.*;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class SearchUserUI extends javax.swing.JFrame {

    /**
     * Creates new form searchUserUI
     */
    public SearchUserUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        acct_type = new javax.swing.JLabel();
        accountTypeBox = new javax.swing.JComboBox<>();
        acct_username = new javax.swing.JLabel();
        usernameTxtField = new javax.swing.JTextField();
        searchUserButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        acct_type.setText("Account Type :");

        accountTypeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Public", "Business", "Health Staff" }));

        acct_username.setText("Account Username :");

        searchUserButton.setText("Search User");
        searchUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchUserButtonActionPerformed(evt);
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
                        .addComponent(searchUserButton)))
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
                .addComponent(searchUserButton)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchUserButtonActionPerformed
        // TODO add your handling code here:
        String acctType;
        String username;
        JTextArea accountData;
        ArrayList<String> userData;
        JFrame report = new JFrame();

        report.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // to exit out of the current window
        report.setTitle("Account Data"); // set title of the frame
        report.setResizable(true); //prevent the window from being resized
        report.setSize(450, 200); // set the X and Y dimension of the window
        report.setLayout(new FlowLayout(FlowLayout.CENTER));  // set the lay out to FlowLayout
        report.setLocationRelativeTo(null);

        if (evt.getSource() == searchUserButton) {
            acctType = String.valueOf(accountTypeBox.getSelectedItem());
            username = usernameTxtField.getText();

            SearchUserController suc = new SearchUserController(acctType, username);
            userData = new ArrayList<String>(suc.getUserDetails());

            if (userData.size() > 1) {
                if (acctType.equals("Public")) {
                    accountData = new JTextArea("Username: " + userData.get(1) + "\n"
                            + "Password: " + userData.get(2) + "\n"
                            + "First Name: " + userData.get(3) + "\n"
                            + "Last Name: " + userData.get(4) + "\n"
                            + "Gender: " + userData.get(5) + "\n"
                            + "DoB: " + userData.get(6) + "\n"
                            + "Vaccinated: " + userData.get(7) + "\n"
                            + "Email: " + userData.get(8) + "\n"
                            + "Covid Status: " + userData.get(9) + "\n"
                            + "Vaccine Type: " + userData.get(10) + "\n"
                            + "Certificate Number: " + userData.get(11) + "\n"
                            + "Appointment Date: " + userData.get(12) + "\n", 6, 25);

                    accountData.setFont(new Font("Serif", Font.ITALIC, 16));
                    accountData.setLineWrap(true);
                    accountData.setWrapStyleWord(true);
                    accountData.setOpaque(false);
                    accountData.setEditable(false);

                    report.add(accountData);
                    report.pack();
                    report.setVisible(true);
                }
                if (acctType.equals("Business")) {
                    accountData = new JTextArea("Username: " + userData.get(1) + "\n"
                            + "Password: " + userData.get(2) + "\n"
                            + "Business Name: " + userData.get(3) + "\n"
                            + "Business Number: " + userData.get(4) + "\n"
                            + "Business Email: " + userData.get(5) + "\n", 6, 25);

                    accountData.setFont(new Font("Serif", Font.ITALIC, 16));
                    accountData.setLineWrap(true);
                    accountData.setWrapStyleWord(true);
                    accountData.setOpaque(false);
                    accountData.setEditable(false);

                    report.add(accountData);
                    report.pack();
                    report.setVisible(true);
                }
                if (acctType.equals("Health Staff")) {
                    accountData = new JTextArea("Username: " + userData.get(1) + "\n"
                            + "Password: " + userData.get(2) + "\n"
                            + "Health Staff First Name: " + userData.get(3) + "\n"
                            + "Health Staff Last Name: " + userData.get(4) + "\n"
                            + "Health Staff Number: " + userData.get(5) + "\n"
                            + "Health Staff Email: " + userData.get(6) + "\n", 6, 25);

                    accountData.setFont(new Font("Serif", Font.ITALIC, 16));
                    accountData.setLineWrap(true);
                    accountData.setWrapStyleWord(true);
                    accountData.setOpaque(false);
                    accountData.setEditable(false);

                    report.add(accountData);
                    report.pack();
                    report.setVisible(true);
                }
            } else {

                JOptionPane.showMessageDialog(null, "Failed to display account details", "Error",
                        JOptionPane.ERROR_MESSAGE);

            }
        }
    }//GEN-LAST:event_searchUserButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> accountTypeBox;
    private javax.swing.JLabel acct_type;
    private javax.swing.JLabel acct_username;
    private javax.swing.JButton searchUserButton;
    private javax.swing.JTextField usernameTxtField;
    // End of variables declaration//GEN-END:variables
}
