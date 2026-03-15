package com.example;

public class EstructurasDeRepeticion {

    // while
    public static void ejemploWhile() {

        int i = 1;

        while (i <= 5) {
            System.out.println("While: " + i);
            i++;
        }
    }

    // do-while
    public static void ejemploDoWhile() {

        int i = 1;

        do {
            System.out.println("DoWhile: " + i);
            i++;
        } while (i <= 5);
    }

    // for clásico
    public static void ejemploForClasico() {

        for (int i = 1; i <= 5; i++) {
            System.out.println("For: " + i);
        }
    }

    // for anidado
    public static void ejemploForAnidado() {

        for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <= 3; j++) {
                System.out.println("i=" + i + " j=" + j);
            }

        }
    }

    // break y continue
    public static void ejemploBreakContinue() {

        for (int i = 1; i <= 5; i++) {

            if (i == 3) {
                continue;
            }

            if (i == 5) {
                break;
            }

            System.out.println(i);
        }
    }

}