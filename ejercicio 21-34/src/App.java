import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Escribe un programa que lea un año para indicar si es bisiesto.

        // Nota: Un año es bisiesto si es un número divisible por 4, pero no si es divisible por 100, excepto que también sea divisible por 400

        System.out.println("Ingrese un año:");
        int ano = sc.nextInt();

        if ( (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0) ) {
            System.out.println("El año es bisiesto");
        } else {
            System.out.println("El año no es bisiesto");
        }
        //| | or
    }


}
