
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author diakz
 */
public class ExtrasG1 {

    static Scanner leer = new Scanner(System.in);
//    Crear un método que dado un tiempo en minutos leído desde teclado, calcular su equivalente en
//días y horas. Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
//equivalente: 1 día, 2 horas.

    public static void extras() {
        Scanner leer = new Scanner(System.in);
        int min;
        System.out.println("ingrese la cantidad de minutos que desea convertir");
        min = leer.nextInt();

        int dia = (int) Math.floor(min / 1440);
        int horas = (min % 1440) / 60;

        System.out.println("su equivalente  en dias es " + dia + " dia");
        System.out.println(" y en horas " + horas + " hs");
    }

//    Crear un método dentro del cual tendrá cuatro variables de tipo entero A, B, C y D y asignarle
//un valor diferente a cada una. A continuación, realizar las instrucciones necesarias para que: B
//tome el valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar
//los valores iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
    public static void extras1() {

        int a, b, c, d, aux;
        a = 1;
        b = 2;
        c = 3;
        d = 4;

        System.out.println("variable  A = " + a);
        System.out.println("variable  B = " + b);
        System.out.println("variable  C = " + c);
        System.out.println("variable  D = " + d);
        System.out.println("------------------");

        aux = c;
        c = a;
        a = d;
        d = b;
        b = aux;

        System.out.println("variable  A = " + a);
        System.out.println("variable  B = " + b);
        System.out.println("variable  C = " + c);
        System.out.println("variable  D = " + d);

    }

//    Elaborar un método en el cuál se ingrese una letra y se detecte si se trata de una vocal. Caso
//contrario mostrar un mensaje.
    public static void extras2() {
        String frase;
        System.out.println("ingrese un letra ");
        frase = leer.next();

        if (frase.equals("a") || frase.equals("e") || frase.equals("i") || frase.equals("o") || frase.equals("u")) {

            System.out.println(" su letra es vocal");
        } else {
            System.out.println("su letra es consonante");

        }

    }

    public static void extras3() {

        //       Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su equivalente
//en romano. 
        int num;
        System.out.println("ingrese un numero del 1 al 10");
        num = leer.nextInt();

        if (num <= 10) {
            switch (num) {
                case 1: {
                    System.out.println(" su equivalente es |");
                    break;
                }
                case 2: {
                    System.out.println("su equivalente es || ");
                    break;
                }
                case 3: {
                    System.out.println("su equivalente es ||| ");
                    break;
                }
                case 4: {
                    System.out.println("su equivalente es |V");
                    break;
                }
                case 5: {
                    System.out.println("su equivalente es V ");
                    break;
                }
                case 6: {
                    System.out.println("su equivalente es V|");
                    break;
                }
                case 7: {
                    System.out.println("su equivalente es V||");
                    break;
                }
                case 8: {
                    System.out.println("su equivalente es V|||");
                    break;
                }
                case 9: {
                    System.out.println(" su equivalente es |X");
                    break;
                }
                case 10: {
                    System.out.println(" su equivalente es X");
                    break;
                }
                default: {
                    System.out.println("ingrese una opcion valida");
                    break;

                }
            }
        }
    }

    public static void extras4() {
//        Una obra social tiene tres clases de socios:
// Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos
//los tipos de tratamientos.
// Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los
//mismos tratamientos que los socios del tipo A.
// Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
//tratamientos.
//Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real que represente
//el costo del tratamiento (previo al descuento) y determine el importe en efectivo a pagar por dicho
//socio. Crear un método con el algoritmo para dar solución a lo propuesto.

        String socio;
        int costo;
        double total;

        System.out.println("ingrese que tipo de socio es ");
        System.out.println("a");
        System.out.println("b");
        System.out.println("c");
        socio = leer.next();
        costo = (int) (Math.random() * (1000));

        total = 0;
        switch (socio) {
            case "a": {
                System.out.println("el costo del tratamiento es " + costo
                        + "total con descuento " + (total = costo * 0.5));
                break;
            }
            case "b": {
                System.out.println("el costo del tratamiento es " + costo
                        + "total con descuento " + (total = costo * 0.35));
                break;
            }
            case "c": {
                System.out.println(" no recibe descuentos " + costo);
            }
        }

    }

