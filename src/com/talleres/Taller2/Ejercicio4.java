package com.talleres.Taller2;

import java.util.Scanner;

/**
 * Esta clase muestrar las opciones de una tienda de peliculas para consultar, alquilar o recibir
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
     * Input obtener dato String
     */
    private static Scanner inputString = new Scanner(System.in);

    /**
     * Opción seleccionada por el usuario
     */
    private int menu;

    /**
     * Captura la ópcion ingresada por el usuario y muestra el resultado
     */
    public void Ejercicio4() {

        mostrarMenu();
        menu = capturaOpcion();

        menuVideoTienda(menu);
    }

    /**
     * Muestra el ménu de la video tienda
     */
    private void mostrarMenu() {
        System.out.println("Bienvenido a la tienda de alquiler del barrio el porvenir\n\n Eliga alguna opción:\n 1. alquilar película \n 2. consultar películas disponibles\n 3. recibir película en la video tienda");
    }

    /**
     * Captura y devuelve la opcion seleccionada
     *
     * @return retorna la opción seleccionada
     */
    private int capturaOpcion() {
        return inputInt.nextInt();
    }

    /**
     * Captura y devuelve la opció selecionada del ménu por consola
     *
     * @param opcion Opción seleccionada por la persona a evaluar
     * @since 1.0.0
     */

    private static void menuVideoTienda(int opcion) {
        /**
         * Captura las opciones de selección y anotación elegidas por el usuario
         */
        int seleccion, anotacion;


        switch (opcion) {
            case 1:
                seleccion = capturaMenuPrincipal();
                respuestaSeleccionMenu(seleccion);
                break;
            case 2:
                menuPeliculasDisponibles();
                break;
            case 3:
                anotacion = capturaAnotacionRecibidoPelicula();
                respuestaSeleccionAnotacion(anotacion);

                break;
            default:
                System.out.println("Opcion incorrecta");

        }
        System.out.println("");
    }

    /**
     * Mostrar el ménu de opciones principal y solicita elegir una de estas
     * @return retorna la captura de la opción elegida
     */
    private static Integer capturaMenuPrincipal () {
        System.out.println("Cual pelicula de las opciones desea alquilar:\n\n 1. Avengers\n 2. Liga de la Justicia\n 3. X-Men\n 4. Hombres de Negro");
        return inputInt.nextInt();
    }

    /**
     * Mostrar el ménu de peliculas disponibles
     * @return retorna las peliculas disponibles
     */
    private static void menuPeliculasDisponibles() {
        System.out.println("Las peliculas disponibles en este momento son:\n\n 1. Avengers\n 2. Liga de la Justicia\n 3. X-Men\n 4. Hombres de Negro");
    }

    /**
     * Muestra el ménu para ingresar las observaciones de la devolución de la pelicula
     * @return captura si hay o no novedad en la pelicula ingresada
     */
    private static int capturaAnotacionRecibidoPelicula () {
        System.out.println("Menú recibir película en la video tienda\n\n Opcion 1 - Realizar anotaciones/novedades de la pelicula recibida\n Opcion 2 - No Realizar ninguna anotacion ó novedad");
        return inputInt.nextInt();
    }

    /**
     * Dar a conocer la opción seleccionada de la pelicual a alquilar
     * @param seleccion opción elegida por el usuario
     * @return Regresa el título de la pelicula seleccionada
     */
    private static String respuestaSeleccionMenu (int seleccion) {
        if (seleccion == 1) {
            System.out.println("Elegiste alquilar Avengers");
        } else if (seleccion == 2) {
            System.out.println("Elegiste alquilar Liga de la Justicia");
        } else if (seleccion == 3) {
            System.out.println("Elegiste alquilar X-Men");
        } else if (seleccion == 4) {
            System.out.println("Elegiste alquilar Hombres de Negro");
        } else {
            System.out.println("No existe dicha ópcion!!");
        }
        return null;
    }

    /**
     * Mostrar le respuesta de la opción seleccionada para las novedad encontrada
     * @param anotacion opción a elegir segun la novedad
     * @return Devuelve respuesta de acuerdo a la opción seleccionada
     */
    private static String respuestaSeleccionAnotacion (int anotacion) {
        if (anotacion == 1) {
            System.out.println("Digite la novedad encontrada por favor:");
            return inputString.nextLine();
        } else {
            System.out.println("Ninguna novedad con la pelicula");
        }
        return null;
    }
}