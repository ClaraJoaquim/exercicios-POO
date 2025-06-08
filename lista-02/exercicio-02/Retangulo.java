public class Retangulo {

    double base;
    double altura;

    public Retangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public double calcularArea() {
        return base * altura;
    }

    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    public double calcularDiagonal() {
        return Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
    }
}
