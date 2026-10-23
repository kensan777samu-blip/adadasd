import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Stock pila = new Stock();
        int opcion;
        do {
            System.out.println("Agenda de Integrates");
            System.out.println("1. Registrar Integrante");
            System.out.println("2. Eliminar Integrante");
            System.out.println("3. Modificar Integrante");
            System.out.println("4. Buscar Integrante");
            System.out.println("5. Lista de Integrantes");
            System.out.println("6. Salir.");

            System.out.println("Seleccione una Opcion");

            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Codigo: ");
                    int codigo = sc.nextInt();
                    sc.nextLine();
                    if (pila.buscar(codigo) != null){
                        System.out.println("Ese codigo ya existe. Escoge otro!");
                    break; 
                }
                    System.out.println("Nombre y apellidos: ");
                    String nombres = sc.nextLine();
                    System.out.println("Edad: ");
                    int edad = sc.nextInt();
                    System.out.println("Promedio: ");
                    double promedio = sc.nextDouble();
                    Estudiante nuevo = new Estudiante(codigo, nombres, edad, promedio);
                    pila.apilar(nuevo);
                    System.out.println("Integrante registrado.");
                    break;
                case 2:
                    System.out.println("Codigo a eliminar: ");
                    codigo = sc.nextInt();
                    System.out.println("Esta seguro que desea eliminar al Integrante con codigo: " + codigo + " de la lista?" );
                    System.out.println("1. Si");
                    System.out.println("2. No");
                    opcion = sc.nextInt();
                    if (opcion == 1){
                    pila.eliminar(codigo);
                    break;
                    } else {
                        System.out.println("Cancelando eliminacion.");
                    }
                    break;
                case 3:
                    System.out.println("Codigo del Integrante que desee modificar: ");
                    codigo = sc.nextInt();
                    if (pila.buscar(codigo) == null){
                        System.out.println("Integrante no encontrado.");
                    
                    break;
                    }
                    System.out.println("Nuevo codigo: ");
                    int nuevoCodigo = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Nuevos Nombres y Apellidos: ");
                    String nuevoNombres = sc.nextLine();
                    System.out.println("Nueva edad: ");
                    int nuevaEdad = sc.nextInt();
                    System.out.println("Nuevo promedio: ");
                    double nuevoPromedio = sc.nextDouble();
                    Estudiante actualizado = new Estudiante(nuevoCodigo, nuevoNombres, nuevaEdad, nuevoPromedio);
                    pila.modifica(codigo, actualizado);
                    break;
                case 4:
                    System.out.println("Integrante o codigo que desea buscar: ");
                    codigo = sc.nextInt();
                    Estudiante encontrado = pila.buscar(codigo);
                    if (encontrado != null){
                        System.out.println("El Integrante si esta registrado.");
                        System.out.println("Nombre: " + encontrado.nombres);
                    }
                    else {
                        System.out.println("El Integrante no esta registrado.");
                    }
                    break;
                case 5:
                    pila.imprimir();
                    break;
                case 6:
                    System.out.println("Terminando Programa.");
                    System.exit(0);
                    break;
            
                default:
                    System.out.println("ERROR. Seleccione una opcion posible en el rango de 1-6");
                    break;
            }
    } while(opcion != 6);
    sc.close();
}
}