package com.talleres.Taller3;

import java.io.IOException;
import java.util.Scanner;

/**
 * Esta clase permite el control de un parqueadero ingreso, salida y busqueda de este vehiculo
 *
 * @author Yamid Ortiz Muñoz <yaormu@gmail.com>
 * @version 1.0.0
 */
public class Ejercicio7 {

    /**
     * Bandera que mantendra un ciclo Do While
     */
    private static boolean bandera = true;

    /**
     * Opción que digitara el usuario
     */
    private static int opcion;

    /**
     * cantidad maxima de carros
     */
    private static int cantidadCarros;

    /**
     * Obtener el dato string digita para nombres de los propietarios de carros
     */
    private static String nombreCliente1, nombreCliente2, nombreCliente3, nombreCliente4, nombreCliente5;

    /**
     * Obtener el dato int digitado para número de contacto del propietario del vehiculo
     */
    private static int numContacto1, numContacto2, numContacto3, numContacto4, numContacto5;

    /**
     * Obtener el dato string digita para las placas de los carros
     */
    private static String placa, placa1, placa2, placa3, placa4, placa5;

    /**
     * Obtener el dato string digita para las marcas de los carros
     */
    private static String marca1, marca2, marca3, marca4, marca5;

    /**
     * Input obtener dato Int
     */
    private static Scanner inputInt = new Scanner(System.in);

    /**
     * Input obtener dato String
     */
    private static Scanner inputString = new Scanner(System.in);

