package Logica;

public class Alumno {
    //atributos
    int id;
    String nombre;
    String apellido;

    //constructor sin parametros
    public Alumno() {

    }

    //contructor con parametros
    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    /*Getter "Traer" y Setter "Colocar" - son metodos especiales que nos permiten traer los valores de nuestros
    atrubutos de la clase*/

    //Getter
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    //Setter
    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

}
