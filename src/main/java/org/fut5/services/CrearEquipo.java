package org.fut5.services;

import org.fut5.App;
import org.fut5.domain.Entrenador;
import org.fut5.domain.Equipo;
import org.fut5.domain.Jugador;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import static org.fut5.services.CrearEntrenador.crearEntrenador;
import static org.fut5.services.CrearJugador.crearJugador;

public class CrearEquipo {
    static Scanner input = new Scanner(System.in);
    static SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    static public ArrayList<Equipo> equipos = new ArrayList<>();

    public static void crearEquipo() throws ParseException {
        System.out.println("Favor de ingresar el nombre del equipo:");
        String nombreEquipo = input.nextLine();
        System.out.println("Favor de ingresar la fecha de creacion del club (dd/mm/yyyy):");
        String fechaSinFormatear = input.next();
        Date fechaCreacion = dateFormat.parse(fechaSinFormatear);
        System.out.println("Favor de ingresar los datos de los 11 jugadores:");
        List<Jugador> jugadores = onceJugadores(nombreEquipo);
        System.out.println("Ingrese los datos del entrenador:");
        Entrenador entrenador = crearEntrenador();
        Equipo equipo = new Equipo(nombreEquipo, fechaCreacion, jugadores, entrenador);
        equipo.asignarCapitan();
        equipos.add(equipo);
    }

    public static ArrayList<Jugador> onceJugadores(String nombreEquipo){
        ArrayList<Jugador> jugadores = new ArrayList<>();
        boolean hayCapitan = false;
        for (int i = 0; i < 5; i++) {
            jugadores.add(crearJugador(nombreEquipo, hayCapitan));
            if (jugadores.get(i).isCapitan()){
                hayCapitan = true;
            }
        }
        return jugadores;
    }

}
