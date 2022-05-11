package com.talleres.Taller2;

import java.util.Scanner;

/**
 * Esta clase calcula el IMC(Indice de Masca Corporal) de una persona y da un diagnostico
 *
 * @author Yamid Ortiz Muñoz <yaormu@gmail.com>
 * @version 1.0.0
 */

public class Ejercicio7 {

    /**
     * Nombres de la persona
     */
    private String nombres;

    /**
     * Peso de la persona
     */
    private double peso;

    /**
     * Estatura de la persona
     */
    private double estatura;

    /**
     * Input obtener dato double
     */
    private static Scanner inputDouble = new Scanner(System.in);

    /**
     * Input obtener dato String
     */
    private static Scanner inputString = new Scanner(System.in);

    /**
     * Solicita los valores de datos personales del usuario y calcula IMC
     */
    public void Ejercicio7() {
        msjInicioApp();

        solicitarNombres();
        nombres = capturarString();

        solicitarPeso();
        peso = capturarDouble();

        solicitarEstatura();
        estatura = capturarDouble();

        resultadoPersona(nombres);
        calculoIMC(peso, estatura);
    }

    /**
     * Mostrar bienvenida programa
     */
    private void msjInicioApp() {

        System.out.println("Bienvenido a la aplicación de Secretaría de Salud Municipal\n" +
                "Se evaluara el Indice de Masa Corporal y resultado inmedato\n"
                );
    }


    /**
     * Solicita nombres completos de la persona
     */
    private void solicitarNombres() {
        System.out.println("Por favor digite nombre completo del usuario:");
    }

    /**
     * Solicita el peso de la persona
     */
    private void solicitarPeso() {
        System.out.println("Por favor digite el peso de la persona:");
    }

    /**
     * Solicita la estatura de la persona
     */
    private void solicitarEstatura() {
        System.out.println("Por favor digite la estatura de la persona:");
    }

    /**
     * Captura el dato double ingresado para estatura o peso
     *
     * @return devuelve los datos capturados por consola
     */
    private static double capturarDouble() {
        return inputDouble.nextDouble();
    }

    /**
     * Captura el dato string ingresado para nombres
     *
     * @return devuelve los datos capturados por consola
     */
    private static String capturarString() {
        return inputString.nextLine();
    }


    /**
     * Solicita datos de peso y estatura para dar a conocer el IMC
     * @param peso peso de la persona
     * @param estatura estatura de la persona
     */
   private static void calculoIMC (double peso, double estatura) {
        double IMC = peso / ((estatura / 100) * (estatura / 100));

        if (IMC < 18.5) {
            System.out.println("Estado: Bajo peso, IMC " + IMC);
        }
        else if (IMC >= 18.5 && IMC < 24.9) {
            System.out.println("Estado: Normal, IMC " + IMC);
        }
        else if (IMC >= 25 && IMC <= 29.9) {
            System.out.println("Estado: Sobrepeso, IMC " + IMC);
        }
        else if (IMC >= 30) {
            System.out.println("Estado: Obesidad, IMC " + IMC);
        }
        else {
            System.out.println("Error: Solo puede ser valores positivos");
        }
    }

    /**
     * Mostrar el nombre de la persona que tendra el resultado del IMC
     */
    private static void resultadoPersona(String nombres) {

        System.out.println("Sr(a) " + nombres + " estos son los resultados obtenidos:");
    }

}