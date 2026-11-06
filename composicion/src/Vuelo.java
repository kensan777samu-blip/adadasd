import java.util.ArrayList;
import java.util.List;

public class Vuelo {
    private String numero;
    private String origen;
    private String destino;
    private int capacidadMaxima;
    private final List<Asiento> asientos;

    public Vuelo() {
        this("", "", "", 0);
    }

    public Vuelo(String numero, String origen, String destino) {
        this(numero, origen, destino, 0);
    }

    public Vuelo(String numero, String origen, String destino, int capacidadMaxima) {
        if (capacidadMaxima < 0) {
            throw new IllegalArgumentException("La capacidad no puede ser negativa.");
        }

        this.numero = numero;
        this.origen = origen;
        this.destino = destino;
        this.capacidadMaxima = capacidadMaxima;
        this.asientos = new ArrayList<>();

        for (int i = 1; i <= capacidadMaxima; i++) {
            asientos.add(new Asiento("A" + i));
        }
    }

    public void mostrarInfo() {
        System.out.println("---- Vuelo " + numero + " ----");
        System.out.println("Ruta: " + origen + " → " + destino);
        System.out.println("Capacidad: " + capacidadMaxima + " asientos");
    }

    public void mostrarAsientos() {
        System.out.println("Estado de asientos | Vuelo " + numero + ":");
        for (Asiento asiento : asientos) {
            asiento.mostrarEstado();
        }
    }

    public void embarcar(String codigoAsiento) {
        Asiento asiento = buscarAsiento(codigoAsiento);
        if (asiento == null) {
            System.out.println("El asiento " + codigoAsiento + " no existe.");
            return;
        }

        asiento.ocupar();
    }

    public void desembarcar(String codigoAsiento) {
        Asiento asiento = buscarAsiento(codigoAsiento);
        if (asiento == null) {
            System.out.println("El asiento " + codigoAsiento + " no existe.");
            return;
        }

        asiento.liberar();
    }

    private Asiento buscarAsiento(String codigoAsiento) {
        for (Asiento asiento : asientos) {
            if (asiento.getCodigo().equals(codigoAsiento)) {
                return asiento;
            }
        }

        return null;
    }
}