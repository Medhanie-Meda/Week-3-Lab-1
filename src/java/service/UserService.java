/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

/**
 *
 * @author 608964
 */
public class UserService 
{    
    public boolean login(String username, String password)
    {
        if(username.equalsIgnoreCase("adam") && password.equals("1234") 
                || username.equalsIgnoreCase("betty") && password.equals("4321"))
        {
            return true;
        }       
        return false;              
    }    
}
