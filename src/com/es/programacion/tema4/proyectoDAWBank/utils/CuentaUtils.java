package com.es.programacion.tema4.proyectoDAWBank.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CuentaUtils {

    public static final String REGEXCUENTA = "^[a-zA-Z]{2}\\d{20}$";

    public static boolean checkCuenta(String cuentaBancaria) {

        Pattern pattern = Pattern.compile(REGEXCUENTA, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(cuentaBancaria);
        return matcher.find();
    }

}
