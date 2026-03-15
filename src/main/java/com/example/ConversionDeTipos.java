package com.example;

public class ConversionDeTipos {
   

    public static void demostrarCastingImplicito() {
        int numero = 10;
        double resultado = numero;

        System.out.println("Casting implícito: " + resultado);
    }

    public static void demostrarCastingExplicito() {
        double numero = 9.8;
        int resultado = (int) numero;

        System.out.println("Casting explícito: " + resultado);
    }

    public static void demostrarProblemasDePrecision() {
        double numero = 9.99;
        int resultado = (int) numero;

        System.out.println("Se pierde precisión: " + resultado);
    }
}
