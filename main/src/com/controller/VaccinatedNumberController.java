
package com.controller;

import com.entity.*;

public class VaccinatedNumberController {
    String report;

    public VaccinatedNumberController() {
    }
    
    public String getReport()
    {
        Organisation vne = new Organisation();
        report = vne.getVaccReport();
        
        return report;
    }
    
}
