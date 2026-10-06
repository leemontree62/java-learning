void main() {
    Stack<Integer> pila = new Stack<>();
    IO.println("Pila vacía :" + pila);
    IO.println("¿La pila está vacía? :" + pila.isEmpty());

    // Agregar
    pila.push(1);
    pila.push(2);
    pila.push(3);
    pila.push(4);

    // Recorrido
    for (Integer pilita : pila) {
        IO.println(pilita);
    }

    // Mostrar
    IO.println("Pila :" + pila);
    IO.println("¿La pila está vacía? :" + pila.isEmpty());

    // Para eliminar el último registro que entró se utiliza el método pop.
    pila.pop(); // Eliminar el último registro.

    // Si quiero buscar un elemento en particular, utilizamos el método search().
    IO.println("¿Está el elemento 3? :" + pila.search(3));
    IO.println("¿Último agregado? :" + pila.peek());


    // .push para agregar valores.
    // .pop para eliminar el último registro que agregué.
    // .search para buscar un elemento.
    // .peek para ver el último elemento agregado sin eliminarlo.
}
