package com.controller;

import com.entity.Public;

public class CheckInController {

    Public checkInEntity;

    public CheckInController() {
        checkInEntity = new Public();
    }

    public boolean checkIn(String username, String business_name) {
        boolean result = false;
        result = checkInEntity.updateCheckInStatus(username, business_name);
        return result;
    }
}
