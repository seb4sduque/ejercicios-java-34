import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
    // La política de cobro de una compañía telefónica es: cuando se realiza una llamada, el cobro es por el tiempo que ésta dura,
    //  de tal forma que los primeros cinco minutos cuestan 1 euro, los siguientes tres, 80 céntimos, los siguientes dos minutos, 70 céntimos, 
    // y a partir del décimo minuto, 50 céntimos. Además, se carga un impuesto de 3 % cuando es domingo, y si es otro día, en turno de mañana, 
    // 15 %, y en turno de tarde, 10 %. Realice un algoritmo para determinar cuánto debe pagar por cada concepto una persona que realiza una llamada.

    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese el tiempo de la llamada en minutos: ");
    int tiempo = sc.nextInt();
    System.out.println("Ingrese el día de la llamada (siendo lunes = 1, martes = 2, ..., domingo = 7): ");
    int dia = sc.nextInt();
    System.out.println("Ingrese el turno de la llamada (mañana = 1, tarde = 2): ");
    int turno = sc.nextInt();       

    double costo;
    if (tiempo <= 5) {
        costo = tiempo * 1;
    } else if (tiempo <= 8) {
        costo = 5 * 1 + (tiempo - 5) * 0.8;
    } else if (tiempo <= 10) {
        costo = 5 * 1 + 3 * 0.8 + (tiempo - 8) * 0.7;
    } else {
        costo = 5 * 1 + 3 * 0.8 + 2 * 0.7 + (tiempo - 10) * 0.5;

    
    }
    double impuesto;
    if (dia == 7) {
        impuesto = costo * 0.03;
    } else if (turno == 1) {
        impuesto = costo * 0.15;
    } else {
        impuesto = costo * 0.10;
    }
    double total = costo + impuesto;
    System.out.println("Costo de la llamada: " + costo + " euros");
    System.out.println("Impuesto: " + impuesto + " euros");
    System.out.println("Total a pagar: " + total + " euros");
}
}
