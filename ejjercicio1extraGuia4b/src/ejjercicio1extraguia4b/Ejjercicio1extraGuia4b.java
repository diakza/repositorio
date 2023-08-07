/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejjercicio1extraguia4b;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author diakz
 */
public class Ejjercicio1extraGuia4b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        LocalDate fecha1 = LocalDate.of(2023, 06, 1);
        LocalDate fecha2 = LocalDate.of(2023, 06, 10);
        Velero barquito1 = new Velero(5, "564654654", 10, "2023");
        Alquiler alq1 = new Alquiler("gaston", "6540086", fecha1, fecha2, 1, barquito1);

        alq1.cantidadDias();
        
        
    }

}
