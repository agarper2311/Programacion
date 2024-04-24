package com.es.programacion.tema8.proyectoLoginUI.ui;

import javax.swing.*;

public class FrameLogin extends JFrame {
    public FrameLogin() {
        this.setSize(600, 600);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("Proyecto UI");
        ImageIcon image = new ImageIcon("src/main/resources/pokemonMedia/images/caterpie.png");
        this.setIconImage(image.getImage());
        this.setResizable(false);

        PanelLogin p = new PanelLogin();
        this.add(p);

        this.setVisible(true);
    }
}
