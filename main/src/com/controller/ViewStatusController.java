package com.controller;

import com.entity.Public;

public class ViewStatusController {

    String username;

    public ViewStatusController(String username) {
        this.username = username;
    }

    Public pUE = new Public();

    public String getStatus() {
        String result = pUE.getStatus(username);
        return result;
    }
}
