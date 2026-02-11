import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        //La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, la cual se clasifica en tipos A y B, y además en tamaños 1 y 2. 
        //Cuando se realiza la venta del producto, ésta es de un solo tipo y tamaño, se requiere determinar cuánto recibirá un productor por la uva que entrega en un embarque, 
        //considerando lo siguiente:

        //Si es de tipo A, se le cargarán 20 céntimos al precio inicial cuando es de tamaño 1; y 30 céntimos si es de tamaño 2.
        //Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de tamaño 2.
        //Realice un algoritmo para determinar la ganancia obtenida.
        double preciof;
        
        System.out.println("Ingrese el precio inicial por kilo:");
        double precio = sc.nextDouble();

        System.out.println("Ingrese los kilos de uva:");
        double kilos = sc.nextDouble();

        System.out.println("Ingrese el tipo de uva (A o B):");
        char tipo = sc.next().charAt(0);

        System.out.println("Ingrese el tamaño (1 o 2):");
        int tamano = sc.nextInt();
        
        
        if (tipo == 'A' && tamano == 1) {
            precio = (precio+0.20);
        }
        else if (tipo == 'A' && tamano == 2) {
            precio = (precio+0.30);
        }
        else if (tipo == 'B' && tamano == 1) {
            precio = (precio - 0.30);
        }
        else if (tipo == 'B' && tamano == 2) {
            precio = (precio - 0.50);
        } 
        
   
        preciof = (precio*kilos);
        
        System.out.printf("El precio final de las uvas es de: %.2f pesos\n", preciof);

        

}
}