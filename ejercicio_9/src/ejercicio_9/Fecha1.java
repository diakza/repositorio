/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_9;

/**
 *
 * @author diakz
 */
  public class Fecha1 {

    private int dia;
    private int mes;
    private int año;

    public Fecha1(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public Fecha1() {
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public boolean esBisiesto() {
        return (((año % 4 == 0) && (año % 100 != 0)) || (año % 400 == 0));
    }

    // la proxima hacer con while
    public int calcularAños(Fecha1 nueva) {
        int añosTranscurridos = 0;

        if (this.año > nueva.año) {
            añosTranscurridos = this.año - nueva.año;
            if (this.mes > nueva.mes) {
                añosTranscurridos--;
            } else if (this.mes == nueva.mes && this.dia < nueva.dia) {
                añosTranscurridos--;
            } else if (this.año < nueva.año) {
                añosTranscurridos = this.año - nueva.año;
                if (nueva.mes < this.mes) {
                    añosTranscurridos--;
                } else if (nueva.mes == this.mes && nueva.dia < this.dia) {
                    añosTranscurridos--;
                }

            }
            return añosTranscurridos;
        }
