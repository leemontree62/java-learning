/*
 * El operador ternario permite tomar decisiones simples
 * utilizando una sola línea de código.
 *
 * En este ejercicio también se utiliza la clase Scanner
 * para ingresar datos por medio del teclado.
 */

import java.util.Scanner;

public class Ternario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //variables
        double average;
        String studentStatus;

        //entradas
        System.out.println("Ingrese el promedio general de un alumno: ");
        average = entrada.nextDouble();

        //operador ternario
        studentStatus = average >= 6 ? "Aprobado" : "Desaprobado";

        //salidas
        System.out.println("El Estudiante esta :" + studentStatus);
    }    
}
