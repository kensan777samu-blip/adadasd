import java.util.Scanner;

public class Simple{
    private final Scanner sc;
    Nodo cab;
    Nodo p;
    public Simple (Scanner sc){
        this.sc = sc;
        this.cab = null;
        this.p = null;
    }

    public void ingresar(){
        int x;
        System.out.print("Digite numero de la cedula: ");
        x = sc.nextInt();
        System.out.print("Digite edad: ");
        int edad = sc.nextInt();
        System.out.print("Digite salario: ");
        double salario = sc.nextDouble();
        if (siVacio()){
            Nodo nuevo = new Nodo(x, edad, salario);
            cab = nuevo;
            p = nuevo;
        } else {
            Nodo nuevo = new Nodo(x, edad, salario);
            p.sig = nuevo; // ENLACE AL SIGUIENTE NODO.
            p = nuevo;
        }
    }
    public boolean siVacio(){
        return(this.cab == null);
    }
    public void imprimir(){
        String salida = "Lista de Empleados\n";
    for ( p=cab; p!=null; p=p.sig)
        salida+= "Cedula: " + p.num+" - "+p.edad+" años - $"+p.salario+"\n";
        System.out.println(salida);
    }

    public void empleados() {
    for (Nodo actual = cab; actual != null; actual = actual.sig) {
        if (actual.edad >= 25 && actual.edad <= 40
                && actual.salario > 1500000) {
            System.out.println(actual.num + " - " + actual.edad
                    + " años - $" + actual.salario);
        }
    } System.out.println("Lista vacía, no hay empleados que cumplan con los criterios.");
    }
}

public void empleadas() {
    for (Nodo actual = cab; actual != null; actual = actual.sig) {
        if (actual.edad < 25) {
            System.out.println(actual.num + " - " + actual.edad + " años\n" + "Aplica para una beca educativa.");
        }
    }
}
public void buscar(){
    System.out.print("Digite numero de la cedula a buscar: ");
    int x = sc.nextInt();
    for (Nodo actual = cab; actual != null; actual = actual.sig) {
        if (actual.num == x) {
            System.out.println("Empleado encontrado: " + actual.num + " - " + actual.edad + " años - $" + actual.salario);
            return;
        }
    } 
    System.out.println("Empleado no encontrado.");
    }

public void organizar(){
    if(siVacio()){
        System.out.println("Lista vacía, no se puede organizar.");
        return;
    } else {
        
        for (Nodo actual = cab; actual != null; actual = actual.sig) {
            for (Nodo siguiente = actual.sig; siguiente != null; siguiente = siguiente.sig) {
                if (actual.edad < siguiente.edad) {
                    // Intercambiar los datos de los nodos
                    int tempNum = actual.num;
                    int tempEdad = actual.edad;
                    double tempSalario = actual.salario;

                    actual.num = siguiente.num;
                    actual.edad = siguiente.edad;
                    actual.salario = siguiente.salario;

                    siguiente.num = tempNum;
                    siguiente.edad = tempEdad;
                    siguiente.salario = tempSalario;
                }
            }
        }
        System.out.println("Lista organizada de forma descendente por edad.");
    }
}
public void primerUltimo(){
    if (siVacio()){
        System.out.println("Lista vacía, no hay empleados.");
        return;
    } else {
        System.out.println("Primer empleado ingresado: " + cab.num + " - " + cab.edad + " años - $" + cab.salario);
        Nodo ultimo = cab;
        while (ultimo.sig != null) {
            ultimo = ultimo.sig;
        }
        System.out.println("Último empleado ingresado: " + ultimo.num + " - " + ultimo.edad + " años - $" + ultimo.salario);
    }
}
}
