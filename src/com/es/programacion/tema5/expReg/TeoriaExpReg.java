package com.Programacion.Tema5.expReg;

import java.sql.SQLOutput;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TeoriaExpReg {
    public static void main(String[] args) {
        // Expresión para DNI
        Pattern pattern = Pattern.compile("\\d{8}([\\s-])?[a-zA-Z]");

        String dni = "25617332R";
        Matcher matcher = pattern.matcher(dni);

        if (matcher.matches()) {
            System.out.println("El DNI es válido");
        } else {
            System.out.println("El DNI no es válido");
        }


        // Hacer una expresión regular Para comprobar una IP válida con el siguiente formato
        // 192.168.189.190

        // Pattern pattern1 = Pattern.compile("^25[0-5]|2[0-4][0-9]|[0-1]?[0-9]{1,2}(\\\\.(25[0-5]|2[0-4][0-9]|[0-1]?[0-9]{1,2})){3}$");


        Pattern patternIP = Pattern.compile("^\\d{3}\\.\\d{3}\\.\\d{1,3}\\.\\d{1,3}$");

        String ip = "192.168.18.1";

        Matcher matcher1 = patternIP.matcher(ip);
        if (matcher1.matches()) {
            System.out.println("La dirección IP " + ip + " es válida");
        } else {
            System.out.println("La dirección IP " + ip + " no es válida");
        }



        /*
        Pattern patternIP = Pattern.compile("^\\d{3}\\.\\d{3}\\.\\d{3}$");

        String ip = "192.168.1.1";

        Matcher matcherIP = patternIP.matcher(ip);
        if (matcherIP.find()) {
            System.out.println("La dirección IP "+ip+" es válida");
        } else {
            System.out.println("La dirección IP "+ip+" no es válida");
        }

         */


        // Hacer dos expresiones regulares
        // 1º Para un número de teléfono
        // 950475192 --> valido
        // 950 47 51 92 --> valido

        Pattern patternTlfn = Pattern.compile("^\\d{3}\\s?\\d{2}\\s\\d{2}$");

        String tlfn = "950475192";

        Matcher matcherTlfn = patternTlfn.matcher(tlfn);

        if (matcherTlfn.find()){
            System.out.println("El teléfono "+tlfn+" es válido");
        }else{
            System.out.println("El teléfono "+tlfn+" no es válido");
        }


        Pattern patronEmail = Pattern.compile("@(gmail|hotmail|g\\.educaand)\\.(com|es)$");
        String email = "agarper2311@gmail.com";
        Matcher matcherEmail = patronEmail.matcher(email);

        String email2 = "agarper2311@g.educaand.es";
        Matcher matcherEmail2 = patronEmail.matcher(email2);

        if (matcherEmail.find()){
            System.out.println("El correo "+email+" es correcto");
        }else {
            System.out.println("El correo "+email+" es incorrecto");
        }

        if (matcherEmail2.find()){
            System.out.println("El correo "+email2+" es correcto");
        }else {
            System.out.println("El correo "+email2+" es incorrecto");
        }
    }
}

