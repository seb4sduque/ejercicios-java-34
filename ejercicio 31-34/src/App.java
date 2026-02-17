import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
    //Escribir un programa que imprima todos los números pares entre dos números que se le pidan al usuario.

    System.out.println("Escribe el primer número: ");
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    System.out.println("Escribe el segundo número: ");
    int num2 = sc.nextInt();
    System.out.println("Los números pares entre " + num1 + " y " + num2 + " son: ");
    for (int i = num1; i <= num2; i++) {
        if (i % 2 == 0) {
            System.out.println(i);
        }
    
    }
}
}