package org.fut5.services;

import org.fut5.domain.Jugador;
import org.fut5.domain.Posicion;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class CrearJugador {
    static Scanner input = new Scanner(System.in);
    public static Jugador crearJugador(String nombreEquipo, boolean yaHayCapitan){
        Jugador jugador = null;
        try{
            System.out.println("Ingresar el nombre del jugador:");
            String nombre = input.next();
            System.out.println("Ingresar el apellido:");
            String apellido = input.next();
            System.out.println("Ingresar la altura del jugador:");
            float altura = input.nextFloat();
            System.out.println("Eliga la posicion del jugador:" + Arrays.toString(Posicion.values()));
            Posicion posicion = Posicion.valueOf(input.next().toUpperCase());
            System.out.println("Ingresar la cantidad de goles:");
            int cantidadGoles = input.nextInt();
            System.out.println("Ingrese la cantidad de partidos:");
            int cantidadPartidos = input.nextInt();
            boolean capitan;
            if (!yaHayCapitan){
                System.out.println("El jugador es capitan? SI/NO");
                String esCapitan = input.next();
                capitan = esCapitan(esCapitan);
            } else {
                capitan = false;
            }
            System.out.println("Cual es el numero del dorsal del jugador?");
            int numeroDorsal = input.nextInt();
            jugador = new Jugador(nombre, apellido, altura, posicion,
                    cantidadGoles, cantidadPartidos, capitan, numeroDorsal,
                    nombreEquipo);
        } catch (IllegalArgumentException e) {
            System.out.println("Mal ingresada la posicion (" + e.getMessage() + ")");
        }
        return jugador;
    }

    public static boolean esCapitan(String opcion){
        return Objects.equals(opcion.toLowerCase(), "si");
    }
}
