package ejercicioextra3guia4;

import java.time.LocalDate;

public class TrabajoPintura extends Servicio {

    private String edificacion;

    private double precioPintura;

    private double superficie;

    public TrabajoPintura(String edificacion, double precioPintura, double superficie, String trabajador, String cliente, LocalDate fechaInicio) {
        super(trabajador, cliente, fechaInicio);
        this.edificacion = edificacion;
        this.precioPintura = precioPintura;
        this.superficie = superficie;
    }

    public TrabajoPintura() {
    }

    public String getEdificacion() {
        return edificacion;
    }

    public void setEdificacion(String edificacion) {
        this.edificacion = edificacion;
    }

    public double getPrecioPintura() {
        return precioPintura;
    }

    public void setPrecioPintura(double precioPintura) {
        this.precioPintura = precioPintura;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

   // Coste_material = (Superficie / 7.8) * PrecioPintura;
    @Override
    public double costeMaterial() {
       
        double costoMaterial=0;
        
        
        costoMaterial=(superficie/7.8)*precioPintura;
        
        
        return costoMaterial;
    }

    @Override
    public double costeManoObra() {
      double  costomanodeobra = (superficie / 10) * 9.5;
      
      
      return costomanodeobra;
    }

    @Override
    public double costeTotal() {
       
        double total=costeManoObra()+costeMaterial();
        
        
        if (superficie<50) {
            
            return total*1.15;
        }else{
            
            return total;
        }
       
       
    }
    
    public double adicional(){
       if (superficie>50) {
            
            return 0;
        }else{
            
            return costeTotal()*0.15 ;
        }
        
    }

    @Override
    public String detalleServicio() {
        
        return "TRABAJO DE PINTURA\n"
                +"Cliente: "+cliente+"\n"
                +"Fecha de inicio: "+fechaInicio+"\n"
                +"---------------------------------\n"
                +"Pintor: "+trabajador+"\n"
                +"Costo material: $"+costeMaterial()+"\n"
                +"Costo mano de obra: $"+costeManoObra()+"\n"
                +"Costo adicional: $"+adicional()+"\n"
                +"Total: $"+costeTotal()+"\n"
                +"---------------------------------";
        
    }
}
