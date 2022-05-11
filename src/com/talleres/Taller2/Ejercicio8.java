package com.talleres.Taller2;

import java.util.Scanner;

/**
 * Esta clase realiza el registro de los pedidos de los clientes en cuanto a las tortas que
 * se realiza el pastelero Don Carlos
 *
 * @author Yamid Ortiz Muñoz <yaormu@gmail.com>
 * @version 1.0.0
 */

public class Ejercicio8 {

    /**
     * Sabor de la torta
     */
    private static String saborTorta;

    /**
     * Cantidad de la torta
     */
    private static int cantidadTorta;

    /**
     * Decoracion de la torta
     */
    private static String tipoDecoracion;

    /**
     * Precio de la torta
     */
    private static int precio;

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
    private int opcion;

    /**
     * Captura y muestra la ópcion ingresada para pedidos, ventas y stock de tortas
     */
    public void Ejercicio8() {
        opcion = menuPasteleria();
        accionPasteleria(opcion);
    }

    /**
     * De acuerdo a la ópcion seleccionada mostrara un nuevo proceso de registro, inventario
     * y venta de tortas
     *
     * @param opcion Opción seleccionada por el usuario del menu de la pasteleria
     * @since 1.0.0
     */
    private static void accionPasteleria(int opcion) {

        if (opcion == 1) {
            solicitudSabor();
            saborTorta = capturarString();

            solicitudPorcion();
            cantidadTorta = capturarInt();

            solicitudDecoracion();
            tipoDecoracion = capturarString();

            precioTorta();
            precio = capturarInt();

            ventaTorta (saborTorta, cantidadTorta, tipoDecoracion, precio);

        } else if (opcion == 2) {
            tortasDisponibles();
        }

        else {
            System.out.println("No existe dicho producto u/o ópcion!!");
        }
    }

    /**
     * Mostrar el ménu principal con las opciones de la pasteleria Don Carlos
     * @return retorna la captura de la opción elegida
     */
    private static Integer menuPasteleria () {
        System.out.println("Menú Pasteleria Don Carlos:\n " +
                "Seleccione alguna opción:\n " +
                "1. Registro venta y pedido\n " +
                "2. Consulta tortas disponibles en el momento\n"
        );
        return inputInt.nextInt();
    }


    /**
     * Solicita el sabor de la torta
     */
    private static void solicitudSabor() {
        System.out.println("Indique el sabor de la torta:");
    }

    /**
     * Solicita el valor de la torta
     */
    private static void precioTorta() {
        System.out.println("Indique el valor de la torta:");
    }

    /**
     * Solicita la cantidad/porciones de la torta
     */
    private static void solicitudPorcion() {
        System.out.println("Indique para cuantas personas seria la torta:");
    }

    /**
     * Solicita tipo decoracion de la torta
     */
    private static void solicitudDecoracion() {
        System.out.println("Indique que decoración desea para la torta:");
    }



    /**
     * Captura el dato string ingresado
     * @return devuelve los datos capturados por consola
     */
    private static String capturarString() {
        return inputString.nextLine();
    }

    /**
     * Captura el dato int ingresado
     * @return devuelve los datos capturados por consola
     */
    private static int capturarInt() {
        return inputInt.nextInt();
    }

    /**
     * Muestra las tortas disponibles
     */
    private static void tortasDisponibles () {
        System.out.println(
                "-------------------------------------------------\n" +
                "1. Torta de chocolate, para máximo 12 personas, con decoración de grado.\n" +
                "2. Torta de fresa, para máximo 15 personas, con decoración de cumpleaños.\n" +
                "3. Torta de vainilla, para máximo 10 personas, con decoración de bautizo.\n" +
                "4. Torta de chocolate, para máximo 22 personas, con decoración de matrimonio.\n" +
                "-------------------------------------------------\n"
        );
    }

    /**
     * Muestra el resultado de la venta de la torta
     * @param sabor sabor de la torta
     * @param porcion porciones equivalen a la cantidad de torta para personas
     * @param decoracion tipo de decoracion solicitado por el cliente
     * @param precio el valor de la torta
     */
    private static void ventaTorta (String sabor, int porcion, String decoracion, int precio) {
        System.out.println(
                "-------------------------------------------------\n" +
                "Caracteristicas de la venta de la torta:\n" +
                "Sabor: " + sabor + "\n" +
                "Cantidad de: " + porcion + " porciones\n" +
                "La decoración es alucive a: " + decoracion + "\n" +
                "El costo total de torta: $" + precio + "\n" +
                "-------------------------------------------------"
        );
    }
}
