package com.es.programacion.tema5.proyectoAgenda;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();

        now = now.plusMinutes(3);

        LocalDateTime now2 = LocalDateTime.now();

        System.out.println(now);
        System.out.println(now2);

        System.out.println(now.compareTo(now2));


    }
}
