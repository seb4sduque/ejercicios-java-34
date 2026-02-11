import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el lado A:");
        int a = sc.nextInt();

        System.out.println("Ingrese el lado B:");
        int b = sc.nextInt();

        System.out.println("Ingrese el lado C:");
        int c = sc.nextInt();

        int hipotenusa, cateto1, cateto2;

        //para saber si es triangulo o no
        if (a + b > c && a + c > b && b + c > a) {


            // triangulo equilatero
            if (a == b && b == c) {
                System.out.println("Es un triangulo equilátero");
            }
            // triangulo isosceles
            else if (a == b && a != c) {
                System.out.println("Es un triangulo isosceles (A = B)");
            }
            else if (b == c && b != a) {
                System.out.println("Es un triangulo isosceles (B = C)");
            }
            else if (a == c && a != b) {
                System.out.println("Es un triangulo isosceles (A = C)");
            }
            // triangulo escaleno
            else {
                System.out.println("Es un triangulo escaleno");
            }

            // Pitagoras
            if (a >= b && a >= c) {
                hipotenusa = a;
                cateto1 = b;
                cateto2 = c;
            } 
            else if (b >= a && b >= c) {
                hipotenusa = b;
                cateto1 = a;
                cateto2 = c;
            } 
            else {
                hipotenusa = c;
                cateto1 = a;
                cateto2 = b;
            }

            if (hipotenusa * hipotenusa == cateto1 * cateto1 + cateto2 * cateto2) {
                System.out.println("es un triángulo rectángulo (Pitagoras)");
            }

        } 
        else {
            System.out.println("No es un triángulo");
        }

    }
}
