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
    
    Bicycle bicycle1 = new Bicycle(1, Location.STACJA3);

    static List<Bicycle> allBicycle = new ArrayList<Bicycle>();
    
    
    public BicycleRecord(){ //constructor
        
        allBicycle.add(bicycle1);
    
    }
    
    public void AddBicycle(){
        
    }
        
    
    static void removeBicycleFromRecord(){
        for (Bicycle bicycle : allBicycle) {
            System.out.println(bicycle.getLocation());
        }
    }
}
