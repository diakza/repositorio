package ejjercicio1extraguia4b;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Alquiler {

    private String nombre;

    private String dni;

    private LocalDate fechaing;

    private LocalDate fechaDevolucion;

    private int posicionAmarre;

    private Barco barco;

    public Alquiler() {
    }

    
    public Alquiler(String nombre, String dni, LocalDate fechaing, LocalDate fechaDevolucion, int posicionAmarre, Barco barco) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaing = fechaing;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }
    
    
    public void cantidadDias(){
        
        long diasOcupacion = ChronoUnit.DAYS.between(fechaing, fechaDevolucion);
        
        System.out.println("su estadia fue de "+diasOcupacion);
        double precioalquiler;
       precioalquiler= diasOcupacion*barco.calcularModulo();
        System.out.println("el precio final de su alquiler "+precioalquiler);
      }
    
    
    
    
    
    
}
