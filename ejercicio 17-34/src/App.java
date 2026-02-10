import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
       //Escribe un programa que pida un nombre de usuario y una contraseña y si se ha introducido correctamente indica "Has entrado al sistema", sino se da un mensaje de error.
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese su nombre de usuario");
        String usuario = sc.nextLine();
        System.out.println("ingrese su contraseña");
        String contraseña = sc.nextLine(); 
        if (usuario.equals("admin123") && contraseña.equals("admin123")) {
            System.out.println("Has entrado al sistema");
        } else {
            System.out.println("Error: nombre de usuario o contraseña incorrectos");
            //equals se utiliza para comparar strings 
            // && significa "y" 
        }
    }
}
