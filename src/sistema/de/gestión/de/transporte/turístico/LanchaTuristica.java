package sistema.de.gestión.de.transporte.turístico;

public class LanchaTuristica extends Vehiculo {
    private String tipoMotor;

    public LanchaTuristica(String patente, String marca, int capacidadPasajeros, int anioFabricacion, String tipoMotor) {
        super(patente, marca, capacidadPasajeros, anioFabricacion);
        setTipoMotor(tipoMotor);
    }

    public String getTipoMotor() {
        return tipoMotor;
    }
    public void setTipoMotor(String tipoMotor) {
        if (
                tipoMotor == null || !(
                tipoMotor.trim().equalsIgnoreCase("NAFTA") || 
                tipoMotor.trim().equalsIgnoreCase("DIESEL") || 
                tipoMotor.trim().equalsIgnoreCase("ELECTRICO")))
        {
             throw new IllegalArgumentException("ERROR; Solo se permite motor de Nafta, Diesel o Electrico");
        }
        
        this.tipoMotor = tipoMotor.trim().toUpperCase();
    }

    @Override
    public void realizarServiciosTuristicos() {
        System.out.println("Se realizo el servicio turistico en la Lancha con el motor de " + tipoMotor.toLowerCase());
    }
    
    @Override
    public String toString() {
        
        return "Vehiculo: Lancha Turistica\n" + super.toString() + "\nTipo de motor: " + tipoMotor;
    }
    
}
