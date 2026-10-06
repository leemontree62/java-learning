/*
* Es una clase
* Representa una lista doblemente en lazada "ida y vuelta
* Permite duplicados
* amntiene el orden de insercion
* Manipulacion mas rapida
* Puede ser usada/trada no solo como lista, sino tambien como pila, o como cola
* Permite hacer inserciones o eliminaciones, tanto al Principio como al final de la coleccion, "poreso puede ser tratado como una pila o cola"*/
void main() {
    //agregar personas al final de la lista
    List<Persona> lista = new LinkedList<>();
    lista.add(new Persona(1,14,"keneth"));
    lista.add(new Persona(2,22,"javier"));
    lista.add(new Persona(3,50,"Danna"));
    lista.add(new Persona(4,7,"Camila"));

    //agregar al inicio es tan facil como colocar un parametro diciendo la pocicion o el inicio en este caso el 0
    lista.add(0, new Persona(5,33,"Probando"));

    //recorrido foreach
    for (Persona persona : lista){
        IO.println("prueba :" + persona.getNombre());
    }
}
