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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BicycleRecord BicycleRecord = new BicycleRecord();
        UserRecord UserRecord = new UserRecord();
        
        Scanner reader = new Scanner(System.in);
        System.out.println("\tWelcome!\n");
        System.out.println("Please log in!\nUser id: ");
        int userId = reader.nextInt();
        
        if(UserRecord.ifExists(userId)){
           System.out.println("Index of user in list: " + UserRecord.getIndexOfUser(userId));
           System.out.println("Id if user: " + UserRecord.allUsers.get(UserRecord.getIndexOfUser(userId)).getId());
        }
        else{
            System.out.println("User doesn't exist!");
        }
        //for( user : allUsers)
 
        
        
        
        
                
     
        
        
        
//        BicycleRecord.bicycle1.addUserId(userId);
//        
//        System.out.println(UserRecord.allUsers.get(0).getId());
//        System.out.println(BicycleRecord.allBicycle.get(0).getUserId());
//        System.out.println(BicycleRecord.allBicycle.get(0).getBicycleId());
//        System.out.println(BicycleRecord.allBicycle.get(1).getBicycleId());
//            BicycleRecord.removeBicycleFromRecord();
       
    }
    
}
