package Condicional;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su peso en kilogramos: ");
        double peso = sc.nextDouble();
        System.out.println("Ingrese su altura en metros: ");
        double altura = sc.nextDouble();
        double imc = peso / (altura * altura);
        System.out.println("Su indice de masa corporal es: " + imc);
        if (imc < 18.5) {
            System.out.println("Usted tiene bajo peso");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Usted tiene un peso normal");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Usted tiene sobrepeso");
        } else { if (imc >= 30) {
            System.out.println("Usted tiene obesidad");
        }
        sc.close();
    }
    }
}
