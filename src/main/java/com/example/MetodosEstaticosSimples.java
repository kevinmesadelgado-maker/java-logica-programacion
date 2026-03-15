package com.example;

public class MetodosEstaticosSimples {

    // método sin parámetros ni retorno
    public static void ejemploDeclaracionLlamada() {

        System.out.println("Hola desde un método estático");
    }

    // método con parámetros
    public static void ejemploPasoParametros(String nombre) {

        System.out.println("Hola " + nombre);
    }

    // método con retorno
    public static int ejemploRetornoValores(int a, int b) {

        int suma = a + b;
        return suma;
    }

    // sobrecarga de métodos
    public static int ejemploSobrecarga(int a, int b) {

        return a + b;
    }

    public static double ejemploSobrecarga(double a, double b) {

        return a + b;
    }

}
