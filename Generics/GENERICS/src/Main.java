void main() {
    Caja<String> cajaString = new Caja<>();
    cajaString.ponerAlgo("esto es una prueba");
    String contenido = cajaString.obtenerAlgo();

    Caja<Integer> cajaEntero = new Caja<>();
    cajaEntero.ponerAlgo(22);
    Integer numero = cajaEntero.obtenerAlgo();
    

}
