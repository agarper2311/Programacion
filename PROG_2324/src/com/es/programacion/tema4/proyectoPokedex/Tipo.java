package com.es.programacion.tema4.proyectoPokedex;

public enum Tipo {

    ACERO("Acero"),
    AGUA("Agua"),
    BICHO("Bicho"),
    DRAGON("Dragon"),
    ELECTRICO("Electrico"),
    FANTASMA("Fantasma"),
    FUEGO("Fuego"),
    HADA("Hada"),
    HIELO("Hielo"),
    LUCHA("Lucha"),
    NORMAL("Normal"),
    PLANTA("Planta"),
    PSIQUICO("Psiquico"),
    ROCA("Roca"),
    SINIESTRO("Siniestro"),
    TIERRA("Tierra"),
    VENENO("Veneno"),
    VOLADOR("Volador");

    private String tipo;

    private Tipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }


}
