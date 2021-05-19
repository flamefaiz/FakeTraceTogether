package com.boundary;


import com.boundary.BusinessLoginUI;


public class LandingPage extends javax.swing.JFrame {

    public LandingPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        landinePagePanel = new javax.swing.JPanel();
        loginPanel = new javax.swing.JPanel();
        publicUser = new javax.swing.JButton();
        bizOwner = new javax.swing.JButton();
        HealthStaff = new javax.swing.JButton();
        organisation = new javax.swing.JButton();
        fttMainTextLabel = new javax.swing.JLabel();
        selectLoginLabel = new javax.swing.JLabel();
        logoPanel = new javax.swing.JPanel();
        logoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("frame"); // NOI18N
        setPreferredSize(new java.awt.Dimension(715, 290));

        landinePagePanel.setPreferredSize(new java.awt.Dimension(600, 300));

        publicUser.setText("Public User\n");
        publicUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                publicUserActionPerformed(evt);
            }
        });

        bizOwner.setText("Business Owner");
        bizOwner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bizOwnerActionPerformed(evt);
            }
        });

        HealthStaff.setText("Health Staff");
        HealthStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HealthStaffActionPerformed(evt);
            }
        });

        organisation.setText("Organisation");
        organisation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organisationActionPerformed(evt);
            }
        });

        fttMainTextLabel.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        fttMainTextLabel.setText("FakeTraceTogether");

        selectLoginLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        selectLoginLabel.setText("Select Login");

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(publicUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bizOwner)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HealthStaff)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(organisation)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                        .addComponent(fttMainTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                        .addComponent(selectLoginLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(157, 157, 157))))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(fttMainTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(selectLoginLabel)
                .addGap(18, 18, 18)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(publicUser)
                    .addComponent(bizOwner)
                    .addComponent(HealthStaff)
                    .addComponent(organisation))
                .addGap(72, 72, 72))
        );

        logoPanel.setPreferredSize(new java.awt.Dimension(260, 258));

        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fakeTT.jpg"))); // NOI18N

        javax.swing.GroupLayout logoPanelLayout = new javax.swing.GroupLayout(logoPanel);
        logoPanel.setLayout(logoPanelLayout);
        logoPanelLayout.setHorizontalGroup(
            logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        logoPanelLayout.setVerticalGroup(
            logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout landinePagePanelLayout = new javax.swing.GroupLayout(landinePagePanel);
        landinePagePanel.setLayout(landinePagePanelLayout);
        landinePagePanelLayout.setHorizontalGroup(
            landinePagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(landinePagePanelLayout.createSequentialGroup()
                .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE))
        );
        landinePagePanelLayout.setVerticalGroup(
            landinePagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(logoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(landinePagePanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void publicUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_publicUserActionPerformed
        if(evt.getSource() == publicUser )
        {
            PublicLoginUI pu = new PublicLoginUI();
            pu.setVisible(true);
            pu.pack();
            pu.setLocationRelativeTo(null);
            this.dispose();
            
        }
    }//GEN-LAST:event_publicUserActionPerformed

    private void bizOwnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bizOwnerActionPerformed
        if (evt.getSource() == bizOwner)
        {
            BusinessLoginUI biz = new BusinessLoginUI();
            biz.setVisible(true);
            biz.pack();
            biz.setLocationRelativeTo(null);
            this.dispose();
            
        }
    }//GEN-LAST:event_bizOwnerActionPerformed

    private void HealthStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HealthStaffActionPerformed
        if (evt.getSource() == HealthStaff)
        {
            HealthStaffLoginUI hs = new HealthStaffLoginUI();
            hs.setVisible(true);
            hs.pack();
            hs.setLocationRelativeTo(null);
            this.dispose();
            
        }
    }//GEN-LAST:event_HealthStaffActionPerformed

    private void organisationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organisationActionPerformed
        if (evt.getSource() == organisation)
        {
            OrganisationLoginUI org = new OrganisationLoginUI();
            org.setVisible(true);
            org.pack();
            org.setLocationRelativeTo(null);
            this.dispose();
            
        }
    }//GEN-LAST:event_organisationActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HealthStaff;
    private javax.swing.JButton bizOwner;
    private javax.swing.JLabel fttMainTextLabel;
    private javax.swing.JPanel landinePagePanel;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JPanel logoPanel;
    private javax.swing.JButton organisation;
    private javax.swing.JButton publicUser;
    private javax.swing.JLabel selectLoginLabel;
    // End of variables declaration//GEN-END:variables
}
