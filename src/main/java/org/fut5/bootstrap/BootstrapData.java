package org.fut5.bootstrap;

import org.fut5.bootstrap.constantes.Posicion;
import org.fut5.domain.Entrenador;
import org.fut5.domain.Equipo;
import org.fut5.domain.Jugador;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;



public class BootstrapData {

    public static List<Equipo> equipos;

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
}
