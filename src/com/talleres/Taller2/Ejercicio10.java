package com.talleres.Taller2;

import java.util.Scanner;

/**
 * Esta clase para llevar las cuentas de un usuario de "Su Banco Fiel"
 *
 * @author Yamid Ortiz Muñoz <yaormu@gmail.com>
 * @version 1.0.0
 */

public class Ejercicio10 {

    /**
     * Datos nombres del cliente
     */
    private static String cliente;

    /**
     * Cantidad inicial en cta
     */
    private static int cantidad;

    /**
     * Valor de ingreso a la cta
     */
    private static int ingreso;


    /**
     * valor del retiro de la cta
     */
    private static int retiro;

    /**
     * valor saldo de la cta
     */
    private static int saldo;

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
     * Captura y muestra la ópcion para el manejo de la cta de ahorro cliente
     */
    public void Ejercicio10() {

        System.out.println("Bienvenido a su Banco Fiel:");

        cliente = nombresClienteCta();

        cantidad = consignarCtaAhorro();

        opcion = menuCta();
        accionCta(opcion, cantidad);
    }

    /**
     * De acuerdo a la ópcion seleccionada mostrara las opciones de la cta ahorro del cliente
     *
     * @param opcion Opción seleccionada por el usuario
     * @since 1.0.0
     */
    private static void accionCta(int opcion, int saldo) {

        if (opcion == 1) {
            ingresoValorCta();
            ingreso = capturarInt();

            saldo = consignacion(ingreso);

        } else if (opcion == 2) {

            retiroCtaAhorro (saldo, retiro);

        }
        else if (opcion == 3) {

            saldoCta(saldo);
        }
        else {
            System.out.println("No existe dicho ópcion!!");
        }
    }

    /**
     * Mostrar el ménu de las opciones que tiene para la cta de ahorro el cliente
     * @return retorna la captura de la opción elegida
     */
    private static Integer menuCta () {
        System.out.println("Bienvenido al Ménu de Su Banco Fiel:\n " +
                "Seleccione la operación que desea realizar:\n " +
                "1. Consigar dinero\n 2. Retirar dinero\n 3. Consultar cuenta"
        );
        return inputInt.nextInt();
    }


    /**
     * Solicita valor ingresar a la cta ahorro
     */
    private static void ingresoValorCta () { System.out.println("Por favor ingrese el valor a consignar en la cuenta de ahorro:"); }


    /**
     * Consignar dinero a la cta de ahorro
     * @param ingreso valor a capturar e ingresar a la cta
     * @return devuelve el valor total consignado
     */
    private static int consignacion (int ingreso) {

        if (ingreso <= 0) {
            System.out.println("El valor no puede ser negativo o 0");
            cantidad = 0;
        } else {
            cantidad += ingreso;
        }
        return cantidad;
    }

    private static int saldoCta (int saldo) {
        System.out.println("El valor actual de la cuenta de ahorro es: $ " + saldo );
        return saldo;
    }

    private static int retiroCtaAhorro (int saldo, int retiro) {
        System.out.println("Ingese el valor a retirar:");
        retiro = inputInt.nextInt();

        if(retiro > saldo) {
            System.out.println("No hay saldo suficiente, consulte el capital de su cuenta");
            return saldo;
        } else if (retiro <= 0) {
            System.out.println("El retiro no puede ser igual o menor a 0");
            return saldo;
        } else if (retiro <= saldo) {
            System.out.println("Retir satisfactorio");
            return saldo - retiro;
        } else {
            System.out.println("Solo se puede ingresar solo números!!");
        }
        return saldo;
    }

    /**
     * Captura el dato int ingresado
     * @return devuelve los datos capturados por consola
     */
    private static int capturarInt() {
        return inputInt.nextInt();
    }

    /**
     * Captura el dato String ingresado
     * @return devuelve los datos capturados por consola
     */
    private static String capturarString() { return inputInt.nextLine(); }


    /**
     * Solicita y captura la consignación inicial de la cta
     * @return devuelve el valor consignado
     */
    private static Integer consignarCtaAhorro () {
        System.out.println("Ingrese a consignar en cuenta de ahorro:");
        return inputInt.nextInt();
    }

    /**
     * Solicita y captura los nombres del cliente
     * @return devuelve valor nombres capturado
     */
    private static String nombresClienteCta () {
        System.out.println("Ingrese nombres completo del cliente:");
        return inputString.nextLine();
    }

}
