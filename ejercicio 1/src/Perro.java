
import java.util.Scanner;

public class Perro {
    Scanner leer = new Scanner(System.in);
    private String nombre;

    private String raza;

    private String size;

    private int edad;

    public Perro() {
    }

    public Perro(String nombre, String raza, String size, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.size = size;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void rrellenor(){
        System.out.println("ingrese el nombre del perro");
        nombre=leer.nextLine();
        System.out.println("ingrese la raza del perro");
        raza=leer.nextLine();
        System.out.println("ingrese la edad del perro");
        edad=leer.nextInt();
        System.out.println("ingrese el tamaño del perro");
        size=leer.nextLine();
    }
            
}
