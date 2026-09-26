/*
 * Operadores lógicos:
 *
 * &&  // AND: devuelve true cuando ambas condiciones son true.
 * ||  // OR: devuelve true cuando al menos una condición es true.
 * !   // NOT: invierte el valor booleano.
 *
 * Los operadores lógicos trabajan con valores booleanos
 * (true o false) y devuelven como resultado otro booleano.
 */

public class Logico {
    public static void main(String[] args) {
        //variables
        boolean condition1 = true;
        boolean condition2 = false;

        //Operaciones
        boolean andResult = condition1 && condition2;
        boolean orResult = condition1 || condition2;
        boolean notResult = !condition1;
        
        //salidas
        System.out.println("AND: " + andResult);
        System.out.println("OR: " + orResult);
        System.out.println("NOT: " + notResult);
    }
}
