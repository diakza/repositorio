/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg1;

/**
 *
 * @author diakz
 */
class Persona {
    
    private String nombre;
    
    private String apellido;
    
    private int edad;
    private String documento;
    
    private Perro perro1;
    
    private Perro perro2;
    
    private Perro perro3;
    
    public Persona(String nombre, String apellido, int edad, String documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.perro1 = null; // Inicialmente no tiene ningún perro
        this.perro2 = null;
        this.perro3 = null;
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
    
    public String getDocumento() {
        return documento;
    }
    
    public void setDocumento(String documento) {
        this.documento = documento;
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
    public void adoptarPerro(Perro perro) {
        if (this.perro1 == null) { // Si no tiene ningún perro, lo asigna al primer atributo
            this.perro1 = perro;
            System.out.println(this.nombre + " ha adoptado a " + perro1.getNombre());
        } else if (this.perro2 == null) { // Si ya tiene un perro, lo asigna al segundo atributo
            this.perro2 = perro;
            System.out.println(this.nombre + " ha adoptado a " + perro2.getNombre());
        } else if (this.perro3 == null) { // Si ya tiene dos perros, lo asigna al tercer atributo
            this.perro3 = perro;
            System.out.println(this.nombre + " ha adoptado a " + perro3.getNombre());
        } else { // Si ya tiene tres perros, no puede adoptar más
            System.out.println("Ya no puedo adoptar");
    
        
        }
    }
    public String tostring(){
       return "nombre"+perro1.getNombre();
        
        
    }
    
    
//    Perro perroMasGrande(Perro perro) {
//        if (true) {
//            
//        }
//        
//    }
    
}
