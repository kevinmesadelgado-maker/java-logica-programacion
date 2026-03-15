package com.example;

public class ArreglosUnidimensionales {

    // Declarar, crear e inicializar un array
    public static void declararCrearInicializar() {

        int[] numeros = {10, 20, 30, 40, 50};

        System.out.println("Array creado");
    }

    // Mostrar longitud del array
    public static void mostrarLongitud() {

        int[] numeros = {10, 20, 30, 40, 50};

        System.out.println("Longitud: " + numeros.length);
    }

    // Recorrer con for clásico
    public static void recorrerConForClasico() {

        int[] numeros = {10, 20, 30, 40, 50};

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }

    // Recorrer con for-each
    public static void recorrerConForEach() {

        int[] numeros = {10, 20, 30, 40, 50};

        for (int num : numeros) {
            System.out.println(num);
        }
    }

    // Array como parámetro y retorno
    public static int[] arrayComoParametroYRetorno(int[] datos) {

        for (int i = 0; i < datos.length; i++) {
            datos[i] = datos[i] * 2;
        }

        return datos;
    }

}
