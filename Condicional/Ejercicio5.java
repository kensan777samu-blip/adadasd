package Condicional;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Ingrese un año positivo: ");
		int año = sc.nextInt();

		if (año <= 0) {
			System.out.println("El año debe ser un número positivo.");
			sc.close();
			return;
		}

		boolean bisiesto = (año % 400 == 0)
				|| (año % 4 == 0 && año % 100 != 0);

		if (bisiesto) {
			System.out.println("El año " + año + " es bisiesto.");
		} else {
			System.out.println("El año " + año + " no es bisiesto.");
		}

		System.out.print("Ingrese un número del 1 al 7: ");
		int numeroDia = sc.nextInt();

		String dia;
		switch (numeroDia) {
			case 1:
				dia = "lunes";
				break;
			case 2:
				dia = "martes";
				break;
			case 3:
				dia = "miércoles";
				break;
			case 4:
				dia = "jueves";
				break;
			case 5:
				dia = "viernes";
				break;
			case 6:
				dia = "sábado";
				break;
			case 7:
				dia = "domingo";
				break;
			default:
				dia = null;
		}

		if (dia == null) {
			System.out.println("El número del día no es válido.");
		} else {
			System.out.println("El día correspondiente es: " + dia);
		}

		sc.close();
	}
}
