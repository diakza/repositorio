/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejericicioextra4guia5.pkg2;

import java.util.HashSet;

/**
 *
 * @author diakz
 */
public class Codigopostal {
    
    private String codpostal;
    private String ciudad;

    @Override
    public String toString() {
        return "Codigopostal{" + "codpostal=" + codpostal + ", ciudad=" + ciudad + '}';
    }
   
    public Codigopostal() {
    }

    public Codigopostal(String codpostal, String ciudad) {
        this.codpostal = codpostal;
        this.ciudad = ciudad;
        
    }

    public String getCodpostal() {
        return codpostal;
    }

    public void setCodpostal(String codpostal) {
        this.codpostal = codpostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
   
    
    
    
    
}
