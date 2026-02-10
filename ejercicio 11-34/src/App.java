import java.lang.Math;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        //Pide al usuario dos pares de números x1,y2 y x2,y2, que representan dos puntos en el plano. Calcula y muestra la distancia entre ellos.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor de x1:");
        double x1 = scanner.nextDouble();
        System.out.println("Ingrese el valor de y1:");
        double y1 = scanner.nextDouble();
        System.out.println("Ingrese el valor de x2:");
        double x2 = scanner.nextDouble();
        System.out.println("Ingrese el valor de y2:");
        double y2 = scanner.nextDouble();
        double distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("la distancia entre los puntos (" + x1 + "," + y1 + ") y (" + x2 + "," + y2 + ") es: " + distancia);
    }
}
