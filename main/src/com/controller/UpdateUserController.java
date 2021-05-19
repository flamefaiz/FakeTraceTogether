/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.entity.*;
import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class UpdateUserController {
    String acct_type;
    String username;
    ArrayList userStuff = new ArrayList<String>();

    public UpdateUserController() {
        this.acct_type = acct_type;
        this.username = username;
    }
    
    public boolean updateUser(String acct_type, ArrayList<String> array )
    {
        Organisation cuE = new Organisation();
        boolean result = false;
        result = cuE.updateUser(acct_type,array);
        return result;
    }
    
    
}
