package actividad_seguimiento_3_ejercicio1;

public class Persona {
    private String nombre;
    private String apellido;
    private int identificacion;
    private String fechaNacimiento;
    private String paisNacimiento;
    private String sexo;
    
    public Persona(String nombre, String apellido, int identificacion, String fechaNacimiento, String paisNacimiento, String sexo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = identificacion;
        this.fechaNacimiento = fechaNacimiento;
        this.paisNacimiento = paisNacimiento;
        this.sexo = sexo;
    }

    public void info() {
        System.out.println("nombre: " + nombre);
        System.out.println("apellido: " + apellido);
        System.out.println("identificacion: " + identificacion);
        System.out.println("fecha de nacimiento: " + fechaNacimiento);
        System.out.println("pais de nacimiento: " + paisNacimiento);
        System.out.println("sexo: " + sexo);
    }
    
}
