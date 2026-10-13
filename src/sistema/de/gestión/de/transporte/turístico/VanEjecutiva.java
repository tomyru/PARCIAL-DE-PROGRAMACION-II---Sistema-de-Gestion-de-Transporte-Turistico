package sistema.de.gestión.de.transporte.turístico;

public class VanEjecutiva extends Vehiculo {

    private boolean aireAcondicionado;

    public VanEjecutiva(String patente, String marca, int capacidadPasajeros, int anioFabricacion, boolean aireAcondicionado) {
        super(patente, marca, capacidadPasajeros, anioFabricacion);
        this.aireAcondicionado = aireAcondicionado;
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    @Override
    public void realizarServiciosTuristicos() {
        String conOsin = (aireAcondicionado) ? "con" : "sin";
        System.out.println("Se realizo el servicio turistico en la Van ejecutiva " + conOsin + " aire acondicionado");
    }

    @Override
    public String toString() {
        String siOno = (aireAcondicionado) ? "Si" : "No";
        return "Vehiculo: Van Ejecutiva\n" + super.toString() + "\nAire acondicionado: " + siOno;
    }

}
