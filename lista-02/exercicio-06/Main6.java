import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do raio do circulo: ");
        double raio = scanner.nextDouble();

        Circulo circulo = new Circulo(raio);

        double area = circulo.calcularArea();

        System.out.printf("AREA = %.3f%n", area);

        scanner.close();
    }
}
