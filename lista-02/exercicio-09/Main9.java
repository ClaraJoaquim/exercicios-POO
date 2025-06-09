import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a medida A: ");
        double A = scanner.nextDouble();

        System.out.print("Digite a medida B: ");
        double B = scanner.nextDouble();

        System.out.print("Digite a medida C: ");
        double C = scanner.nextDouble();

        Medidas medidas = new Medidas(A, B, C);

        System.out.printf("AREA DO QUADRADO = %.4f%n", medidas.areaQuadrado());
        System.out.printf("AREA DO TRIANGULO = %.4f%n", medidas.areaTriangulo());
        System.out.printf("AREA DO TRAPEZIO = %.4f%n", medidas.areaTrapezio());

        scanner.close();
    }
}
