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
    String address;
    String contact;
    UserAccount manager;
    HashMap<String, String> menu;
    ArrayList<Order> restaurantOrder;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
    
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
        assignMenu();
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

    private void assignMenu() {
        menu.put("Pizza", "20");
         menu.put("Tea", "10");
    }
}
