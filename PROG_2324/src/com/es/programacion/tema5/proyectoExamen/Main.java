package com.es.programacion.tema5.proyectoExamen;

import com.es.programacion.tema5.proyectoExamen.clases.Alumno;
import com.es.programacion.tema5.proyectoExamen.clases.Instituto;
import com.es.programacion.tema5.proyectoExamen.clases.Modulo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Instituto losRemedios = new Instituto("IES Los Remedios");

        Scanner scan = new Scanner(System.in);
        int opc = 1;

        while (opc != 0) {

            System.out.println("""
                    1. Alta alumno
                    2. Buscar alumno
                    3. Baja alumno
                    0. Salir
                    """);
            System.out.println("Escoja una opcion: ");
            opc = scan.nextInt();
            scan.nextLine();

            switch (opc) {
                case 1:

                    System.out.println("Introduzca el dni para dar de alta: ");
                    String dniAlta = scan.nextLine();

                    System.out.println("Introduzca el nombre para dar de alta: ");
                    String nombreAlta = scan.nextLine();

                    System.out.println("Introduzca el email para dar de alta: ");
                    String emailAlta = scan.nextLine();

                    Alumno nuevoAlumno = new Alumno(nombreAlta, dniAlta, emailAlta);

                    int salirModulos = 1;

                    while (salirModulos != 0) {
                        System.out.println("¿Dar de alta un módulo?\n1. Sí\n0. No");
                        salirModulos = scan.nextInt();
                        scan.nextLine();

                        if (salirModulos == 1) {
                            System.out.println("Introduzca el modulo para dar de alta: ");
                            String moduloAlta = scan.nextLine();

                            System.out.println("Introduzca el n de horas para dar de alta: ");
                            int horasModulo = scan.nextInt();
                            scan.nextLine();

                            Modulo mod = new Modulo(moduloAlta, horasModulo);

                            if(nuevoAlumno.getNumeroHoras() + horasModulo >= 20) {
                                System.out.println("No se pueden añadir más módulos");
                                break;
                            } else {
                                nuevoAlumno.anadirModulo(mod);
                            }
                        }
                    }

                    if(losRemedios.getNumeroAlumnos() + 1 >= 100) {
                        System.out.println("No se pueden añadir más alumnos");
                        break;
                    } else {
                        losRemedios.anadirAlumno(nuevoAlumno);
                        System.out.println("Alumno anadido correctamente");
                    }
                    break;
                case 2:

                    System.out.println("Introduzca el dni a buscar: ");
                    String dniABuscar = scan.nextLine();

                    Alumno al = losRemedios.buscarAlumno(dniABuscar);

                    if (al == null) {
                        System.out.println("Alumno no encontrado");
                    } else {
                        System.out.println(al.getNombre()+": "+al.getDni());
                        for(int i=0; i<al.getModulos().size();i++) {
                            System.out.println(i+". "+al.getModulos().get(i).getNombre());
                        }
                    }

                    break;
                case 3:

                    System.out.println("Introduzca el dni a eliminar: ");
                    String dniAEliminar = scan.nextLine();

                    boolean alumnoEliminado = losRemedios.bajaAlumno(dniAEliminar);
                    if(alumnoEliminado) {
                        System.out.println("Alumno correctamente eliminado");
                    } else {
                        System.out.println("Alumno no eliminado");
                    }

                    break;
                case 0:
                    System.out.println("Adios...");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        }
    }
}
