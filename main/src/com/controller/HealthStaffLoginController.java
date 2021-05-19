package com.controller;

import com.entity.Login;

public class HealthStaffLoginController {

    private Login healthStaffLoginEntity;

    public HealthStaffLoginController() {
        this.healthStaffLoginEntity = new Login();
    }

    public boolean login(String acct_type, String username, String password) {
        boolean result = false;
        result = healthStaffLoginEntity.getUserLogin(acct_type,username, password);
        return result;
    }

}
