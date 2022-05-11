package com.talleres.Taller1;

import java.util.Scanner;

/**
 * Clase para obtener los datos básicos de un mascota
 * para luego dar a conocer la información
 *
 * @author Yamid Ortiz Muñoz <yaormu@gmail.com>
 * @version 1.0.0
 */

public class Ejercicio5 {

    /**
     * Nombre de la persona
     */
    private String nombres;

    /**
     * Nombre de la mascota
     */
    private String nombreMascota;

    /**
     * Tipo de la mascota
     */
    private String tipoMascota;

    /**
     * Edad de la mascota
     */
    private int edadMascota;

    /**
     * Input obtener dato ingresado por la persona
     */
    private Scanner input;

    /**
     * Obtiene resultados de la ejecución de métodos y asigna dicho valor a los atributos mascota
     */
    public void Ejercicio5() {
        input = new Scanner(System.in);

        System.out.println("Datos Dueño:");
        solicitarNombre();
        nombres = capturaDatoString();

        System.out.println("Datos Mascota:");
        solicitarNombre();
        nombreMascota = capturaDatoString();
        solicitarTipoMascota();
        tipoMascota = capturaDatoString();
        solicitarEdad();
        edadMascota = capturaDatoInt();

        System.out.println(datosMascota(nombreMascota, tipoMascota, edadMascota, nombres));
    }

    /**
     * Solicita el nombre de la mascota
     */
    private void solicitarNombre() {
        System.out.println("Por favor digite nombre");
    }


    /**
     * Solicita el tipo de mascota
     */
    private void solicitarTipoMascota() {
        System.out.println("Por favor el tipo de mascota");
    }

    /**
     * Solicita la edad de mascota
     */
    private void solicitarEdad() {
        System.out.println("Por favor la edad");
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
     * Obtiene los datos de la persona, padre y madre
     *
     * @return devuelve los datos de la mascota y su dueño
     * @param nombres Obtiene el valor del nombre dueño mascota
     * @param nombreMascota Obtiene el valor del nombre de la mascota
     * @param edadMascota Obtiene el valor de la edad de la mascota
     * @param tipoMascota Obtiene el valor del tipo de mascota
     */
    private String datosMascota(String nombreMascota, String tipoMascota, int edadMascota, String nombres) {
        return (nombreMascota + " es un(a) " + tipoMascota + ", el cual, tiene " + edadMascota + " años de edad y " + nombres + " es actualmente su dueño(a).");
    }
}