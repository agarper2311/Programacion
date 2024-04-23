package com.es.programacion.tema8.proyectoMiniCalculadora.ui;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import static java.awt.Color.white;

public class PanelCalculadora1 extends JPanel {

    JTextField textFieldvalor1;
    JTextField textFieldvalor2;
    JButton botonSuma;
    JButton botonResta;
    JButton botonDivision;
    JButton botonMultiplicacion;
    JLabel labelResultado;

    // Eventos
    MouseListener listenerMouse = new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            JButton b = (JButton) e.getSource();
            System.out.println("Boton " + b.getText() + " clicado");

            if (b.getText().equalsIgnoreCase("+")) {
                // Realizamos la suma
                // 1º Obtenemos los valores de los TextFields
                String valorTexto1 = textFieldvalor1.getText();
                String valorTexto2 = textFieldvalor2.getText();

                // 2º Para sumar, los valores deben ser enteros (try/catch para evitar errores)
                try {
                    int valorEnteroTexto1 = Integer.parseInt(valorTexto1);
                    int valorEnteroTexto2 = Integer.parseInt(valorTexto2);

                    // 3º Realizamos la suma de los valores
                    int resultadoSuma = valorEnteroTexto1 + valorEnteroTexto2;

                    // 4º Por último ponemos ese resultado en el Jlabel(labelResultado)
                    labelResultado.setText(resultadoSuma + "");

                } catch (NumberFormatException ex) {
                    labelResultado.setText("Error");
                }

            } else if (b.getText().equalsIgnoreCase("-")){
                {
                    // Realizamos la resta
                    // 1º Obtenemos los valores de los TextFields
                    String valorTexto1 = textFieldvalor1.getText();
                    String valorTexto2 = textFieldvalor2.getText();

                    // 2º Para restar, los valores deben ser enteros (try/catch para evitar errores)
                    try {
                        int valorEnteroTexto1 = Integer.parseInt(valorTexto1);
                        int valorEnteroTexto2 = Integer.parseInt(valorTexto2);

                        // 3º Realizamos la resta de los valores
                        int resultadoResta = valorEnteroTexto1 - valorEnteroTexto2;

                        // 4º Por último ponemos ese resultado en el Jlabel(labelResultado)
                        labelResultado.setText(resultadoResta + "");

                    } catch (NumberFormatException ex) {
                        labelResultado.setText("Error");
                    }

                }



            }else if  (b.getText().equalsIgnoreCase("x")){
                {
                    // Realizamos la multiplicacion
                    // 1º Obtenemos los valores de los TextFields
                    String valorTexto1 = textFieldvalor1.getText();
                    String valorTexto2 = textFieldvalor2.getText();

                    // 2º Para multiplicar, los valores deben ser enteros (try/catch para evitar errores)
                    try {
                        int valorEnteroTexto1 = Integer.parseInt(valorTexto1);
                        int valorEnteroTexto2 = Integer.parseInt(valorTexto2);

                        // 3º Realizamos la multiplicacion de los valores
                        int resultadoMultiplicacion = valorEnteroTexto1 * valorEnteroTexto2;

                        // 4º Por último ponemos ese resultado en el Jlabel(labelResultado)
                        labelResultado.setText(resultadoMultiplicacion + "");

                    } catch (NumberFormatException ex) {
                        labelResultado.setText("Error");
                    }

                }
            }else if  (b.getText().equalsIgnoreCase("/")){
                {
                    // Realizamos la division
                    // 1º Obtenemos los valores de los TextFields
                    String valorTexto1 = textFieldvalor1.getText();
                    String valorTexto2 = textFieldvalor2.getText();

                    // 2º Para multiplicar, los valores deben ser enteros (try/catch para evitar errores)
                    try {
                        int valorEnteroTexto1 = Integer.parseInt(valorTexto1);
                        int valorEnteroTexto2 = Integer.parseInt(valorTexto2);

                        // 3º Realizamos la division de los valores
                        int resultadoDivision = valorEnteroTexto1 / valorEnteroTexto2;

                        // 4º Por último ponemos ese resultado en el Jlabel(labelResultado)
                        labelResultado.setText(resultadoDivision + "");

                    } catch (NumberFormatException ex) {
                        labelResultado.setText("Error");
                    }catch (ArithmeticException ex){
                        labelResultado.setText("No se puede dividir entre cero cazurro");
                    }

                }

            }
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            JButton b = (JButton) e.getSource();
            b.setBackground(Color.green);
            b.setBorder(new LineBorder(new Color(0, 0, 0), 3));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            JButton b = (JButton) e.getSource();
            b.setBackground(Color.cyan);
            b.setBorder(new LineBorder(new Color(0, 0, 0), 1));

        }
    };

    public PanelCalculadora1() {
        this.setLayout(new BorderLayout());
        this.setBackground(white);

        // Inicializamos los elementos
        textFieldvalor1 = new JTextField("Introduzca valor 1");
        textFieldvalor2 = new JTextField("Introduca valor 2");
        botonSuma = new JButton("+");
        botonResta = new JButton("-");
        botonDivision = new JButton("x");
        botonMultiplicacion = new JButton("/");
        labelResultado = new JLabel();


        // Modificamos los atributos/valores/aspecto de los elementos
        textFieldvalor1.setPreferredSize(new Dimension(300, 200));
        textFieldvalor2.setPreferredSize(new Dimension(300, 200));
        botonSuma.setPreferredSize(new Dimension(200, 200));
        botonResta.setPreferredSize(new Dimension(200, 200));
        botonDivision.setPreferredSize(new Dimension(200, 200));
        botonMultiplicacion.setPreferredSize(new Dimension(200, 200));
        labelResultado.setPreferredSize(new Dimension(600, 200));

        // Otras Modificaciones
        labelResultado.setFont(new Font("Consolas",Font.BOLD,32));
        labelResultado.setHorizontalAlignment(JLabel.CENTER);

        // Añadimos los eventos
        botonSuma.addMouseListener(listenerMouse);
        botonResta.addMouseListener(listenerMouse);
        botonMultiplicacion.addMouseListener(listenerMouse);
        botonDivision.addMouseListener(listenerMouse);


        JPanel panelNorte = new JPanel(new GridLayout(1, 2));
        JPanel panelCentro = new JPanel(new GridLayout(1, 4));

        // Añadimos al Jpanel
        panelNorte.add(textFieldvalor1);
        panelNorte.add(textFieldvalor2);
        panelCentro.add(botonSuma);
        panelCentro.add(botonResta);
        panelCentro.add(botonMultiplicacion);
        panelCentro.add(botonDivision);
        this.add(panelNorte, BorderLayout.NORTH);
        this.add(panelCentro, BorderLayout.CENTER);
        this.add(labelResultado, BorderLayout.SOUTH);

    }
}
