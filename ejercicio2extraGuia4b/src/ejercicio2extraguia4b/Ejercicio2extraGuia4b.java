/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2extraguia4b;

/**
 *
 * @author diakz
 */
public class Ejercicio2extraGuia4b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Combustible combucha =new Combustible("nafta", 0);
        Auto car1=new Auto(combucha, "sdsdsd", "ford"); 
        Viaje colombia = new Viaje("san luis", "buenos aires", 600, car1, 15);
        
        
        colombia.CostoTotal();
        // TODO code application logic here
    }
    
}
