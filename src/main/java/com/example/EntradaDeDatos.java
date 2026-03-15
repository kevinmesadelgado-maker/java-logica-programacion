package com.example;

import java.util.Scanner;

public class EntradaDeDatos {
    
public static void leerVariosTipos() {
    // Crear un objeto Scanner para leer la entrada del usuario
    java.util.Scanner scanner = new java.util.Scanner(System.in);

    System.out.print("Ingrese un número entero: ");
    int numeroEntero = scanner.nextInt();

    System.out.print("Ingrese un número decimal: ");
    double numeroDecimal = scanner.nextDouble();

    scanner.nextLine();

    System.out.print("Ingrese una palabra: ");
    String palabra = scanner.next();

     scanner.nextLine();

    System.out.print("Ingrese una cadena de texto: ");
    String cadenaTexto = scanner.nextLine();

    // Mostrar los datos ingresados
    System.out.println("Número entero ingresado: " + numeroEntero);
    System.out.println("Número decimal ingresado: " + numeroDecimal);
    System.out.println("Cadena de texto ingresada: " + cadenaTexto);
    System.out.println("Palabra ingresada: " + palabra);
 scanner.close();
}
// Demuestra el problema del salto de línea
    public static void manejarSaltoDeLineaPendiente() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();

        sc.nextLine(); // SOLUCIÓN al problema

        System.out.print("Ingrese su nombre completo: ");
        String nombre = sc.nextLine();

        System.out.println("\nDatos ingresados:");
        System.out.println("Edad: " + edad);
        System.out.println("Nombre: " + nombre);
    }

}

