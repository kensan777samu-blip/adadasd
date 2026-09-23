package Arreglos;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] pacientes = new String[8];

		for (int i = 0; i < pacientes.length; i++) {
			System.out.print("Ingrese el nombre del paciente " + (i + 1) + ": ");
			pacientes[i] = sc.nextLine();
		}

		System.out.print("Ingrese el nombre que desea buscar: ");
		String nombreBuscado = sc.nextLine();

		boolean encontrado = false;
		for (int i = 0; i < pacientes.length; i++) {
			if (pacientes[i].equalsIgnoreCase(nombreBuscado)) {
				System.out.println("Paciente encontrado en la posición " + i + ".");
				encontrado = true;
			}
		}

		if (!encontrado) {
			System.out.println("El paciente no fue encontrado.");
		}

		sc.close();
	}
}
