/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.DeliveryMan.DeliveryMan;

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
    private static int count = 1;

    public Customer() {
        id = count;
        count++;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
