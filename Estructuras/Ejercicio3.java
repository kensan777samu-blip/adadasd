package Estructuras;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Ingrese el valor de n: ");
		int n = sc.nextInt();

		if (n <= 0) {
			System.out.println("n debe ser un número entero positivo.");
			sc.close();
			return;
		}

		long sumaNaturales = 0;
		long sumaPares = 0;
		long sumaCuadrados = 0;

		for (int i = 1; i <= n; i++) {
			sumaNaturales += i;
			sumaPares += 2L * i;
			sumaCuadrados += (long) i * i;
		}

		long formulaNaturales = (long) n * (n + 1) / 2;
		long formulaPares = (long) n * (n + 1);
		long formulaCuadrados = (long) n * (n + 1) * (2L * n + 1) / 6;

		System.out.println("\n1. Suma de números naturales:");
		System.out.println("   Resultado del ciclo: " + sumaNaturales);
		System.out.println("   Fórmula: n(n + 1) / 2 = " + formulaNaturales);
		System.out.println("   ¿Coinciden? " + (sumaNaturales == formulaNaturales));

		System.out.println("\n2. Suma de números pares:");
		System.out.println("   Resultado del ciclo: " + sumaPares);
		System.out.println("   Fórmula: n(n + 1) = " + formulaPares);
		System.out.println("   ¿Coinciden? " + (sumaPares == formulaPares));

		System.out.println("\n3. Suma de cuadrados perfectos:");
		System.out.println("   Resultado del ciclo: " + sumaCuadrados);
		System.out.println("   Fórmula: n(n + 1)(2n + 1) / 6 = " + formulaCuadrados);
		System.out.println("   ¿Coinciden? " + (sumaCuadrados == formulaCuadrados));

		sc.close();
	}
}
