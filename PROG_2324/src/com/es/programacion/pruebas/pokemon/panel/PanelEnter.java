package com.es.programacion.pruebas.pokemon.panel;

import com.es.programacion.pruebas.pokemon.assets.Media;
import com.es.programacion.pruebas.pokemon.utils.Utils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

public class PanelEnter extends JPanel {

    private JLabel textoInformativo;

    ComponentListener cl = new ComponentAdapter() {
        @Override
        public void componentHidden(ComponentEvent e) {
            Media.emptyBuffer(Media.OPENING);
        }
    };

    public PanelEnter() {

        // Seteo de propiedades del JPanel
        this.setSize(new Dimension(Utils.PREF_WIDTH,Utils.PREF_HEIGHT));
        this.setLayout(new BorderLayout());

        // Label texto informativo
        textoInformativo = new JLabel("Pulse ENTER para comenzar");
        textoInformativo.setFont(new Font("sans-serif", Font.PLAIN, 20));
        textoInformativo.setHorizontalAlignment(SwingConstants.CENTER); // Centro el texto
        this.add(textoInformativo, BorderLayout.NORTH);

        // Starts media
        Media.OPENING.start();

        this.addComponentListener(cl);
    }


    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(Media.TITLE_COVER, 0,0, getWidth(), getHeight(), null);
    }



}
