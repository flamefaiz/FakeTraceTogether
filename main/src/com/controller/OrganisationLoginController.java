
package com.controller;

import com.entity.Login;

public class OrganisationLoginController{

    private Login organisationLoginEntity;

    public OrganisationLoginController() {
        this.organisationLoginEntity = new Login();
    }

    public boolean login(String acct_type, String username, String password) {
        boolean result = false;
        result = organisationLoginEntity.getUserLogin(acct_type,username, password);
        return result;
    }

}

