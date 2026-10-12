package sistema.de.gestión.de.transporte.turístico;

public class SistemaDeGestiónDeTransporteTurístico {

    public static void main(String[] args) {
        
        FlotaVehiculos flota = new FlotaVehiculos();
        
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
        
        flota.agregarVehiculo(new ColectivoTuristico("AA123BB", "Mercedes Benz", 45, 2020, 2));
        flota.agregarVehiculo(new VanEjecutiva("AC789EF", "Renault", 15, 2021, true));
//        flota.agregarVehiculo(new ColectivoTuristico("AA123BB", "Scania", 50, 2022, 1)); // duplicada
        
        
        
        
        
        
        
        
        
        
        
    }
}
