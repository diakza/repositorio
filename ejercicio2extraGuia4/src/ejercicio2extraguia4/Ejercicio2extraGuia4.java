/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2extraguia4;

/**
 *
 * @author diakz
 */
public class Ejercicio2extraGuia4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Vehiculos car1=new Auto();
        
        Vehiculos car2=new Camionetas();
        
        Vehiculos car3=new Camiones();
        Viaje venezuela=new Viaje(car1, 300, 500, 10 );
        Viaje colombia=new Viaje("olavarria", "pilar", 1000, car2, 10);
        
        
        
       venezuela.calculoTotal();
       colombia.calculoTotal();
        
        
    }
    
}
