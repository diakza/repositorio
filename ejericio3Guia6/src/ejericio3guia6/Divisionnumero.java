/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejericio3guia6;

/**
 *
 * @author diakz
 */
public class Divisionnumero {
    
    
    
    public  static void dividir(String num1, String num2){
        
        try {
            
           int numero = Integer.parseInt(num1);
            int numero2 = Integer.parseInt(num2);
            
            System.out.println("la division de "+num1+" y "+num2+" da "+(numero/numero2) );
            
            
        } catch ( Exception e) {
            System.out.println("pone bien el numero gato");
            System.out.println(e.getMessage());
            if (e instanceof NumberFormatException) {
                System.out.println("La instancia es del tipo Exception");
            }
            
        }
        
        
    }
    
}
