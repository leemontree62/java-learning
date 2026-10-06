public class Circulo implements Figura,Dibujar,Rotar{
    //atributos
    private double radio;
    //constructor por defecto
    public Circulo(){

    }
    //contructor con parametros
    public Circulo(double radio) {
        this.radio = radio;
    }

    //getter
    //setter


    //otros metodos

    @Override
    public void dibujar() {
        IO.println("Estoy dibujando un !!Circulo!!");
    }

    @Override
    public void rotar() {
        IO.println("Estoy !!Rotando!!");
    }

    @Override
    public double calcularAria() {
        double pi = 3.14;
        double resultado = pi * radio * radio;
        return resultado;
    }
}
