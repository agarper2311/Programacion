package com.es.programacion.tema8.Teoria2;

import javax.swing.*;
import java.awt.*;

public class FramePrincipal extends JFrame {
    public FramePrincipal() {
        this.setSize(800, 600);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("Primera Ventana");
        ImageIcon image = new ImageIcon("src/main/resources/pokemonMedia/images/dratini.png");
        this.setIconImage(image.getImage());


        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setBackground(new Color(0,255,0));

        JLabel fieldUser = new JLabel("Usuario");
        JLabel fieldPass = new JLabel("Password");

        JTextField textFieldUser = new JTextField();
        textFieldUser.setPreferredSize(new Dimension(100,22));

        JPasswordField passwordFieldPass = new JPasswordField();
        passwordFieldPass.setPreferredSize(new Dimension(100, 22));
        passwordFieldPass.setEchoChar('+');

        JButton botonEnviar = new JButton();
        //botonEnviar.setText("Enviar");
        ImageIcon imageSend = new ImageIcon("src/main/resources/pokemonMedia/images/send.png");
        botonEnviar.setIcon(imageSend);
        botonEnviar.setPreferredSize(new Dimension(22,22));
        botonEnviar.setBackground(null);
        botonEnviar.setHorizontalAlignment(SwingConstants.CENTER);
        botonEnviar.setBorder(null);

        JToggleButton botonActivar = new JToggleButton("Activar");
        //botonActivar.setBounds(100,100, 70,70);
        botonActivar.setPreferredSize(new Dimension(70,70));
        botonActivar.setFont(new Font("Arial", Font.PLAIN, 10));
        botonActivar.setSelected(true);

        JCheckBox opciones1 = new JCheckBox("Prueba");
        JCheckBox opciones2 = new JCheckBox("Prueba2");
        JCheckBox opciones3 = new JCheckBox("Prueba3");

        JSeparator separator = new JSeparator();
        separator.setPreferredSize(new Dimension(100,1));

        JRadioButton boton1 = new JRadioButton("Boton1");
        JRadioButton boton2 = new JRadioButton("Boton2");
        boton2.setSelected(true);
        JRadioButton boton3 = new JRadioButton("Boton3");
        ButtonGroup btnGroup = new ButtonGroup();
        btnGroup.add(boton1);
        btnGroup.add(boton2);
        btnGroup.add(boton3);


        panelPrincipal.add(fieldUser);
        panelPrincipal.add(textFieldUser);
        panelPrincipal.add(fieldPass);
        panelPrincipal.add(passwordFieldPass);
        panelPrincipal.add(botonEnviar);
        panelPrincipal.add(botonActivar);
        panelPrincipal.add(opciones1);
        panelPrincipal.add(opciones2);
        panelPrincipal.add(opciones3);
        panelPrincipal.add(separator);
        panelPrincipal.add(boton1);
        panelPrincipal.add(boton2);
        panelPrincipal.add(boton3);

        this.add(panelPrincipal);
        this.setVisible(true);
    }
}
