package sistema.de.gestión.de.transporte.turístico;

public class ColectivoTuristico extends Vehiculo {
    private int cantidadPisos;

    public ColectivoTuristico(String patente, String marca, int capacidadPasajeros, int anioFabricacion, int cantidadPisos) {
        super(patente, marca, capacidadPasajeros, anioFabricacion);
        setCantidadPisos(cantidadPisos);
    }

    public int getCantidadPisos() {
        return cantidadPisos;
    }

    public void setCantidadPisos(int cantidadPisos) {
        if (cantidadPisos < 1 || cantidadPisos > 2) {
            throw new IllegalArgumentException("Solo puede tener 1 o 2 pisos.");
        }
        this.cantidadPisos = cantidadPisos;
    }

    @Override
    public void realizarServiciosTuristicos() {
        System.out.println("Se realizo el servicio turistico en el Colectivo de " + cantidadPisos + " pisos");
    }
    
    @Override
    public String toString() {
       return super.toString() +  "\nCantidad de pisos: " + cantidadPisos;
    }
    
}
