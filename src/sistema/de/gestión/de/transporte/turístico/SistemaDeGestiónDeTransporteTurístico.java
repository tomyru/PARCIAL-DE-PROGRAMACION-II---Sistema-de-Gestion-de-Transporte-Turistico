package sistema.de.gestión.de.transporte.turístico;

public class SistemaDeGestiónDeTransporteTurístico {

    public static void main(String[] args) {
        Vehiculo colectivo = new ColectivoTuristico
        ("F232", "Mercedes Benz", 20, 2020, 2);
        System.out.println(colectivo);
        colectivo.realizarServiciosTuristicos();
    }
    
}
