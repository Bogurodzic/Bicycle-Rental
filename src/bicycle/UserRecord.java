/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bicycle;
import java.util.*;

/**
 *
 * @author edaolsz
 */
public class UserRecord {
    private int numberOfUsers;
    
        User user1 = new User(6445,"Daniel","Olszewski", User.Role.ADMIN);
        User user2 = new User(8355,"Kamil","Jarzab", User.Role.USER);
        User user3 = new User(3674,"Karina","Urbanek", User.Role.USER);
    
    static List<User> allUsers = new ArrayList<User>();
    
    
    public UserRecord(){ //constructor
        
        allUsers.add(user1);
        allUsers.add(user2);
        allUsers.add(user3);
        
    }
    public boolean ifExists(int userId){
        
        boolean ifExists = false;
        
            for(User users : allUsers){
                if(userId == users.getId()){
                    ifExists = true;
                }
            }
        return ifExists;    
        
    }
    
    
    public int getIndexOfUser(int userId){
        
        int elementIndex = -1;
        
        for (int i = 0; i < allUsers.size(); i++) {
           
            if(userId == allUsers.get(i).getId()){
                elementIndex = i;
            }
          
        }
       return elementIndex;
    }
    
    
    

    
    
    
}
