package com.talleres;

import java.io.IOException;
import java.util.Scanner;


public class Main {
    private static boolean bandera = true;
    private static int opcion;
    private static String[] args;

    public static void main(String[] args) throws IOException {

        do {
            menu();
            opcion = capturaOpcion();
            bandera = evaluarOpcion(opcion);
        } while (bandera == true);

    }

    private static void menu() {
        System.out.println("Digite el Número de Taller a Visualizar:");
        System.out.println("1. Taller Variables");
        System.out.println("2. Taller Condicionales");
        System.out.println("3. Taller Ciclos");
        System.out.println("4. Taller Arreglos");
        System.out.println("0. Para Salir");
    }

    private static int capturaOpcion() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    private static boolean evaluarOpcion(int opcion) throws IOException {
        switch (opcion) {
            case 1:
                com.talleres.Taller1.Main.main(args);
                break;
            case 2:
                com.talleres.Taller2.Main.main(args);
                break;
            case 3:
                com.talleres.Taller3.Main.main(args);
                break;
            case 4:
                com.talleres.Taller4.Main.main(args);
                break;
            case 0:
                return false;
            default:
                System.out.println("Opción Incorrecta");
                System.in.read();
        }
        return true;
    }

}








