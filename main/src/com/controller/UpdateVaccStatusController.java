package com.controller;
import com.entity.HealthStaff;

public class UpdateVaccStatusController {
    private HealthStaff updateVaccStatusEntity;
    
    public UpdateVaccStatusController() {
        updateVaccStatusEntity = new HealthStaff();
        
    }
    
    public boolean updateVaccStatusInEntity(String username, String vaccResult) {
        boolean result = false;
        result = updateVaccStatusEntity.updateVaccStatus(username, vaccResult);
        return result;
    }
}
