import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        //Escribe un programa que lea un número e indique si es par o impar.

        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese un numero entero para determinar si es par o impar");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("el numero es par");
        } else {
            System.out.println("el numero es impar");
        }
        
    }
}
