import java.util.Scanner;

public class Simple{
    Nodo cab;
    Nodo p;
    public Simple (){
        this.cab = null;
        this.p = null;
    }

    public void leer(){
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.print("Digite numero: ");
        x = sc.nextInt();
        if (siVacio()){
            Nodo nuevo = new Nodo(x);
            cab = nuevo;
            p = nuevo;
            p.num = x; // Informacion.
            p.sig = null; // Enlace al siguiente nodo.
        } else {
            Nodo nuevo = new Nodo(x);
            nuevo.num = x; // INFORMACION
            nuevo.sig = null; 
            p.sig = nuevo; // ENLACE AL SIGUIENTE NODO.
            p = nuevo;
        }
    }
    public boolean siVacio(){
        return(this.cab == null);
    }
    public void imprimir(){
        String salida = "Lista de Numeros\n";
    for ( p=cab; p!=null; p=p.sig)
        salida+= p.num+"\n";
        System.out.println(salida);
    }
    
}