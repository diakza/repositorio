/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2extraguia5;

import java.util.Scanner;

/**
 *
 * @author diakz
 */
public class Dato {

    private String[] nombre;
    private String[] apellido;
    private double[][] milim;

    public Dato() {
    }

    public Dato(int fila, int columna) {
        this.nombre = new String[columna];
        this.apellido = new String[columna];
        this.milim = new double[fila][columna];
    }

    public String[] getNombre() {
        return nombre;
    }

    public void setNombre(String[] nombre) {
        this.nombre = nombre;
    }

    public String[] getApellido() {
        return apellido;
    }

    public void setApellido(String[] apellido) {
        this.apellido = apellido;
    }

    public double[][] getMilim() {
        return milim;
    }

    public void setMilim(double[][] milim) {
        this.milim = milim;
    }

    public void llenar() {
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            nombre[i] = "";
            apellido[i] = "";

        }
        System.out.println("Ingrese lo  mm de lluvia caida");

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 3; j++) {
                milim[i][j] = 0;
                if (j == 0 && milim[i][j] >= 0) {
                    System.out.println("Datos de San Luis");
                    milim[i][j] 
                            
                            
                }
                if (j == 1 && milim[i][j] >= 0) {
                    System.out.println("Datos de Merlo");
                    milim[i][j] = leer.nextDouble();

                }
                if (j == 2 && milim[i][j] >= 0) {
                    System.out.println("Datos de Villa Mercedes");
                    milim[i][j] = leer.nextDouble();

                }

            }
        }

        int cont1 = 0;
        for (int i = 0; i < 3; i++) {

            if (cont1 == 0 && nombre[i] == "" && apellido[i] == "") {
                System.out.println("Datos de San Luis");
                System.out.println("Ingrese el nombre de empleado");
                nombre[i] = leer.next();
                System.out.println("Ingrese el apellido de empleado");

                apellido[i] = leer.next();
                cont1++;

            }
            if (cont1 == 1 && nombre[i] == "" && apellido[i] == "") {
                System.out.println("Datos de Merlo");
                System.out.println("Ingrese el nombre de empleado");

                nombre[i] = leer.next();
                System.out.println("Ingrese el apellido de empleado");

                apellido[i] = leer.next();
                cont1++;
            }
            if (cont1 == 2 && nombre[i] == "" && apellido[i] == "") {
                System.out.println("Datos de Villa Mercedes");
                System.out.println("Ingrese el nombre de empleado");

                nombre[i] = leer.next();
                System.out.println("Ingrese el apellido de empleado");

                apellido[i] = leer.next();
                cont1++;
            }
        }
    }

}
