import java.util.Scanner;
public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de trabajadores: ");
        int n = sc.nextInt();

        double total = 0;

        for (int i = 1; i <= n; i++) {

            System.out.println("Trabajador " + i);

            System.out.print("Horas trabajadas: ");
            double horas = sc.nextDouble();

            System.out.print("Pago por hora: ");
            double pago = sc.nextDouble();

            double sueldo = horas * pago;

            System.out.println("Sueldo semanal: " + sueldo);

            total += sueldo;
        }

        System.out.println("Total pagado por la empresa: " + total);

        sc.close();
    }
}
