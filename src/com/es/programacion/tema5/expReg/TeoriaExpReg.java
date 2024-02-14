package com.es.programacion.tema5.expReg;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TeoriaExpReg {


    public static void main(String[] args) {
        /*
        ¿QUÉ ES UNA EXPRESIÓN REGULAR?

        Una expresión regular no es otra cosa que un patrón para encontrar una cadena de texto. En Java, este patrón
        se representa siempre con un String

        ¿Qué se necesita para comprobar expresiones regulares?

        1º Necesitamos la clase Pattern
        La clase Patter se encarga de compilar la expresión regular. Dicho de otra manera,
        esta clase sería la encargada de preparar/comprender/compilar la expresión regular para
        que se pueda usar.

        2º Necesitamos (es muy recomendable) la clase Matcher
        Esta clase nos permite hacer match sobre la secuencia de caracteres que nos define el Pattern.
        Con esta clase conseguimos una serie de métodos para buscar la expresión regular en un texto dado.
        Dicho con otras palabras, con esta clase ya podemos buscar un patrón en una cadena de texto.

        3º El método .find() de la clase Matcher
        El método .find() devuelve true si encuentra el patrón dado en la cadena de texto dada.

        EJEMPLO:
        Pattern pattern = Pattern.compile("expReg");
        Matcher matcher = pattern.matcher("cadena de texto donde buscar nuestra expReg");
        System.out.println(matcher.find());
         */

        // Para poder usar expresiones regulares en java se necesitan dos clases: Pattern y Matcher
        // La clase Pattern: Pattern pattern = Pattern.compile("la expresion regular");
        Pattern pattern = Pattern.compile("\\d{8}(\\s|-)?[a-zA-Z]"); // Expresion regular para DNI

        // La clase Matcher:  Matcher matcher = pattern.matcher("el String que queráis evaluar");
        String dni = "72719275F";
        Matcher matcher = pattern.matcher(dni);

        // Para ya comprobar en sí... osea... un método que os diga true o false -> .find()
        if(matcher.find()) {
            System.out.println("El DNI es válido");
        } else {
            System.out.println("El DNI no es válido");
        }


        // Haced una expresión regular para comprobar una IP valida con el siguiente formato
        // 192.168.189.190
        Pattern patternIP = Pattern.compile("^\\d{3}\\.\\d{3}\\.\\d{3}\\.\\d{3}$");
        String ip = "192.168.189.190";
        Matcher matcherIp = patternIP.matcher(ip);


        if(matcherIp.find()) {
            System.out.println("El IP "+ip+" es valido");
        } else {
            System.out.println("El IP "+ip+" no es válido");
        }

        // Hagáis dos exp reg.
        // 1º Para un número de teléfono
        // 950475192 -> válido
        // 950 47 51 92 -> válido
        Pattern patronTlfn = Pattern.compile("^\\d{3}\\s?\\d{2}\\s?\\d{2}\\s\\d{2}$");

        // 2º Para una dirección de correo electrónico
        // cualquier caracter de 1 a + veces seguido de un @ seguido de gmail ó hotmail seguido de . seguido de com ó es
        Pattern patronEmail = Pattern.compile("^.+@(gmail|hotmail)\\.(com|es)$");
        // elreshulon6969@gmail.com
        // elresshu@@@@@@***diedediejde@gmail.com

        // 3º Para un correo de educaand
        Pattern patronEmailEducaand = Pattern.compile("^\\w+@g\\.educaand\\.es$");


        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        now = now.plusHours(1);
        System.out.println(now);

        LocalDate now2 = LocalDate.now();
        System.out.println(now2);
    }
}
