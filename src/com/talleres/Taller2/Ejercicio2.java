package com.talleres.Taller2;

import java.util.Scanner;

/**
 * Esta clase evalua la edad de la persona para validar si es menor de edad
 *
 * @author Yamid Ortiz Muñoz <yaormu@gmail.com>
 * @version 1.0.0
 */

public class Ejercicio2 {

    /**
     * Edad de la persona
     */
    private int edad;


    /**
     * Obtiene el resultado de ejecución del método capturaEdad
     */
    public void Ejercicio2() {

        solicitarEdad();
        edad = capturarEdad();

        System.out.println(evaluarEdad(edad));
    }

    /**
     * Solicita la edad de la persona
     */
    private void solicitarEdad() {

        System.out.println("Ingrese por favor la edad");
    }

    /**
     * Captura y devuelve el dato edad
     *
     * @return devuelve los datos capturados por consola
     */
    private int capturarEdad() {
        try {
            Scanner input = new Scanner(System.in);
            return input.nextInt();
        }
        catch (Exception e) {
            System.out.println("Error: solo digitar números enteros");
        }

        return 0;
    }

    /**
     * Captura y devuelve el dato edad si es un niño
     *
     * @return da si la persona es adulta o un niño
     */
    private String evaluarEdad(int edad) {
        if (edad >= 18) {
            return "Usted es un adulto";
        }
        else if (edad < 18 && edad >= 0) {
            return "Usted aún es un niño(a)";
        }
        else {
            return "No puedes tener edad menor a 0";
        }
    }
}
