/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entity;

import java.util.ArrayList;
import com.controller.*;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JTextArea;

public class Organisation {

    String report;
    String positive, population;
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    Date date = new Date();
    
    String numberreport;
    String vaccinatedAmt,pfizer,mordana; 


    public Organisation() {

    }

    public boolean createUser(String acct_type, ArrayList<String> array) {
        boolean result = false;
        if (acct_type.equals("Public")) {

            try {

                Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/login",
                        "root", "");

                PreparedStatement st = (PreparedStatement) connection
                        .prepareStatement("INSERT INTO public_login VALUES(?,?,?,?,?,?,?,?,?,?,?,?) ");

                st.setString(1, array.get(0));
                st.setString(2, array.get(1));
                st.setString(3, array.get(2));
                st.setString(4, array.get(3));
                st.setString(5, array.get(4));
                st.setString(6, array.get(5));
                st.setString(7, "no");
                st.setString(8, array.get(6));
                st.setString(9, "Negative");
                st.setString(10, "N.A");
                st.setString(11, "N.A");
                st.setString(12, "N.A");

                st.executeUpdate();
                result = true;

            } catch (SQLException sqlException) {
                sqlException.printStackTrace();
            }
        }
        if (acct_type.equals("Business")) {

            try {

                Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/login",
                        "root", "");

                PreparedStatement st = (PreparedStatement) connection
                        .prepareStatement("INSERT INTO biz_login VALUES(?,?,?,?,?,?) ");

                st.setString(1, array.get(0));
                st.setString(2, array.get(1));
                st.setString(3, array.get(2));
                st.setString(4, array.get(3));
                st.setString(5, array.get(4));
                st.setString(6, array.get(5));

                st.executeUpdate();
                result = true;

            } catch (SQLException sqlException) {
                sqlException.printStackTrace();
            }
        }
        if (acct_type.equals("Health Staff")) {
            try {

                Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/login",
                        "root", "");

                PreparedStatement st = (PreparedStatement) connection
                        .prepareStatement("INSERT INTO healthstaff_login VALUES(?,?,?,?,?,?) ");

                st.setString(1, array.get(0));
                st.setString(2, array.get(1));
                st.setString(3, array.get(2));
                st.setString(4, array.get(3));
                st.setString(5, array.get(4));
                st.setString(6, array.get(5));

                st.executeUpdate();
                result = true;

            } catch (SQLException sqlException) {
                sqlException.printStackTrace();
            }
        }

        return result;
    }

    public ArrayList<String> getUser(String acct_type, String username) {
        ArrayList userDetails = new ArrayList<String>();
        if (acct_type.equals("Public")) {

            userDetails.add(" ");

            try {

                Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/login",
                        "root", "");

                PreparedStatement st = (PreparedStatement) connection
                        .prepareStatement("SELECT * FROM public_login WHERE username =?");

                st.setString(1, username);
                ResultSet rs = st.executeQuery();

                if (rs.next()) {
                    for (int i = 1; i <= 12; i++) {
                        userDetails.add(rs.getString(i));

                    }
 
                }


            } catch (SQLException sqlException) {
                sqlException.printStackTrace();
            }
        }
        if (acct_type.equals("Business")) {
            userDetails.add(" ");

            try {

                Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/login",
                        "root", "");

                PreparedStatement st = (PreparedStatement) connection
                        .prepareStatement("SELECT * FROM biz_login WHERE username =?");

                st.setString(1, username);
                ResultSet rs = st.executeQuery();

                if (rs.next()) {
                    for (int i = 1; i <= 5; i++) {
                        userDetails.add(rs.getString(i));
                    }

                }

            } catch (SQLException sqlException) {
                sqlException.printStackTrace();
            }
        }
        if (acct_type.equals("Health Staff")) {

            userDetails.add(" ");

            try {

                Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/login",
                        "root", "");

                PreparedStatement st = (PreparedStatement) connection
                        .prepareStatement("SELECT * FROM healthstaff_login WHERE username =?");

                st.setString(1, username);
                ResultSet rs = st.executeQuery();

                if (rs.next()) {
                    for (int i = 1; i <= 6; i++) {
                        userDetails.add(rs.getString(i));

                    }

                }

            } catch (SQLException sqlException) {
                sqlException.printStackTrace();
            }
        }

        return userDetails;
    }

    public boolean searchUserfordelete(String acct_type, String username) {
        boolean result = false;
        if (acct_type.equals("Public")) {

            try {

                Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/login",
                        "root", "");

                PreparedStatement st = (PreparedStatement) connection
                        .prepareStatement("SELECT * FROM public_login WHERE username =?");

                st.setString(1, username);
                ResultSet rs = st.executeQuery();

                if (rs.next()) {
                    result = true;
                }

            } catch (SQLException sqlException) {
                sqlException.printStackTrace();
            }
        }
        if (acct_type.equals("Business")) {

            try {

                Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/login",
                        "root", "");

                PreparedStatement st = (PreparedStatement) connection
                        .prepareStatement("SELECT * FROM biz_login WHERE username =?");

                st.setString(1, username);
                ResultSet rs = st.executeQuery();

                if (rs.next()) {
                    result = true;
                }

            } catch (SQLException sqlException) {
                sqlException.printStackTrace();
            }
        }
        if (acct_type.equals("Health Staff")) {

            try {

                Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/login",
                        "root", "");

                PreparedStatement st = (PreparedStatement) connection
                        .prepareStatement("SELECT * FROM healthstaff_login WHERE username =?");

                st.setString(1, username);
                ResultSet rs = st.executeQuery();

                if (rs.next()) {
                    result = true;
                }

            } catch (SQLException sqlException) {
                sqlException.printStackTrace();
            }
        }
        return result;

    }

    public boolean updateUser(String acct_type, ArrayList<String> array) {
        boolean result = false;
        if (acct_type.equals("Public")) {
            try {

                Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/login",
                        "root", "");

                PreparedStatement st = (PreparedStatement) connection
                        .prepareStatement("UPDATE public_login SET vaccinated=?,password=?,covid_status=?,"
                                + "vaccine_type=?,cert_number=?,appt_date=? WHERE username=? ");

                st.setString(1, array.get(1));
                st.setString(2, array.get(2));
                st.setString(3, array.get(3));
                st.setString(4, array.get(4));
                st.setString(5, array.get(5));
                st.setString(6, array.get(6));
                st.setString(7, array.get(0));

                st.executeUpdate();
                result = true;

            } catch (SQLException sqlException) {
                sqlException.printStackTrace();

            }
        }
        if (acct_type.equals("Business")) {
            try {

                Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/login",
                        "root", "");

                PreparedStatement st = (PreparedStatement) connection
                        .prepareStatement("UPDATE biz_login SET password=?,business_name=?,business_number=?,business_email=?,location=? WHERE username=? ");

                st.setString(1, array.get(1));
                st.setString(2, array.get(2));
                st.setString(3, array.get(3));
                st.setString(4, array.get(4));
                st.setString(5, array.get(5));
                st.setString(6, array.get(0));

                st.executeUpdate();
                result = true;

            } catch (SQLException sqlException) {
                sqlException.printStackTrace();

            }
        }
        if (acct_type.equals("Health Staff")) {
            try {

                Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/login",
                        "root", "");

                PreparedStatement st = (PreparedStatement) connection
                        .prepareStatement("UPDATE healthstaff_login SET username=?,"
                                + "password=?,staff_firstname=?,"
                                + "staff_lastname =?,staff_number =?,"
                                + "staff_email=? WHERE username=?");

                st.setString(1, array.get(0));
                st.setString(2, array.get(1));
                st.setString(3, array.get(2));
                st.setString(4, array.get(3));
                st.setString(5, array.get(4));
                st.setString(6, array.get(5));
                st.setString(7, array.get(0));

                st.executeUpdate();

            } catch (SQLException sqlException) {
                sqlException.printStackTrace();

            }
        }

        return result;
    }

    public boolean deleteUser(String acct_type, String username) {
        boolean result = false;
        if (acct_type.equals("Public")) {
            try {

                Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/login",
                        "root", "");

                PreparedStatement st = (PreparedStatement) connection
                        .prepareStatement("DELETE FROM public_login WHERE username =?");

                st.setString(1, username);
                st.executeUpdate();
                result = true;

            } catch (SQLException sqlException) {
                sqlException.printStackTrace();
            }
        }
        if (acct_type.equals("Business")) {
            try {

                Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/login",
                        "root", "");

                PreparedStatement st = (PreparedStatement) connection
                        .prepareStatement("DELETE FROM biz_login WHERE username =?");

                st.setString(1, username);
                st.executeUpdate();
                result = true;

            } catch (SQLException sqlException) {
                sqlException.printStackTrace();
            }
        }
        if (acct_type.equals("Health Staff")) {

            try {

                Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/login",
                        "root", "");

                PreparedStatement st = (PreparedStatement) connection
                        .prepareStatement("DELETE FROM healthstaff_login WHERE username =?");

                st.setString(1, username);
                st.executeUpdate();
                result = true;

            } catch (SQLException sqlException) {
                sqlException.printStackTrace();
            }
        }
        return result;
    }
    
    public int getcluster(String location){
        
        Connection connection;
        PreparedStatement st;
        int clusternum = 0;
    
        try{
            connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/login",
                    "root", "");

            //retrieve the name of the business of those in specific location cluster
            st = (PreparedStatement) connection
                    .prepareStatement("SELECT business_name FROM biz_login WHERE location =?");

            st.setString(1, location);
            ResultSet rs = st.executeQuery();
                while(rs.next()==true) {
                    String bizName = rs.getString(1);

                    //Retrieve list of users who visited business
                    PreparedStatement st2 = (PreparedStatement) connection
                            .prepareStatement("SELECT DISTINCT username FROM check_in_history WHERE business_name=?");

                    st2.setString(1, bizName);
                    ResultSet rs2 = st2.executeQuery();


                    while(rs2.next()==true) {
                        String cust_username = rs2.getString(1);
                    
                        //Check whether user is positive for Covid-19
                        PreparedStatement st3 = (PreparedStatement) connection
                                .prepareStatement("SELECT covid_status FROM public_login WHERE username=?");

                        st3.setString(1, cust_username);
                        ResultSet rs3 = st3.executeQuery();

                        if (rs3.next())
                        {
                            String covid = rs3.getString(1);

                            //Count total number of positive cases in specific location
                            if (covid.equals("Positive"))
                            {
                                clusternum++;
                            }
                        }
                    }
                 }
   
            }catch(SQLException sqlException){
                sqlException.printStackTrace();

            }
            return clusternum;
        
        }
    
    public String getReport()
    {
        try {

                Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/login",
                        "root", "");

                PreparedStatement st = (PreparedStatement) connection
                        .prepareStatement("SELECT COUNT(username) FROM public_login WHERE covid_status =?");

                st.setString(1,"Positive");
                ResultSet rs = st.executeQuery();
                
                if(rs.next())
                {
                    positive = rs.getString(1);
                }
                
                st = (PreparedStatement) connection
                        .prepareStatement("SELECT COUNT(username) FROM public_login ");
                
                rs = st.executeQuery();
                
                if(rs.next())
                {
                    population = rs.getString(1);
                }
                
                report = "*************************************\n"
                        +"COVID-19 REPORTED CASES\n"
                        +"*************************************\n"
                        +"Current Date Time: "+formatter.format(date)+"\n"
                        +"Population: "+population+"\n"
                        +"Positive Cases: "+positive+"\n"

                        +"Number of visits made by Patients to each cluster\n"

                        +"North Cases: "+getcluster("north")+"\n"
                        +"South Cases: "+getcluster("south")+"\n"
                        +"East Cases: "+getcluster("east")+"\n"
                        +"West Cases: "+getcluster("west")+"\n"
                        +"Central Cases: "+getcluster("central")+"\n";
            } 
        catch (SQLException sqlException) {
                sqlException.printStackTrace();
                }
        
        
        return report;
    }
    
    public String getVaccReport()
    {
        try {

                Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/login",
                        "root", "");

                PreparedStatement st = (PreparedStatement) connection
                        .prepareStatement("SELECT COUNT(username) FROM public_login WHERE vaccinated =?");

                st.setString(1,"yes");
                ResultSet rs = st.executeQuery();
                
                if(rs.next())
                {
                    vaccinatedAmt = rs.getString(1);
                }
                
                st = (PreparedStatement) connection
                        .prepareStatement("SELECT COUNT(username) FROM public_login WHERE vaccine_type =?");
                st.setString(1, "Mordana");
                rs = st.executeQuery();
                
                if(rs.next())
                {
                    mordana = rs.getString(1);
                }
                
                st = (PreparedStatement) connection
                        .prepareStatement("SELECT COUNT(username) FROM public_login WHERE vaccine_type =?");
                st.setString(1, "Pfizer");
                rs = st.executeQuery();
                
                if(rs.next())
                {
                    pfizer = rs.getString(1);
                }
                
                
                st = (PreparedStatement) connection
                        .prepareStatement("SELECT COUNT(username) FROM public_login ");
                
                rs = st.executeQuery();
                
                if(rs.next())
                {
                    population = rs.getString(1);
                }
                
                
                
                numberreport = "*************************************\n"
                        +"COVID-19 VACCINATION STATUS REPORT\n"
                        +"*************************************\n"
                        +"Current Date Time: "+formatter.format(date)+"\n"
                        +"Population: "+population+"\n"
                        +"Vaccinated Count: "+vaccinatedAmt+"\n"
                        +"Vaccine(Mordana): "+mordana+"\n"
                        +"Vaccine(Pfizer): "+pfizer+"\n"; 
                        
            } 
        catch (SQLException sqlException) {
            sqlException.printStackTrace();

            }
        return numberreport;
    }
}
