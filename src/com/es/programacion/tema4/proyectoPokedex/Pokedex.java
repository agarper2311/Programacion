package com.es.programacion.tema4.proyectoPokedex;

public class Pokedex {
    // ATRIBUTOS DE CLASE
    private String[] tipos = {
            Tipo.ACERO.getTipo(),
            Tipo.AGUA.getTipo(),
            Tipo.BICHO.getTipo(),
            Tipo.DRAGON.getTipo(),
            Tipo.ELECTRICO.getTipo(),
            Tipo.FANTASMA.getTipo(),
            Tipo.FUEGO.getTipo(),
            Tipo.HADA.getTipo(),
            Tipo.HIELO.getTipo(),
            Tipo.LUCHA.getTipo(),
            Tipo.NORMAL.getTipo(),
            Tipo.PLANTA.getTipo(),
            Tipo.PSIQUICO.getTipo(),
            Tipo.ROCA.getTipo(),
            Tipo.SINIESTRO.getTipo(),
            Tipo.TIERRA.getTipo(),
            Tipo.VENENO.getTipo(),
            Tipo.VOLADOR.getTipo(),
    };

    private String[] pokemons = {"Pikachu", "Bulbasaur", "Charmander", "Squirtle"};


    // METODOS DE CLASE
    // Metodo checkPokemon

    /**
     * Método que comprueba si un pokemon dado se encuentra en el array [pokemons]
     * @param pok (String) pokemon a comprobar en el array
     * @return true si está, false si no está
     */
    public boolean checkPokemon(String pok) {
        for(int i=0; i<=pokemons.length-1; i++) {
            if(pok.equals(pokemons[i])){
                return true;
            }
        }
        return false;
    }


