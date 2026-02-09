import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        //Un vendedor recibe un sueldo base más un 10% extra por comisión de sus ventas, 
        // el vendedor desea saber cuanto dinero obtendrá por concepto de comisiones por las tres ventas que realiza en el mes 
        // y el total que recibirá en el mes tomando en cuenta su sueldo base y comisiones.

        Scanner sc = new Scanner(System.in);    
        System.out.println("Ingrese su sueldo base: ");
        double sueldoBase = sc.nextDouble();
        System.out.println("Ingrese el valor de la venta 1: ");
        double venta1 = sc.nextDouble();
        System.out.println("Ingrese el valor de la venta 2: ");
        double venta2 = sc.nextDouble();
        System.out.println("Ingrese el valor de la venta 3: ");
        double venta3 = sc.nextDouble();

        double comision1 = venta1 * 0.10;
        double comision2 = venta2 * 0.10;   
        double comision3 = venta3 * 0.10;

        double totalComisiones = comision1 + comision2 + comision3;
        double totalSueldo = sueldoBase + totalComisiones;

        System.out.println("Comisión por venta 1: " + comision1);
        System.out.println("Comisión por venta 2: " + comision2);
        System.out.println("Comisión por venta 3: " + comision3);
        System.out.println("Total de comisiones: " + totalComisiones);
        System.out.println("Total sueldo: " + totalSueldo);
    }
}
