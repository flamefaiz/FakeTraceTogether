package com.controller;

import com.entity.Login;

public class BusinessLoginController{

    private Login businessLoginEntity;

    public BusinessLoginController() {
        this.businessLoginEntity = new Login();
    }

    public boolean login(String acct_type, String username, String password) {
        boolean result = false;
        result = businessLoginEntity.getUserLogin(acct_type,username, password);
        return result;
    }
}
