package com.es.programacion.pruebas.pokemon;

import com.es.programacion.pruebas.pokemon.frame.FramePrincipal;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
               FramePrincipal p = new FramePrincipal();
            }
        });


    }
}
