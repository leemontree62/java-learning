public class Perro extends Animal{
    String nombrePerro;
    private double peso;
    private double raza;
    private double sexo;

    //constructores
    //getter y setter

    @Override
    public void hacerSonido() {
        IO.println("Soy Perro y Ladro: !!Guao guao!!!");
    }

    // Sobrescribo el metodo de mi clase padre para implementarlo a mi manera,
    //en este caso, según el comportamiento específico de un perro.

}
