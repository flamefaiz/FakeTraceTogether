
package com.entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Business {
    String username;
    String covidAlert;
    Connection connection;
    PreparedStatement st;
    String bizName;
    String date;
    String cust_username = "";
    String datetime = "";
    String business_name = "";
    String LINE = "-------------------------------------------";

    public Business(String username) {
        this.username = username;
    }
    
    public String getCovidAlert()
    {
        try{

            
            connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/login",
                    "root", "");

            //retrieve the name of the business
            st = (PreparedStatement) connection
                    .prepareStatement("SELECT business_name FROM biz_login WHERE username =?");

            st.setString(1, username);
            ResultSet rs = st.executeQuery();
            if(rs.next())
            {
                bizName = rs.getString(1);
            }

            //retrieve the username of the customers that check in
            PreparedStatement st2 = (PreparedStatement) connection
                    .prepareStatement("SELECT username,datetime FROM check_in_history WHERE business_name=?");

            st2.setString(1, bizName);
            rs = st2.executeQuery();
            String str = "";

            while(rs.next()==true)
            {
                cust_username = rs.getString(1);
                date = rs.getString(2);
                PreparedStatement st3 = (PreparedStatement) connection
                        .prepareStatement("SELECT covid_status FROM public_login WHERE username=?");

                st3.setString(1, cust_username);
                ResultSet rs2 = st3.executeQuery();
                


                while(rs2.next() == true)
                {
                    String status = rs2.getString(1);
                    if(status.equals("Positive"))
                    {
                        String str1 = 
                                "-----------------------------------\n"
                                        +"Customer Username : " + cust_username +"\n"
                                        +"Date Visited: " + date +"\n"
                                        +"----------------------------------"+"\n"
                        ;
                        str = str + str1;
                        covidAlert = str;
                        
                    }   
                }
            }
           
        }catch(SQLException sqlException){
            sqlException.printStackTrace();

        }
        return covidAlert;
    }
    
    public String viewHistory()
    {
        String str = "";
      
        try {
            connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/login",
                    "root", "");

                //retrieve the name of the business
            st = (PreparedStatement) connection
                    .prepareStatement("SELECT business_name FROM biz_login WHERE username =?");

            st.setString(1, username);
            ResultSet rs = st.executeQuery();
            if(rs.next() == true )
            {
                bizName = rs.getString(1);
                //System.out.println(bizName);
            }

            //retrieve the username of the customers that check in
            PreparedStatement st2 = (PreparedStatement) connection
                    .prepareStatement("SELECT username,datetime FROM check_in_history WHERE business_name=?");

            st2.setString(1, bizName);
            ResultSet rs2 = st2.executeQuery();
            String str_record = "";


            while(rs2.next() == true)
            {
                cust_username = rs2.getString(1);
                datetime = rs2.getString(2);
                str_record = cust_username + " " + datetime;

                String str1 =  "-----------------------------------\n"
                        +"Customer Username : " + cust_username +"\n"
                        +"Date : " + datetime +"\n"
                        +"----------------------------------"+"\n";
                str = str + str1;
            }
        }
        catch (SQLException sqlException) {
            sqlException.printStackTrace();

        }
        //System.out.println(str);
        return str;    
    

    } 
    
}
