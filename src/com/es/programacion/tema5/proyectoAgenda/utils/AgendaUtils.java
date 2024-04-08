package com.Programacion.Tema5.proyectoAgenda.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AgendaUtils {

    private static final String EXP_REG_NOMBRE = "\\d";
    private static final String EXP_REG_DNI = "^\\d{8}(-|\\s|\\/)?[a-zA-Z]$";
    private static final String EXP_REG_CP = "^(04|41|14|18|29|21|11|23)\\d{3}$";
    private static final String EXP_REG_TLFN = "^\\d{3}\\s?(\\d{2}\\s?){2}\\d{2}$";
    private static final String EXP_REG_EMAIL = "^[a-z]{7}\\d{3,4}@g\\.educaand\\.es$";

    public static boolean checkNombre (String nombre) {

        Pattern pattern = Pattern.compile(EXP_REG_NOMBRE);
        Matcher matcher = pattern.matcher(nombre);

        return matcher.find() ? false : true;
        /*
        if(matcher.find()) {
            return false;
        } else {
            return true;
        }

        return !matcher.find();
        */
    }

    public static boolean checkDni (String dni) {
        Pattern pattern = Pattern.compile(EXP_REG_DNI);
        Matcher matcher = pattern.matcher(dni);
        return matcher.find();
    }

    public static boolean checkCP (String cp) {
        Pattern pattern = Pattern.compile(EXP_REG_CP);
        Matcher matcher = pattern.matcher(cp);
        return matcher.find();
    }

    public static boolean checkTlfn (String tlfn) {
        Pattern pattern = Pattern.compile(EXP_REG_TLFN);
        Matcher matcher = pattern.matcher(tlfn);
        return matcher.find();
    }

    public static boolean checkEmail (String email) {
        Pattern pattern = Pattern.compile(EXP_REG_EMAIL);
        Matcher matcher = pattern.matcher(email);
        return matcher.find();
    }






}
