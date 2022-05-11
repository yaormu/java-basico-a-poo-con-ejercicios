/*
Dada la siguiente matriz bidimensional, el cual debe de quemar en el código
    - 01 02 03 04 05
    - 06 07 08 09 10
    - 11 12 13 14 15
    - 16 17 18 19 20
Utilizando el conocimiento adquirido, a excepción de hacerlo de forma manual, imprima la siguiente matriz bidimensional.
    - 01 02 03 04 05
    - 10 09 08 07 06
    - 11 12 13 14 15
    - 20 19 18 17 16
*/
package com.talleres.Taller4;

import java.util.Scanner;

/**
 * Esta clase dada una matriz bidimensional con valores, realizar la consulta del campo columna y fila dara resultado
 * @author Yamid Ortiz Muñoz <yaormu@gmail.com>
 * @version 1.0.0
 */
public class Ejercicio5 {

    /**
     * Input obtener dato entero
     */
    private static Scanner inputInt = new Scanner(System.in);

    /**
     * seleccion columna elegida por el usuario
     */
    private int columna;

    /**
     * seleccion fila elegida por el usuario
     */
    private int fila;

    /**
     * Ejecuta muestra una matriz bidimensional para consulta de acuerdo a la eleccion de columna y fila mostrar el resultado
     */
    public void Ejercicio5() {

        int[][] datosNumeros = new int[10][10];

        mostrarDatosTabla();

        int j = 1;
        int i = 1;

        for (int fila = 0; fila <= 9; fila++) {
            for (int columna = 0; columna <= 9; columna++) {
                datosNumeros[fila][columna] = i * j;
                i = i + 1;
            }
            i = 1;
            j = j + 1;
        }

        fila = consultaFila();
        columna = consultaColumna();

        System.out.println("El resultado es: " + datosNumeros[fila][columna]);

    }

    /**
     * Dibuja la tabla con las columnas y filas, con los respectivos campos que muestra una operación
     */
    private static void mostrarDatosTabla () {
        System.out.println("   0   1   2   3   4   5   6   7   8   9");

        for (int fila = 1; fila <= 10; fila++) {
            System.out.print(fila-1 + " ");

            for (int columna = 1; columna <= 10; columna++) {
                System.out.print(columna + "x" + fila + " ");
            }
            System.out.println("");
        }
    }

    /**
     * Solicita el valor de la fila a consultar
     * @return devuelve el valor indicado por el usuario
     */
    private static int consultaFila () {
        System.out.println("Ingrese la fila a consultar:");
        return inputInt.nextInt();
    }

    /**
     * Solicita el valor de columna a consultar
     * @return devuelve el valor indicado por el usuario
     */
    private static int consultaColumna () {
        System.out.println("Ingrese la columna a consultar:");
        return inputInt.nextInt();
    }
}
