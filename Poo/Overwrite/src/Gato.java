public class Gato extends Animal{
    // Sobrescribo el metodo de mi clase padre para implementarlo a mi manera,
    //en este caso, según el comportamiento específico de un gato.

    @Override
    public void hacerSonido() {
        IO.println("Soy un Gato y hago: Miau miau");
    }
}
