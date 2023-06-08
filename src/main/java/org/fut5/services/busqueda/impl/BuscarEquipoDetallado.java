package org.fut5.services.busqueda.impl;

import org.fut5.domain.Equipo;
import org.fut5.services.CrearEquipo;
import org.fut5.services.busqueda.IBuscar;

import java.util.ArrayList;
import java.util.Scanner;

public class BuscarEquipoDetallado implements IBuscar {
    static Scanner input = new Scanner(System.in);
    @Override
    public void buscar() {
        System.out.println("Ingrese el nombre del equipo:");
        String nombreEquipo = input.nextLine();
        System.out.println("Ingrese el nombre del entrenador:");
        String nombreEntrenador = input.nextLine();
        System.out.println("Ingrese el nombre del capitan del equipo:");
        String nombreCapitan = input.nextLine();
        ArrayList<Equipo> equipos = new ArrayList<>();
        for (Equipo equipo: CrearEquipo.equipos) {
            if (equipo.getNombre().equalsIgnoreCase(nombreEquipo)){
                if (equipo.getEntrenador().getNombre().equalsIgnoreCase(nombreEntrenador)){
                    if (equipo.getCapitan().getNombre().equalsIgnoreCase(nombreCapitan)){
                        equipos.add(equipo);
                    }
                }
            }
        }
        if (equipos.isEmpty()){
            System.out.println("No se encontro ningun equipo con esos datos");
        } else {
            for (Equipo equipo: equipos) {
                System.out.println(equipo.getNombre());
            }
        }
    }
}
