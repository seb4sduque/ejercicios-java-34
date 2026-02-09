import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc =new Scanner(System.in);
        System.out.println("Cual es tu nombre?");
        String nombre = sc.nextLine();
        System.out.println("Hola " + nombre + "!");
    }
}
