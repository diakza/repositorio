package guia5.pkg2ejercicio3;

public class Cliente {

    private int dni;

    private String direccion;

    private String localidad;

    private String nombre;

    private String apellido;

    public Cliente() {
    }

    public Cliente(int dni, String direccion, String localidad, String nombre, String apellido) {
        this.dni = dni;
        this.direccion = direccion;
        this.localidad = localidad;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Cliente{" + "dni=" + dni + ", direccion=" + direccion + ", localidad=" + localidad + ", nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    
    
    
}