    public static void extras5() {

//        Crear un método dentro del cual permita la entrada desde teclado de la altura de N personas y
//determinar el promedio de estaturas que se encuentran por debajo de 1.60 mts. y el promedio de
//estaturas en general.
        double estatura;
        int n;
        n = 0;
        double suma;
        suma = 0;
        int cont = 0;
        System.out.println("ingrese la estatura");
        while (n <= 5) {
            n++;

            estatura = leer.nextDouble();
            suma = suma + estatura;
            if (estatura <= 1.60) {
                cont++;

            }
            if (n == 5) {
                break;
            }

        }
        System.out.println("el promedio de estaturas por debajo de 1.60 es " + (suma / cont));
        System.out.println("el promedio de estaturas en gral es " + (suma / n));
    }

    public static void extras6a() {
//        Realice un método que calcule y visualice el valor máximo, el valor mínimo y el promedio de
//n números (n>0). El valor de n se solicitará al principio del programa y los números serán
//introducidos por el usuario. Realice dos versiones del método, una usando el bucle “while” y otra
//con el bucle “do - while”.
        System.out.println("ingrese la cantidad de numeros con la que quierer trabajar (entre 1 y 5)");
        int n = leer.nextInt();
        int num, cont, suma, max, min;
        suma = 0;
        max = 0;
        cont = 0;
        min = 0;

        while (n != 0) {
            cont++;
            System.out.println("ingrese un numero del 1 al 9 ");
            num = leer.nextInt();
            suma = suma + num;
            min = num;
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
            if (cont == n) {
                break;

            }

        }

        System.out.println("el promedio de num es " + (suma / cont));
        System.out.println("el valor maximo es " + max);
        System.out.println("el valor minimo es " + min);

    }

    public static void extras6b() {

        int numero, suma, cont, max, min, num;
        boolean band;
        max = 0;
        min = 0;
        cont = 0;
        suma = 0;
        band = true;
        System.out.println("ingrese  la cantidad de numeros con la que quierer trabajar (entre 1 y 5) ");
        num = leer.nextInt();
        do {
            cont++;

            System.out.println("ingrese los numero para compararlos");
            numero = leer.nextInt();

            if (band == true) {
                max = numero;
                min = numero;
                band = false;

            } else {
                if (numero > max) {
                    max = numero;
                } else {
                    if (numero < min) {
                        min = numero;

                    }
                }

            }

            suma = suma + numero;

        } while (num != cont);
        System.out.println("el promedio de num es " + (suma / cont));
        System.out.println("el valor maximo es " + max);
        System.out.println("el valor minimo es " + min);
    }

    public static void extras7() {

//        Escriba un método que lea números enteros. Si el número es múltiplo de cinco debe detener la
//lectura y mostrar la cantidad de números leídos, la cantidad de números pares y la cantidad de
//números impares. Al igual que en el ejercicio anterior los números negativos no deben sumarse.
//Nota: recordar el uso de la sentencia break.
        int num;
        int pares, impares;
        pares = 0;
        impares = 0;

        do {

            System.out.println("ingrese un numero entero");
            num = leer.nextInt();
            if (num % 2 == 0) {
                pares++;

            } else {
                impares++;
            }
// 

        } while (num % 5 != 0);
        System.out.println("la cantidad de pares contados " + pares);
        System.out.println("la cantidad de impares contados " + impares);

    }

