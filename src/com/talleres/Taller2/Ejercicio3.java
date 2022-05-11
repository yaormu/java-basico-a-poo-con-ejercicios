package com.talleres.Taller2;

import java.util.Scanner;

/**
 * Esta clase evalua la edad de la persona para indicar si puede o no ingresar a una fiesta
 *
 * @author Yamid Ortiz Muñoz <yaormu@gmail.com>
 * @version 1.0.0
 */

public class Ejercicio3 {

    /**
     * Nombre de la persona
     */
    private String nombre;

    /**
     * Apellido  de la persona
     */
    private String apellido;

    /**
     * Edad de la persona
     */
    private int edad;


    /**
     * Obtiene el resultado de ejecución del método capturaEdad
     */
    public void Ejercicio3() {

        solicitarNombre();
        nombre = capturaDato();

        solicitarApellido();
        apellido = capturaDato();

        solicitarEdad();
        edad = capturarEdad();

        System.out.println(evaluaIngresoFiesta(nombre, apellido, edad));
    }

    /**
     * Solicita el nombre de la persona
     */
    private void solicitarNombre() {
        System.out.println("Ingrese su nomnbre");
    }

    /**
     * Solicita el nombre de la persona
     */
    private void solicitarApellido() {
        System.out.println("Ingrese sus apellidos");
    }

    /**
     * Solicita la edad de la persona
     */
    private void solicitarEdad() {
        System.out.println("Ingrese su edad");
    }

    /**
     * Captura y devuelve los datos ingresados
     *
     * @return devuelve los datos capturados por consola
     */
    private String capturaDato() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
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
     * Captura daots basicos de la persona para evaluar el ingreso a la fiesta
     *
     * @return muestrar el resultado si la persona puedo o no ingresar a la fiesta
     */
    private String evaluaIngresoFiesta(String nombre, String apellido, int edad) {
        if (edad >= 18) {
            return nombre + " " + apellido + " usted es mayor de edad, por lo tanto puede entrar a la fiesta";
        }
        else if (edad < 18 && edad >= 0) {
            return nombre + " " + apellido + " usted es menor de edad, por lo tanto, no puede entrar a la fiesta, por favor devuélvase a su casa.";
        }
        else {
            return "No puedes tener edad menor a 0";
        }
    }
}
