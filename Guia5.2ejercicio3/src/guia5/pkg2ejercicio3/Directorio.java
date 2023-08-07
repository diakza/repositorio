package guia5.pkg2ejercicio3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Directorio {

    HashMap<String, Cliente> personas = new HashMap();

    public Directorio() {
    }

    public void agregarCliente(Cliente cliente, String nro) {

        personas.put(nro, cliente);

    }

    public Cliente buscarCliente(String nro) {

        for (Map.Entry<String, Cliente> entry : personas.entrySet()) {
            String key = entry.getKey();
            Cliente value = entry.getValue();

            if (key.equals(nro)) {
                return value;
            }
        }
        return null;
    }

    public List<Cliente> buscarTeléfono(String apellido) {

        ArrayList<Cliente> buscarApellido = new ArrayList();
        for (Map.Entry<String, Cliente> entry : personas.entrySet()) {
            String key = entry.getKey();
            Cliente value = entry.getValue();
            if (value.getApellido().equals(apellido)) {

                buscarApellido.add(value);
            }

        }

        return buscarApellido;

    }

    public List<Cliente> buscarclientesPorLocalidad(String ciudad) {

        ArrayList<Cliente> buscarLocalidad = new ArrayList();
        for (Map.Entry<String, Cliente> entry : personas.entrySet()) {
            String key = entry.getKey();
            Cliente value = entry.getValue();
            if (value.getLocalidad().equals(ciudad)) {

                buscarLocalidad.add(value);
            }

        }
        if (buscarLocalidad.isEmpty()) {
            System.out.println(" el cliente no esta en esa localidad");
        }
        return buscarLocalidad;

    }

    public void borrarcliente(String telefono) {

        for (Map.Entry<String, Cliente> entry : personas.entrySet()) {
            String key = entry.getKey();

            if (key.equals(telefono)) {
                personas.remove(key);
                System.out.println(" se borro el numero de telefono " + key);
            }

        }

    }
    
    public void mostrarGuia(){
        for (Map.Entry<String, Cliente> entry : personas.entrySet()) {
            
            Cliente value = entry.getValue();
            
            System.out.println("guia de telefonos");
            System.out.println(value);
            
            
        }
    }

    @Override
    public String toString() {
        return "Directorio{" + "personas=" + personas + '}';
    }
    
    
    
}
