
package com.controller;

import com.entity.*;


public class GenerateCovidReportController {
    String report;

    public GenerateCovidReportController() {
    }
    
    public String getReport()
    {
        Organisation gcre = new Organisation();
        report = gcre.getReport();
        
        return report;
    }
    
}
