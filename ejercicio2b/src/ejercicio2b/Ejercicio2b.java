/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2b;

/**
 *
 * @author diakz
 */
public class Ejercicio2b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        kiosco k1 = new kiosco("el 24","uruguay",54543);
        empleado emp1 =new empleado("diego", "de armas", 2,454545);
        empleado emp2 = new empleado("carlos","fuentes",3,6464);
        empleado emp3 = new empleado("ruben","skjdk",1,65485);
            empleado emp4 = new empleado();
        
        
        k1.antiguedadm(emp1, emp2, emp3);
        k1.limite(emp4);
    
    
    }
    
    //representar una fecha proveniente de un string
        //String cadena = "2023-04-20";
        //LocalDate fecha2= LocalDate.parse(cadena);
        //System.out.println(fecha2);
}
