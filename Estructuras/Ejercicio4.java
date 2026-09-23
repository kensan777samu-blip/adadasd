package Estructuras;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int edad;

		System.out.print("Ingrese su edad (1 a 120): ");
		edad = sc.nextInt();

		while (edad < 1 || edad > 120) {
			System.out.println("Edad inválida. Debe estar entre 1 y 120.");
			System.out.print("Ingrese su edad nuevamente: ");
			edad = sc.nextInt();
		}

		String etapa;
		if (edad <= 12) {
			etapa = "Niñez";
		} else if (edad <= 17) {
			etapa = "Adolescencia";
		} else if (edad <= 25) {
			etapa = "Juventud";
		} else if (edad <= 59) {
			etapa = "Adultez";
		} else {
			etapa = "Tercera edad";
		}

		System.out.println("Etapa de vida: " + etapa);
		sc.close();
	}
}
