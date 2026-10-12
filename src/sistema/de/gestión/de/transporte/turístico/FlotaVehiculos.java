package sistema.de.gestión.de.transporte.turístico;

import java.util.ArrayList;

public class FlotaVehiculos {
    private ArrayList<Vehiculo> vehiculos;
    
    public FlotaVehiculos() {
            vehiculos = new ArrayList<>();
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
            throw new IllegalArgumentException("ERROR; La patente del vehiculo que desea agreagar ya esta registrada.");
        }
        else {
            vehiculos.add(v);
        }
    }

    

    
}
