/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.extra1guia5;

/**
 *
 * @author diakz
 */
public class EjercicioExtra1Guia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pila pila = new Pila(10);
        pila.agregar("hola");
        pila.agregar("como");
        pila.agregar("estas");
        pila.agregar("hoy");
        pila.agregar("dia");
        for (int i = 0; i <= pila.getTope(); i++) {
            System.out.println("posicion: " + (i + 1) + " " + pila.getElementos()[i]);
        }
        System.out.println("quitar: " + pila.quitar());
        for (int i = 0; i <= pila.getTope(); i++) {
            System.out.println("posicion: " + (i + 1) + " " + pila.getElementos()[i]);
            
        }

    }
}
