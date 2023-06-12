package org.fut5.services.busqueda.impl;

import org.fut5.domain.Equipo;
import org.fut5.services.CrearEquipo;
import org.fut5.services.busqueda.IBuscar;

import java.util.ArrayList;
import java.util.Scanner;

public class EliminarEquipo implements IBuscar {
    static Scanner input = new Scanner(System.in);
    @Override
    public void buscar() {
        System.out.println("Ingrese el nombre del equipo a eliminar:");
        String nombreEquipo = input.nextLine();
        ArrayList<Equipo> equiposEncontrados = new ArrayList<>();
        for (Equipo equipo: CrearEquipo.equipos) {
            if (equipo.getNombre().equalsIgnoreCase(nombreEquipo)){
                equiposEncontrados.add(equipo);
            }
        }
        if (equiposEncontrados.isEmpty()){
            System.out.println("No fue encontrado ningun equipo con ese nombre");
        } else {
            for (Equipo equipo: equiposEncontrados) {
                CrearEquipo.equipos.remove(equipo);
                System.out.println("Fueron removidos " + equiposEncontrados.size() + " equipos con ese nombre");
            }
        }
    }
}
