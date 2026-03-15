package com.example;

public class ArreglosBidimensionales {

    // Declarar y crear matriz
    public static void declararCrearMatrices() {

        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Matriz creada");
    }

    // Recorrer matriz
    public static void recorrerMatriz() {

        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                System.out.print(matriz[i][j] + " ");
            }

            System.out.println();
        }
    }

    // Uso típico de matrices
    public static void ejemploUsosTipicos() {

        int[][] matriz = {
            {1, 2},
            {3, 4}
        };

        int suma = 0;

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                suma += matriz[i][j];
            }

        }

        System.out.println("Suma de matriz: " + suma);
    }

}
