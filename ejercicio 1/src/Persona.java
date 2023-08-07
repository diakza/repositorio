
import java.util.Scanner;



public class Persona {
    Scanner leer = new Scanner(System.in);
    private String nombre;

    private String apellido;

    private int edad;

    private int dni;

    private Perro perro1;

    private Perro perro2;

    private Perro perro3;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Perro getPerro1() {
        return perro1;
    }

    public void setPerro1(Perro perro1) {
        this.perro1 = perro1;
    }

    public Perro getPerro2() {
        return perro2;
    }

    public void setPerro2(Perro perro2) {
        this.perro2 = perro2;
    }

    public Perro getPerro3() {
        return perro3;
    }

    public void setPerro3(Perro perro3) {
        this.perro3 = perro3;
    }
    
    
//    Realizar un programa para que una Persona pueda adoptar hasta tres Perros. Vamos a contar de
//dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño, un constructor que
//permita inicializar todos sus atributos y los respectivos métodos getter y setter de sus atributos; y
//la clase Persona con atributos: nombre, apellido, edad, documento y tres atributos de tipo Perro,
//un constructor que sólo permita inicializar los atributos: nombre, apellido, edad y documento. La
//Persona cuenta además con los siguientes métodos:
//adoptarPerro() Este método recibe por parámetro un Perro y lo asigna en alguna de las variables
//vacías; si todas las variables atributos Perro están ocupadas, mostrará un mensaje “Ya no puedo
//adoptar”.
//perroMasGrande() Este método retornará el Perro de mayor edad.
//
//Ahora deberemos en el main crear una Persona y 4(cuatro) Perros. Después, vamos a hacer que
//persona adopte cada uno de esos Perros (luego al ejecutar veremos que pasa), por último pediremos
//a la Persona que nos diga cual es el Perro más viejo.
//    
    
   public void adoptarPerro(Perro perro1){
       
    }
   public void relleno(){
       System.out.println("ingrese el nombre de la persona");
       nombre=leer.nextLine();
       System.out.println("ingrese el apellido ");
       apellido=leer.nextLine();
       System.out.println("ingrese la edad de la persona");
       edad=leer.nextInt();
       System.out.println("ingrese el dni de la persona");
       dni=leer.nextInt();
   }
   public void perroMasGrande(){
       
       
       
   }
   public String toString(){
       return null;
       
  }
   
}
