public class Persona {
    //atributos
    private int num;
    private int edad;
    private String nombre;

    //constructor sin parametros
    public Persona() {
    }

    //contructor con parametros
    public Persona(int num, int edad, String nombre) {
        this.num = num;
        this.edad = edad;
        this.nombre = nombre;
    }

    //getters
    public int getNum() {
        return num;
    }
    public int getEdad() {
        return edad;
    }
    public String getNombre() {
        return nombre;
    }

    //setters
    public void setNum(int num) {
        this.num = num;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
