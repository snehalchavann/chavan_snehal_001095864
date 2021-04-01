/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.Order.Order;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class DeliveryMan {
    String name;
    ArrayList<Order> order;

    public ArrayList<Order> getOrder() {
        return order;
    }

    public void setOrder(Order newOrder){
        order.add(newOrder);
    }
    
    public DeliveryMan(){
        order = new ArrayList<>();
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
