import java.util.*;
public class Cola{


public static int tope = 10;
String [] v;
int cima;
private final Scanner sc;
//Constructor
public Cola(Scanner sc){
    this.sc = sc;
    v = new String[tope];
    cima =-1;
}
public void Insertar(){
    String valor;
    System.out.println("Digite Nombre: ");
    valor = sc.next();
    if(llena() == true)
        System.out.println("La Cola se encuentra Llena");
    else {
        cima ++;
        v[cima] = valor;
    }
}
public void Eliminar(){
    if(vacia() == true)
        System.out.println("La cola se encuentra vacia");
    else {
        String eliminado = v[0];
        for (int i = 0; i < cima; i++)
            v[i] = v[i + 1];
        v[cima] = null;
        cima--;
        System.out.println("Se elimino: " + eliminado);
    }
}
public void Imprimir(){
    if (vacia()) {
        System.out.println("La cola se encuentra vacia");
        return;
    }
    System.out.println("Lista de personas:");
    for (int i = 0; i <= cima; i++)
        System.out.println(v[i]);
}

public boolean llena (){
    if(cima == v.length-1)
        return true;
    else 
        return false;
}

public boolean vacia(){
    if(cima == -1)
        return true;
    else 
        return false;
}
}