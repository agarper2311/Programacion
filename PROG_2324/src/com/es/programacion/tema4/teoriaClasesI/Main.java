package com.es.programacion.tema4.teoriaClasesI;

import com.es.programacion.tema4.teoriaClasesI.clases.Persona;

public class Main {

    public static void main(String[] args) {
        Persona p = new Persona();

        p.establecerDatosPersona("Diego",
                "Apellido1 Apellido2",
                "española",
                33);
        p.presentarse();
    }
}
