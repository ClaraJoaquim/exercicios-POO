import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as informações do funcionário");

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Valor por hora: ");
        double valorHora = scanner.nextDouble();

        System.out.print("Horas trabalhadas: ");
        int horas = scanner.nextInt();

        Funcionario funcionario = new Funcionario(nome, valorHora, horas);

        double pagamento = funcionario.calcularPagamento();

        System.out.printf("O pagamento para %s deve ser de R$ %.2f%n", funcionario.getNome(), pagamento);

        scanner.close();
    }
}
