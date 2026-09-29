// El bucle do while ejecuta el bloque de código al menos una vez
// y luego repite su ejecución mientras la condición sea verdadera.
import java.util.Scanner;
void main() {
    Scanner entrada = new Scanner(System.in);
    IO.println("_________________");
    IO.println("Loop Do While");
    IO.println("_________________");

    //variables
    String control;

    do {//
    IO.println("Programa para testear el Loop Do While, Desea salir del programa?: (s/n)");
    control = entrada.nextLine();

    }while (control.equalsIgnoreCase("n"));

    entrada.close();
}
