
package sistema.de.gestión.de.transporte.turístico;

public abstract class Vehiculo {
    private String patente;
    private String  marca;
    private int capacidadPasajeros;
    private int anioFabricacion;

    public Vehiculo(String patente, String marca, int capacidadPasajeros, int anioFabricacion) {
        this.patente = patente;
        this.marca = marca;
        this.capacidadPasajeros = capacidadPasajeros;
        this.anioFabricacion = anioFabricacion;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }
    
    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }
    
    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }
    

    public abstract void realizarServiciosTuristicos();
    
    @Override
    public String toString() {
        return ("Patente: " + patente +"\nMarca: " + marca + "\nCapacidad de pasajeros: " + capacidadPasajeros);
    }
    
}
