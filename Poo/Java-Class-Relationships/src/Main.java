//existen las relaciones 1 a 1, 1 a N, N a 1 y N a N

void main() {
    //creo un objeto auto
    Auto aut = new Auto();
    aut.setId(1L);
    aut.setMarca("Hiunday");
    aut.setModelo("veloster");

    //creo una lista de propietarios vacios
    List<Propietario> listaPropietario = new ArrayList<>();

    //creo 2 objetos propietarios
    Propietario prop1 = new Propietario();
    Propietario prop2 = new Propietario();

    prop1.setId(32L);
    prop1.setNombre("keneth");
    prop1.setApellido("Cundumi");

    prop2.setId(23L);
    prop2.setNombre("javier");
    prop2.setApellido("mancilla");

    //guardo esos 2 propietarios en la lista
    listaPropietario.add(prop1);
    listaPropietario.add(prop2);

    //le asigno la lista al auto
    aut.setListaPropietario(listaPropietario);

    IO.println("El auto :" + aut.getMarca() + "\nModelos: " + aut.getModelo() + "\ncon Id :" + aut.getId() + "\nPropietarios: " + aut.getListaPropietario().toString());
}
