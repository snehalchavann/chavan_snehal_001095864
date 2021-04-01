/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class CustomerDirectory {
    private ArrayList<Customer> customerList;

    public CustomerDirectory() {
        customerList = new ArrayList();
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }
    
    public Customer getCustomer(String name){
        for(Customer customer : customerList){
            if(customer.getCustomerName().equals(name)){
                return customer;
            }
        }
        return null;
    }
    
    public Customer newCustomer(String name, String contact,String address){
        Customer customer = new Customer();
        customer.setCustomerName(name);
        customer.setContactNumber(contact);
        customer.setAddress(address);
        customerList.add(customer);
        return customer;
    }
}
