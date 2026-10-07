public class DepositoAgua{
    private double capacidad;
    private double volumenActual;
    private DepositoAgua depositoDesborde;

    public DepositoAgua(double capacidad){
        this.capacidad = capacidad;
        this.volumenActual = 0;
        this.depositoDesborde = null;
    }
    public DepositoAgua(double capacidad ,double volumenActual){
        this.capacidad = capacidad;
        this.volumenActual = volumenActual;

    }
    public double getCapacidad() {
        return capacidad;
    }
    public double getVolumenActual() {
        return volumenActual;
    }
    public DepositoAgua getDepositoDesborde() {
        return depositoDesborde;
    }
    public void setCapacidad(double capacidad) {
        if (capacidad > 0) {
            this.capacidad = capacidad;
        } else {
            System.out.println("Capacidad invalida");
        }
    }
    public void setVolumenActual(double volumenActual) {
        this.volumenActual = volumenActual;
    }
    public void setDepositoDesborde(DepositoAgua depositoDesborde) {
        this.depositoDesborde = depositoDesborde;
    }
    public void mostrarEstado(){
        System.out.println("Capacidad: " + capacidad);
        System.out.println("Volumen actual: " + volumenActual);
        System.out.println("Espacio libre: " + (capacidad - volumenActual));
    }
    public void agregarAgua(double cantidad){
        volumenActual += cantidad;

        if (volumenActual > capacidad){
            double sobrante = volumenActual - capacidad;
            volumenActual = capacidad;
            if (depositoDesborde != null) {
                depositoDesborde.agregarAgua(sobrante);
            } else {
                System.out.println("El deposito se ha desbordado y no hay un deposito al que llenar.");
            }
        }
    }
    public void quitarAgua(double cantidad){
        if(cantidad <= volumenActual){
            volumenActual -= cantidad;
        } else {
            System.out.println("No hay suficiente agua en el deposito para quitar la cantidad solicitada.");
        }
    }
}