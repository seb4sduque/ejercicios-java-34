import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
    //Algoritmo que pide un número y diga si es positivo, negativo o 0.
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese un número: ");
    int numero = sc.nextInt();
    if (numero > 0) {
        System.out.println("El número es positivo.");
    } else if (numero < 0) {
        System.out.println("El número es negativo.");
    } else {
        System.out.println("El número es 0.");
    }
}
}
