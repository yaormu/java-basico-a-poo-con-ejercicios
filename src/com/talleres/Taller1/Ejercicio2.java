package com.talleres.Taller1;

import java.util.Scanner;

/**
 * Clase para obtener los datos básicos personales de una persona
 *
 * @author Yamid Ortiz Muñoz <yaormu@gmail.com>
 * @version 1.0.0
 */

public class Ejercicio2 {

    /**
     * Nombre de la persona
     */
    private String nombre;

    /**
     * Apellido de la persona
     */
    private String apellido;

    /**
     * Edad de la persona
     */
    private int edad;

    /**
     * Estatura de la persona
     */
    private double estatura;

    /**
     * Input obtener dato ingresado por la persona
     */
    private Scanner input;

    /**
     * Obtiene los resultados de la ejecución del métodos y asigna dicho valor a los atributos
     */
    public void Ejercicio2() {
        input = new Scanner(System.in);

        solicitarNombre();
        nombre = capturaDatoString();

        solicitarApellido();
        apellido = capturaDatoString();

        solicitarEdad();
        try {
            edad = capturaDatoInt();
        }catch (Exception e) {
            System.out.println("Error: Sólo digitar números enteros");
        }

        solicitarAltura();
        try {
            estatura = capturaDatoDouble();
        }catch (Exception e) {
            System.out.println("Error: Sólo digitar números double");
        }



    }

    /**
     * Solicita el nombre de la persona
     */
    private void solicitarNombre() {
        System.out.println("Por favor digite su nombre");
    }

    /**
     * Solicita el apellido de la persona
     */
    private void solicitarApellido() {
        System.out.println("Por favor digite su apellido");
    }

    /**
     * Solicita la edad de la persona
     */
    private void solicitarEdad() {
        System.out.println("Por favor digite su edad");
    }

    /**
     * Solicita la estatura de la persona
     */
    private void solicitarAltura() {
        System.out.println("Por favor digite su altura");
    }

    /**
     * Captura y devuelve los datos ingresados tipo caracteres
     *
     * @return devuelve los datos capturados por consola
     */
    private String capturaDatoString() {
        return input.nextLine();
    }

    /**
     * Captura y devuelve los datos ingresados tipo entero
     *
     * @return devuelve los datos capturados por consola
     */
    private int capturaDatoInt() {
        return input.nextInt();
    }

    /**
     * Captura y devuelve los datos ingresados tipo double
     *
     * @return devuelve los datos capturados por consola
     */
    private double capturaDatoDouble() {
        return input.nextDouble();
    }

}