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
    
    public boolean isBicycleRented(){
        if(this.bicycleId > 0){
            return true;
        } else {
            return false;
        }
    }
    
    
    public void setBicycleId(int bicycleId){
        this.bicycleId = bicycleId;
    }
    
    public void rentBicycle(int bicycleId){
        if(this.isBicycleRented()){
           System.out.println("You have already rented bicycle");
        } else {
            this.setBicycleId(bicycleId);
            handleRentRequest(bicycleId);
        }
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
    
    public int rentBicycle(int bicycleId, int userId){
       int id = 0;
       
       for (int i = 0; i < UserRecord.allUsers.size(); i++){
            if( userId == UserRecord.allUsers.get(i).getUserId()){
               UserRecord.allUsers.get(i).rentBicycle(bicycleId);
               id = UserRecord.allUsers.get(i).getBicycleId();
            }
       }

       return id;
    }

    public void returnBicycle(int bicycleId, int userId){
        
        for (int i = 0; i < UserRecord.allUsers.size(); i++){
            if( userId == UserRecord.allUsers.get(i).getUserId() && UserRecord.allUsers.get(i).getBicycleId() > 0 ){
               UserRecord.allUsers.get(i).setBicycleId(0);
               handleReturnRequest(bicycleId);
            }
        }
        
    }
    
    private void handleRentRequest(int bicycleId){

        for (int i = 0; i < BicycleRecord.allBicycle.size(); i++){
            if(bicycleId == BicycleRecord.allBicycle.get(i).getBicycleId()){
                BicycleRecord.allBicycle.get(i).handleRentRequest();
            }
        }
    }
    
    private void handleReturnRequest(int bicycleId){
        
        for (int i = 0; i < BicycleRecord.allBicycle.size(); i++){
            if(bicycleId == BicycleRecord.allBicycle.get(i).getBicycleId()){
                BicycleRecord.allBicycle.get(i).handleReturnRequest();
            }
            
        }
    }
    
    
    
}
