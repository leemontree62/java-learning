/*
 * Clase genérica que permite almacenar y recuperar un valor
 * cuyo tipo se determina al crear una instancia de la clase.
 *
 * @param <T> tipo de dato que almacenará la caja.
 */
public class Caja<T> {

    // Atributo cuyo tipo depende del parámetro genérico T.
    // Si la caja es Caja<String>, este atributo se usa como String.
    // Si la caja es Caja<Integer>, este atributo se usa como Integer.
    private T conntenido;

    /*
     * Almacena un valor en el atributo de la caja.
     *
     * @param conntenido valor que se desea almacenar.
     *Debe ser compatible con el tipo T.
     */
    public void ponerAlgo(T conntenido) {
        this.conntenido = conntenido;
    }

    /*
     * Devuelve el valor almacenado en la caja.
     *
     *@return el contenido del tipo T.
     */
    public T obtenerAlgo() {
        return conntenido;
    }
}