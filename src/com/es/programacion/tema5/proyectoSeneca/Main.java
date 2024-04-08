package com.Programacion.Tema5.proyectoSeneca;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Instituto instituto = new Instituto("IES Los Remedios");
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("*__________________________*");
            System.out.println("|Gestión del Instituto     |");
            System.out.println("|1. Alta alumno            |");
            System.out.println("|2. Buscar alumno          |");
            System.out.println("|3. Baja alumno            |");
            System.out.println("|0. Salir                  |");
            System.out.println("*__________________________*");
            System.out.print("Introduce una opción: ");

            int opcion = 0;
            try {
                opcion = scan.nextInt();
                scan.nextLine();
            } catch (InputMismatchException ime) {
                System.out.println("Por favor, introduce un número válido para la opción.");
                scan.nextLine();
                continue;
            }

            switch (opcion) {
                case 1:
                    // Alta alumno
                    if (instituto.numeroAlumnos() >= 100) {
                        System.out.println("No se pueden añadir más alumnos, límite alcanzado.");
                        break;
                    }
                    System.out.print("Introduce DNI del alumno: ");
                    String dni = scan.nextLine();
                    if (!validarDNI(dni)) {
                        System.out.println("DNI no válido. Asegúrate de introducir 8 números seguidos de una letra.");
                        break;
                    }
                    System.out.print("Introduce nombre del alumno: ");
                    String nombre = scan.nextLine();
                    System.out.print("Introduce email del alumno: ");
                    String email = scan.nextLine();
                    if (!validarEmail(email)) {
                        System.out.println("Email no válido. Asegúrate de introducir un email con el formato correcto: 7 letras seguidas de @g.educaand.es");
                        break;
                    }
                    Alumno alumno = new Alumno(dni, nombre, email);

                    // Lógica para matricular al alumno en módulos
                    System.out.println("Comienza la matriculación de módulos.");
                    int totalHoras = 0;
                    while (true) {
                        System.out.print("Nombre del módulo: ");
                        String nombreModulo = scan.nextLine();

                        System.out.print("Horas semanales: ");
                        try {
                            int horas = scan.nextInt();
                            scan.nextLine();
                            if (totalHoras + horas > 20) {
                                System.out.println("No se pueden superar las 20 horas semanales. Módulo no añadido.");
                                continue;
                            }
                            Modulo modulo = new Modulo(nombreModulo, horas);
                            alumno.anadirModulo(modulo);
                            totalHoras += horas;
                            System.out.println("Módulo añadido. Total horas: " + totalHoras);
                        } catch (InputMismatchException e) {
                            System.out.println("Por favor, introduce un número de horas válido.");
                            scan.nextLine();
                            continue;
                        }

                        System.out.print("¿Quieres añadir otro módulo? (s/n): ");
                        String respuesta = scan.nextLine();
                        if ("n".equalsIgnoreCase(respuesta)) break; // Salir del bucle si el usuario responde no
                    }

                    instituto.anadirAlumno(alumno);
                    System.out.println("Alumno añadido correctamente con " + totalHoras + " horas semanales.");
                    break;

                case 2:
                    // Buscar alumno
                    System.out.print("Introduce DNI del alumno a buscar: ");
                    dni = scan.nextLine();
                    Alumno alumnoEncontrado = instituto.buscarAlumno(dni);
                    if (alumnoEncontrado != null) {
                        System.out.println("Nombre: " + alumnoEncontrado.getNombre() + "; DNI: " + alumnoEncontrado.getDni());
                        System.out.println("Módulos matriculados:");
                        for (Modulo modulo : alumnoEncontrado.getModulos()) {
                            System.out.println(modulo.getNombre() + " - " + modulo.getHoras() + " horas");
                        }
                    } else {
                        System.out.println("No se ha encontrado al alumno.");
                    }
                    break;
                case 3:
                    // Baja alumno
                    System.out.print("Introduce DNI del alumno a dar de baja: ");
                    dni = scan.nextLine();
                    if (instituto.bajaAlumno(dni)) {
                        System.out.println("Alumno dado de baja correctamente.");
                    } else {
                        System.out.println("No se ha podido dar de baja al alumno.");
                    }
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    scan.close();
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, intenta de nuevo.");
            }
        }
    }


    // métodos con expresiones regulares para validar el DNI
    private static boolean validarDNI(String dni) {
        return Pattern.matches("\\d{8}[A-Za-z]", dni);
    }
    private static boolean validarEmail(String email) {
        return Pattern.matches("[a-zA-Z]{7}@g\\.educaand\\.es", email);
    }
}
