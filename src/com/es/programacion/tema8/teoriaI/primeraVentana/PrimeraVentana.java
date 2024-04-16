package com.es.programacion.tema8.teoriaI.primeraVentana;

import javax.swing.*;

public class PrimeraVentana {

    public static void main(String[] args) {

        JFrame prim = new JFrame();
        prim.setVisible(true);
        prim.setSize(800, 600);
        prim.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        prim.setTitle("Primera Ventana");

        ImageIcon image = new ImageIcon("src/main/resources/pokemonMedia/images/dratini.png");
        prim.setIconImage(image.getImage());


    }
}
