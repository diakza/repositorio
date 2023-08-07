/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2guia4;

/**
 *
 * @author diakz
 */
public class Ejercicio2guia4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Lavadora drean = new Lavadora(40,5000,"negro",'f',85);
        Televisor lg = new Televisor(50,true,5000,"blanco",'f',50);
        drean.comprobarColor();
        drean.comprobarConsumoEnergetico();
        drean.precioFinal();
        lg.comprobarColor();
        lg.comprobarConsumoEnergetico();
        lg.precioFinal();
        
        
        
    }
    
}
