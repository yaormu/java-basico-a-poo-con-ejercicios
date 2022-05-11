package com.talleres.Taller3;

/**
 * Esta clase imprime medio triangulo en figuras de asteriscos
 *
 * @author Yamid Ortiz Muñoz <yaormu@gmail.com>
 * @version 1.0.0
 */
public class Ejercicio2 {

    /**
     * Dato número iniciar recorrido
     */
    private static int i;

    /**
     * dato número final para recorrido
     */
    private static int max;

    /**
     * Valor de caracter a mostrar en impresion
     */
    private static char simbolo;

    /**
     * Ejecuta el método para dibujar figura con asterisco
     */
    public void Ejercicio2() {

        i = 1;
        max = 10;
        simbolo = '*';

       dibujarFigura(i, max, simbolo);

    }

    /**
     * Inicia ciclo for para dibujar figura con asterisco
     */
    private static void dibujarFigura(int i, int max, char simbolo) {

        while (i <= max ) {

            int j = 1;
            int k = 10;

            while (k >= i) {
                System.out.print(" ");
                k -= 1;
            }

            while (j <= i) {
                System.out.print(simbolo);
                j += 1;
            }

            System.out.println("");
            i += 1;
        }
    }

}
