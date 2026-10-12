public class Persona {
    //atributoos
    private int num;
    private int edad;
    private String nombre;

    //constructor por defecto
    public Persona() {
    }

    //constructor con parametros
    public Persona(int num, int edad, String nombre) {
        this.num = num;
        this.edad = edad;
        this.nombre = nombre;
    }

    //metodos getter
    public int getNum() {
        return num;
    }
    public int getEdad() {
        return edad;
    }
    public String getNombre() {
        return nombre;
    }

    //metodos setter
    public void setNum(int num) {
        this.num = num;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //otros metodos
}
