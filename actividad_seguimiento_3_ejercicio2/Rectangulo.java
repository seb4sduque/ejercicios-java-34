package actividad_seguimiento_3_ejercicio2;

public class Rectangulo {
    private double ancho;
    private double alto;
    private double are4;
    private double perimetr4;
    
    public Rectangulo(double ancho, double alto) {
    this.ancho = ancho;
    this.alto = alto;
}

    
    public void CalcularArea() {
        are4 = (ancho*alto);
    }
    
    public void CalcularPerimetro() {
        perimetr4 = 2 *(ancho*alto);
    }
    
    public double getAncho() {
    return ancho;
    }

    public double getAlto() {
    return alto;
    }

    public double getArea() {
    return are4;
    }

    public double getPerimetro() {
    return perimetr4;
    }

    
}
