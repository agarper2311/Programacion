package com.es.programacion.pruebas.pokemon.frame;

import com.es.programacion.pruebas.pokemon.assets.Media;
import com.es.programacion.pruebas.pokemon.panel.PanelContenedor;
import com.es.programacion.pruebas.pokemon.utils.Utils;

import javax.swing.*;
import java.awt.*;

public class FramePrincipal extends JFrame {

    PanelContenedor p;

    public FramePrincipal(){

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(new Dimension(Utils.PREF_WIDTH,Utils.PREF_HEIGHT));
        setBackground(Color.BLACK);
        setResizable(false);


        iniciarPanelPrincipal();
        p = new PanelContenedor();

        add(p);


        setVisible(true);


    }

    public void iniciarPanelPrincipal() {
        Media.inicializarMedia();
    }
}
