package com.example;

public class EstructurasCondicionales {


    public static void ejemploIf() {

        int numero = 10;

        if (numero > 5) {
            System.out.println("El número es mayor que 5");
        }
    }

   
    public static void ejemploIfElse() {

        int edad = 16;

        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
    }

    // if - else if - else
    public static void ejemploIfElseIfElse() {

        int nota = 4;

        if (nota >= 5) {
            System.out.println("Excelente");
        } 
        else if (nota >= 3) {
            System.out.println("Aprobado");
        } 
        else {
            System.out.println("Reprobado");
        }
    }

    // switch tradicional
    public static void ejemploSwitch() {

        int dia = 3;

        switch (dia) {

            case 1:
                System.out.println("Lunes");
                break;

            case 2:
                System.out.println("Martes");
                break;

            case 3:
                System.out.println("Miércoles");
                break;

            default:
                System.out.println("Otro día");
        }
    }

    // switch expression 
    public static void ejemploSwitchExpression() {

        int dia = 2;

        String resultado = switch (dia) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miércoles";
            default -> "Otro día";
        };

        System.out.println(resultado);
    }
}