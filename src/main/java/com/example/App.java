package com.example;

public class App {

    public static void main(String[] args) {

        System.out.println("--- Variables y Constantes ---");
        VariablesYConstantes.demostrarDeclaracionAsignacion();
        VariablesYConstantes.demostrarConvencionesNombres();
        VariablesYConstantes.demostrarConstantes();


        System.out.println("\n--- Tipos de Datos Primitivos ---");
        TiposDeDatosPrimitivos.demostrarEnteros();
        TiposDeDatosPrimitivos.demostrarFlotantes();
        TiposDeDatosPrimitivos.demostrarCaracteres();
        TiposDeDatosPrimitivos.demostrarBooleanos();

        TiposDeDatosPrimitivos obj = new TiposDeDatosPrimitivos();
        obj.demostrarValoresPorDefecto();


        System.out.println("\n--- Conversión de Tipos ---");
        ConversionDeTipos.demostrarCastingImplicito();
        ConversionDeTipos.demostrarCastingExplicito();
        ConversionDeTipos.demostrarProblemasDePrecision();


        System.out.println("\n--- Operadores ---");
        Operadores.demostrarAritmeticos();
        Operadores.demostrarIncrementoDecremento();
        Operadores.demostrarRelacionales();
        Operadores.demostrarLogicos();
        Operadores.demostrarOperadorTernario();


        System.out.println("\n--- Entrada de Datos ---");
        EntradaDeDatos.leerVariosTipos();
        EntradaDeDatos.manejarSaltoDeLineaPendiente();


        System.out.println("\n--- Estructuras Condicionales ---");
        EstructurasCondicionales.ejemploIf();
        EstructurasCondicionales.ejemploIfElse();
        EstructurasCondicionales.ejemploIfElseIfElse();
        EstructurasCondicionales.ejemploSwitch();


        System.out.println("\n--- Estructuras de Repetición ---");
        EstructurasDeRepeticion.ejemploWhile();
        EstructurasDeRepeticion.ejemploDoWhile();
        EstructurasDeRepeticion.ejemploForClasico();
        EstructurasDeRepeticion.ejemploForAnidado();
        EstructurasDeRepeticion.ejemploBreakContinue();

        System.out.println("\n--- Métodos Estáticos ---");
        MetodosEstaticosSimples.ejemploDeclaracionLlamada();
        MetodosEstaticosSimples.ejemploPasoParametros("Kevin");

        int suma = MetodosEstaticosSimples.ejemploRetornoValores(5, 3);
        System.out.println("Resultado: " + suma);

        System.out.println(MetodosEstaticosSimples.ejemploSobrecarga(4, 6));
        System.out.println(MetodosEstaticosSimples.ejemploSobrecarga(4.5, 2.5));


        System.out.println("\n--- Arreglos Unidimensionales ---");
        ArreglosUnidimensionales.declararCrearInicializar();
        ArreglosUnidimensionales.mostrarLongitud();
        ArreglosUnidimensionales.recorrerConForClasico();
        ArreglosUnidimensionales.recorrerConForEach();


        System.out.println("\n--- Arreglos Bidimensionales ---");
        ArreglosBidimensionales.declararCrearMatrices();
        ArreglosBidimensionales.recorrerMatriz();
        ArreglosBidimensionales.ejemploUsosTipicos();


        System.out.println("\n--- Manipulación de Cadenas ---");
        ManipulacionCadenas.demostrarConcatenacion();
        ManipulacionCadenas.demostrarMetodosUtiles();
        ManipulacionCadenas.demostrarInmutabilidad();
        ManipulacionCadenas.usarStringBuilder();


        System.out.println("\n--- Manejo de Excepciones ---");
        ManejoBasicoExcepciones.ejemploTryCatchDivision();
        ManejoBasicoExcepciones.ejemploBloqueFinally();

    }
}