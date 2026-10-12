package sistema.de.gestión.de.transporte.turístico;

import java.util.Scanner;

public class SistemaDeGestiónDeTransporteTurístico {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcion = 0;
        
        FlotaVehiculos flota = new FlotaVehiculos();
        flota.agregarVehiculo(new ColectivoTuristico("AA123BB", "Mercedes Benz", 45, 2020, 2));
        flota.agregarVehiculo(new LanchaTuristica("Af1434B", "Toyota", 9, 2020, "NAFTA"));


        
        
        do {
            System.out.println("--------------------------------------------------------------------------");
            System.out.println("1.  Agregar vehiculo");
            System.out.println("2.  Mostrar todos los vehiculos");
            System.out.println("3.  Realizar servicios turisticos");
            System.out.println("4.  Buscar vehiculo por patente");
            System.out.println("5.  Mostrar vehiculos con capacidad mayor a un valor");
            System.out.println("6.  Mostrar vehiculos ordenados por anio descendente");
            System.out.println("7.  Mostrar vehiculos ordenados por capacidad descendente");
            System.out.println("8.  Salir");
            System.out.println("--------------------------------------------------------------------------");
            
            try {
                System.out.print("Ingrese una opcion :  ");
                opcion = Integer.parseInt(input.nextLine());
                switch (opcion) {
                    case 1:
                        System.out.println("1.  Agregar vehiculo");
                        System.out.println("--------------------------------------------------------------------------");
                        break;
                        
                    case 2:    
                        System.out.println("2.  Mostrar todos los vehiculos");
                        System.out.println("--------------------------------------------------------------------------");
                        flota.mostrarLista(flota.getVehiculos());
                        break;

                    case 3:    
                        System.out.println("3.  Realizar servicios turisticos");
                        System.out.println("--------------------------------------------------------------------------");
                        flota.realizarServiciosTuristicosTodos();
                        break;
                        
                    case 4:    
                        System.out.println("4.  Buscar vehiculo por patente");
                        System.out.println("--------------------------------------------------------------------------");
                        break;
                        
                    case 5:    
                        System.out.println("5.  Mostrar vehiculos con capacidad mayor a un valor");
                        System.out.println("--------------------------------------------------------------------------");
                        break;
                        
                    case 6:    
                        System.out.println("6.  Mostrar vehiculos ordenados por anio descendente");
                        System.out.println("--------------------------------------------------------------------------");
                        break;
                        
                    case 7:    
                        System.out.println("7.  Mostrar vehiculos ordenados por capacidad descendente");
                        System.out.println("--------------------------------------------------------------------------");
                        break;
                        
                    case 8:
                          System.out.println("8.  Salir");
                          System.out.println("--------------------------------------------------------------------------");
                          break;
                          
                    default:
                        System.out.println("Opcion incorrecta");
                        System.out.println("--------------------------------------------------------------------------");
                } 
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un numero valido");
                System.out.println("--------------------------------------------------------------------------");
                opcion = 0;
            } 
        } while (opcion != 8);
        
        
        
        



        
        
        
        
        
        
        
        
    }
}
