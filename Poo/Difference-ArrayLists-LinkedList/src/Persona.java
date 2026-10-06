public class Persona {
    //atributos
    private int num;
    private int edad;
    private  String nombre;

    //constructor sin parametros
    public Persona() {
    }

    //cosntrctor con parametros
    public Persona(int num, int edad, String nombre) {
        this.num = num;
        this.edad = edad;
        this.nombre = nombre;
    }

    //getter
    public int getNum() {
        return num;
    }
    public int getEdad() {
        return edad;
    }
    public String getnombre() {
        return nombre;
    }

    //setter
    public void setNum(int num) {
        this.num = num;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setnombre(String nombre) {
        this.nombre = nombre;
    }
    //otros metodos

    @Override
    public String toString() {
        return "Persona [" + "Num - " + num + " - Edad - " + edad + " - Nombre" + nombre + "]";
    }
}
