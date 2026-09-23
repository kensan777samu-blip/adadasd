import java.util.Scanner;

public class ejercicio1 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese la temperatura registrada en grados Celsius: ");
    double C = sc.nextDouble();
    double F = (C * 9/5) + 32;
    double K = C + 273.15;
    System.out.printf("Celsius: %.2f °C\n", C);
    System.out.printf("Fahrenheit: %.2f °F\n", F);
    System.out.printf( "Kelvin: %.2f °C\n", K);
    sc.close();
}
}
