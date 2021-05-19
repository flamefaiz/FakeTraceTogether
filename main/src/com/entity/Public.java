/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entity;

import com.controller.ViewVaccCertController;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;

public class Public {
String LINE = "-------------------------------------------";
String cert;

    public boolean updateCheckInStatus(String username, String business_name) {
        boolean result = false;
        try {

            Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/login",
                    "root", "");

            PreparedStatement st = connection
                    .prepareStatement("INSERT INTO check_in_history(username, business_name) VALUES (?, ?)");

            st.setString(1, username);
            st.setString(2, business_name);
            int j = st.executeUpdate();

            if (j == 1) {
                result = true;
            } 
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();

        }
        return result;
    }
    
    public String viewHistory(String username)
    {
              String str = "";
      
    try {

            Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/login",
                    "root", "");

           PreparedStatement st = (PreparedStatement) connection
                    .prepareStatement("SELECT username,datetime,business_name FROM check_in_history WHERE username =?");

            st.setString(1, username);
            ResultSet rs = st.executeQuery();

            while (rs.next() == true) {
                
                String datetime = rs.getString(2);
                String business_name = rs.getString(3);

                String str1 = 
                                    LINE + "\n" +
                                    "Username: "+ username+ "\n" +
                                    "Date and Time: " + datetime + "\n" +
                                    "Location: " + business_name + "\n" +
                                    LINE + "\n"

                           ;
                str = str + str1;
        } 
    }
        catch (SQLException sqlException) {
            sqlException.printStackTrace();

        }return str;    
    

    } 
    
    public String getStatus(String username) {
        String result = "";
        try {
            Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/login",
                    "root", "");

            PreparedStatement st = (PreparedStatement) connection
                    .prepareStatement("SELECT covid_status FROM public_login WHERE username =?");

            st.setString(1, username);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                result = rs.getNString(1);
                return result;
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return result;
    }

    public String getCert(String username){
        String result = "";
        try {
            Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/login",
                "root", "");

            PreparedStatement st = (PreparedStatement) connection
                .prepareStatement("SELECT username,password,firstname,lastname,email,vaccinated,vaccine_type,cert_number FROM public_login WHERE username =?");

            st.setString(1, username);
            ResultSet rs = st.executeQuery();
            ViewVaccCertController vVC = new ViewVaccCertController(username);
            if (rs.next()) {  
                String firstname = rs.getString(3);
                String lastname = rs.getString(4);
                String email = rs.getString(5);
                String vaccinated = rs.getString(6);
                String vctype = rs.getString(7);
                String certnum = rs.getString(8);

                             cert = LINE + "\n" +
                                    "VACCINATION CERTIFICATION REPORT\n" +
                                    LINE + "\n" +
                                    "Name: " + firstname + " " + lastname + "\n" +
                                    "Email address: " + email + "\n" +
                                    "Vaccination Status: " + vaccinated + "\n" +
                                    "Vaccine Received: " + vctype + "\n" +
                                    "certificate Number: " + certnum + "\n" +
                                    LINE;
               }
            } catch (SQLException sqlException) {
                sqlException.printStackTrace();
            }
        return cert;
    }
    
}
