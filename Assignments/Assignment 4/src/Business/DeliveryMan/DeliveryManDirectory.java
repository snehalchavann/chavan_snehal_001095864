/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class DeliveryManDirectory {
    private ArrayList<DeliveryMan> deliverymanList;

    public DeliveryManDirectory() {
        deliverymanList = new ArrayList();
    }

    public ArrayList<DeliveryMan> getDeliverymanList() {
        return deliverymanList;
    }
    
    public DeliveryMan createDeliveryMan(String name){
        DeliveryMan deliveryman = new DeliveryMan();
        deliveryman.setName(name);
        deliverymanList.add(deliveryman);
        return deliveryman;
    }
}
