package Condicional;

import java.util.Scanner;
public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      System.out.print("Ingrese el tipo de vehiculo (1=Moto, 2=Carro, 3=Camioneta): ");
        int tipoVehiculo = sc.nextInt();
        System.out.print("Ingrese el numero de horas de permanencia: ");
        int horas = sc.nextInt();

        if (horas <= 0) {
            System.out.println("El numero de horas debe ser mayor a 0");
            sc.close();
            return;
        }

        int primeraHora;
        int horaAdicional;

        switch (tipoVehiculo) {
            case 1:
                primeraHora = 2000;
                horaAdicional = 1500;
                break;
            case 2:
                primeraHora = 4000;
                horaAdicional = 3000;
                break;
            case 3:
                primeraHora = 5000;
                horaAdicional = 4000;
                break;
            default:
                System.out.println("La opcion no es valida");
                sc.close();
                return;
        }

        int total = primeraHora + (horas - 1) * horaAdicional;
        System.out.println("El valor total a pagar es: $" + total);
        sc.close();

    }
}