
package com.boundary;

import com.controller.*;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class CreateUserUI extends javax.swing.JFrame {

    /**
     * Creates new form searchUserUI
     */
        String acctType ;
        String username;
        ArrayList<String>userData;
        JLabel NRIC;
        JTextField NRICTextField;
        JLabel pword;
        JTextField pwordField;
        JLabel firstname;
        JTextField firstnamefield;
        JLabel lastname;
        JTextField lastnamefield;
        JLabel gender;
        JTextField genderfield;
        JLabel dob;
        JTextField dobfield;
        JLabel Emailz;
        JTextField emailField;
        JLabel bizNumber;
        JTextField bizNumberField;
        JLabel location;
        JTextField locationField;
        JLabel number;
        JTextField numberField;
        
        
    public CreateUserUI() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        acct_type = new javax.swing.JLabel();
        accountTypeBox = new javax.swing.JComboBox<>();
        ChooseAccTypeButton = new javax.swing.JButton();
        jPanel = new javax.swing.JPanel();
        Submit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        acct_type.setText("Account Type :");

        accountTypeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Public", "Business", "Health Staff" }));

        ChooseAccTypeButton.setText("Confirm Selection");
        ChooseAccTypeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChooseAccTypeButtonActionPerformed(evt);
            }
        });

        Submit.setText("Submit");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(Submit)
                .addContainerGap(111, Short.MAX_VALUE))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                .addContainerGap(187, Short.MAX_VALUE)
                .addComponent(Submit)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(acct_type)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(accountTypeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(ChooseAccTypeButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(acct_type)
                    .addComponent(accountTypeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ChooseAccTypeButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ChooseAccTypeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChooseAccTypeButtonActionPerformed
        // TODO add your handling code here:
        
        if(evt.getSource() == ChooseAccTypeButton )
        {
            acctType = String.valueOf(accountTypeBox.getSelectedItem());

            if(acctType.equals("Public"))
            {
                NRIC = new JLabel("Public NRIC: ");
                NRIC.setBounds(10,20,80,25);
                NRIC.setForeground(Color.WHITE);
                
                //NRIC text Field
                NRICTextField = new JTextField(30);
                NRICTextField.setBounds(100,20,180,25);
    
                //Password
                pword = new JLabel("Password : ");
                pword.setBounds(10,40,80,25);
                pword.setForeground(Color.WHITE);
        
                //Password textField
                pwordField = new JTextField(30);
                pwordField.setBounds(100,40,180,25);
    
                //firstname
                firstname = new JLabel("First Name : ");
                firstname.setBounds(10,60,80,25);
                firstname.setForeground(Color.WHITE);

                ///irstname textField
                firstnamefield = new JTextField(30);
                firstnamefield.setBounds(100,60,180,25);
 
                //lastname
                lastname = new JLabel("Last Name : ");
                lastname.setBounds(10,80,80,25);
                lastname.setForeground(Color.WHITE);

                //lastname textField
                lastnamefield = new JTextField(30);
                lastnamefield.setBounds(100,80,180,25);

                //Gender
                gender = new JLabel("Gender : ");
                gender.setBounds(10,100,80,25);
                gender.setForeground(Color.WHITE);

                //User Number textField
                genderfield = new JTextField(30);
                genderfield.setBounds(100,100,180,25);
                
                //User Number
                dob = new JLabel("Number : ");
                dob.setBounds(10,120,80,25);
                dob.setForeground(Color.WHITE);

                //User Number textField
                dobfield = new JTextField(30);
                dobfield.setBounds(100,120,180,25);
                

                //email
                Emailz = new JLabel("Email : ");
                Emailz.setBounds(10,140,80,25);
                Emailz.setForeground(Color.WHITE);

                //email textField
                emailField = new JTextField(30);
                emailField.setBounds(100,140,180,25);
                
                
                NRIC.setVisible(true);
                NRICTextField.setVisible(true);
                pword.setVisible(true);
                pwordField.setVisible(true);
                firstname.setVisible(true);
                firstnamefield.setVisible(true);
                lastname.setVisible(true);
                lastnamefield.setVisible(true);
                gender.setVisible(true);
                genderfield.setVisible(true);
                dob.setVisible(true);
                dobfield.setVisible(true);
                Emailz.setVisible(true);
                emailField.setVisible(true);
                Submit.setVisible(true);
                jPanel.revalidate();
                jPanel.repaint();
                
                jPanel.add(NRIC);
                jPanel.add(NRICTextField);
                jPanel.add(pword);
                jPanel.add(pwordField);
                jPanel.add(firstname);
                jPanel.add(firstnamefield);
                jPanel.add(lastname);
                jPanel.add(lastnamefield);
                jPanel.add(gender);
                jPanel.add(genderfield);
                jPanel.add(dob);
                jPanel.add(dobfield);
                jPanel.add(Emailz);
                jPanel.add(emailField);
                jPanel.add(Submit);
            }
            if(acctType.equals("Business"))
            {
                NRIC = new JLabel("Business Owner NRIC: ");
                NRIC.setBounds(10,20,80,25);
                NRIC.setForeground(Color.WHITE);
                
                //NRIC text Field
                NRICTextField = new JTextField(30);
                NRICTextField.setBounds(100,20,180,25);
    
                //Password
                pword = new JLabel("Password : ");
                pword.setBounds(10,40,80,25);
                pword.setForeground(Color.WHITE);
        
                //Password textField
                pwordField = new JTextField(30);
                pwordField.setBounds(100,40,180,25);
    
                //firstname
                firstname = new JLabel("Business Name : ");
                firstname.setBounds(10,60,80,25);
                firstname.setForeground(Color.WHITE);

                ///irstname textField
                firstnamefield = new JTextField(30);
                firstnamefield.setBounds(100,60,180,25);
                
                //business number
                bizNumber = new JLabel("Business Number : ");
                bizNumber.setBounds(10,80,80,25);
                bizNumber.setForeground(Color.WHITE);

                //business Number textField
                bizNumberField = new JTextField(30);
                bizNumberField.setBounds(100,80,180,25);
                
                //email
                Emailz = new JLabel("Business Email : ");
                Emailz.setBounds(10,100,80,25);
                Emailz.setForeground(Color.WHITE);

                //email textField
                emailField = new JTextField(30);
                emailField.setBounds(100,100,180,25);
                
                location = new JLabel("Location : ");
                location.setBounds(10,120,80,25);
                location.setForeground(Color.WHITE);

                //email textField
                locationField = new JTextField(30);
                locationField.setBounds(100,120,180,25);
                
                NRIC.setVisible(true);
                NRICTextField.setVisible(true);
                pword.setVisible(true);
                pwordField.setVisible(true);
                firstname.setVisible(true);
                firstnamefield.setVisible(true);
                bizNumber.setVisible(true);
                bizNumberField.setVisible(true);
                Emailz.setVisible(true);
                emailField.setVisible(true);
                location.setVisible(true);
                locationField.setVisible(true);
                Submit.setVisible(true);
                jPanel.revalidate();
                jPanel.repaint();
                
                jPanel.add(NRIC);
                jPanel.add(NRICTextField);
                jPanel.add(pword);
                jPanel.add(pwordField);
                jPanel.add(firstname);
                jPanel.add(firstnamefield);
                jPanel.add(bizNumber);
                jPanel.add(bizNumberField);
                jPanel.add(Emailz);
                jPanel.add(emailField);
                jPanel.add(location);
                jPanel.add(locationField);
                
            }
            if(acctType.equals("Health Staff"))
            {
                NRIC = new JLabel("Staff Username: ");
                NRIC.setBounds(10,20,80,25);
                NRIC.setForeground(Color.WHITE);
                
                //NRIC text Field
                NRICTextField = new JTextField(30);
                NRICTextField.setBounds(100,20,180,25);
    
                //Password
                pword = new JLabel("Staff Password : ");
                pword.setBounds(10,40,80,25);
                pword.setForeground(Color.WHITE);
        
                //Password textField
                pwordField = new JTextField(30);
                pwordField.setBounds(100,40,180,25);
    
                //firstname
                firstname = new JLabel("Staff First Name : ");
                firstname.setBounds(10,60,80,25);
                firstname.setForeground(Color.WHITE);

                ///irstname textField
                firstnamefield = new JTextField(30);
                firstnamefield.setBounds(100,60,180,25);
 
                //lastname
                lastname = new JLabel("Staff Last Name : ");
                lastname.setBounds(10,80,80,25);
                lastname.setForeground(Color.WHITE);

                //lastname textField
                lastnamefield = new JTextField(30);
                lastnamefield.setBounds(100,80,180,25);
                
                //number
                number = new JLabel("Staff Number : ");
                number.setBounds(10,100,80,25);
                number.setForeground(Color.WHITE);
                
                //number field
                numberField = new JTextField(30);
                numberField.setBounds(100,100,180,25);
                
                //email
                Emailz = new JLabel("Staff Email : ");
                Emailz.setBounds(10,120,80,25);
                Emailz.setForeground(Color.WHITE);

                //email textField
                emailField = new JTextField(30);
                emailField.setBounds(100,120,180,25);
                
                NRIC.setVisible(true);
                NRICTextField.setVisible(true);
                pword.setVisible(true);
                pwordField.setVisible(true);
                firstname.setVisible(true);
                firstnamefield.setVisible(true);
                lastname.setVisible(true);
                lastnamefield.setVisible(true);
                number.setVisible(true);
                numberField.setVisible(true);
                Emailz.setVisible(true);
                emailField.setVisible(true);
                Submit.setVisible(true);
                jPanel.revalidate();
                jPanel.repaint();
                
                jPanel.add(NRIC);
                jPanel.add(NRICTextField);
                jPanel.add(pword);
                jPanel.add(pwordField);
                jPanel.add(firstname);
                jPanel.add(firstnamefield);
                jPanel.add(lastname);
                jPanel.add(lastnamefield);
                jPanel.add(number);
                jPanel.add(numberField);
                jPanel.add(Emailz);
                jPanel.add(emailField);
                
                
            
            }
        }
    }//GEN-LAST:event_ChooseAccTypeButtonActionPerformed

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        // TODO add your handling code here:
        if(acctType.equals("Public"))
        {
            String username = NRICTextField.getText();
            String password = pwordField.getText();
            String fname = firstnamefield.getText();
            String lname = lastnamefield.getText();
            String gender = genderfield.getText();
            String dob = dobfield.getText();
            String email = emailField.getText();
        
            ArrayList userDetails = new ArrayList<String>();
            userDetails.add(username);
            userDetails.add(password);
            userDetails.add(fname);
            userDetails.add(lname);
            userDetails.add(gender);
            userDetails.add(dob);
            userDetails.add(email);
       
            CreateUserController cuC = new CreateUserController();
            boolean result = cuC.createUser("Public", userDetails);
            if(result == true)
            {
                JOptionPane.showMessageDialog(Submit, "Created Account Succesfully");
            }
            else
            {
                JOptionPane.showMessageDialog(Submit, "Failed to create account", "Error",
                             JOptionPane.ERROR_MESSAGE);
            }
        }
        if(acctType.equals("Business"))
        {
            String biz_Username = NRICTextField.getText();
            String biz_Password = pwordField.getText();
            String biz_Name = firstnamefield.getText();;
            String biz_Number = bizNumberField.getText();
            String biz_Email = emailField.getText();
            String biz_location = locationField.getText();
            
            ArrayList userDetails = new ArrayList<String>();
            userDetails.add(biz_Username);
            userDetails.add(biz_Password);
            userDetails.add(biz_Name);
            userDetails.add(biz_Number);
            userDetails.add(biz_Email);
            userDetails.add(biz_location);
       
            CreateUserController cuC = new CreateUserController();
            boolean result = cuC.createUser("Business", userDetails);
            if(result == true)
            {
                JOptionPane.showMessageDialog(Submit, "Created Account Succesfully");
            }
            else
            {
                JOptionPane.showMessageDialog(Submit, "Failed to create account", "Error",
                             JOptionPane.ERROR_MESSAGE);
            }
            
        }
        if(acctType.equals("Health Staff"))
        {
            String staff_Username = NRICTextField.getText();
            String staff_Password = pwordField.getText();
            String staff_fname = firstnamefield.getText();;
            String staff_lname = lastnamefield.getText();
            String staff_number = numberField.getText();
            String staff_email = emailField.getText();
            
            ArrayList userDetails = new ArrayList<String>();
            userDetails.add(staff_Username);
            userDetails.add(staff_Password);
            userDetails.add(staff_fname);
            userDetails.add(staff_lname);
            userDetails.add(staff_number);
            userDetails.add(staff_email);
            
            CreateUserController cuC = new CreateUserController();
            boolean result = cuC.createUser("Health Staff", userDetails);
            if(result == true)
            {
                JOptionPane.showMessageDialog(Submit, "Created Account Succesfully");
            }
            else
            {
                JOptionPane.showMessageDialog(Submit, "Failed to create account", "Error",
                             JOptionPane.ERROR_MESSAGE);
            }
            
        }
        
        
    }//GEN-LAST:event_SubmitActionPerformed

    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ChooseAccTypeButton;
    private javax.swing.JButton Submit;
    private javax.swing.JComboBox<String> accountTypeBox;
    private javax.swing.JLabel acct_type;
    private javax.swing.JPanel jPanel;
    // End of variables declaration//GEN-END:variables
}
