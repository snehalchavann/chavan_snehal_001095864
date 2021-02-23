/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Scanner;

/**
 *
 * @author snehalchavan
 */
public class VitalSigns {
    double respiratoryRate;
    double heartRate;
    double bloodPressure;
    double weightKilos;
    double weightPounds;

    public double getRespiratoryRate() {
        return respiratoryRate;
    }

    public VitalSigns(double respiratoryRate, double heartRate, double bloodPressure, double weightKilos, double weightPounds) {
        this.respiratoryRate = respiratoryRate;
        this.heartRate = heartRate;
        this.bloodPressure = bloodPressure;
        this.weightKilos = weightKilos;
        this.weightPounds = weightPounds;
    }

    public VitalSigns() {
    }
    

    public void setRespiratoryRate(double respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }

    public double getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(double heartRate) {
        this.heartRate = heartRate;
    }

    public double getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(double bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public double getWeightKilos() {
        return weightKilos;
    }

    public void setWeightKilos(double weightKilos) {
        this.weightKilos = weightKilos;
    }

    public double getWeightPounds() {
        return weightPounds;
    }

    public void setWeightPounds(double weightPounds) {
        this.weightPounds = weightPounds;
    }
    
    public static void main(String[] args) {
        Patient patient = new Patient();
        VitalSigns vitalSigns = new VitalSigns();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name:");
        String fname = sc.nextLine();
        System.out.println("Enter Last Name:");
        String lname = sc.nextLine();
        
        System.out.println("Is age less than one year(Y/N):");
        String output = sc.nextLine();
        double age = 0;
        if("n".equals(output) || "N".equals(output)){
            System.out.println("Enter age in years:");
            age = sc.nextDouble();
        }else if("y".equals(output) || "Y".equals(output)){
            System.out.println("Enter age in months:");
            age = sc.nextDouble();
            if(age >=0 && age < 1){
                age = 0;
            }else{
                age = 0.5;
            }
        }
        
        System.out.println("Enter Patient's Respiratory Rate:");
        double respRate = sc.nextDouble();
        System.out.println("Enter Patient' Heart Rate:");
        double heartRate = sc.nextDouble();
        System.out.println("Enter Patient's Blood Pressure:");
        double bloodPressure = sc.nextDouble();
        System.out.println("Enter Patient's Weight in Kilos:");
        double weightKilos = sc.nextDouble();
        System.out.println("Enter Patient's Weight in Pounds:");
        double weightPounds = sc.nextDouble();
        patient.setFirstname(fname);
        patient.setLastname(lname);
        patient.setAge(age);
        
        vitalSigns.setRespiratoryRate(respRate);
        vitalSigns.setHeartRate(heartRate);
        vitalSigns.setBloodPressure(bloodPressure);
        vitalSigns.setWeightKilos(weightKilos);
        vitalSigns.setWeightPounds(weightPounds);
        boolean result = patient.isPatientNormal(age,respRate,heartRate,bloodPressure,weightKilos,weightPounds);
        if(result != true) {
            System.out.println("Patient is not normal");
        }
         else {
            System.out.println("Patient is normal");
        }
    }
}
