package com.es.programacion.tema8.proyectoMiniCalculadora;

import com.es.programacion.tema8.proyectoMiniCalculadora.ui.FrameCalculadora1;

import javax.swing.*;

public class MiniCalculadora1 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                FrameCalculadora1 fc = new FrameCalculadora1();
            }
        });
    }
}
