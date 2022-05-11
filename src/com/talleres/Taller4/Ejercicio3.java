package com.talleres.Taller4;

/**
 * Esta clase imprime los números primos del 1 al 1000
 * @author Yamid Ortiz Muñoz <yaormu@gmail.com>
 * @version 1.0.0
 */
public class Ejercicio3 {

    /**
     * Ejecuta los métodos para diligenciar y mostrar información del array números primos
     */
    public void Ejercicio3() {

        int[] arregloNumeros = new int[1001];

       ingresarDatos(arregloNumeros);

       esPrimo (arregloNumeros);

    }

    /**
     * Ingresar datos al array de números
     * @param datos es el array a diligenciar
     */
    static void ingresarDatos (int datos[]) {
        int num = 1;
        for (int i = 1; i < datos.length; i++) {
            datos[i] = num;
            num += 1;
        }
    }

    /**
     * Recorrer el array de números y mostrar solo los números primos
     * @param arregloNumeros recibe el arreglo a evaluar
     */
    static void esPrimo (int arregloNumeros[]) {
        for (int i = 0; i <= 1000; i++) {
            int div = 0;

            for (int j = 1; j <= arregloNumeros[i]; j++) {
                if (arregloNumeros[i] % j == 0) {
                    div = div + 1;
                }
            }
            if (div == 2) {
                System.out.println(arregloNumeros[i]);
            }
        }
    }
}