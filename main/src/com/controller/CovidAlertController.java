package com.controller;

import com.entity.Business;

public class CovidAlertController {

    String username;

    public CovidAlertController() {
    }

    public CovidAlertController(String username) {
        this.username = username;
    }

    public String viewCovidAlert() {
        String str = "";
        Business cae = new Business(username);
        str = cae.getCovidAlert();
        return str;
    }

}
