import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
    //Realizar una algoritmo que muestre la tabla de multiplicar de un número introducido por teclado.
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce un número para mostrar su tabla de multiplicar:");
    int numero = sc.nextInt();
    for (int i = 1; i <= 10; i++) {
        System.out.println(numero + " x " + i + " = " + (numero * i));
    }
    }
}
