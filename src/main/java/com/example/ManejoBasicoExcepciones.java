package com.example;

import java.util.Scanner;

public class ManejoBasicoExcepciones {

    // Try-Catch con división
    public static void ejemploTryCatchDivision() {

        try {

            int a = 10;
            int b = 0;

            int resultado = a / b;

            System.out.println(resultado);

        } catch (ArithmeticException e) {

            System.out.println("Error: división por cero");

        }
    }

    // Try-Catch con Scanner
    public static void ejemploTryCatchInput() {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Ingrese un número: ");
            int numero = sc.nextInt();

            System.out.println("Número: " + numero);

        } catch (Exception e) {

            System.out.println("Entrada inválida");

        }

    }

    // Bloque finally
    public static void ejemploBloqueFinally() {

        try {

            int x = 5 / 1;
            System.out.println("Resultado: " + x);

        } catch (ArithmeticException e) {

            System.out.println("Error");

        } finally {

            System.out.println("Este bloque siempre se ejecuta");

        }
    }

    // Evitar que el programa falle
    public static void evitarCierrePrograma() {

        Scanner sc = new Scanner(System.in);
        int numero = 0;
        boolean valido = false;

        while (!valido) {

            try {

                System.out.print("Ingrese un número: ");
                numero = sc.nextInt();
                valido = true;

            } catch (Exception e) {

                System.out.println("Entrada incorrecta, intente otra vez.");
                sc.nextLine();
            }

        }

        System.out.println("Número ingresado: " + numero);
    }
}
