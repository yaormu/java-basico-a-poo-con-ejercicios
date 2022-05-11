package com.talleres.Taller2;

import java.util.Scanner;

/**
 * Esta clase evalua la edad de la persona para validar si es mayor de edad
 *
 * @author Yamid Ortiz Muñoz <yaormu@gmail.com>
 * @version 1.0.0
 */

public class Ejercicio1 {

    /**
     * Edad de la persona
     */
    private int edad;


    /**
     * Obtiene el resultado de ejecución del método capturaEdad
     */
    public void Ejercicio1() {

        solicitarEdad();
        edad = capturarEdad();

        System.out.println(evaluarEdad(edad));
    }

    /**
     * Solicita la edad de la persona
     */
    private void solicitarEdad() {
        System.out.println("Por favor digite su edad");
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
     * Captura y devuelve el dato edad
     *
     * @return informando si la persona es mayor de edad
     */
    private String evaluarEdad(int edad) {
        if (edad >= 18) {
            return "Eres mayor de edad";
        }
        else if (edad < 18 && edad >= 0) {
            return "Eres menor de edad";
        }
        else {
            return "No puedes tener edad menor a 0";
        }
    }
}
