package com.talleres.Taller2;

import java.util.Scanner;

/**
 * Esta clase muestrar las opciones de facturar los productos de una droguería
 *
 * @author Yamid Ortiz Muñoz <yaormu@gmail.com>
 * @version 1.0.0
 */

public class Ejercicio5 {

    /**
     * Input obtener dato entero
     */
    private static Scanner inputInt = new Scanner(System.in);

    /**
     * Opción seleccionada por el usuario
     */
    private int opcion;

    /**
     * Captura la ópcion ingresada por el usuario y muestra el resultado
     */
    public void Ejercicio5() {

        opcion = menuDrogueria();

        menuFacturacionDrogueria(opcion);
    }

    /**
     * Captura y devuelve de acuerdo a opción selecionada del ménu muestra las opciones y resultados
     *
     * @param opcion Opción seleccionada por el usuario a evaluar y de acuerdo a esta mostrar resultados
     * @since 1.0.0
     */
    private static void menuFacturacionDrogueria(int opcion) {

        int seleccion;

        switch (opcion) {
            case 1:
                seleccion = productos();
                respuestaSeleccionMenu(seleccion);
                break;
            case 2:
                productosDisponibles();
                break;
            case 3:
                seleccion = productos();
                respuestaDevolucion(seleccion);
                break;
            default:
                System.out.println("Opcion incorrecta");

        }
    }


    /**
     * Mostrar el ménu de facturación de la drogueria
     * @return retorna la captura de la opción elegida
     */
    private static Integer menuDrogueria () {
        System.out.println("Bienvenido al Ménu de Droguería Mi Salud:\n\n " +
                "1. Compra de Producto\n " +
                "2. Consulta de Producto\n " +
                "3. Devolución de Producto");
        return inputInt.nextInt();
    }

    /**
     * Mostrar el ménu de productos de la drogueria
     * @return retorna la captura de la opción del producto elegido
     */
    private static Integer productos () {
        System.out.println(
                "Seleccione un producto de la lista:\n\n " +
                "1. Jarabe\n " +
                "2. Tapabocas\n " +
                "3. Alcohol\n"
        );
        return inputInt.nextInt();
    }

    /**
     * Mostrar listado productos de la drogueria
     */
    private static void productosDisponibles() {
        System.out.println(
                "Productos disponibles a la venta Droguería Mi Salud:\n\n " +
                "1. Jarabe\n " +
                "2. Tapa Bocas\n " +
                "3. Alcohol\n"
        );
    }

    /**
     * Dar a conocer la opciónes para la compra de productos de la drogueria
     * @param seleccion opción elegida del producto por el usuario
     */
    private static void respuestaSeleccionMenu(int seleccion) {

        int cantidad = 0, vrJarabe = 9000, vrTapabocas = 10000, vrAlcohol = 5000;
        String accion = "Venta";

        if (seleccion == 1) {

            cantidad = cantidadProducto();
            resultadoProducto (accion,"Jarabe", vrJarabe, cantidad);

        } else if (seleccion == 2) {

            cantidad = cantidadProducto();
            resultadoProducto (accion, "Tapabocas", vrTapabocas, cantidad);

        } else if (seleccion == 3) {

            cantidad = cantidadProducto();
            resultadoProducto (accion, "Alcohol", vrAlcohol, cantidad);

        } else {
            System.out.println("No existe dicho producto u/o ópcion!!");
        }
    }

    /**
     * Leer la cantidad del producto de la drogueria
     * @return devuelve la cantidad ingresada por el usuario
     */
    private static Integer cantidadProducto () {
        System.out.println("Indique la cantidad del producto:");
        return inputInt.nextInt();
    }

    /**
     * Dar a conocer la devolución del producto de la drogueria
     * @param seleccion opción elegida del producto a devolver
     */
    private static void respuestaDevolucion (int seleccion) {

        int cantidad = 0, vrJarabe = 9000, vrTapabocas = 10000, vrAlcohol = 5000;
        String accion = "Devolución";

        if (seleccion == 1) {

            cantidad = cantidadProducto();
            resultadoProducto (accion, "Jarabe", vrJarabe, cantidad);

        } else if (seleccion == 2) {

            cantidad = cantidadProducto();
            resultadoProducto (accion,"Tapabocas", vrTapabocas, cantidad);

        } else if (seleccion == 3) {

            cantidad = cantidadProducto();
            resultadoProducto (accion, "Alcohol", vrAlcohol, cantidad);

        } else {
            System.out.println("No existe dicho producto u/o ópcion!!");

        }
    }

    /**
     * Da a conocer el valor del producto adquirido o devolucion de este
     * @param accion proceso del producto si es devolucion o compra
     * @param nombreProducto nombre del producto
     * @param costoProducto costo unitario del producto
     * @param cantidadProducto cantidad de productos adquirir por el cliente
     */
    private static void resultadoProducto (String accion, String nombreProducto, int costoProducto, int cantidadProducto) {
        System.out.println(accion + " del producto " + nombreProducto + " por valor de $" + costoProducto * cantidadProducto);
    }
}