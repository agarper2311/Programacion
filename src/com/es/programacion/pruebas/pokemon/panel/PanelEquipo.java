package com.es.programacion.pruebas.pokemon.panel;

import com.es.programacion.pruebas.pokemon.assets.Media;
import com.es.programacion.pruebas.pokemon.panel.zonas.ZonaEleccion;
import com.es.programacion.pruebas.pokemon.panel.zonas.ZonaSeleccion;
import com.es.programacion.pruebas.pokemon.paneles.SeparadorHorizontal;
import com.es.programacion.pruebas.pokemon.paneles.SeparadorVertical;
import com.es.programacion.pruebas.pokemon.utils.Utils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

public class PanelEquipo extends JPanel {

    private ZonaEleccion zonaEleccion;

    private ZonaSeleccion zonaSeleccionJ1;
    private ZonaSeleccion zonaSeleccionJ2;

    private String[] equipoJ1 = new String[6];
    private String[] equipoJ2 = new String[6];

    ComponentListener cl = new ComponentAdapter() {
        @Override
        public void componentShown(ComponentEvent e) {
            //Media.PALLET_TOWN.start();
        }

        @Override
        public void componentHidden(ComponentEvent e) {
            Media.PALLET_TOWN.stop();
            Media.emptyBuffer(Media.PALLET_TOWN);
        }
    };


    public PanelEquipo() {
        inicializarEquipo();

        // Seteo de propiedades del JPanel
        //this.setSize(new Dimension(Utils.PREF_WIDTH, Utils.PREF_HEIGHT));
        this.setLayout(new BorderLayout());

        this.zonaEleccion = new ZonaEleccion(this);
        this.add(zonaEleccion, BorderLayout.NORTH);

        this.zonaSeleccionJ1 = new ZonaSeleccion(this);
        this.zonaSeleccionJ2 = new ZonaSeleccion(this);


        this.add(new SeparadorHorizontal(this), BorderLayout.CENTER);

        JPanel otro = new JPanel();
        otro.setLayout(new GridLayout(1,3));
        otro.setPreferredSize(new Dimension(Utils.PREF_WIDTH_HALF, Utils.PREF_HEIGHT_HALF));
        JLabel i = new JLabel("vs");
        otro.add(zonaSeleccionJ1);
        otro.add(i);
        otro.add(zonaSeleccionJ2);


        this.add(otro, BorderLayout.SOUTH);
        this.addComponentListener(cl);
    }

    private void inicializarEquipo() {
        for (int i = 0; i <= equipoJ1.length - 1; i++) {
            equipoJ1[i] = "";
        }

        for (int i = 0; i <= equipoJ2.length - 1; i++) {
            equipoJ2[i] = "";
        }
    }

    public ZonaSeleccion getZonaSeleccionJ1() {
        return zonaSeleccionJ1;
    }

    public String[] getEquipoJ1() {
        return this.equipoJ1;
    }
    public String[] getEquipoJ2() {
        return this.equipoJ2;
    }


}
