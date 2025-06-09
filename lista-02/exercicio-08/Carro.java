public class Carro {
    private double distancia;
    private double combustivelGasto;

    public Carro(double distancia, double combustivelGasto) {
        this.distancia = distancia;
        this.combustivelGasto = combustivelGasto;
    }

    public double calcularConsumoMedio() {
        return distancia / combustivelGasto;
    }
}
