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

enum Role {
    CYCLIST, ADMIN
}

public class User {
    
    private int bicycleId = 0;
    
    private int userId;
    private String name;
    private String surname;

    private Role role;
    
    public User(int id, String name, String surname, Role role){
        this.userId = id;
        this.name = name;
        this.surname = surname;
        this.role = role;
    }
    
    

////////////////////////////////////Operations on User///////////////////////////////////////    
  
    public int getUserId(){
        return this.userId;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getSurname(){
        return this.surname;
    }
    
    public Role getRole(){
        return this.role;
    } 
    
        public void getUserStatus(int userId){
        
        for (int i = 0; i < UserRecord.allUsers.size(); i++){
            if( userId == UserRecord.allUsers.get(i).getUserId() ){
                System.out.println(UserRecord.allUsers.get(i).getUserId()+" "
                                    +UserRecord.allUsers.get(i).getName()+" "
                                    +UserRecord.allUsers.get(i).getSurname()+" "
                                    +UserRecord.allUsers.get(i).getRole()+" "
                                    +UserRecord.allUsers.get(i).getBicycleId());
            }
        }
        
    }
    
    
    //////////////////////////////////////Operations on Bicycles///////////////////////////////////////
    
    
    public int getBicycleId(){
        return this.bicycleId;
    }
    
    
    public void setBicycleId(int bicycleId){
        this.bicycleId = bicycleId;
    }
    

    
//    public void setTimer(){
//        if( this.bicycleId > 0 && this.role != Role.ADMIN){
//            
//            
//            //add countdown from 20 minutes if, returnBicycle is invoked before timeout then set userId to 0
//            
//        }
//    }
    
    public void getAllBicycle(){

        for (int i = 0; i < BicycleRecord.allBicycle.size(); i++){
            System.out.println("Bicycle " 
                                + BicycleRecord.allBicycle.get(i).getBicycleId()+" "
                                + BicycleRecord.allBicycle.get(i).getStation()+" "
                                + BicycleRecord.allBicycle.get(i).getState());
        } 
    }
    
    public void rentBicycle(int bicycleId, int userId){
        
       for (int i = 0; i < UserRecord.allUsers.size(); i++){
            if( userId == UserRecord.allUsers.get(i).getUserId()){
               UserRecord.allUsers.get(i).setBicycleId(bicycleId);
               makeUnavailable(bicycleId);
               //start timer
            }
       }
       
    }

    public void returnBicycle(int bicycleId, int userId){
        
        for (int i = 0; i < UserRecord.allUsers.size(); i++){
            if( userId == UserRecord.allUsers.get(i).getUserId() && UserRecord.allUsers.get(i).getBicycleId() > 0 ){
               UserRecord.allUsers.get(i).setBicycleId(0);
               makeAvailable(bicycleId); //stop timer if timer didnt reached 0, if timer reached 0 set flag OVERDUE for user
            }
        }
        
    }
    
    private void makeUnavailable(int bicycleId){

        for (int i = 0; i < BicycleRecord.allBicycle.size(); i++){
            if(bicycleId == BicycleRecord.allBicycle.get(i).getBicycleId()){
                BicycleRecord.allBicycle.get(i).makeUnavaliable();
            }
        }
    }
    
    private void makeAvailable(int bicycleId){
        
        for (int i = 0; i < BicycleRecord.allBicycle.size(); i++){
            if(bicycleId == BicycleRecord.allBicycle.get(i).getBicycleId()){
                BicycleRecord.allBicycle.get(i).makeAvaliable();
            }
            
        }
    }
    
    
    
}
