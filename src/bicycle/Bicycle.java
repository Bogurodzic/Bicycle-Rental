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

enum Location {
    STACJA1, STACJA2, STACJA3
}

enum State {
    AVALIABLE, UNAVALIABLE
}

public class Bicycle {
    private int bicycleId;
    private int userId = 0;
    
    private State status = State.AVALIABLE;
    private Location location;
    
    public Bicycle(int bicycleId,  Location location){
        this.bicycleId = bicycleId;
        this.location = location;
    }
    
    public int getBicycleId(){
        return this.bicycleId;
    }
    
    public int getUserId(){
        return this.userId;
    }
    
    public void changeUserId(int userId){
        this.userId = userId;
    }
    
    public void makeAvaliable(){
        this.status = State.AVALIABLE;
    }
    
    public void makeUnavaliable(){
        this.status = State.UNAVALIABLE;
    }
    
    public void changeLocation(Location location){
        this.location = location;
    }
    
    public Location getLocation(){
        return this.location;
    }
}
