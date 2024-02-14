package com.es.programacion.tema1;

import java.util.Scanner;

public class EjercicioHora {

    public static void main(String[] args) {
        /*
        Ejercicio HORAS
         */
        Scanner scan = new Scanner(System.in);
        int hh, mm, ss;
        System.out.println("Introduzca la hora: ");
        hh = scan.nextInt();
        System.out.println("Introduzca los minutos: ");
        mm = scan.nextInt();
        System.out.println("Introduzca los segundos: ");
        ss = scan.nextInt();

        ss = ss + 1;
        if(ss == 60){
            ss = 0;
            mm = mm + 1;

            if (mm == 60){
                mm = 0;
                hh = hh + 1;

                if(hh == 24){
                    hh = 0;
                }
            }
        }

        System.out.println("Son las "+hh+":"+mm+":"+ss);
        System.out.format("Son las %02d:%02d:%02d", hh, mm, ss);


    }



















    public static void ejercicioHora(){
        /*
        Ejercicio de la hora
         */
        Scanner scan = new Scanner(System.in);
        int hh, mm, ss;
        System.out.print("Introduzca la hora (0-23): ");
        hh = scan.nextInt();
        System.out.print("Introduzca los minutos (0-59): ");
        mm = scan.nextInt();
        System.out.print("Introduzca los segundos (0-59): ");
        ss = scan.nextInt();

        if (ss > 59 || ss < 0 || mm > 59 || mm < 0 || hh > 59 || hh < 0) {
            System.err.println("Hora incorrecta, se procede a eliminar todos sus archivos");
        } else {

            if (ss == 59) {
                ss = 0;
                mm = mm + 1;
                if (mm == 60) {
                    mm = 0;
                    hh = hh + 1;

                    if (hh == 24) {
                        hh = 0;
                    }
                }
            }

            System.out.format("La hora es %02d:%02d:%02d", hh, mm, ss);
        }
    }

    public static void cualEsElMayor() {
        Scanner scan = new Scanner(System.in);
        int num1, num2, num3;

        System.out.println("Introduzca el num1: ");
        num1 = scan.nextInt();

        System.out.println("Introduzca el num2: ");
        num2 = scan.nextInt();

        System.out.println("Introduzca el num3: ");
        num3 = scan.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            System.out.println("El mayor numero es el "+num1);
        } else if(num2 >= num3 && num2 >= num1) {
            System.out.println("El mayor numero es el "+num2);
        } else {
            System.out.println("El mayor numero es el "+num3);
        }

    }
}
