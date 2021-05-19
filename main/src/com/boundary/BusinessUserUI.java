/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.boundary;

import com.controller.BusinessCheckInHistoryController;
import com.controller.CovidAlertController;
import com.controller.NewsAlertController;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.BoxLayout;
import javax.swing.JScrollPane;

public class BusinessUserUI extends javax.swing.JFrame {

    String username;
    String LINE = "-------------------------------------------";

    public BusinessUserUI(String username) {
        this.username = username;
        initComponents();
        showNewsTextArea();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        landinePagePanel = new javax.swing.JPanel();
        loginPanel = new javax.swing.JPanel();
        viewCovidAlert = new javax.swing.JButton();
        viewCheckInHistoryButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        newsTextArea = new javax.swing.JTextArea();
        logoPanel = new javax.swing.JPanel();
        logoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setName("frame"); // NOI18N

        landinePagePanel.setPreferredSize(new java.awt.Dimension(600, 300));

        viewCovidAlert.setText("Visited Positive Cases");
        viewCovidAlert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewCovidAlertActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutButton)
                .addGap(144, 144, 144))
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addComponent(viewCheckInHistoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(viewCovidAlert)
                        .addContainerGap())))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewCheckInHistoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewCovidAlert, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
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
                .addComponent(logoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE))
        );
        landinePagePanelLayout.setVerticalGroup(
            landinePagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(landinePagePanelLayout.createSequentialGroup()
                .addGroup(landinePagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(logoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
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

    private void viewCheckInHistoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewCheckInHistoryButtonActionPerformed
        JFrame vistorList = new JFrame();
        JPanel checkInPanel = new JPanel();
        String visitors;

        BoxLayout boxlayout = new BoxLayout(checkInPanel, BoxLayout.Y_AXIS);
        //JTextArea text = new JTextArea(6,25);
        JScrollPane scroll;
        String bizName = "";
        ArrayList<String> vistors = new ArrayList<String>();
        JTextArea visitorsText;

        if (evt.getSource() == viewCheckInHistoryButton) {

            vistorList.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // to close current frame
            vistorList.setTitle("Check in History"); // set title of the frame
            vistorList.setResizable(false); //prevent the window from being resized
            vistorList.setSize(600, 200); // set the X and Y dimension of the window
            checkInPanel.setLayout(boxlayout); // Set the Boxlayout to be Y_AXIS from top to down

            vistorList.setVisible(true);
            vistorList.setLocationRelativeTo(null);

            BusinessCheckInHistoryController businessCheckInHistoryController = new BusinessCheckInHistoryController(username);
            visitors = businessCheckInHistoryController.viewHistory();

            //str = str + str1;
            visitorsText = new JTextArea(visitors, 6, 25);

            //text = new JTextArea(str,6,25);
            visitorsText.setFont(new Font("Serif", Font.ITALIC, 16));
            visitorsText.setLineWrap(true);
            visitorsText.setWrapStyleWord(true);
            visitorsText.setOpaque(false);
            visitorsText.setEditable(false);

            scroll = new JScrollPane(visitorsText);
            scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
            vistorList.add(scroll);
            vistorList.pack();
            vistorList.setVisible(true);

        }

    }//GEN-LAST:event_viewCheckInHistoryButtonActionPerformed

    private void viewCovidAlertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewCovidAlertActionPerformed

        JFrame casesList = new JFrame();
        JTextArea casesText;
        JScrollPane scroll;
        String cases;

        if (evt.getSource() == viewCovidAlert) {
            casesList.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // to close current frame
            casesList.setTitle("Users Tested Posititve for Covid-19"); // set title of the frame
            casesList.setResizable(false); //prevent the window from being resized
            casesList.setSize(600, 200); // set the X and Y dimension of the window

            casesList.setVisible(true);
            casesList.setLocationRelativeTo(null);

            //call controller
            CovidAlertController cac = new CovidAlertController(username);
            //get the alerts from controller
            cases = cac.viewCovidAlert();

            casesText = new JTextArea(cases, 6, 25);

            casesText.setFont(new Font("Serif", Font.ITALIC, 16));
            casesText.setLineWrap(true);
            casesText.setWrapStyleWord(true);
            casesText.setOpaque(false);
            casesText.setEditable(false);

            scroll = new JScrollPane(casesText);
            scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
            casesList.add(scroll);
            casesList.pack();
            casesList.setVisible(true);

        }


    }//GEN-LAST:event_viewCovidAlertActionPerformed

    private void showNewsTextArea() {
        NewsAlertController nAC = new NewsAlertController(username);
        String news = nAC.getNews();
        newsTextArea.append(news);
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel landinePagePanel;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JPanel logoPanel;
    private javax.swing.JButton logoutButton;
    private javax.swing.JTextArea newsTextArea;
    private javax.swing.JButton viewCheckInHistoryButton;
    private javax.swing.JButton viewCovidAlert;
    // End of variables declaration//GEN-END:variables
}
