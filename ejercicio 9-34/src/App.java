import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
     //Una tienda ofrece un descuento del 15% sobre el total de la compra y un cliente desea saber cuanto deberá pagar finalmente por su compra.
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el total de su compra: ");
        double totalCompra = sc.nextDouble();
        double descuento = totalCompra * 0.15;
        double totalPagar = totalCompra - descuento;
        System.out.println("El total a pagar con el descuento del 15% es: " + totalPagar);
    }
}
