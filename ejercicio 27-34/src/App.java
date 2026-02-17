import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
    //Crea una aplicación que pida un número y calcule su factorial (El factorial de un número es el producto de todos los enteros entre 1 y el propio numero
    //  y se representa por el número seguido de un signo de exclamación. Por ejemplo 5! = 1x2x3x4x5=120),
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese un numero para calcular su factorial: ");
    int numero = sc.nextInt();
    int factorial = 1;
    for (int i = 1; i <= numero; i++) {
        factorial = factorial * i;
    }
    System.out.println("El factorial de " + numero + " es: " + factorial);
    }
}
