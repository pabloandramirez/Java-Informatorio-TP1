package org.fut5.bootstrap;

import org.fut5.bootstrap.constantes.Posicion;
import org.fut5.domain.Entrenador;
import org.fut5.domain.Equipo;
import org.fut5.domain.Jugador;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;



public class BootstrapData {

    public static List<Equipo> equipos = new ArrayList<>();

    public static List<Jugador> crearJugadoresManchesterUnited(){

        List<Jugador> jugadores;
        jugadores = List.of(
                new Jugador("David","De Gea",1.92,Posicion.PORTERO,2000, 300, false, 1, "Manchester United"),
                new Jugador("Victor","Lindelöf",1.87,Posicion.DEFENSOR,4, 150, false, 2, "Manchester United"),
                new Jugador("Harry","Maguire",1.94,Posicion.DEFENSOR,8, 110, true, 5, "Manchester United"),
                new Jugador("Paul", "Pogba", 1.91, Posicion.MEDIOCAMPISTA , 36, 200, false, 6, "Manchester United"),
                new Jugador("Marcus","Rashford", 1.80, Posicion.DELANTERO,70,200, false, 10, "Manchester United")
                );
        return jugadores;
    }

    public static Entrenador crearEntrenadorManchesterUnited(){
        return new Entrenador("Erik", "Ten Hag", 53);
    }

    public static void crearEquipoManUtd() throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String fechaSinFormatear = "24/04/1902";
        Equipo equipo = new Equipo("Manchester United", dateFormat.parse(fechaSinFormatear), crearJugadoresManchesterUnited(), crearEntrenadorManchesterUnited());
        equipos.add(equipo);
    }

    public static void crearEquipoManCity() throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String fechaSinFormatear = "23/11/1880";
        Equipo equipo = new Equipo("Manchester City", dateFormat.parse(fechaSinFormatear), crearJugadoresManchesterCity(), crearEntrenadorManchesterCity());
        equipos.add(equipo);
    }

    private static Entrenador crearEntrenadorManchesterCity() {
        return new Entrenador("Pep", "Guardiola", 52);
    }

    private static List<Jugador> crearJugadoresManchesterCity() {
        List<Jugador> jugadores;
        jugadores = List.of(
                new Jugador("Ederson","Moraes",1.88,Posicion.PORTERO,0, 300, false, 31, "Manchester City"),
                new Jugador("Kyle","Walker",1.83,Posicion.DEFENSOR,4, 50, false, 2, "Manchester City"),
                new Jugador("John","Stones",1.88,Posicion.DEFENSOR,5, 50, false, 5, "Manchester City"),
                new Jugador("Ilkay", "Gundogan", 1.91, Posicion.MEDIOCAMPISTA , 23, 55, true, 8, "Manchester City"),
                new Jugador("Phil","Foden", 1.71, Posicion.DELANTERO,21,56, false, 47, "Manchester City")
        );
        return jugadores;
    }
}
