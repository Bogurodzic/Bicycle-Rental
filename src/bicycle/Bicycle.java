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
    protected enum State {
        AVALIABLE, UNAVALIABLE, BROKEN, SERVICE
    }
    
    State status;
    private int userId;
    
    public Bicycle(float bicycleId, int wheelsNumber,State status, int userId){
        this.bicycleId = bicycleId;
        this.wheelsNumber = wheelsNumber;
        this.status = status;
        this.userId = userId;
    }
    
}