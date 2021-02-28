/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author snehalchavan
 */
public class Person {
    String firstname;
    String lastname;
    String fullname;
    double age;
    ArrayList<Person> personList;

    public Person(String firstname, String fullname, double age) {
        this.firstname = firstname;
        this.fullname = fullname;
        this.age = age;
        
    }
    
    public Person(){
        
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFullname() {
        return firstname+" "+lastname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
    
    
    
}
