import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dados da primeira pessoa");
        System.out.print("Nome: ");
        String nome1 = scanner.nextLine();
        System.out.print("Idade: ");
        int idade1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Dados da segunda pessoa");
        System.out.print("Nome: ");
        String nome2 = scanner.nextLine();
        System.out.print("Idade: ");
        int idade2 = scanner.nextInt();

        Pessoa pessoa1 = new Pessoa(nome1, idade1);
        Pessoa pessoa2 = new Pessoa(nome2, idade2);

        double mediaIdade = (pessoa1.idade + pessoa2.idade) / 2.0;

        System.out.printf("A idade média de %s e %s é de %.1f anos%n", pessoa1.nome, pessoa2.nome, mediaIdade);

        scanner.close();
    }
}
