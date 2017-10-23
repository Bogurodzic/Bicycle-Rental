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
public class Cyclist extends User{
 
    public Cyclist(int id, String name, String surname){
        super(id, name, surname, Role.CYCLIST);
    }
    
}
