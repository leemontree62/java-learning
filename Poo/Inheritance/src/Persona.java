public class Persona {
    //Atributos
    int id;
    String dni;
    String nombre;
    String apellido;
    String domicilio;
    String telefono;

    //Constructor por defecto
    public Persona() {
    }

    //Constructor con parametros
    public Persona(int id, String dni, String nombre, String apellido, String domicilio, String telefono) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }

    //Getter
    public int getId() {
        return id;
    }
    public String getDni() {
        return dni;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public String getDomicilio() {
        return domicilio;
    }
    public String getTelefono() {
        return telefono;
    }

    //setter
    public void setId(int id) {
        this.id = id;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
