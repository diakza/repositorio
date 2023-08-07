/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8guia6;

/**
 *
 * @author diakz
 */
public class Class1 {
    
    
    public static int metodo() {
int valor=0;            
try {
    //valor queda en 1                                              
valor = valor+1;

valor = valor + Integer.parseInt ("42");     
// valor ahora vale 43
valor = valor +1;
// valor ahora queda en 44
System.out.println("Valor final del try:" + valor) ;
//se ejecuta la ultima linea del try y lo muestra al valor
} catch (NumberFormatException e) {
valor = valor + Integer.parseInt("42");
System.out.println("Valor final del catch:" + valor);
} finally {
valor = valor + 1;
System.out.println("Valor final del finally: " + valor) ;
}
// luego entraria en el finally mostraria 45
valor = valor +1;
//luego como esta fuera del bloque finally mostraria tambien el valor del finally +1 quedaria en 46


System.out.println("Valor antes del return: " + valor) ;
return valor;
//aca mostraria esa linea y devuelve el valor 











//Scanner scan = new Scanner(System.in);
//        int numero1=100, numero2=0;
//        int resultado=0;
//        do{
//        System.out.println("Ingrese un Numero");
//        try {
//        numero2=scan.nextInt();
//        resultado=numero1/numero2;
//            System.out.println("zaraza");
//        } catch (ArithmeticException e){
//            
//            System.out.println("Numero Incorrecto");
//        
//        } catch(InputMismatchException e){
//            System.out.println("Ingreso una letra en vez de un numero valido");
//                System.out.println("ingrese valor entero");
//                scan.nextLine();
//        }
//        
//        }while (numero2==0); 
//        System.out.println("Resultado"+resultado);
}
    
}
