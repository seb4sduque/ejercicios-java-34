package actividad_seguimiento_3_ejercicio1;

public class Principal {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", "Perez", 12345678, "01/01/1990", "Argentina", "Masculino");
        Persona persona2 = new Persona("Maria", "Gomez", 87654321, "15/05/1985", "Mexico", "Femenino");
        
        System.out.println("-------------------------------------------");

        System.out.println("Informacion de la persona 1:");
        persona1.info();
        
        System.out.println("-------------------------------------------");


        System.out.println("Informacion de la persona 2:");
        persona2.info();

        System.out.println("-------------------------------------------");
    }
}
