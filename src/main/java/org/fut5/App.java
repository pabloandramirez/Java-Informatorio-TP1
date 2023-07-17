package org.fut5;


import org.fut5.services.busqueda.IBuscar;
import org.fut5.services.busqueda.impl.BuscarEquipoDetallado;
import org.fut5.services.busqueda.impl.BuscarEquipoNombre;
import org.fut5.services.busqueda.impl.BuscarJugador;
import org.fut5.services.busqueda.impl.EliminarEquipo;

import java.text.ParseException;
import java.util.*;

import static org.fut5.bootstrap.BootstrapData.crearEquipoManCity;
import static org.fut5.bootstrap.BootstrapData.crearEquipoManUtd;

public class App {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws ParseException {
        while(true){
            menu();
            System.out.println("Favor de ingresar la opcion del menú o ingrese 'exit' para salir: ");
            String opcion = input.nextLine();
            if(Objects.equals(opcion, "1") || Objects.equals(opcion, "2") || Objects.equals(opcion, "3") ||
                    Objects.equals(opcion, "4") || Objects.equals(opcion, "5") || Objects.equals(opcion, "6") ||
                    Objects.equals(opcion, "7")){
                switch (opcion){
                    case "1":
                        boolean continuar = true;
                        while (continuar){
                            crearEquipoManUtd();
                            System.out.println("Quiere cargar un nuevo equipo? SI/NO");
                            String entrada = input.next();
                            if (entrada.equalsIgnoreCase("SI")){
                                crearEquipoManCity();
                            }
                            else {
                                continuar=false;
                            }
                        }
                        break;
                    case "2":
                        IBuscar buscadorJugador = new BuscarJugador();
                        buscadorJugador.buscar();
                        break;
                    case "3":
                        IBuscar buscarEquipoDetallado = new BuscarEquipoDetallado();
                        buscarEquipoDetallado.buscar();
                        break;
                    case "4":
                        IBuscar buscarEquipoNombre = new BuscarEquipoNombre();
                        buscarEquipoNombre.buscar();
                        break;
                    case "5":
                        IBuscar eliminarEquipo = new EliminarEquipo();
                        eliminarEquipo.buscar();
                        break;
                    case "6": break;
                    case "7": break;
                }
            } else if (opcion.equalsIgnoreCase("exit")) {
                System.out.println("Saliendo de la aplicacion, buenas tardes");
                break;
            } else {
                System.out.println("Opcion incorrecto, ingrese nuevamente");
            }
        }
    }

    public static void menu(){
        ArrayList<String> menu = new ArrayList<>();
        menu.add("1-Crear equipo");
        menu.add("2-Buscar jugador por nombre");
        menu.add("3-Buscar equipo por su nombre, el de su entrenador y el de su capitan");
        menu.add("4-Buscar equipo por nombre");
        menu.add("5-Eliminar equipo por nombre");
        menu.add("6-Importar lista de jugadores de un equipo desde un archivo csv o txt");
        menu.add("7-Exportar lista de jugadores de un equipo hacia un archivo csv o txt");
        for (String opcion: menu) {
            System.out.println(opcion);
        }
    }

    public static void continuar() throws ParseException {

    }
}
