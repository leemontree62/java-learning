public abstract class Figura {
    protected double x;
    protected   double y;

    //contructores va hacer utilizados unicamente por sus clases hijas ya que esta clase no se podra ser instaciada
    public Figura() {
    }

    //contructor con parametros
    public Figura(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //metodos
    public abstract double calcularArea();


}
