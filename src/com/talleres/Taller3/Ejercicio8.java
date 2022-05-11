package com.talleres.Taller3;

import java.io.IOException;
import java.util.Scanner;

/**
 * Esta clase permite llevar el control de una escula automovilistica para ingreso, consulta y aprobación
 *
 * @author Yamid Ortiz Muñoz <yaormu@gmail.com>
 * @version 1.0.0
 */
public class Ejercicio8 {

    /**
     * Bandera que mantendra un ciclo Do While
     */
    private static boolean bandera = true;

    /**
     * Opción que digitara el usuario
     */
    private static int opcion;

    /**
     * cantidad maxima de usuarios
     */
    private static int cantidadUsuarios;

    /**
     * Obtener el dato string digita para nombres de los clientes
     */
    private static String nombreCliente1, nombreCliente2, nombreCliente3, nombreCliente4, nombreCliente5, nombreCliente6, nombreCliente7, nombreCliente8;

    /**
     * Obtener el dato int número de identificación de los clientes
     */
    private static int numeroDocumento, numdocumento1, numdocumento2, numdocumento3, numdocumento4, numdocumento5, numdocumento6, numdocumento7, numdocumento8;

    /**
     * Obtener el dato int número de calificación de los clientes
     */
    private static int calificacion1, calificacion2, calificacion3, calificacion4, calificacion5, calificacion6, calificacion7, calificacion8;

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
    public void Ejercicio8() throws IOException {

        do {
            menuEscuela();
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
     * Muestra las opciones del menú escuela automovilistica
     */
    private static void menuEscuela() {
        System.out.println("-------------------");
        System.out.println(
                "Bienvenido a escuela automovilística El Maestro:\n" +
                        "1. Ingreso registro y calificación clientes\n" +
                        "2. Consulta y resultados pruebas clientes\n" +
                        "3. Salir del programa");
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
     * @return devuelve verdadero si la opción digita existe, en caso contrario falso
     * @since 1.0.0
     */
    private static boolean evaluarOpcion(int opcion) throws IOException {
        switch (opcion) {
            case 1:
                cantidadUsuarios = solicitaCantidadClientes();

                switch (cantidadUsuarios) {
                    case 1:
                        System.out.println("Registro #1:");
                        nombreCliente1 = solicitarNombre();
                        numdocumento1 = solicitarIdentificacionCliente();
                        calificacion1 = calificacionDelCliente();
                        break;
                    case 2:
                        System.out.println("Registro #1:");
                        nombreCliente1 = solicitarNombre();
                        numdocumento1 = solicitarIdentificacionCliente();
                        calificacion1 = calificacionDelCliente();

                        System.out.println("Registro #2:");
                        nombreCliente2 = solicitarNombre();
                        numdocumento2 = solicitarIdentificacionCliente();
                        calificacion2 = calificacionDelCliente();
                        break;
                    case 3:
                        System.out.println("Registro #1:");
                        nombreCliente1 = solicitarNombre();
                        numdocumento1 = solicitarIdentificacionCliente();
                        calificacion1 = calificacionDelCliente();

                        System.out.println("Registro #2:");
                        nombreCliente2 = solicitarNombre();
                        numdocumento2 = solicitarIdentificacionCliente();
                        calificacion2 = calificacionDelCliente();

                        System.out.println("Registro #3:");
                        nombreCliente3 = solicitarNombre();
                        numdocumento3 = solicitarIdentificacionCliente();
                        calificacion3 = calificacionDelCliente();
                        break;
                    case 4:
                        System.out.println("Registro #1:");
                        nombreCliente1 = solicitarNombre();
                        numdocumento1 = solicitarIdentificacionCliente();
                        calificacion1 = calificacionDelCliente();

                        System.out.println("Registro #2:");
                        nombreCliente2 = solicitarNombre();
                        numdocumento2 = solicitarIdentificacionCliente();
                        calificacion2 = calificacionDelCliente();

                        System.out.println("Registro #3:");
                        nombreCliente3 = solicitarNombre();
                        numdocumento3 = solicitarIdentificacionCliente();
                        calificacion3 = calificacionDelCliente();

                        System.out.println("Registro #4:");
                        nombreCliente4 = solicitarNombre();
                        numdocumento4 = solicitarIdentificacionCliente();
                        calificacion4 = calificacionDelCliente();
                        break;
                    case 5:
                        System.out.println("Registro #1:");
                        nombreCliente1 = solicitarNombre();
                        numdocumento1 = solicitarIdentificacionCliente();
                        calificacion1 = calificacionDelCliente();

                        System.out.println("Registro #2:");
                        nombreCliente2 = solicitarNombre();
                        numdocumento2 = solicitarIdentificacionCliente();
                        calificacion2 = calificacionDelCliente();

                        System.out.println("Registro #3:");
                        nombreCliente3 = solicitarNombre();
                        numdocumento3 = solicitarIdentificacionCliente();
                        calificacion3 = calificacionDelCliente();

                        System.out.println("Registro #4:");
                        nombreCliente4 = solicitarNombre();
                        numdocumento4 = solicitarIdentificacionCliente();
                        calificacion4 = calificacionDelCliente();

                        System.out.println("Registro #5:");
                        nombreCliente5 = solicitarNombre();
                        numdocumento5 = solicitarIdentificacionCliente();
                        calificacion5 = calificacionDelCliente();
                        break;
                    case 6:
                        System.out.println("Registro #1:");
                        nombreCliente1 = solicitarNombre();
                        numdocumento1 = solicitarIdentificacionCliente();
                        calificacion1 = calificacionDelCliente();

                        System.out.println("Registro #2:");
                        nombreCliente2 = solicitarNombre();
                        numdocumento2 = solicitarIdentificacionCliente();
                        calificacion2 = calificacionDelCliente();

                        System.out.println("Registro #3:");
                        nombreCliente3 = solicitarNombre();
                        numdocumento3 = solicitarIdentificacionCliente();
                        calificacion3 = calificacionDelCliente();

                        System.out.println("Registro #4:");
                        nombreCliente4 = solicitarNombre();
                        numdocumento4 = solicitarIdentificacionCliente();
                        calificacion4 = calificacionDelCliente();

                        System.out.println("Registro #5:");
                        nombreCliente5 = solicitarNombre();
                        numdocumento5 = solicitarIdentificacionCliente();
                        calificacion5 = calificacionDelCliente();

                        System.out.println("Registro #6:");
                        nombreCliente6 = solicitarNombre();
                        numdocumento6 = solicitarIdentificacionCliente();
                        calificacion6 = calificacionDelCliente();
                        break;
                    case 7:
                        System.out.println("Registro #1:");
                        nombreCliente1 = solicitarNombre();
                        numdocumento1 = solicitarIdentificacionCliente();
                        calificacion1 = calificacionDelCliente();

                        System.out.println("Registro #2:");
                        nombreCliente2 = solicitarNombre();
                        numdocumento2 = solicitarIdentificacionCliente();
                        calificacion2 = calificacionDelCliente();

                        System.out.println("Registro #3:");
                        nombreCliente3 = solicitarNombre();
                        numdocumento3 = solicitarIdentificacionCliente();
                        calificacion3 = calificacionDelCliente();

                        System.out.println("Registro #4:");
                        nombreCliente4 = solicitarNombre();
                        numdocumento4 = solicitarIdentificacionCliente();
                        calificacion4 = calificacionDelCliente();

                        System.out.println("Registro #5:");
                        nombreCliente5 = solicitarNombre();
                        numdocumento5 = solicitarIdentificacionCliente();
                        calificacion5 = calificacionDelCliente();

                        System.out.println("Registro #6:");
                        nombreCliente6 = solicitarNombre();
                        numdocumento6 = solicitarIdentificacionCliente();
                        calificacion6 = calificacionDelCliente();

                        System.out.println("Registro #7:");
                        nombreCliente7 = solicitarNombre();
                        numdocumento7 = solicitarIdentificacionCliente();
                        calificacion7 = calificacionDelCliente();
                        break;
                    case 8:
                        System.out.println("Registro #1:");
                        nombreCliente1 = solicitarNombre();
                        numdocumento1 = solicitarIdentificacionCliente();
                        calificacion1 = calificacionDelCliente();

                        System.out.println("Registro #2:");
                        nombreCliente2 = solicitarNombre();
                        numdocumento2 = solicitarIdentificacionCliente();
                        calificacion2 = calificacionDelCliente();

                        System.out.println("Registro #3:");
                        nombreCliente3 = solicitarNombre();
                        numdocumento3 = solicitarIdentificacionCliente();
                        calificacion3 = calificacionDelCliente();

                        System.out.println("Registro #4:");
                        nombreCliente4 = solicitarNombre();
                        numdocumento4 = solicitarIdentificacionCliente();
                        calificacion4 = calificacionDelCliente();

                        System.out.println("Registro #5:");
                        nombreCliente5 = solicitarNombre();
                        numdocumento5 = solicitarIdentificacionCliente();
                        calificacion5 = calificacionDelCliente();

                        System.out.println("Registro #6:");
                        nombreCliente6 = solicitarNombre();
                        numdocumento6 = solicitarIdentificacionCliente();
                        calificacion6 = calificacionDelCliente();

                        System.out.println("Registro #7:");
                        nombreCliente7 = solicitarNombre();
                        numdocumento7 = solicitarIdentificacionCliente();
                        calificacion7 = calificacionDelCliente();

                        System.out.println("Registro #8:");
                        nombreCliente8 = solicitarNombre();
                        numdocumento8 = solicitarIdentificacionCliente();
                        calificacion8 = calificacionDelCliente();
                        break;
                    default:
                        System.out.println("Solo se permite un máximo de 8 registro de clientes");
                        break;
                }
                return true;
            case 2:
                numeroDocumento = solicitarIdentificacionCliente();

                if (numeroDocumento == numdocumento1) {
                    System.out.println("Cliente encontrado:\n" +
                            "Nombres: " + nombreCliente1 + "\n" +
                            "Número Identificación: " + numdocumento1
                    );

                    evaluacionCurso(calificacion1);
                }
                else if (numeroDocumento == numdocumento2) {
                    System.out.println("Cliente encontrado:\n" +
                            "Nombres: " + nombreCliente2 + "\n" +
                            "Número Identificación: " + numdocumento2
                    );

                    evaluacionCurso(calificacion2);
                }
                else if (numeroDocumento == numdocumento3) {
                    System.out.println("Cliente encontrado:\n" +
                            "Nombres: " + nombreCliente3 + "\n" +
                            "Número Identificación: " + numdocumento3
                    );

                    evaluacionCurso(calificacion3);
                }
                else if (numeroDocumento == numdocumento4) {
                    System.out.println("Cliente encontrado:\n" +
                            "Nombres: " + nombreCliente4 + "\n" +
                            "Número Identificación: " + numdocumento4
                    );

                    evaluacionCurso(calificacion4);
                }
                else if (numeroDocumento == numdocumento5) {
                    System.out.println("Cliente encontrado:\n" +
                            "Nombres: " + nombreCliente5 + "\n" +
                            "Número Identificación: " + numdocumento5
                    );

                    evaluacionCurso(calificacion5);
                }
                else if (numeroDocumento == numdocumento6) {
                    System.out.println("Cliente encontrado:\n" +
                            "Nombres: " + nombreCliente6 + "\n" +
                            "Número Identificación: " + numdocumento6
                    );

                    evaluacionCurso(calificacion6);
                }
                else if (numeroDocumento == numdocumento7) {
                    System.out.println("Cliente encontrado:\n" +
                            "Nombres: " + nombreCliente7 + "\n" +
                            "Número Identificación: " + numdocumento7
                    );

                    evaluacionCurso(calificacion7);
                }
                else if (numeroDocumento == numdocumento8) {
                    System.out.println("Cliente encontrado:\n" +
                            "Nombres: " + nombreCliente8 + "\n" +
                            "Número Identificación: " + numdocumento8
                    );

                    evaluacionCurso(calificacion8);
                }
                else {
                    System.out.println("Ningun cliente encontrado con ese número de identificación!!");
                }
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
     * Solicita la cantidad de clientes a registrar
     * @return retorna el valor digitado por el usuario
     */
    private static int solicitaCantidadClientes () {
        System.out.println("Por favor indique la cantidad de clientes a incorporar:");
        return inputInt.nextInt();
    }

    /**
     * Solicita el número de identificación del cliente
     * @return retorna el valor digitado por el usuario
     */
    private static int solicitarIdentificacionCliente () {
        System.out.println("Por favor digite número identificación del cliente:" );
        return inputInt.nextInt();
    }

    /**
     * Solicita el nombre del cliente a capacitar
     * @return retorna el valor digitado por el usuario
     */
    private static String solicitarNombre () {
        System.out.println("Por favor digite nombre cliente a capacitar:" );
        return inputString.nextLine();
    }

    /**
     * Solicita el número de calificación del cliente
     * @return retorna el valor digitado por el usuario
     */
    private static int calificacionDelCliente () {
        System.out.println("Por favor calificación del cliente de 1 a 3:" );
        return inputInt.nextInt();
    }

    /**
     * Evaluar un número de calificación para indicar el estado del proceso
     * @return retorna el valor aprobado, repetir o reprobado
     */
    private static void evaluacionCurso(int calificacion) {
        if(calificacion == 1 && calificacion < 2) {
            System.out.println("Curso Reprobado");
        }
        else if (calificacion >= 2 && calificacion < 3) {
            System.out.println("Repetir Curso, tiene un último intento");
        }
        else if (calificacion == 3) {
            System.out.println("Felicitaciones, aprobo el curso");
        }
        else {
            System.out.println("En proceso...");
        }
    }


}
