package org.fut5.domain;

public class Jugador extends Persona{
    private int id;
    private float altura;
    private Posicion posicion;
    private int cantidadGoles;
    private int cantidadPartidos;
    private boolean capitan;
    private int numeroCamiseta;
    private String equipo;
    private static int idAutoincrement;

    public Jugador(String nombre, String apellido,
                   float altura, Posicion posicion, int cantidadGoles,
                   int cantidadPartidos, boolean capitan,
                   int numeroCamiseta, String equipo) {
        super(nombre, apellido);
        this.id = ++Jugador.idAutoincrement;
        this.altura = altura;
        this.posicion = posicion;
        this.cantidadGoles = cantidadGoles;
        this.cantidadPartidos = cantidadPartidos;
        this.capitan = capitan;
        this.numeroCamiseta = numeroCamiseta;
        this.equipo = equipo;
    }

    public int getId() {
        return id;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public int getCantidadGoles() {
        return cantidadGoles;
    }

    public void setCantidadGoles(int cantidadGoles) {
        this.cantidadGoles = cantidadGoles;
    }

    public int getCantidadPartidos() {
        return cantidadPartidos;
    }

    public void setCantidadPartidos(int cantidadPartidos) {
        this.cantidadPartidos = cantidadPartidos;
    }

    public boolean isCapitan() {
        return capitan;
    }

    public void setCapitan(boolean capitan) {
        this.capitan = capitan;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(int numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "id=" + id +
                super.toString() +
                ", altura=" + altura +
                ", posicion=" + posicion +
                ", cantidadGoles=" + cantidadGoles +
                ", cantidadPartidos=" + cantidadPartidos +
                ", capitan=" + capitan +
                ", numeroCamiseta=" + numeroCamiseta +
                ", equipo=" + equipo +
                '}';
    }
}
