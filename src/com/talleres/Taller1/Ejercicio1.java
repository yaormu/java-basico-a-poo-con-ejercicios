package com.talleres.Taller1;

import java.util.Scanner;

/**
 * Esta clase solicita un nombre y apellido de una persona
 *
 * @author Yamid Ortiz Muñoz <yaormu@gmail.com>
 * @version 1.0.0
 */

public class Ejercicio1 {

    /**
     * Nombre de la persona
     */
    private String nombre;

    /**
     * Apellido  de la persona
     */
    private String apellido;

    /**
     * Obtiene los resultados de la ejecución del métodos capturaDato
     */
    public void Ejercicio1() {

        solicitarNombre();
        nombre = capturaDato();

        solicitarApellido();
        apellido = capturaDato();
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
     * Captura y devuelve los datos ingresados
     *
     * @return devuelve los datos capturados por consola
     */
    private String capturaDato() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
}
