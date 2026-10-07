public class App {
    public static void main(String[] args) throws Exception {
        DepositoAgua deposito1 = new DepositoAgua(100);
        DepositoAgua deposito2 = new DepositoAgua(50, 0);

        deposito1.setCapacidad(100);
        deposito2.setCapacidad(50);
        deposito2.setVolumenActual(0);
        deposito1.setDepositoDesborde(deposito2);
        deposito1.agregarAgua(120);
        deposito1.mostrarEstado();
        deposito2.mostrarEstado();
        deposito2.quitarAgua(5);
        deposito2.mostrarEstado();
    }
}
