/*
Crear un arreglo de números enteros de 20 posiciones, el cual, debe ser llenado con números aleatorios
entre 1 y 100; después de haber llenado dicho arreglo,
se debe volver a recorrer utilizando un ciclo diferente al que se usó para llenarse
e imprimir los números pares e impares. Ejemplo
- Números pares: 2, 4, 6, 8, 10
- Números impares: 1, 3, 5, 7, 9
*/
package com.talleres.Taller4;

import java.util.Scanner;

/**
 * Esta clase busca en un array de 20 posiciones que sera llenado con números aleatorios del 1 al 1000
 * @author Yamid Ortiz Muñoz <yaormu@gmail.com>
 * @version 1.0.0
 */
public class Ejercicio2 {

    /**
     * Inicialización de posición a diligenciar
     */
    private int i;

    /**
     * Ejecuta los métodos para diligenciar y mostrar información del array
     */
    public void Ejercicio2() {

        int[] arregloNumeros = new int[21];
        int[] arregloNumeroPar = new int[21];
        int[] arregloNumeroImpar = new int[21];

        i = 1;

        while (i <= 20) {
            arregloNumeros[i] = (int)(Math.random()*100+1);
            i += 1;
        }

        System.out.print("Número pares: ");
        mostrarPares (arregloNumeros, arregloNumeroPar);

        System.out.println(" ");

        System.out.print("Números impares: ");
        mostrarImpares(arregloNumeros, arregloNumeroImpar);

        System.out.println(" ");
    }

    //Mostrar datos pares que contiene el vector
    static void mostrarPares (int datos[], int datosPar[]) {

        for (int i = 1; i < datos.length; i++) {
            if(datos[i] % 2 == 0) {
                System.out.print(datos[i] + ", ");
                datosPar[i] = datos[i];
            }
        }

    }

    //Mostrar datos impares que contiene el vector
    static void mostrarImpares (int datos[], int datosImpar[]) {

        for (int i = 1; i < datos.length; i++) {
            if(datos[i] % 2 == 1) {
                System.out.print(datos[i] + ", ");
                datosImpar[i] = datos[i];
            }
        }

    }

}