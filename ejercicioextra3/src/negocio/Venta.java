/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import entidades.Cliente;
import entidades.Producto;
import entidades.Vendedor;

/**
 *
 * @author diakz
 */
public class Venta {

    private Cliente c1;
    private Vendedor v1;
    private Producto p1;
    private Producto p2;
    private Producto p3;

    public Venta(Cliente c1, Vendedor v1, Producto p1, Producto p2, Producto p3) {
        this.c1 = c1;
        this.v1 = v1;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    

    public Venta() {
    }

    public Cliente getC1() {
        return c1;
    }

    public void setC1(Cliente c1) {
        this.c1 = c1;
    }

    public Vendedor getV1() {
        return v1;
    }

    public void setV1(Vendedor v1) {
        this.v1 = v1;
    }

    public Producto getP1() {
        return p1;
    }

    public void setP1(Producto p1) {
        this.p1 = p1;
    }

    public Producto getP2() {
        return p2;
    }

    public void setP2(Producto p2) {
        this.p2 = p2;
    }

    public Producto getP3() {
        return p3;
    }

    public void setP3(Producto p3) {
        this.p3 = p3;
    }

    
    public double calcularTotal(){
        
        double total=p1.precioPublico()+p2.precioPublico()+p3.precioPublico();
        
        
        if (c1.getOrigen()==1) {
            return total=total-total*0.1;
            
            
        }else
            return total=total-total*0.15;
        
        
    }
}
