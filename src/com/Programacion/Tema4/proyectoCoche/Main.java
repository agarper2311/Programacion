package com.Programacion.Tema4.proyectoCoche;

import com.Programacion.Tema4.proyectoCoche.clases.Coche;

public class Main {

    public static void main(String[] args) {

        // Encendemos la aplicación

        // Creación de objeto suvAlvaro
        Coche suvAlvaro = new Coche();
        // Le damos valores a los atributos de suvAlvaro
        suvAlvaro.nRuedas = 4;
        suvAlvaro.nPuertas = 5;
        suvAlvaro.motor = "diesel";
        suvAlvaro.nBastidor = "AV1234UW";
        suvAlvaro.propietario = "Alvaro";

        // Creación del objeto mercedesÁngel
        Coche mercedesAngel = new Coche();
        // Le damos los valores a los atributos de mercedesAngel
        mercedesAngel.nRuedas = 6;
        mercedesAngel.nPuertas = 5;
        mercedesAngel.motor = "gasolina";
        mercedesAngel.nBastidor = "BV1456HZ";
        mercedesAngel.propietario = "Angel";

        // Llamamos al método imprimirDatosVehiculo() de suvAlvaro
        suvAlvaro.imprimirDatosVehiculo();
        // Llamamos al método imprimirDatosVehiculo() de mercedesAngel
        mercedesAngel.imprimirDatosVehiculo();

    }
}
