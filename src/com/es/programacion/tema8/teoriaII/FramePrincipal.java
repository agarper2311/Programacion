package com.es.programacion.tema8.teoriaII;

import javax.swing.*;
import java.awt.*;

public class FramePrincipal extends JFrame {

    public  FramePrincipal() {


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
        botonEnviar.setBackground(new Color(255, 0, 255));





        panelPrincipal.add(fieldUser);
        panelPrincipal.add(textFieldUser);
        panelPrincipal.add(fieldPass);
        panelPrincipal.add(passwordFieldPass);
        panelPrincipal.add(botonEnviar);


        this.add(panelPrincipal);
        this.setVisible(true);
    }
}
