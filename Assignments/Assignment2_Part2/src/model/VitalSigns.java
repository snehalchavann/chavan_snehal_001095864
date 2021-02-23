/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

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
    String currentTime;

    public String getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(String currentTime) {
        this.currentTime = currentTime;
    }

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
}
