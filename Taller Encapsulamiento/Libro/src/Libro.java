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
    
    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public boolean getDisponible(){
        return disponible;
    }

    public void setTitulo(String titulo){
        if(titulo != null && !titulo.isEmpty()){
            this.titulo = titulo;
        }else{
            System.out.println("Error: el titulo no puede ester vacio.");
        }
    } 

    public void setAutor(String autor){
        if(autor != null && !autor.isEmpty()){
            this.autor = autor;
    } else {
            System.out.println("Error: El libro no puede estar sin autor.");
        }
    }

    public void setDisponible(boolean disponible){
        this.disponible = disponible;
    }

    public void mostrarInfo(){
        System.out.println("----Libro----");
        System.out.println("Titulo : " +  titulo);
        System.out.println("Autor : " + autor);
        System.out.println("Disponible : " + (disponible ? "si" : "No"));
    }

    public boolean prestar(){
        if(disponible){
            disponible = false;
            System.out.println("El libro \"" + titulo + "\" fue prestado.");
            return true;
        } else {
            System.out.println("El libro \"" + titulo + "\" ya esta prestado.");
            return false;
        }
    }

    public void devolver(){
        disponible = true;
        System.out.println("El libro \"" + titulo + "\" fue devuelto.");
    }

}  