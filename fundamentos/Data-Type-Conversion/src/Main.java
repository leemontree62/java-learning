void main() {
    //conversion de tipos de datos, de cadena de textos a  numericos
    String cantidad = "12";
    String precio = "123.2";

    int cantidadEntero = Integer.parseInt(cantidad);
    double precioDouble = Double.parseDouble(precio);

    IO.println("La cantidad de es: " + cantidadEntero + "  El precio es de: " + precioDouble);

    //conversion de tipos de datos, de numericos a cadena de texto

    int edad = 12;
    double estatura = 1.80;

    String edadString = String.valueOf(estatura);
    String estaturaString = String.valueOf(estatura);

    IO.println("La edad de es: " + edadString + " Estatura es de: " + estaturaString);
}



