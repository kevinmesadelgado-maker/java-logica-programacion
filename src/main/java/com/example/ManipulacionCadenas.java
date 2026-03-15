package com.example;

public class ManipulacionCadenas {

    // Concatenación
    public static void demostrarConcatenacion() {

        String nombre = "Kevin";
        String saludo1 = "Hola " + nombre;
        String saludo2 = "Hola ".concat(nombre);

        System.out.println(saludo1);
        System.out.println(saludo2);
    }

    // Métodos útiles de String
    public static void demostrarMetodosUtiles() {

        String texto = "  Programacion Java  ";

        System.out.println("Longitud: " + texto.length());
        System.out.println("Char en posición 2: " + texto.charAt(2));
        System.out.println("Substring: " + texto.substring(2, 8));
        System.out.println("Mayúsculas: " + texto.toUpperCase());
        System.out.println("Minúsculas: " + texto.toLowerCase());
        System.out.println("Trim: " + texto.trim());
        System.out.println("Equals: " + texto.equals("Java"));
        System.out.println("EqualsIgnoreCase: " + texto.equalsIgnoreCase("PROGRAMACION JAVA"));
        System.out.println("Contains: " + texto.contains("Java"));
        System.out.println("StartsWith: " + texto.startsWith(" "));
        System.out.println("EndsWith: " + texto.endsWith(" "));
    }

    // Inmutabilidad de String
    public static void demostrarInmutabilidad() {

        String texto = "Hola";
        texto.concat(" Mundo");

        System.out.println(texto); // sigue siendo "Hola"

        texto = texto.concat(" Mundo");
        System.out.println(texto);
    }

    // Uso de StringBuilder
    public static void usarStringBuilder() {

        StringBuilder sb = new StringBuilder("Hola");

        sb.append(" ");
        sb.append("Kevin");

        System.out.println(sb.toString());
    }
}
