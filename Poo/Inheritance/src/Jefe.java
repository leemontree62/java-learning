public class Jefe extends Persona{
    //atrubutos
    int id_jefe;
    String departamento_jefe;

    //constructor con parametros
    public Jefe() {

    }

    //constructor sin parametros
    public Jefe(int id, String dni, String nombre, String apellido, String domicilio, String telefono, int id_jefe, String departamento_jefe) {
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.id_jefe = id_jefe;
        this.departamento_jefe = departamento_jefe;
    }

    //getters
    public int getId_jefe() {
        return id_jefe;
    }

    public String getDepartamento_jefe() {
        return departamento_jefe;
    }

    //stters
    public void setId_jefe(int id_jefe) {
        this.id_jefe = id_jefe;
    }

    public void setDepartamento_jefe(String departamento_jefe) {
        this.departamento_jefe = departamento_jefe;
    }
}
