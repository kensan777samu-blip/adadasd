package Arreglos;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[][] ventas = new double[4][3];
		double[] totalPorSucursal = new double[4];
		double[] totalPorProducto = new double[3];
		double ventaMasAlta = 0;
		int sucursalMayor = 0;
		int productoMayor = 0;

		for (int sucursal = 0; sucursal < ventas.length; sucursal++) {
			for (int producto = 0; producto < ventas[sucursal].length; producto++) {
				System.out.print("Ingrese las ventas de la sucursal " + (sucursal + 1)
						+ ", producto " + (producto + 1) + ": $ ");
				ventas[sucursal][producto] = sc.nextDouble();

				totalPorSucursal[sucursal] += ventas[sucursal][producto];
				totalPorProducto[producto] += ventas[sucursal][producto];

				if (ventas[sucursal][producto] > ventaMasAlta) {
					ventaMasAlta = ventas[sucursal][producto];
					sucursalMayor = sucursal;
					productoMayor = producto;
				}
			}
		}

		System.out.println("\n--- Ventas por sucursal ---");
		for (int sucursal = 0; sucursal < totalPorSucursal.length; sucursal++) {
			System.out.printf("Sucursal %d: $ %.2f%n", sucursal + 1,
					totalPorSucursal[sucursal]);
		}

		System.out.println("\n--- Ventas por producto ---");
		for (int producto = 0; producto < totalPorProducto.length; producto++) {
			System.out.printf("Producto %d: $ %.2f%n", producto + 1,
					totalPorProducto[producto]);
		}

		System.out.printf("\nVenta más alta: $ %.2f (Sucursal %d, Producto %d)%n",
				ventaMasAlta, sucursalMayor + 1, productoMayor + 1);

		sc.close();
	}
}