    /**
     * Mostrar el ménu del parqueaderoos y las respectivas opciones ingreso, buscar y salida de carros
     */
    public void Ejercicio7() throws IOException {

        do {
            menuParqueadero();
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
    private static void menuParqueadero() {
        System.out.println("-------------------");
        System.out.println(
                "Bienvenido al parqueadero el guardian:\n" +
                        "1. Ingreso de vehiculo al parqueadero\n" + "2. Consultar vehiculo en parqueadero\n" +
                        "3. Salida del vehiculo del parqueadero\n" +  "4. Salir del sistema\n"
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
                cantidadCarros = solicitaCantidadCarros();

                switch (cantidadCarros) {
                    case 1:
                        System.out.println("Registro #1:");
                        placa1 = solicitarPlaca();
                        marca1 = solicitarMarca();
                        nombreCliente1 = solicitarNombre();
                        numContacto1 = solicitarNumero();
                        break;
                    case 2:
                        System.out.println("Registro #1:");
                        placa1 = solicitarPlaca();
                        marca1 = solicitarMarca();
                        nombreCliente1 = solicitarNombre();
                        numContacto1 = solicitarNumero();

                        System.out.println("Registro #2:");
                        placa2 = solicitarPlaca();
                        marca2 = solicitarMarca();
                        nombreCliente2 = solicitarNombre();
                        numContacto2 = solicitarNumero();
                        break;
                    case 3:
                        System.out.println("Registro #1:");
                        placa1 = solicitarPlaca();
                        marca1 = solicitarMarca();
                        nombreCliente1 = solicitarNombre();
                        numContacto1 = solicitarNumero();

                        System.out.println("Registro #2:");
                        placa2 = solicitarPlaca();
                        marca2 = solicitarMarca();
                        nombreCliente2 = solicitarNombre();
                        numContacto2 = solicitarNumero();

                        System.out.println("Registro #3:");
                        placa3 = solicitarPlaca();
                        marca3 = solicitarMarca();
                        nombreCliente3 = solicitarNombre();
                        numContacto3 = solicitarNumero();
                        break;
                    case 4:
                        System.out.println("Registro #1:");
                        placa1 = solicitarPlaca();
                        marca1 = solicitarMarca();
                        nombreCliente1 = solicitarNombre();
                        numContacto1 = solicitarNumero();

                        System.out.println("Registro #2:");
                        placa2 = solicitarPlaca();
                        marca2 = solicitarMarca();
                        nombreCliente2 = solicitarNombre();
                        numContacto2 = solicitarNumero();

                        System.out.println("Registro #3:");
                        placa3 = solicitarPlaca();
                        marca3 = solicitarMarca();
                        nombreCliente3 = solicitarNombre();
                        numContacto3 = solicitarNumero();

                        System.out.println("Registro #4:");
                        placa4 = solicitarPlaca();
                        marca4 = solicitarMarca();
                        nombreCliente4 = solicitarNombre();
                        numContacto4 = solicitarNumero();
                        break;
                    case 5:
                        System.out.println("Registro #1:");
                        placa1 = solicitarPlaca();
                        marca1 = solicitarMarca();
                        nombreCliente1 = solicitarNombre();
                        numContacto1 = solicitarNumero();

                        System.out.println("Registro #2:");
                        placa2 = solicitarPlaca();
                        marca2 = solicitarMarca();
                        nombreCliente2 = solicitarNombre();
                        numContacto2 = solicitarNumero();

                        System.out.println("Registro #3:");
                        placa3 = solicitarPlaca();
                        marca3 = solicitarMarca();
                        nombreCliente3 = solicitarNombre();
                        numContacto3 = solicitarNumero();

                        System.out.println("Registro #4:");
                        placa4 = solicitarPlaca();
                        marca4 = solicitarMarca();
                        nombreCliente4 = solicitarNombre();
                        numContacto4 = solicitarNumero();

                        System.out.println("Registro #5:");
                        placa5 = solicitarPlaca();
                        marca5 = solicitarMarca();
                        nombreCliente5 = solicitarNombre();
                        numContacto5 = solicitarNumero();
                        break;
                    default:
                        System.out.println("Solo se permite un máximo de 5 ingresos de vehiculos");
                        break;
                }
                return true;
            case 2:
                placa = solicitarPlaca();

                if (placa.equalsIgnoreCase(placa1)) {
                    System.out.println("Vehiculo encontrado:\n" +
                            "Nombres: " + nombreCliente1 + "\n" +
                            "Número Telefonico: " + numContacto1 + "\n" +
                            "Placa: " + placa1 + "\n" +
                            "marca: " + marca1
                    );
                }
                else if (placa.equalsIgnoreCase(placa2)) {
                    System.out.println("Vehiculo encontrado:\n" +
                            "Nombres: " + nombreCliente2 + "\n" +
                            "Número Telefonico: " + numContacto2 + "\n" +
                            "Placa: " + placa2 + "\n" +
                            "marca: " + marca2
                    );
                }
                else if (placa.equalsIgnoreCase(placa3)) {
                    System.out.println("Vehiculo encontrado:\n" +
                            "Nombres: " + nombreCliente3 + "\n" +
                            "Número Telefonico: " + numContacto3 + "\n" +
                            "Placa: " + placa3 + "\n" +
                            "marca: " + marca3
                    );
                }
                else if (placa.equalsIgnoreCase(placa4)) {
                    System.out.println("Vehiculo encontrado:\n" +
                            "Nombres: " + nombreCliente4 + "\n" +
                            "Número Telefonico: " + numContacto4 + "\n" +
                            "Placa: " + placa4 + "\n" +
                            "marca: " + marca4
                    );
                }
                else if (placa.equalsIgnoreCase(placa5)) {
                    System.out.println("Vehiculo encontrado:\n" +
                            "Nombres: " + nombreCliente5 + "\n" +
                            "Número Telefonico: " + numContacto5 + "\n" +
                            "Placa: " + placa5 + "\n" +
                            "marca: " + marca5
                    );
                }
                else {
                    System.out.println("Vehiculo no encontrado!!");
                }
                return true;
            case 3:
                System.out.println("Digite la placa del vehiculo a retirar:");
                placa = solicitarPlaca();

                if (placa.equalsIgnoreCase(placa1)) {
                    System.out.println("Vehiculo retirado");
                    placa1 = "";
                    marca1 = "";
                    nombreCliente1 = "";
                    numContacto1 = 0;
                }
                else if (placa.equalsIgnoreCase(placa2)) {
                    System.out.println("Vehiculo retirado");
                    placa2 = "";
                    marca2 = "";
                    nombreCliente2 = "";
                    numContacto2 = 0;
                }
                else if (placa.equalsIgnoreCase(placa3)) {
                    System.out.println("Vehiculo retirado");
                    placa3 = "";
                    marca3 = "";
                    nombreCliente3 = "";
                    numContacto3 = 0;
                }
                else if (placa.equalsIgnoreCase(placa4)) {
                    System.out.println("Vehiculo retirado");
                    placa4 = "";
                    marca4 = "";
                    nombreCliente4 = "";
                    numContacto4 = 0;
                }
                else if (placa.equalsIgnoreCase(placa5)) {
                    System.out.println("Vehiculo retirado");
                    placa5 = "";
                    marca5 = "";
                    nombreCliente5 = "";
                    numContacto5 = 0;
                }
                else {
                    System.out.println("Vehiculo no encontrado para retiro!!");
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
     * Solicita la cantidad de carros a registrar
     * @return retorna el valor digitado por el usuario
     */
    private static int solicitaCantidadCarros () {
        System.out.println("Por favor la cantidad de carros a ingresar:");
        return inputInt.nextInt();
    }

    /**
     * Solicita el número del contacto del propietario
     * @return retorna el valor digitado por el usuario
     */
    private static int solicitarNumero () {
        System.out.println("Por favor digite número telefonico del propietario:" );
        return inputInt.nextInt();
    }

    /**
     * Solicita el nombre del propietario vehiculo
     * @return retorna el valor digitado por el usuario
     */
    private static String solicitarNombre () {
        System.out.println("Por favor digite nombre propietario:" );
        return inputString.nextLine();
    }

    /**
     * Solicita la placa del carro
     * @return retorna el valor digitado por el usuario
     */
    private static String solicitarPlaca () {
        System.out.println("Por favor digite la placa del carro:" );
        return inputString.nextLine();
    }

    /**
     * Solicita la marca del carro
     * @return retorna el valor digitado por el usuario
     */
    private static String solicitarMarca () {
        System.out.println("Por favor digite la marca del carro:" );
        return inputString.nextLine();
    }

}
