/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8guia6;

/**
 *
 * @author diakz
 */
public class Class2 {

    public static int metodo() {
        int valor = 0;
        //declara un variable int e la inicializa en 0
        try {
            valor = valor + 1;
            // entra al try ahora el valor vale 1
            valor = valor + Integer.parseInt("W");
            // aca tenemos un erro por lo que no se va terminar de ejecutar y va a saltar al catch
            valor = valor + 1;
            System.out.println("Valor final del try: " + valor);
        } catch (NumberFormatException e) {
            valor = valor + Integer.parseInt("42");
            // aca vuelve a darle otro valor 42 y suma a lo que ya tenia ahora valor =43
            System.out.println("Valor final del catch: " + valor);
            // muestra el cartel y lo que vale valor (43)
        } finally {
            valor = valor + 1;
            // ahora a valor le agregan uno valor=44
        }

        System.out.println("Valor final del finally: " + valor);
        // sale del bloque muestra el cartel y valor=44
    
    valor  = valor + 1;
    // aca vuelve a sumar uno ahora valor vale =45

    System.out.println (
            
    "Valor antes del return: " + valor) ;
    return valor ;
    // finalmente muestra lo que vale valor y lo retorna
}

}
