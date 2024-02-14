package com.es.programacion.pruebas.pokemon.panel.zonas;

import com.es.programacion.pruebas.pokemon.label.LabelPokemon;
import com.es.programacion.pruebas.pokemon.panel.PanelEquipo;
import com.es.programacion.pruebas.pokemon.utils.Utils;

import javax.swing.*;
import java.awt.*;

public class ZonaSeleccion extends JPanel {

    PanelEquipo panelEquipo;
    public ZonaSeleccion(PanelEquipo parent){
        this.panelEquipo = parent;

        this.setLayout(new GridLayout(3,3));
        //this.setSize(new Dimension(Utils.PREF_WIDTH_HALF/2, Utils.PREF_HEIGHT_HALF/2));
        //this.add(zonaSeleccion, BorderLayout.CENTER);


    }

    public void addPokemonToEquipo(String pokemon) {
        for (int i = 0; i <= panelEquipo.getEquipoJ1().length - 1; i++) {
            if ("".equalsIgnoreCase(panelEquipo.getEquipoJ1()[i])) {
                panelEquipo.getEquipoJ1()[i] = pokemon;
                break;
            }
        }
        updateZonaSeleccion();
    }

    public void removePokemonFromEquipo(String pokemon) {
        for (int i = 0; i <= panelEquipo.getEquipoJ1().length - 1; i++) {
            if (pokemon.equalsIgnoreCase(panelEquipo.getEquipoJ1()[i])) {
                panelEquipo.getEquipoJ1()[i] = "";
                break;
            }
        }
        updateZonaSeleccion();
    }


    private void updateZonaSeleccion() {

        this.removeAll();
        for (int i = 0; i <= panelEquipo.getEquipoJ1().length - 1; i++) {
            LabelPokemon label = new LabelPokemon(panelEquipo.getEquipoJ1()[i], Utils.BG, panelEquipo);
            this.add(label);
        }
        this.revalidate();
    }
}
