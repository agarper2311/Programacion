package com.es.programacion.pruebas.pokemon.panel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class PanelContenedor extends JPanel {

    private static final String PANEL_INICIO = "Panel Inicio";
    private static final String PANEL_SELECCION = "Panel Seleccion";
    private PanelEnter pInicio;
    private PanelEquipo pSeleccion;

    private CardLayout cardLayout = new CardLayout();

    KeyListener enterListener = new KeyAdapter() {
        @Override
        public void keyPressed(KeyEvent e) {
            // Cuando se pulsa la tecla intro, se ejecuta:
            // - Cambio de panel, del panelInicio al panelSeleccion (uno contiene nada mas que la imagen del pokemon rojo inicial y el otro es el de seleccion de pokemon)
            // - Paramos el audo OPENING (es la cancion intro de pokemon)
            // - Desactivamos en eventListener para que no se ejecute mas
            // TODO : Utilizar Logger para imprimir informacion por pantalla
            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                cardLayout.show(PanelContenedor.this, PANEL_SELECCION);
                setEnabled(false);
            }
        }
    };

    public PanelContenedor() {

        this.setLayout(cardLayout);

        pInicio = new PanelEnter();
        pSeleccion = new PanelEquipo();

        this.add(pInicio, PANEL_INICIO);
        this.add(pSeleccion, PANEL_SELECCION);

        // Para que el listener funcione, el componente debe ser focuseable.
        this.setFocusable(true);
        this.requestFocus();

        this.addKeyListener(enterListener);
    }



}
