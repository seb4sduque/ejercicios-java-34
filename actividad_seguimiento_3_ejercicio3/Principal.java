package actividad_seguimiento_3_ejercicio3;
import java.util.Scanner;
public class Principal {

public static void main(String[] args) {
    CuentaBancaria cuenta1 = new CuentaBancaria(1000);
    Scanner scanner = new Scanner(System.in);
    System.out.println("Bienvenido al sistema bancario");
    System.out.println("Seleccione una opción:");
    System.out.println("1. Consultar saldo");
    System.out.println("2. Depositar dinero");
    System.out.println("3. Retirar dinero");
    int opcion = scanner.nextInt();
    
    
    switch (opcion) {
        case 1: 
            cuenta1.ConsultarSaldo();
            break;
        case 2: 
            System.out.println("cuanto desea depositar a su cuenta?");
            double cantidadDeposito = scanner.nextDouble();
            cuenta1.Depositar(cantidadDeposito);
            cuenta1.ConsultarSaldo();
            break;
        case 3:
            System.out.println("cuanto desea retirar de su cuenta?");
            double cantidadRetiro = scanner.nextDouble();
            cuenta1.Retirar(cantidadRetiro);
            break;
        default:
            System.out.println("Opción no válida.");
}

}
}