    // Metodo checkEfectividad
    public double checkEfectividad(String tipoAtacante, String tipoRecibeAtaque){

        double multiplicador = 1.0;
        if(tipoAtacante.equals(Tipo.ACERO.getTipo())) {

            if(tipoRecibeAtaque.equals(Tipo.HADA.getTipo()) || tipoRecibeAtaque.equals(Tipo.HIELO.getTipo()) || tipoRecibeAtaque.equals(Tipo.ROCA.getTipo())){
                multiplicador = 1.5;
            } else if(tipoRecibeAtaque.equals(Tipo.ACERO.getTipo()) || tipoRecibeAtaque.equals(Tipo.AGUA.getTipo()) || tipoRecibeAtaque.equals(Tipo.ELECTRICO.getTipo()) || tipoRecibeAtaque.equals(Tipo.FUEGO.getTipo())) {
                multiplicador = 0.5;
            }

        } else if(tipoAtacante.equals(Tipo.AGUA.getTipo())) {

            if(tipoRecibeAtaque.equals(Tipo.FUEGO.getTipo()) || tipoRecibeAtaque.equals(Tipo.ROCA.getTipo()) || tipoRecibeAtaque.equals(Tipo.TIERRA.getTipo())){
                multiplicador = 1.5;
            } else if(tipoRecibeAtaque.equals(Tipo.AGUA.getTipo()) || tipoRecibeAtaque.equals(Tipo.DRAGON.getTipo()) || tipoRecibeAtaque.equals(Tipo.PLANTA.getTipo())) {
                multiplicador = 0.5;
            }

        } else if(tipoAtacante.equals(Tipo.BICHO.getTipo())) {

            if(tipoRecibeAtaque.equals(Tipo.PLANTA.getTipo()) || tipoRecibeAtaque.equals(Tipo.PSIQUICO.getTipo()) || tipoRecibeAtaque.equals(Tipo.SINIESTRO.getTipo())){
                multiplicador = 1.5;
            } else if(tipoRecibeAtaque.equals(Tipo.ACERO.getTipo()) || tipoRecibeAtaque.equals(Tipo.FANTASMA.getTipo()) || tipoRecibeAtaque.equals(Tipo.FUEGO.getTipo()) || tipoRecibeAtaque.equals(Tipo.HADA.getTipo()) || tipoRecibeAtaque.equals(Tipo.LUCHA.getTipo()) || tipoRecibeAtaque.equals(Tipo.VOLADOR.getTipo()) || tipoRecibeAtaque.equals(Tipo.VENENO.getTipo())) {
                multiplicador = 0.5;
            }

        } else if(tipoAtacante.equals(Tipo.DRAGON.getTipo())) {

            if(tipoRecibeAtaque.equals(Tipo.DRAGON.getTipo())){
                multiplicador = 1.5;
            } else if(tipoRecibeAtaque.equals(Tipo.ACERO.getTipo())) {
                multiplicador = 0.5;
            } else if(tipoRecibeAtaque.equals(Tipo.HADA.getTipo())) {
                multiplicador = 0.0;
            }

        } else if(tipoAtacante.equals(Tipo.ELECTRICO.getTipo())) {

            if(tipoRecibeAtaque.equals(Tipo.AGUA.getTipo()) || tipoRecibeAtaque.equals(Tipo.VOLADOR.getTipo()) ){
                multiplicador = 1.5;
            } else if(tipoRecibeAtaque.equals(Tipo.DRAGON.getTipo()) || tipoRecibeAtaque.equals(Tipo.ELECTRICO.getTipo()) || tipoRecibeAtaque.equals(Tipo.PLANTA.getTipo())) {
                multiplicador = 0.5;
            } else if(tipoRecibeAtaque.equals(Tipo.TIERRA.getTipo())) {
                multiplicador = 0.0;
            }

        } else if(tipoAtacante.equals(Tipo.FANTASMA.getTipo())) {

            if(tipoRecibeAtaque.equals(Tipo.FANTASMA.getTipo()) || tipoRecibeAtaque.equals(Tipo.VOLADOR.getTipo())){
                multiplicador = 1.5;
            } else if(tipoRecibeAtaque.equals(Tipo.NORMAL.getTipo()) || tipoRecibeAtaque.equals(Tipo.SINIESTRO.getTipo())) {
                multiplicador = 0.5;
            }

        } else if(tipoAtacante.equals(Tipo.FUEGO.getTipo())) {

            if(tipoRecibeAtaque.equals(Tipo.ACERO.getTipo()) || tipoRecibeAtaque.equals(Tipo.BICHO.getTipo()) || tipoRecibeAtaque.equals(Tipo.HIELO.getTipo()) || tipoRecibeAtaque.equals(Tipo.PLANTA.getTipo())){
                multiplicador = 1.5;
            } else if(tipoRecibeAtaque.equals(Tipo.AGUA.getTipo()) || tipoRecibeAtaque.equals(Tipo.DRAGON.getTipo()) || tipoRecibeAtaque.equals(Tipo.FUEGO.getTipo()) || tipoRecibeAtaque.equals(Tipo.ROCA.getTipo())) {
                multiplicador = 0.5;
            }

        } else if(tipoAtacante.equals(Tipo.HADA.getTipo())) {

            if(tipoRecibeAtaque.equals(Tipo.DRAGON.getTipo()) || tipoRecibeAtaque.equals(Tipo.LUCHA.getTipo()) || tipoRecibeAtaque.equals(Tipo.SINIESTRO.getTipo())){
                multiplicador = 1.5;
            } else if(tipoRecibeAtaque.equals(Tipo.ACERO.getTipo()) || tipoRecibeAtaque.equals(Tipo.FUEGO.getTipo()) || tipoRecibeAtaque.equals(Tipo.VENENO.getTipo())) {
                multiplicador = 0.5;
            }

        } else if(tipoAtacante.equals(Tipo.HIELO.getTipo())) {

            if(tipoRecibeAtaque.equals(Tipo.DRAGON.getTipo()) || tipoRecibeAtaque.equals(Tipo.PLANTA.getTipo()) || tipoRecibeAtaque.equals(Tipo.TIERRA.getTipo()) || tipoRecibeAtaque.equals(Tipo.VOLADOR.getTipo())){
                multiplicador = 1.5;
            } else if(tipoRecibeAtaque.equals(Tipo.ACERO.getTipo()) || tipoRecibeAtaque.equals(Tipo.AGUA.getTipo()) || tipoRecibeAtaque.equals(Tipo.FUEGO.getTipo()) || tipoRecibeAtaque.equals(Tipo.HIELO.getTipo())) {
                multiplicador = 0.5;
            }

        } else if(tipoAtacante.equals(Tipo.LUCHA.getTipo())) {

            if(tipoRecibeAtaque.equals(Tipo.NORMAL.getTipo())){
                multiplicador = 1.5;
            } else if(tipoRecibeAtaque.equals(Tipo.BICHO.getTipo()) || tipoRecibeAtaque.equals(Tipo.HADA.getTipo()) || tipoRecibeAtaque.equals(Tipo.PSIQUICO.getTipo()) || tipoRecibeAtaque.equals(Tipo.VENENO.getTipo()) || tipoRecibeAtaque.equals(Tipo.VOLADOR.getTipo())) {
                multiplicador = 0.5;
            } else if(tipoRecibeAtaque.equals(Tipo.FANTASMA.getTipo())) {
                multiplicador = 0.0;
            }

        } else if(tipoAtacante.equals(Tipo.NORMAL.getTipo())) {

            if(tipoRecibeAtaque.equals(Tipo.ACERO.getTipo()) || tipoRecibeAtaque.equals(Tipo.ROCA.getTipo())) {
                multiplicador = 0.5;
            }  else if(tipoRecibeAtaque.equals(Tipo.FANTASMA.getTipo())) {
                multiplicador = 0.0;
            }

        } else if(tipoAtacante.equals(Tipo.PLANTA.getTipo())) {

            if(tipoRecibeAtaque.equals(Tipo.AGUA.getTipo()) || tipoRecibeAtaque.equals(Tipo.ROCA.getTipo()) || tipoRecibeAtaque.equals(Tipo.TIERRA.getTipo())){
                multiplicador = 1.5;
            } else if(tipoRecibeAtaque.equals(Tipo.ACERO.getTipo()) || tipoRecibeAtaque.equals(Tipo.BICHO.getTipo()) || tipoRecibeAtaque.equals(Tipo.DRAGON.getTipo()) || tipoRecibeAtaque.equals(Tipo.FUEGO.getTipo()) || tipoRecibeAtaque.equals(Tipo.PLANTA.getTipo()) || tipoRecibeAtaque.equals(Tipo.VENENO.getTipo()) || tipoRecibeAtaque.equals(Tipo.VOLADOR.getTipo())) {
                multiplicador = 0.5;
            }

        } else if(tipoAtacante.equals(Tipo.PSIQUICO.getTipo())) {

            if(tipoRecibeAtaque.equals(Tipo.LUCHA.getTipo()) || tipoRecibeAtaque.equals(Tipo.VENENO.getTipo())){
                multiplicador = 1.5;
            } else if(tipoRecibeAtaque.equals(Tipo.ACERO.getTipo()) || tipoRecibeAtaque.equals(Tipo.PSIQUICO.getTipo())) {
                multiplicador = 0.5;
            } else if(tipoRecibeAtaque.equals(Tipo.SINIESTRO.getTipo())) {
                multiplicador = 0.0;
            }

        } else if(tipoAtacante.equals(Tipo.ROCA.getTipo())) {

            if(tipoRecibeAtaque.equals(Tipo.BICHO.getTipo()) || tipoRecibeAtaque.equals(Tipo.FUEGO.getTipo()) || tipoRecibeAtaque.equals(Tipo.HIELO.getTipo()) || tipoRecibeAtaque.equals(Tipo.VOLADOR.getTipo()) ){
                multiplicador = 1.5;
            } else if(tipoRecibeAtaque.equals(Tipo.ACERO.getTipo()) || tipoRecibeAtaque.equals(Tipo.LUCHA.getTipo()) || tipoRecibeAtaque.equals(Tipo.TIERRA.getTipo())) {
                multiplicador = 0.5;
            }

        } else if(tipoAtacante.equals(Tipo.SINIESTRO.getTipo())) {

            if(tipoRecibeAtaque.equals(Tipo.FANTASMA.getTipo()) || tipoRecibeAtaque.equals(Tipo.PSIQUICO.getTipo())){
                multiplicador = 1.5;
            } else if(tipoRecibeAtaque.equals(Tipo.HADA.getTipo()) || tipoRecibeAtaque.equals(Tipo.LUCHA.getTipo()) || tipoRecibeAtaque.equals(Tipo.SINIESTRO.getTipo())) {
                multiplicador = 0.5;
            }

        } else if(tipoAtacante.equals(Tipo.TIERRA.getTipo())) {

            if(tipoRecibeAtaque.equals(Tipo.ACERO.getTipo()) || tipoRecibeAtaque.equals(Tipo.ELECTRICO.getTipo()) || tipoRecibeAtaque.equals(Tipo.FUEGO.getTipo()) || tipoRecibeAtaque.equals(Tipo.ROCA.getTipo()) || tipoRecibeAtaque.equals(Tipo.VENENO.getTipo())){
                multiplicador = 1.5;
            } else if(tipoRecibeAtaque.equals(Tipo.BICHO.getTipo()) || tipoRecibeAtaque.equals(Tipo.PLANTA.getTipo())) {
                multiplicador = 0.5;
            } else if(tipoRecibeAtaque.equals(Tipo.VOLADOR.getTipo())) {
                multiplicador = 0.0;
            }

        } else if(tipoAtacante.equals(Tipo.VENENO.getTipo())) {

            if(tipoRecibeAtaque.equals(Tipo.HADA.getTipo()) || tipoRecibeAtaque.equals(Tipo.PLANTA.getTipo())){
                multiplicador = 1.5;
            } else if(tipoRecibeAtaque.equals(Tipo.FANTASMA.getTipo()) || tipoRecibeAtaque.equals(Tipo.ROCA.getTipo()) || tipoRecibeAtaque.equals(Tipo.TIERRA.getTipo()) || tipoRecibeAtaque.equals(Tipo.VENENO.getTipo())) {
                multiplicador = 0.5;
            } else if(tipoRecibeAtaque.equals(Tipo.ACERO.getTipo())) {
                multiplicador = 0.0;
            }

        } else if(tipoAtacante.equals(Tipo.VOLADOR.getTipo())) {

            if(tipoRecibeAtaque.equals(Tipo.BICHO.getTipo()) || tipoRecibeAtaque.equals(Tipo.LUCHA.getTipo()) || tipoRecibeAtaque.equals(Tipo.PLANTA.getTipo())){
                multiplicador = 1.5;
            } else if(tipoRecibeAtaque.equals(Tipo.ACERO.getTipo()) || tipoRecibeAtaque.equals(Tipo.ELECTRICO.getTipo()) || tipoRecibeAtaque.equals(Tipo.ROCA.getTipo())) {
                multiplicador = 0.5;
            }

        }


        if(multiplicador == 1.5) {
            System.out.println("Un ataque muy efectivo!!!");
        } else if(multiplicador == 0.5) {
            System.out.println("El ataque no ha sido muy efectivo...");
        } else if (multiplicador == 0) {
            System.out.println("El oponente es inmune a sus efectos");
        } else {
            System.out.println("Ataque normal.");
        }

        return multiplicador;


    }


}
