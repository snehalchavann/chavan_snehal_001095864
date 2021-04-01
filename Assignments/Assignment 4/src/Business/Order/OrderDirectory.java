/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *
 * @author snehalchavan
 */
public class OrderDirectory {
    public ArrayList<Order> orderList;

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }

    public OrderDirectory() {
        orderList = new ArrayList<>();
    }
    
    
    
    public Order findOrder(String id){
        for(Order o : orderList){
            if(o.getOrderID().equals(id)){
                return o;
            }
        }
        return null;
    }
}
