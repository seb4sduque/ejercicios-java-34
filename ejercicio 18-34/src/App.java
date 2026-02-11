import java.util.Scanner;
import java.lang.Math;
public class App {
    public static void main(String[] args) throws Exception {
       //Realiza un algoritmo que calcula la potencia, para ello pide por teclado, la base y el exponente. Pueden ocurrir tres cosas:

        //El exponente sea positivo, sólo tienes que imprimir la potencia.
        //El exponente es 0, el resultado es 1.
        //El exponente es negativo, el resultado es 1/potencia con el exponente positivo.

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la base: ");
        double base = sc.nextDouble();
        System.out.println("Introduce el exponente: ");
        double exponente = sc.nextDouble();

        if (exponente > 0 ) {
            System.out.println("el resultado es " + Math.pow(base, exponente));
        } else if (exponente == 0) {
            System.out.println("el resultado es 1");
        } else { 
            {
            System.out.println("el resultado es " + 1/Math.pow(base, -exponente));
        }
        }
        }
    }


