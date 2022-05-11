package com.talleres.Taller3;

/**
 * Esta clase imprime medio triangulo en figuras de asteriscos
 *
 * @author Yamid Ortiz Muñoz <yaormu@gmail.com>
 * @version 1.0.0
 */
public class Ejercicio1 {

    /**
     * Ejecuta el método para dibujar figura con asterisco
     */
    public void Ejercicio1() {

        dibujarFigura();

    }

    /**
     * Inicia ciclo for para dibujar figura con asterisco
     */
    private static void dibujarFigura( ) {
        for ( int i = 1; i < 10; i++) {
            for ( int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
