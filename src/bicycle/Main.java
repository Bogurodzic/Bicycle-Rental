/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bicycle;

/**
 *
 * @author bogurodzica
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bicycle bicycle1 = new Bicycle(1, 5, Bicycle.Location.STACJA10);
        Bicycle bicycle2 = new Bicycle(3, 8, Bicycle.Location.STACJA9);
//        System.out.println(bicycle1.getUserId());
        BicycleRecord.allBicycle.add(bicycle1);
        BicycleRecord.allBicycle.add(bicycle2);
//        System.out.println(BicycleRecord.allBicycle.get(0).getBicycleId());
        BicycleRecord.removeBicycleFromRecord();
    }
    
}
