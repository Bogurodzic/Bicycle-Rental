/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bicycle;
import java.util.Date;
/**
 *
 * @author bogurodzica
 */

//enum Location {
//    STACJA1, STACJA2, STACJA3
//}

enum State {
    AVAILABLE, UNAVAILABLE
}

public class Bicycle {
    private int bicycleId;
    private String Station;
    private Date rentTime;
    private Date returnTime;
    
    private State status = State.AVAILABLE;
    //private Location location;
    
    public Bicycle(int bicycleId,  String Station){
        this.bicycleId = bicycleId;
        //this.location = location;
        this.Station = Station;
    }
    
    public int getBicycleId(){
        return this.bicycleId;
    }
    
    public State getState(){
        return this.status;
    } 
    
    private void makeAvaliable(){
        this.status = State.AVAILABLE;
    }
    
    private void makeUnavaliable(){
        this.status = State.UNAVAILABLE;
        
    }
    
    private void rentTime(){
        this.rentTime = new Date();
        //System.out.println(this.rentTime.toString());
        System.out.println("You have rented bicycle");
    }
    
    private void returnTime(){
        this.returnTime = new Date();
        //System.out.println(this.returnTime.toString());
        System.out.println("You have rented bicycle");
    }
    
    public void handleRentRequest(){
        this.makeUnavaliable();
        this.rentTime();
    }
    
    public void handleReturnRequest(){
        this.makeAvaliable();
        this.returnTime();
    }
    

    
//    public void changeLocation(Location location){
//        this.location = location;
//    }
//    
//    public Location getLocation(){
//        return this.location;
//    }
    
    public void changeStation(String Station){
        this.Station = Station;
    }
    
    public String getStation(){
        return this.Station;
    }
    
}
