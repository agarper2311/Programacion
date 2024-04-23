package com.es.programacion.tema8.proyectoMiniCalculadora.ui;

import javax.swing.*;

public class FrameCalculadora1 extends JFrame {
    private static int height= 600;
    private static int width = 600;
    private PanelCalculadora1 panelCalculadora1;
    public FrameCalculadora1(){
        this.setSize(width, height);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("Mini Calculadora Mierder 1");
        ImageIcon image = new ImageIcon("src/main/resources/tema8/images/Calculadora.jpg");
        this.setIconImage(image.getImage());

        // Aquí añadimos el panel
        panelCalculadora1 = new PanelCalculadora1();
        this.add(panelCalculadora1);


        this.setVisible(true);
    }
}
