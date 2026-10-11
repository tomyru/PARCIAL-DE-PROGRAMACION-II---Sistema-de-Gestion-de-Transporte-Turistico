package sistema.de.gestión.de.transporte.turístico;

public class SistemaDeGestiónDeTransporteTurístico {

    public static void main(String[] args) {
        
        
        
        Vehiculo colectivo = new ColectivoTuristico
        ("F232", "Mercedes Benz", 20, 2020, 2);
        System.out.println(colectivo);
        colectivo.realizarServiciosTuristicos();
        
        
        Vehiculo van_uno = new VanEjecutiva
        ("F552", "Toyota", 20, 2020, true);
        System.out.println(van_uno);
        van_uno.realizarServiciosTuristicos();
        
        
        Vehiculo lancha = new LanchaTuristica
        ("G343", "Yamaha", 6, 2022, "Nafta");
        System.out.println(lancha);
        lancha.realizarServiciosTuristicos();
        
        
        
    }
}
