public class Medidas {
    private double A;
    private double B;
    private double C;

    public Medidas(double A, double B, double C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    public double areaQuadrado() {
        return A * A;
    }

    public double areaTriangulo() {
        return (A * B) / 2;
    }

    public double areaTrapezio() {
        return ((A + B) / 2) * C;
    }
}
