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
    
        Bicycle bicycle1 = new Bicycle(1, 4, Bicycle.Location.STACJA10);
        Bicycle bicycle2 = new Bicycle(2, 4, Bicycle.Location.STACJA9);
        Bicycle bicycle3 = new Bicycle(3, 4, Bicycle.Location.STACJA9);
        Bicycle bicycle4 = new Bicycle(4, 4, Bicycle.Location.STACJA9);
        Bicycle bicycle5 = new Bicycle(5, 4, Bicycle.Location.STACJA5);
    
    
    static List<Bicycle> allBicycle = new ArrayList<Bicycle>();
    
        
    public BicycleRecord(){ //constructor
        
        allBicycle.add(bicycle1);
        allBicycle.add(bicycle2);
        allBicycle.add(bicycle3);
        allBicycle.add(bicycle4);
        allBicycle.add(bicycle5);
    
    }
    
    public void AddBicycle(){
        
    }
        
    
    static void removeBicycleFromRecord(){
        for (Bicycle bicycle : allBicycle) {
            System.out.println(bicycle.getLocation());
        }
    }
}
