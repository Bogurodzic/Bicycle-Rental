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
    private int timeLimit = 5;
    private String Station;
    private long rentTime;
    private long returnTime = 0;
    private long rentDuration;
    
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
        this.rentTime = new Date().getTime();
        //System.out.println(this.rentTime.toString());
//        System.out.println("You have rented bicycle");
    }
    
    private void returnTime(){
        this.returnTime = new Date().getTime();
        //System.out.println(this.returnTime.toString());
//        System.out.println("You have returned bicycle");
    }
    
    public void handleRentRequest(){
        this.makeUnavaliable();
        this.rentTime();
    }
    
    public void handleReturnRequest(){
        this.makeAvaliable();
        this.returnTime();
        this.calculatTimeDifference();
    }
    
    public void calculatTimeDifference(){
        if(this.returnTime > 0 || this.returnTime > this.rentTime){
            this.rentDuration = (this.returnTime - this.rentTime)/1000;      
        } else {
            this.rentDuration = (new Date().getTime() - this.rentTime)/1000;      
        }
    }
    
    public boolean isRentTimeExceed(){
        return this.rentDuration>this.timeLimit;
    }
    
    public String handleRentTime(){
        calculatTimeDifference();
        if(this.isRentTimeExceed()){
            return "Przekroczono czas usługi";
        } else {
            return "Zostało jeszcze " + (this.timeLimit - this.rentDuration) + "s";
        }
    };
    
    
    

    
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
