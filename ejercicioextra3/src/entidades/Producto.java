/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author diakz
 */
public class Producto {
    
    private String descripcion;
    private double precioLista;
    private int stock;
    private int tipoDeProducto;
    // si es lacteos es 1
    // si es limpieza 2
    // si es otra cosa 3

    public Producto(String descripcion, double precioLista, int stock, int tipoDeProducto) {
        this.descripcion = descripcion;
        this.precioLista = precioLista;
        this.stock = stock;
        this.tipoDeProducto = tipoDeProducto;
    }

    public Producto() {
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioLista() {
        return precioLista;
    }

    public void setPrecioLista(double precioLista) {
        this.precioLista = precioLista;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getTipoDeProducto() {
        return tipoDeProducto;
    }

    public void setTipoDeProducto(int tipoDeProducto) {
        this.tipoDeProducto = tipoDeProducto;
    }
    
    
    public double precioPublico(){
        
        double total = this.precioLista;
        
        
        
        
        switch (this.getTipoDeProducto() ) {
            case 1:
                 total += total * 0.25;
                break;
            case 2:
                total += total * 0.35;
                break;
            case 3:
                total += total * 0.45;
                break;
        }
            return total;
        }
        
        
    }

