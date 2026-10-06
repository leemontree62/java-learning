public class Cuadrado extends Circulo{
    //atributos
    private double radio;
    //contructor por defecto

    public Cuadrado() {
    }

    //constructor con parametros
    public Cuadrado(double x, double y, double lado, double radio) {
        super(x, y, lado);
        this.radio = radio;
    }

    //metodos
    @Override
    public double calcularArea() {
        double pi = 3.15;
        double resultado = pi * radio * radio;
        return resultado;
    }
}
