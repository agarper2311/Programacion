package com.es.programacion.tema6.proyectoBanco.utils.impl;

import com.es.programacion.tema6.proyectoBanco.utils.api.GenericUtil;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CuentaBeUtil implements GenericUtil {

    private static final String IBAN_REGEXP = "^BE\\d{2}\\s?\\d{3}\\s?\\d{7}\\s?\\d{1}$";

    public boolean checkIbanFormat(String iban) {

        String newIban = iban.trim().toUpperCase().replaceAll("\\s", "");

        Pattern pattern = Pattern.compile(IBAN_REGEXP);
        Matcher matcher = pattern.matcher(newIban);
        return matcher.find();
    }
}
