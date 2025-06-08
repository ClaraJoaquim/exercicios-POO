import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de X: ");
        int x = scanner.nextInt();

        System.out.print("Digite o valor de Y: ");
        int y = scanner.nextInt();

        CalculadoraSoma soma = new CalculadoraSoma(x, y);

        System.out.println("SOMA = " + soma.calcularSoma());

        scanner.close();
    }
}
