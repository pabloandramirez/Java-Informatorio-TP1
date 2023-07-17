package org.fut5.services.busqueda.impl;

import org.fut5.bootstrap.BootstrapData;
import org.fut5.domain.Equipo;
import org.fut5.domain.Jugador;
import org.fut5.services.busqueda.IBuscar;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class BuscarEquipoNombre implements IBuscar {
    static Scanner input = new Scanner(System.in);
    @Override
    public void buscar() {
        System.out.println("Ingrese el nombre del equipo a buscar:");
        String nombreEquipo = input.nextLine();
        ArrayList<Equipo> equiposEncontrados = new ArrayList<>();
        for (Equipo equipo: BootstrapData.equipos) {
            if (equipo.getNombre().equalsIgnoreCase(nombreEquipo)){
                equiposEncontrados.add(equipo);
            }
        }
        if (equiposEncontrados.isEmpty()){
            System.out.println("No fue encontrado ningun equipo con ese nombre");
        } else {
            for (Equipo equipo: equiposEncontrados) {
                System.out.println(equipo.getNombre() + "; " +
                        equipo.getEntrenador().getNombre() + "; " +
                        equipo.getJugadores()
                                .stream()
                                .sorted(Comparator.comparing(Jugador::getNombre)));
            }
        }
    }
}
