package com.talleres.Taller3;

/**
 * Esta clase imprime figura de un arbol en asteriscos
 *
 * @author Yamid Ortiz Muñoz <yaormu@gmail.com>
 * @version 1.0.0
 */
public class Ejercicio3 {


    /**
     * Ejecuta el método para dibujar arbol de asterisco
     */
    public void Ejercicio3() {

        dibujarTriangulo();
        dibujarBase();

    }

    /**
     * Inicia do while - repetir hasta que muestre la figura arbol con asterisco
     */
    private static void dibujarTriangulo () {

        char simbolo;
        simbolo = '*';

        int i = 1;
        int max = 10;

        do {
            int j = 1;
            int k = 10;
            int l = 1;

            do {
                System.out.print(" ");
                k = k - 1;
            }while(k >= i);


            do {
                if (j == 1) {
                    System.out.print("");
                }
                else {
                    System.out.print(simbolo);
                }
                j += 1;
            }while(j <= i);

            do {
                if (l == 1) {
                    System.out.print("");
                }
                else {
                    System.out.print(simbolo);
                }
                l = l+1;
            }while(l <= i);

            System.out.println(simbolo);

            i = i+1;

        }while (i < max);
    }

    /**
     * Inicia do while - repetir hasta que muestre la base del arbol con asterisco
     */
    private static void dibujarBase () {

        char simbolo = '*';

        int index = 1;
        int maximo = 5;

        do {

            int a = 10;
            int b = 2;
            int c = 2;

            do {
                if (a == 1) {
                    System.out.print("");
                }
                else {
                    System.out.print(" ");
                }
                a = a - 1;
            } while(a >= index);


            do {
                System.out.print(simbolo);
                b = b + 1;
            } while (b <= index);


            do {
                System.out.print(simbolo);
                c = c + 1;
            } while (c <= index);

            System.out.println(simbolo);

            index = index + 1;

        }while (index < maximo);
    }

}
