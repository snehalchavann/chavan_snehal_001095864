/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author snehalchavan
 */
public class Patient extends Person{
    ArrayList<Encounter> encounterHistory;
    Encounter encounter;

    
    public Encounter getEncounter() {
        return encounter;
    }

    public void setEncounter(Encounter encounter) {
        this.encounter = encounter;
    }
    
    
    public ArrayList<Encounter> getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(ArrayList<Encounter> encounterHistory) {
        this.encounterHistory = encounterHistory;
    }

    public Patient(String firstname,String lastname,double age) {
        super(firstname,lastname,age);
        
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

    VitalSigns newVitalSign(Patient patient, double respRate, double heartRate, double bloodPressure, double weightKilos, double weightPounds) {
          
        VitalSigns vitalSigns = new VitalSigns();
            vitalSigns.setRespiratoryRate(respRate);
            vitalSigns.setHeartRate(heartRate);
            vitalSigns.setBloodPressure(bloodPressure);
            vitalSigns.setWeightKilos(weightKilos);
            vitalSigns.setWeightPounds(weightPounds);

            return vitalSigns;
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


    

    

    

    private ArrayList<VitalSigns> getVitalSigns() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    
    void addData(PatientDirectory patientDirectory, PersonDirectory personDirectory, City city, Community community,FullSystem fullSystem) {
        Scanner sc = new Scanner(System.in);
        
        VitalSigns vital = new VitalSigns();
        ArrayList<String> name = new ArrayList<>();
        name.add("Snehal");
        name.add("Rachel");
        name.add("Ron");
        name.add("Harry");
        name.add("Chandler");
        name.add("Tom");
        ArrayList<String> lastname = new ArrayList<>();
        lastname.add("Chavan");
        lastname.add("Green");
        lastname.add("Wisley");
        lastname.add("Potter");
        lastname.add("Bing");
        lastname.add("Jerry");
        
        ArrayList<Encounter> listEncounters = vital.addVitalSigns(patientDirectory);
        System.out.println("Enter person's data");
        for(int i=0;i<6;i++){                
                switch(i){
                    case 0:
                        age = 0;
                        break;
                    case 1:
                        age = 0.5;
                        break;
                    case 2:
                        age = 2;
                        break;
                    case 3:
                        age = 4;
                        break;
                    case 4:
                        age = 11;
                        break;
                    case 5:
                        age = 30;
                        break;
                }
                House house = new House();
                Patient patient= new Patient(name.get(i),lastname.get(i),age);
                patient.setFirstname(name.get(i));
                patient.setLastname(lastname.get(i));
                patient.setAge(age);
                
                city.setCity("boston");
                personDirectory.personList.add(patient);
                ArrayList<Encounter> encounterHistoryl = new ArrayList<>();
                if(i%2 == 0){
                    
                    community.setCommunityName("A");
                    house.setHouseNumber(i+1);
                    house.setZipcode("02215");
                    house.setStreetName("Park drive");
                }else{
                    
                    community.setCommunityName("B");
                    house.setHouseNumber(i+1);
                    house.setZipcode("02130");
                    house.setStreetName("Boylston street");
                }
                
                patient.setEncounter(listEncounters.get(i));
                encounterHistoryl.add(patient.getEncounter());
                patient.setEncounterHistory(encounterHistoryl);
                patientDirectory.patientList.add(patient);
                house.setPatient(patient);
                community.getHouseList().add(house);
                
                city.communityList.add(community);
                fullSystem.setCity(city);
                
                
                                
                
        }   
        
                
        patientDirectory.getPatientsList();
    }
}
