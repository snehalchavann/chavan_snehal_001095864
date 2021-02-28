/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author snehalchavan
 */
public class MainCall {
    public static void main(String[] args) {
        Patient patient = null;
        Person person = null;
        VitalSigns vitalSigns = null;
        Encounter encounter = null;
        boolean result = false;
        PatientDirectory patientDirectory = new PatientDirectory();
        PersonDirectory personDirectory = new PersonDirectory();
//        ArrayList<VitalSigns> vitalSignsList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean res = false;
        do{
        
        System.out.println("Enter number based on your choice from the menu below: \n 1.Add New Patient \n 2.Add vital signs for existing patient \n 3.Patient's data from current visit \n 4.Patient's data of all visits \n 5.All patient's data \n 6.Check for particular sign \n 7.Display Patient's list \n 8.Exit");
        int input = sc.nextInt();
        switch(input){
            case 1 : 
                sc.nextLine();
                encounter = new Encounter();
                ArrayList<Encounter> encounterHistory = new ArrayList<>();
                System.out.println("Enter First Name:");
                String fname=sc.nextLine();
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
                    
                }
                if(age >=0 && age < 1){
                    age = 0;
                }else{
                    age = 0.5;
                }
                
                System.out.println("Enter Patient's Respiratory Rate:");
                while (!sc.hasNextDouble()) {
                        System.out.println("Invalid input.Enter valid number.");
                        sc.next(); // this is important!
                    }
                double respRate = sc.nextDouble();
                System.out.println("Enter Patient' Heart Rate:");
                while (!sc.hasNextDouble()) {
                        System.out.println("Invalid input.Enter valid number.");
                        sc.next(); // this is important!
                    }
                double heartRate = sc.nextDouble();
                System.out.println("Enter Patient's Blood Pressure:");
                while (!sc.hasNextDouble()) {
                        System.out.println("Invalid input.Enter valid number.");
                        sc.next(); // this is important!
                    }
                double bloodPressure = sc.nextDouble();
                System.out.println("Enter Patient's Weight in Kilos:");
                while (!sc.hasNextDouble()) {
                        System.out.println("Invalid input.Enter valid number.");
                        sc.next(); // this is important!
                    }
                double weightKilos = sc.nextDouble();
                System.out.println("Enter Patient's Weight in Pounds:");
                while (!sc.hasNextDouble()) {
                        System.out.println("Invalid input.Enter valid number.");
                        sc.next(); // this is important!
                    }
                double weightPounds = sc.nextDouble();
                LocalTime now = LocalTime.now();
                String timeCurrent = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
                patient= new Patient(fname,lname,age);
                patient.setFirstname(fname);
                patient.setLastname(lname);
                patient.setAge(age);

                personDirectory.personList.add(person);
                VitalSigns vitalObjectNew = patient.newVitalSign(patient,respRate,heartRate,bloodPressure,weightKilos,weightPounds);
                encounter.setVitalSigns(vitalObjectNew);
                encounter.setCurrentTime(timeCurrent);
                patient.setEncounter(encounter);
                encounterHistory.add(encounter);
                
                patient.setEncounterHistory(encounterHistory);
                patientDirectory.patientList.add(patient);
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
                
                    
                    Patient patientNamee = patientDirectory.FindName(firstname);
                    if(patientNamee != null){
                        System.out.println("Enter Patient's Respiratory Rate:");
                        while (!sc.hasNextDouble()) {
                        System.out.println("Invalid input.Enter valid number.");
                        sc.next(); // this is important!
                    }
                        respRate = sc.nextDouble();
                        System.out.println("Enter Patient' Heart Rate:");
                        while (!sc.hasNextDouble()) {
                        System.out.println("Invalid input.Enter valid number.");
                        sc.next(); // this is important!
                    }
                        heartRate = sc.nextDouble();
                        System.out.println("Enter Patient's Blood Pressure:");
                        while (!sc.hasNextDouble()) {
                        System.out.println("Invalid input.Enter valid number.");
                        sc.next(); // this is important!
                    }
                        bloodPressure = sc.nextDouble();
                        System.out.println("Enter Patient's Weight in Kilos:");
                        while (!sc.hasNextDouble()) {
                        System.out.println("Invalid input.Enter valid number.");
                        sc.next(); // this is important!
                    }
                        weightKilos = sc.nextDouble();
                        System.out.println("Enter Patient's Weight in Pounds:");
                        while (!sc.hasNextDouble()) {
                        System.out.println("Invalid input.Enter valid number.");
                        sc.next(); // this is important!
                    }
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
                    Patient showCurrent = patientDirectory.FindName(firstnameCurrent);
                    patient.DisplayEncounterHistoryCurrent(firstnameCurrent,showCurrent,patientDirectory.patientList);
                }catch(NullPointerException e){
                    System.out.println("No Patients in the list");
                }
                break;
                
            case 4:
                try{
                    sc.nextLine();
                    System.out.println("Enter Patient's first name:");
                    String firstnameHistory = sc.nextLine();
                    Patient showPrevious = patientDirectory.FindName(firstnameHistory);
                    patient.DisplayVitalSignsHistoryPrevious(firstnameHistory,showPrevious,patientDirectory.patientList);
                }catch(NullPointerException e){
                    System.out.println("Atleast 2 entries of Vital signs should be there. You can view yourcurrent details using show current details.");
                }
                break;
                
            case 5:
                try{
                    patient.DisplayEncounterHistory(patientDirectory.patientList);
                }catch(NullPointerException e){
                    System.out.println("No Patients in the list");
                }
                break;
                
            case 6:
                try{
                    System.out.println("select Vital sign's name you want to search: \n 1.Respiratory Rate \n 2.Heart Rate \n 3.Blood Pressure \n 4.Weight in Kilos \n 5.Weight in pounds");
                    int choice1 = sc.nextInt();
                    sc.nextLine();
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
                    System.out.println("Enter Patient's first name:");
                    String patientName1 = sc.nextLine();
                    System.out.println("model.MainCall.main()"+patientName1);
                    Patient patientObj = patientDirectory.FindName(patientName1);
                    double patientAge = patientObj.getAge();
                    System.out.println(">>>>>>>>>>"+patientAge);
                    boolean resultSign = vitalSigns.isThisVitalSignNormal(signName);
                    System.out.println(">>>>>>>>>>"+resultSign);
                    if(resultSign == true){
                            boolean rangeResult = vitalSigns.checkVitalSignRange(patientAge,signName,patientObj);
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
