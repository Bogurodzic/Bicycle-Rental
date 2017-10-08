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
    private float bicycleId;
    private int wheelsNumber;
    static enum State {
        AVALIABLE, UNAVALIABLE, BROKEN, SERVICE
    }
    private State status = State.AVALIABLE;
    private int userId = 0;
    
    public Bicycle(float bicycleId, int wheelsNumber){
        this.bicycleId = bicycleId;
        this.wheelsNumber = wheelsNumber;
    }
    
    public float getBicycleId(){
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
}
