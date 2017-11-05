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
    
 

    public static List<Bicycle> allBicycle = new ArrayList<Bicycle>();
    
    
    public BicycleRecord(){ //constructor
        
        allBicycle.add(new Bicycle(1, "Station1"));
        allBicycle.add(new Bicycle(2, "Station2"));
        allBicycle.add(new Bicycle(3, "Station3"));
    
    } 
    
    
    
        
}
