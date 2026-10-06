public class Circulo extends Figura{
    //atributos
    private double lado;

    //constructor por defecto
    public Circulo(){

    }

    //contructor con parametros
    public Circulo(double x, double y, double lado) {
        super(x, y);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        double resultado = lado * lado;
        return resultado;
    }
}
