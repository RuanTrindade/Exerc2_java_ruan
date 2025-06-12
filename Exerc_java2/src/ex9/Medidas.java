package ex9;

public class Medidas {

    private double a;
    private double b;
    private double c;

    public Medidas(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double areaQuadrado() {
        return a * a;
    }

    public double areaTriangulo() {
        return (a * b) / 2.0;
    }

    public double areaTrapezio() {
        return ((a + b) * c) / 2.0;
    }
}
