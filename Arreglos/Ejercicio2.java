package Arreglos;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;

		do {
			System.out.print("Ingrese la cantidad de elementos (1 a 20): ");
			n = sc.nextInt();
			if (n < 1 || n > 20) {
				System.out.println("La cantidad debe estar entre 1 y 20.");
			}
		} while (n < 1 || n > 20);

		int[] numeros = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Ingrese el elemento " + (i + 1) + ": ");
			numeros[i] = sc.nextInt();
		}

		System.out.print("Original:  ");
		imprimirArreglo(numeros);

		for (int i = 0; i < n / 2; i++) {
			int temporal = numeros[i];
			numeros[i] = numeros[n - 1 - i];
			numeros[n - 1 - i] = temporal;
		}

		System.out.print("Invertido: ");
		imprimirArreglo(numeros);

		sc.close();
	}

	private static void imprimirArreglo(int[] numeros) {
		for (int numero : numeros) {
			System.out.print(numero + " ");
		}
		System.out.println();
	}
}
