
package ejercicio2_8;


public class Ejercicio2_8 {

    
    public static void main(String[] args) {        
        
            if(Calculo.esPrimo(8)){
                System.out.println("El nro es primo");
            }else{
                System.out.println("El nro no es primo");
            }
            
           if(Calculo.esPrimo(7)){
                System.out.println("El nro es primo");
            }else{
                System.out.println("El nro no es primo");
            }
           
           System.out.println( Calculo.valorAbsoluto(-90));
           
           Calculo.calcularRaices(1, 0, 9);
           Calculo.calcularRaices(-1, 4, -4);
    }  
    
}
