package ejercicio2guia5.pkg1;

import java.util.Iterator;
import java.util.LinkedList;

public class Cuenta {

    private long numero;

    private double saldo;

    private Cliente titular;

    LinkedList<String> movimiento = new LinkedList();

    public Cuenta() {
    }

    public Cuenta(long numero, double saldo, Cliente titular) {
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public void depositar(double cantidad) {
        System.out.println("se deposito " + cantidad);
        saldo += cantidad;
        movimiento.add("D");

    }

    public void extraer(double cantidad) {
        if (cantidad > saldo) {
            System.out.println(" no hay dinero suficiente para la extraccion");

        } else {
            System.out.println("se extrajo " + cantidad);
            saldo -= cantidad;
            movimiento.add("E");
        }

    }

    public void cambiarInteresAnual(double valor) {

        System.out.println("el interes anual es de " + saldo * valor);
    }

    public Cliente verTitular() {
        return titular;
    }

    public double verSaldo() {
        return saldo;
    }

    public void listarMovimientos() {

        for (String elementos : movimiento) {

            System.out.println("movimientos realizados "+ elementos);
        }

    }
}
