package com.talleres.Taller3;

import java.util.Scanner;

/**
 * Esta clase imprime la tabla de multiplicar que digite
 *
 * @author Yamid Ortiz Muñoz <yaormu@gmail.com>
 * @version 1.0.0
 */
public class Ejercicio4 {

    /**
     * Input obtener dato entero
     */
    private static Scanner inputInt = new Scanner(System.in);

    /**
     * numero de la tabla
     */
    private static int numTabla;

    /**
     * Ejecuta el método para pedir y mostrar la tabla de multiplicar que indique el usuario
     */
    public void Ejercicio4() {

        numTabla = (solicitaNumeroTabla());

        imprimirTabla(numTabla);

    }

    /**
     * Muestra la tabla de multiplicar que desee el usuario
     * @param num recibe el número de la tabla a mostrar
     */
    private static void imprimirTabla (int num) {

        for (int i = 1; i<=10; i++) {
            System.out.println(num + " * " + i + " = " + num * i);
        }
    }

    /**
     * Solicita el número de la tabla
     * @return captura y devuelve el número ingresado
     */
    private static Integer solicitaNumeroTabla () {
        System.out.println("Por favor digte el número de la tabla a visualizar:" );
        return inputInt.nextInt();
    }

}
