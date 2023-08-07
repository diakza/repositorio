package ejercicioextra3guia4;

public class Empresa {

    private double cantidadServicios;

    public Empresa() {
        this.cantidadServicios = 0;
    }

    public double getCantidadServicios() {
        return cantidadServicios;
    }

    public void setCantidadServicios(double cantidadServicios) {
        this.cantidadServicios = cantidadServicios;
    }

    public void contratarServicio(Servicio servicio) {

        if (servicio instanceof TrabajoPintura) {

            System.out.println("tipo de edificacion " + ((TrabajoPintura) servicio).getEdificacion());
            System.out.println("----------------------------------------");
            System.out.println(""+ servicio.detalleServicio());
            cantidadServicios += servicio.costeTotal();
        }
        if (servicio instanceof RevisionAlarma) {
            
           System.out.println(""+ servicio.detalleServicio());
            cantidadServicios += servicio.costeTotal();
        }

    }

    public void mostrarCostoTotalDeObras() {
        
        System.out.println("gasto total de las obras "+cantidadServicios);
        
        
        
    }
}
