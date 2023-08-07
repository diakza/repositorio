/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.kiosco;

import java.util.Date;

/**
 *
 * @author diakz
 */
public class Empleado {
    
    
    private String _nombre;
    private String _apellido;
    private int _dni;
    private Date _fechaIngreso;


    public Empleado(String nombre, String apellido, int dni, Date fecha){
        this._nombre=nombre;
        this._apellido=apellido;
        this._dni=dni;
        this._fechaIngreso=fecha;
    }

    public String nombre(){return this._nombre;}
    public String apellido(){return this._apellido;}
    public int dni(){return this._dni;}
    public Date date(){return this._fechaIngreso;}

    public void setNombre(String nombre){this._nombre=nombre;}
    public void setApellido(String apellido){this._apellido=apellido;}
    public void setDni(int dni){this._dni=dni;}
    public void setdate(Date date){this._fechaIngreso=date;}

    public String toString(){
        return String.format("EMPLEADO: Nombre: %s, Apellido: %s, Dni= %d, Fecha de ingreso: %s", _nombre, _apellido, _dni, _fechaIngreso);
    }
}
    

