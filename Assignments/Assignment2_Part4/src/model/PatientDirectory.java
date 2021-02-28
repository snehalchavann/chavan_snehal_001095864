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
public class PatientDirectory {
    ArrayList<Patient> patientList = new ArrayList<>();

    void getPatientsList() {
        for(int i=0;i<patientList.size();i++){
                    Patient p = patientList.get(i);
                    System.out.println("Patient Name: "+p.getFullname()+"\t"+"Number of visits: "+p.encounterHistory.size());
                }
    }

    void DisplayEncounterHistory() {
        for(int i=0;i<patientList.size();i++){
                ArrayList<Encounter> encounterHistory = patientList.get(i).getEncounterHistory();
                System.out.println("Patient Name: "+patientList.get(i).getFullname());
                    for(int j=0;j<encounterHistory.size();j++){
                        System.out.println("Encounter number: "+(j+1));
                        System.out.println("Resp rate"+":"+encounterHistory.get(j).getVitalSigns().getRespiratoryRate());
                        System.out.println("Heart rate"+":"+encounterHistory.get(j).getVitalSigns().getHeartRate());
                        System.out.println("Blood Pressure"+":"+encounterHistory.get(j).getVitalSigns().getBloodPressure());
                        System.out.println("Weight in Kilos"+":"+encounterHistory.get(j).getVitalSigns().getWeightKilos());
                        System.out.println("Weight in Pounds"+":"+encounterHistory.get(j).getVitalSigns().getWeightPounds());
                        System.out.println("Time"+":"+encounterHistory.get(j).getCurrentTime());
                    }
                    
                    
                }
    }

    void DisplayVitalSignsHistoryPrevious(String firstnameHistory, Patient showPrevious) {
        String name = showPrevious.getFullname();
        System.out.println("Name"+name);
        ArrayList<Encounter> encounterHistory = showPrevious.getEncounterHistory();
        for(int j=0;j<encounterHistory.size();j++){
            System.out.println("Encounter History: "+(j+1));
            System.out.println("Respiratory rate:"+encounterHistory.get(j).getVitalSigns().getRespiratoryRate());
            System.out.println("Heart rate:"+encounterHistory.get(j).getVitalSigns().getHeartRate());
            System.out.println("Blood Pressure:"+encounterHistory.get(j).getVitalSigns().getBloodPressure());
            System.out.println("Weight in Kilos:"+encounterHistory.get(j).getVitalSigns().getWeightKilos());
            System.out.println("Weight in Pounds:"+encounterHistory.get(j).getVitalSigns().getWeightPounds());
            System.out.println("Time"+":"+encounterHistory.get(j).getCurrentTime());
        }
    }

    void DisplayEncounterHistoryCurrent(String firstnameCurrent, Patient showCurrent) {
        String name = showCurrent.getFullname();
        System.out.println("Name"+name);
        
        ArrayList<Encounter> encounterHistory = showCurrent.getEncounterHistory();
        int sizeList = encounterHistory.size();
            System.out.println("Recent Encounter: ");
            System.out.println("Resp rate"+":"+encounterHistory.get(sizeList-1).getVitalSigns().getRespiratoryRate());
            System.out.println("Heart rate"+":"+encounterHistory.get(sizeList-1).getVitalSigns().getHeartRate());
            System.out.println("Blood Pressure"+":"+encounterHistory.get(sizeList-1).getVitalSigns().getBloodPressure());
            System.out.println("Weight in Kilos"+":"+encounterHistory.get(sizeList-1).getVitalSigns().getWeightKilos());
            System.out.println("Weight in Pounds"+":"+encounterHistory.get(sizeList-1).getVitalSigns().getWeightPounds());
            System.out.println("Time"+":"+encounterHistory.get(sizeList-1).getCurrentTime());
    }
}
