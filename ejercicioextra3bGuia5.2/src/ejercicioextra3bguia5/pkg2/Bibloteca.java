/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioextra3bguia5.pkg2;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author diakz
 */
public class Bibloteca {
    
    
     Set<Libro2> libreria;

    /**
     *
     * @param libreria
     */
    public Bibloteca(Set<Libro2> libreria) {
        
        this.libreria = new HashSet<>(libreria);
    }
    public boolean prestamo(String titulo,String autor){
        int count = 0;
        if(comprobacion(titulo,autor)) {
            for (Libro2 l : libreria) {
                if (l.getTitulo().equalsIgnoreCase(titulo) && l.getAutor().equalsIgnoreCase(autor)) {
                    if (l.getNumeroDeEjemplares() > l.getEjemplaresPrestados()) {
                        l.setEjemplaresPrestados(l.getEjemplaresPrestados() + 1);
                        System.out.println("prestado");
                        count++;
                    }else {
                        System.out.println("No hay mas ejemplares que prestar");
                        return  false;
                    }
                }
            }
            if (count == 0) {
                System.out.println("No se ha encontrado el titulo solicitado");
            }

        }
        return count > 0;
    }
    public boolean devolucion(String titulo,String autor){
        int count=0;
        if(comprobacion(titulo,autor)) {

            for (Libro2 l : libreria) {
                if (l.getTitulo().equalsIgnoreCase(titulo) && l.getAutor().equalsIgnoreCase(autor)) {
                    if (l.getEjemplaresPrestados() == 0) {
                        System.out.println("no hay libro que devolver");
                        return false;
                    }else{
                        l.setEjemplaresPrestados(l.getNumeroDeEjemplares() - 1);
                        count++;
                    }

                }
            }
        }else{
            System.out.println("Libro no entontrado");
            return false;
        }

        return count>0;
    }
    private boolean comprobacion(String titulo,String autor){
        for(Libro2 l:libreria){
            if(l.getTitulo().equals(titulo)&&
                    (l.getAutor().equalsIgnoreCase(autor))){
                return true;
            }
        }
        return false;
    }
    public void mostarLibros(){
        for(Libro2 l:libreria){
            System.out.println(l);
        }
    }


}

    
   
