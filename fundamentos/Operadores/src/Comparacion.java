/*
 * Operadores de comparación:
 *
 * ==  // igual a
 * !=  // diferente de
 * >   // mayor que
 * <   // menor que
 * >=  // mayor o igual que
 * <=  // menor o igual que
 *
 * Los operadores de comparación devuelven un valor booleano:
 * true o false.
 */

public class Comparacion {
    public static void main(String[] args) {
        //variables
        int num1 = 10;
        int num2 = 5;

        //operaciones
        boolean equal = num1 == num2;//
        boolean different = num1 != num2;
        boolean greater = num1 > num2;
        boolean less = num1 < num2;
        boolean greaterOrEqual = num1 >= num2;
        boolean lessOrEqual = num1 <= num2;

        //salidas de las operaciones
        System.out.println("salidas");
        System.out.println("Igual: " + equal);
        System.out.println("Diferente: " + different);
        System.out.println("Mayor: " + greater);
        System.out.println("Menor: " + less);
        System.out.println("Mayor o igual: " + greaterOrEqual);
        System.out.println("Menor o igual: " + lessOrEqual);

    }
    
}
