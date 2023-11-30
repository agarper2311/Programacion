package com.Programacion.Tema4.proyectoPersona;

import com.Programacion.Tema4.proyectoPersona.clase.Persona;

public class Main {
    public static void main(String[] args) {
        // Encendemos la aplicación

        // Creación del objeto/persona Lee
        Persona Lee = new Persona("Lee", "12345678H", "Chaolan", 48);

        Lee.colorPiel = "Claro con un ligero bronceado.";
        Lee.colorPelo = "Plateado.";
        Lee.altura = 1.78;
        Lee.nacionalidad = "Japonesa";

        // Creación del objeto/persona Sergei Dragunov
        Persona Sergei = new Persona("Sergei", "34578528P", "Dragunov", 26);

        Sergei.colorPiel = "Muy blanca.";
        Sergei.colorPelo = "Negro.";
        Sergei.altura = 1.90;
        Sergei.nacionalidad = "Rusa.";

        // Mostrar presentación
        System.out.println(Lee.presentarse());
        Lee.cumplirAnios();
        Lee.cambiarColorPelo();
        System.out.println("¿Es mayor de edad? " + Lee.esMayorDeEdad());
        Lee.cambiarEstadoTrabajo();
        System.out.println("¿Lee está trabajando? " + Lee.estaTrabajando);

        System.out.println(Sergei.presentarse());
        Sergei.cumplirAnios();
        Sergei.cambiarColorPelo();
        System.out.println("¿Es mayor de edad? " + Sergei.esMayorDeEdad());
        Sergei.cambiarEstadoTrabajo();
        System.out.println("¿Sergei está trabajando? " + Sergei.estaTrabajando);

        // Comprobar si dos personas son iguales por su DNI
        System.out.println("¿Lee y Sergei tienen el mismo DNI? " + Lee.sonIguales(Sergei));
    }
}

