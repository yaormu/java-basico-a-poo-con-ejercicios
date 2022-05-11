package com.talleres.Taller1;

import java.util.Scanner;

/**
 * Clase para obtener los datos de una ciudad capital y pais, y dar a conocer los datos digitados por el usuario
 *
 * @author Yamid Ortiz Muñoz <yaormu@gmail.com>
 * @version 1.0.0
 */

public class Ejercicio4 {

    /**
     * Nombre de la ciudad
     * Nombre del pais
     */
    private String ciudad, pais;

    /**
     * Input obtener dato ingresados
     */
    private Scanner input;

    /**
     * Obtiene los resultados de la ejecución del métodos y asigna dicho valor a los atributos
     */
    public void Ejercicio4() {
        input = new Scanner(System.in);

        solicitarCiudad();
        ciudad = capturaDatoString();
        solicitarPais();
        pais = capturaDatoString();

        System.out.println(datosCiudadPais(ciudad, pais));
    }

    /**
     * Solicita el nombre de la ciudad
     */
    private void solicitarCiudad() {
        System.out.println("Por favor digite ciudad");
    }

    /**
     * Solicita el nombre del país
     */
    private void solicitarPais() {
        System.out.println("Por favor digite país");
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
     * Obtiene los datos de la ciudad y país
     *
     * @param ciudad Obtiene el valor del la ciudad
     * @param pais   Obtiene el valor del país
     * @return devuelve los datos de la ciudad y país
     */
    private String datosCiudadPais(String ciudad, String pais) {
        return ("La ciudad " + ciudad + ", es la capital del país " + pais);
    }


}