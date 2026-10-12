import java.util.List;

public class Auto {
    //atributos
    private long id;
    private String marca;
    private  String modelo;
    private List<Propietario> listaPropietario;//creo una lista para la cantidad de propietarios
    // (un auto tiene como atributos una lista de propietarios)

    //constructores
    public  Auto(){

    }

    public Auto(long id, String marca, String modelo, List<Propietario> listaPropietario) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.listaPropietario = listaPropietario;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public List<Propietario> getListaPropietario() {
        return listaPropietario;
    }

    public void setListaPropietario(List<Propietario> listaPropietario) {
        this.listaPropietario = listaPropietario;
    }


    // otros metodos

    @Override
    public String toString() {
        return "Auto{" +
                "listaPropietario = " + listaPropietario + '}';
    }
}
