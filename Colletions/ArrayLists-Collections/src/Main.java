
void main() {
    List<Persona> lista = new ArrayList<>();
    lista.add(new Persona(1,22,"keneth"));
    lista.add(new Persona(2,12,"Camila"));
    lista.add(new Persona(5,55,"javier"));
    lista.add(new Persona(9,32,"juan"));

    //recorrer por indice
    for (int i = 0; i < lista.size(); i++) {
        IO.println( "Prueba : " + lista.get(i).getNombre());
    }

    IO.println("___________________________________________");
    //recorrido por foreach
    for (Persona perso: lista){
        IO.println("prueba : " + perso.getNombre());
    }
}
