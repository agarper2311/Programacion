package com.es.programacion.Recuperacion.tema4.proyectoPokemon.utils;

import com.es.programacion.Recuperacion.tema4.proyectoPokemon.classes.Pokemon;
import com.es.programacion.Recuperacion.tema4.proyectoPokemon.classes.Tipo;

public class Pokedex {
    public static final String ANSI_BLUE = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";


    private static String[] tiposAceptados = {"Acero", "Agua", "Bicho", "Dragon", "Electrico", "Fantasma", "Fuego", "Hada", "Hielo", "Lucha", "Normal", "Planta", "Psíquico", "Roca", "Siniestro", "Tierra", "Veneno", "Volador"};


    /**
     * Constructor de la clase
     */


    /**
     * Métodos de clase
     */

    /**
     * @param tipoPokemon Nobre del tipo que se intenta comparar
     * @return true - si el tipo existe. false - si el tipo no existe
     */
    public static boolean checkTipoExiste(String tipoPokemon) {
        boolean pokemonExiste = false;
        for (int i = 0; i < tiposAceptados.length; i++) {

            if (tipoPokemon.equalsIgnoreCase(tiposAceptados[i])) {
                pokemonExiste = true;
            }
        }

        //Comprueba si el tipo existe dentro del array de tipoAceptados

        return pokemonExiste;
    }

