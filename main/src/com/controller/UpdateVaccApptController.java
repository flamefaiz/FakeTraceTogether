package com.controller;

import com.entity.HealthStaff;

public class UpdateVaccApptController {
    private HealthStaff updateVaccApptEntity;
    
    public UpdateVaccApptController() {
        updateVaccApptEntity = new HealthStaff();
        
    }
    
    public boolean updateVaccApptInEntity(String username, String vaccAppt) {
        boolean result = false;
        result = updateVaccApptEntity.updateVaccAppt(username, vaccAppt);
        return result;
    }
}
