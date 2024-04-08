package com.es.programacion.Tema7.proyectoAirbnb;

import com.es.programacion.Tema7.proyectoAirbnb.model.Alojamiento;
import com.es.programacion.Tema7.proyectoAirbnb.services.GestionFichAirbnb;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestionFichAirbnb gestion = new GestionFichAirbnb();

        // Definición de rutas

        // Ruta al archivo de donde se van a extraer los datos
        String rutaOriginalMalaga = "src/main/resources/archivosTema7/Airbnb/malaga.csv";

        // Ruta al archivo donde se guardarán los datos
        String rutaDatosMalaga = "src/main/resources/archivosTema7/Airbnb/datos_malaga.csv";


        // Cargar alojamientos desde el CSV
              List<Alojamiento> alojamientos = gestion.cargarAlojamientosDesdeCSV(rutaOriginalMalaga);
        //____________________________________________________________________________________________________\\
        /*                                                                                                  */
        /*      /**                                                                                         */
        /*       * Invoca el método cargarAlojamientosDesdeCSV: Este método es llamado sobre una instancia  */
        /*       * de la clase GestionFichAirbnb referenciada por gestion. El método está diseñado para     */
        /*       * leer datos desde un archivo CSV especificado por la ruta que se pasa como argumento      */
        /*       * (rutaOriginalMalaga).                                                                    */
        /*       *                                                                                          */
        /*       * Lee datos del archivo CSV: La ruta al archivo CSV (rutaOriginalMalaga) se utiliza para   */
        /*       * localizar y abrir el archivo. El método procesa el contenido del archivo, creando una    */
        /*       * nueva instancia de Alojamiento por cada línea de datos válida encontrada en el archivo,  */
        /*       * basándose en los campos específicos (como id, name, hostId, hostName, y price) que se    */
        /*       * extraen y se utilizan para construir objetos Alojamiento.                                */
        /*       *                                                                                          */
        /*       * Crea una lista de Alojamiento: Cada objeto Alojamiento creado a partir de los datos del  */
        /*       * archivo se agrega a una lista. Esta lista representa todos los alojamientos disponibles  */
        /*       * que han sido leídos y procesados desde el archivo CSV.                                   */
        /*       *                                                                                          */
        /*       * Asigna la lista a la variable alojamientos: Finalmente, la lista completa de objetos     */
        /*       * Alojamiento se asigna a la variable alojamientos. Esta variable ahora contiene todos los */
        /*       * alojamientos que fueron cargados desde el archivo CSV, permitiendo que el programa       */
        /*       * realice operaciones adicionales con estos datos, como mostrarlos, filtrarlos o modificar */
        /*       * según las opciones del menú que el usuario elija interactuar.                            */
        /*                                                                                                  */
        //____________________________________________________________________________________________________\\



        // Guardar en nuevo archivo para confirmar la extracción
        gestion.guardarAlojamientosEnCSV(alojamientos, rutaDatosMalaga);

        //____________________________________________________________________________________________________________\\
        /*
         rutaDatosMalaga hace referencia al archivo donde se guardarán las modificaciones y los 20 primeros alojamientos
         más baratos y más caros
         */
        //____________________________________________________________________________________________________________\\

        // Importamos la biblioteca scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        int opcion; // Definir opcion como entero

        // Bucle do while para mostrar el menú
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Imprimir los 20 alojamientos más baratos");
            System.out.println("2. Imprimir los 20 alojamientos más caros");
            System.out.println("3. Filtrar por presupuesto máximo");
            System.out.println("4. Modificar el precio de un alojamiento");
            System.out.println("5. Modificar el propietario de un alojamiento");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            // Estructura de control Switch para manejar las opciones que seleccione el usuario
            switch (opcion) {
                case 1:
                    // Imprimir los 20 alojamientos más baratos
                    System.out.println("Los 20 alojamientos más baratos:"); // Muestra por pantalla el mensaje
                    GestionFichAirbnb.imprimirAlojamientos(gestion.baratos(alojamientos, 20));

                    //________________________________________________________________________________________________\\
                    /**
                     * GestionFichAirbnb.imprimirAlojamientos(...);
                     *
                     * Este segmento toma la lista de alojamientos resultante de la llamada a
                     * gestion.baratos(alojamientos, 20) y la pasa como argumento al método estático
                     * imprimirAlojamientos de la clase GestionFichAirbnb.
                     * El propósito de imprimirAlojamientos es recorrer la lista de alojamientos proporcionada y mostrar
                     * cada uno de ellos en la consola, utilizando para ello el método toString() de la clase
                     * Alojamiento, que define cómo se representa textualmente cada alojamiento.
                     */
                    //________________________________________________________________________________________________\\

                    /*
                    gestion.baratos(alojamientos, 20);

                    Este segmento de código llama al método baratos de la instancia gestion de la clase
                    GestionFichAirbnb. El método baratos recibe como argumentos la lista de todos los
                    alojamientos (alojamientos) y un número entero (20). La función de este método es ordenar todos los
                    alojamientos por su precio de menor a mayor y seleccionar los 20 alojamientos más baratos de la
                    lista. Si hay menos de 20 alojamientos en total, devolverá todos los alojamientos disponibles.
                    El resultado de este método es una lista de Alojamiento que contiene hasta 20 de los alojamientos
                     más baratos.
                     */

                    break;
                //________________________________________________________________________________________________\\
                case 2:
                    // Imprimir los 20 alojamientos más caros
                    System.out.println("Los 20 alojamientos más caros:");
                    GestionFichAirbnb.imprimirAlojamientos(gestion.caros(alojamientos, 20));
                    break;
                case 3:
                    // Filtrar por presupuesto máximo

                    // Le pedimos al usuario que introduzca un presupuesto máximo
                    System.out.print("Introduce un presupuesto máximo por noche: ");

                    /**
                     * Leemos la entrada del usuario: Capturamos el valor del presupuesto máximo introducido por el usuario
                     * a través de la consola. Utilizamos scanner.nextDouble() para obtener un valor double que
                     * representa este presupuesto máximo.
                     */
                    double presupuesto = scanner.nextDouble();

                    /**
                     * Limpiamos el buffer del Scanner: Después de leer un número double, el método nextDouble() no
                     * consume el último salto de línea (\n), por lo que usamos scanner.nextLine() para limpiar
                     * el buffer y evitar problemas al leer más entrada del usuario más adelante.
                     */
                    scanner.nextLine(); // Limpiar el buffer

                    // Mostramos el mensaje para indicarle al usuario el número de alojamientos con el presupuesto indicado
                    System.out.println("Alojamientos dentro del presupuesto:");

                    /**
                     * Filtra y muestra los alojamientos: Llama al método filtrarPorPresupuesto de la instancia gestion
                     * de la clase GestionFichAirbnb, pasando la lista de todos los alojamientos cargados y el
                     * presupuesto máximo introducido. Este método devuelve una lista de alojamientos cuyo precio por
                     * noche no supera el presupuesto especificado. Luego, esta lista se pasa al método
                     * imprimirAlojamientos de la clase GestionFichAirbnb para imprimir los detalles de cada alojamiento
                     * en la consola.
                     */
                    GestionFichAirbnb.imprimirAlojamientos(gestion.filtrarPorPresupuesto(alojamientos, presupuesto));
                    break;
                case 4:
                    // Modificar el precio de un alojamiento

                    // Llamamos al método modificar precio de GestionFichAirbnb para:
                    /**
                     * Modificar el precio de un alojamiento:
                     *
                     * Muestra un mensaje pidiendo al usuario que introduzca el ID del alojamiento cuyo precio desea modificar.
                     * Lee el ID introducido por el usuario.
                     * Pide al usuario que introduzca el nuevo precio para el alojamiento especificado.
                     * Busca el alojamiento por el ID proporcionado y actualiza su precio con el nuevo valor introducido por el usuario.
                     * Muestra un mensaje confirmando que el precio ha sido actualizado.
                     * Este proceso se lleva a cabo mediante la llamada al método modificarPrecio de la instancia
                     * gestion de la clase GestionFichAirbnb, pasando como argumentos la lista de alojamientos y el
                     * objeto Scanner para leer la entrada del usuario.
                     */
                    gestion.modificarPrecio(alojamientos, scanner);

                    // Guardar cambios

                    // Llamamos al método guardarAlojamientosEnCSV de GestionFichAirbnb para:
                    /**
                     * Después de modificar el precio de un alojamiento, los cambios realizados en la lista de
                     * alojamientos en memoria deben ser guardados de nuevo en el archivo CSV para mantener la
                     * persistencia de los datos.
                     * Esto se logra llamando al método guardarAlojamientosEnCSV de la misma instancia gestion, pasando
                     * la lista de alojamientos actualizada y la ruta al archivo CSV (rutaDatosMalaga) donde se desea
                     * guardar los cambios.
                     * Este paso asegura que cualquier modificación hecha a los precios de los alojamientos se refleje
                     * en el archivo CSV, manteniendo así los datos actualizados.
                     */
                    gestion.guardarAlojamientosEnCSV(alojamientos, rutaDatosMalaga);
                    break;
                case 5:
                    // Modificar el propietario de un alojamiento

                    // Llamamos al método modificarPropietario de GestioFichAirbnb para:
                    /**
                     * Modificar el propietario de un alojamiento:
                     *
                     * Este paso inicia solicitando al usuario que introduzca el ID del alojamiento cuyo propietario
                     * quiere modificar. Esto se hace mostrando un mensaje en consola y utilizando un objeto Scanner
                     * para leer la entrada del usuario.
                     * Luego, el programa espera que el usuario introduzca los nuevos datos del propietario:
                     * · su ID (host_id)
                     * · nombre (host_name).
                     * Utilizando el método modificarPropietario de la instancia gestion de la clase GestionFichAirbnb,
                     * el programa busca en la lista de alojamientos el que coincide con el ID proporcionado por el
                     * usuario y actualiza los datos del propietario de dicho alojamiento con los nuevos valores
                     * ingresados. Se muestra un mensaje confirmando que el propietario ha sido actualizado.
                     */
                    gestion.modificarPropietario(alojamientos, scanner);

                    // Guardar cambios

                    //Llamamos al método guardarAlojamientoEnCSV de GestionFichAirbnb para:
                    /**
                     * Después de modificar el propietario de un alojamiento, es crucial guardar los cambios realizados
                     * en la lista de alojamientos en memoria de vuelta al archivo CSV. Esto asegura la persistencia de
                     * los datos modificados.
                     * El método guardarAlojamientosEnCSV es llamado, pasando la lista actualizada de alojamientos y la
                     * ruta al archivo CSV (rutaDatosMalaga) donde se desea guardar los cambios.
                     * Este paso es importante para que las modificaciones hechas por el usuario no se pierdan y se
                     * reflejen adecuadamente en el archivo de datos, manteniendo así los registros actualizados.
                     */
                    gestion.guardarAlojamientosEnCSV(alojamientos, rutaDatosMalaga);
                    break;
                case 6:
                    // Mostramos el mensaje "Saliendo..." y finaliza el programa
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 6);

        scanner.close();
    }



}
