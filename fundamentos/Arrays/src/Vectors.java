/*
 * Los arreglos unidimensionales poseen una sola dimensión.
 * Un ejemplo de estos son los vectores.
 *
 * En Java, los índices de los arreglos comienzan siempre desde 0.
 */

import java.util.Scanner;

void main() {
    // Instancia de la clase Scanner
    Scanner entrada = new Scanner(System.in);

    IO.println("______________");
    IO.println("Vector");
    IO.println("______________");

    //variables
    int tamanoVector;

    IO.println("Favor ingrese la cantidad de pociones del vector :");
    tamanoVector = entrada.nextInt();

    // Instancia del vector
     int [] vector  = new int[tamanoVector];

    //asignacion manual
    /* vector[0] =32 ;
     * vector[1] =42 ;
     * vector[2] = 22;
     * vector[3] = 140; */

    //asignacion automatizada
    IO.println("Favor ingrese un valor para cada posición del vector");
    for (int i = 0; i < vector.length; i++) {//el .length ayuda para que no ocurran desbordamientos accidentales por pocicione
        IO.println("Ingrese el valor para el índice " + i + ":");
        vector[i] = entrada.nextInt();
    }

    IO.println("");

    // Recorrido del vector
    IO.println("Comprobante");
    for (int i = 0; i < vector.length; i++) {
        IO.println("Estoy en el índice: " + i);
        IO.println("Tengo guardado: " + vector[i]);
        IO.println("________________________________");
    }
    entrada.close();
}
