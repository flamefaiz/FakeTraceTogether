package com.controller;

import com.entity.HealthStaff;

public class NewsAlertController {

    String username;
    HealthStaff newsAlertEntity;

    public NewsAlertController(String username) {
        this.username = username;
        newsAlertEntity = new HealthStaff();
    }

    public String getNews() {
        String str;
        str = newsAlertEntity.getNews(username);
        return str;

    }

    public String getAppointment() {
        String str;
        str = newsAlertEntity.getAppointment(username);
        return str;
    }

}
