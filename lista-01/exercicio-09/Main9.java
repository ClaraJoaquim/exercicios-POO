import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        System.out.print("Quantos funcionários deseja cadastrar? ");
        int quantidade = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < quantidade; i++) {
            System.out.println("\nFuncionário " + (i + 1));

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Salário: ");
            double salario = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Departamento: ");
            String departamento = scanner.nextLine();

            funcionarios.add(new Funcionario(departamento, id, nome, salario));
        }

        System.out.print("\nDigite o departamento para somar os salários: ");
        String deptoBusca = scanner.nextLine();
        double totalSalarios = 0;

        for (Funcionario f : funcionarios) {
            if (f.departamento.equalsIgnoreCase(deptoBusca)) {
                totalSalarios += f.salario;
            }
        }

        System.out.println("\nFuncionários cadastrados:");
        for (Funcionario f : funcionarios) {
            System.out.println(f);
        }

        System.out.println("\nTotal de salários do departamento " + deptoBusca + ": R$" + String.format("%.2f", totalSalarios));

        scanner.close();
    }
}
