package com.talleres.Taller1;

import java.io.IOException;
import java.util.Scanner;

/**
 * Clase para mostrar la solución de los 5 ejercicios del taller de variables e impresión
 *
 * @author Yamid Ortiz Muñoz <yaormu@gmail.com>
 * @version 1.0.0
 */
public class Main {

    /**
     * Bandera que mantendra un ciclo Do While
     */
    private static boolean bandera = true;

    /**
     * Opción que digitara el usuario
     */
    private static int opcion;

    /**
     * @param args punto de acceso para mostrar el menu y evaluar la opción seleccionada por el usuario
     * @author Yamid Ortiz M <yaormu@gmail.com>
     * @since 1.0.0
     */
    public static void main(String[] args) throws IOException {
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
     * Muestra las opciones del ménu por consola para el usuario
     *
     * @since 1.0.0
     */
    private static void menu() {
        System.out.println("-------------------------------------------------");
        System.out.println("Escoja un punto del taller variables e impresión:");
        System.out.println("1. Ejercicio #1 Nombre y Apellidos");
        System.out.println("2. Ejercicio #2 Datos persona");
        System.out.println("3. Ejercicio #3 Datos persona y de Padres");
        System.out.println("4. Ejercicio #4 Capital y País");
        System.out.println("5. Ejercicio #5 Datos mascota");
        System.out.println("0. Salir del taller");
        System.out.println("-------------------------------------------------");
    }

    /**
     * Captura y devuelve la opció selecionada del ménu por consola
     *
     * @return devuelve el valor de la opción seleccionada
     * @since 1.0.0
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
                Ejercicio1 ejercicio1 = new Ejercicio1();
                ejercicio1.Ejercicio1();
                return true;
            case 2:
                Ejercicio2 ejercicio2 = new Ejercicio2();
                ejercicio2.Ejercicio2();
                return true;
            case 3:
                Ejercicio3 ejercicio3 = new Ejercicio3();
                ejercicio3.Ejercicio3();
                return true;
            case 4:
                Ejercicio4 ejercicio4 = new Ejercicio4();
                ejercicio4.Ejercicio4();
                return true;
            case 5:
                Ejercicio5 ejercicio5 = new Ejercicio5();
                ejercicio5.Ejercicio5();
                return true;
            case 0:
                return false;
            default:
                System.out.println("Opcion incorrecta");
                System.in.read();
        }
        return true;
    }
}
