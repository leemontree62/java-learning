/*Los enums nos sirve para establecer valores como predeterminados, configuraciones para roles pre definidos y
varidad de casos, también pueden ser usados como un arreglo
 */
void main() {
    enum Color{
        ROJO,AZUL,VERDE,AMARILLO,NEGRO,BLANCO
    }


    for (Color c: Color.values()){
        IO.println("El color es : " + c);
    }
}
