package com.es.programacion.pruebas.pokemon.paneles;

import com.es.programacion.pruebas.pokemon.utils.Utils;

import javax.swing.*;
import java.awt.*;

public class SeparadorVertical extends JPanel {

    public SeparadorVertical(JPanel padre) {
        this.setLayout(new FlowLayout());
        this.setSize(new Dimension(Utils.LINEA, padre.getHeight()));
        this.setBackground(Color.BLACK);
    }


}
