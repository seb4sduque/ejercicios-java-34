import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        // Calcule el perímetro y área de un rectángulo dada su base y su altura.
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la base del rectángulo: ");
        Float b4se = sc.nextFloat();
        System.out.println("Ingrese la altura del rectángulo: ");
        Float altur4 = sc.nextFloat();
        Float perimetr4 = 2 * (b4se + altur4);
        Float are4 = b4se * altur4;
        System.out.println("el perimetro del rectangulo es: " + perimetr4);
        System.out.println("el area del rectangulo es: " + are4);
    }
}
