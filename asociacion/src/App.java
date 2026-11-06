public class App {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Cien años de soledad");
        Libro libro2 = new Libro("El principito");

        Lector lector1 = new Lector("Ana", "123456789");
        Lector lector2 = new Lector("Luis", "987654321");

        lector1.tomarPrestado(libro1);
        lector2.tomarPrestado(libro2);

        lector1.mostrarEstado();
        lector2.mostrarEstado();

        lector2.regresarLibro();
        lector1.regresarLibro();
        lector1.tomarPrestado(libro2);

        lector1.mostrarEstado();
        lector2.mostrarEstado();
    }
}
