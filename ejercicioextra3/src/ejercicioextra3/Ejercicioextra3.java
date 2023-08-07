/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioextra3;

import entidades.Cliente;
import entidades.Producto;
import entidades.Vendedor;
import negocio.Venta;

/**
 *
 * @author diakz
 */
public class Ejercicioextra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Producto prod1 = new Producto("leche",360.50,1,1);
         Producto prod2 = new Producto("poet",250.50,1,2);
         Producto prod3 = new Producto("falopa",5000.50,100,3);
        Cliente carlos=new Cliente (1,"carlos");
        Vendedor eugenio = new Vendedor("eugenio",carlos);
        Venta juguete =new Venta(carlos,eugenio,prod1,prod2,prod3); 
        
        
        
        System.out.println("la venta la realizo "+juguete.getV1().getNombre());
        System.out.println(juguete.calcularTotal());
        
    }
    
}
//producto productoA=new producto("leche", 100,10,"Lacteo");
//      producto productoB=new producto("tira de asado", 3600, 10, "Lacteo");
//      producto productoC=new producto("ayudin", 300, 50, "Lacteo");
//      cliente cliente1=new cliente("Neuquen");
//      vendedor vendedor1=new vendedor("Juan");
//      venta venta1=new venta(cliente1, vendedor1, productoA, productoB, productoC);
//      venta1.calculartotal();
//        System.out.println("la venta la realizo "+venta1.getVendedor1().getNombre());
//        System.out.println(venta1.calculartotal());