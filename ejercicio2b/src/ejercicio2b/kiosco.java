package ejercicio2b;

import ejercicio2b.empleado;

public class kiosco {

    private String nombre;

    private String direccion;

    private int cuit;

    private empleado empleado1;

    private empleado empleado2;

    private empleado empleado3;
    private empleado empleado4;

    public kiosco(String nombre, String direccion, int cuit) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.cuit = cuit;
    }

    public kiosco() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCuit() {
        return cuit;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }

    public void limite(empleado empleado) {

        if (empleado4 == null) {
            System.out.println("terminaron la entrevistas");
                

            

        }
    }

    

    public void antiguedadm(empleado empleado1, empleado empleado2, empleado empleado3) {

        if (empleado1.getAntiguedad() > empleado2.getAntiguedad()) {
            System.out.println("el mas antiguo es " + empleado1.getNombre());

        } else if (empleado2.getAntiguedad() > empleado3.getAntiguedad()) {
            System.out.println("el mas antiguo es " + empleado2.getNombre());
        } else if (empleado3.getAntiguedad() > empleado1.getAntiguedad()) {
            System.out.println("el mas antiguo es " + empleado3.getNombre());
        } else {
            System.out.println("no se puede contratar mas empleados");

        }



    }

}
