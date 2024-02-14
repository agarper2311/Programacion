package com.es.programacion.pruebas.pokemon.boton;

import com.es.programacion.pruebas.pokemon.assets.Media;
import com.es.programacion.pruebas.pokemon.panel.zonas.ZonaEleccion;


import javax.swing.*;
import java.awt.*;

import java.awt.event.*;
import java.awt.image.BufferedImage;

public class BotonPokemon extends JButton {

    private ZonaEleccion zonaEleccion;
    private BufferedImage imagenPokemon, selectedBox;
    private Dimension size;
    public String nombrePokemon = "";
    private boolean isHover = false;

    ActionListener al = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            zonaEleccion.panelEquipo.getZonaSeleccionJ1().addPokemonToEquipo(nombrePokemon);
        }
    };

    MouseListener ml = new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            Media.CLICK.setFramePosition(0);
            Media.CLICK.start();
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            isHover = true;
        }

        @Override
        public void mouseExited(MouseEvent e) {
            isHover = false;

        }
    };

    public BotonPokemon(String nombrePokemon, Dimension size, ZonaEleccion zonaEleccion) {
        this.zonaEleccion = zonaEleccion;
        this.nombrePokemon = nombrePokemon;
        this.size = size;

        imagenPokemon = Media.imageFactory(this.nombrePokemon);
        selectedBox = Media.SELECTED_BOX;


        this.addActionListener(al);
        this.addMouseListener(ml);
    }

    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(imagenPokemon, 0,0, getWidth(), getHeight(), null);

        if(isHover){
            g2d.drawImage(selectedBox, 0,0, getWidth(), getHeight(), null);
        }
    }


}
