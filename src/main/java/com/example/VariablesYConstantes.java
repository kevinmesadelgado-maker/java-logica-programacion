package com.example;

public class VariablesYConstantes {

    // Declarar y asignar variables
    public static void demostrarDeclaracionAsignacion() {

        int edad = 17;
        double altura = 1.75;
        char letra = 'A';
        boolean activo = true;
        String nombre = "Kevin";

        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);
        System.out.println("Letra: " + letra);
        System.out.println("Activo: " + activo);
        System.out.println("Nombre: " + nombre);
    }

    // Convenciones de nombres (camelCase)
    public static void demostrarConvencionesNombres() {

        int numeroEstudiantes = 30;
        double promedioCurso = 4.2;
        String nombreProfesor = "Carlos";

        System.out.println("Número de estudiantes: " + numeroEstudiantes);
        System.out.println("Promedio del curso: " + promedioCurso);
        System.out.println("Profesor: " + nombreProfesor);
    }

    // Constantes con final
    public static void demostrarConstantes() {

        final double PI = 3.1416;
        final int DIAS_SEMANA = 7;

        System.out.println("Valor de PI: " + PI);
        System.out.println("Días de la semana: " + DIAS_SEMANA);
    }
}