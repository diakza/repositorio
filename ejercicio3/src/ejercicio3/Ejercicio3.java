/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author diakz
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //vacío; luego, a dicho jugador darle de nombre “Juan”, con 140 puntos, de nacionalidad
//“Argentino” y una edad de 29 años; por último mostrar por consola el estado de cada uno
//de sus atributos.

jugador jugador1 = new jugador();

     jugador1.setNombre("juan");
     jugador1.setPuntaje(140);
     jugador1.setNacionalidad("argentina");
     jugador1.setEdad(29);
     
     
 System.out.println(jugador1.getNombre());
        System.out.println(jugador1.getPuntaje());
        System.out.println(jugador1.getNacionalidad());
        System.out.println(jugador1.getEdad());
        
     
    
    
    
    
    
    
        
        
        
        
    }
    
}
