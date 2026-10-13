package sistema.de.gestión.de.transporte.turístico;

import java.util.Scanner;

public class SistemaDeGestiónDeTransporteTurístico {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcion = 0;
        
        FlotaVehiculos flota = new FlotaVehiculos();


        do {
            separador();
            System.out.println("1.  Agregar vehiculo");
            System.out.println("2.  Mostrar todos los vehiculos");
            System.out.println("3.  Realizar servicios turisticos");
            System.out.println("4.  Buscar vehiculo por patente");
            System.out.println("5.  Mostrar vehiculos con capacidad mayor a un valor");
            System.out.println("6.  Mostrar vehiculos ordenados por anio descendente");
            System.out.println("7.  Mostrar vehiculos ordenados por capacidad descendente");
            System.out.println("8.  Salir");
            separador();
            
            try {
                System.out.print("Ingrese una opcion :  ");
                opcion = Integer.parseInt(input.nextLine());
                separador();
                switch (opcion) {
                    case 1:
                        System.out.println("    -Agregar vehiculo-");
                        agregarVehiculo(input, flota);
                        break;
                        
                    case 2:    
                        System.out.println("    -Mostrar todos los vehiculos-");
                        separador();
                        flota.mostrarLista(flota.getVehiculos());
                        break;

                    case 3:    
                        System.out.println("    -Realizar servicios turisticos-");
                        separador();
                        flota.realizarServiciosTuristicosTodos();
                        break;
                        
                    case 4: {
                        System.out.println("    -Buscar vehiculo por patente-");
                        separador();
                        System.out.print("Ingrese la patente: ");
                        String patente = input.nextLine();
                        separador();
                        Vehiculo encontrado = flota.buscarPorPatente(patente);
                        if (encontrado == null) {
                            System.out.println("No se encontro ningun vehiculo con esa patente.");
                        }
                        else {
                            System.out.println(encontrado);
                        }
                        break;
                    }
                        
                    case 5: {  
                        System.out.println("    -Mostrar vehiculos con capacidad mayor a un valor-");
                        separador();
                        System.out.print("Ingrese la capacidad minima:  ");
                        int minimo = Integer.parseInt(input.nextLine());
                        flota.mostrarLista(flota.filtrarPorCapacidad(minimo));
                        break;
                    }

                    case 6:    
                        System.out.println("    -Mostrar vehiculos ordenados por anio descendente-");
                        separador();
                        break;
                        
                    case 7:    
                        System.out.println("    -Mostrar vehiculos ordenados por capacidad descendente-");
                        separador();
                        break;
                        
                    case 8:
                          System.out.println("    -Salir-");
                          separador();
                          break;
                          
                    default:
                        System.out.println("    -Opcion incorrecta-");
                } 
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un numero valido");
                opcion = 0;
            } 
        } while (opcion != 8);
        

    }
    
    private static void agregarVehiculo(Scanner input, FlotaVehiculos flota) {
        boolean terminado = false;
        while (!terminado) {
            try {
                separador();
                System.out.println( " Vehiculos disponibles");
                System.out.println("1. Colectivo turistico\n2. Van ejecutiva\n3. Lancha turistica");
                separador();
                System.out.print("Ingrese una opcion :  ");
                int tipo = Integer.parseInt(input.nextLine());
                
                
                if (tipo < 1 || tipo > 3) {
                    throw new IllegalArgumentException("Tipo invalido. Elija 1, 2 o 3.");
                }
                System.out.print("Patente: ");
                String patente = input.nextLine();
                System.out.print("Marca : ");
                String marca = input.nextLine();
                System.out.print("Capacidad de pasajeros: ");
                int capacidad = Integer.parseInt(input.nextLine());
                System.out.print("Anio de fabricacion: ");
                int anioFabricacion = Integer.parseInt(input.nextLine());
                
                if (tipo == 1) {
                    System.out.print("Cantidad de pisos (1 o 2): ");
                    int pisos =  Integer.parseInt(input.nextLine());
                    flota.agregarVehiculo(new ColectivoTuristico(patente, marca, capacidad, anioFabricacion, pisos));
                }
                else if (tipo == 2) {
                     System.out.print("Aire acondicionado (S/N): ");
                     String respuesta = input.nextLine();
                     boolean aire =  respuesta.equalsIgnoreCase("s");
                      flota.agregarVehiculo(new VanEjecutiva(patente, marca, capacidad, anioFabricacion, aire));
                }
                else {
                    System.out.print("Tipo de motor (Nafta, Diesel, Electrico): ");
                    String motor = input.nextLine();
                    flota.agregarVehiculo(new LanchaTuristica(patente, marca, capacidad, anioFabricacion, motor));
                }

                System.out.println("Vehiculo agregado correctamente.");
                terminado = true;

            } catch (NumberFormatException e) {
                System.out.println("Ese dato debe ser un numero entero");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
        private static void separador() {
        System.out.println("--------------------------------------------------------------------------");
    }

}

