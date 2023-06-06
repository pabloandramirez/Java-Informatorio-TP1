package org.fut5.services.busqueda.impl;

import org.fut5.domain.Equipo;
import org.fut5.domain.Jugador;
import org.fut5.services.CrearEquipo;
import org.fut5.services.busqueda.IBuscar;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class BuscarEquipo implements IBuscar {
    static Scanner input = new Scanner(System.in);
    @Override
    public void buscar() {
        System.out.println("Ingrese el nombre del equipo:");
        String nombreEquipo = input.nextLine();
        System.out.println("Ingrese el nombre del entrenador:");
        String nombreEntrenador = input.nextLine();
        System.out.println("Ingrese el nombre del capitan del equipo:");
        String nombreCapitan = input.nextLine();
        for (Equipo equipo: CrearEquipo.equipos) {
            ArrayList<Equipo> equipos = new ArrayList<>();
            if (Objects.equals(equipo.getNombre(), nombreEquipo)){
                if (Objects.equals(equipo.getEntrenador().getNombre(),
                        nombreEntrenador)){
                    ArrayList<Jugador> capitanes = new ArrayList<>();
                    for (Jugador jugador: equipo.getJugadores()){
                        if (jugador.isCapitan()){
                            capitanes.add(jugador);
                        }
                    }
                }
            }
        }
    }
}
