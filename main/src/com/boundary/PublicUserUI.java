/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.boundary;

import com.controller.ViewVaccCertController;
import com.controller.ViewStatusController;
import com.controller.CheckInController;
import com.controller.CheckInHistoryController;
import com.controller.NewsAlertController;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.BoxLayout;
import javax.swing.JScrollPane;

public class PublicUserUI extends javax.swing.JFrame {

    String username;
    String LINE = "-------------------------------------------";

    public PublicUserUI(String username) {
        this.username = username;
        initComponents();
        showNewsTextArea();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        landinePagePanel = new javax.swing.JPanel();
        loginPanel = new javax.swing.JPanel();
        viewCovidStatusButton = new javax.swing.JButton();
        viewVaccCertButton = new javax.swing.JButton();
        checkInButton = new javax.swing.JButton();
        viewCheckInHistoryButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        newsTextArea = new javax.swing.JTextArea();
        logoPanel = new javax.swing.JPanel();
        logoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setName("frame"); // NOI18N
        setPreferredSize(new java.awt.Dimension(715, 290));

        landinePagePanel.setPreferredSize(new java.awt.Dimension(600, 300));

        viewCovidStatusButton.setText("View COVID 19 Status");
        viewCovidStatusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewCovidStatusButtonActionPerformed(evt);
            }
        });

        viewVaccCertButton.setText("View Vaccination Certificate");
        viewVaccCertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewVaccCertButtonActionPerformed(evt);
            }
        });

        checkInButton.setText("Check In");
        checkInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkInButtonActionPerformed(evt);
            }
        });

        viewCheckInHistoryButton.setText("View Check In History");
        viewCheckInHistoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewCheckInHistoryButtonActionPerformed(evt);
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

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(viewCovidStatusButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewVaccCertButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(checkInButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewCheckInHistoryButton, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                .addContainerGap(159, Short.MAX_VALUE)
                .addComponent(logoutButton)
                .addGap(144, 144, 144))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewCovidStatusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewVaccCertButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewCheckInHistoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(logoutButton)
                .addContainerGap(16, Short.MAX_VALUE))
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
            .addComponent(logoLabel)
        );

        javax.swing.GroupLayout landinePagePanelLayout = new javax.swing.GroupLayout(landinePagePanel);
        landinePagePanel.setLayout(landinePagePanelLayout);
        landinePagePanelLayout.setHorizontalGroup(
            landinePagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(landinePagePanelLayout.createSequentialGroup()
                .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE))
        );
        landinePagePanelLayout.setVerticalGroup(
            landinePagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(landinePagePanelLayout.createSequentialGroup()
                .addGroup(landinePagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(logoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                    .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(landinePagePanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        if (evt.getSource() == logoutButton) {
            LandingPage lp = new LandingPage();
            lp.setVisible(true);
            lp.pack();
            lp.setLocationRelativeTo(null);
            this.dispose();
        }
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void viewCovidStatusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewCovidStatusButtonActionPerformed
        JFrame status = new JFrame();
        if (evt.getSource() == viewCovidStatusButton) {
            ViewStatusController pUC = new ViewStatusController(username);
            String result = pUC.getStatus();
            if (result.equals("Positive")) {

                final JPanel panel = new JPanel();
                JTextArea textArea = new JTextArea(
                        LINE + "\n"
                        + "COVID-19 SWAB TEST RESULT\n"
                        + LINE + "\n"
                        + "Dear Patient (" + username.toUpperCase() + ") , your COVID test is "
                        + result.toUpperCase() + "\n"
                        + "A healthcare amateur and your mom will contact you soon" + "\n"
                        + LINE,
                        6,
                        25);
                textArea.setFont(new Font("Serif", Font.ITALIC, 16));
                textArea.setLineWrap(true);
                textArea.setWrapStyleWord(true);
                textArea.setOpaque(false);
                textArea.setEditable(false);

                panel.add(textArea);

                status.add(panel);
                status.pack();
                status.setVisible(true);
                status.setLocationRelativeTo(null);
            } else if (result.equals("Negative")) {
                final JPanel panel = new JPanel();
                JTextArea textArea = new JTextArea(
                        LINE + "\n"
                        + "COVID-19 SWAB TEST RESULT\n"
                        + LINE + "\n"
                        + "Dear Patient (" + username.toUpperCase() + ") , your COVID test is "
                        + result.toUpperCase() + "\n"
                        + "Please observe good personal hygiene and maintain social distancing " + "\n"
                        + LINE,
                        6,
                        25);
                textArea.setFont(new Font("Serif", Font.ITALIC, 16));
                textArea.setLineWrap(true);
                textArea.setWrapStyleWord(true);
                textArea.setOpaque(false);
                textArea.setEditable(false);

                panel.add(textArea);
                status.add(panel);
                status.pack();
                status.setVisible(true);
                status.setLocationRelativeTo(null);

            } else {
                final JPanel panel = new JPanel();
                JTextArea textArea = new JTextArea(
                        LINE + "\n"
                        + "COVID-19 SWAB TEST RESULT\n"
                        + LINE + "\n"
                        + "Dear Patient (" + username.toUpperCase() + ") , your COVID test is still "
                        + result.toUpperCase() + "\n"
                        + "Do not think that you are safe yet." + "\n"
                        + LINE,
                        6,
                        25);
                textArea.setFont(new Font("Serif", Font.ITALIC, 16));
                textArea.setLineWrap(true);
                textArea.setWrapStyleWord(true);
                textArea.setOpaque(false);
                textArea.setEditable(false);

                panel.add(textArea);
                status.add(panel);
                status.pack();
                status.setVisible(true);
                status.setLocationRelativeTo(null);
            }
        }
    }//GEN-LAST:event_viewCovidStatusButtonActionPerformed

    private void viewVaccCertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewVaccCertButtonActionPerformed
        JFrame cert = new JFrame();
        ViewVaccCertController pUC = new ViewVaccCertController(username);
        if (evt.getSource() == viewVaccCertButton) {

            String cert2 = pUC.getCert();
            final JPanel panel = new JPanel();
            JTextArea textArea = new JTextArea(
                    cert2,
                    6,
                    25);
            textArea.setFont(new Font("Serif", Font.ITALIC, 16));
            textArea.setLineWrap(true);
            textArea.setWrapStyleWord(true);
            textArea.setOpaque(false);
            textArea.setEditable(false);

            panel.add(textArea);
            cert.add(panel);
            cert.pack();
            cert.setVisible(true);
            cert.setLocationRelativeTo(null);

        } else {
            JOptionPane.showMessageDialog(viewVaccCertButton, "Error Retrieving Vaccination Data");
        }


    }//GEN-LAST:event_viewVaccCertButtonActionPerformed

    private void checkInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkInButtonActionPerformed
        if (evt.getSource() == checkInButton) {
            PublicUserCheckInUI publicUserCheckInUI = new PublicUserCheckInUI(username);
            publicUserCheckInUI.setVisible(true);
            publicUserCheckInUI.pack();
            publicUserCheckInUI.setLocationRelativeTo(null);

        }
    }//GEN-LAST:event_checkInButtonActionPerformed

    private void viewCheckInHistoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewCheckInHistoryButtonActionPerformed
        if (evt.getSource() == viewCheckInHistoryButton) {
            JFrame history = new JFrame();
            JScrollPane scroll;
            ArrayList<JTextArea> checkin = new ArrayList<JTextArea>();
            JTextArea textArea = new JTextArea(6, 25);
            final JPanel panel = new JPanel();
            BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);

            CheckInHistoryController ciHC = new CheckInHistoryController(username);
            String result = ciHC.viewHistory();

            history.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // to close current frame
            history.setTitle("Check in History"); // set title of the frame
            history.setResizable(true); //prevent the window from being resized
            history.setSize(600, 200); // set the X and Y dimension of the window
            panel.setLayout(boxlayout); // Set the Boxlayout to be Y_AXIS from top to down

            //history.setLayout(new FlowLayout(FlowLayout.CENTER));  // set the lay out to FlowLayout
            //history.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
            history.setVisible(true);
            history.setLocationRelativeTo(null);

            textArea = new JTextArea(result, 6, 25);
            textArea.setFont(new Font("Serif", Font.ITALIC, 16));
            textArea.setLineWrap(true);
            textArea.setWrapStyleWord(true);
            textArea.setOpaque(false);
            textArea.setEditable(false);

            history.add(textArea);

            scroll = new JScrollPane(textArea);
            scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

            history.add(scroll);
            history.pack();
            history.setVisible(true);

            if (result.equals("")) {
                history.setVisible(false);
                history.dispose();
                JOptionPane.showMessageDialog(viewCheckInHistoryButton, "No Check In History Found");
            }
        }


    }//GEN-LAST:event_viewCheckInHistoryButtonActionPerformed

   

    private void showNewsTextArea() {
        NewsAlertController newsAlertController = new NewsAlertController(username);
        String newsAndAppt = newsAlertController.getNews() + newsAlertController.getAppointment();
        newsTextArea.append(newsAndAppt);
        newsTextArea.setFont(new Font("Calibri", Font.ITALIC, 12));
        newsTextArea.setLineWrap(true);
//        newsTextArea.setWrapStyleWord(true);
        newsTextArea.setOpaque(false);
        newsTextArea.setEditable(false);
        newsTextArea.setColumns(100);
//        newsTextArea.setRows(5);
        newsTextArea.setForeground(Color.WHITE);
        loginPanel.add(newsTextArea);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkInButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel landinePagePanel;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JPanel logoPanel;
    private javax.swing.JButton logoutButton;
    private javax.swing.JTextArea newsTextArea;
    private javax.swing.JButton viewCheckInHistoryButton;
    private javax.swing.JButton viewCovidStatusButton;
    private javax.swing.JButton viewVaccCertButton;
    // End of variables declaration//GEN-END:variables
}
