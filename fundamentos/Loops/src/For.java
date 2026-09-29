import java.util.Scanner;
void main() {
    Scanner entrada = new Scanner(System.in);
    IO.println("____________");
    IO.println("Loop For");
    IO.println("____________");

    //variables
    int cont = 0;

    //entradas
    IO.println("Favor Ingresar la cantidad de Vuletas :");
    cont = entrada.nextInt();

    //Loop
    for (int i = 0; i <= cont; i++) {
        IO.println("Estoy en la vuelta N:" + i + " de " + cont);
    }
}