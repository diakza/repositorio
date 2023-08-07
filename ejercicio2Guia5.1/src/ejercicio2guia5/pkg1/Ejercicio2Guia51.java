/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2guia5.pkg1;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author diakz
 */
public class Ejercicio2Guia51 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        LocalDate fecha = LocalDate.of(1978, Month.JULY, 25);
        Cliente c1 =new Cliente("juan","lucero","merlo",fecha);
        Cuenta cuenta1 = new Cuenta(1234, 1000, c1);
        System.out.println("cliente:"+c1.getNombre()+" "+c1.getApellido());
        System.out.println("de la localidad de "+c1.getLocalidad());
        System.out.println("nacido el dia "+c1.getfNacimiento());
        System.out.println("su saldo acltual es de "+cuenta1.verSaldo());
        cuenta1.depositar(60000);
        cuenta1.extraer(10000);
        System.out.println("su saldo acltual es de "+cuenta1.verSaldo());
        cuenta1.listarMovimientos();
    }
//    Crear el cliente Juan Lucero de la localidad de Merlo, nacido el 25/07/1978
}
