package com.entity;

import com.controller.HealthStaffLoginController;
import com.controller.OrganisationLoginController;
import java.sql.*;

public class Login {
Connection connection;
    public Login() {
        try {
            connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/login",
                    "root", "");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public boolean getUserLogin(String acct_type, String username, String password) {
        boolean result = false;
        if (acct_type.equals("Public")) {
            try {

                PreparedStatement st = (PreparedStatement) connection
                        .prepareStatement("SELECT username,password FROM public_login WHERE username =? AND password =? ");

                st.setString(1, username);
                st.setString(2, password);
                ResultSet rs = st.executeQuery();
                //            PublicLoginController pLC = new PublicLoginController();
                if (rs.next()) {
                    result = true;
                    return result;
                }
            } catch (SQLException sqlException) {
                sqlException.printStackTrace();
            }
        }
        if (acct_type.equals("Business")) {
            try {

                PreparedStatement st = (PreparedStatement) connection
                        .prepareStatement("SELECT username,password FROM biz_login WHERE username =? AND password =? ");

                st.setString(1, username);
                st.setString(2, password);
                ResultSet rs = st.executeQuery();
                if (rs.next()) {
                    result = true;
                    return result;
                }
            } catch (SQLException sqlException) {
                sqlException.printStackTrace();
            }
        }
        if (acct_type.equals("Health Staff")) {
            try {

                PreparedStatement st = (PreparedStatement) connection
                        .prepareStatement("SELECT username,password FROM healthstaff_login WHERE username =? AND password =? ");

                st.setString(1, username);
                st.setString(2, password);
                ResultSet rs = st.executeQuery();
                HealthStaffLoginController pLC = new HealthStaffLoginController();
                if (rs.next()) {
                    result = true;
                    return result;
                }
            } catch (SQLException sqlException) {
                sqlException.printStackTrace();
            }
        }
            if (acct_type.equals("Organisation")) {
                try {

                    PreparedStatement st = (PreparedStatement) connection
                            .prepareStatement("SELECT username,password FROM organisation_login WHERE username =? AND password =? ");

                    st.setString(1, username);
                    st.setString(2, password);
                    ResultSet rs = st.executeQuery();
                    OrganisationLoginController oLC = new OrganisationLoginController();
                    if (rs.next()) {
                        result = true;
                        return result;
                    }
                } catch (SQLException sqlException) {
                    sqlException.printStackTrace();
                }
            }return result;
    }

    }