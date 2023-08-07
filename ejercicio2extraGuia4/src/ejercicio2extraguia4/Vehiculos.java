package ejercicio2extraguia4;

import java.util.Scanner;

public class Vehiculos {

    Scanner leer = new Scanner(System.in);
    protected String marca;

    protected int patente;

    protected Combustible combustible;

    public Vehiculos(String marca, int patente, Combustible combustible) {
        this.marca = marca;
        this.patente = patente;
        this.combustible = combustible;
    }

    public Vehiculos() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPatente() {
        return patente;
    }

    public void setPatente(int patente) {
        this.patente = patente;
    }

    public Combustible getCombustible() {
        return combustible;
    }

    public void setCombustible(Combustible combustible) {
        this.combustible = combustible;
    }

   
    public double calcularCostoDeCombustible() {

        System.out.println("Bienvenido al menú de opciones");
        System.out.println("1.nafta ");
        System.out.println("2.nafta premium ");
        System.out.println("3.diesel ");
        System.out.println("4.diesel premium ");
        System.out.println("5. Salir");

        System.out.print("Ingrese la opción que desea: ");
        int opcion = leer.nextInt();
        double valor = 0;
        switch (opcion) {
            case 1:
                 valor = 260;

            case 2:
                 valor = 290;

            case 3:
                 valor = 280;

            case 4:
                 valor = 310;

        }return valor;
    }

}

