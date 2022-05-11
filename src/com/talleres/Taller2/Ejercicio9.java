package com.talleres.Taller2;

import java.util.Scanner;

/**
 * Esta clase el área de diferentes figuras geométricas
 *
 * @author Yamid Ortiz Muñoz <yaormu@gmail.com>
 * @version 1.0.0
 */

public class Ejercicio9 {

    /**
     * Base figura
     */
    private static int base;

    /**
     * Base mayor figura
     */
    private static int baseMayor;

    /**
     * Altura de figura
     */
    private static int altura;


    /**
     * valor del área de la figura
     */
    private static int area;

    /**
     * Input obtener dato entero
     */
    private static Scanner inputInt = new Scanner(System.in);


    /**
     * Opción seleccionada por el usuario
     */
    private int opcion;

    /**
     * Captura y muestra la ópcion para calcuar el área de la figura geométrica
     */
    public void Ejercicio9() {
        opcion = menuArea();
        accionCalcularArea(opcion);
    }

    /**
     * De acuerdo a la ópcion seleccionada calculara el área de una figura del ménu
     *
     * @param opcion Opción seleccionada por el usuario
     * @since 1.0.0
     */
    private static void accionCalcularArea(int opcion) {

        if (opcion == 1) {
            solicitudBase();
            base = capturarInt();

            solicitudAltura();
            altura = capturarInt();

            area = areaTriangulo (base, altura);
            rtaTriangulo(area);

        } else if (opcion == 2) {
            solicitudBase();
            base = capturarInt();

            solicitudAltura();
            altura = capturarInt();

            area = areaRectangulo (base, altura);
            rtaRectangulo(area);
        }
        else if (opcion == 3) {

            solicitudBase();
            base = capturarInt();

            solicitudBaseMayor();
            baseMayor = capturarInt();

            solicitudAltura();
            altura = capturarInt();

            area = areaTrapecio (baseMayor, base, altura);
            rtaTrapecio(area);
        }
        else {
            System.out.println("No existe dicho ópcion!!");
        }
    }

    /**
     * Mostrar el ménu principal para calcular área de figuras
     * @return retorna la captura de la opción elegida
     */
    private static Integer menuArea () {
        System.out.println("Ménu calculo áreas:\n " +
                "Por favor seleccionar la opción que desea calcular:\n " +
                "1. Rectangulo\n 2. Triangulo\n 3. Trapecio"
        );
        return inputInt.nextInt();
    }

    /**
     * Solicita base de la figura
     */
    private static void solicitudBase () {
        System.out.println("Digita la base:");
    }

    /**
     * Solicita altura de la figura
     */
    private static void solicitudAltura () {
        System.out.println("Digita la altura:");
    }

    /**
     * Solicita base mayor de la figura
     */
    private static void solicitudBaseMayor () {
        System.out.println("Digita la base mayor:");
    }

    /**
     * Captura el dato int ingresado
     * @return devuelve los datos capturados por consola
     */
    private static int capturarInt() {
        return inputInt.nextInt();
    }

    /**
     * Calcular y dar a conocer el área de un rectangulo
     * @param base valor base de la figura
     * @param altura valor altura de la figura
     * @return devuelve el valor área de la figura
     */
    private static int areaRectangulo (int base, int altura) {
        return base * altura;
    }

    /**
     * Calcular y dar a conocer el área de un triangulo
     * @param base valor base de la figura
     * @param altura valor altura de la figura
     * @return devuelve el valor área de la figura
     */
    private static int areaTriangulo (int base, int altura) {
        return ((base * altura) / 2);
    }

    /**
     * Calcular y dar a conocer el área de un trapecio
     * @param baseMayor valor base mayor de la figura
     * @param base valor base de la figura
     * @param altura valor altura de la figura
     * @return devuelve el valor área de la figura
     */
    private static int areaTrapecio (int baseMayor, int base, int altura) {
        return ((baseMayor + base) / 2) * altura;
    }

    /**
     * Dar a conocer el área del triangulo
     * @param area area del triangulo
     */
    private static void rtaTriangulo (int area) {
        System.out.println("El área del triangulo es: " + area);
    }

    /**
     * Dar a conocer el área del rectangulo
     * @param area area del rectangulo
     */
    private static void rtaRectangulo (int area) {
        System.out.println("El área del rectangulo es: " + area);
    }

    /**
     * Dar a conocer el área del trapecio
     * @param area area del trapecio
     */
    private static void rtaTrapecio (int area) {
        System.out.println("El área del trapecio es: " + area);
    }
}
