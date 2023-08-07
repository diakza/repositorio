/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioextra1;

/**
 *
 * @author diakz
 */
public class Ejercicioextra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Gps garmin =new Gps("garmin","5412");
        Persona carlos =new Persona("fuentes","carlos");
        
        carlos.ubicarme(garmin);
        
    }
    
}
