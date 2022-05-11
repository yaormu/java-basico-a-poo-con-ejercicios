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

/**
 * Esta clase dada una matriz bidimensional se imprime de una forma distinta en reversa
 * @author Yamid Ortiz Muñoz <yaormu@gmail.com>
 * @version 1.0.0
 */
public class Ejercicio4 {

    /**
     * Ejecuta muestra una matriz bidimensional quemada y luego con ciclos impresion al contrario
     */
    public void Ejercicio4() {

        String[][] datosNumeros = new String[5][4];

        datosNumeros[0][0] = "01";
        datosNumeros[1][0] = "02";
        datosNumeros[2][0] = "03";
        datosNumeros[3][0] = "04";
        datosNumeros[4][0] = "05";

        datosNumeros[0][1] = "06";
        datosNumeros[1][1] = "07";
        datosNumeros[2][1] = "08";
        datosNumeros[3][1] = "09";
        datosNumeros[4][1] = "10";

        datosNumeros[0][2] = "11";
        datosNumeros[1][2] = "12";
        datosNumeros[2][2] = "13";
        datosNumeros[3][2] = "14";
        datosNumeros[4][2] = "15";

        datosNumeros[0][3] = "16";
        datosNumeros[1][3] = "17";
        datosNumeros[2][3] = "18";
        datosNumeros[3][3] = "19";
        datosNumeros[4][3] = "20";

        msjDatosQuemados();
        mostrarDatosQuemados (datosNumeros);

        msjDatosPorCiclo();
        mostraDatosConCiclo (datosNumeros);

    }


    /**
     * Mostar los datos quemados de la matriz bidemensional
     * @param datosNumeros se obtiene los datos de la matriz a mostrar
     */
    private static void mostrarDatosQuemados (String datosNumeros[][]) {
        for (int i=0; i <= 4-1; i++) {
            for (int j=0; j <= 5-1; j++) {
                System.out.print(" " + datosNumeros[j][i]);
            }
            System.out.println("");
        }
    }

    /**
     * Mostar los datos mediante ciclos de una matriz bidemensional, con un cierto patron
     * @param datosNumeros se obtiene los datos de la matriz a mostrar
     */
    private static void mostraDatosConCiclo (String datosNumeros[][]) {

        for (int l=0; l<= 4; l++) {
            System.out.print(" " + datosNumeros[l][0]);
        }

        System.out.println("");

        for (int l=4; l >= 0; l--) {
            System.out.print(" " + datosNumeros[l][1]);
        }

        System.out.println("");

        for (int l=0; l <= 4; l++) {
            System.out.print(" " + datosNumeros[l][2]);
        }

        System.out.println("");

        for (int l=4; l >= 0; l--) {
            System.out.print(" " + datosNumeros[l][3]);
        }

        System.out.println("");
    }

    /**
     * Mensaje indicando impresión matriz manual
     */
    private void msjDatosQuemados() {
        System.out.println("Impresión matriz bidemensional de datos manual:");
    }

    /**
     * Mensaje indicando impresión matriz por ciclos
     */
    private void msjDatosPorCiclo() {
        System.out.println("Impresión matriz bidemensional con ciclos:");
    }
}
