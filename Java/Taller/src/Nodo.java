public class Nodo{
int num;       // cédula
int edad;
double salario;
Nodo sig;

public Nodo(int num, int edad, double salario) {
    this.num = num;
    this.edad = edad;
    this.salario = salario;
    this.sig = null;
}
}

