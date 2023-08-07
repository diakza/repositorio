/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejericicioextra4guia5.pkg2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author diakz
 */
public class Correo {

    HashSet<Codigopostal> listacod = new HashSet();

    public void agregarcodigo(Codigopostal nuevo) {

        listacod.add(nuevo);

    }

    public void quitarcodigo() {
        Scanner leer = new Scanner(System.in);

        String opc;
        do {
            System.out.println("ingrese el codigo que desea borrar");
            String opcion = leer.nextLine();
            Iterator<Codigopostal> it = listacod.iterator();
            while (it.hasNext()) {
                Codigopostal elementos = it.next();

                if (elementos.getCodpostal().equalsIgnoreCase(opcion)) {
                    it.remove();
                    System.out.println(" se removido " + elementos);
                }
            }
            System.out.println(" desea seguir quitando? Y/N");
            opc = leer.nextLine();
        } while (!(opc.equalsIgnoreCase("N")));
    }

    public void listarcodigos() {
        for (Codigopostal elemento : listacod) {

            System.out.println(elemento);

        }

    }

    public void buscarCod() {
        String nuevo;
        Scanner leer = new Scanner(System.in);
        int c = 0;

        System.out.println("ingrese el codigo a buscar");
        nuevo = leer.nextLine();
        for (Codigopostal elemento : listacod) {

            if (elemento.getCodpostal().equalsIgnoreCase(nuevo)) {
                System.out.println("se encontro una coincidencia " + elemento.getCiudad());
                c++;
            }

        }
        if (c == 0) {
            System.out.println(" no se encontraron coincidencias");
        }

    }

    @Override
    public String toString() {
        return "Correo{" + "listacod=" + listacod + '}';
    }

}
