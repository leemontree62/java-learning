public class Caja <T> {
    private T conntenido;

    //metodos
    public void ponerAlgo(T conntenido){
        this.conntenido = conntenido;
    }

    public T obtenerAlgo(){
        return conntenido;
    }
}
