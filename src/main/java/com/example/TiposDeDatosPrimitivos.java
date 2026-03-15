package com.example;

public class TiposDeDatosPrimitivos {

    public static void demostrarEnteros(){ 
        // Tipos de datos primitivos en Java
        byte b = 100;          // 8 bits
        short s = 10000;      // 16 bits
        int i = 100000;        // 32 bits
        long l = 1000000000L; // 64 bits

     
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
    }

    public static void demostrarFlotantes() {
        float f = 5.5f;
        double d = 10.25;

        System.out.println("float: " + f);
        System.out.println("double: " + d);
    }

    public static void demostrarCaracteres() {
        char letra = 'A';
        System.out.println("char: " + letra);
    }

    public static void demostrarBooleanos() {
        boolean activo = true;
        System.out.println("boolean: " + activo);
    }

     byte by;
    short sh;
    int in;
    long lo;
    float fl;
    double dou;
    char ch;
    boolean bool;

    public void demostrarValoresPorDefecto() {

        System.out.println("byte: " + by);
        System.out.println("short: " + sh);
        System.out.println("int: " + in);
        System.out.println("long: " + lo);
        System.out.println("float: " + fl);
        System.out.println("double: " + dou);
        System.out.println("char: " + ch);
        System.out.println("boolean: " + bool);
    }
}

    
