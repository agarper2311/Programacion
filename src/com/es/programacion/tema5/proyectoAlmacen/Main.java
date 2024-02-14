package com.es.programacion.tema5.proyectoAlmacen;

import com.es.programacion.tema5.proyectoAlmacen.clases.Articulo;
import com.es.programacion.tema5.proyectoMRajoy.Persona;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // ARRAYLISTS
        // Declarando un arrayList de Strings
        ArrayList<String> nombres = new ArrayList<String>();
        // Para añadir un elemento al ArrayList se usa el método .add()
        nombres.add("Diego");   // 0
        nombres.add("Alfonso"); // 1
        nombres.add("Ana");     // 2
        nombres.add("Lucia");     // 3
        nombres.add("Alfredo");     // 4
        nombres.add("Maria");     // 5
        nombres.add("Jake");     // 6
        nombres.add("Adolfo");     // 7
        nombres.add("Francisco");     // 8
        nombres.add("Benito");     // 9

        System.out.println("Nombre: " + nombres.get(4)); // Debería imprimir Alfredo
        // En los ArrayList, podemos insertar elementos en la posición que queramos
        // El elemento que había en dicha posición NO SE ELIMINA, sino que se desplaza 1 posición.
        nombres.add(4, "Marcos");

        System.out.println("Nombre: " + nombres.get(4)); // Debería imprimir Marcos

        // Para cambiar el contenido de una posición se usa el método .set(posición, elemento)
        nombres.set(4, "Pablo");

        System.out.println("Nombre: " + nombres.get(4)); // Debería imprimir Pablo

        // Para acceder a un elemento del ArrayList se usa el método .get()
        System.out.println(nombres.get(0));
        System.out.println(nombres.get(nombres.size() - 1));

        // Para recorrer un ArrayList, se puede recorrer con un for normal igual que un array
        // En vez de poner .length (array) -> Ponemos .size() (ArrayList)
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println("Elem: " + nombres.get(i));
        }


        // Para buscar un elemento en un ArrayList, se utiliza el método .indexOf(elemento)
        // Devuelve un int -> Posición(index) en la que se encuentra el elemento
        // Devuelve -1 si no encuentra el elemento
        int posicionNombre = nombres.indexOf("Pablo");

        if (posicionNombre != -1) {
            System.out.println("El elemento se encuentra en la posicion: " + posicionNombre);
            System.out.println("El elemento es: " + nombres.get(posicionNombre));
        } else {
            System.out.println("El elemento no se encuentra en la lista");
        }

        // Ahora, vamos a contar cuántos pablos hay en la lista
        // No existe ningún método para contar el nº de elementos en un ArrayList
        // Lo tenemos que hacer de manera manual
        int contador = 0;
        for (int i = 0; i < nombres.size(); i++) {
            // Si el elemento en la posicion i es "Pablo", incremento el contador
            if (nombres.get(i).equals("Pablo")) {
                contador++;
            }
        }
        System.out.println("Hay " + contador + " Pablo(s)");


        // Listas de Objetos
        // La lista nombres2 va a almacenar "cosas" de tipo String
        ArrayList<String> nombres2 = new ArrayList<String>();
        // La lista articulos va a almacenar objetos("cosas") de tipo Articulo
        ArrayList<Articulo> articulos = new ArrayList<Articulo>();
        // La lista personas va a almacenar objetos de tipo Persona
        ArrayList<Persona> personas = new ArrayList<Persona>();

        Articulo raqueta = new Articulo("Raqueta de tenis", 150, 200, "G");
        Articulo pelota = new Articulo("Pelota de rugby", 50, 0, "G");
        Articulo pan = new Articulo("Pan", 1, 100, "SR");
        Articulo calcetines = new Articulo("calcetines", 8.0, 200, "G");
        Articulo camiseta = new Articulo("Camiseta", 15.0, 1000, "G");
        Articulo ibuprofeno = new Articulo("Ibuprofeno", 8.0, 100000, "SR");
        Articulo pelotaBasket = new Articulo("Pelota basket", 65.8, 78, "G");
        Articulo zapatos_futbol = new Articulo("Zapatos Futbol Sala", 120, 40, "G");
        Articulo guantes = new Articulo("Guantes Portero", 30.2, 90, "G");
        Articulo nevera = new Articulo("Nevera", 100, 40, "G");
        Articulo sandia = new Articulo("Sandía", 3.99, 20, "SR");
        Articulo sandalias = new Articulo("Sandalias", 7.99, 50, "G");
        Articulo vestido = new Articulo("Estampado", 50, 150, "G");
        Articulo libro = new Articulo("Programacion", 70, 350, "G");
        Articulo estuche = new Articulo("Estuche Maquillaje", 25, 300, "G");
        Articulo chandal = new Articulo("Chandal nike uapo uapo", 200, 100, "G");
        Articulo vape = new Articulo("Vape de contrabando", 10, 10, "G");
        Articulo barcelo = new Articulo("Ron semibarato", 14, 1, "G");

        // Añadir todos los objetos al ArrayList articulos
        articulos.add(raqueta);
        articulos.add(pelota);
        articulos.add(pan);
        articulos.add(calcetines);
        articulos.add(camiseta);
        articulos.add(ibuprofeno);
        articulos.add(pelotaBasket);
        articulos.add(zapatos_futbol);
        articulos.add(guantes);
        articulos.add(nevera);
        articulos.add(sandia);
        articulos.add(sandalias);
        articulos.add(vestido);
        articulos.add(libro);
        articulos.add(estuche);
        articulos.add(chandal);
        articulos.add(vape);
        articulos.add(barcelo);


        // Un pequeño programa que muestre por pantalla:
        // - Los artículos cuyo stock (cuantosQuedan) sea <= 0
        // - Los artículos cuyo stock esté apunto de acabarse (stock <= 10)

        // Recorreis el ArrayList y ponéis dentro las condiciones que se os piden (x2)
        // For normal

        System.out.println("Articulos sin stock: ¡COMPRAR MAS!"); // Sout informativo
        for(int i=0; i<articulos.size(); i++) { // Recorro el ArrayList articulos
            if(articulos.get(i).getCuantosQuedan() <= 0) { // Para cada uno de los articulos, hago una condicion
                System.out.println(articulos.get(i).getNombre()); // Imprimo por pantalla el nombre del articulo
            }
        }


        System.out.println("Articulos apunto de agotarse:"); // Sout informativo
        for(int i=0; i<articulos.size(); i++) { // Recorro el ArrayList articulos
            if(articulos.get(i).getCuantosQuedan() <= 10) { // Para cada uno de los articulos, hago una condicion
                System.out.println(articulos.get(i).getNombre()); // Imprimo por pantalla el nombre del articulo
            }
        }

        // Foreach
        /*
        System.out.println("Productos sin stock:");
        for(Articulo articulo : articulos) {
            if(articulo.getCuantosQuedan()<=0) {
                System.out.println(articulo.getNombre());
            }
        }

        System.out.println("Productos apunto de acabarse:");
        for(Articulo articulo : articulos) {
            if(articulo.getCuantosQuedan()<=10) {
                System.out.println(articulo.getNombre());
            }
        }
        */


        // Pequeño menú para hacer diferentes operaciones con los artículos
        /*
        Menú Articulo
        1. Contar cuántos artículos hay con stock <= 0
        2. Contar cuántos artículos hay de tipo SR
        3. Contar cuántos artículos hay con un precio menor que 100€
        4. Decir cuál es el artículo con mayor precio
        5. Decir cuál es el artículo con menor precio
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("""
                Menú Articulo
                1. Contar cuántos artículos hay con stock <= 0
                2. Contar cuántos artículos hay de tipo SR
                3. Contar cuántos artículos hay con un precio menor que 100€
                4. Decir cuál es el artículo con mayor precio
                5. Decir cuál es el artículo con menor precio
                """);
        System.out.println("Indique la opción deseada: ");
        int opc;
        try  {
            opc = scan.nextInt();
            int cont = 0;
            switch (opc){
                case 1:
                    // Logica de la opcion 1
                    cont = 0;
                    for(int i=0; i<articulos.size(); i++) { // Recorro el ArrayList articulos
                        if(articulos.get(i).getCuantosQuedan() <= 0) { // Para cada uno de los articulos, hago una condicion
                            cont++;
                        }
                    }
                    System.out.println("Hay "+cont+" sin stock");
                    break;
                case 2:
                    // Logica de la opcion 2
                    cont = 0;
                    for(int i=0; i<articulos.size(); i++) { // Recorro el ArrayList articulos
                        if(articulos.get(i).getTipo().equals("SR")) { // Para cada uno de los articulos, hago una condicion
                            cont++;
                        }
                    }
                    System.out.println("Hay "+cont+" artículos de tipo Super Reducido");
                    break;
                case 3:
                    // Logica de la opcion 3
                    cont = 0;
                    for(int i=0; i<articulos.size(); i++) { // Recorro el ArrayList articulos
                        if(articulos.get(i).getPrecio() <=100) { // Para cada uno de los articulos, hago una condicion
                            cont++;
                        }
                    }
                    System.out.println("Hay "+cont+" artículos con un precio menor que 100€");
                    break;
                case 4:
                    // Logica de la opcion 4
                    if (articulos.size()>0) {
                        Articulo mayor = articulos.get(0);
                        for(int i=0; i<articulos.size(); i++) { // Recorro el ArrayList articulos
                            if(articulos.get(i).getPrecio() > mayor.getPrecio()) { // Para cada uno de los articulos, hago una condicion
                                mayor = articulos.get(i);
                            }
                        }
                        System.out.println("El producto con un precio mayor es: "+mayor.getNombre()+" con un precio de "+mayor.getPrecio()+"€");
                    } else {
                        System.out.println("No hay artículos para comparar");
                    }


                    break;
                case 5:
                    // Logica de la opcion 5
                    if (articulos.size()>0) {
                        Articulo menor = articulos.get(0);
                        for(int i=0; i<articulos.size(); i++) { // Recorro el ArrayList articulos
                            if(articulos.get(i).getPrecio() < menor.getPrecio()) { // Para cada uno de los articulos, hago una condicion
                                menor = articulos.get(i);
                            }
                        }
                        System.out.println("El producto con un precio menor es: "+menor.getNombre()+" con un precio de "+menor.getPrecio()+"€");
                    } else {
                        System.out.println("No hay artículos para comparar");
                    }
                    break;
                default:
                    System.out.println("Opcion no reconocida");
                    break;
            }

        } catch (Exception e) {
            System.out.println("Error en la opcion... eliminando todos sus archivos");
        }









        /*
        Vamos a crear 1 ArrayList de Articulos.

        Creamos 10 Articulos y los añadimos al ArrayList

        Hacemos operaciones sobre ese ArrayList

        1. Contar cuántos artículos hay con stock > 0
        2. Contar cuántos artículos hay de tipo SR
        3. Contar cuántos artículos hay con un precio menor que 100€
        4. Decir cuál es el artículo con mayor precio
        5. Decir cuál es el artículo con menor precio

         */













        /*
        Actividad para practicar con ArrayLists
        Voy a crear como 10 artículos

        Luego, creamos una clase Almacen, que tenga Articulos
        - cif: String
        - nombre: String
        - articulos: List<Articulo>
        + anadirArticulo(articulo: Articulo): boolean
        + venderArticulo(articulo: Articulo, cantidad: int): boolean
        + consultarStock(): int

        // En en main, vamos a hacer un pequeño menu para añadir articulos al almacen

        Menu Almacen
        1. Adquirir articulo
        2. Vender articulo
        3. Consultar stock
        0. Salir

         */


    }
}
