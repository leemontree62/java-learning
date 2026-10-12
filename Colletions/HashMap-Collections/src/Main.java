void main() {
    Map<Integer,String> mapaEmpleado = new HashMap<>();
    mapaEmpleado.put(1222,"juan");
    mapaEmpleado.put(3245,"javier");
    mapaEmpleado.put(5502,"kevin");
    mapaEmpleado.put(4404,"camilo");

    //buscar
    //boolean estaono = mapaEmpleado.containsKey(4404);//buscar por key
    boolean estaOno = mapaEmpleado.containsValue("camilo");//buscar por valor

    if (estaOno == true) {
        IO.println("El valor buscado esta");
    }else {
        IO.println("El valor buscado no esta");
    }

    IO.println("________________________________");
    IO.println(mapaEmpleado.values());

    IO.println("traer datos por medio de get");
    String nombre = mapaEmpleado.get(1222);
    IO.println("El empleado buscado es : " + nombre);
    //remover
    mapaEmpleado.remove(1222);

    /*
    * put(C clave, V valor): Añade o actualiza un par de datos relacionados.
     get(Object clave): Encuentra el valor usando su clave o regresa null si no existe.
     containsKey(Object clave): Revisa si la clave ya se encuentra guardada.
     * containsValue(Object valor): Revisa si el valor ya se encuentra guardado.
     * remove(Object clave): Borra el dato asociado a esa clave.
     * keySet(): Obtiene una lista con todas las claves.
      values(): Obtiene una lista con todos los valores.
*/

}
