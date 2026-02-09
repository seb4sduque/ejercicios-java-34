public class App {
    public static void main(String[] args) throws Exception {
    //Dados los catetos de un triángulo rectángulo, calcula su hipotenusa.
        double cateto1 = 10;
        double cateto2 = 5;
        double hipotenusa = Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);
        System.out.println("La hipotenusa es: " + hipotenusa);
    }
}
