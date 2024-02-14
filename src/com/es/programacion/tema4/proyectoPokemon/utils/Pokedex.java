package com.es.programacion.tema4.proyectoPokemon.utils;

import com.es.programacion.tema4.proyectoPokemon.clases.Tipo;

//          JUAN MANUEL SABORIDO BAENA      1ºDAW

public class Pokedex {
    private static String[] tiposAceptados_ = {"Acero", "Agua", "Bicho", "Dragon", "Electrico", "Fantasma",
            "Fuego", "Hada", "Hielo", "Lucha", "Normal", "Planta", "Psiquico", "Roca", "Siniestro", "Tierra", "Veneno", "Volador"};

    Pokedex(String tiposAceptados[]) {
        tiposAceptados_ = tiposAceptados;

    }

    public static boolean checkTipoExiste(String nombre) {  //  String nombre se refiere al nombre de Tipo
        for (int i = 0; i < tiposAceptados_.length; i++) {
            if (nombre.equals(tiposAceptados_[i])) {
                return true;

            }
        }
        return false;

    }
    /**
     *
     * @param tipoAtaque tipo que realiza el ataque
     * @param tipoRecibeAtaque tipo que recibe el ataque
     * @return (double) modificador del danio del ataque (1.5 muy efectivo, 1 normal, 0.5 poco efectivo, 0 inmune)
     */
    public static double checkEfectividad(Tipo tipoAtaque, Tipo tipoRecibeAtaque) { //La efectividad devolverá un daño especial que se le multiplicará con el daño normal del ataque
        if (tipoAtaque.nombre_.equals("Acero")) {
            if (tipoRecibeAtaque.nombre_.equals("Acero")) {
                return 0.5;
            }
            if (tipoRecibeAtaque.nombre_.equals("Agua")) {
                return 0.5;
            }
            if (tipoRecibeAtaque.nombre_.equals("Electrico")) {
                return 0.5;
            }
            if (tipoRecibeAtaque.nombre_.equals("Fuego")) {
                return 1;
            }
            if (tipoRecibeAtaque.nombre_.equals("Lucha")) {
                return 1.5;
            }
            if (tipoRecibeAtaque.nombre_.equals("Tierra")) {
                return 1.5;
            }
        }
        if (tipoAtaque.nombre_.equals("Agua")) {
            if (tipoRecibeAtaque.nombre_.equals("Agua")) {
                return 0.5;
            }
            if (tipoRecibeAtaque.nombre_.equals("Dragon")) {
                return 0.5;
            }
            if (tipoRecibeAtaque.nombre_.equals("Lucha")) {
                return 1;
            }
            if (tipoRecibeAtaque.nombre_.equals("Normal")) {
                return 1;
            }
            if (tipoRecibeAtaque.nombre_.equals("Planta")) {
                return 1.5;
            }
            if (tipoRecibeAtaque.nombre_.equals("Electrico")) {
                return 1.5;
            }
            if (tipoRecibeAtaque.nombre_.equals("Fuego")) {
                return 1.5;
            }
        }
        if (tipoAtaque.nombre_.equals("Bicho")) {
            if (tipoRecibeAtaque.nombre_.equals("Acero")) {
                return 0.5;
            }
            if (tipoRecibeAtaque.nombre_.equals("Fuego")) {
                return 1.5;
            }
            if (tipoRecibeAtaque.nombre_.equals("Hada")) {
                return 0.5;
            }
            if (tipoRecibeAtaque.nombre_.equals("Fantasma")) {
                return 0.5;
            }
            if (tipoRecibeAtaque.nombre_.equals("Lucha")) {
                return 0.5;
            }
            if (tipoRecibeAtaque.nombre_.equals("Veneno")) {
                return 0.5;
            }
            if (tipoRecibeAtaque.nombre_.equals("Volador")) {
                return 1.5;
            }
            if (tipoRecibeAtaque.nombre_.equals("Roca")) {
                return 1.5;
            }

        }
        if (tipoAtaque.nombre_.equals("Dragon")) {
            if (tipoRecibeAtaque.nombre_.equals("Acero")) {
                return 0.5;
            }
            if (tipoRecibeAtaque.nombre_.equals("Hada")) {
                return 1;
            }
            if (tipoRecibeAtaque.nombre_.equals("Hielo")) {
                return 1.5;
            }
        }
        if (tipoAtaque.nombre_.equals("Electrico")) {
            if (tipoRecibeAtaque.nombre_.equals("Dragon")) {
                return 0.5;
            }
            if (tipoRecibeAtaque.nombre_.equals("Fuego")) {
                return 0.5;
            }
            if (tipoRecibeAtaque.nombre_.equals("Electrico")) {
                return 1;
            }
            if (tipoRecibeAtaque.nombre_.equals("Lucha")) {
                return 0.5;
            }
            if (tipoRecibeAtaque.nombre_.equals("Eletrico")) {
                return 0.5;
            }
            if (tipoRecibeAtaque.nombre_.equals("Planta")) {
                return 0.5;
            }
            if (tipoRecibeAtaque.nombre_.equals("Tierra")) {
                return 1.5;
            }
        }
        if (tipoAtaque.nombre_.equals("Fantasma")) {
            if (tipoRecibeAtaque.nombre_.equals("Siniestro")) {
                return 1.5;
            }
            if (tipoRecibeAtaque.nombre_.equals("Fantasma")) {
                return 1.5;
            }
            if (tipoRecibeAtaque.nombre_.equals("Normal")) {
                return 1;
            }
        }
        if (tipoAtaque.nombre_.equals("Fuego")) {
            if (tipoRecibeAtaque.nombre_.equals("Dragon")) {
                return 0.5;
            }
            if (tipoRecibeAtaque.nombre_.equals("Fuego")) {
                return 0.5;
            }
            if (tipoRecibeAtaque.nombre_.equals("Electrico")) {
                return 1;
            }
            if (tipoRecibeAtaque.nombre_.equals("Roca")) {
                return 1.5;
            }
            if (tipoRecibeAtaque.nombre_.equals("Agua")) {
                return 1.5;
            }
            if (tipoRecibeAtaque.nombre_.equals("Tierra")) {
                return 1.5;
            }
        }
        if (tipoAtaque.nombre_.equals("Hada")) {
            if (tipoRecibeAtaque.nombre_.equals("Acero")) {
                return 1.5;
            }
            if (tipoRecibeAtaque.nombre_.equals("Fuego")) {
                return 0.5;
            }
            if (tipoRecibeAtaque.nombre_.equals("Veneno")) {
                return 1.5;
            }
        }
        if (tipoAtaque.nombre_.equals("Hielo")) {
            if (tipoRecibeAtaque.nombre_.equals("Hielo")) {
                return 0.5;
            }
            if (tipoRecibeAtaque.nombre_.equals("Agua")) {
                return 0.5;
            }
            if (tipoRecibeAtaque.nombre_.equals("Fuego")) {
                return 1.5;
            }
            if (tipoRecibeAtaque.nombre_.equals("Lucha")) {
                return 1.5;
            }
            if (tipoRecibeAtaque.nombre_.equals("Roca")) {
                return 1.5;
            }
        }
        if (tipoAtaque.nombre_.equals("Lucha")) {
            if (tipoRecibeAtaque.nombre_.equals("Bicho")) {
                return 0.5;
            }
            if (tipoRecibeAtaque.nombre_.equals("Veneno")) {
                return 0.5;
            }
            if (tipoRecibeAtaque.nombre_.equals("Fantasma")) {
                return 1;
            }
            if (tipoRecibeAtaque.nombre_.equals("Normal")) {
                return 1;
            }
            if (tipoRecibeAtaque.nombre_.equals("Hada")) {
                return 1.5;
            }
            if (tipoRecibeAtaque.nombre_.equals("Psiquico")) {
                return 1.5;
            }
            if (tipoRecibeAtaque.nombre_.equals("Volador")) {
                return 1.5;
            }
        }
        if (tipoAtaque.nombre_.equals("Normal")) {
            if (tipoRecibeAtaque.nombre_.equals("Acero")) {
                return 0.5;
            }
            if (tipoRecibeAtaque.nombre_.equals("Roca")) {
                return 0.5;
            }
            if (tipoRecibeAtaque.nombre_.equals("Fantasma")) {
                return 1;
            }
            if (tipoRecibeAtaque.nombre_.equals("Planta")) {
                return 1;
            }
            if (tipoRecibeAtaque.nombre_.equals("Lucha")) {
                return 1.5;
            }
        }
        if (tipoAtaque.nombre_.equals("Planta")) {
            if (tipoRecibeAtaque.nombre_.equals("Acero")) {
                return 0.5;
            }
            if (tipoRecibeAtaque.nombre_.equals("Bicho")) {
                return 1.5;
            }
            if (tipoRecibeAtaque.nombre_.equals("Dragon")) {
                return 0.5;
            }
            if (tipoRecibeAtaque.nombre_.equals("Fuego")) {
                return 1.5;
            }
            if (tipoRecibeAtaque.nombre_.equals("Normal")) {
                return 1;
            }
            if (tipoRecibeAtaque.nombre_.equals("Planta")) {
                return 0.5;
            }
            if (tipoRecibeAtaque.nombre_.equals("Hielo")) {
                return 1.5;
            }
            if (tipoRecibeAtaque.nombre_.equals("Volador")) {
                return 1.5;
            }
        }
        if (tipoAtaque.nombre_.equals("Psiquico")) {
            if (tipoRecibeAtaque.nombre_.equals("Acero")) {
                return 0.5;
            }
            if (tipoRecibeAtaque.nombre_.equals("Psiquico")) {
                return 0.5;
            }
            if (tipoRecibeAtaque.nombre_.equals("Siniestro")) {
                return 1;
            }
            if (tipoRecibeAtaque.nombre_.equals("Bicho")) {
                return 1.5;
            }
            if (tipoRecibeAtaque.nombre_.equals("Fantasma")) {
                return 1.5;
            }
        }
        if (tipoAtaque.nombre_.equals("Roca")) {
            if (tipoRecibeAtaque.nombre_.equals("Acero")) {
                return 0.5;
            }
            if (tipoRecibeAtaque.nombre_.equals("Lucha")) {
                return 1.5;
            }
            if (tipoRecibeAtaque.nombre_.equals("Siniestro")) {
                return 0.5;
            }
            if (tipoRecibeAtaque.nombre_.equals("Fantasma")) {
                return 0.5;
            }
            if (tipoRecibeAtaque.nombre_.equals("Agua")) {
                return 1.5;
            }
            if (tipoRecibeAtaque.nombre_.equals("Planta")) {
                return 1.5;
            }
        }
        if (tipoAtaque.nombre_.equals("Siniestro")) {
            if (tipoRecibeAtaque.nombre_.equals("Acero")) {
                return 0.5;
            }
            if (tipoRecibeAtaque.nombre_.equals("Siniestro")) {
                return 0.5;
            }
            if (tipoRecibeAtaque.nombre_.equals("Lucha")) {
                return 1.5;
            }
            if (tipoRecibeAtaque.nombre_.equals("Bicho")) {
                return 1.5;
            }
        }
        if (tipoAtaque.nombre_.equals("Tierra")) {
            if (tipoRecibeAtaque.nombre_.equals("Planta")) {
                return 1.5;
            }
            if (tipoRecibeAtaque.nombre_.equals("Bicho")) {
                return 0.5;
            }
            if (tipoRecibeAtaque.nombre_.equals("Volador")) {
                return 1;
            }
            if (tipoRecibeAtaque.nombre_.equals("Agua")) {
                return 1.5;
            }
            if (tipoRecibeAtaque.nombre_.equals("Hielo")) {
                return 1.5;
            }
        }
        if (tipoAtaque.nombre_.equals("Veneno")) {
            if (tipoRecibeAtaque.nombre_.equals("Fantasma")) {
                return 0.5;
            }
            if (tipoRecibeAtaque.nombre_.equals("Veneno")) {
                return 0.5;
            }
            if (tipoRecibeAtaque.nombre_.equals("Roca")) {
                return 0.5;
            }
            if (tipoRecibeAtaque.nombre_.equals("Acero")) {
                return 1;
            }
            if (tipoRecibeAtaque.nombre_.equals("Psiquico")) {
                return 1.5;
            }
            if (tipoRecibeAtaque.nombre_.equals("Tierra")) {
                return 1.5;
            }
        }
        if (tipoAtaque.nombre_.equals("Volador")) {
            if (tipoRecibeAtaque.nombre_.equals("Acero")) {
                return 0.5;
            }
            if (tipoRecibeAtaque.nombre_.equals("Electrico")) {
                return 1.5;
            }
            if (tipoRecibeAtaque.nombre_.equals("Roca")) {
                return 1.5;
            }
            if (tipoRecibeAtaque.nombre_.equals("Hielo")) {
                return 1.5;
            }
        }
        return 0;
    }

}

