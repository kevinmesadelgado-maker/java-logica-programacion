package com.example;

public class Operadores{

    public static void demostrarAritmeticos() {
        int a = 3, b = 2;

        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        System.out.println("División: " + (a / b));
        System.out.println("Módulo: " + (a % b));
    }

    public static void demostrarIncrementoDecremento() {
        int x = 5;
        x++;
        x--;

        System.out.println("Valor final: " + x);
    }

    public static void demostrarRelacionales() {
        int a = 5, b = 10;

        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a < b);
        System.out.println(a <= b);
        System.out.println(a == b);
        System.out.println(a != b);
    }

    public static void demostrarLogicos() {
        boolean a = true;
        boolean b = false;

        System.out.println(a && b);
        System.out.println(a || b);
        System.out.println(!a);
    }
    public static void demostrarAsignacionCompuesta() {
        int a = 5;
        a += 3; // a = a + 3
        a -= 2; // a = a - 2
        a *= 4; // a = a * 4
        a /= 2; // a = a / 2

        System.out.println("Valor final: " + a);
    }

    public static void demostrarOperadorTernario() {
        int edad = 18;
        String resultado = (edad >= 18) ? "Mayor de edad" : "Menor de edad";

        System.out.println(resultado);
    }
}

