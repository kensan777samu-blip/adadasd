public class Vuelo{
    private String origen; 
    private String destino;
    private String numero;
    private int capacidadMaxima;
    private int ocupacion;

    public Vuelo(String numero, String origen, String destino, int capacidadMaxima, int ocupacion) {

        this.numero = numero;
        this.origen = origen;
        this.destino = destino;
        this.capacidadMaxima = capacidadMaxima;
        this.ocupacion = ocupacion;
    }
    public String getOrigen() {
        return this.origen;
    }
    public String getDestino() {
        return this.   destino;
    }
    public String getNumero() {
        return this.numero;
    }
    public int getCapacidadMaxima() {
        return this.capacidadMaxima;
    }
    public int getOcupacion() {
        return this.ocupacion;
    }
    public void setOrigen(String origen) {
        this.origen = origen;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public void setCapacidadMaxima(int capacidadMaxima) {
        if(capacidadMaxima < 0){
            this.capacidadMaxima = capacidadMaxima;
            System.out.println("Error: la capacidad maxima no puede ser negativa.");
        }
    }
    public void setOcupacion(int ocupacion) {
        if(ocupacion < 0 || ocupacion > capacidadMaxima){
            this.ocupacion = ocupacion;
            System.out.println("Error: la ocupacion no puede ser negativa ni mayor a la capacidad maxima.");
        }
    }
    public void mostrarInfo() {
        System.out.println("----Vuelo----");
        System.out.println("Numero : " + numero);
        System.out.println("Origen : " + origen);
        System.out.println("Destino : " + destino);
        System.out.println("Capacidad Maxima : " + capacidadMaxima);
        System.out.println("Ocupacion : " + ocupacion);
    }
    public void embarcar(){
        if(ocupacion < capacidadMaxima){
            ocupacion++;
            System.out.println("Un pasajero ha embarcado en el vuelo " + numero + ".");
        }else{
            System.out.println("Error: el vuelo " + numero + " esta lleno.");
        }
    }
    public void desembarcar(){
        if(ocupacion > 0){
            ocupacion--;
            System.out.println("Un pasajero ha desembarcado del vuelo " + numero + ".");
        }else{
            System.out.println("Error: no hay pasajeros en el vuelo " + numero + ".");
        }
    }
    
}