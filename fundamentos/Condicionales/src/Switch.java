/*

* En este ejercicio se utiliza switch para seleccionar una opción
* según el valor de una variable. También se utiliza default para
* manejar valores que no corresponden a ningún caso.

*/
public class Switch {
    public static void main(String[] args) {
        System.out.println("_____________________");
        System.out.println("Condicional Switch");
        System.out.println("_____________________");

        //variables 
        int dia = 7;
        String dayName = "";

        //condicion
        switch (dia) {
            case 1: dayName = "Lunes";
                break;
            case 2: dayName = "Martes";
                break;
            case 3: dayName = "Miercoles";
                break;
            case 4: dayName = "Jueves";
                break;
            case 5: dayName = "Viernes";
                break;
            case 6: dayName = "Sabado";
                break;
            case 7: dayName = "Domingo";
                break;
            
            default: dayName = "Numero Dia Invalido";
                break;
        }
        System.out.println("El dia de la semana es: " + dayName);
    }
    
}
