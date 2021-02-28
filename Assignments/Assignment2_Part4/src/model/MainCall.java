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
import java.util.Scanner;



/**
 *
 * @author snehalchavan
 */
public class MainCall {
    public static void main(String[] args) {
        Patient patient = null;
        Person person = null;
        VitalSigns vitalSigns;
        Encounter encounter = null;
        House house;
        City city = new City();;
        Community community = new Community();;
        FullSystem fullSystem = new FullSystem();
        boolean result = false;
        PatientDirectory patientDirectory = new PatientDirectory();
        PersonDirectory personDirectory = new PersonDirectory();
        //EncounterHistory encounterHistory;
//        ArrayList<Patient> patientList = new ArrayList<>();
//        ArrayList<Person> personList = new ArrayList<>();
        ArrayList<VitalSigns> vitalSignsList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean res = false;
        do{
        
        System.out.println("Enter number based on your choice from the menu below: \n 1.Add New Patient \n 2.Add vital signs for existing patient \n 3.Display current Vital Sign details for Patient \n 4.Display history of Vital Signs of patient \n 5.Display data of all patients \n 6.Is this vital sign normal \n 7.Display Patient's list \n 8.Create data \n 9.Abnormal cases \n 10.Exit");
        int input = sc.nextInt();
        switch(input){
            case 1 : 
                sc.nextLine();
                encounter = new Encounter();
                house = new House();
                
                //encounterHistory = new EncounterHistory();
                ArrayList<Encounter> encounterHistory = new ArrayList<>();
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
                sc.nextLine();
                System.out.println("Enter street name:");
                String streetName = sc.nextLine();
                System.out.println("Enter house number:");
                int houseNo = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter zipcode 02215 or 02130:");
                String zipcode = sc.nextLine();
                
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
                LocalTime now = LocalTime.now();
                String timeCurrent = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
                patient= new Patient(fname,lname,age);
                patient.setFirstname(fname);
                patient.setLastname(lname);
                patient.setAge(age);
                house.setHouseNumber(houseNo);
                house.setStreetName(streetName);
                house.setZipcode(zipcode);

                personDirectory.personList.add(patient);
                VitalSigns vitalObjectNew = patient.newVitalSign(patient,respRate,heartRate,bloodPressure,weightKilos,weightPounds);
                encounter.setVitalSigns(vitalObjectNew);
                encounter.setCurrentTime(timeCurrent);
                patient.setEncounter(encounter);
                encounterHistory.add(encounter);
//                System.out.println("Type community name:A or B:");
//                String communityName = sc.nextLine();
                if(zipcode.equals("02215")){
                    community.setCommunityName("A");
                }else{
                    community.setCommunityName("B");
                }
                city.setCity("Boston");
                patient.setEncounterHistory(encounterHistory);
                house.setPatient(patient);
                community.houseList.add(house);
                
                
                city.setCommunity(community);
//                city.communityList.add(community);
                patientDirectory.patientList.add(patient);
                fullSystem.setCity(city);
                result = patient.isPatientNormal(age,respRate,heartRate,bloodPressure,weightKilos,weightPounds);
                if(result != true) {
                    System.out.println("Patient is not normal");
                }
                 else {
                    System.out.println("Patient is normal");
                }
                
                break;
                
            case 2:
                try{
                    sc.nextLine();
                    System.out.println("Enter Patient's first name:");
                    String firstname = sc.nextLine();
                    LocalTime now1 = LocalTime.now();
                    String timeCurrent1 = now1.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
                
                    
                    Patient patientNamee = patient.FindName(firstname, patientDirectory.patientList);
                    if(patientNamee != null){
                        System.out.println("Enter Patient's Respiratory Rate:");
                        respRate = sc.nextDouble();
                        System.out.println("Enter Patient' Heart Rate:");
                        heartRate = sc.nextDouble();
                        System.out.println("Enter Patient's Blood Pressure:");
                        bloodPressure = sc.nextDouble();
                        System.out.println("Enter Patient's Weight in Kilos:");
                        weightKilos = sc.nextDouble();
                        System.out.println("Enter Patient's Weight in Pounds:");
                        weightPounds = sc.nextDouble();
                        VitalSigns vitalObject = patient.newVitalSign(patientNamee,respRate,heartRate,bloodPressure,weightKilos,weightPounds);
                        
                        encounter = new Encounter();
                        encounter.setVitalSigns(vitalObject);
                        encounter.setCurrentTime(timeCurrent1);
                        patientNamee.encounterHistory.add(encounter);
                    }else{
                        System.out.println("Patient not exit");
                    }
                }catch(NullPointerException e){
                    System.out.println("Add atleast one patient");
                }
                
                break;
            
            case 3:
                try{
                    sc.nextLine();
                    System.out.println("Enter Patient's first name:");
                    String firstnameCurrent = sc.nextLine();
                    Patient showCurrent = patient.FindName(firstnameCurrent,patientDirectory.patientList);
//                    patient.DisplayEncounterHistoryCurrent(firstnameCurrent,showCurrent,patientDirectory.patientList);
                    patientDirectory.DisplayEncounterHistoryCurrent(firstnameCurrent,showCurrent);
                }catch(NullPointerException e){
                    System.out.println("No Patients in the list");
                }
                break;
                
            case 4:
                try{
                    sc.nextLine();
                    System.out.println("Enter Patient's first name:");
                    String firstnameHistory = sc.nextLine();
                    Patient showPrevious = patient.FindName(firstnameHistory, patientDirectory.patientList);
//                    patient.DisplayVitalSignsHistoryPrevious(firstnameHistory,showPrevious,patientDirectory.patientList);
                    patientDirectory.DisplayVitalSignsHistoryPrevious(firstnameHistory,showPrevious);
                }catch(NullPointerException e){
                    System.out.println("Atleast 2 entries of Vital signs should be there. You can view yourcurrent details using show current details.");
                }
                break;
                
            case 5:
                try{
//                    patient.DisplayEncounterHistory(patientDirectory.patientList);
                    patientDirectory.DisplayEncounterHistory();
                }catch(NullPointerException e){
                    System.out.println("No Patients in the list");
                }
                break;
                
            case 6:
                try{
                    System.out.println("select Vital sign's name you want to search: \n 1.Respiratory Rate \n 2.Heart Rate \n 3.Blood Pressure \n 4.Weight in Kilos \n 5.Weight in pounds");
                    int choice1 = sc.nextInt();
                    String signName="hi";
                
                    switch(choice1){
                        case 1:
                            signName="respiratoryRate";
                            break;
                        case 2:
                            signName="heartRate";
                            break;
                        case 3:
                            signName="bloodPressure";
                            break;
                        case 4:
                            signName="weightKilos";
                            break;
                        case 5:
                            signName="weightPounds";
                            break;

                    }
                    sc.nextLine();
                    System.out.println("Enter Patient's first name:");
                    String patientName1 = sc.nextLine();
                    Patient patientObj = patient.FindName(patientName1, patientDirectory.patientList);
                    double patientAge = patientObj.getAge();
                    boolean resultSign = patient.isThisVitalSignNormal(signName);
                    
                    if(resultSign == true){
                            boolean rangeResult = patient.checkVitalSignRange(patientAge,signName,patientObj);
                            if(rangeResult == true){
                                System.out.println("Vital sign range is normal");
                            }else{
                                System.out.println("Vital sign range is not normal");
                            }
                    }else{
                        System.out.println("Entered attribute doesn't exist.");
                    }
                }catch(NullPointerException e){
                    System.out.println("No Patients in the list");
                }
                break;    
                
            case 7:
                
                patientDirectory.getPatientsList();
                break;
                
            case 8:
                patient = new Patient("manny","fox",20);
                patient.addData(patientDirectory,personDirectory,city,community,fullSystem);
                System.out.println("model.MainCall.main()"+patientDirectory.patientList.size());
                       break;
                       
            case 9:
                community.getAbnormalCount();
                break;
                
            case 10:
                System.exit(0);

        }
        
        
                
        
                
            System.out.println("Do you want to continue(Y/N)");
            String choice = sc.next();
            
            if("y".equals(choice) || "Y".equals(choice)) {
                res = true;
            } else if("n".equals(choice) || "N".equals(choice)){
                    res = false;
            }
    }while(res != false);
    }
}
