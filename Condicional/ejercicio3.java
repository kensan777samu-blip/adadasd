package Condicional;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la nota del estudiante:");
        double nota = sc.nextDouble();
        if (nota >= 4.6) {
            System.out.println("Letra A" + "\nExcelente");
        } else if (nota >= 4.0 && nota < 4.6) {
            System.out.println("Letra B" + "\nSobresaliente");
        } else if (nota >= 3.5 && nota < 4.0) {
            System.out.println("Letra C" + "\nAceptable");
        } else if (nota >= 3.0 && nota < 3.5) {
            System.out.println("Letra D" + "\nAprobado minimo");
        } else { if (nota < 3.0) {
            System.out.println("Letra F" + "\nReprobado Sejo");
        }
        sc.close();
        }
    }
}

