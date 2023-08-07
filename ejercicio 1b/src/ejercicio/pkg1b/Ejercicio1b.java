/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg1b;

/**
 *
 * @author diakz
 */
public class Ejercicio1b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Perro p1 = new Perro("firulay","cusco",3,"mediano");
       Perro p2 = new Perro("lay","cus",1,"chico");
       Perro p3 = new Perro("firu","sco",6,"grande");
       Perro p4 = new Perro("rulay","cusco",5,"mediano");
       
       Persona per = new Persona("jose","diaz",23656565,39);
       per.adoptaPerro(p1);
       per.adoptaPerro(p2);
       per.adoptaPerro(p3);
       per.adoptaPerro(p4);
      
        System.out.println(per.perroMasGrande());
       
    }
    
}
        // TODO code application logic here
    
    
