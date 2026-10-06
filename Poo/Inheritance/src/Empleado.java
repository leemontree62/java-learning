public class Empleado extends  Persona{
    //atributos
    String cargo;
    double sueldo;

    //constructor por defecto
    public Empleado(){

    }

    //constructor con parametros
    public Empleado(int id, String dni, String nombre, String apellido, String domicilio, String telefono, String cargo, double sueldo) {
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    //getters
    public String getCargo() {
        return cargo;
    }

    public double getSueldo() {
        return sueldo;
    }

    //setter
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
