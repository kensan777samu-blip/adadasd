import java.util.Scanner;
public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("Ingrese la base del rectangulo: ");
       double base = sc.nextDouble();
       System.out.println("Ingrese la altura del rectangulo: ");
       double h = sc.nextDouble();
       System.out.println("Ingrese el radio del circulo: "); 
       double r = sc.nextDouble();

       //Rectangulo
       double A = base * h;
       double P = 2 * (base + h);
       //Circulo
       double r2 = r * r;
       double Ac = Math.PI * r2;
       double circun = 2 * Math.PI * r;
       System.out.println("Area del rectangulo: " + A);
       System.out.println("Perimetro del rectangulo: " + P);
       System.out.println("\nEl área del circulo es de: " + Ac);
       System.out.println("La circunferencia del circulo es de: " + circun);
       sc.close();

    }
}
