/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioextra3guia4;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author diakz
 */
public class Ejercicioextra3Guia4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Empresa apple=new Empresa();
        TrabajoPintura paint=new TrabajoPintura("casa", 1000, 48, "diego de armas", "veronica grecco", LocalDate.now());
        RevisionAlarma x28 =new RevisionAlarma(30, "carlos fuentes", "roberto figueroa", LocalDate.of(2023, Month.MARCH, 20));
        
        apple.contratarServicio(paint);
        apple.contratarServicio(x28);
        apple.mostrarCostoTotalDeObras();
        
    }
    
}
