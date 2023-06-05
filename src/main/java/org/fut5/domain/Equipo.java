package org.fut5.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Equipo {
    private String nombre;
    private Date fechaCreacion;
    private ArrayList<Jugador> jugadores;
    private Entrenador entrenador;

    public Equipo(String nombre, Date fechaCreacion,
                  ArrayList<Jugador> jugadores,
                  Entrenador entrenador) {
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.jugadores = jugadores;
        this.entrenador = entrenador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Equipo equipo = (Equipo) o;
        return Objects.equals(nombre, equipo.nombre) && Objects.equals(fechaCreacion, equipo.fechaCreacion) && Objects.equals(jugadores, equipo.jugadores) && Objects.equals(entrenador, equipo.entrenador);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, fechaCreacion, jugadores, entrenador);
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "nombre='" + nombre + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                ", jugadores=" + jugadores +
                ", entrenador=" + entrenador +
                '}';
    }
}
