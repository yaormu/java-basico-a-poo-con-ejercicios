package com.talleres.Taller3;

import java.io.IOException;
import java.util.Scanner;

/**
 * Esta clase realiza simulacion de una agenda de contactos de celular para agregar, buscar y eliminar
 * @author Yamid Ortiz Muñoz <yaormu@gmail.com>
 * @version 1.0.0
 */
public class Ejercicio6 {

    /**
     * Bandera que mantendra un ciclo Do While
     */
    private static boolean bandera = true;

    /**
     * Opción que digitara el usuario
     */
    private static int opcion;

    /**
     * cantidad contactos a ingresar
     */
    private static int cantidadContactos;

    /**
     * Obtener el dato string digita para nombres de contacto
     */
    private static String nombreContacto, nombreContacto1, nombreContacto2, nombreContacto3;

    /**
     * Obtener el dato int digitado para número de contacto
     */
    private static int numContacto1, numContacto2, numContacto3;

    /**
     * Obtener el dato string digita para organizacion de contacto
     */
    private static String orgContacto1, orgContacto2, orgContacto3;

    /**
     * Input obtener dato Int
     */
    private static Scanner inputInt = new Scanner(System.in);

    /**
     * Input obtener dato String
     */
    private static Scanner inputString = new Scanner(System.in);

    /**
     * Mostrar el ménu agenda de contactos telefonicos y las respectivas opciones ingreso, buscar y eliminar
     */
    public void Ejercicio6() throws IOException {

        do {
            menuAgenda();
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
     * Muestra las opciones de agenda telefonica
     */
    private static void menuAgenda() {
        System.out.println("-------------------");
        System.out.println(
            "Bienvenido a la agenda de contactos:\n" +
            "1. Registro de contacto\n" + "2. Buscar contacto\n" +
            "3. Eliminar contacto\n" +  "4. Salir del sistema\n"
        );
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
     * Captura y devuelve de acuerdo a la opción seleccionada
     * @param opcion Opción seleccionada por el usuario a evaluar
     * @return devuelve verdadero si la opción digita existe, en caso contrario falso, y mostrar el contenido de dicho objeto
     * @since 1.0.0
     */
    private static boolean evaluarOpcion(int opcion) throws IOException {
        switch (opcion) {
            case 1:
                cantidadContactos = solicitaCantidadContactos();

                switch (cantidadContactos) {
                    case 1:
                        System.out.println("Registro #1:");
                        numContacto1 = solicitarNumero();
                        nombreContacto1 = solicitarNombre();
                        orgContacto1 = solicitarOrganizacion();
                        break;
                    case 2:
                        System.out.println("Registro #1:");
                        numContacto1 = solicitarNumero();
                        nombreContacto1 = solicitarNombre();
                        orgContacto1 = solicitarOrganizacion();

                        System.out.println("Registro #2:");
                        numContacto2 = solicitarNumero();
                        nombreContacto2 = solicitarNombre();
                        orgContacto2 = solicitarOrganizacion();
                        break;
                    case 3:
                        System.out.println("Registro #1:");
                        numContacto1 = solicitarNumero();
                        nombreContacto1 = solicitarNombre();
                        orgContacto1 = solicitarOrganizacion();

                        System.out.println("Registro #2:");
                        numContacto2 = solicitarNumero();
                        nombreContacto2 = solicitarNombre();
                        orgContacto2 = solicitarOrganizacion();

                        System.out.println("Registro #3:");
                        numContacto3 = solicitarNumero();
                        nombreContacto3 = solicitarNombre();
                        orgContacto3 = solicitarOrganizacion();
                        break;
                    default:
                        System.out.println("Solo se permite un máximo de 3 registros");
                        break;
                }
                return true;
            case 2:
                nombreContacto = solicitarNombre();

                if (nombreContacto.equalsIgnoreCase(nombreContacto1)) {
                    System.out.println("Contacto encontrado:\n" +
                            "Nombres: " + nombreContacto1 + "\n" +
                            "Número Telefonico: " + numContacto1 + "\n" +
                            "Organización: " + orgContacto1
                    );
                }
                else if (nombreContacto.equalsIgnoreCase(nombreContacto2)) {
                    System.out.println("Contacto encontrado:\n" +
                            "Nombres: " + nombreContacto2 + "\n" +
                            "Número Telefonico: " + numContacto2 + "\n" +
                            "Organización: " + orgContacto2
                    );
                }
                else if (nombreContacto.equalsIgnoreCase(nombreContacto3)) {
                    System.out.println("Contacto encontrado:\n" +
                            "Nombres: " + nombreContacto3 + "\n" +
                            "Número Telefonico: " + numContacto3 + "\n" +
                            "Organización: " + orgContacto3
                    );
                }
                else {
                    System.out.println("Contacto no encontrado!!");
                }
                return true;
            case 3:
                System.out.println("Eliminar contacto registrados:");
                nombreContacto = solicitarNombre();

                if (nombreContacto.equalsIgnoreCase(nombreContacto1)) {
                    System.out.println("Contacto eliminado");
                    nombreContacto1 = "";
                }
                else if (nombreContacto.equalsIgnoreCase(nombreContacto2)) {
                    System.out.println("Contacto eliminado");
                    nombreContacto2 = "";
                }
                else if (nombreContacto.equalsIgnoreCase(nombreContacto3)) {
                    System.out.println("Contacto eliminado");
                    nombreContacto3 = "";
                }
                else {
                    System.out.println("Contacto no encontrado!!");
                }
                return true;
            case 4:
                return false;
            default:
                System.out.println("Opcion incorrecta");
                System.in.read();
        }
        return true;
    }

    /**
     * Solicita la cantidad de contactos a registrar
     * @return retorna el valor digitado por el usuario
     */
    private static int solicitaCantidadContactos () {
        System.out.println("Por favor la cantidad de contactos a registrar:");
        return inputInt.nextInt();
    }

    /**
     * Solicita el número del contacto
     * @return retorna el valor digitado por el usuario
     */
    private static int solicitarNumero () {
        System.out.println("Por favor digite número de contacto:" );
        return inputInt.nextInt();
    }

    /**
    * Solicita el nombre del contacto
    * @return retorna el valor digitado por el usuario
    */
    private static String solicitarNombre () {
        System.out.println("Por favor digite nombre contacto:" );
        return inputString.nextLine();
    }

    /**
    * Solicita la organizacion del contacto
    * @return retorna el valor digitado por el usuario
    */
    private static String solicitarOrganizacion () {
        System.out.println("Por favor digite la organización:" );
        return inputString.nextLine();
    }

}
