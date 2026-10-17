void main() {

    // Se instancia la clase Caja indicando que trabajará con objetos de tipo String.
    // El operador diamante <> permite inferir el tipo genérico a partir del contexto.
    Caja<String> cajaString = new Caja<>();

    // Se almacena una cadena de texto en la caja.
    // El parámetro del método debe ser String porque T fue definido como String.
    cajaString.ponerAlgo("esto es una prueba");

    // Se recupera el contenido sin necesidad de realizar una conversión explícita.
    // obtenerAlgo() devuelve String porque el tipo genérico de la caja es String.
    String contenido = cajaString.obtenerAlgo();


    // Se instancia otra Caja, esta vez parametrizada con el tipo Integer.
    // Esta instancia es independiente de cajaString y tiene su propio contenido.
    Caja<Integer> cajaEntero = new Caja<>();

    // Se almacena el número entero 22.
    // Java utiliza autoboxing para convertir el int literal 22 en un Integer.
    cajaEntero.ponerAlgo(22);

    // Se recupera el contenido como Integer, sin realizar un casting manual.
    Integer numero = cajaEntero.obtenerAlgo();


    // Se muestran los valores recuperados de ambas cajas.
    IO.println("El contenido es: " + contenido);
    IO.println("EL numero es: " + numero);
}