public class Anidados {
    public static void main(String[] args) {
        System.out.println("______________________");
        System.out.println("Condicionales Anidados");
        System.out.println("______________________");
        
        //Variables
        int num1 = 20;
        int num2 = 12;

        //condicion
        if (num1 > num2) {
            System.out.println("num1 es mayor que num2");
            if (num1 > 0) {
              System.out.println("Además, num1 es positivo");
            }
        }
    }
}
