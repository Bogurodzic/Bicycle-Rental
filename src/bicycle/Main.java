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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bicycle bicycle1 = new Bicycle(1, 2, Bicycle.State.SERVICE, 5);
        System.out.println(bicycle1.getUserId());
    }
    
}
