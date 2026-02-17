import java.util.Scanner;
import java.util.Random;
public class App {

public static void main(String[] args) {

         //Crea una aplicación que permita adivinar un número. La aplicación genera un número aleatorio del 1 al 100. 
        // A continuación va pidiendo números y va respondiendo si el número a adivinar es mayor o menor que el introducido
        // ,a demás de los intentos que te quedan (tienes 10 intentos para acertarlo). El programa termina cuando se acierta el número
        //  (además te dice en cuantos intentos lo has acertado), si se llega al limite de intentos te muestra el número que había generado.


        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1; // genera número entre 1 y 100
        int intentos = 10;
        int numeroUsuario;
        boolean acertado = false;

        System.out.println("Bienvenido al juego Adivina el Número");
        System.out.println("Tienes 10 intentos para adivinar un número del 1 al 100.");

        while (intentos > 0) {

            System.out.println("\nTe quedan " + intentos + " intentos.");
            System.out.print("Ingresa un número: ");
            numeroUsuario = sc.nextInt();

            if (numeroUsuario == numeroSecreto) {
                acertado = true;
                System.out.println("¡Correcto! Adivinaste el número en " 
                                   + (11 - intentos) + " intentos.");
                break;
            } 
            else if (numeroUsuario < numeroSecreto) {
                System.out.println("El número es mayor.");
            } 
            else {
                System.out.println("El número es menor.");
            }

            intentos--;
        }

        if (!acertado) {
            System.out.println("\nSe acabaron los intentos.");
            System.out.println("El número era: " + numeroSecreto);
        }

        sc.close();
    }
}
