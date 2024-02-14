package com.es.programacion.tema6.proyectoComida.classes;

import com.es.programacion.tema6.proyectoComida.classes.impl.Hueso;
import com.es.programacion.tema6.proyectoComida.classes.impl.Lentejas;
import com.es.programacion.tema6.proyectoComida.classes.impl.Salchicha;

import java.util.Scanner;


    public class Main {
        public static void main(String[] args) {

            // Es vuestra energia al ppio del día
            int energia = 100;

            Scanner scan = new Scanner(System.in);
            System.out.println("""
                    1. Programacion
                    2. Bases de datos
                    3. Sistemas
                    4. EEDD
                    
                    5. Hueso
                    6. Lentejas
                    7. Salchicha
                    0. Salir
                    """);
            System.out.println("Indique la opcion: ");
            int opc = 1;

            while (opc != 0) {
                opc = scan.nextInt();
                switch (opc){
                    case 1:
                        energia = energia - 20;
                        break;
                    case 2:
                        energia = energia - 50;
                        break;
                    case 3:
                        energia = energia - 60;
                        break;
                    case 4:
                        energia = energia - 25;
                        break;
                    case 5:
                        Hueso huesoDePollo = new Hueso();
                        energia = energia + huesoDePollo.addNutricion();
                        break;
                    case 6:
                        Lentejas platoDeLentejas = new Lentejas(false);
                        energia = energia + platoDeLentejas.addNutricion();
                        break;
                    case 7:
                        Salchicha salchichaUP = new Salchicha();
                        energia += salchichaUP.addNutricion();
                        break;
                    case 0:
                        System.out.println("Saliendo del día de clase");
                        break;
                }
                System.out.println("Energia restante: "+energia);
                System.out.println("Indica otra opcion...");
            }

            if(energia <= 0) {
                System.out.println("Has muerto de cansancio");
            } else {
                System.out.println("Sigues viv@ de milagro, mañana más ;)");
            }


        }
}
