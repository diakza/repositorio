
package ejercicio2_8;
//En un nuevo proyecto, crear una clase de nombre Calculo con los siguientes métodos estáticos:
// esPrimo(): Este método recibe un número entero y retorna true si el número recibido es
//primo, caso contrario retornará false.
// valorAbsoluto(): Este método recibe un número entero y retorna su valor absoluto.
// calcularRaices(): Este método recibe los coeficientes a, b y c de una ecuación de segundo
//grado y mostrará por consola sus raíces y si no las tiene también lo informará.
//Luego desde la clase principal del proyecto (la que contiene el método main) se pide:
//
//Utilizando los métodos estáticos de la clase Calculo:
//a) Informar por consola si un número escogido por usted es primo o no.
//b) Mostrar por consola el valor absoluto del valor -90;
//c) Mostrar las raíces de la ecuación de segundo grado con los coeficientes: 1, 0 y 9.

public class Calculo {
        public static boolean esPrimo(int num){
            int primo = 0;
             for(int i=1; i<=num; i++){             
                 double result = num % i;
                 if(result == 0){
                 primo = primo + 1;            
            }        
        }
            return primo<=2; 
    }
        public static int valorAbsoluto(int num){
          return Math.abs(num);  
        }
        
        public static void calcularRaices(int a, int b, int c){
            double determinante = Math.pow(b,2) - 4*a*c;
            if(determinante >=0){
            double x1 = (-b + Math.sqrt(b*b - 4*a*c))/2*a;
            double x2 = (-b - Math.sqrt(b*b - 4*a*c))/2*a;
            System.out.println("Las raíces son " + x1 + " y " + x2);
        }else{
                System.out.println("La ecuación no tiene raíces reales");
            }
}
}