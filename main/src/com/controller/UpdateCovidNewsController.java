package com.controller;

import com.entity.HealthStaff;

public class UpdateCovidNewsController {

    String news;
    HealthStaff updateCovidNewsEntity;

    public UpdateCovidNewsController() {
        updateCovidNewsEntity = new HealthStaff();
    }

    public UpdateCovidNewsController(String news) {
        this.news = news;
    }

    public boolean updateNewsInEntity(String news) {
       boolean result = false;
        result = updateCovidNewsEntity.updateNews(news);
        return result;
    }
}
