import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        //Un alumno desea saber cual será su calificación final en la materia de Estructura de Datos. 
        // Dicha calificación se compone de los siguientes porcentajes:

        //55% del promedio de sus tres calificaciones parciales.
        //30% de la calificación del examen final.
        //15% de la calificación de un trabajo final.

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la calificación del primer parcial: ");
        double parcial1 = sc.nextDouble();
        System.out.println("Ingrese la calificación del segundo parcial: ");
        double parcial2 = sc.nextDouble();
        System.out.println("Ingrese la calificación del tercer parcial: ");
        double parcial3 = sc.nextDouble();

        System.out.println("Ingrese la calificación del examen final: ");
        double examenFinal = sc.nextDouble();

        System.out.println("Ingrese la calificación del trabajo final: ");
        double trabajoFinal = sc.nextDouble();

        double promedioParciales = (parcial1 + parcial2 + parcial3) / 3;

        double calificacionFinal =(promedioParciales * 0.55) + (examenFinal * 0.30) + (trabajoFinal * 0.15);

        System.out.println("La calificación final es: " + calificacionFinal);
    }
}
