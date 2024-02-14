package com.es.programacion.pruebas.pokemon.panel.zonas;

import com.es.programacion.pruebas.pokemon.boton.BotonPokemon;
import com.es.programacion.pruebas.pokemon.panel.PanelEquipo;
import com.es.programacion.pruebas.pokemon.utils.Utils;

import javax.swing.*;
import java.awt.*;

public class ZonaEleccion extends JPanel {

    private static Dimension size = new Dimension(Utils.PREF_WIDTH_HALF, Utils.PREF_HEIGHT_HALF);
    public PanelEquipo panelEquipo;
    private GridLayout grid;
    private BotonPokemon[] pokemons = new BotonPokemon[10];


    public ZonaEleccion(PanelEquipo panelEquipo) {
        this.panelEquipo = panelEquipo;

        this.setPreferredSize(this.size);

        grid = new GridLayout(2, 5);
        this.setLayout(grid);

        for (int i = 0; i <= pokemons.length - 1; i++) {
            pokemons[i] = new BotonPokemon(Utils.NOMBRES_POKEMON[i], Utils.MD, this);
            this.add(pokemons[i]);
        }

    }


}
