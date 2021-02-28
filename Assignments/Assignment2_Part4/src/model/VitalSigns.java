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
public class VitalSigns {
    double respiratoryRate;
    double heartRate;
    double bloodPressure;
    double weightKilos;
    double weightPounds;

    
    public double getRespiratoryRate() {
        return respiratoryRate;
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

    public ArrayList<Encounter> addVitalSigns(PatientDirectory patientDirectory) {
                Encounter en1 = new Encounter();
        Encounter en2 = new Encounter();
        Encounter en3 = new Encounter();
        Encounter en4 = new Encounter();
        Encounter en5 = new Encounter();
        Encounter en6 = new Encounter();
        ArrayList<Encounter> encounterHistory1 = new ArrayList<>();
//        ArrayList<Encounter> encounterHistory2 = new ArrayList<>();
//        ArrayList<Encounter> encounterHistory3 = new ArrayList<>();
//        ArrayList<Encounter> encounterHistory4 = new ArrayList<>();
//        ArrayList<Encounter> encounterHistory5 = new ArrayList<>();
//        ArrayList<Encounter> encounterHistory6 = new ArrayList<>();
        VitalSigns vital1 = new VitalSigns();//in
        vital1.setRespiratoryRate(30);
        vital1.setHeartRate(120);
        vital1.setBloodPressure(10);
        vital1.setWeightKilos(2);
        vital1.setWeightPounds(5);
        en1.setVitalSigns(vital1);
        en1.setCurrentTime("none");
        
        
        VitalSigns vital2 = new VitalSigns();
        vital2.setRespiratoryRate(20);
        vital2.setHeartRate(80);
        vital2.setBloodPressure(70);
        vital2.setWeightKilos(4);
        vital2.setWeightPounds(9);
        en2.setVitalSigns(vital2);
        en2.setCurrentTime("none");
        
        
        VitalSigns vital3 = new VitalSigns();//in
        vital3.setRespiratoryRate(20);
        vital3.setHeartRate(80);
        vital3.setBloodPressure(70);
        vital3.setWeightKilos(10);
        vital3.setWeightPounds(22);
        en3.setVitalSigns(vital3);
        en3.setCurrentTime("none");
        
        
        VitalSigns vital4 = new VitalSigns();
        vital4.setRespiratoryRate(20);
        vital4.setHeartRate(80);
        vital4.setBloodPressure(80);
        vital4.setWeightKilos(14);
        vital4.setWeightPounds(31);
        en4.setVitalSigns(vital4);
        en4.setCurrentTime("none");
        
        
        VitalSigns vital5 = new VitalSigns();//in
        vital5.setRespiratoryRate(20);
        vital5.setHeartRate(70);
        vital5.setBloodPressure(80);
        vital5.setWeightKilos(20);
        vital5.setWeightPounds(41);
        en5.setVitalSigns(vital5);
        en5.setCurrentTime("none");
        
        
        VitalSigns vital6 = new VitalSigns();
        vital6.setRespiratoryRate(12);
        vital6.setHeartRate(55);
        vital6.setBloodPressure(119);
        vital6.setWeightKilos(56);
        vital6.setWeightPounds(132);
        en6.setVitalSigns(vital6);
        en6.setCurrentTime("none");
        encounterHistory1.add(en6);
        encounterHistory1.add(en5);
        encounterHistory1.add(en4);
        encounterHistory1.add(en3);
        encounterHistory1.add(en2);
        encounterHistory1.add(en1);
        return encounterHistory1;
    }
   
}
