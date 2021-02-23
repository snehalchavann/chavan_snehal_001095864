/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Scanner;
import model.VitalSigns;

/**
 *
 * @author snehalchavan
 */
public class Patient {
    
    String firstname;
    String lastname;
    double age;
    VitalSigns vitalSigns;

    public VitalSigns getVitalSigns() {
        return vitalSigns;
    }

    public void setVitalSigns(VitalSigns vitalSigns) {
        this.vitalSigns = vitalSigns;
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

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }
    
    public boolean isPatientNormal(double age,double respRate,double heartRate,double bloodPressure,double weightKilos,double weightPounds){
        boolean val;
        if(age == 0){
            val = newborn(age,respRate,heartRate,bloodPressure,weightKilos,weightPounds);
        }else if(age == 0.5){
            val = Infant(age,respRate,heartRate,bloodPressure,weightKilos,weightPounds);
        }else if(age >=1 && age <=3){
            val = Toddler(age,respRate,heartRate,bloodPressure,weightKilos,weightPounds);
        }else if(age >3 && age <= 5){
            val = Preschooler(age,respRate,heartRate,bloodPressure,weightKilos,weightPounds);
        }else if(age >= 6 && age <= 12){
            val = SchoolAge(age,respRate,heartRate,bloodPressure,weightKilos,weightPounds);
        }else{
            val = Adolescent(age,respRate,heartRate,bloodPressure,weightKilos,weightPounds);
        }
        return val;
        
    }

    private boolean newborn(double age,double respRate,double heartRate,double bloodPressure,double weightKilos,double weightPounds) {
        boolean result;
        
        if((respRate >= 30 && respRate <= 50) && (heartRate >= 120 && heartRate <= 160) && (bloodPressure >= 50 && bloodPressure <= 70) && (weightKilos >= 2 && weightKilos <=3) && (weightPounds >= 4.5 && weightPounds <= 7)){
            result = true;
        }else{
            result = false;
        }
        return result;
    }

    private boolean Infant(double age,double respRate,double heartRate,double bloodPressure,double weightKilos,double weightPounds) {
        boolean result;
        
        if((respRate >= 20 && respRate <= 30) && (heartRate >= 80 && heartRate <= 140) && (bloodPressure >= 70 && bloodPressure <= 100) && (weightKilos >= 4 && weightKilos <=10) && (weightPounds >= 9 && weightPounds <= 22)){
            result = true;
        }else{
            result = false;
        }
        return result;
    }

    private boolean Toddler(double age,double respRate,double heartRate,double bloodPressure,double weightKilos,double weightPounds) {
        boolean result;
        
        if((respRate >= 20 && respRate <= 30) && (heartRate >= 80 && heartRate <= 130) && (bloodPressure >= 80 && bloodPressure <= 110) && (weightKilos >= 10 && weightKilos <=14) && (weightPounds >= 22 && weightPounds <= 31)){
            result = true;
        }else{
            result = false;
        }
        return result;
    }

    private boolean Preschooler(double age,double respRate,double heartRate,double bloodPressure,double weightKilos,double weightPounds) {
        boolean result;
        
        if((respRate >= 20 && respRate <= 30) && (heartRate >= 80 && heartRate <= 120) && (bloodPressure >= 80 && bloodPressure <= 110) && (weightKilos >= 14 && weightKilos <=18) && (weightPounds >= 31 && weightPounds <= 40)){
            result = true;
        }else{
            result = false;
        }
        return result;
    }

    private boolean SchoolAge(double age,double respRate,double heartRate,double bloodPressure,double weightKilos,double weightPounds) {
        boolean result;
        
        if((respRate >= 20 && respRate <= 30) && (heartRate >= 70 && heartRate <= 110) && (bloodPressure >= 80 && bloodPressure <= 120) && (weightKilos >= 20 && weightKilos <=42) && (weightPounds >= 41 && weightPounds <= 92)){
            result = true;
        }else{
            result = false;
        }
        return result;
    }

    private boolean Adolescent(double age,double respRate,double heartRate,double bloodPressure,double weightKilos,double weightPounds) {
        boolean result;
        
        if((respRate >= 12 && respRate <= 20) && (heartRate >= 55 && heartRate <= 105) && (bloodPressure >= 110 && bloodPressure <= 120) && (weightKilos > 50) && (weightPounds > 110)){
            result = true;
        }else{
            result = false;
        }
        return result;
    }
    
    
    
}
