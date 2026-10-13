package sistema.de.gestión.de.transporte.turístico;

import java.util.ArrayList;

public class FlotaVehiculos {
    private ArrayList<Vehiculo> vehiculos;
    
    public FlotaVehiculos() {
            vehiculos = new ArrayList<>();
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public Vehiculo buscarPorPatente(String patente) {
        if (patente == null) {
            return null;
        }
        patente = patente.trim();
        for (int i = 0; i < vehiculos.size(); i++) {
            if (vehiculos.get(i).getPatente().equalsIgnoreCase(patente)) {
                return vehiculos.get(i);
            }
        }
        return null;
    }

    public void agregarVehiculo(Vehiculo v) {
        if (buscarPorPatente(v.getPatente()) != null) {
            throw new IllegalArgumentException("ERROR; La patente del vehiculo que desea agregar ya esta registrada.");
        }
        else {
            vehiculos.add(v);
        }
    }

    public ArrayList<Vehiculo> filtrarPorCapacidad(int minimo) {
        ArrayList<Vehiculo> resultado =  new ArrayList<>();
        for (int i = 0; i < vehiculos.size(); i++) {
            if (vehiculos.get(i).getCapacidadPasajeros() > minimo) {
                resultado.add(vehiculos.get(i));
            }
        }
        return resultado;
    }
        
    public void mostrarVehiculos(ArrayList<Vehiculo> lista) {
        if (lista.isEmpty()) {
            System.out.println("No hay vehiculos para mostrar.");
        }
        else {
            for (int i = 0; i < lista.size(); i++) {
                System.out.println(lista.get(i));
                System.out.println();
            }  
        }
    }
    
    public void realizarServiciosTuristicosTodos() {
        if (vehiculos.isEmpty()) {
            System.out.println("No hay vehiculos cargados.");
        }
        else {
            for (int i = 0; i < vehiculos.size(); i++) {
                vehiculos.get(i).realizarServiciosTuristicos();
            }
        }
    }
    
    public ArrayList<Vehiculo> ordenarPorAnioDesc() {
        ArrayList<Vehiculo> copia = new ArrayList<>(vehiculos);
        for (int i = 0; i < copia.size() - 1; i++) {
            for (int j = i + 1; j < copia.size(); j++) {
                if (copia.get(i).getAnioFabricacion() < copia.get(j).getAnioFabricacion()) {
                    Vehiculo aux = copia.get(i);
                    copia.set(i, copia.get(j));
                    copia.set(j, aux);
                }
            }
        }
        return copia;
    }
    
    public ArrayList<Vehiculo> ordenarPorCapacidadDesc() {
    ArrayList<Vehiculo> copia = new ArrayList<>(vehiculos);
    for (int i = 0; i < copia.size() - 1; i++) {
        for (int j = i + 1; j < copia.size(); j++) {
            if (copia.get(i).getCapacidadPasajeros() < copia.get(j).getCapacidadPasajeros()) {
                Vehiculo aux = copia.get(i);
                copia.set(i, copia.get(j));
                copia.set(j, aux);
            }
        }
    }
    return copia;
     }
    
    
    
    
    
    
}
