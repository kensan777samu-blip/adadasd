public class Libro {
    private String titulo;
    private String autor;
    private boolean disponible;

    public Libro(){
        disponible = true;
    }
    public Libro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
    }

    public Libro(String titulo, String autor, boolean disponible){
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = disponible;
    }

    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public boolean isDisponible() {
        return disponible;
    }

    public void prestar() {
        if (!disponible) {
            System.out.println("El libro ya está prestado.");
            return;
        }

        disponible = false;
        System.out.println("El libro ha sido prestado.");
    }

    public void devolver() {
        disponible = true;
        System.out.println("El libro ya fue devuelto.");
    }

public void setAutor(String autor) {
    this.autor = autor;
}
public void setDisponible(boolean disponible) {
    this.disponible = disponible;
}
public void setTitulo(String titulo) {
    this.titulo = titulo;
}
public void mostrarInfo(){
    System.out.println("Título: " + titulo);
    System.out.println("Autor: " + autor);
    System.out.println("Estado: " + (disponible ? "Disponible" : "Prestado"));
}
}
