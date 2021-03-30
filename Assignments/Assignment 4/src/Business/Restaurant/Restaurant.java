/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.Role.AdminRole;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class Restaurant {
    String name;
    UserAccount manager;
    ArrayList<String> menu;
    
    public Restaurant(UserAccount manager){
        menu = new ArrayList<>();
        this.manager = manager;
    }

    public String getName() {
        return name;
    }

    public UserAccount getManager() {
        return manager;
    }

    public void setName(String name) {
        this.name = name;
    }
}
