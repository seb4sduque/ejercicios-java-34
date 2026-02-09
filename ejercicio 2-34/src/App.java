import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        //Escribir un programa que pregunte al usuario su edad, y luego le diga cuántos años tendrá en 10 años.
        System.out.println("¿Cuántos años tienes?");
        Scanner sc = new Scanner(System.in);
        int edad = sc.nextInt();
        int edadFutura = edad + 10;
        System.out.println("En 10 años tendrás " + edadFutura + " años."); 
    }
}
