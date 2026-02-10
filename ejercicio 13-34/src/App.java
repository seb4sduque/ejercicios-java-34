import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        //Dos vehículos viajan a diferentes velocidades (v1 y v2) y están distanciados por una distancia d. 
        //El que está detrás viaja a una velocidad mayor. Se pide hacer un algoritmo para ingresar la distancia entre los dos vehículos (km)
        //y sus velocidades respectivas (km/h) y con esto determinar y mostrar en qué tiempo (minutos) alcanzará el vehículo más rápido al otro.
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese la velocidad del primer vehículo (km/h): ");
        double v1 = sc.nextDouble();
        System.out.println("ingrese la velocidad del segundo vehiculo en km/h: ");
        double v2 = sc.nextDouble();
        System.out.println("ingrese la distancia entre los dos vehículos en km: ");
        double d = sc.nextDouble();
        double tiempo = (d / (v2 - v1)) * 60;
        System.out.println("el vehiculo de atras alcanzara al otro en un tiempo de: " + tiempo + " minutos");
    }
}
