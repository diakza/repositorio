/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

/**
 *
 * @author diakz
 */
public class Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Persona carlos=new Persona("Lopez","Carlos",30 );
        carlos.saludar();
        carlos.setNombre("maria");
        carlos.saludar();
        System.out.println(carlos.getEdad());
       
        
        
    }
    
}
