import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //El director de una escuela está organizando un viaje de estudios y requiere determinar cuánto debe cobrar a cada alumno y cuánto debe pagar a la compañía de viajes por el servicio. 
        //La forma de cobrar es la siguiente:

        //si son 100 alumnos o más, el costo por cada alumno es de 65 euros;
        //de 50 a 99 alumnos, el costo es de 70 euros, 
        //de 30 a 49, de 95 euros,
        //y si son menos de 30, el costo de la renta del autobús es de 4000 euros, sin importar el número de alumnos.
        //Realice un algoritmo que permita determinar el pago a la compañía de autobuses y lo que debe pagar cada alumno por el viaje.
        
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantos estudiantes saldran de viaje?");
        int n = sc.nextInt();

        double costoPorAlumno;
        double total;

        if (n >= 100) {
            costoPorAlumno = 65;
            total = n * costoPorAlumno;
        }
        else if (n >= 50 && n <= 99) {
            costoPorAlumno = 70;
            total = n * costoPorAlumno;
        }
        else if (n >= 30 && n <= 49) {
            costoPorAlumno = 95;
            total = n * costoPorAlumno;
        }
        else { // menos de 30
            total = 4000;
            costoPorAlumno = total / n;
        }

        System.out.println("El costo por estudiante es de:  " + costoPorAlumno + " euros");
        System.out.println("El costo Total a pagar a la compania es de: " + total + " euros");
    }
}