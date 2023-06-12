package org.fut5;


import org.fut5.services.busqueda.impl.BuscarEquipoDetallado;
import org.fut5.services.busqueda.impl.BuscarEquipoNombre;
import org.fut5.services.busqueda.impl.BuscarJugador;
import org.fut5.services.busqueda.impl.EliminarEquipo;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

import static org.fut5.services.CrearEquipo.crearEquipo;

public class App {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws ParseException {
        menu();
        System.out.println("Favor de ingresar la opcion del menú: ");
        int opcion = input.nextInt();
        switch (opcion){
            case 1:
                crearEquipo();
                break;
            case 2:
                BuscarJugador buscadorJugador = new BuscarJugador();
                buscadorJugador.buscar();
                break;
            case 3:
                BuscarEquipoDetallado buscarEquipoDetallado = new BuscarEquipoDetallado();
                buscarEquipoDetallado.buscar();
                break;
            case 4:
                BuscarEquipoNombre buscarEquipoNombre = new BuscarEquipoNombre();
                buscarEquipoNombre.buscar();
                break;
            case 5:
                EliminarEquipo eliminarEquipo = new EliminarEquipo();
                eliminarEquipo.buscar();
                break;
            case 6: break;
            case 7: break;
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
}
