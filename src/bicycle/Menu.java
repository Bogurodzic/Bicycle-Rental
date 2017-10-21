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
            Scanner reader = new Scanner(System.in);
            System.out.println("\tWELCOME!\n");
            System.out.println("Please log in!\nOr press 0 to exit\nUser id: ");


            if(reader.hasNextInt()){ //consider while loop
                userId = reader.nextInt();
                switch(userId){
                    case(0):
                        System.out.println("Closing... \n \tThank you! ");
                        System.exit(0);
                }

                if(UserRecord.ifExists(userId)){
                    if(UserRecord.allUsers.get(UserRecord.getIndexOfUser(userId)).getRole() == User.Role.ADMIN){
                        System.out.println("\tWelcome Admin " + UserRecord.allUsers.get(UserRecord.getIndexOfUser(userId)).getName());
                        // TODO: finish menu for admin
                        System.out.println("Menu: \n");
                        System.out.println("1. Add user\n2. Show users\n3. Remove user\n4. Edit user\n5. Logout");
                            while(reader.hasNextInt()){
                                option = reader.nextInt();
                                switch(option){
                                    case(1): 
                                        System.out.println("\tADD USER");
                                        System.out.println("Enter ID: ");
                                        id = reader.nextInt();
                                        System.out.println("Enter name: ");
                                        name = reader.next();
                                        System.out.println("Enter surname: ");
                                        surname = reader.next();
                                        System.out.println("Pick role:\n1.Admin\n2.User");
                                        option = reader.nextInt();
                                            switch(option){
                                            case(1):
                                                User user4 = new User (id, name, surname, User.Role.ADMIN); //need to be changed, name of object need to be dynamic
                                                UserRecord.allUsers.add(user4);
                                                break;
                                            case(2):
                                                User user5 = new User (id, name, surname, User.Role.USER);
                                                UserRecord.allUsers.add(user5);
                                                break;
                                            }
                                        System.out.println("1. Add user\n2. Show users\n3. Remove user\n4. Edit user\n5. Logout");
                                        break;

                                    case(2):
                                        UserRecord.getAllUsers();
                                        System.out.println("1. Add user\n2. Show users\n3. Remove user\n4. Edit user\n5. Logout");
                                        break;
                                }
                            }
                    }
                    else{
                        System.out.println("\tWelcome " + UserRecord.allUsers.get(UserRecord.getIndexOfUser(userId)).getName() );
                        // TODO: menu for user
                    } 
                }
                else{
                    System.out.println("\tUser doesn't exist! Try again \n");
                }
            }
            else{
                System.out.println("\tInvalid input! Try again \n");
            }
        }
    }
    
}