    public static void extras8() {

//        Simular la división usando solamente restas. Dados dos números enteros mayores que uno,
//realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método: Restar el
//dividendo del divisor hasta obtener un resultado menor que el divisor, este resultado es el residuo,
//y el número de restas realizadas es el cociente. Por ejemplo: 50 / 13:
//50 – 13 = 37 una resta realizada
//37 – 13 = 24 dos restas realizadas
//24 – 13 = 11 tres restas realizadas
//Crear un método con el algoritmo necesario para dar solución a lo propuesto.
        int num1, num2, resta, cociente;
        num1 = 50;
        num2 = 13;
        cociente = 0;
        do {
            System.out.println(num1 + "-" + num2 + "=" + (num1 = num1 - num2) + " " + (cociente + 1) + " una resta realizada ");

            cociente++;

        } while (num1 > num2);
        System.out.println("cantidad de restas realizadas " + cociente);
        System.out.println("el residuo de la division es " + num1);

    }

    public static void extras9() {
//        Realice un método para que el usuario adivine el resultado de una multiplicación entre dos
//números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario si su respuesta
//es o no correcta. En caso que la respuesta sea incorrecta se debe permitir al usuario ingresar su
//respuesta nuevamente. Para realizar este ejercicio investigue como utilizar la función
//Math.random() de Java.

        int num1, num2, resultado;
        num1 = (int) (Math.random() * 10);
        num2 = (int) (Math.random() * 10);

        do {
            System.out.println("ingrese un numero");
            resultado = leer.nextInt();

        } while (num1 * num2 != resultado);
        System.out.println("felicidades adivino el resultado");

    }

    public static void extras10() {

        int num;
        System.out.println("Ingrese un numero entero");
        num = leer.nextInt();
        int cont = 1;
        while (num > 10) {
            num = num / 10;
            cont++;
        }

        System.out.println("El numero tiene " + cont + " digitos");

    }

    public static void extras11() {

//        Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-0
//al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E. Ejemplo:
//0-0-0
//0-0-1
//0-0-2
//0-0-E
//0-0-4
//0-1-2
//0-1-E
//Crear un método que dé solución a lo propuesto en el enunciado.
//        
        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10; j++) {

                for (int k = 0; k < 10; k++) {
                    if (i == 3) {
                        System.out.print("E");
                    } else {
                        System.out.print(i);
                    }
                    if (j == 3) {
                        System.out.print("E");
                    } else {
                        System.out.print(j);
                    }
                    if (k == 3) {
                        System.out.print("E");
                    } else {
                        System.out.print(k);

                        System.out.print(" ");

                    }
                    System.out.println("  ");
                }
            }
        }

    }

    public static void extras12() {

//        Crear un método que dibuje una escalera de números, donde cada línea de números comience
//en uno y termine en el número de la línea. Solicitar la altura de la escalera al usuario al comenzar.
//Ejemplo: si se ingresa el número 3:
        int num;
        System.out.println("ingrese un numero para el tamño de la escalera");
        num = leer.nextInt();

        for (int i = 1; i < num + 1; i++) {

            for (int j = 1; j < i + 1; j++) {
                System.out.print(j);

            }
            System.out.println(" ");
        }
//        for (int i = 1; i < num+1; i++) {
//            
//            for (int j = 1; j< i+1; j++) {
//                
//                System.out.print(j);
//                                
//            }System.out.println(" ");
//        }

    }

    public static void menu() {
        System.out.println("MENU:/n/n");
        System.out.println("1-");
        System.out.println("2-");
        System.out.println("3-");
        System.out.println("4-");
        System.out.println("5-");
        System.out.println("6-");
        System.out.println("7-");
        System.out.println("8-");
        System.out.println("9-");
        System.out.println("10-");
        System.out.println("11-");
        System.out.println("12-");
        System.out.println("13-");
        
        System.out.println("Ingrese el numero del metodo que quiere probar: ");
        int num = leer.nextInt();
        
        switch (num) {
            
            case 1:
            
            case 2:
            
            case 3:
            
            case 4:
            
            case 5:
            
            case 6:
            
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
        }
}
    
}