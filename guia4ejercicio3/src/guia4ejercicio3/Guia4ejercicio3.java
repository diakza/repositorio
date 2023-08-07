/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia4ejercicio3;

/**
 *
 * @author diakz
 */
public class Guia4ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo redondo = new Circulo(5);
        Rectangulo libro = new Rectangulo(5,5);
        
        
       System.out.println("el perimetro es "+redondo.CalcularPerimetro());
        System.out.println(" el area del circulo es "+redondo.Calculararea());
        
        
        System.out.println("------------------------------------------");
        
        
        System.out.println("el perimetro del rectangulo es "+libro.CalcularPerimetro());
        System.out.println("el area del rectangulo es "+libro.Calculararea());
    }
    
}
