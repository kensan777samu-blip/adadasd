public class App {
    public static void main(String[] args) throws Exception {
        Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes");
        libro1.mostrarInfo();
        Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez", false);
        libro2.mostrarInfo();
        libro2.prestar();
        libro2.mostrarInfo();
        libro1.prestar();
        libro1.mostrarInfo();
        libro1.devolver();
        libro1.mostrarInfo();
        libro2.devolver();
        libro2.mostrarInfo();
    }
}
