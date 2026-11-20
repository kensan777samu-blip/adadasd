import java.util.Scanner;
public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Simple ps= new Simple(sc);
        int op;
        do{
            System.out.println("Nenu principal");
            System.out.println("1. Ingresar empleados");
            System.out.println("2. Mostrar empleados.");
            System.out.println("3. Mostrar empleados entre 25-40 años con sueldo mayor a 1,5M");
            System.out.println("4. Mostrar empleadas de menos de 25 años aplicables para una beca educativa");
            System.out.println("5. Organizar lista (de forma descendente) ");
            System.out.println("6. Mostrar primer y ultimo empleado ingresado a la lista.");
            System.out.println("7. Buscar empleado");
            System.out.println("8. Salir");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    ps.ingresar();
                    break;
                case 2: 
                    ps.imprimir();
                    break;
                case 3: 
                    ps.empleados();
                    break;
                case 4:
                    ps.empleadas();
                    break;
                case 5: ps.organizar();
                    break;
                case 6:
                    ps.primerUltimo();
                    break;
                case 7:
                    ps.buscar();
                    break;
                case 8:
                    System.out.println("Saliendo del programa.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Digite una opcion valida.");
                    System.exit(0);
                    break;
            }
        } while (op !=8);
    sc.close();
} 
}
