/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg3;

/**
 *
 * @author diakz
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Auto au1 = new Auto("rojo","653464541");

        au1.avanzar(50);
        au1.llenarTanque();
        au1.retroceder(50);
        Rueda R1 = new Rueda();
        Rueda R2 = new Rueda();
        Rueda R3 = new Rueda();
        Rueda R4 = new Rueda();

        R1.Desinflar();
        R1.Pinchar();
        R1.inflar();
        R2.Desinflar();
        R2.Pinchar();
        R2.inflar();
        R3.Desinflar();
        R3.Pinchar();
        R3.inflar();
        R4.Desinflar();
        R4.Pinchar();
        R4.inflar();
    }
}





// TODO code application logic here
    
//    Nos piden modelar un Auto con las siguientes características y comportamiento para poder ser
//anexado al proyecto.
//
//A- El auto debe tener: color, patente y combustible con una carga inicial de 50lts. El auto sólo
//tendrá como comportamiento:
//• Avanzar: Al que le indicaremos la cantidad de metros que deseamos avance y deberemos tener
//en cuenta que por cada 10 mts consume 1lt de combustible y solo podrá avanzar si hay combustible
//suficiente.
//• Retroceder: Al que le indicaremos la cantidad de metros que deseamos retroceda y deberemos
//tener en cuenta que por cada 10 mts consume 1lt de combustible y solo podrá avanzar si hay
//combustible suficiente.
//
//• LlenarTanque: Llenará el tanque de este auto nuevamente con 50lts de combustible.
//
//B- Hacer la clase Rueda, con atributos: marca y presión, Luego el auto debe tener 4 ruedas, además
//Rueda tendrá los siguientes comportamientos:
//
//• Inflar: la presión regresa a 28.0 PSI
//• Pinchar: se debe reducir la presión al mínimo.
//• Desinflar: reduce la presión de la rueda -0.5 PSI
//
//C- Desde el método main crear las instancias, relacionarlas, e inflar/descinflar sus ruedas,
//avanzar/retroceder, y llenarTanque.
//
//Nota: La medida en PSI (libra por pulgada cuadrada). Generalmente los turismos ligeros suelen
//llevar una presión recomendada comprendida entre los 28 a 30 PSI.

