//En un nuevo proyecto crear una clase de nombre Producto con los atributos código de tipo
//entero, descripción un String, precio de tipo double y stock de tipo entero; un constructor
//que permita inicializar todos sus atributos y los métodos get y set. Desde el método main
//de clase principal del proyecto instanciar un Producto y luego mostrar por consola el estado
//de todos sus atributos.
package newpackage;

/**
 *
 * @author diakz
 */
public class Producto {
    private int codigo;
    private String descripcion;
    private double precio;
    private int stock;
    
    
    
    
    public Producto(int codigo,String descripcion,double precio,int stock){
        
        this.codigo=codigo;
        this.descripcion=descripcion;
        this.precio=precio;
        this.stock=stock;
        
        
    }
public Producto (){}


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    public void mostrar(){
        System.out.println("el codigo es "+codigo);
        System.out.println(descripcion);
        System.out.println("su precio es de $ "+precio);
        System.out.println("su stock es de "+stock);
    }
      
            
}
