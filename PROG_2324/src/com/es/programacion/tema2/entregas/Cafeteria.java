package com.es.programacion.tema2.entregas;

import java.util.Scanner;

public class Cafeteria {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String USUARIOCORRECTO = "roberto";
        String CONTRASENIACORRECTA = "123";
        // Zona de bienvenida y login
        System.out.println("--BIENVENIDO A UBRICOFFE--");
        System.out.println("Introduce tu usuario:");
        String usuario = scan.nextLine();
        System.out.println("Introduce tu contraseña:");
        String contrasenia = scan.nextLine();

        while (!usuario.equals(USUARIOCORRECTO) || !contrasenia.equals(CONTRASENIACORRECTA)) {
            System.out.println("Usuario o contraseña incorrectos.");
            System.out.println("Introduce tu usuario:");
            usuario = scan.nextLine();
            System.out.println("Introduce tu contraseña:");
            contrasenia = scan.nextLine();
        }

        // Zona de menú
        System.out.println("Bienvenid@ " + usuario + ".");
        System.out.println("--SELECCIONA LOS PRODUCTOS--");
        System.out.println("1. Café-------1€");
        System.out.println("2. Agua-------0,50€");
        System.out.println("3. Tostada----1,20€");
        System.out.println("4. Salir");

        // Zona de paso por caja
        int producto = 0;
        int cantidad = 0;
        int cafe = 0;
        int agua = 0;
        int tostada = 0;
        double precioTotal = 0;
        int si;

        do {
            do {
                System.out.println("Introduce el código del producto (4 para SALIR):");
                producto = scan.nextInt();

                if (producto != 4) {
                    System.out.println("Introduce la cantidad:");
                    cantidad = scan.nextInt();

                    // Calculamos el precio del producto
                    // Expresamos la cantidad de cada producto
                    switch (producto) {
                        case 1:
                            precioTotal += cantidad * 1;
                            cafe = cantidad;
                            break;
                        case 2:
                            precioTotal += cantidad * 0.5;
                            agua = cantidad;
                            break;
                        case 3:
                            precioTotal += cantidad * 1.2;
                            tostada = cantidad;
                            break;
                        default:
                            System.out.println("Error en el producto");
                            break;
                    }

                }
                // Preguntar al finalizar el pedido si desea algo más
            } while (producto != 4);
            // Le diremos lo que ha pedido junto con el precio total a pagar
            System.out.println("Has comprado " + cafe + " cafes, " + agua + " aguas, " + tostada + " tostadas.");
            System.out.println("Total a pagar: " + precioTotal + "€");
            // Preguntar al finalizar el pedido si desea algo más
            System.out.println("¿Quieres algo más? (1 para sí, 2 para no)");
            si = scan.nextInt();

        } while (si != 2);


        // Mensaje de despedida
        System.out.println("¡Gracias por su compra y adiós!");
    }
}
// --PREGUNTAS:--
// a. ¿Cuál es la parte más compleja a la hora de trabajar con bucles?
// La parte más compleja de los bucles no es el bucle en si, si no lo que le metes adentro.

// b. ¿Por qué has decidido utilizar un bucle while en lugar de un do-while? (O al revés si así ha sido el caso)
// Por que me parecia más fácil el While en esta situación, aunque a última he tenido que utilizar el do-while para seguir preguntado.

// c. ¿Cuál ha sido la parte más compleja de la práctica?
// Calcular los precios, el año pasado di el Switch y te lo he puesto porque no sabia como hacerlo sin el.
