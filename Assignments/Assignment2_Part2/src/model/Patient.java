/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author snehalchavan
 */
public class Patient {
    String firstname;
    String lastname;
    String fullname;

    public String getFullname() {
        return (firstname + " " + lastname);
    }

    
    double age;
//    VitalSigns vitalSigns;
    ArrayList<VitalSigns> vitalSigns;

    public ArrayList<VitalSigns> getVitalSigns() {    
        return vitalSigns;
    }


    public void setVitalSigns(ArrayList<VitalSigns> vitalSigns) {
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

    boolean isPatientNormal(double age, double respRate, double heartRate, double bloodPressure, double weightKilos, double weightPounds) {
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
    
    Patient FindName(String name,ArrayList<Patient> patients){
        
        Iterator<Patient> iterator = patients.iterator();
        while (iterator.hasNext()) {
        Patient customer = iterator.next();
        if (customer.getFirstname().equals(name)) {
            System.out.println(customer.getFirstname());
            return customer;
        }
    }
    return null;
        
    }

    

    void DisplayVitalSignsHistory(Patient showName,ArrayList<Patient> arrList) {
        String name = showName.getFullname();
        System.out.println("Name:"+name);
        for(int i=0;i<arrList.size();i++){
                ArrayList<VitalSigns> vitalSigns1 = arrList.get(i).getVitalSigns();
                    for(int j=0;j<vitalSigns1.size();j++){
                        System.out.println("Vital Sign History record"+" "+j);
                        System.out.println("Resp rate"+":"+vitalSigns1.get(j).getRespiratoryRate());
                        System.out.println("Heart rate"+":"+vitalSigns1.get(j).getHeartRate());
                        System.out.println("Blood Pressure"+":"+vitalSigns1.get(j).getBloodPressure());
                        System.out.println("Weight in Kilos"+":"+vitalSigns1.get(j).getWeightKilos());
                        System.out.println("Weight in Pounds"+":"+vitalSigns1.get(j).getWeightPounds());
                        System.out.println("Time"+":"+vitalSigns1.get(j).getCurrentTime());
                    }
                    
                    
                }
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

    boolean getAgeGroup(double patientAge,String signName,Patient patientObject) {
        boolean ageGroup = false;
        ArrayList<VitalSigns> vitalSigns2 =patientObject.getVitalSigns();
        VitalSigns current = vitalSigns2.get(vitalSigns2.size()-1);
        
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

    VitalSigns newVitalSign(Patient findName,ArrayList<VitalSigns> vitalSignsList, double respRate, double heartRate, double bloodPressure, double weightKilos, double weightPounds) {
        VitalSigns vitalSign = new VitalSigns();
        vitalSign.setRespiratoryRate(respRate);
        vitalSign.setHeartRate(heartRate);
        vitalSign.setBloodPressure(bloodPressure);
        vitalSign.setWeightKilos(weightKilos);
        vitalSign.setWeightPounds(weightPounds);
        LocalTime now = LocalTime.now();
        String timeCurrent = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        vitalSign.setCurrentTime(timeCurrent);
        vitalSignsList.add(vitalSign);
        findName.setVitalSigns(vitalSignsList);
        return vitalSign;
    }

    void DisplayVitalSignsHistoryCurrent(Patient showCurrent,VitalSigns current) {
        String name = showCurrent.getFullname();
        System.out.println("Name"+name);
        
        System.out.println("Resp rate"+":"+current.getRespiratoryRate());
        System.out.println("Heart rate"+":"+current.getHeartRate());
        System.out.println("Blood Pressure"+":"+current.getBloodPressure());
        System.out.println("Weight in Kilos"+":"+current.getWeightKilos());
        System.out.println("Weight in Pounds"+":"+current.getWeightPounds());
        System.out.println("Time"+":"+current.getCurrentTime());
         
    }

    void DisplayVitalSignsHistoryPrevious(Patient showPrevious, ArrayList<Patient> arrList) {
        String name = showPrevious.getFullname();
        System.out.println("Name"+name);
        ArrayList<VitalSigns> vitalSignsPrev = showPrevious.getVitalSigns();
        for(int j=vitalSignsPrev.size()-2;j>0;j--){

                System.out.println("Resp rate"+j+":"+vitalSignsPrev.get(j).getRespiratoryRate());
                System.out.println("Heart rate"+j+":"+vitalSignsPrev.get(j).getHeartRate());
                System.out.println("Blood Pressure"+j+":"+vitalSignsPrev.get(j).getBloodPressure());
                System.out.println("Weight in Kilos"+j+":"+vitalSignsPrev.get(j).getWeightKilos());
                System.out.println("Weight in Pounds"+j+":"+vitalSignsPrev.get(j).getWeightPounds());
                System.out.println("Time"+j+":"+vitalSignsPrev.get(j).getCurrentTime());
        }
    }
}
