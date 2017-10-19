/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bicycle;

/**
 *
 * @author bogurodzica
 */
public class User {
    private int id;
    private String name;
    private String surname;
    static enum Role {
        USER, ADMIN
    }
    private Role role;
    
    public User(int id, String name, String surname, Role role){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.role = role;
    }
    
    public int getId(){
        return this.id;
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
    
}
