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

//enum Location {
//    STACJA1, STACJA2, STACJA3
//}

enum State {
    AVAILABLE, UNAVAILABLE
}

public class Bicycle {
    private int bicycleId;
    private String Station;
    
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
    
    public void makeAvaliable(){
        this.status = State.AVAILABLE;
    }
    
    public void makeUnavaliable(){
        this.status = State.UNAVAILABLE;
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
