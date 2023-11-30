package com.Programacion.Tema3.Control_Excepciones;

public class ArithmeticEsception {
    public static void main(String[] args) {
        try{
            int a=2;
            int b = 0;
            int division =a/b;

        }catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println("No se puede dividir entre 0");
        }System.out.println("Estoy aquí");
    }
}
