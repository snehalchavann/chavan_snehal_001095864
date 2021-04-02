/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.DeliveryMan.DeliveryMan;
import Business.Order.Order;
import Business.Order.OrderDirectory;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class Customer {

    String customerName;
    String contactNumber;
    String address;
    int id;
    DeliveryMan deliveryMan;
    ArrayList<Order> customerOrder;
    Order currentorder;
    Order order1;
    OrderDirectory orderList;
    private static int count = 1;
    

    public ArrayList<Order> getOrder() {
        return customerOrder;
    }
    
    public Order getcurrentOrder(){
        return currentorder;
    }

    public void setCustomerOrder(Order order1) {
        this.customerOrder.add(order1);
    }

    public void setOrder(Order order) {
        this.order1 = order;
    }
    
    public Customer() {
        id = count;
        count++;
        customerOrder = new ArrayList<>();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public Order createOrder(){
        Order order = new Order();
        currentorder = order;
//        orderList.getOrderList().add(order);
//        customerOrder.add(order);
        return order;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
}
