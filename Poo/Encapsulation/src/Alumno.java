public class Alumno {

    // Modificadores de acceso: esto nos permite acceder o no a determinados datos
    // que se encuentren dentro de una clase.

    // public: puede ser usado desde cualquier clase o posición dentro de mi aplicación,
    // ya sea un método o un atributo.

    // private: únicamente se puede usar dentro de la clase donde está declarado o especificado,
    // y ninguna otra clase podrá hacer uso directo de ese atributo o método.

    // protected: establece que el acceso a atributos o métodos, además de su propia clase,
    // también puede ser utilizado por sus clases hijas.

    // Nota: normalmente, todos los atributos de una clase deben ser privados para que otras clases
    // no puedan acceder directamente a ellos y nos obligue a usar los getters y setters
    // para consultar o establecer sus valores.


    private int id;
    private String nombre;
    private String apellido;

    //constructor sin parametros
    public Alumno() {

    }

    //constructor con parametros
    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //getter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    //setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
