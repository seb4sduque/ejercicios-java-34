import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        //Calcular la media de tres números pedidos por teclado
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int num2 = sc.nextInt();
        System.out.println("Ingrese el tercer número: ");
        int num3 = sc.nextInt();

        double media = (num1 + num2 + num3) / 3.0;
        System.out.printf("La media de los tres números es: %.2f%n", media);

    }
}
