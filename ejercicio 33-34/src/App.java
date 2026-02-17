import java.lang.Math;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
    //Escribe un programa que diga si un número introducido por teclado es o no primo.
    //  Un número primo es aquel que sólo es divisible entre él mismo y la unidad.

    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce un número: ");
    int numero = sc.nextInt();
    boolean esPrimo = true;
    if (numero <= 1) {
        esPrimo = false;
    } else {
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                esPrimo = false;
                break;
            }
        }
    }
    System.out.println("El número " + numero + (esPrimo ? " es primo." : " no es primo."));
}
}
