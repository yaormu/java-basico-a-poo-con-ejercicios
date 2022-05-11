package com.talleres.Taller4;

import java.util.Scanner;

/**
 * Esta clase crea un vector de 5 posiciones y es llenado por el usuario
 *
 * @author Yamid Ortiz Muñoz <yaormu@gmail.com>
 * @version 1.0.0
 */
public class Ejercicio1 {

    /**
     * Input obtener dato Int
     */
    private static Scanner inputInt = new Scanner(System.in);

    /**
     * Ejecuta los métodos para diligenciar y mostrar información del array
     */
    public void Ejercicio1() {
        Scanner sc = new Scanner(System.in);

        int[] arregloNumeros = new int[5];

        arregloNumeros = leerArregloInt(sc, arregloNumeros);

        mostrarVector(arregloNumeros);
    }

    /**
     * Solicita información para diligenciar/llenar el array con información númerica
     * @param sc el valor por teclado a recibir
     * @param x el valor del arreglo a diligenciar
     * @return regresa el valor del array con datos
     */
    public static int[] leerArregloInt(Scanner sc, int[] x) {
        for (int i = 0; i < x.length; i++) {
            System.out.println("Ingrese el valor para la posición: " + i + " y enter para continuar...");
            x[i] = Integer.parseInt(sc.nextLine());
        }
        return x;
    }


    /**
     * Mostrar los datos que contiene el array
     * @param datos recibe el array conocer información de este
     */
    static void mostrarVector(int datos[]) {
        for (int i=0; i<datos.length; i++)
            System.out.println("[" + i + "] = " + datos[i]);
    }

}