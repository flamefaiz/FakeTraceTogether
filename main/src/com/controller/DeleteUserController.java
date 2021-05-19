/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.entity.*;
import java.util.ArrayList;


public class DeleteUserController {
    String acct_type;
    String username;

    public DeleteUserController(String acct_type, String username) {
        this.acct_type = acct_type;
        this.username = username;
    }
    
    public boolean searchUser()
    {
        Organisation due = new Organisation();
        boolean result = due.searchUserfordelete(acct_type,username);
        System.out.println(result);
        return result;
    }
    
    
    public boolean deleteUser()
    {
        Organisation due = new Organisation();
        boolean result = due.deleteUser(acct_type,username);
        return result;
    }
    
}
