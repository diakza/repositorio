/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2guia6;

/**
 *
 * @author diakz
 */
public class Ejercicio2Guia6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        Demuestre como provocar intencionalmente una excepción del tipo
//ArrayIndexOutOfBoundsException (índice de arreglo fuera de rango); luego agregue las
//sentencias try/catch para mostrar lo que devuelve el método fillInStackTrace.
        int[][] matriz = new int[2][2];
        try {
            
             for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
               
                
                System.out.println( matriz[i][j]);
                
                
            }
        }
            
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.fillInStackTrace());
            
        }
    }
//        int[] vector = new int[1];
//        try {
//            for (int i = 0; i < 10; i++) {
//                System.out.println(  vector[i]);
//            }
//        }catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("te pasaste de revoluciones maquina");
//            System.out.println(e.fillInStackTrace());
//        }
////        
//    }
}
