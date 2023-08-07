package ejercicio.pkg1b;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author diakz
 */
public class Persona {
    
    
    private String nombre;
    private String apellido;
    private int documento;
    private int edad;
    private Perro perro1, perro2, perro3;

    public Persona(String nombre, String apellido, int documento, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.edad = edad;

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

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void adoptaPerro(Perro perro) {
        if (perro1 == null) {
            perro1 = perro;
        } else if (perro2 == null) {
            perro2 = perro;
        } else if (perro3 == null) {
            perro3 = perro;
        } else {
            System.out.println("no se puede adoptar mas perros");
        }
    }
      public Perro perroMasGrande(){
          this.perro1.getEdad();
          this.perro2.getEdad();
          this.perro3.getEdad();
          if(this.perro1.getEdad()> this.perro2.getEdad() && this.perro1.getEdad()>  this.perro3.getEdad()  ){
              return this.perro1;
              
          }else if(this.perro2.getEdad()> this.perro1.getEdad() && this.perro2.getEdad()>  this.perro3.getEdad()  ){
             return this.perro2;
          }else{
              return this.perro3;
          }
      }
    
}
