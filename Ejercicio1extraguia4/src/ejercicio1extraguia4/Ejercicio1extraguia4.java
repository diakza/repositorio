/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1extraguia4;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

/**
 *
 * @author diakz
 */
public class Ejercicio1extraguia4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        LocalDate fechay = LocalDate.of(1999, 03, 10);

        LocalDate fecha1 = LocalDate.of(1999, Month.MARCH, 30);
        LocalDate fechav = LocalDate.of(1999, 03, 10);

        LocalDate fecha2 = LocalDate.of(1999, Month.MARCH, 20);
        LocalDate fechab = LocalDate.of(1999, 03, 10);

        LocalDate fecha3 = LocalDate.of(1999, Month.MARCH, 15);

        Yate titanic = new Yate(10, 250, "54546", 15, 2005);
        Barcomotor barquito1 = new Barcomotor(200, "564656", 10, 1993);
        Velero barquito = new Velero(3, "54656", 10, 1993);

        Alquiler alq1 = new Alquiler(titanic, fechay, fecha1, 1, 5456, "carlos");
        Alquiler alq2 = new Alquiler(barquito1, fechav, fecha2, 1, 54546, "juan");
        Alquiler alq3 = new Alquiler(barquito, fechab, fecha3, 1, 545466, "raul");

       
        alq1.calcularEstadia();
        System.out.println("---------------------------------------");
        double preciofinal=titanic.modulobarco()*alq1.estadia();
        System.out.println("el precio final del yate es "+preciofinal);
        System.out.println("----------------------------------------");
        alq2.calcularEstadia();
        double preciofinal1=barquito1.modulobarco()*alq2.estadia();
         System.out.println("el precio final del barco a motor es "+preciofinal1);
        System.out.println("-----------------------------------------");
        alq3.calcularEstadia();
        System.out.println("-------------------------------------------");
        double preciofinal2=barquito.modulobarco()*alq3.estadia();
         System.out.println("el precio final del velero es "+preciofinal2);

    }

}
