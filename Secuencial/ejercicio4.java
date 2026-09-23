import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de minutos del viaje: ");
        int minutos = sc.nextInt();

        int totalSegundos = minutos * 60;
        int horas = minutos / 60;
        int minutosRestantes = minutos % 60;
        int segundos = totalSegundos % 60;

        System.out.println("Tiempo ingresado: " + minutos + " minutos");
        System.out.println("Equivale a:       " + horas + " horas, "
                + minutosRestantes + " minutos, " + segundos + " segundos");
        System.out.println("En segundos:      " + totalSegundos + " segundos");

        sc.close();
    }
}
