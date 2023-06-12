package org.fut5.bootstrap.constantes;

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
