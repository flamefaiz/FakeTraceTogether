package com.controller;

import com.entity.Public;

public class ViewVaccCertController {

    String username;
    Public vVC = new Public();

    public ViewVaccCertController(String username) {
        this.username = username;
    }

    public String getCert() {
        String cert = vVC.getCert(username);
        return cert;
    }
}
