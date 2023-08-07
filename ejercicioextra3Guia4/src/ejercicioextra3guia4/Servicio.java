package ejercicioextra3guia4;

import java.time.LocalDate;

public abstract class Servicio {

    protected String trabajador;

    protected String cliente;

    protected LocalDate fechaInicio;

    public Servicio(String trabajador, String cliente, LocalDate fechaInicio) {
        this.trabajador = trabajador;
        this.cliente = cliente;
        this.fechaInicio = fechaInicio;
    }

    public Servicio() {
    }

    public String getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(String trabajador) {
        this.trabajador = trabajador;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    
    
    
    public double costeMaterial() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public double costeManoObra() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public double costeTotal() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String detalleServicio() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
