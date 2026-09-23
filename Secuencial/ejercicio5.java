import java.util.Scanner;

public class ejercicio5 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la 3 notas del estudiante: ");
        double nota1 = sc.nextDouble();
        nota1 = nota1 * 0.30;
        double nota2 = sc.nextDouble();
        nota2 = nota2 * 0.30;
        double nota3 = sc.nextDouble();
        nota3 = nota3 * 0.40;
        double promedio = nota1 + nota2 + nota3;
        System.out.printf("El promedio del estudiante es: ", promedio);
        String resultado = (promedio >= 3.0) ? "Pasaste la materia" : "Perdiste la materia";
        System.out.println(resultado);
        sc.close();
        

    }
}