import java.util.Scanner;
public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Simple ps= new Simple();
        int op;
        do{
            System.out.println("Nenu principal");
            System.out.println("1. Ingresar Valor");
            System.out.println("2. Imprimir Valor");
            System.out.println("3. Salir.");
            System.out.println("Digite una opcion.");
            op = sc.nextInt();
            switch (op) {
                case 1: 
                    ps.leer();
                    break;
                case 2:
                    ps.imprimir();
                    break;
                case 3:
                    System.out.println("Saliendo del programa.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Digite una opcion valida.");
                    System.exit(0);
                    break;
            }
        } while (op !=3);
    }
}
