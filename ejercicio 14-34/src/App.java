import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
    //Algoritmo que pide dos números e indica si el primero es mayor que el segundo.
    Scanner sc = new Scanner(System.in);
    System.out.println("ingrese el primer numero");
    int num1 = sc.nextInt();
    System.out.println("ingrese el segundo numero");
    int num2 = sc.nextInt();
    if (num1 > num2) {
        System.out.println("el numero " + num1 + " es mayor que el numero " + num2);
    }
    else {
        System.out.println("el numero " + num2 + " es mayor que el numero  " + num1);
    }
}

}
