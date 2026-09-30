import java.util.Scanner;
void main() {
    //instacia  Clase Scanner
    Scanner entrada = new Scanner(System.in);


    IO.println("______________");
    IO.println("Matriz");
    IO.println("______________");

    //variables
    int row,column;

    //entrada del tamaño del la matriz
    IO.println("Ingrese la cantidad de Filas del Array:");
    row = entrada.nextInt();
    IO.println("Ingrese La cantidad de Columnas del Array:");
    column = entrada.nextInt();
    IO.println("_______________________________________________");

    //instancia  Matriz bidimensional
    int [][] array = new int[row][column];

    //asignación manual
    /*
    array[0][0] = 12;
    array[0][1] = 23;
    array[0][2] = 2;
    array[1][0] = 90;
    array[1][1] = 45;
    array[1][2] = 54;
    array[2][0] = 32;
    array[2][1] = 120;
    array[2][2] = 500;*/


    //asignación datos automatizada
    for (int f = 0; f < array.length ; f++) {
        // El primer for controla las filas
        for (int c = 0; c < array[f].length ; c++) {
            // El segundo for recorre las columnas de la fila actual.
            IO.println("Estoy en la Posición F:" + f + " con C:" + c);
            array[f][c] = entrada.nextInt();
            IO.println("____________________________________________");
        }
    }

    IO.println("\nComprobante");
    //recorrido Matriz
    for (int f = 0; f < array.length; f++) {
        for (int c = 0; c < array[f].length; c++) {
            IO.println("El valor de la Posición F:" + f + " y C:" + c);
            IO.println("Es de :" + array[f][c]);
            IO.println("_______________________________________________");
        }
    }
    entrada.close();
}