package com.Programacion.Tema4.Funciones2;
import com.Programacion.Tema4.Funciones2.DniValidator;
public class ValidarDNIs {
    public static void main(String[] args) {
        /**
         * Declarar un array de String de 10 posiciones
         * Meter en cada posición 1 DNI diferente
         * LLamar al método, chachPartenumerica y CONTAR
         * cúantos DNIs son válidos y cuantos inválidos
         */


        // Declarar array y rellenarlo
        String[] arrDNIs = {
                "12345678A", "87654321B", "56789012C",
                "34567890D", "90123456E", "F8901234F",
                "654S2109G", "4321P987H", "2109876II",
                "8901234PJ"
        };

        // Declarar contador para dnisválidos y dnisinválidos
        int dnisValidos = 0;
        int dnisInvalidos = 0;
        // Recorrer el array
        for (String dni : arrDNIs) {


            // Llamar a DniValidator.comprobarParteNumerica
            if (DniValidator.comprobarParteNumerica(dni)) {
                // Si true ---> Contador dnisValidos++
                dnisValidos++;
            } else {
                // Si false ---> Contador dnisInvalidos++
                dnisInvalidos++;
            }
        }

        // Imprimir resultados
        System.out.println("DNIs válidos: " + dnisValidos);
        System.out.println("DNIs inválidos: " + dnisInvalidos);
    }
}