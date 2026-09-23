package Arreglos;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[][] tablero = new char[3][3];

		for (int fila = 0; fila < tablero.length; fila++) {
			for (int columna = 0; columna < tablero[fila].length; columna++) {
				tablero[fila][columna] = ' ';
			}
		}

		char jugador = 'X';
		boolean hayGanador = false;
		int jugadas = 0;

		System.out.println("Tres en raya");
		mostrarTablero(tablero);

		while (!hayGanador && jugadas < 9) {
			System.out.println("Turno del jugador " + jugador);
			System.out.print("Ingrese la fila (0 a 2): ");
			int fila = sc.nextInt();
			System.out.print("Ingrese la columna (0 a 2): ");
			int columna = sc.nextInt();

			if (fila < 0 || fila > 2 || columna < 0 || columna > 2) {
				System.out.println("Posición inválida. Use valores entre 0 y 2.");
				continue;
			}

			if (tablero[fila][columna] != ' ') {
				System.out.println("La celda ya está ocupada. Elija otra.");
				continue;
			}

			tablero[fila][columna] = jugador;
			jugadas++;
			mostrarTablero(tablero);
			hayGanador = gano(tablero, jugador);

			if (hayGanador) {
				System.out.println("¡Ganó el jugador " + jugador + "!");
			} else if (jugadas < 9) {
				jugador = jugador == 'X' ? 'O' : 'X';
			}
		}

		if (!hayGanador) {
			System.out.println("¡Empate! El tablero está lleno.");
		}

		sc.close();
	}

	private static void mostrarTablero(char[][] tablero) {
		for (int fila = 0; fila < tablero.length; fila++) {
			System.out.println(" " + tablero[fila][0] + " | " + tablero[fila][1]
					+ " | " + tablero[fila][2]);
			if (fila < tablero.length - 1) {
				System.out.println("-----------");
			}
		}
	}

	private static boolean gano(char[][] tablero, char jugador) {
		for (int i = 0; i < 3; i++) {
			if ((tablero[i][0] == jugador && tablero[i][1] == jugador && tablero[i][2] == jugador)
					|| (tablero[0][i] == jugador && tablero[1][i] == jugador && tablero[2][i] == jugador)) {
				return true;
			}
		}

		return (tablero[0][0] == jugador && tablero[1][1] == jugador && tablero[2][2] == jugador)
				|| (tablero[0][2] == jugador && tablero[1][1] == jugador && tablero[2][0] == jugador);
	}
}
