import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double numero1;
        double numero2;
        int opcao;

        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        System.out.print("Digite o primeiro número: ");
        numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        numero2 = scanner.nextDouble();

        System.out.print("Deseja realizar qual operação?");
        System.out.print("\n1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão");
        System.out.println("\nDigite a opção escolhida: ");

        opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                double soma = calculadora.soma(numero1, numero2);
                System.out.print("SOMA: " + numero1 + " + " + numero2 + " = " + soma);
                break;
            case 2:
                double subtracao = calculadora.subtracao(numero1, numero2);
                System.out.print("SUBTRAÇÃO: " + numero1 + " + " + numero2 + " = " + subtracao);
                break;
            case 3:
                double multiplicacao = calculadora.multiplicacao(numero1, numero2);
                System.out.print("MULTIPLICAÇÃO: " + numero1 + " + " + numero2 + " = " + multiplicacao);
                break;
            case 4:
                double divisao = calculadora.divisao(numero1, numero1);
                System.out.print("DIVISÃO: " + numero1 + " + " + numero2 + " = " + divisao);
                break;
            default:
                System.out.print("Opção Inválida!");
        }

    }
}
