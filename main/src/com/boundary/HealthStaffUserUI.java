/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.boundary;

import com.boundary.*;
import com.controller.*;

//import healthstaff.NewsAlertController;
import java.awt.Color;
import java.awt.Font;

public class HealthStaffUserUI extends javax.swing.JFrame {

    String username;
    String news;
    UpdateCovidNewsUI updateCovidNewsUI;
    NewsAlertController newsAlertController;

    public HealthStaffUserUI(String username) {
        this.username = username;
        initComponents();
        showNewsTextArea();
    }

    private void showNewsTextArea() {
        newsAlertController = new NewsAlertController(username);
        news = newsAlertController.getNews();
        newsTextArea.append(news);
        newsTextArea.setFont(new Font("Calibri", Font.ITALIC, 12));
        newsTextArea.setLineWrap(true);
        newsTextArea.setOpaque(false);
        newsTextArea.setEditable(false);
        newsTextArea.setColumns(100);
        newsTextArea.setForeground(Color.WHITE);
        loginPanel.add(newsTextArea);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        landinePagePanel = new javax.swing.JPanel();
        loginPanel = new javax.swing.JPanel();
        updateCovidNewsButton = new javax.swing.JButton();
        updateVaccStatusButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        sendVaccReminderButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        newsTextArea = new javax.swing.JTextArea();
        updateCovidResultButton = new javax.swing.JButton();
        logoPanel = new javax.swing.JPanel();
        logoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setName("frame"); // NOI18N

        landinePagePanel.setPreferredSize(new java.awt.Dimension(600, 300));

        updateCovidNewsButton.setText("Update Covid News");
        updateCovidNewsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateCovidNewsButtonActionPerformed(evt);
            }
        });

        updateVaccStatusButton.setText("Update Vaccination Status");
        updateVaccStatusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateVaccStatusButtonActionPerformed(evt);
            }
        });

        refreshButton.setText("Refresh News");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        sendVaccReminderButton.setText("Send Vaccination Reminder");
        sendVaccReminderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendVaccReminderButtonActionPerformed(evt);
            }
        });

        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        newsTextArea.setColumns(20);
        newsTextArea.setRows(5);
        jScrollPane1.setViewportView(newsTextArea);

        updateCovidResultButton.setText("Update Covid Result for NRIC");
        updateCovidResultButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateCovidResultButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(updateVaccStatusButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(updateCovidNewsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(sendVaccReminderButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logoutButton, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                                .addComponent(updateCovidResultButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(refreshButton)))))
                .addContainerGap())
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(refreshButton))
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(updateCovidNewsButton)
                            .addComponent(updateCovidResultButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(updateVaccStatusButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logoutButton)
                            .addComponent(sendVaccReminderButton))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        logoPanel.setPreferredSize(new java.awt.Dimension(260, 258));

        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fakeTT.jpg"))); // NOI18N

        javax.swing.GroupLayout logoPanelLayout = new javax.swing.GroupLayout(logoPanel);
        logoPanel.setLayout(logoPanelLayout);
        logoPanelLayout.setHorizontalGroup(
            logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        logoPanelLayout.setVerticalGroup(
            logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoPanelLayout.createSequentialGroup()
                .addComponent(logoLabel)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout landinePagePanelLayout = new javax.swing.GroupLayout(landinePagePanel);
        landinePagePanel.setLayout(landinePagePanelLayout);
        landinePagePanelLayout.setHorizontalGroup(
            landinePagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(landinePagePanelLayout.createSequentialGroup()
                .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE))
        );
        landinePagePanelLayout.setVerticalGroup(
            landinePagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(landinePagePanelLayout.createSequentialGroup()
                .addGroup(landinePagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(loginPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logoPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(landinePagePanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateCovidNewsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateCovidNewsButtonActionPerformed
        if (evt.getSource() == updateCovidNewsButton) {
            UpdateCovidNewsUI uCN = new UpdateCovidNewsUI(username);
            uCN.setVisible(true);
            uCN.pack();
            uCN.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_updateCovidNewsButtonActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        if (evt.getSource() == refreshButton) {
            news = newsAlertController.getNews();
            newsTextArea.setText("");
            newsTextArea.append(news);
            newsTextArea.setFont(new Font("Calibri", Font.ITALIC, 12));
            newsTextArea.setLineWrap(true);
            newsTextArea.setOpaque(false);
            newsTextArea.setEditable(false);
            newsTextArea.setColumns(100);
            newsTextArea.setForeground(Color.WHITE);
            loginPanel.add(newsTextArea);
        }
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        if (evt.getSource() == logoutButton) {
            LandingPage lp = new LandingPage();
            lp.setVisible(true);
            lp.pack();
            lp.setLocationRelativeTo(null);
            this.dispose();
        }
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void updateVaccStatusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateVaccStatusButtonActionPerformed
        if (evt.getSource() == updateVaccStatusButton) {
            UpdateVaccStatusUI updateVaccStatusUI = new UpdateVaccStatusUI();
            updateVaccStatusUI.setVisible(true);
            updateVaccStatusUI.pack();
            updateVaccStatusUI.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_updateVaccStatusButtonActionPerformed

    private void sendVaccReminderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendVaccReminderButtonActionPerformed
        if (evt.getSource() == sendVaccReminderButton) {
            UpdateVaccApptUI vaccApptUI = new UpdateVaccApptUI();
            vaccApptUI.setVisible(true);
            vaccApptUI.pack();
            vaccApptUI.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_sendVaccReminderButtonActionPerformed

    private void updateCovidResultButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateCovidResultButtonActionPerformed
        if (evt.getSource() == updateCovidResultButton) {
            UpdateCovidStatusUI covidStatusUI = new UpdateCovidStatusUI();
            covidStatusUI.setVisible(true);
            covidStatusUI.pack();
            covidStatusUI.setLocationRelativeTo(null);

        }
    }//GEN-LAST:event_updateCovidResultButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel landinePagePanel;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JPanel logoPanel;
    private javax.swing.JButton logoutButton;
    private javax.swing.JTextArea newsTextArea;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton sendVaccReminderButton;
    private javax.swing.JButton updateCovidNewsButton;
    private javax.swing.JButton updateCovidResultButton;
    private javax.swing.JButton updateVaccStatusButton;
    // End of variables declaration//GEN-END:variables
}
