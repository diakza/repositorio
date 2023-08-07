/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.kiosco;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author diakz
 */
public class Kiosco {
    private String _direccion;
    private String _nombre;
    private int _cuil;
    private Empleado empleado;
    private Empleado empleado1;
    private Empleado empleado2;

    public Kiosco(String nombre, String direccion, int cuil){
        this._direccion=direccion;
        this._nombre=nombre;
        this._cuil=cuil;
    }

    public String nombre(){return this._nombre;}
    public String direccion(){return this._direccion;}
    public int cuil(){return this._cuil;}

    public void setNombre(String nombre){this._nombre=nombre;}
    public void setDireccion(String direccion){this._direccion=direccion;}
    public void setCuil(int cuil){this._cuil=cuil;}

    public void contratarEmpleado(Empleado empleado){
        if(this.empleado==null)
            this.empleado=empleado;
        else if(this.empleado1==null)
            this.empleado1=empleado;
        else if(this.empleado2==null)
            this.empleado2=empleado;
        else
            System.out.println("NO SE PUEDE CONTRATAR POR SUELDO MINIMO.");
    }

    public Empleado masAntiguo(){
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 1);
        cal.set(Calendar.MONTH, 0);
        cal.set(Calendar.DATE, 1);
        Date date = cal.getTime();
        Empleado retorno=null;

        if(empleado!=null){
            if(date.before(empleado.date())){
                date=empleado.date();
                retorno=empleado;}
        }
        else if(empleado1!=null){
            if(date.before(empleado1.date())){
                date=empleado1.date();
                retorno=empleado1;}
        }
        else if(empleado2!=null){
            if(date.before(empleado2.date())){
                date=empleado2.date();
                retorno=empleado2;}
        }
        return retorno;
    }
}

