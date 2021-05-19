package com.controller;

import com.entity.HealthStaff;


public class UpdateCovidStatusController {
    
    private HealthStaff updateCovidStatusEntity;
    
    public UpdateCovidStatusController() {
        updateCovidStatusEntity = new HealthStaff();
    }
    
    public boolean updateCovidStatusInEntity(String username, String covidResult) {
        boolean result = false;
        result = updateCovidStatusEntity.updateCovidStatus(username, covidResult);
        return result;
    }
   
}