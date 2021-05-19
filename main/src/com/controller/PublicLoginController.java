package com.controller;

import com.entity.Login;

public class PublicLoginController {

    private Login publicLoginEntity;

    public PublicLoginController() {
        publicLoginEntity = new Login();
    }

    public boolean login(String acct_type, String username, String password) {
        boolean result = false;
        result = publicLoginEntity.getUserLogin(acct_type,username, password);
        return result;
    }

}
