package ejercicioextra3guia4;

import java.time.LocalDate;

public class RevisionAlarma extends Servicio {

    private int numeroAlarmas;

    public RevisionAlarma(int numeroAlarmas, String trabajador, String cliente, LocalDate fechaInicio) {
        super(trabajador, cliente, fechaInicio);
        this.numeroAlarmas = numeroAlarmas;
    }

    public int getNumeroAlarmas() {
        return numeroAlarmas;
    }

    public void setNumeroAlarmas(int numeroAlarmas) {
        this.numeroAlarmas = numeroAlarmas;
    }

    
    
    
    @Override
    public double costeMaterial() {
       double costo=0;
       return costo;
    }

    @Override
    public double costeManoObra() {
     double  CosteManoObra = (numeroAlarmas / 3) * 40;
     
     return CosteManoObra;
     
    }
    

    @Override
    public double costeTotal() {
        double total=costeManoObra();
        return total;
    }

    @Override
    public String detalleServicio() {
        
        return
         "REVISIÓN PERIÓDICA ALARMAS CONTRAINCENDIOS\n"
                +"Cliente: "+cliente+"\n"
                +"Fecha de Revision: "+fechaInicio+"\n"
                +"---------------------------------\n"
                +"\n"
                +"Total: $"+costeTotal()+"\n"
                +"---------------------------------";
        
        
        
    }
}
