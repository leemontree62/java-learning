void main() {

    // En Java existen muchos tipos de excepciones: algunas ya vienen
    // definidas en el lenguaje y otras pueden ser creadas.
    // El bloque try-catch nos permite capturar y manejar excepciones
    // para evitar que un error no controlado interrumpa el programa.


    boolean numeroValido = false;

    while (!numeroValido) {
        try {
            IO.print("Introduce un número: ");
            int numero = Integer.parseInt(IO.readln());

            IO.println("Número registrado: " + numero);
            numeroValido = true;

        } catch (NumberFormatException e) {
            IO.println("Entrada inválida. Inténtalo de nuevo.");
        }
    }

    // Algunas excepciones comunes en Java:
    //
    // ArithmeticException:
    // Ocurre en operaciones aritméticas no permitidas,
    // como la división de enteros entre cero.
    //
    // ArrayIndexOutOfBoundsException:
    // Ocurre al acceder a un índice fuera de los límites
    // de un arreglo.
    //
    // NullPointerException:
    // Ocurre al intentar utilizar una referencia null
    // como si apuntara a un objeto.
    //
    // NumberFormatException:
    // Ocurre al intentar convertir una cadena a un formato
    // numérico que no es válido.
    //
    // IllegalArgumentException:
    // Se utiliza para indicar que un método recibió
    // un argumento no válido.

}
