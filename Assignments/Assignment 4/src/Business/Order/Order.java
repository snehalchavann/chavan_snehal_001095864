/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.Customer.Customer;
import Business.Restaurant.Restaurant;
import Business.WorkQueue.WorkRequest;
import java.util.ArrayList;

/**
 *
 * @author snehalchavan
 */
public class Order extends WorkRequest{
    private String orderID;
    private String deliveryMan;
    private String orderstatus;
//    private int quantity;
    private boolean isDeliveryManAssigned;
    private Customer customer;
    private Restaurant restaurant;
    ArrayList<OrderItem> orderItems;

    public ArrayList<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(String name){
        this.orderItems = orderItems;
    }
    
    public Order(){
        orderItems = new ArrayList<>();
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getDeliveryMan() {
        return deliveryMan;
    }

    public void setDeliveryMan(String deliveryMan) {
        this.deliveryMan = deliveryMan;
    }

    public String getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(String orderstatus) {
        this.orderstatus = orderstatus;
    }

//    public int getQuantity() {
//        return quantity;
//    }
//
//    public void setQuantity(int quantity) {
//        this.quantity = quantity;
//    }

    public boolean isIsDeliveryManAssigned() {
        return isDeliveryManAssigned;
    }

    public void setIsDeliveryManAssigned(boolean isDeliveryManAssigned) {
        this.isDeliveryManAssigned = isDeliveryManAssigned;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    
}
