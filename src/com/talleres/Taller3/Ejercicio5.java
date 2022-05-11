package com.talleres.Taller3;

import java.io.IOException;
import java.util.Scanner;

/**
 * Esta clase muestrar un ménu de ejucción infinita hasta que el usuario decida terminar
 *
 * @author Yamid Ortiz Muñoz <yaormu@gmail.com>
 * @version 1.0.0
 */
public class Ejercicio5 {

    /**
     * Bandera que mantendra un ciclo Do While
     */
    private static boolean bandera = true;

    /**
     * Opción que digitara el usuario
     */
    private static int opcion;

    /**
     * Obtener el dato string digita para el nombre
     */
    private static String nombre;

    /**
     * Input obtener dato String
     */
    private static Scanner inputString = new Scanner(System.in);

    /**
     * Mostrar el ménu infinito e interacción hasta desee terminar el proceso el usuario
     */
    public void Ejercicio5() throws IOException {

        do {
            menu();
            try {
                opcion = capturaOpcion();
            }
            catch (Exception e){
                System.out.println("Sólo se puede digitar números");
            }

            bandera = evaluarOpcion(opcion);
        } while (bandera == true);

    }

    /**
     * Muestra las opciones del ménu
     */
    private static void menu() {
        System.out.println("-------------------");
        System.out.println("Menú de usuario");
        System.out.println("1. Captura nombre");
        System.out.println("2. Saludar persona");
        System.out.println("3. Salir del sistema");
        System.out.println("-------------------");
    }

    /**
     * Capturar la opción seleccionada
     * @return retorna el valor seleccionado
     */
    private static int capturaOpcion() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    /**
     * Captura y devuelve la opció selecionada del ménu por consola
     *
     * @param opcion Opción seleccionada por la persona a evaluar
     * @return devuelve verdadero si la opción digita existe, en caso contrario falso, y mostrar el contenido de dicho objeto
     * @since 1.0.0
     */
    private static boolean evaluarOpcion(int opcion) throws IOException {
        switch (opcion) {
            case 1:
                nombre = solicitaNombre();
                return true;
            case 2:
                System.out.println("Hola, bienvido Sr(a) " + nombre);
                return true;

            case 3:
                return false;
            default:
                System.out.println("Opcion incorrecta");
                System.in.read();
        }
        return true;
    }

    /**
     * Solicita el nombre del usuario
     * @return retorna el valor digitado por el usuario
     */
    private static String solicitaNombre () {
        System.out.println("Por favor digite su nombre completo:" );
        return inputString.nextLine();
    }

}
