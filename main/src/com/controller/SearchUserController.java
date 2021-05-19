/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.entity.*;
import java.util.ArrayList;


public class SearchUserController {
    String acct_type;
    String username;
    ArrayList userDetails = new ArrayList<String>();

    public SearchUserController(String acct_type, String username) {
        this.acct_type = acct_type;
        this.username = username;
    }
    
    public ArrayList<String> getUserDetails()
    {
        Organisation u = new Organisation();
        userDetails = u.getUser(acct_type,username);
        return userDetails;
    }
    
}
