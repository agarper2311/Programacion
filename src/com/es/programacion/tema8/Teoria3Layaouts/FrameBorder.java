package com.es.programacion.tema8.Teoria3Layaouts;

import javax.swing.*;
import java.awt.*;

public class FrameBorder extends JFrame {
    // Los JFrame se inicializan por defecto con un BorderLayout

    public FrameBorder() {
        this.setSize(800, 600);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("Primera Ventana");
        ImageIcon image = new ImageIcon("src/main/resources/pokemonMedia/images/dratini.png");
        this.setIconImage(image.getImage());

        // VAMOS A CREAR 4 JPanel y a añadirlos en diferentes posiciones del BorderLayout
        JPanel panelCentro = new JPanel();
        panelCentro.setBackground(new Color(255, 100, 100));

        JPanel panelNorte = new JPanel();
        panelNorte.setBackground(new Color(100, 0, 255));
        panelNorte.setPreferredSize(new Dimension(100, 100));

        JPanel panelSur = new JPanel();
        panelSur.setBackground(new Color(255, 255, 0));
        panelSur.setPreferredSize(new Dimension(100, 100));

        JPanel panelOeste = new JPanel();
        panelOeste.setBackground(new Color(255, 0, 255));
        panelOeste.setPreferredSize(new Dimension(100, 100));

        JPanel panelEste = new JPanel();
        panelEste.setBackground(new Color(0, 200, 0));
        panelEste.setPreferredSize(new Dimension(100, 100));



        this.add(panelCentro, BorderLayout.CENTER);
        this.add(panelNorte, BorderLayout.NORTH);
        this.add(panelSur, BorderLayout.SOUTH);
        this.add(panelOeste, BorderLayout.WEST);
        this.add(panelEste, BorderLayout.EAST);
        this.setVisible(true);
    }

}
