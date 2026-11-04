import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String num;
        Cola ps = new Cola(sc);
        int op;
        do{
        System.out.println("Menu principal");
        System.out.println("1. Insertar Nombre");
        System.out.println("2. Eliminar nombre");
        System.out.println("3. Imprimir nombres");
        System.out.println("4. Salir.");
        System.out.println("Digite una opcion: ");
        op = sc.nextInt();
        switch (op) {
            case 1:
                ps.Insertar();
                break;
                case 2:
                    ps.Eliminar();
                    break;
                case 3:
                    ps.Imprimir();
                    break;
                case 4:
                    System.out.println("Cerrando sistema.");
                    break;
            default:
                System.out.println("El numero: " + op + " no es una opción valida.");
                break;
        }
    } while (op!=4);
        }
}
