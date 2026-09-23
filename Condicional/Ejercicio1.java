package Condicional;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los lados del triangulo: ");
        int lado1 = sc.nextInt();
        int lado2 = sc.nextInt();
        int lado3 = sc.nextInt();

        //Triangulo equilatero: los tres lados son iguales
        //Triangulo isosceles: dos lados son iguales
        //Triangulo escaleno: los tres lados son diferentes
        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("El triangulo es equilatero");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("El triangulo es isosceles");
        } else {
            System.out.println("El triangulo es escaleno");
        } 
        if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {
            System.out.println("Los lados del triangulo deben ser mayores a cero");
        } else {
            if (lado1 + lado2 <= lado3 || lado1 + lado3 <= lado2 || lado2 + lado3 <= lado1) {
                System.out.println("Los lados ingresados no forman un triangulo");
            }
        }
        sc.close();
    
    }
}