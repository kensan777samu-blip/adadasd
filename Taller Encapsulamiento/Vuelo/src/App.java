public class App {
    public static void main(String[] args) throws Exception {
        Vuelo vuelo1 = new Vuelo("ABC123", "Peru", "Bolivia", 18, 17);
        vuelo1.mostrarInfo();
        vuelo1.embarcar();
        vuelo1.desembarcar();
        vuelo1.setOcupacion(18);
        vuelo1.embarcar();
        vuelo1.embarcar();
        vuelo1.mostrarInfo();
        Vuelo vuelo2 = new Vuelo("DEF456", "Chile", "Argentina", 10, 9);
        vuelo2.mostrarInfo();
        vuelo2.embarcar();
        vuelo2.desembarcar();
        vuelo2.setOcupacion(10);
        vuelo2.embarcar();
        vuelo2.embarcar();
        vuelo2.mostrarInfo();
        vuelo2.desembarcar();
        vuelo2.desembarcar();
        vuelo2.embarcar();
    }
}