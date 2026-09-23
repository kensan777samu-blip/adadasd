import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese las horas trabajadas en la semana: ");
        int horasTrabajadas = sc.nextInt();
        System.out.print("Ingrese el valor de la hora: ");
        double valorHora = sc.nextDouble();

        double salarioBruto = horasTrabajadas * valorHora;
        double descuentoSeguridadSocial = salarioBruto * 0.08;
        double retencionFuente = salarioBruto * 0.05;
        double salarioNeto = salarioBruto - descuentoSeguridadSocial - retencionFuente;

        System.out.printf("Empleado: ", nombre);
        System.out.printf("Horas trabajadas: ", horasTrabajadas);
        System.out.printf("Salario bruto: ", salarioBruto);
        System.out.printf("Descuento SS (8%): ", descuentoSeguridadSocial);
        System.out.printf("Retención (5%): ", retencionFuente);
        System.out.printf("Salario neto: ", salarioNeto);

        sc.close();
    }
}
