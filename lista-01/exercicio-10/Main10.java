import java.util.ArrayList;
import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Contato> contatos = new ArrayList<>();

        System.out.println("Agenda de contatos");
        String saida = "";

        for (int i = 0; i < 10 && !saida.equalsIgnoreCase("N"); i++) {
            System.out.println("\nCadastre o " + (i + 1) + "º Contato");

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Telefone: ");
            String telefone = scanner.nextLine();

            System.out.print("Email: ");
            String email = scanner.nextLine();

            contatos.add(new Contato(email, nome, telefone));

            System.out.println("Deseja adicionar um novo contato? (S/N) ");
            saida = scanner.nextLine();
        }

        System.out.println("\nContatos cadastrados:");
        for (Contato c : contatos) {
            System.out.println(c);
        }

        System.out.print("\nDigite o nome do contato que deseja buscar: ");
        String nomeBusca = scanner.nextLine();
        boolean encontrado = false;

        for (Contato c : contatos) {
            if (c.nome.equalsIgnoreCase(nomeBusca)) {
                System.out.println("Telefone: " + c.telefone);
                System.out.println("Email: " + c.email);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Contato não encontrado.");
        }

        scanner.close();
    }
}
