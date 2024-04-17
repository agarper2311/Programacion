package com.es.programacion.tema8.Teoria1;

import javax.swing.*;

public class PrimeraVentana {
    public static void main(String[] args) {
        JFrame primeraVentana = new JFrame();
        primeraVentana.setVisible(true);
        primeraVentana.setSize(800, 600);
        primeraVentana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        primeraVentana.setTitle("Primera Ventana");

        ImageIcon image = new ImageIcon("src/main/resources/tema8/dratini.png");
        primeraVentana.setIconImage(image.getImage());
    }
}
