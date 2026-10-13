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
            throw new IllegalArgumentException("ERROR; El colectivo turistico solo puede tener 1 o 2 pisos.");
        }
        this.cantidadPisos = cantidadPisos;
    }

    @Override
    public void realizarServiciosTuristicos() {
        String palabra = (cantidadPisos == 1) ? "piso" : "pisos";
        System.out.println("Se realizo el servicio turistico en el Colectivo de " + cantidadPisos + " " + palabra);
    }

    @Override
    public String toString() {
        return "Vehiculo: Colectivo Turistico\n" + super.toString() + "\nCantidad de pisos: " + cantidadPisos;
    }

}
