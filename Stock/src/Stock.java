public class Stock {
    Nodo cima;

    public Stock (){
        cima = null;
    }

    public boolean vacia(){
        return cima == null;
    }
    public void apilar(Estudiante dato)
    {
        if (dato == null) {
            System.out.println("No se puede apilar un Integrante vacio.");
            return;
        }
        Nodo nuevo = new Nodo(dato);
        nuevo.siguiente = cima;
        cima = nuevo;
    }
    public void imprimir(){
        Nodo actual = cima;
        if (vacia()) {
            System.out.println("La lista esta vacia.");
            return ;
        }
        while (actual != null) {
         System.out.println("\nCodigo: " + actual.dato.codigo);
         System.out.println("\nNombre: " + actual.dato.nombres);
         System.out.println("\nEdad: " + actual.dato.edad);

         System.out.println("Promedio: " + actual.dato.promedio);

         actual = actual.siguiente;
          }
        }
        public Estudiante buscar(int codigo){
            Nodo actual = cima;
            while (actual != null){
                if(actual.dato.codigo == codigo){
                    return actual.dato;
                }
                actual = actual.siguiente;
            }
            return  null;
    }
    public void eliminar(int codigo){
        if (cima == null){
            System.out.println("La pila esta vacia. No hay nadie para eliminar.");
        return;
        }
        if (cima.dato.codigo == codigo){
            cima = cima.siguiente;
            System.out.println("Integrante Eliminado.");
            return;
        }
        Nodo actual = cima;
        while (actual.siguiente != null && actual.siguiente.dato.codigo != codigo) {
            actual = actual.siguiente;
        }
        if (actual.siguiente == null){
            System.out.println("Integrante no encontrado");
        } else {
            actual.siguiente = actual.siguiente.siguiente;
            System.out.println("Integrante Eliminado.");
        }
    }
    public void modifica(int codigo, Estudiante nuevosDatos){
        if (nuevosDatos == null) {
            System.out.println("No se pueden usar datos vacios para modificar.");
            return;
        }
        Estudiante encontrado = buscar(codigo);
        if (encontrado == null){
            System.out.println("Integrante no encontrado");
            return;
        }
        Estudiante repetido= buscar(nuevosDatos.codigo);
        if (repetido != null && repetido != encontrado){
            System.out.println("El codigo ya existe. Escoga otro ;)");
            return;
        }
        encontrado.codigo =nuevosDatos.codigo;
        encontrado.nombres = nuevosDatos.nombres;
        encontrado.edad =nuevosDatos.edad;
        encontrado.promedio = nuevosDatos.promedio;
        System.out.println("Integrante modificado con exito!");
    }
}
