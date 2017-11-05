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
    
    public static List<User> allUsers = new ArrayList<User>();
    
    
    public UserRecord(){ //constructor
        
        allUsers.add(new Admin(6445,"Daniel","Olszewski"));
        allUsers.add(new Cyclist(8355,"Kamil","Jarzab"));
        allUsers.add(new Cyclist(3674,"Jan","Kowalski"));
        
    }
    
        public boolean ifExists(int userId){
        
        boolean ifExists = false;
        
            for(User users : allUsers){
                if(userId == users.getUserId()){
                    ifExists = true;
                }
            }
        return ifExists;    
    }
    
    public int getIndexOfUser(int userId){
        
        int elementIndex = 0;
        
        for (int i = 0; i < allUsers.size(); i++) {
           
            if(userId == allUsers.get(i).getUserId()){
                elementIndex = i;
            }
          
        }
       return elementIndex;
    }
    


}
