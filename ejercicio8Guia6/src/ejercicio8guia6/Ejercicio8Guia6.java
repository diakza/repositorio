/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8guia6;

/**
 *
 * @author diakz
 */
public class Ejercicio8Guia6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       
        try {
            System.out.println(Class1.metodo());
        } catch (Exception e) {
            System.err.println("Excepcion en metodo() ");
            e.printStackTrace();
        }

        
        try{
System.out.println ( Class2.metodo() ) ;
} catch(Exception e) {
System.err.println ( " Excepcion en metodo ( ) " ) ;
e.printStackTrace();
}
     



try{
System.out.println( Class3.metodo ( ) ) ;
//aca llama al metodo y lo muestra como anteriormente tenia un erorr de numberformatexception lo va a capturar este catch
} catch(Exception e) {
System.err.println("Excepcion en metodo () " ) ;
// ahora mostraria este mensaje y en la linea de abajo le va a mostrar al programador que error tuvo + el finally que soluciono el error anterior
e.printStackTrace();
}
    }
//    
    }
