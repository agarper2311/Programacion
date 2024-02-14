package com.es.programacion.pruebas.pokemon.paneles;

import com.es.programacion.pruebas.pokemon.utils.Utils;

import javax.swing.*;
import java.awt.*;

public class SeparadorHorizontal extends JPanel {

    public SeparadorHorizontal(JPanel padre) {
        this.setLayout(new FlowLayout());
        this.setPreferredSize(new Dimension(padre.getWidth(), Utils.LINEA));
        this.setBackground(Color.BLACK);
    }


}
