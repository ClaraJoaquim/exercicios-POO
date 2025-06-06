import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String palavra;

        VerificadorPalindromo verificadorPalindromo = new VerificadorPalindromo();
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite uma palavra para verificar se ela é um palíndromo: ");
        palavra = scanner.nextLine();

        boolean p = verificadorPalindromo.verificarPalavra(palavra);

        if (p) {
            System.out.print("A palavra " + palavra + " é um palíndromo");
        } else {
            System.out.print("A palavra " + palavra + " não é um palíndromo");
        }

        scanner.close();
    }
}
