void main() {
    List<Persona> listaArray = new ArrayList<>();
    listaArray.add(new Persona(1,22,"Keneth"));
    listaArray.add(new Persona(2,20,"Caro"));
    listaArray.add(new Persona(3,19,"Lorenna"));
    listaArray.add(new Persona(4,23,"Cristian"));

    List<Persona> listaLinked = new LinkedList<>();
    listaLinked.add(new Persona(1,22,"Keneth"));
    listaLinked.add(new Persona(2,20,"Caro"));
    listaLinked.add(new Persona(3,19,"Lorenna"));
    listaLinked.add(new Persona(4,23,"Cristian"));

    // Remove en ArrayList
    listaArray.remove(3); // Aquí estoy expresando un índice.

    // Remove en LinkedList
    String nombreBorrar = "Keneth";

    // Foreach
    for (Persona person : listaLinked) {
        if (person.getnombre().equals(nombreBorrar)) {
            listaLinked.remove(person);// Acá estoy expresando el elemento que yo quiero borrar.
            break; // Corto el loop para que deje de recorrer la lista.
        }
    }

    IO.println("_________Luego de eliminar__________");

    // Recorrido por Foreach
    IO.println("_____________ArrayLists____________");
    for (Persona persona : listaArray) {
        IO.println("Prueba :" + persona.getnombre());
    }

    IO.println("_____________LinkedLists____________");
    for (Persona persona : listaLinked) {
        IO.println("Prueba :" + persona.getnombre());
    }

    IO.println("________Que tamaño tienen las Listas?__________");
    IO.println("ArrayLists :" + listaArray.size());
    IO.println("LinkedLists :" + listaLinked.size());

    IO.println("_____________Obtener Primer y Último Objeto LinkedList____________");
    IO.println("Primer objeto : " + listaLinked.getFirst().toString());
    IO.println("Último objeto : " + listaLinked.getLast().toString());


    IO.println("________________Eliminar Lista_____________");
    listaArray.clear();
    listaLinked.clear();
    IO.println();

    IO.println("__________Está Vacía la Lista?____________");
    IO.println("ArrayLists :" + listaArray.isEmpty());
    IO.println("LinkedLists :" + listaLinked.isEmpty());
}
