/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.kiosco;

import java.util.Date;

/**
 *
 * @author diakz
 */
public class EjercicioKiosco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Kiosco kiosko=new Kiosco("kiosko", "dsadasd 3213",312312312);
        Empleado emple= new Empleado("juan", "martin", 31231231, new Date("3/2/2002"));
        Empleado emple1= new Empleado("franco", "neyen", 31231231, new Date("1/12/2012"));
        Empleado emple2= new Empleado("lulu", "dsadas", 31231231, new Date("3/2/2022"));

        System.out.println("primer contratacion... Completa ");
        kiosko.contratarEmpleado(emple);
        System.out.println("segunda contratacion... Completa ");
        kiosko.contratarEmpleado(emple1);
        System.out.println("tercer contratacion... Completa ");
        kiosko.contratarEmpleado(emple2);

        System.out.println(kiosko.masAntiguo().toString());
    }
        
        
    }
    

