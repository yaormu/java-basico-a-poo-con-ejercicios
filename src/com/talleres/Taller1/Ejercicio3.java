package com.talleres.Taller1;

import java.util.Scanner;

/**
 * Clase para obtener los datos básicos personales de una persona y el de sus padres
 * para luego dar a conocer la información
 *
 * @author Yamid Ortiz Muñoz <yaormu@gmail.com>
 * @version 1.0.0
 */

public class Ejercicio3 {

    /**
     * Nombre de la persona
     */
    private String nombre, nombrePadre, nombreMadre;

    /**
     * Apellido de la persona
     */
    private String apellido, apellidoPadre, apellidoMadre;

    /**
     * Input obtener dato ingresado por la persona
     */
    private Scanner input;

    /**
     * Obtiene los resultados de la ejecución del métodos y asigna dicho valor a los atributos
     */
    public void Ejercicio3() {
        input = new Scanner(System.in);

        System.out.println("Datos Usuario:");
        solicitarNombre();
        nombre = capturaDatoString();
        solicitarApellido();
        apellido = capturaDatoString();

        System.out.println("Datos Padre:");
        solicitarNombre();
        nombrePadre = capturaDatoString();
        solicitarApellido();
        apellidoPadre = capturaDatoString();

        System.out.println("Datos Madre:");
        solicitarNombre();
        nombreMadre = capturaDatoString();
        solicitarApellido();
        apellidoMadre = capturaDatoString();

        System.out.println(datosMiosYPadres(nombre, apellido, nombrePadre, apellidoPadre, nombreMadre, apellidoMadre));
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
     * Captura y devuelve los datos ingresados tipo caracteres
     *
     * @return devuelve los datos capturados por consola
     */
    private String capturaDatoString() {
        return input.nextLine();
    }

    /**
     * Obtiene los datos de la persona, padre y madre
     *
     * @return devuelve los datos del usuario y sus padres
     * @param nombre Obtiene el valor del nombre ingresado
     * @param apellido Obtiene el valor del apellido ingrado
     * @param nombrePadre Obtiene el valor del nombre ingresado para el padre
     * @param apellidoPadre Obtiene el valor del apellido ingresado para el padre
     * @param nombreMadre Obtiene el valor del nombre ingresado para la madre
     * @param apellidoMadre Obtiene el valor del apellido ingresado para la madre
     */
    private String datosMiosYPadres(String nombre, String apellido, String nombrePadre, String apellidoPadre, String nombreMadre, String apellidoMadre) {
        return ("Yo " + nombre + " " + apellido + " " + " soy hijo de " + nombrePadre + " " + apellidoPadre + " y " + nombreMadre + " " + apellidoMadre);
    }


}