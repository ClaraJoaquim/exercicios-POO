import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {

        int opcao;
        double graus, conversao;

        ConversorTemperatura conversorTemperatura = new  ConversorTemperatura();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual conversão deseja realizar?");
        System.out.print("\n1 - Celsius para Fahrenheit\n2 - Fahrenheit para Celsius");
        System.out.print("\nDigite a opção escolhida: ");
        opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.print("Informe quantos Graus Celsius você deseja converter: ");
                graus = scanner.nextDouble();
                conversao = conversorTemperatura.converterCelsiusParaFahrenheit(graus);
                System.out.print("O resultado é: " + conversao + "ºF (Graus Fahrenheit)");
                break;
            case 2:
                System.out.print("Informe quantos Graus Fahrenheit você deseja converter: ");
                graus = scanner.nextDouble();
                conversao = conversorTemperatura.converterFahrenheitParaCelsius(graus);
                System.out.print("O resultado é: " + conversao + "ºC (Graus Celsius)");
                break;
            default:
                System.out.print("Opção Inválida!");
                break;
        }
        scanner.close();
    }
}
