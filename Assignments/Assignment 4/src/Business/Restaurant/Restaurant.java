/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.Order.Order;
import Business.Role.AdminRole;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author harold
 */
public class Restaurant {
    String name;
    UserAccount manager;
    HashMap<String, String> menu;
    ArrayList<Order> restaurantOrder;
//    ArrayList<String> menu;

    public HashMap<String, String> getMenu() {
        return menu;
    }

    public void setMenu(HashMap<String, String> menu) {
        this.menu = menu;
    }
    
    public Restaurant(UserAccount manager){
        menu = new HashMap<String, String>();
        restaurantOrder = new ArrayList<>();
        this.manager = manager;
    }
    
    public void setMenuItem(String name,String price){
        menu.put(name, price);
    }

    public void setManager(UserAccount manager) {
        this.manager = manager;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Order> getRestaurantOrder() {
        return restaurantOrder;
    }

    public void setRestaurantOrder(Order order){
        restaurantOrder.add(order);
    }

    public UserAccount getManager() {
        return manager;
    }

    public void setName(String name) {
        this.name = name;
    }
}
