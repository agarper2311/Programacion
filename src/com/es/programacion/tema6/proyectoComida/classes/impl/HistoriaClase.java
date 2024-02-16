package com.es.programacion.tema6.proyectoComida.classes.impl;

import com.es.programacion.tema6.proyectoComida.classes.api.Historia;

import java.util.Random;

public class HistoriaClase implements Historia {


    @Override
    public void contarHistoria() {

        try {
            System.out.print("Despierta, ");
            Thread.sleep(2000);
            System.out.print(System.getProperty("user.name"));
            if(System.getProperty("user.name").equalsIgnoreCase("Rafael") || System.getProperty("user.name").equalsIgnoreCase("Roberto")) {
                System.out.print(", es una mañana fría en Prado del Rey");
                Thread.sleep(500);
                System.out.print(".");
                Thread.sleep(500);
                System.out.print(".");
                Thread.sleep(500);
                System.out.print(". ");
                Thread.sleep(1000);
                System.out.print(", el autobús sale en 30 minutos y aún no has desayunado");
            } else if (System.getProperty("user.name").equalsIgnoreCase("Angel")) {
                System.out.print(", el mercadona aún está cerrado ");
                Thread.sleep(500);
                System.out.print(".");
                Thread.sleep(500);
                System.out.print(".");
                Thread.sleep(500);
                System.out.print(". ");
                Thread.sleep(1000);
                System.out.print("pero debes ir a clase");

            } else if (System.getProperty("user.name").equalsIgnoreCase("Raquel") || System.getProperty("user.name").equalsIgnoreCase("rardati601")) {
                Thread.sleep(500);
                System.out.print(".");
                Thread.sleep(500);
                System.out.print(".");
                Thread.sleep(500);
                System.out.print(". ");
                Thread.sleep(1000);
                System.out.print(" Has soñado que ya no tenías que ir a Bases de Datos ni a Programación.");
                Thread.sleep(500);
                System.out.print(".");
                Thread.sleep(500);
                System.out.print(".");
                Thread.sleep(500);
                System.out.print(". ");
                Thread.sleep(1000);
                System.out.print(" Ese sueño te hace feliz.");

            }else if (System.getProperty("user.name").equalsIgnoreCase("Ignacio")) {
                Thread.sleep(500);
                System.out.print(".");
                Thread.sleep(500);
                System.out.print(".");
                Thread.sleep(500);
                System.out.print(". ");
                Thread.sleep(1000);
                System.out.print(" tienes 20 mensajes de tu cliente indio.");
                Thread.sleep(500);
                System.out.print(".");
                Thread.sleep(500);
                System.out.print(".");
                Thread.sleep(500);
                System.out.print(". ");
                Thread.sleep(1000);
                System.out.print(" te quiere encargar 2000 bolsos más.");

            }else if (System.getProperty("user.name").equalsIgnoreCase("David")) {
                Thread.sleep(500);
                System.out.print(".");
                Thread.sleep(500);
                System.out.print(".");
                Thread.sleep(500);
                System.out.print(". ");
                Thread.sleep(1000);
                System.out.print("Hoy sabes que en programación vas a hacer un kahoot");

            }else if (System.getProperty("user.name").equalsIgnoreCase("Sebastian")) {
                Thread.sleep(500);
                System.out.print(".");
                Thread.sleep(500);
                System.out.print(".");
                Thread.sleep(500);
                System.out.print(". ");
                Thread.sleep(1000);
                System.out.print("La interfaz de Pokemon te persigue en sueños");
            }else if (System.getProperty("user.name").equalsIgnoreCase("Diego")) {
                Thread.sleep(500);
                System.out.print(".");
                Thread.sleep(500);
                System.out.print(".");
                Thread.sleep(500);
                System.out.print(". ");
                Thread.sleep(1000);
                System.out.print("No te has preparado la clase, pero por suerte eso nadie lo sabe");
            }else if (System.getProperty("user.name").equalsIgnoreCase("Pablo")) {
                Thread.sleep(500);
                System.out.print(".");
                Thread.sleep(500);
                System.out.print(".");
                Thread.sleep(500);
                System.out.print(". ");
                Thread.sleep(1000);
                System.out.print("Has soñado que aún no has aprobado el teórico del coche");
                Thread.sleep(500);
                System.out.print(".");
                Thread.sleep(500);
                System.out.print(".");
                Thread.sleep(500);
                System.out.print(". ");
                Thread.sleep(1000);
                System.out.print("Eso te atormenta pero debes ir a clase");
            }else if (System.getProperty("user.name").equalsIgnoreCase("Alvaro")) {
                Thread.sleep(500);
                System.out.print(".");
                Thread.sleep(500);
                System.out.print(".");
                Thread.sleep(500);
                System.out.print(". ");
                Thread.sleep(1000);
                System.out.print("Ayer Pablo te dijo que iría a la autoescuela pero en realidad no fue");
                Thread.sleep(500);
                System.out.print(".");
                Thread.sleep(500);
                System.out.print(".");
                Thread.sleep(500);
                System.out.print(". ");
                Thread.sleep(1000);
                System.out.print("Eso te atormenta pero debes ir a clase");
            }else if (System.getProperty("user.name").equalsIgnoreCase("Marcos")) {
                Thread.sleep(500);
                System.out.print(".");
                Thread.sleep(500);
                System.out.print(".");
                Thread.sleep(500);
                System.out.print(". ");
                Thread.sleep(1000);
                System.out.print("El juego de la vida que creaste en Java sigue sin funcionar");
                Thread.sleep(500);
                System.out.print(".");
                Thread.sleep(500);
                System.out.print(".");
                Thread.sleep(500);
                System.out.print(". ");
                Thread.sleep(1000);
                System.out.print("Eso te atormenta pero hoy debes enfrentarte a la cruda realidad de nuevo");
            }else if (System.getProperty("user.name").equalsIgnoreCase("Roberto")) {
                Thread.sleep(500);
                System.out.print(".");
                Thread.sleep(500);
                System.out.print(".");
                Thread.sleep(500);
                System.out.print(". ");
                Thread.sleep(1000);
                System.out.print("El profesor no te dejó ir al baño ayer");
                Thread.sleep(500);
                System.out.print(".");
                Thread.sleep(500);
                System.out.print(".");
                Thread.sleep(500);
                System.out.print(". ");
                Thread.sleep(1000);
                System.out.print("Eso te atormenta pero hoy debes enfrentarte a la cruda realidad de nuevo");
            } else {
                Thread.sleep(500);
                System.out.print(".");
                Thread.sleep(500);
                System.out.print(".");
                Thread.sleep(500);
                System.out.print(". ");
                Thread.sleep(1000);
                System.out.print("Hoy debes enfrentarte a la cruda realidad de nuevo");
            }

            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.println(".");
            Thread.sleep(2000);

            System.out.print("Llegas al instituto");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.print(". ");
            Thread.sleep(500);
            System.out.print("Tienes energía");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.print("por ahora");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.println(".");
            Thread.sleep(2000);


            System.out.print("Intenta sobrevivir al día en ");
            Thread.sleep(500);
            System.out.print("3.");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.print("2.");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.print("1.");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.println("¡Suerte!");





        } catch (Exception e) {

            System.out.println("Llegas a clase de forma inesperada...");

        }

    }

    public void queHoraEs(int hora) {
        try {
            System.out.println("---------------------------");
            Thread.sleep(2000);
            System.out.print("Ya es "+hora+"ª hora");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.println(". ");
            Thread.sleep(500);

        } catch (Exception e) {
            System.out.println("Estas confundid@");
        }
    }

    public void muertoCansancio(int hora, int energia) {
        try {
            Thread.sleep(1000);
            System.out.print("Has muerto de cansancio");
            Thread.sleep(1000);
            System.out.print(" a "+hora+"ª hora");
            Thread.sleep(1000);
            System.out.print(" con "+energia+" de energía");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.println(". ");
            Thread.sleep(500);

        } catch (Exception e) {
            System.out.println("Estas confundid@");
        }
    }

    public int oyente() {
        try {
            System.out.print("Te metes sin querer de oyente en una clase de AD ");

            Random r = new Random();
            if(r.nextInt(2) == 1) {
                Thread.sleep(1000);
                System.out.println("y te gusta (+20 energía)");
                Thread.sleep(1000);
                return 20;
            } else {
                System.out.println();
                Thread.sleep(1000);
                return -50;
            }

        } catch (Exception e) {
            System.out.println("Estas confundid@");
            return -20;
        }
    }
}
