package Estructuras;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;

		do {
			System.out.print("Ingrese el límite inferior a: ");
			a = sc.nextInt();
			System.out.print("Ingrese el límite superior b: ");
			b = sc.nextInt();

			if (a <= 0 || b <= 0 || a >= b) {
				System.out.println("Los valores deben ser positivos y cumplir a < b.");
			}
		} while (a <= 0 || b <= 0 || a >= b);

		int cantidad = 0;
		long suma = 0;
		StringBuilder primos = new StringBuilder();

		for (int numero = a; numero <= b; numero++) {
			boolean esPrimo = numero >= 2;
			int divisor = 2;

			while (esPrimo && divisor <= Math.sqrt(numero)) {
				if (numero % divisor == 0) {
					esPrimo = false;
				}
				divisor++;
			}

			if (esPrimo) {
				if (cantidad > 0) {
					primos.append(", ");
				}
				primos.append(numero);
				cantidad++;
				suma += numero;
			}
		}

		System.out.println("Primos entre " + a + " y " + b + ": " + primos);
		System.out.println("Cantidad: " + cantidad);
		System.out.println("Suma: " + suma);

		sc.close();
	}
}
