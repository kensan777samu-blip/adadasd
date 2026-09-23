package Arreglos;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] notas = new double[10];

		for (int i = 0; i < notas.length; i++) {
			System.out.print("Ingrese la nota del estudiante " + (i + 1) + " (0.0 a 5.0): ");
			notas[i] = sc.nextDouble();

			while (notas[i] < 0.0 || notas[i] > 5.0) {
				System.out.println("Nota inválida. Debe estar entre 0.0 y 5.0.");
				System.out.print("Ingrese la nota nuevamente: ");
				notas[i] = sc.nextDouble();
			}
		}

		double suma = notas[0];
		double notaMayor = notas[0];
		double notaMenor = notas[0];
		int posicionMayor = 0;
		int posicionMenor = 0;
		int aprobados = notas[0] >= 3.0 ? 1 : 0;

		for (int i = 1; i < notas.length; i++) {
			suma += notas[i];

			if (notas[i] > notaMayor) {
				notaMayor = notas[i];
				posicionMayor = i;
			}

			if (notas[i] < notaMenor) {
				notaMenor = notas[i];
				posicionMenor = i;
			}

			if (notas[i] >= 3.0) {
				aprobados++;
			}
		}

		int reprobados = notas.length - aprobados;
		double promedio = suma / notas.length;

		System.out.printf("Promedio del grupo: " + promedio);
		System.out.printf("Nota más alta: " + notaMayor + " (índice " + posicionMayor + ")");
		System.out.printf("Nota más baja: " + notaMenor + " (índice " + posicionMenor + ")");
		System.out.println("Estudiantes aprobados: " + aprobados);
		System.out.println("Estudiantes reprobados: " + reprobados);

		sc.close();
	}
}
