public class Animal {
    //atributos
    int id_animal;
    String descripcion;

    //constructores
    //metodos Getters y setters

    //otros metodos
    public void hacerSonido(){
        IO.println("El animal hace un sonido");
    }
    public void hacerSonido(String nombreAnimal){
        IO.println("El animal " + nombreAnimal + " hace un sonido");
    }
    public void hacerSonido(String nombreAnimal, String tipoSonido){
        IO.println("El animal " + nombreAnimal + " hace un sonido de tipo" + tipoSonido);
    }

   /* Sobrecarga: esta clase tiene 3 métodos diferentes, pero con exactamente el mismo nombre.
    ¿Cómo sabe el IDE qué método es el que necesito? Por los parámetros.
    Si no agregas parámetros a la hora de llamar al método, te llamará al que no recibe parámetros.
    Si es al que solo recibe "nombreAnimal", entonces implementará ese, y lo mismo aplica para el último
    si metes los 2 parámetros.
    Es decir, el IDE sabe cuál requieres dependiendo de los parámetros que le ingreses. */

}
