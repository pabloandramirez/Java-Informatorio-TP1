package org.fut5.domain;

public class Entrenador extends Persona{
    private int edad;

    public Entrenador(String nombre, String apellido, int edad) {
        super(nombre, apellido);
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Entrenador{" +
                super.toString() +
                "edad=" + edad +
                '}';
    }
}
