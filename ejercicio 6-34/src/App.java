import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        //Escribir un programa que convierta un valor dado en grados Fahrenheit a grados Celsius.
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la temperatura en grados Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        double celsius = (fahrenheit - 32) * 5/9;
        System.out.println("la temperatura en grados Celsius es: " + celsius);
    }
}
