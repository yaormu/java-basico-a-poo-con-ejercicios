package com.talleres.Taller2;

import java.util.Scanner;

/**
 * Esta clase realiza el registro de ingreso y salida de motos a un taller
 *
 * @author Yamid Ortiz Muñoz <yaormu@gmail.com>
 * @version 1.0.0
 */

public class Ejercicio6 {

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
     * Captura la ópcion ingresada por el usuario al taller de motos y muestra el resultado
     */
    public void Ejercicio6() {
        opcion = menuTaller();
        procesoTaller(opcion);
    }

    /**
     * Captura y devuelve de las acciónes a realizar de acuerdo para el ingreso o retiro
     *
     * @param opcion Opción seleccionada por el usuario para ingreso o retiro
     * @since 1.0.0
     */
    private static void procesoTaller(int opcion) {

        if (opcion == 1) {

            System.out.println("Menú ingreso de motocicleta");
            rtaIngresoMoto(capturaNombres(), caracteristicasMoto(), observacionesMoto());

        } else if (opcion == 2) {

            System.out.println("Menú registro salida de motocicleta:");
            rtaSalidaMoto(capturaNombres(), caracteristicasMoto(), observacionesMoto(), arreglosMoto());

        } else {
            System.out.println("No existe dicho producto u/o ópcion!!");
        }
    }

    /**
     * Mostrar el ménu principal con las 2 opciones del taller ingreso o salida
     * @return retorna la captura de la opción elegida
     */
    private static Integer menuTaller () {
        System.out.println("Menú Taller El Maquinista:\n " +
                "Seleccione alguna opción:\n " +
                "1. Ingreso motocicleta\n " +
                "2. Retiro de motocicleta");
        return inputInt.nextInt();
    }

    /**
     * Capturar los datos principales del propietario moto
     * @return regresa los datos del propietario
     */
    private static String capturaNombres () {
        System.out.println("Digite nombres completos del propietario de la moto:");
        return inputString.nextLine();
    }

    /**
     * Solicita los datos de la moto (Marca, Color, Cilindraje entre otras)
     * @return retorna los caracteristicas de la moto
     */
    private static String caracteristicasMoto () {
        System.out.println("Digite caracteristicas de la moto (Ej. Marca, Cilindraje, Color...):");
        return inputString.nextLine();
    }

    /**
     * Se captura las observaciones indicadas por el cliente cuando ingresa y salida observaciones del mecanico
     * @return retorna las observaciones manifestadas por cliente o mecanico
     */
    private static String observacionesMoto () {
        System.out.println("Digite las observaciones de la moto:");
        return inputString.nextLine();
    }

    /**
     * Dar a conocer los arreglos efectuados por el mecanico
     * @return retorna los arreglos hecho a la moto
     */
    private static String arreglosMoto () {
        System.out.println("Digite los arreglos realizados por el mecanico:");
        return inputString.nextLine();
    }

    /**
     * Se capturan los datos de ingreso al taller y se muestra informe del ingreso de la moto
     * @param propietario datos dueño moto
     * @param caracteristicas datos moto, como color, placa, marca etc
     * @param observaciones datos manifestados por el cliente sobre la moto
     */
    private static void rtaIngresoMoto (String propietario, String caracteristicas, String observaciones) {
        System.out.println("La motocicleta ingresa con los siguientes datos:\n" +
            "Propietario: " + propietario + "\n" +
            "Caracteristicas: " + caracteristicas + "\n" +
            "Novedades indicadas por cliente: " + observaciones
        );
    }

    /**
     * Se capturan los datos de salida de la moto con datos básicos y novedades encontradas
     * @param propietario dato dueño de la moto
     * @param caracteristicas propiedades de la moto como color, marca, placa etc
     * @param observaciones datos de las observaciones encontradas por el mecanico
     * @param arreglo datos de los ajustes aplicado a la moto
     */
    private static void rtaSalidaMoto (String propietario, String caracteristicas, String observaciones, String arreglo) {
        System.out.println("La motocicleta se retira con los siguientes datos:\n" +
                "Propietario: " + propietario + "\n" +
                "Caracteristicas: " + caracteristicas + "\n" +
                "Novedades indicadas por mecanico: " + observaciones + "\n" +
                "Arreglos realizados a la moto: " + arreglo
        );
    }
}