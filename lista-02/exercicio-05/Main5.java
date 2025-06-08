import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberFormat moeda = NumberFormat.getCurrencyInstance(Locale.of("pt", "BR"));

        System.out.print("Preço unitário do produto: ");
        double preco = scanner.nextDouble();

        System.out.print("Quantidade comprada: ");
        int quantidade = scanner.nextInt();

        System.out.print("Dinheiro recebido: ");
        double pago = scanner.nextDouble();

        Compra compra = new Compra(preco, quantidade, pago);

        double troco = compra.calcularTroco();

        if (troco > 0) {
            System.out.println("Troco = R$ " + moeda.format(troco));
        } else if (troco == 0) {
            System.out.println("Não será necessário fornecer troco!");
        } else {
            System.out.println("Esta faltando: R$ " + moeda.format(troco * -1));
        }

        scanner.close();
    }
}
