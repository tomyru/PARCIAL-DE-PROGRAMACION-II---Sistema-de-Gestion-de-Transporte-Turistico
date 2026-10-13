
package sistema.de.gestión.de.transporte.turístico;

import java.time.Year;

public abstract class Vehiculo {
    private String patente;
    private String  marca;
    private int capacidadPasajeros;
    private int anioFabricacion;

    public Vehiculo(String patente, String marca, int capacidadPasajeros, int anioFabricacion) {
        setPatente(patente);
        setMarca(marca);
        setCapacidadPasajeros(capacidadPasajeros);
        setAnioFabricacion(anioFabricacion);
    }

    public String getPatente() {
        return patente;
    }
    
    public void setPatente(String patente) {
        if (patente == null || patente.trim().isEmpty()) {
            throw new IllegalArgumentException("ERROR; La patente no puede estar vacia.");
        }
        this.patente = patente.trim().toUpperCase();
    }
    
    
    
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        if(marca == null || marca.trim().isEmpty()) {
            throw new IllegalArgumentException("ERROR; La marca no puede estar vacia");
        }
        this.marca = marca.trim();
    }

    
    
    public void setCapacidadPasajeros(int capacidadPasajeros) {
        if (capacidadPasajeros <= 0) {
            throw new IllegalArgumentException("ERROR; La capacidad de pasajeros no puede ser 0 o menos.");
        }
        this.capacidadPasajeros = capacidadPasajeros;
    }
    
    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }
    
    
    
    public void setAnioFabricacion(int anioFabricacion) {
        if (anioFabricacion < 1990) {
            throw new IllegalArgumentException("ERROR; El Vehiculo no puede tener una fecha de fabricacion antes de 1990.");
        }
        if (anioFabricacion > Year.now().getValue()) {
            throw new IllegalArgumentException("ERROR; El Vehiculo no puede tener una fecha de fabricacion inexistente.");
        }
        this.anioFabricacion = anioFabricacion;
    }
    
    public int getAnioFabricacion() {
        return anioFabricacion;
    }
    

    

    public abstract void realizarServiciosTuristicos();
    
    @Override
    public String toString() {
        return "Patente: " + patente +"\nMarca: " + marca + "\nCapacidad de pasajeros: " + capacidadPasajeros + "\nAnio de fabricacion: " + anioFabricacion;
    }
    
}
