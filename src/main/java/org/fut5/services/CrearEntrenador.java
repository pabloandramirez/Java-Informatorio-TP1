package org.fut5.services;

import org.fut5.domain.Entrenador;

import java.util.Scanner;

public class CrearEntrenador {
    static Scanner input = new Scanner(System.in);
    public static Entrenador crearEntrenador(){
        System.out.println("Ingrese el nombre del entrenador:");
        String nombre = input.next();
        System.out.println("Ingrese el apellido del entrenador:");
        String apellido = input.next();
        System.out.println("Ingrese la edad:");
        int edad = input.nextInt();
        return new Entrenador(nombre, apellido, edad);
    }
}
