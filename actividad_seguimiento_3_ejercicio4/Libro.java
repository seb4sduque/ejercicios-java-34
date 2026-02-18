package actividad_seguimiento_3_ejercicio4;

public class Libro {
    private String titulo;
    private String autor;
    private int anoPublicacion;
    
    public Libro(String titulo, String autor, int anoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacion = anoPublicacion;
    }

    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de Publicación: " + anoPublicacion);
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setAnoPublicacion(int anoPublicacion) {
        this.anoPublicacion = anoPublicacion;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public int getAnoPublicacion() {
        return anoPublicacion;
    }

    
    

}
