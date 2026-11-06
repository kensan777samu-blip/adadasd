public class Lector {
    private String nombre;
    private String cedula;
    private Libro libroActual;

    public Lector() {
    }

    public Lector(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Libro getLibroActual() {
        return libroActual;
    }

    public void setLibroActual(Libro libroActual) {
        this.libroActual = libroActual;
    }

    public void tomarPrestado(Libro libro) {
        if (libroActual != null) {
            System.out.println(nombre + " ya tiene un libro prestado.");
            return;
        }
        if (libro == null) {
            System.out.println("No se puede prestar un libro nulo.");
            return;
        }

        libroActual = libro;
        libro.prestar();
    }

    public void regresarLibro() {
        if (libroActual == null) {
            System.out.println(nombre + " no tiene un libro para devolver.");
            return;
        }

        libroActual.devolver();
        libroActual = null;
    }

    public void mostrarEstado() {
        String titulo = libroActual == null ? "Sin libro" : libroActual.getTitulo();
        System.out.println("Lector: " + nombre + " | Libro: " + titulo);
    }
}
