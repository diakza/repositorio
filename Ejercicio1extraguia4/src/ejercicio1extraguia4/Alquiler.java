package ejercicio1extraguia4;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Alquiler {

    private Barco barco1, barco2, barco3;

    private LocalDate fechaing;

    private LocalDate fechaDevolucion;

    private int posicionAmarre;

    private int dni;

    private String nombrecliente;

    public Alquiler(Barco barco, LocalDate fechaing, LocalDate fechaDevolucion, int posicionAmarre, int dni, String nombrecliente) {
        
        this.fechaing = fechaing;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.dni = dni;
        this.nombrecliente = nombrecliente;
    }

    public Alquiler() {
    }

    

    public LocalDate getFechaing() {
        return fechaing;
    }

    public void setFechaing(LocalDate fechaing) {
        this.fechaing = fechaing;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(int posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombrecliente() {
        return nombrecliente;
    }

    public void setNombrecliente(String nombrecliente) {
        this.nombrecliente = nombrecliente;
    }


    
    
    

    public double calcularEstadia() {

        System.out.println(" el barco ingreso " + fechaing);

        System.out.println(" el barco se devolvio el dia " + fechaDevolucion);
        double estadia = ChronoUnit.DAYS.between(fechaing, fechaDevolucion);
        System.out.println("su estadia fue de " + estadia + " dias");

        
        
        

        return estadia;
    }

    
    
    public double estadia(){
        
        double estadia = ChronoUnit.DAYS.between(fechaing, fechaDevolucion);
        
        return estadia;
    }
    
    
}
