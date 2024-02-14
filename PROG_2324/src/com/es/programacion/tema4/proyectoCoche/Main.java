package com.es.programacion.tema4.proyectoCoche;

import com.es.programacion.tema4.proyectoCoche.clases.Coche;

public class Main {

    public static void main(String[] args) {

        // ENCENDEMOS LA APLICACION

        // Creacion de objeto suvAlvaro
        Coche suvAlvaro = new Coche();
        // Le damos valores a los atributos de suvAlvaro
        suvAlvaro.nRuedas = 4;
        suvAlvaro.nPuertas = 5;
        suvAlvaro.motor = "diesel";
        suvAlvaro.nBastidor = "AV1234UW";
        suvAlvaro.propietario = "Alvaro";

        // Creacion de objeto mercedesAngel
        Coche mercedesAngel = new Coche();
        // Le damos valores a los atributos de mercedesAngel
        mercedesAngel.nRuedas = 6;
        mercedesAngel.nPuertas = 5;
        mercedesAngel.motor = "gasolina";
        mercedesAngel.nBastidor = "ZV8485474UX";
        mercedesAngel.propietario = "Angel";

        // Llamamos al método imprimirDatosVehiculo() DE SUVALVARO
        suvAlvaro.imprimirDatosVehiculo();
        // Llamamos al método imprimirDatosVehiculo() DE MERCEDESANGEL
        mercedesAngel.imprimirDatosVehiculo();

    }
}
