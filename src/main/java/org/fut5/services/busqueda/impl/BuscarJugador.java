package org.fut5.services.busqueda.impl;

import org.fut5.domain.Equipo;
import org.fut5.domain.Jugador;
import org.fut5.services.CrearEquipo;
import org.fut5.services.busqueda.IBuscar;


import java.util.ArrayList;
import java.util.Scanner;

public class BuscarJugador implements IBuscar {
    static Scanner input = new Scanner(System.in);

    @Override
    public void buscar(){
        System.out.println("Ingrese el nombre del jugador que quiere buscar:");
        String nombre = input.nextLine();
        ArrayList<Jugador> resultado = new ArrayList<>();
        for (Equipo equipo: CrearEquipo.equipos) {
            for (Jugador jugador: equipo.getJugadores()) {
                if (jugador.getNombre().equalsIgnoreCase(nombre)){
                    resultado.add(jugador);
                }
            }
        }
        if (resultado.isEmpty()){
            System.out.println("No se encontraron jugadores con ese nombre");
        } else {
            for (Jugador jugador: resultado) {
                System.out.println("Nombre: " + jugador.getNombre() +
                        "\nApellido: " + jugador.getApellido() +
                        "\nPosicion: " + jugador.getPosicion() +
                        "\nEs capitan: " + jugador.isCapitan() +
                        "\nNombre de su equipo: " + jugador.getEquipo());
                System.out.println("------------------------------------");
            }
        }
    }
}
