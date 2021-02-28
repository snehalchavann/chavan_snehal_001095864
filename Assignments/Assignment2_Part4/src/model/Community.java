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
public class Community {
    ArrayList<House> houseList = new ArrayList<>();
    String communityName;

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public ArrayList<House> getHouseList() {
        return houseList;
    }

    public void setHouseList(ArrayList<House> houseList) {
        this.houseList = houseList;
    }

    void getAbnormalCount() {
        int counter =0;
        int counterB = 0;
        
                
        System.out.println("house"+houseList.size());
        
        for(int i = 0; i< houseList.size();i++){
            
            House house = houseList.get(i);
            
            Patient patient = house.getPatient();
            System.out.println("patient:::::"+houseList.get(i).getZipcode());
                        
            ArrayList<Encounter> encounter = patient.getEncounterHistory();
            VitalSigns currentobj = encounter.get(encounter.size()-1).getVitalSigns();
            double current = currentobj.getBloodPressure();
            
            if(houseList.get(i).getZipcode().equals("02215")){
                System.out.println("in comm A:");
                if(patient.getAge() == 0){
                    
                    if(!(current >= 50 && current<=70)){
                        
                        counter++;
                        System.out.println("counter"+counter);
                    }
                }else if(patient.getAge() == 0.5){
                    if(!(current>=70 && current<=100)){
                        counter++;
                        System.out.println("counter"+counter);
                    }
                }else if((patient.getAge() >=1 && patient.getAge() <=3)||(patient.getAge() >3 && patient.getAge() <=5)){
                    if(!(current>=80 && current<=110)){
                        counter++;
                        System.out.println("counter"+counter);
                    }
                }else if(patient.getAge() >=6 && patient.getAge() <=12){
                    if(!(current>=80 && current<=120)){
                        counter++;
                        System.out.println("counter"+counter);
                    }
                }else if(patient.getAge() > 12){
                    if(!(current>=110 && current<=120)){
                        System.out.println("in comm A");
                        counter++;
                        System.out.println("counter"+counter);
                    }
                }
            }else if(houseList.get(i).getZipcode().equals("02130")){
                System.out.println("in comm B:");
                if(patient.getAge() == 0){
                    if(!(current>=50 && current<=70)){
                        counterB++;
                        System.out.println("counterb:"+counter);
                    }
                }else if(patient.getAge() == 0.5){
                    if(!(current>=70 && current<=100)){
                        counterB++;
                        System.out.println("counterb:"+counter);
                    }
                }else if((patient.getAge() >=1 && patient.getAge() <=3)||(patient.getAge() >3 && patient.getAge() <=5)){
                    if(!(current>=80 && current<=110)){
                        counterB++;
                        System.out.println("counterb:"+counter);
                    }
                }else if(patient.getAge() >=6 && patient.getAge() <=12){
                    if(!(current>=80 && current<=120)){
                        counterB++;
                        System.out.println("counterb:"+counter);
                    }
                }else{
                    if(!(current>=110 && current<=120)){
                        counterB++;
                        System.out.println("counterb:"+counter);
                    }
                }
            }
        
        
    }
        System.out.println("Abnormal patient's count in Community A: \t"+counter);
        System.out.println("Abnormal patient's count in Community B: \t"+counterB);
    }
}
   
