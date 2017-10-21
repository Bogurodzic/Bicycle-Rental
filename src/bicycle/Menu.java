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
                        menuMessage();
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
                                                UserRecord.allUsers.add(new User (id, name, surname, Role.ADMIN));
                                                break;
                                            case(2):
                                                UserRecord.allUsers.add(new User (id, name, surname, Role.USER));
                                                break;
                                            }
                                        menuMessage();
                                        break;

                                    case(2):
                                        UserRecord.getAllUsers();
                                        menuMessage();
                                        break;
                                    case(5):
                                        start();
                                }
                            }
                    }
                    else{
                        welcomeMessage();
                        // TODO: menu for user
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
        System.out.println("\tWelcome Admin " + UserRecord.allUsers.get(UserRecord.getIndexOfUser(userId)).getName());
        System.out.println("Menu: \n");
    }
    
    private void menuMessage(){
        System.out.println("1. Add user\n2. Show users\n3. Remove user\n4. Edit user\n5. Logout");
    }
    
    private void welcomeMessage(){
        System.out.println("\tWelcome " + UserRecord.allUsers.get(UserRecord.getIndexOfUser(userId)).getName());
    }
    
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
