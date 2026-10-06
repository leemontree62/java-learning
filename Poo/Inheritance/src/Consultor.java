public class Consultor extends Persona{
    //atributos
    int numConsultor;
    String nombreConsultor;

    //constructor por defecto
    public Consultor(){

    }

    //contructor con parametros
    public Consultor(int id, String dni, String nombre, String apellido, String domicilio, String telefono, int numConsultor, String nombreConsultor) {
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.numConsultor = numConsultor;
        this.nombreConsultor = nombreConsultor;
    }

    //getter
    public int getNumConsultor() {
        return numConsultor;
    }

    public String getNombreConsultor() {
        return nombreConsultor;
    }

    //setter
    public void setNumConsultor(int numConsultor) {
        this.numConsultor = numConsultor;
    }

    public void setNombreConsultor(String nombreConsultor) {
        this.nombreConsultor = nombreConsultor;
    }
}
