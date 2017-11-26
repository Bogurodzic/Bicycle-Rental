/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bicycle;
import java.util.*;
/**
 *
 * @author bogurodzica
 */
public class BicycleRecord {
    
 

    public List<Bicycle> allBicycle = new ArrayList<Bicycle>();
    
    
    public BicycleRecord(){ //constructor
        
        allBicycle.add(new Bicycle(1, "Station1"));
        allBicycle.add(new Bicycle(2, "Station2"));
        allBicycle.add(new Bicycle(3, "Station3"));
    
    } 
    
        public void getAllBicycle(){

        for (int i = 0; i < allBicycle.size(); i++){
            System.out.println("Bicycle " 
                                + allBicycle.get(i).getBicycleId()+" "
                                + allBicycle.get(i).getStation()+" "
                                + allBicycle.get(i).getState());
        } 
    }
        
        public void makeUnavailable(int bicycleId){

        for (int i = 0; i < allBicycle.size(); i++){
            if(bicycleId == allBicycle.get(i).getBicycleId()){
                allBicycle.get(i).makeUnavaliable();
                }
            }
        }
    
        public void makeAvailable(int bicycleId){

            for (int i = 0; i < allBicycle.size(); i++){
                if(bicycleId == allBicycle.get(i).getBicycleId()){
                    allBicycle.get(i).makeAvaliable();
                }

            }
        }
        
        public void addBicycle(int bicycleId, String Station){
            
        allBicycle.add(new Bicycle(bicycleId, Station));
        
        }
    
        public void removeBicycle(int bicycleId){
            
            for (int i = 0; i < allBicycle.size(); i++){
                if( bicycleId == allBicycle.get(i).getBicycleId()){
                   allBicycle.remove(allBicycle.get(i));
                }
            }  
        }
      
    
    
    
        
}
