import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a largura do terreno (em metros): ");
        double largura = scanner.nextDouble();

        System.out.print("Digite o comprimento do terreno (em metros): ");
        double comprimento = scanner.nextDouble();

        System.out.print("Digite o valor do metro quadrado: ");
        double valorMetroQuadrado = scanner.nextDouble();

        Terreno terreno = new Terreno(largura, comprimento, valorMetroQuadrado);

        System.out.printf("Area do terreno = %.2f%n", terreno.calcularArea());
        System.out.printf("Preco do terreno = %.2f%n", terreno.calcularPreco());

        scanner.close();
    }
}
