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
        
        int userId;
        
        BicycleRecord BicycleRecord = new BicycleRecord();
        UserRecord UserRecord = new UserRecord();
        
        Scanner reader = new Scanner(System.in);
        System.out.println("\tWelcome!\n");
        
        System.out.print("Please log in!\nUser id: ");
        
        
        if(reader.hasNextInt()){
            userId = reader.nextInt();
            
            if(UserRecord.ifExists(userId)){
                //System.out.println("Index of user in list: " + UserRecord.getIndexOfUser(userId));
                //System.out.println("Id of user: " + UserRecord.allUsers.get(UserRecord.getIndexOfUser(userId)).getId());
                
                if(UserRecord.allUsers.get(UserRecord.getIndexOfUser(userId)).getRole() == User.Role.ADMIN){
                    System.out.println("\tWelcome Admin " + UserRecord.allUsers.get(UserRecord.getIndexOfUser(userId)).getName());
                    // TODO: menu for admin
                }
                else{
                    System.out.println("\tWelcome " + UserRecord.allUsers.get(UserRecord.getIndexOfUser(userId)).getName() );
                    // TODO menu for user
                }
                
            }
            else{
                System.out.println("\tUser doesn't exist!");
            }

        }
        else{
            System.out.println("\tInvalid input!");
        }

//        BicycleRecord.bicycle1.addUserId(userId);
//        
//        System.out.println(UserRecord.allUsers.get(0).getId());
//        System.out.println(BicycleRecord.allBicycle.get(0).getUserId());
//        System.out.println(BicycleRecord.allBicycle.get(0).getBicycleId());
//        System.out.println(BicycleRecord.allBicycle.get(1).getBicycleId());
//        BicycleRecord.removeBicycleFromRecord();
       
    }
    
}
