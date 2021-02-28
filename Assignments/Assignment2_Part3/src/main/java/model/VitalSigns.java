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

    boolean isThisVitalSignNormal(String signName) {
        boolean result;
        if(signName.equals("respiratoryRate")){
            result = true;
        }else if(signName.equals("heartRate")){
            result = true;
        }else if(signName.equals("bloodPressure")){
            result = true;
        }else if(signName.equals("weightKilos")){
            result = true;
        }else if(signName.equals("weightPounds")){
            result = true;
        }else{
            result = false;
        }
        return result;
    }
    
    boolean checkVitalSignRange(double patientAge, String signName, Patient patientObj) {
        boolean ageGroup = false;
        ArrayList<Encounter> encounter = patientObj.getEncounterHistory();
        VitalSigns current = encounter.get(encounter.size()-1).getVitalSigns();
        
        switch(signName){
            case "respiratoryRate":
                if(patientAge == 0){
                    if(current.getRespiratoryRate()>=30 && current.getRespiratoryRate()<=50){
                        ageGroup=true;
                    }else{
                        ageGroup=false;
                    }
                }else if((patientAge == 0.5)||(patientAge >=1 && patientAge <=3)||(patientAge >3 && patientAge <= 5)||(patientAge >= 6 && patientAge <= 12)){
                    if(current.getRespiratoryRate()>=20 && current.getRespiratoryRate()<=30){
                        ageGroup=true;
                    }else{
                        ageGroup=false;
                    }

                }else{
                    if(current.getRespiratoryRate()>=12 && current.getRespiratoryRate()<=20){
                        ageGroup=true;
                    }else{
                        ageGroup=false;
                    }
                }
                break;
            case "heartRate":
                if(patientAge == 0){
                    if(current.getHeartRate()>=120 && current.getHeartRate()<=160){
                        ageGroup=true;
                    }else{
                        ageGroup=false;
                    }
                }else if(patientAge == 0.5){
                    if(current.getHeartRate()>=80 && current.getHeartRate()<=140){
                        ageGroup=true;
                    }else{
                        ageGroup=false;
                    }
                }else if(patientAge >=1 && patientAge <=3){
                    if(current.getHeartRate()>=80 && current.getHeartRate()<=130){
                        ageGroup=true;
                    }else{
                        ageGroup=false;
                    }
                }else if(patientAge >3 && patientAge <=5){
                    if(current.getHeartRate()>=80 && current.getHeartRate()<=120){
                        ageGroup=true;
                    }else{
                        ageGroup=false;
                    }
                }else if(patientAge >=6 && patientAge <=12){
                    if(current.getHeartRate()>=70 && current.getHeartRate()<=110){
                        ageGroup=true;
                    }else{
                        ageGroup=false;
                    }
                }else{
                    if(current.getHeartRate()>=55 && current.getHeartRate()<=105){
                        ageGroup=true;
                    }else{
                        ageGroup=false;
                    }
                }
                break;
            case "bloodPressure":
                if(patientAge == 0){
                    if(current.getBloodPressure()>=50 && current.getBloodPressure()<=70){
                        ageGroup=true;
                    }else{
                        ageGroup=false;
                    }
                }else if(patientAge == 0.5){
                    if(current.getBloodPressure()>=70 && current.getBloodPressure()<=100){
                        ageGroup=true;
                    }else{
                        ageGroup=false;
                    }
                }else if((patientAge >=1 && patientAge <=3)||(patientAge >3 && patientAge <=5)){
                    if(current.getBloodPressure()>=80 && current.getBloodPressure()<=110){
                        ageGroup=true;
                    }else{
                        ageGroup=false;
                    }
                }else if(patientAge >=6 && patientAge <=12){
                    if(current.getBloodPressure()>=80 && current.getBloodPressure()<=120){
                        ageGroup=true;
                    }else{
                        ageGroup=false;
                    }
                }else{
                    if(current.getBloodPressure()>=110 && current.getBloodPressure()<=120){
                        ageGroup=true;
                    }else{
                        ageGroup=false;
                    }
                }
        
                break;
                
            case "weightKilos":
                if(patientAge == 0){
                    if(current.getWeightKilos()>=2 && current.getWeightKilos()<=3){
                        ageGroup=true;
                    }else{
                        ageGroup=false;
                    }
                }else if(patientAge == 0.5){
                    if(current.getWeightKilos()>=4 && current.getWeightKilos()<=10){
                        ageGroup=true;
                    }else{
                        ageGroup=false;
                    }
                }else if(patientAge >=1 && patientAge <=3){
                    if(current.getWeightKilos()>=10 && current.getWeightKilos()<=14){
                        ageGroup=true;
                    }else{
                        ageGroup=false;
                    }
                }else if(patientAge >3 && patientAge <=5){
                    if(current.getWeightKilos()>=14 && current.getWeightKilos()<=18){
                        ageGroup=true;
                    }else{
                        ageGroup=false;
                    }
                }else if(patientAge >=6 && patientAge <=12){
                    if(current.getWeightKilos()>=20 && current.getWeightKilos()<=42){
                        ageGroup=true;
                    }else{
                        ageGroup=false;
                    }
                }else{
                    if(current.getWeightKilos()>50){
                        ageGroup=true;
                    }else{
                        ageGroup=false;
                    }
                }
                break;
                
            case "weightPounds":
                if(patientAge == 0){
                    if(current.getWeightPounds()>=4.5 && current.getWeightPounds()<=7){
                        ageGroup=true;
                    }else{
                        ageGroup=false;
                    }
                }else if(patientAge == 0.5){
                    if(current.getWeightPounds()>9 && current.getWeightPounds()<=22){
                        ageGroup=true;
                    }else{
                        ageGroup=false;
                    }
                }else if(patientAge >=1 && patientAge <=3){
                    if(current.getWeightPounds()>=22 && current.getWeightPounds()<=31){
                        ageGroup=true;
                    }else{
                        ageGroup=false;
                    }
                }else if(patientAge >3 && patientAge <=5){
                    if(current.getWeightPounds()>=31 && current.getWeightPounds()<=40){
                        ageGroup=true;
                    }else{
                        ageGroup=false;
                    }
                }else if(patientAge >=6 && patientAge <=12){
                    if(current.getWeightPounds()>41 && current.getWeightPounds()<=92){
                        ageGroup=true;
                    }else{
                        ageGroup=false;
                    }
                }else{
                    if(current.getWeightPounds()>110){
                        ageGroup=true;
                    }else{
                        ageGroup=false;
                    }
                }
                break;
    }
        return ageGroup;
}

}
