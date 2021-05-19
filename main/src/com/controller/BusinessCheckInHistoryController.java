package com.controller;

import com.entity.Business;

public class BusinessCheckInHistoryController {

    String username;
    String result;
    Business businessCheckInHistoryEntity;

    public BusinessCheckInHistoryController(String username) {
        this.username = username;
    }

    public String viewHistory() {
        businessCheckInHistoryEntity = new Business(username);
        String str = "";
        str = businessCheckInHistoryEntity.viewHistory();
        return str;
    }

}
