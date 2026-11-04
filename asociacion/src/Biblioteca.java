public class Biblioteca {
    private String nombre;
    private Libro[] catalogo;
    private int cantidad;

    public Biblioteca(String nombre){
        this.nombre = nombre;
        this.catalogo = new Libro[10];
        this.cantidad = 0;
    }
    public String getNombre(){
        return nombre;
    }
    public void agregarLibro(Libro libro){
        if (cantidad < catalogo.length){
            catalogo[cantidad] = libro;
            cantidad++;
            System.out.println("Libro \"" + libro.getTitulo() + "\" agregado al catalogo");
        } else {
            System.out.println("El catalogo esta lleno. No se puede agregar más");
        }
    }
public void mostararCatalogo(){
    System.out.println("=== Catalogo: " + nombre + " ===");
    if(cantidad== 0) {
        System.out.println("El catalogo está vacio.");
    } else {
        for (int i = 0; i< cantidad; i++) {
            catalogo[i].mostrarInfo();
            System.out.println();
        }
    }
}
public void buscarPorAutor(String autor){
System.out.println("Libros de \"" + autor + "\":");
boolean encontrado = false;
for ( int i = 0; i< cantidad; i++){
    if(catalogo[i].getAutor().equalsIgnoreCase(autor)){
        System.out.println(" -" + catalogo[i].getTitulo());
        encontrado = true;
    }
}

if (!encontrado){
    System.out.println("No se encotraron libros de ese autor.");
        }
    }
}
