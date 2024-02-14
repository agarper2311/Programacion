package com.es.programacion.tema6.proyectoBanco;

import com.es.programacion.tema6.proyectoBanco.classes.impl.CuentaAhorro;
import com.es.programacion.tema6.proyectoBanco.classes.impl.CuentaCorriente;
import com.es.programacion.tema6.proyectoBanco.utils.api.GenericUtil;
import com.es.programacion.tema6.proyectoBanco.utils.impl.CuentaEspUtil;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        GenericUtil util = new CuentaEspUtil();

        CuentaAhorro cuentaAhorro = new CuentaAhorro("ES1234512345123451234512", util);
        CuentaCorriente cuentaCorriente = new CuentaCorriente("ES1234512345123451234512", util);
        CuentaCorriente cuentaCorriente2 = new CuentaCorriente("ES1234512345123451234590", util);

        /*
        Comentario de texto
         */
        try {
            cuentaCorriente.ingresar(1000);

            Scanner scanner = new Scanner(System.in);
            System.out.println("Indique la cantidad a traspasar: ");
            double cantTraspaso = scanner.nextDouble();
            cuentaCorriente.transferir(cuentaCorriente2, cantTraspaso);




        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}
