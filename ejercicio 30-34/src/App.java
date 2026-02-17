import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
    //Realizar un algoritmo que pida números (se pedirá por teclado la cantidad de números a introducir). 
    // El programa debe informar de cuantos números introducidos son mayores que 0, menores que 0 e iguales a 0.
    int cantidadNumeros;
    int numero;
    int mayoresCero = 0;
    int menoresCero = 0;
    int igualesCero = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("¿Cuántos números desea introducir?");
    cantidadNumeros = sc.nextInt();
    for (int i = 0; i < cantidadNumeros; i++) {
        System.out.println("Introduce un número:");
        numero = sc.nextInt();
        if (numero > 0) {
            mayoresCero++;
        } else if (numero < 0) {
            menoresCero++;
        } else {
            igualesCero++;
        }
    }
    System.out.println("Números mayores que 0: " + mayoresCero);
    System.out.println("Números menores que 0: " + menoresCero);
    System.out.println("Números iguales a 0: " + igualesCero);
}
}
