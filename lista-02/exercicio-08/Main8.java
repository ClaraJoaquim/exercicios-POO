import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Distancia percorrida (em Km): ");
        double distancia = scanner.nextDouble();

        System.out.print("Combustível gasto (em Litro) ");
        double combustivel = scanner.nextDouble();

        Carro carro = new Carro(distancia, combustivel);

        double consumoMedio = carro.calcularConsumoMedio();

        System.out.printf("Consumo medio = %.3f%n", consumoMedio);

        scanner.close();
    }
}
