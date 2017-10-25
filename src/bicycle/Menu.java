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
public class Menu {
    
    private int userId;
    private int id;
    private String surname = null;
    private String name = null;
    private int option;
    
   UserRecord UserRecord = new UserRecord();
   BicycleRecord BicycleRecord = new BicycleRecord();
    
    public void start(){
        while(true){
        Scanner reader = initMessage();

            if(reader.hasNextInt()){ //consider while loop
                userId = reader.nextInt();
                
                switch(userId){
                    case(0):
                        exitMessage();
                }

                if(UserRecord.ifExists(userId)){
                    
                    if(UserRecord.allUsers.get(UserRecord.getIndexOfUser(userId)).getRole() == Role.ADMIN){
                        infoMessage();
                        Admin admin = new Admin(userId,
                                UserRecord.allUsers.get(UserRecord.getIndexOfUser(userId)).getName(),
                                UserRecord.allUsers.get(UserRecord.getIndexOfUser(userId)).getSurname());
                        adminMenu();
                            while(reader.hasNextInt()){
                                option = reader.nextInt();
                                switch(option){
                                    case(1): 
                                        System.out.println("\tADD USER");
                                        id = enterId(reader);
                                        name = enterName(reader);
                                        surname = enterSurname(reader);
                                        option = enterRole(reader);
                                            switch(option){
                                            case(1):
                                                admin.AddAdmin(id, name, surname);
                                                break;
                                            case(2):
                                                admin.AddCyclist(id, name, surname);
                                                break;
                                            }
                                        adminMenu();
                                        break;

                                    case(2):
                                        admin.getAllUsers();
                                        adminMenu();
                                        break;
                                        
                                    case(3):
                                        System.out.println("\tREMOVE USER");
                                        admin.getAllUsers();
                                        id = enterId(reader);
                                        admin.removeUser(id);
                                        admin.getAllUsers();
                                        adminMenu();
                                        break;
                                    case(4):
                                        start();
                                }
                            }
                    }
                    else{
                        //welcomeMessage();
                        infoMessage();
                        Cyclist cyclist = new Cyclist(userId,
                                UserRecord.allUsers.get(UserRecord.getIndexOfUser(userId)).getName(),
                                UserRecord.allUsers.get(UserRecord.getIndexOfUser(userId)).getSurname());
                        cyclistMenu();
                        
                        while(reader.hasNextInt()){
                                option = reader.nextInt();
                                switch(option){
                                    case(1):
                                        System.out.println("\tRENT BICYCLE:");
                                        cyclist.getAllBicycle();
                                        id = enterId(reader);
                                        cyclist.rentBicycle(id, userId);
                                        break;
                                    case(3):
                                        System.out.println("\tYOUR STATUS:");
                                        cyclist.getUserStatus(userId);
                                        break;
                                    case(4):
                                        start();
                            } 
                        } 
                    }
                }
                else{
                    userDoesNotExistMessage();
                }
            }
            else{
                invalidInputMessage();
            }
        }
    }
    
    
    private Scanner initMessage(){
        System.out.println("\tWELCOME!\n");
        System.out.println("Please log in!\nOr press 0 to exit\nUser id: ");
        return new Scanner(System.in);
    }
    
    private void exitMessage(){
        System.out.println("Closing... \n \tThank you! ");
        System.exit(0);
    }
    
    private void infoMessage(){
        System.out.println("\tWelcome " + 
                UserRecord.allUsers.get(UserRecord.getIndexOfUser(userId)).getRole() + " " +
                UserRecord.allUsers.get(UserRecord.getIndexOfUser(userId)).getName());
        System.out.println("Menu: \n");
    }
    
    private void adminMenu(){
        System.out.println("1. Add user\n2. Show users\n3. Remove user\n4. Logout");
    }
    
    private void cyclistMenu(){
        System.out.println("1. Rent bicycle\n2. Return bicycle\n3. Check status\n4. Logout");
    }
    
//    private void welcomeMessage(){
//        System.out.println("\tWelcome " 
//                + UserRecord.allUsers.get(UserRecord.getIndexOfUser(userId)).getName());
//    }
    
    private void invalidInputMessage(){
        System.out.println("\tInvalid input! Try again \n");
    }
    
    private void userDoesNotExistMessage(){
        System.out.println("\tUser doesn't exist! Try again \n");
    }
    
    private int enterId(Scanner reader){
        System.out.println("Enter ID: ");
        return reader.nextInt();
    }
    
    private String enterName(Scanner reader){
        System.out.println("Enter name: ");
        return reader.next();
    }
    
    private String enterSurname(Scanner reader){
        System.out.println("Enter surname: ");
        return reader.next();
    }
    
    private int enterRole(Scanner reader){
        System.out.println("Pick role:\n1.Admin\n2.User");
        return reader.nextInt();
    }
    
}
