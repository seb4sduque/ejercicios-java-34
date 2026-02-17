import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int suma = 0;
        int contador = 0;

        System.out.print("Ingrese un número (0 para terminar): ");
        numero = sc.nextInt();

        while (numero != 0) {
            suma += numero;      
            contador++;          

            System.out.print("Ingrese otro número (0 para terminar): ");
            numero = sc.nextInt();
        }

        if (contador != 0) {
            double media = (double) suma / contador;
            System.out.println("La suma es: " + suma);
            System.out.println("La media es: " + media);
        } else {
            System.out.println("No se ingresaron números.");
        }

        sc.close();
    }
}