    /**
     * @param tipoAtaque       Tipo que realiza el ataque
     * @param tipoRecibeAtaque tipo al que el ataque es afectado
     * @return (double) modificador del danio del ataque (1.5 muy efectivo, 1 normal, 0,5 poco efectivo, 0 inmune)
     */
    //Pokemon p
    public static double checkEfectividad(Tipo tipoAtaque, Tipo tipoRecibeAtaque, Pokemon p) {
        //Comprueba la efectividad del ataque entre dos tipos
        //Devuelve un modificador de danio (1.5, 1, 0.5 o 0)
        double resultado = 0.0;
        /**
         * Acero
         */
        if (tipoAtaque.nombre.equals("Acero")){
            if (tipoRecibeAtaque.nombre.equals("Acero")){
                return 0.5;
            }else if (tipoRecibeAtaque.nombre.equals("Agua")){
                return 0.5;
            }else if (tipoRecibeAtaque.nombre.equals("Bicho")){
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Dragon")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Electrico")) {
                return 0.5;
            } else if (tipoRecibeAtaque.nombre.equals("Fantasma")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Fuego")) {
                return 0.5;
            } else if (tipoRecibeAtaque.nombre.equals("Hada")) {
                return 1.5;
            } else if (tipoRecibeAtaque.nombre.equals("Hielo")) {
                return 1.5;
            } else if (tipoRecibeAtaque.nombre.equals("Lucha")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Normal")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Planta")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Psiquico")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Roca")) {
                return 1.5;
            } else if (tipoRecibeAtaque.nombre.equals("Siniestro")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Tierra")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Veneno")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Volador")) {
                return 1;
            }
        }
        //Agua
        if (tipoAtaque.nombre.equals("Agua")){
            if (tipoRecibeAtaque.nombre.equals("Acero")){
                return 1;
            }else if (tipoRecibeAtaque.nombre.equals("Agua")){
                return 0.5;
            }else if (tipoRecibeAtaque.nombre.equals("Bicho")){
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Dragon")) {
                return 0.5;
            } else if (tipoRecibeAtaque.nombre.equals("Electrico")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Fantasma")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Fuego")) {
                return 1.5;
            } else if (tipoRecibeAtaque.nombre.equals("Hada")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Hielo")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Lucha")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Normal")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Planta")) {
                return 0.5;
            } else if (tipoRecibeAtaque.nombre.equals("Psiquico")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Roca")) {
                return 1.5;
            } else if (tipoRecibeAtaque.nombre.equals("Siniestro")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Tierra")) {
                return 1.5;
            } else if (tipoRecibeAtaque.nombre.equals("Veneno")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Volador")) {
                return 1;
            }
        }
        //Bicho
        if (tipoAtaque.nombre.equals("Bicho")){
            if (tipoRecibeAtaque.nombre.equals("Acero")){
                return 0.5;
            }else if (tipoRecibeAtaque.nombre.equals("Agua")){
                return 1;
            }else if (tipoRecibeAtaque.nombre.equals("Bicho")){
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Dragon")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Electrico")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Fantasma")) {
                return 0.5;
            } else if (tipoRecibeAtaque.nombre.equals("Fuego")) {
                return 0.5;
            } else if (tipoRecibeAtaque.nombre.equals("Hada")) {
                return 0.5;
            } else if (tipoRecibeAtaque.nombre.equals("Hielo")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Lucha")) {
                return 0.5;
            } else if (tipoRecibeAtaque.nombre.equals("Normal")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Planta")) {
                return 1.5;
            } else if (tipoRecibeAtaque.nombre.equals("Psiquico")) {
                return 1.5;
            } else if (tipoRecibeAtaque.nombre.equals("Roca")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Siniestro")) {
                return 1.5;
            } else if (tipoRecibeAtaque.nombre.equals("Tierra")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Veneno")) {
                return 0.5;
            } else if (tipoRecibeAtaque.nombre.equals("Volador")) {
                return 0.5;
            }
        }

        //Dragon
        if (tipoAtaque.nombre.equals("Dragon")){
            if (tipoRecibeAtaque.nombre.equals("Acero")){
                return 0.5;
            }else if (tipoRecibeAtaque.nombre.equals("Agua")){
                return 1;
            }else if (tipoRecibeAtaque.nombre.equals("Bicho")){
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Dragon")) {
                return 1.5;
            } else if (tipoRecibeAtaque.nombre.equals("Electrico")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Fantasma")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Fuego")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Hada")) {
                return 0;
            } else if (tipoRecibeAtaque.nombre.equals("Hielo")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Lucha")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Normal")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Planta")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Psiquico")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Roca")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Siniestro")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Tierra")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Veneno")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Volador")) {
                return 1;
            }
        }
        //Electrico
        if (tipoAtaque.nombre.equals("Electrico")){
            if (tipoRecibeAtaque.nombre.equals("Acero")){
                return 1;
            }else if (tipoRecibeAtaque.nombre.equals("Agua")){
                return 1.5;
            }else if (tipoRecibeAtaque.nombre.equals("Bicho")){
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Dragon")) {
                return 0.5;
            } else if (tipoRecibeAtaque.nombre.equals("Electrico")) {
                return 0.5;
            } else if (tipoRecibeAtaque.nombre.equals("Fantasma")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Fuego")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Hada")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Hielo")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Lucha")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Normal")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Planta")) {
                return 0.5;
            } else if (tipoRecibeAtaque.nombre.equals("Psiquico")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Roca")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Siniestro")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Tierra")) {
                return 0;
            } else if (tipoRecibeAtaque.nombre.equals("Veneno")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Volador")) {
                return 1.5;
            }
        }
        //Fantasma
        if (tipoAtaque.nombre.equals("Fantasma")){
            if (tipoRecibeAtaque.nombre.equals("Acero")){
                return 1;
            }else if (tipoRecibeAtaque.nombre.equals("Agua")){
                return 1.5;
            }else if (tipoRecibeAtaque.nombre.equals("Bicho")){
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Dragon")) {
                return 0.5;
            } else if (tipoRecibeAtaque.nombre.equals("Electrico")) {
                return 0.5;
            } else if (tipoRecibeAtaque.nombre.equals("Fantasma")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Fuego")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Hada")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Hielo")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Lucha")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Normal")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Planta")) {
                return 0.5;
            } else if (tipoRecibeAtaque.nombre.equals("Psiquico")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Roca")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Siniestro")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Tierra")) {
                return 0;
            } else if (tipoRecibeAtaque.nombre.equals("Veneno")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Volador")) {
                return 1.5;
            }
        }
        //Fuego
        if (tipoAtaque.nombre.equals("Fuego")){
            if (tipoRecibeAtaque.nombre.equals("Acero")){
                return 1.5;
            }else if (tipoRecibeAtaque.nombre.equals("Agua")){
                return 0.5;
            }else if (tipoRecibeAtaque.nombre.equals("Bicho")){
                return 1.5;
            } else if (tipoRecibeAtaque.nombre.equals("Dragon")) {
                return 0.5;
            } else if (tipoRecibeAtaque.nombre.equals("Electrico")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Fantasma")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Fuego")) {
                return 0.5;
            } else if (tipoRecibeAtaque.nombre.equals("Hada")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Hielo")) {
                return 1.5;
            } else if (tipoRecibeAtaque.nombre.equals("Lucha")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Normal")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Planta")) {
                return 1.5;
            } else if (tipoRecibeAtaque.nombre.equals("Psiquico")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Roca")) {
                return 0.5;
            } else if (tipoRecibeAtaque.nombre.equals("Siniestro")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Tierra")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Veneno")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Volador")) {
                return 1;
            }
        }
        //Hada
        if (tipoAtaque.nombre.equals("Hada")){
            if (tipoRecibeAtaque.nombre.equals("Acero")){
                return 0.5;
            }else if (tipoRecibeAtaque.nombre.equals("Agua")){
                return 1;
            }else if (tipoRecibeAtaque.nombre.equals("Bicho")){
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Dragon")) {
                return 1.5;
            } else if (tipoRecibeAtaque.nombre.equals("Electrico")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Fantasma")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Fuego")) {
                return 0.5;
            } else if (tipoRecibeAtaque.nombre.equals("Hada")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Hielo")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Lucha")) {
                return 1.5;
            } else if (tipoRecibeAtaque.nombre.equals("Normal")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Planta")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Psiquico")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Roca")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Siniestro")) {
                return 1.5;
            } else if (tipoRecibeAtaque.nombre.equals("Tierra")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Veneno")) {
                return 0.5;
            } else if (tipoRecibeAtaque.nombre.equals("Volador")) {
                return 1;
            }
        }
        //Hielo
        if (tipoAtaque.nombre.equals("Hielo")){
            if (tipoRecibeAtaque.nombre.equals("Acero")){
                return 0.5;
            }else if (tipoRecibeAtaque.nombre.equals("Agua")){
                return 0.5;
            }else if (tipoRecibeAtaque.nombre.equals("Bicho")){
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Dragon")) {
                return 1.5;
            } else if (tipoRecibeAtaque.nombre.equals("Electrico")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Fantasma")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Fuego")) {
                return 0.5;
            } else if (tipoRecibeAtaque.nombre.equals("Hada")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Hielo")) {
                return 1.5;
            } else if (tipoRecibeAtaque.nombre.equals("Lucha")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Normal")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Planta")) {
                return 1.5;
            } else if (tipoRecibeAtaque.nombre.equals("Psiquico")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Roca")) {
                return 0.5;
            } else if (tipoRecibeAtaque.nombre.equals("Siniestro")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Tierra")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Veneno")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Volador")) {
                return 1;
            }
        }
        //Lucha
        if (tipoAtaque.nombre.equals("Lucha")){
            if (tipoRecibeAtaque.nombre.equals("Acero")){
                return 1.5;
            }else if (tipoRecibeAtaque.nombre.equals("Agua")){
                return 1;
            }else if (tipoRecibeAtaque.nombre.equals("Bicho")){
                return 0.5;
            } else if (tipoRecibeAtaque.nombre.equals("Dragon")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Electrico")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Fantasma")) {
                return 0;
            } else if (tipoRecibeAtaque.nombre.equals("Fuego")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Hada")) {
                return 0.5;
            } else if (tipoRecibeAtaque.nombre.equals("Hielo")) {
                return 1.5;
            } else if (tipoRecibeAtaque.nombre.equals("Lucha")) {
                return 1.5;
            } else if (tipoRecibeAtaque.nombre.equals("Normal")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Planta")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Psiquico")) {
                return 0.5;
            } else if (tipoRecibeAtaque.nombre.equals("Roca")) {
                return 1.5;
            } else if (tipoRecibeAtaque.nombre.equals("Siniestro")) {
                return 1.5;
            } else if (tipoRecibeAtaque.nombre.equals("Tierra")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Veneno")) {
                return 0.5;
            } else if (tipoRecibeAtaque.nombre.equals("Volador")) {
                return 0.5;
            }
        }
        //Normal
        if (tipoAtaque.nombre.equals("Normal")){
            if (tipoRecibeAtaque.nombre.equals("Acero")){
                return 0.5;
            }else if (tipoRecibeAtaque.nombre.equals("Agua")){
                return 1;
            }else if (tipoRecibeAtaque.nombre.equals("Bicho")){
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Dragon")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Electrico")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Fantasma")) {
                return 0;
            } else if (tipoRecibeAtaque.nombre.equals("Fuego")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Hada")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Hielo")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Lucha")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Normal")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Planta")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Psiquico")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Roca")) {
                return 0.5;
            } else if (tipoRecibeAtaque.nombre.equals("Siniestro")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Tierra")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Veneno")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Volador")) {
                return 1;
            }
        }
        //Planta
        if (tipoAtaque.nombre.equals("Planta")){
            if (tipoRecibeAtaque.nombre.equals("Acero")){
                return 0.5;
            }else if (tipoRecibeAtaque.nombre.equals("Agua")){
                return 1.5;
            }else if (tipoRecibeAtaque.nombre.equals("Bicho")){
                return 0.5;
            } else if (tipoRecibeAtaque.nombre.equals("Dragon")) {
                return 0.5;
            } else if (tipoRecibeAtaque.nombre.equals("Electrico")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Fantasma")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Fuego")) {
                return 0.5;
            } else if (tipoRecibeAtaque.nombre.equals("Hada")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Hielo")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Lucha")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Normal")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Planta")) {
                return 0.5;
            } else if (tipoRecibeAtaque.nombre.equals("Psiquico")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Roca")) {
                return 1.5;
            } else if (tipoRecibeAtaque.nombre.equals("Siniestro")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Tierra")) {
                return 1.5;
            } else if (tipoRecibeAtaque.nombre.equals("Veneno")) {
                return 0.5;
            } else if (tipoRecibeAtaque.nombre.equals("Volador")) {
                return 0.5;
            }
        }
        //Psiquico
        if (tipoAtaque.nombre.equals("Psiquico")){
            if (tipoRecibeAtaque.nombre.equals("Acero")){
                return 0.5;
            }else if (tipoRecibeAtaque.nombre.equals("Agua")){
                return 1;
            }else if (tipoRecibeAtaque.nombre.equals("Bicho")){
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Dragon")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Electrico")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Fantasma")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Fuego")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Hada")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Hielo")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Lucha")) {
                return 1.5;
            } else if (tipoRecibeAtaque.nombre.equals("Normal")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Planta")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Psiquico")) {
                return 0.5;
            } else if (tipoRecibeAtaque.nombre.equals("Roca")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Siniestro")) {
                return 0;
            } else if (tipoRecibeAtaque.nombre.equals("Tierra")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Veneno")) {
                return 1.5;
            } else if (tipoRecibeAtaque.nombre.equals("Volador")) {
                return 1;
            }
        }
        //Roca
        if (tipoAtaque.nombre.equals("Roca")){
            if (tipoRecibeAtaque.nombre.equals("Acero")){
                return 0.5;
            }else if (tipoRecibeAtaque.nombre.equals("Agua")){
                return 1;
            }else if (tipoRecibeAtaque.nombre.equals("Bicho")){
                return 1.5;
            } else if (tipoRecibeAtaque.nombre.equals("Dragon")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Electrico")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Fantasma")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Fuego")) {
                return 1.5;
            } else if (tipoRecibeAtaque.nombre.equals("Hada")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Hielo")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Lucha")) {
                return 1.5;
            } else if (tipoRecibeAtaque.nombre.equals("Normal")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Planta")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Psiquico")) {
                return 0.5;
            } else if (tipoRecibeAtaque.nombre.equals("Roca")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Siniestro")) {
                return 0;
            } else if (tipoRecibeAtaque.nombre.equals("Tierra")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Veneno")) {
                return 1.5;
            } else if (tipoRecibeAtaque.nombre.equals("Volador")) {
                return 1;
            }
        }
        //Siniestro
        if (tipoAtaque.nombre.equals("Siniestro")){
            if (tipoRecibeAtaque.nombre.equals("Acero")){
                return 1;
            }else if (tipoRecibeAtaque.nombre.equals("Agua")){
                return 1;
            }else if (tipoRecibeAtaque.nombre.equals("Bicho")){
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Dragon")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Electrico")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Fantasma")) {
                return 1.5;
            } else if (tipoRecibeAtaque.nombre.equals("Fuego")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Hada")) {
                return 0.5;
            } else if (tipoRecibeAtaque.nombre.equals("Hielo")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Lucha")) {
                return 1.5;
            } else if (tipoRecibeAtaque.nombre.equals("Normal")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Planta")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Psiquico")) {
                return 1.5;
            } else if (tipoRecibeAtaque.nombre.equals("Roca")) {
                return 0.5;
            } else if (tipoRecibeAtaque.nombre.equals("Siniestro")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Tierra")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Veneno")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Volador")) {
                return 1;
            }
        }
        //Tierra
        if (tipoAtaque.nombre.equals("Tierra")){
            if (tipoRecibeAtaque.nombre.equals("Acero")){
                return 1.5;
            }else if (tipoRecibeAtaque.nombre.equals("Agua")){
                return 1;
            }else if (tipoRecibeAtaque.nombre.equals("Bicho")){
                return 0.5;
            } else if (tipoRecibeAtaque.nombre.equals("Dragon")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Electrico")) {
                return 1.5;
            } else if (tipoRecibeAtaque.nombre.equals("Fantasma")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Fuego")) {
                return 1.5;
            } else if (tipoRecibeAtaque.nombre.equals("Hada")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Hielo")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Lucha")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Normal")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Planta")) {
                return 0.5;
            } else if (tipoRecibeAtaque.nombre.equals("Psiquico")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Roca")) {
                return 1.5;
            } else if (tipoRecibeAtaque.nombre.equals("Siniestro")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Tierra")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Veneno")) {
                return 1.5;
            } else if (tipoRecibeAtaque.nombre.equals("Volador")) {
                return 0;
            }
        }
        //Veneno
        if (tipoAtaque.nombre.equals("Veneno")){
            if (tipoRecibeAtaque.nombre.equals("Acero")){
                return 0;
            }else if (tipoRecibeAtaque.nombre.equals("Agua")){
                return 1;
            }else if (tipoRecibeAtaque.nombre.equals("Bicho")){
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Dragon")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Electrico")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Fantasma")) {
                return 1.5;
            } else if (tipoRecibeAtaque.nombre.equals("Fuego")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Hada")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Hielo")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Lucha")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Normal")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Planta")) {
                return 1.5;
            } else if (tipoRecibeAtaque.nombre.equals("Psiquico")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Roca")) {
                return 0.5;
            } else if (tipoRecibeAtaque.nombre.equals("Siniestro")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Tierra")) {
                return 0.5;
            } else if (tipoRecibeAtaque.nombre.equals("Veneno")) {
                return 0.5;
            } else if (tipoRecibeAtaque.nombre.equals("Volador")) {
                return 1;
            }
        }
        //Volador
        if (tipoAtaque.nombre.equals("Volador")){
            if (tipoRecibeAtaque.nombre.equals("Acero")){
                return 0.5;
            }else if (tipoRecibeAtaque.nombre.equals("Agua")){
                return 1;
            }else if (tipoRecibeAtaque.nombre.equals("Bicho")){
                return 1.5;
            } else if (tipoRecibeAtaque.nombre.equals("Dragon")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Electrico")) {
                return 0.5;
            } else if (tipoRecibeAtaque.nombre.equals("Fantasma")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Fuego")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Hada")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Hielo")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Lucha")) {
                return 1.5;
            } else if (tipoRecibeAtaque.nombre.equals("Normal")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Planta")) {
                return 1.5;
            } else if (tipoRecibeAtaque.nombre.equals("Psiquico")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Roca")) {
                return 0.5;
            } else if (tipoRecibeAtaque.nombre.equals("Siniestro")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Tierra")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Veneno")) {
                return 1;
            } else if (tipoRecibeAtaque.nombre.equals("Volador")) {
                return 1;
            }
        }

        return 0;

    }

}