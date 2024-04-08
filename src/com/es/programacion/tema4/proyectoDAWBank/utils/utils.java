package com.Programacion.Tema4.proyectoDAWBank.utils;

public class utils {

    public static boolean verificarLongitudIBAN(String iban) {
        return iban != null && iban.length() == 24;
    }

    public static boolean verificarMayusculasIBAN(String iban) {
        if (iban != null) {
            // Sacado de StackOverflow
            for (char c : iban.toCharArray()) {
                if (Character.isLetter(c) && !Character.isUpperCase(c)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
