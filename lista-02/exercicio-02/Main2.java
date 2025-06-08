import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a base do retângulo: ");
        double base = scanner.nextDouble();

        System.out.print("Digite a altura do retângulo: ");
        double altura = scanner.nextDouble();

        Retangulo retangulo = new Retangulo(base, altura);

        System.out.printf("Área = %.4f%n", retangulo.calcularArea());
        System.out.printf("Perímetro = %.4f%n", retangulo.calcularPerimetro());
        System.out.printf("Diagonal = %.4f%n", retangulo.calcularDiagonal());

        scanner.close();
    }
}
