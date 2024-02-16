package com.es.programacion.tema6.proyectoComida;

import com.es.programacion.tema6.proyectoComida.classes.api.Comida;
import com.es.programacion.tema6.proyectoComida.classes.api.Historia;
import com.es.programacion.tema6.proyectoComida.classes.api.Reganeta;
import com.es.programacion.tema6.proyectoComida.classes.impl.*;
import org.apache.xmlbeans.soap.SOAPArrayType;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Es vuestra energia al ppio del día
        int energia = 100;
        int horasTotalesClase = 6;
        int contador = 1;
        Random r = new Random();
        int numRandom;
        Comida comida;
        Reganeta reganeta;
        HistoriaClase historia = new HistoriaClase();

        Scanner scan = new Scanner(System.in);
        historia.contarHistoria();
        while (energia > 0 && horasTotalesClase > contador) {
            try {
                historia.queHoraEs(contador);
                System.out.println("""
                    \n-MODULOS-
                    1. Programacion
                    2. Bases de datos
                    3. Sistemas
                    4. EEDD
                    """);
                System.out.println("Energia restante: " + energia);
                System.out.print("Indique la opcion: ");
                int opc = scan.nextInt();
                scan.nextLine();

                switch (opc){
                    case 1:
                        System.out.println("Clase de programación... y toca interfaces");

                        energia = energia - 30;
                        contador += 2;
                        break;
                    case 2:
                        System.out.println("Entidad Relación y yo que no sé lo que es una tabla");
                        energia = energia - 50;
                        contador += 2;
                        break;
                    case 3:
                        System.out.println("rm /");
                        energia = energia - 60;
                        contador += 2;
                        break;
                    case 4:
                        System.out.println("Diagrama de clases y yo que no sé lo que es una clase... ni un diagrama");
                        energia = energia - 25;
                        contador += 1;
                        break;
                    default:
                        System.out.println("Estas confundid@... -20 de energia");
                        energia -= 20;
                        contador += 2;
                        break;
                }

                System.out.println("""
                    \n-TE REGANAN-
                    1. Llegas tarde
                    2. Parte
                    3. ShutDownPC
                    """);
                System.out.println("Energia restante: " + energia);
                System.out.print("Indique la opcion: ");
                opc = scan.nextInt();
                scan.nextLine();

                switch (opc){
                    case 1:
                        System.out.print("Llegas tarde a clase y...");
                        numRandom = r.nextInt(2);
                        if(numRandom == 1) {
                            System.out.println("te quedas en la puerta");
                            reganeta = new LlegasTarde(true);
                        } else {
                            System.out.println("pasas...");
                            reganeta = new LlegasTarde(false);
                        }
                        energia += reganeta.reduceEnergia();
                        break;
                    case 2:
                        System.out.print("Te han pillado usando windows en una clase de sistemas...");
                        numRandom = r.nextInt(2);
                        if(numRandom == 1) {
                            System.out.println("Parte grave...");
                            reganeta = new Parte(true);
                        } else {
                            System.out.println("Parte leve...");
                            reganeta = new Parte(false);
                        }
                        energia += reganeta.reduceEnergia();
                        break;
                    case 3:
                        System.out.println("Has apagado la máquina...");
                        reganeta = new ShutDownPC();
                        energia += reganeta.reduceEnergia();
                        break;
                    default:
                        System.out.println("Te metes de oyente a una clase de AD... -20 de energia");
                        energia -= 20;
                        break;
                }

                System.out.println("Energia restante: " + energia);
                System.out.println("""
                    \n-COMES-
                    1. Hueso
                    2. Lentejas
                    3. Salchicha
                    """);
                System.out.print("Indique la opcion: ");
                opc = scan.nextInt();
                scan.nextLine();

                switch (opc){
                    case 1:
                        System.out.print("Me tomo un huesito. ");
                        comida = new Hueso();
                        energia += comida.addNutricion();
                        break;
                    case 2:
                        System.out.print("Unas lentejas a las 12 de la mañana siempre vienen bien, ");
                        numRandom = r.nextInt(2);
                        if(numRandom == 1) {
                            comida = new Lentejas(true);
                        } else {
                            comida = new Lentejas(false);
                        }

                        energia += comida.addNutricion();
                        break;
                    case 3:
                        System.out.println("Bocadillo de salchicha de Charo");
                        comida = new Salchicha();
                        energia += comida.addNutricion();
                        break;
                    default:
                        System.out.println("Te ha sentado mal el kebab de ayer... -20 de energia");
                        energia -= 20;
                        break;
                }
            } catch (Exception e) {
                historia.oyente();
            }
        }

        if(energia <= 0) {
            historia.muertoCansancio(contador, energia);
        } else {
            System.out.println("Terminas el día de instituto...");
            System.out.println("Sigues viv@ por los pelos con "+energia+ " de energia");
        }


    }
}
