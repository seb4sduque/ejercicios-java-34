package actividad_seguimiento_3_ejercicio2;

public class Principal {
    public static void main(String[] args) {

        Rectangulo rectangulo1 = new Rectangulo(12, 3);
        Rectangulo rectangulo2 = new Rectangulo(10, 5);

        rectangulo1.CalcularArea();
        rectangulo1.CalcularPerimetro();

        System.out.println("El area del rectangulo 1 es: " + rectangulo1.getArea());
        System.out.println("El perimetro del rectangulo 1 es: " + rectangulo1.getPerimetro());

        System.out.println("---------------------------");

        rectangulo2.CalcularArea();
        rectangulo2.CalcularPerimetro();

        System.out.println("El area del rectangulo 2 es: " + rectangulo2.getArea());
        System.out.println("El perimetro del rectangulo 2 es: " + rectangulo2.getPerimetro());
    }
}
