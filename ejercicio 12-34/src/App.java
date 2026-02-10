import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        //Dadas dos variables numéricas A y B, que el usuario debe teclear,
        //  se pide realizar un algoritmo que intercambie los valores de ambas variables y muestre cuanto valen al final las dos variables.
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el valor de A:");
        double A = sc.nextDouble();
        System.out.println("ingrese el valor de B:");
        double B = sc.nextDouble();
        double temp = A;
        A = B;
        B = temp;
        System.out.println("el valor de A es: " + A);  
        System.out.println("el valor de B es: " + B); 

    }
}
