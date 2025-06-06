import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long num;

        Fatorial fatorial = new Fatorial();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro maior que zero: ");
        num = scanner.nextLong();

        if(num < 0) {
            System.out.print("O número " + num + " é inválido!");
        } else {
            long resultado = fatorial.calcularFatorial(num);
            System.out.print("O resultado de " + num + " fatorial é: " + resultado);
        }

        scanner.close();

    }
}
