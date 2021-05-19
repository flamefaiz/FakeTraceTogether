package com.entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HealthStaff {

    public boolean updateNews(String news) {
        boolean result = false;
        try {
            Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/login",
                    "root", "");
            PreparedStatement st4 = (PreparedStatement) connection
                    .prepareStatement("UPDATE covid_alert SET news=?");

            st4.setString(1, news);
            int j = st4.executeUpdate();

            if (j == 1) {
                result = true;
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return result;
    }
    
    public boolean updateCovidStatus(String username, String covidResult) {
        boolean result = false;
        try {
            Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/login",
                    "root", "");
            PreparedStatement st = connection
                    .prepareStatement("UPDATE public_login SET covid_status=? WHERE username =?");

            st.setString(1, covidResult);
            st.setString(2, username);

            int j = st.executeUpdate();

            if (j == 1) {
                result = true;

                if (covidResult.equals("Positive")) {

                    PreparedStatement st2 = connection
                            .prepareStatement("UPDATE covid_alert SET cases = cases + 1");

                    int i = st2.executeUpdate();

                }

            } else {
                result = false;
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return result;
    }
    
    public boolean updateVaccStatus(String username, String vaccResult) {
        boolean result = false;
        try {
            Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/login",
                    "root", "");
            PreparedStatement st = connection
                    .prepareStatement("UPDATE public_login SET vaccinated=? WHERE username =?");

            st.setString(1, vaccResult);
            st.setString(2, username);

            int j = st.executeUpdate();

            if (j == 1) {
                result = true;
            } 

            
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }

        return result;
    }
    
     public boolean updateVaccAppt(String username, String vaccAppt) {
         boolean result = false;
        try {
            Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/login",
                    "root", "");
            PreparedStatement st = connection
                    .prepareStatement("UPDATE public_login SET appt_date=? WHERE username =?");

            st.setString(1, vaccAppt);
            st.setString(2, username);

            int j = st.executeUpdate();

            if (j == 1) {
                result = true;
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }

        return result;
    }
     
     public String getAppointment(String username) {
        String str = "";
        try {
            Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/login",
                    "root", "");
            PreparedStatement st4 = (PreparedStatement) connection
                    .prepareStatement("SELECT appt_date FROM public_login WHERE username =?");
            st4.setString(1, username);
            ResultSet rs1 = st4.executeQuery();
            str += "\nUpcoming vaccination appointment date: ";
            if (rs1.next()) {
                str += rs1.getString(1);
            }

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();

        }
        return str;
    }

    public String getNews(String username) {
        String str = "";
        try {
            Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/login",
                    "root", "");
            PreparedStatement st3 = (PreparedStatement) connection
                    .prepareStatement("SELECT news, cases FROM covid_alert");
            ResultSet rs = st3.executeQuery();
            if (rs.next()) {
                String news = rs.getString(1);
                String cases = rs.getString(2);
                str += "\n" + "COVID-19 News : " + news + "\n"
                        + "Total Reported COVID-19 cases as of today : "
                        + cases;
            }

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();

        }
        return str;
    }
}
