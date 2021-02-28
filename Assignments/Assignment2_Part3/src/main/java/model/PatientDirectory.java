/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author snehalchavan
 */
public class PatientDirectory {
    ArrayList<Patient> patientList = new ArrayList<>();

    void getPatientsList() {
        for(int i=0;i<patientList.size();i++){
                    Patient p = patientList.get(i);
                    System.out.println("Patient Name: "+p.getFullname()+"\t"+"Number of visits: "+p.encounterHistory.size());
                }
    }
    
    Patient FindName(String name){
        
        Iterator<Patient> iterator = patientList.iterator();
        while (iterator.hasNext()) {
        Patient customer = iterator.next();
        if (customer.getFirstname().equals(name)) {
            System.out.println(customer.getFirstname());
            return customer;
        }
    }
    return null;
        
    }
}
