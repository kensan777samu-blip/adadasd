package Estructuras;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numeroSecreto = (int) (Math.random() * 100) + 1;
		int intento = 0;
		int numeroIngresado;

		System.out.println("Adivina el número (entre 1 y 100):");

		do {
			intento++;
			System.out.print("Intento " + intento + ": ");
			numeroIngresado = sc.nextInt();

			if (numeroIngresado < numeroSecreto) {
				System.out.println("→ El número es mayor.");
			} else if (numeroIngresado > numeroSecreto) {
				System.out.println("→ El número es menor.");
			} else {
				System.out.println("→ ¡Correcto! Lo lograste en " + intento + " intentos.");
			}
		} while (numeroIngresado != numeroSecreto);

		sc.close();
	}
}
