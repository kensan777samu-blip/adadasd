package Estructuras;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número entero positivo: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("El número debe ser positivo.");
            sc.close();
            return;
        }

        System.out.println("\nTabla del " + n + ":");
        for (int multiplicador = 1; multiplicador <= 12; multiplicador++) {
            System.out.printf("%2d x %2d = %3d%n",
                    n, multiplicador, n * multiplicador);
        }

        System.out.println("\nTablas del 1 al " + n + ":");
        System.out.print("    ");
        for (int multiplicador = 1; multiplicador <= 12; multiplicador++) {
            System.out.printf("%4d", multiplicador);
        }
        System.out.println();

        for (int numero = 1; numero <= n; numero++) {
            for (int multiplicador = 1; multiplicador <= 12; multiplicador++) {
                System.out.printf("%4d", numero * multiplicador);
            }
            System.out.println();
        }

        sc.close();
    }
}
