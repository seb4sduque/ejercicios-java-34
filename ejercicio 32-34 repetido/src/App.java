import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        //Escribe un programa que dados dos números, uno real (base) y un entero positivo (exponente), 
        // saque por pantalla el resultado de la potencia. No se puede utilizar el operador de potencia.
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número real (base): ");
        double base = sc.nextDouble();

        System.out.println("Introduce un número entero positivo (exponente): ");
        int exponente = sc.nextInt();

        double resultado = 1;  

        for (int i = 0; i < exponente; i++) {
            resultado = resultado * base;
        }

        System.out.println("El resultado de " + base +  " elevado a " + exponente +  " es: " + resultado);
    }
}

