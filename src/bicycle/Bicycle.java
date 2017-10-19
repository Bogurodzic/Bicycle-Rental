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
public class Bicycle {
    private int bicycleId;
    private int wheelsNumber;
    private int userId = 0;
    static enum State {
        AVALIABLE, UNAVALIABLE, BROKEN, SERVICE
    }
    static enum Location {
        STACJA1, STACJA2, STACJA3, STACJA4, STACJA5,
        STACJA6, STACJA7, STACJA8, STACJA9, STACJA10
    }
    private State status = State.AVALIABLE;
    private Location location;
    
    public Bicycle(int bicycleId, int wheelsNumber, Location location){
        this.bicycleId = bicycleId;
        this.wheelsNumber = wheelsNumber;
        this.location = location;
    }
    
    public int getBicycleId(){
        return this.bicycleId;
    }
    
    public int getWheelsNumber(){
        return this.wheelsNumber;
    }
    
    public int getUserId(){
        return this.userId;
    }
    
    public void addUserId(int userId){
        this.userId = userId;
    }
    
    public void changeState(State status){
        this.status = status;
    }
    
    public void changeLocation(Location location){
        this.location = location;
    }
    
    public Location getLocation(){
        return this.location;
    }
}
