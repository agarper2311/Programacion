package com.es.programacion.tema8.proyectoLoginUI.ui;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PanelLogin extends JPanel {
    JTextField user;
    JTextField pass;
    JButton bEnviar;

    MouseListener listenerMouse = new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            System.out.println(user.getText());
            System.out.println(pass.getText());
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            JButton b = (JButton) e.getSource();
            b.setBackground(new Color(255, 0, 0)); // Fondo ROJO
            b.setBorder(new LineBorder(new Color(255,0,0), 3)); // Borde azul oscuro
        }

        @Override
        public void mouseExited(MouseEvent e) {
            JButton b = (JButton) e.getSource();
            b.setBackground(new Color(255, 0, 0)); // Fondo azul medio
            b.setBorder(new LineBorder(new Color(255, 0, 0))); // Borde azul claro
        }
    };
    public PanelLogin() {
        this.setBackground(new Color(255, 0, 0));
        this.setLayout(null);

        JLabel usuario = new JLabel("Usuario: ");
        usuario.setLocation(new Point(200,135));
        usuario.setSize(new Dimension(152,32));
        // usuario.setFont(new Font("Consolas", Font.BOLD, 22));
        this.add(usuario);

        user = new JTextField();
        user.setLocation(new Point(260,135));
        user.setSize(new Dimension(152,32));
        this.add(user);

        JLabel passwd = new JLabel("Passwd: ");
        passwd.setLocation(new Point(200,200));
        passwd.setSize(new Dimension(152,32));
        this.add(passwd);

        pass = new JPasswordField();
        pass.setLocation(new Point(260,200));
        pass.setSize(new Dimension(152,32));
        this.add(pass);

        bEnviar = new JButton("Enviar");
        bEnviar.setLocation(new Point(220,321));
        bEnviar.setSize(new Dimension(152,32));
        this.add(bEnviar);
        bEnviar.addMouseListener(listenerMouse);

    }
}
