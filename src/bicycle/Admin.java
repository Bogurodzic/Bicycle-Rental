/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bicycle;

/**
 *
 * @author edaolsz
 */
public class Admin extends User {
    
    
    
    public Admin(int id,String name, String surname){
        super(id,name,surname, Role.ADMIN);
    }

    /////////////////////////////////////////Operations on User////////////////////////////////////////////////
    
    public void getAllUsers(){
        for (int i = 0; i < UserRecord.allUsers.size(); i++){
            System.out.println(UserRecord.allUsers.get(i).getUserId()+" "
            +UserRecord.allUsers.get(i).getName()+" "
            +UserRecord.allUsers.get(i).getSurname()+" "
            +UserRecord.allUsers.get(i).getRole()+" "
            +UserRecord.allUsers.get(i).getBicycleId());
            
        } 
    }

    public void AddAdmin(int userId, String name, String surname){
         UserRecord.allUsers.add(new Admin(userId, name, surname));
         System.out.println("Admin "+ name +" added!");
    }
    
    public void AddCyclist(int userId, String name, String surname){
         UserRecord.allUsers.add(new Cyclist(userId, name, surname));
         System.out.println("Cyclist "+ name +" added!");
    }
    
    public void removeUser(int userId){
        for (int i = 0; i < UserRecord.allUsers.size(); i++){
            if( userId == UserRecord.allUsers.get(i).getUserId() ){
                UserRecord.allUsers.remove(UserRecord.allUsers.get(i));
            }
        }
    }
    
    /////////////////////////////////////////Operations on Bicycles//////////////////////////////////////////// 
    

    
}
