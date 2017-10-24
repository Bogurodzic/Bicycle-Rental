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
    private int numberOfUsers = 0;
    
    static public List<User> allUsers = new ArrayList<User>();
    
    
    public UserRecord(){ //constructor
        
        allUsers.add(new Admin(6445,"Daniel","Olszewski"));
        allUsers.add(new Cyclist(8355,"Kamil","Jarzab"));
        allUsers.add(new Cyclist(3674,"Karina","Urbanek"));
        
    }
    
        public boolean ifExists(int userId){
        
        boolean ifExists = false;
        
            for(User users : UserRecord.allUsers){
                if(userId == users.getId()){
                    ifExists = true;
                }
            }
        return ifExists;    
    }
    
    public int getIndexOfUser(int userId){
        
        int elementIndex = 0;
        
        for (int i = 0; i < UserRecord.allUsers.size(); i++) {
           
            if(userId == UserRecord.allUsers.get(i).getId()){
                elementIndex = i;
            }
          
        }
       return elementIndex;
    }
    


}
