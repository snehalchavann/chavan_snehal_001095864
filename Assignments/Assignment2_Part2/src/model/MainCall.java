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

/**
 *
 * @author snehalchavan
 */
public class MainCall {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Patient patient = null;
        VitalSigns vitalSigns;
        boolean result = false;

        ArrayList<Patient> arrList = new ArrayList<>();
        ArrayList<VitalSigns> vitalSignsList = new ArrayList<>();
        VitalSigns current=null;
        
        Scanner sc = new Scanner(System.in);
        boolean res = false;
        do{
        
        System.out.println("Enter number based on your choice from the menu below: \n 1.Add New Patient \n 2.Add vital signs for existing patient \n 3.Display current Vital Sign details \n 4.Display history of Vital Signs \n 5.Display all data \n 6.Is this vital sign normal \n 7.Exit");
        int input = sc.nextInt();
        switch(input){
            case 1 : 
                sc.nextLine();
                patient = new Patient();
                vitalSigns = new VitalSigns();
                System.out.println("Enter First Name:");
                String fname = sc.nextLine();
                patient.setFirstname(fname);
                //sc.nextLine();
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
                LocalTime now = LocalTime.now();
                String timeCurrent = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
                
                patient.setLastname(lname);
                patient.setAge(age);

                VitalSigns vitalObjectNew = patient.newVitalSign(patient,vitalSignsList,respRate,heartRate,bloodPressure,weightKilos,weightPounds);
                current = vitalSigns;
                arrList.add(patient);
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
                    
                    Patient findName = patient.FindName(firstname, arrList);
                    if(findName != null){
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
                        VitalSigns vitalObject = patient.newVitalSign(findName,vitalSignsList,respRate,heartRate,bloodPressure,weightKilos,weightPounds);
                        current = vitalObject;
                    
                    }else{
                        System.out.println("Patient not exit");
                    }
                }catch(NullPointerException e){
                    System.out.println("Add atleast one patient");
                }
                
                break;
            
            case 3:
                try{
                    System.out.println("Enter Patient's first name:");
                    String firstnameCurrent = sc.nextLine();
                    Patient showCurrent = patient.FindName(firstnameCurrent, arrList);
                    patient.DisplayVitalSignsHistoryCurrent(showCurrent,current);
                }catch(NullPointerException e){
                    System.out.println("No Patients in the list");
                }
                break;
                
            case 4:
                if(vitalSignsList.size() > 1){
                    sc.nextLine();
                    System.out.println("Enter Patient's first name:");
                    String firstnameHistory = sc.nextLine();
                    Patient showPrevious = patient.FindName(firstnameHistory, arrList);
                    patient.DisplayVitalSignsHistoryPrevious(showPrevious,arrList);
                }else{
                    System.out.println("Atleast 2 entries of Vital signs should be there. You can view yourcurrent details using show current details.");
                }
                break;
                
            case 5:
                try{
                    sc.nextLine();
                    System.out.println("Enter Patient's first name:");
                    String firstnamee = sc.nextLine();
                    Patient showName = patient.FindName(firstnamee, arrList);
                    patient.DisplayVitalSignsHistory(showName,arrList);
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

                    System.out.println("Enter Patient's first name:");
                    String patientName = sc.nextLine();
                    Patient patientObj = patient.FindName(patientName, arrList);
                    double patientAge = patientObj.getAge();
                    boolean resultSign = patient.isThisVitalSignNormal(signName);
                    
                    if(resultSign == true){
                            boolean ageGroup = patient.getAgeGroup(patientAge,signName,patientObj);
                            if(ageGroup == true){
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
