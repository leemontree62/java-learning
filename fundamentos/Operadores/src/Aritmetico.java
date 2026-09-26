/*
 * Operadores aritméticos:
 *
 * +  // suma
 * -  // resta
 * *  // multiplicación
 * /  // división
 * %  // módulo (resto de una división)
 */

public class Aritmetico {
    public static void main(String[] args) throws Exception {
        System.out.println("_________________________");
        System.out.println("Operadores aritmeticos");
        System.out.println("_________________________");

        System.out.println("Suma \n" + "Resta\n" + "Multiplicacion\n" + "Divicion\n" + "Modulo" );

        //Ejemplos de aplicacion 
        
        //variables
        int num1 = 5;
        int num2 = 10;
        int addition,subtraction,multiplication,division,module;
        double divisionDesimal;

        //Operaciones

        addition = num1 + num2;

        subtraction = num1 - num2;
 
        multiplication = num1 * num2;

        division =  num1 / num2;

        divisionDesimal = (double) num1 / num2;

        module = num1 % num2;


        //salida
        System.out.println();
        System.out.println("Impresion de valores calculados: ");
        System.out.println("Suma :" + addition);
        System.out.println("Resta :" + subtraction);
        System.out.println("Multiplicacion :" + multiplication);
        System.out.println("Division :" + division);
        System.out.println("Division Decimal :" + divisionDesimal);
        System.out.println("Modulo :" + module);



    }
}
