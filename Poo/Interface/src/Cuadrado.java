public class Cuadrado implements Figura, Dibujar{
    //atributos
    private double lado;
    //constructor por defecto
    public Cuadrado(){

    }
    //contructor con parametros

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    //getter
    //setter

    //otros metodos
    @Override
    public void dibujar() {
        IO.println("Estoy dibujando un !!Cuadrado!!");
    }

    @Override
    public double calcularAria() {
        double resultado = lado * lado;
        return resultado;
    }
}
