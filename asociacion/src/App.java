public class App {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel Garcia Marquez");
        Libro libro2 = new Libro("El amor en los tiempos del colera", "Gabriel Garcia Marquez");
        Libro libro3 = new Libro("El principito", "Antoine de Saint-Exupéry");
        Biblioteca biblioteca = new Biblioteca("Biblioteca Luis Angel Arango");
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);
        System.out.println();
        biblioteca.mostararCatalogo();

        biblioteca.buscarPorAutor("Gabriel Garcia Marquez");
        System.out.println();
        biblioteca.buscarPorAutor("Jorge Luis Borges");
    }
}
