package org.fut5.domain;

public enum Posicion {
    DELANTERO ("Delantero"),
    MEDIOCAMPISTA ("Mediocampista"),
    DEFENSOR ("Defensor"),
    PORTERO ("Portero");

    private final String posicion;

    Posicion(String posicion){ this.posicion = posicion;}

    public String getPosicion() {
        return posicion;
    }
}
