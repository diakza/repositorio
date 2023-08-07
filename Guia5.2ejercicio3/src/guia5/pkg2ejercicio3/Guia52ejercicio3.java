/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia5.pkg2ejercicio3;

import java.util.List;

/**
 *
 * @author diakz
 */
public class Guia52ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Directorio guia = new Directorio();

        Cliente c1 = new Cliente(5646545, "belgrano", "san luis", "juan", "azucar");
        Cliente c2 = new Cliente(123546, "mitre", "buenos aires", "china", "lila");
        Cliente c3 = new Cliente(5135746, "corrientes", "cordoba", "jamaica", "lila");
        Cliente c4 = new Cliente(565646145, "san martin", "buenos aires", "monica", "argento");
        Cliente c5 = new Cliente(5646545, "alvear", " santa fe", "pepe", "galindes");

        guia.agregarCliente(c1, "1140588893");
        guia.agregarCliente(c2, "114543544");
        guia.agregarCliente(c3, "11546+5454");
        guia.agregarCliente(c4, "114895686");
        guia.agregarCliente(c5, "1146565655");
        System.out.println(guia.buscarCliente("1140588893"));

        System.out.println("---------------------------------");
        List<Cliente> dire = guia.buscarclientesPorLocalidad("buenos aires");
        for (Cliente elementos : dire) {
            System.out.println(elementos);

        }
        System.out.println("------------------------------------");

        List<Cliente> dire1 = guia.buscarTeléfono("lila");
        for (Cliente elementos : dire1) {
            System.out.println(elementos);
        }

        guia.borrarcliente("1146565655");

        System.out.println("------------------------------");

        guia.mostrarGuia();

    }

}
