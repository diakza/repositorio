/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejericicioextra4guia5.pkg2;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author diakz
 */
public class Ejericicioextra4Guia52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        Almacena en un HashMap los códigos postales de 10 ciudades a elección de esta página:
//https://mapanet.eu/index.htm. Nota: Poner el código postal sin la letra, solo el número.
//• Pedirle al usuario que ingrese 10 códigos postales y sus ciudades. • Muestra por pantalla los datos
//introducidos
//• Pide un código postal y muestra la ciudad asociada si existe sino avisa al usuario. • Muestra por
//pantalla los datos
//• Agregar una ciudad con su código postal correspondiente más al HashMap. • Elimina 3 ciudades
//existentes dentro del HashMap, que pida el usuario. • Muestra por pantalla los datos.
//        
        HashSet<Codigopostal> cod = new HashSet();
        String condicion;
        String ciudades;
        String pos;
        Correo oca = new Correo();
        Scanner leer = new Scanner(System.in);
        Scanner leerint = new Scanner(System.in);
        do {

            System.out.println("Ingrese  los codigos postales");
            pos = leerint.nextLine();
            leer.nextLine();
            System.out.println("Ingrese la ciudad correspondiente al su codigo postal");
            ciudades = leer.nextLine();
            Codigopostal nuevo = new Codigopostal(pos, ciudades);
            oca.agregarcodigo(nuevo);
            System.out.println("Desea ingresar mas .... Y/N");
            condicion = leer.next();

        } while (!(condicion.equalsIgnoreCase("N")));

        oca.listarcodigos();
        System.out.println("-------------------------");
        oca.buscarCod();
        System.out.println("--------------------------");
        oca.quitarcodigo();
        System.out.println("-----------------------------");
        oca.listarcodigos();

    }

}
