package actividad_seguimiento_3_ejercicio3;

public class CuentaBancaria {
    private int numeroCuenta;
    private String titular;
    private double saldo;
    private double SaldoInicial;    


    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
        this.SaldoInicial = saldoInicial;
    }
    
   public void ConsultarSaldo() {
        System.out.println("El saldo actual de la cuenta es: " + saldo);
    }
    
    public void Depositar(double cantidad) {
        if (cantidad > 0) {
            saldo = saldo + cantidad;
            System.out.println("Depósito exitoso. Nuevo saldo: " + saldo);
        } else {
            System.out.println("Cantidad inválida para depósito.");
        }
        }
    
    
    public void Retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo = saldo - cantidad;
            System.out.println("Retiro exitoso. Nuevo saldo: " + saldo);
        } else {
            System.out.println("Cantidad inválida para retiro o saldo insuficiente.");
        }
    }

    
}
