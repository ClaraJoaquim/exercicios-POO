public class Compra {
    private double precoUnitario;
    private int quantidade;
    private double valorPago;

    public Compra(double precoUnitario, int quantidade, double valorPago) {
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
        this.valorPago = valorPago;
    }

    public double calcularTroco() {
        double total = precoUnitario * quantidade;
        return valorPago - total;
    }
}
