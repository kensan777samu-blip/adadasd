## Composición: Vuelo y Asiento

Este ejercicio modela composición en Java: cada `Vuelo` crea y administra sus propios `Asiento`s. Los asientos se generan automáticamente al construir el vuelo, desde `A1` hasta la capacidad indicada.

### Ejecutar

Desde la raíz del proyecto:

```sh
javac -d bin src/*.java
java -cp bin App
```

`App` muestra la información del vuelo, embarca pasajeros, intenta ocupar un asiento ya ocupado y después libera un asiento para mostrar el estado actualizado.
