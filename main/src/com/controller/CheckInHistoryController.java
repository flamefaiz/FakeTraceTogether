package com.controller;

import com.entity.Public;

public class CheckInHistoryController {

    String username;
    Public checkInHistoryEntity;

    public CheckInHistoryController(String username) {
        this.username = username;
    }

    public String viewHistory() {
        checkInHistoryEntity = new Public();
        String str = "";
        str = checkInHistoryEntity.viewHistory(username);
        return str;
    }

}
