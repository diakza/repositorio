/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.extra.pkg2;

/**
 *
 * @author diakz
 */
public class EjercicioExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Dado d1 = new Dado();
        Dado d2 = new Dado();
        Dado d3 = new Dado();
        Jugador j1 = new Jugador("pocho");

        Jugador j2 = new Jugador("pepe");
        j1.tirarDado(d1);
        j1.tirarDado(d2);
        j1.tirarDado(d3);
        System.out.println("su clasificacion es " + j1.verClasificacion());
        Dado dd1 = new Dado();
        Dado dd2 = new Dado();
        Dado dd3 = new Dado();
        j2.tirarDado(dd1);
        j2.tirarDado(dd2);
        j2.tirarDado(dd3);
        System.out.println("su clasificacion es " + j2.verClasificacion());

        if (j1.verClasificacion() > j2.verClasificacion()) {

            System.out.println("el jugador " + j1.getNombre() + " tiene la clasificacion mas alta ");

        } else {
            System.out.println("el jugador " + j2.getNombre() + " tiene la clasificacion mas alta ");
        }

    }
//    Ejercicio 2:
//En el siguiente modelo, tenemos una clase Jugador con los atributos: nombre y clasificación; un
//constructor que inicializa su atributo nombre y los métodos:
//tirarDado(): Que recibe por parámetro un Dado, lo que hará este método es invocar el método
//generarNro del dado y acumulará el valor del Dado en su atributo clasificación.
//verClasificación(): Retornará la clasificación del jugador.
//Por otro lado, tenemos la clase Dado que posee como atributo: número que es un valor entero y
//los métodos:
//generarNro(): Que genera un número al azar entre 1 y 6 que se lo asigna a su variable atributo
//numero, si el atributo tiene un valor mayor a 0, significa que ese dado ya generó un valor y lo
//mantendrá.
//verNro(): Retornará el valor guardado en la variable numero.
//
//Desde una clase TestJuego se pide:
//a) Crear 3 Dados.
//b) Crear un Jugador de nombre “Pocho” y pedirle que tire los 3 Dados.
//c) Mostrar al final la clasificación del Jugador.
//d) Ahora Crear otros 3 Dados más.
//e) Crear un nuevo Jugador de nombre “Pepe” y pedirle que tire los 3 últimos dados creados.
//f) Al finalizar mostrar de los 2 jugadores el nombre que obtuvo la mayor clasificación.
}
