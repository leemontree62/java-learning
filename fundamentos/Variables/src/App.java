public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("___________________________");
        System.out.println("Tipos De Variables ");
        System.out.println("___________________________\n");
        
      /*
        * En Java, los tipos de datos se pueden clasificar en:
        *
        * PRIMITIVOS
        * TIPOS DE REFERENCIA
        *
        * Los tipos primitivos representan valores simples y están
        * definidos directamente por el lenguaje.
        *
        * Algunos ejemplos son:
        * byte, short, int, long, float, double, char y boolean.
        *
        * Los tipos de referencia hacen referencia a objetos.
        * Un ejemplo es String, que permite trabajar con cadenas
        * de caracteres o texto.
        */
        

      //ejemplo


        //           int       num1       =       10       ;
        //           ↑          ↑         ↑        ↑       ↑
        //          tipo      nombre   asignación valor  fin



        //Enteros: byte, short, int (el más usado) y long
        int num1 = 10;

        //Decimales (punto flotante): float y double (mayor precisión)
        double num2 = 20.5;

        //Caracteres: char, almacena un solo carácter usando Unicode 
        char letter = 'K';
        
        //Booleanos: boolean, almacena solo true (verdadero) o false (falso).
        boolean advance = true;

        // Texto: String, almacena una cadena de caracteres.
        String text = "java";

        System.out.println("#Estos son los tipos de Variables en java: \n");
        System.out.println("Numeros enteros: " + num1 + "\n"
            + "Numeros Decimales :" + num2 + "\n"
            + "Caracteres: " + letter + "\n"
            + "Booleanos: " + advance + "\n"
            + "Cadenas de caracteres o Textos: " + text
        );
        
        //la salida de datos de arriba es lo mismo que hacer esto de abajo 


        /* 
        System.out.println("Estos son los tipos de Variables en java");
        System.out.println("Numeros enteros: " + num1 );
        System.out.println("Numeros Decimales :" + num2 );
        System.out.println("Caracteres: " + letra );
        System.out.println("Booleanos: " + avanzar );
        System.out.println("Cadenas de caracteres o Textos: " + cadenaTexto);
        */
    }
}
