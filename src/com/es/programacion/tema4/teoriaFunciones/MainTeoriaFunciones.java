package com.es.programacion.tema4.teoriaFunciones;

import com.es.programacion.tema4.teoriaFunciones.clases.CypherUtils;
import com.es.programacion.tema4.teoriaFunciones.clases.DniValidator;

public class MainTeoriaFunciones {

    public static void main(String[] args) {
        String dniAProbar1 = "12345678A"; // Uno que tiene que dar true
        String dniAProbar2 = "123X5678A"; // Uno que debe dar false

        boolean validez1 = DniValidator.comprobarParteNumerica(dniAProbar1);
        boolean validez2 = DniValidator.comprobarParteNumerica(dniAProbar2);

        if(validez1) { // if(validez1 == true)
            System.out.println("El dni "+dniAProbar1+" es correcto");
        } else {
            System.out.println("El dni "+dniAProbar1+" es incorrecto");
        }

        if(validez2) { // if(validez2 == true)
            System.out.println("El dni "+dniAProbar2+" es correcto");
        } else {
            System.out.println("El dni "+dniAProbar2+" es incorrecto");
        }


        boolean esValido = DniValidator.checkDNI("12345678A");
        if (esValido) {
            System.out.println("El DNI es valido");
        } else {
            System.out.println("El DNI no es valido");
        }


        String unaCadenaParaCifrar = "pass123";
        CypherUtils.cifrarPass(unaCadenaParaCifrar);


    }
}
